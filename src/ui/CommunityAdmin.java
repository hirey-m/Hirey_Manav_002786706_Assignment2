/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import model.Person;

/**
 *
 * @author manavhirey
 */
public class CommunityAdmin extends javax.swing.JFrame {

    /**
     * Creates new form CommunityAdmin
     */
    private static Person loggedPerson;
    public static CommunityAdmin communityAdmin;
    public CommunityAdmin(Person loggedInPerson) {
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
        cityBtn = new javax.swing.JButton();
        communityBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        rightPane = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cityBtn.setText("Manage City");
        cityBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityBtnActionPerformed(evt);
            }
        });

        communityBtn.setText("Mange Community");
        communityBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                communityBtnActionPerformed(evt);
            }
        });

        logoutBtn.setText("Logout");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leftPaneLayout = new javax.swing.GroupLayout(leftPane);
        leftPane.setLayout(leftPaneLayout);
        leftPaneLayout.setHorizontalGroup(
            leftPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(communityBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(cityBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logoutBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        leftPaneLayout.setVerticalGroup(
            leftPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPaneLayout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(cityBtn)
                .addGap(18, 18, 18)
                .addComponent(communityBtn)
                .addGap(136, 136, 136)
                .addComponent(logoutBtn)
                .addContainerGap(359, Short.MAX_VALUE))
        );

        splitPane.setLeftComponent(leftPane);

        javax.swing.GroupLayout rightPaneLayout = new javax.swing.GroupLayout(rightPane);
        rightPane.setLayout(rightPaneLayout);
        rightPaneLayout.setHorizontalGroup(
            rightPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 844, Short.MAX_VALUE)
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

    private void communityBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_communityBtnActionPerformed
        // TODO add your handling code here:
        ManageCommunity com = new ManageCommunity(loggedPerson);
        splitPane.setRightComponent(com);
    }//GEN-LAST:event_communityBtnActionPerformed

    private void cityBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityBtnActionPerformed
        // TODO add your handling code here:
        ManageCity city = new ManageCity(loggedPerson);
        splitPane.setRightComponent(city);
    }//GEN-LAST:event_cityBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        LoginFrame.loginFrame.setVisible(true);
        communityAdmin.setVisible(false);
        loggedPerson = null;
    }//GEN-LAST:event_logoutBtnActionPerformed

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
            java.util.logging.Logger.getLogger(CommunityAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CommunityAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CommunityAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CommunityAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                communityAdmin = new CommunityAdmin(null);
                communityAdmin.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cityBtn;
    private javax.swing.JButton communityBtn;
    private javax.swing.JPanel leftPane;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JPanel rightPane;
    private javax.swing.JSplitPane splitPane;
    // End of variables declaration//GEN-END:variables
}
