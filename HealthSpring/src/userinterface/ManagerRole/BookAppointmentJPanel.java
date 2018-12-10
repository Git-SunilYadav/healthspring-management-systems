/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ManagerRole;

import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Organization.DoctorOrganization;
import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.Appointment;
import Business.WorkQueue.AppointmentSlots;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nikhi
 */
public class BookAppointmentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BookAppointmentJPanel
     */
    
    private JPanel userProcessContainer;
    private DoctorOrganization doctorOrg;
    private HospitalEnterprise enterprise;
    private UserAccount userAccount;
    private String dateFormat = "MM-dd-yyyy";
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
   
    public BookAppointmentJPanel(JPanel userProcessContainer, UserAccount account, DoctorOrganization doctorOrg, HospitalEnterprise enterprise) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.doctorOrg = doctorOrg;
        this.enterprise = enterprise;
        this.userAccount = account;
       // valueLabel.setText(enterprise.getName());
       
        PopulateDoctorCombo();
        PoulatePatientCombo();
    
    }
    
    // Populate list of doctors
    public void PopulateDoctorCombo(){
        drpdnDoctor.removeAllItems();
        for(UserAccount ua : doctorOrg.getUserAccountDirectory().getUserAccountList()){
            drpdnDoctor.addItem(ua);
        }
    }
    
    public void PoulatePatientCombo(){
        drpdnPatient.removeAllItems();
        for (Patient patient : enterprise.getObjPatientDirectory().getpatientList()){
            drpdnPatient.addItem(patient);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        btnBookAppointment = new javax.swing.JButton();
        BookCnfrmlbl2 = new javax.swing.JLabel();
        drpdnDoctor = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        drpdnPatient = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        txtAppointmentDate = new javax.swing.JTextField();
        btnGetAppointments = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Time", "Patient Name", "Booked", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 676, 197));

        btnBookAppointment.setForeground(new java.awt.Color(255, 102, 102));
        btnBookAppointment.setText("BOOK APPOINTMENT");
        btnBookAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookAppointmentActionPerformed(evt);
            }
        });
        add(btnBookAppointment, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 540, -1, -1));

        BookCnfrmlbl2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BookCnfrmlbl2.setForeground(new java.awt.Color(255, 0, 0));
        add(BookCnfrmlbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 654, 247, 23));

        drpdnDoctor.setForeground(new java.awt.Color(255, 102, 102));
        drpdnDoctor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(drpdnDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 98, 246, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("Appointment Booking");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 24, 220, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 102));
        jLabel2.setText("Doctor: ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 96, 113, -1));

        jLabel3.setForeground(new java.awt.Color(255, 102, 102));
        jLabel3.setText("Patient:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, 91, -1));

        drpdnPatient.setForeground(new java.awt.Color(255, 102, 102));
        drpdnPatient.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        drpdnPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drpdnPatientActionPerformed(evt);
            }
        });
        add(drpdnPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, 227, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 102));
        jLabel4.setText("Date:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 143, -1, -1));

        txtAppointmentDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAppointmentDateActionPerformed(evt);
            }
        });
        add(txtAppointmentDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 145, 246, -1));

        btnGetAppointments.setForeground(new java.awt.Color(255, 102, 102));
        btnGetAppointments.setText("Get Appointments");
        btnGetAppointments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetAppointmentsActionPerformed(evt);
            }
        });
        add(btnGetAppointments, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 193, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBookAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookAppointmentActionPerformed
         int selectedRow = workRequestJTable.getSelectedRow();
         
            if(selectedRow < 0 ){
                JOptionPane.showMessageDialog(null, "Please select any slot");
                return;
            }
            else{
             AppointmentSlots objAppointmentSlot = (AppointmentSlots)workRequestJTable.getValueAt(selectedRow,1);
             if(objAppointmentSlot.isIsBooked()){
                 JOptionPane.showMessageDialog(null,"This slot is already booked. Please select any other slot");
             }
             else{
                int confirmation = JOptionPane.showConfirmDialog(null, "Confirm this slot.");
                
                if(confirmation == JOptionPane.YES_OPTION){
                    objAppointmentSlot.setIsBooked(true);
                    objAppointmentSlot.setPatient((Patient)drpdnPatient.getSelectedItem());
                    
                    JOptionPane.showMessageDialog(null, "Congratulations!! Your booking is confirmed.");
                    GetAppointmentDetails();
                }
             }
            }
    }//GEN-LAST:event_btnBookAppointmentActionPerformed

    private void drpdnPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drpdnPatientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drpdnPatientActionPerformed

    private void txtAppointmentDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAppointmentDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAppointmentDateActionPerformed

    private void btnGetAppointmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetAppointmentsActionPerformed
      // get the appointment of all the doctors.
        GetAppointmentDetails();
        
    }//GEN-LAST:event_btnGetAppointmentsActionPerformed
   
    public void GetAppointmentDetails(){
    try {
            boolean isAppointmentPresent = false;
            UserAccount ur = (UserAccount)drpdnDoctor.getSelectedItem();
            Date appointmentDate = new SimpleDateFormat(dateFormat).parse(txtAppointmentDate.getText()); 
            
            for(Appointment appointment : ur.getAppointmentList()){
                if(appointment.getAppointmentDate().compareTo(appointmentDate) == 0){
                    PopulateAppointmentDetails(appointment);
                    isAppointmentPresent = true;
                }
                break;
            }
            
            // if appointment is not present for that date then create appointment schedule for that date.
            if(!isAppointmentPresent){
                Appointment ap = new Appointment();
                ap.createSlots();
                ap.setAppointmentDate(appointmentDate);
                ur.getAppointmentList().add(ap);
                PopulateAppointmentDetails(ap);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please enter proper date" );
        }
    }
     
    public void PopulateAppointmentDetails(Appointment appointment){
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        model.setRowCount(0);
        for(AppointmentSlots appointmentSlots : appointment.getAppointmentSlots()){
             
            Object[] row = new Object[5];
            row[0] = appointment.getAppointmentDate();
            row[1] = appointmentSlots;
            row[2] = appointmentSlots.getPatient();
            row[3] = appointmentSlots.isIsBooked() ? "Booked" : "";
            row[4] = appointmentSlots.isIsComplete() ? "Done" : "Waiting";
            model.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BookCnfrmlbl2;
    private javax.swing.JButton btnBookAppointment;
    private javax.swing.JButton btnGetAppointments;
    private javax.swing.JComboBox drpdnDoctor;
    private javax.swing.JComboBox drpdnPatient;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAppointmentDate;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
