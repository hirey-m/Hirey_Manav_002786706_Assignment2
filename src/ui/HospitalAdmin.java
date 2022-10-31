/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import javax.swing.JFrame;
import model.Person;

/**
 *
 * @author manavhirey
 */
public class HospitalAdmin extends javax.swing.JFrame {

    /**
     * Creates new form HospitalAdmin
     */
    public static JFrame hospitalAdmin;
    private Person loggedPerson;
    
    public HospitalAdmin(Person loggedInPerson) {
        initComponents();
        this.loggedPerson = loggedInPerson;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        leftPane = new javax.swing.JPanel();
        historyBtn = new javax.swing.JButton();
        appBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        doctorDir = new javax.swing.JButton();
        patientDir = new javax.swing.JButton();
        historyBtn1 = new javax.swing.JButton();
        rightPane = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        historyBtn.setText("Encounter History");
        historyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyBtnActionPerformed(evt);
            }
        });

        appBtn.setText("Book Appointment");
        appBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appBtnActionPerformed(evt);
            }
        });

        logoutBtn.setText("Logout");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        doctorDir.setText("Doctor Directory");
        doctorDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorDirActionPerformed(evt);
            }
        });

        patientDir.setText("Patient Directory");
        patientDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientDirActionPerformed(evt);
            }
        });

        historyBtn1.setText("Hospital Directory");
        historyBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leftPaneLayout = new javax.swing.GroupLayout(leftPane);
        leftPane.setLayout(leftPaneLayout);
        leftPaneLayout.setHorizontalGroup(
            leftPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logoutBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(appBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(historyBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(doctorDir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(patientDir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(historyBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        leftPaneLayout.setVerticalGroup(
            leftPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPaneLayout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(patientDir)
                .addGap(18, 18, 18)
                .addComponent(doctorDir)
                .addGap(18, 18, 18)
                .addComponent(historyBtn1)
                .addGap(18, 18, 18)
                .addComponent(historyBtn)
                .addGap(18, 18, 18)
                .addComponent(appBtn)
                .addGap(18, 18, 18)
                .addComponent(logoutBtn)
                .addContainerGap(333, Short.MAX_VALUE))
        );

        splitPane.setLeftComponent(leftPane);

        javax.swing.GroupLayout rightPaneLayout = new javax.swing.GroupLayout(rightPane);
        rightPane.setLayout(rightPaneLayout);
        rightPaneLayout.setHorizontalGroup(
            rightPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 833, Short.MAX_VALUE)
        );
        rightPaneLayout.setVerticalGroup(
            rightPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 788, Short.MAX_VALUE)
        );

        splitPane.setRightComponent(rightPane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(splitPane)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(splitPane)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void historyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyBtnActionPerformed
        // TODO add your handling code here:
        EncounterHistory eHistory = new EncounterHistory(loggedPerson);
        splitPane.setRightComponent(eHistory);
    }//GEN-LAST:event_historyBtnActionPerformed

    private void appBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appBtnActionPerformed
        // TODO add your handling code here:
        BookAppointment appointment = new BookAppointment(loggedPerson);
        splitPane.setRightComponent(appointment);
    }//GEN-LAST:event_appBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        LoginFrame.loginFrame.setVisible(true);
        hospitalAdmin.setVisible(false);
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void doctorDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorDirActionPerformed
        // TODO add your handling code here:
        DoctorView dView = new DoctorView(loggedPerson);
        splitPane.setRightComponent(dView);
    }//GEN-LAST:event_doctorDirActionPerformed

    private void patientDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientDirActionPerformed
        // TODO add your handling code here:
        PatientView view = new PatientView(loggedPerson);
        splitPane.setRightComponent(view);
    }//GEN-LAST:event_patientDirActionPerformed

    private void historyBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyBtn1ActionPerformed
        // TODO add your handling code here:
        HospitalDirectory dir = new HospitalDirectory(loggedPerson);
        splitPane.setRightComponent(dir);
    }//GEN-LAST:event_historyBtn1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HospitalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HospitalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HospitalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HospitalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                hospitalAdmin = new HospitalAdmin(null);
                hospitalAdmin.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton appBtn;
    private javax.swing.JButton doctorDir;
    private javax.swing.JButton historyBtn;
    private javax.swing.JButton historyBtn1;
    private javax.swing.JPanel leftPane;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton patientDir;
    private javax.swing.JPanel rightPane;
    private javax.swing.JSplitPane splitPane;
    // End of variables declaration//GEN-END:variables
}
