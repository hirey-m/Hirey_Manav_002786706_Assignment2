/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Doctor;
import model.Encounter;
import model.Person;
import model.SystemAdmin;
import model.VitalSigns;

/**
 *
 * @author manavhirey
 */
public class BookAppointment extends javax.swing.JPanel {

    /**
     * Creates new form BookAppointment
     */
    private Doctor docPicked;
    private Person loggedPerson;
    public BookAppointment(Person loggedInPerson) {
        initComponents();
        populateTable();
        this.loggedPerson = loggedInPerson;
        patNameTxt.setText(loggedPerson.getName());
        if (loggedInPerson.getRole() == SystemAdmin.UserRole.PATIENT){
            patNameTxt.setEditable(false);
            docNameTxt.setEditable(false);
        }
        if (loggedInPerson.getRole() == SystemAdmin.UserRole.DOCTOR){
            docNameTxt.setEditable(false);
        }
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginLabel1 = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        appTbl = new javax.swing.JTable();
        timeTxt = new javax.swing.JTextField();
        dateTxt = new javax.swing.JTextField();
        loginLabel2 = new javax.swing.JLabel();
        loginLabel3 = new javax.swing.JLabel();
        bookBtn = new javax.swing.JButton();
        patNameTxt = new javax.swing.JTextField();
        loginLabel4 = new javax.swing.JLabel();
        SelectBtn = new javax.swing.JButton();
        loginLabel5 = new javax.swing.JLabel();
        docNameTxt = new javax.swing.JTextField();

        loginLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        loginLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginLabel1.setText("Appointment Scheduling");

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Search Hospital:");

        appTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Specialization", "Hospital Name", "Email", "Gender"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        appTbl.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(appTbl);

        loginLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        loginLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        loginLabel2.setText("Date:");

        loginLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        loginLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        loginLabel3.setText("Time:");

        bookBtn.setText("Book Appointment");
        bookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookBtnActionPerformed(evt);
            }
        });

        loginLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        loginLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        loginLabel4.setText("Patient Name:");

        SelectBtn.setText("Select");
        SelectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectBtnActionPerformed(evt);
            }
        });

        loginLabel5.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        loginLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        loginLabel5.setText("Doctor Name:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(searchBtn))
                            .addComponent(loginLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(loginLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(loginLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                            .addComponent(loginLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(loginLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dateTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                            .addComponent(timeTxt)
                            .addComponent(patNameTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(docNameTxt))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bookBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(274, 274, 274))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(SelectBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(loginLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SelectBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginLabel4)
                    .addComponent(patNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginLabel5)
                    .addComponent(docNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginLabel2)
                    .addComponent(dateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginLabel3)
                    .addComponent(timeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(bookBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(162, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SelectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectBtnActionPerformed
        // TODO add your handling code here:
        int selected = appTbl.getSelectedRow();
        
        if (selected < 0){
            JOptionPane.showMessageDialog(this, "Please select a row");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) appTbl.getModel();
        Doctor selectedDoc = SystemAdmin.docDir.getDoctorList().get(selected);
        docPicked = selectedDoc;
        
        docNameTxt.setText(String.valueOf(selectedDoc.getName()));
    }//GEN-LAST:event_SelectBtnActionPerformed

    private void bookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookBtnActionPerformed
        // TODO add your handling code here:
        Random rand = new Random();
        String appId = String.valueOf(rand.nextInt(100000));
        String date = dateTxt.getText();
        String time = timeTxt.getText();
        
        Encounter bookenc = new Encounter(appId, new VitalSigns(0,0,0,"",""), date, time, loggedPerson, docPicked);
        SystemAdmin.encHistRef.getPastList().add(bookenc);
        
        docNameTxt.setText("");
        patNameTxt.setText("");
        dateTxt.setText("");
        timeTxt.setText("");
        
        JOptionPane.showMessageDialog(this,"New Patient Added.");

    }//GEN-LAST:event_bookBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        if(searchField == null){
            JOptionPane.showMessageDialog(this, "Enter Keywords to search.");
        }else{
            String search = searchField.getText();
            populateBySearch(search);
        }
        
    }//GEN-LAST:event_searchBtnActionPerformed

    private void populateTable(){
         DefaultTableModel model = (DefaultTableModel) appTbl.getModel();
        model.setRowCount(0);
        
        for(Doctor p: SystemAdmin.docDir.getDoctorList()){
            
            Object[] row = new Object[5];
            row[0] = p.getName();
            //row[0] = ne.getEmployeeId();
            row[1] = p.getSpecialization();
            row[2] = p.getNameHospital();
            row[3] = p.getEmail();
            row[4] = p.getGender();

            model.addRow(row);
        }
    }

    private void populateBySearch(String search){
        DefaultTableModel model = (DefaultTableModel) appTbl.getModel();
        model.setRowCount(0);
        
        for(Doctor doc: SystemAdmin.docDir.getDoctorList()){
            if(search.equals(doc.getNameHospital())){
                Object[] row = new Object[5];
                row[0] = doc.getName();
                //row[0] = ne.getEmployeeId();
                row[1] = doc.getSpecialization();
                row[2] = doc.getNameHospital();
                row[3] = doc.getEmail();
                row[4] = doc.getGender();

            model.addRow(row);
            }
            
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SelectBtn;
    private javax.swing.JTable appTbl;
    private javax.swing.JButton bookBtn;
    private javax.swing.JTextField dateTxt;
    private javax.swing.JTextField docNameTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel loginLabel1;
    private javax.swing.JLabel loginLabel2;
    private javax.swing.JLabel loginLabel3;
    private javax.swing.JLabel loginLabel4;
    private javax.swing.JLabel loginLabel5;
    private javax.swing.JTextField patNameTxt;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchField;
    private javax.swing.JTextField timeTxt;
    // End of variables declaration//GEN-END:variables
}
