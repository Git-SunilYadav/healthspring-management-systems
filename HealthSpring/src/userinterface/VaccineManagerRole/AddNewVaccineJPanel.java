/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.VaccineManagerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.VaccinationCentre.VaccineOrganization;
import Business.UserAccount.UserAccount;
import Business.Vaccine.VaccineDetailsDirectory;
import Business.Vaccine.VaccineInventoryDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author nikhi
 */
public class AddNewVaccineJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Organization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private VaccineDetailsDirectory VaccDetailsDir;
    private VaccineInventoryDirectory VacInvDir;
    private Boolean b;
  
    public AddNewVaccineJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;  // (VaccineOrganization)
         this.enterprise = enterprise;
        this.userAccount = account;
        this.VaccDetailsDir = organization.getVaccineDetailsDir();
        this.VacInvDir = organization.getVaccineInvDir();
           //   initComponents();
        populateVTypeCombo();
        this.b=true;
    }

private void populateVTypeCombo(){
        
        VaccineTypeCombo.removeAllItems();
        VaccineTypeCombo.addItem("Live-attenuated");
        VaccineTypeCombo.addItem("Inactivated");
        VaccineTypeCombo.addItem("Subunit");
        VaccineTypeCombo.addItem("Toxoid");
        VaccineTypeCombo.addItem("recombinant");
        VaccineTypeCombo.addItem("conjugate");
        
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        VaccineTypeCombo = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        Vnametxt = new javax.swing.JTextField();
        addVaccbtn = new javax.swing.JButton();
        thresholdtxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 102, 102));

        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("VACCINE TYPE");

        VaccineTypeCombo.setForeground(new java.awt.Color(255, 102, 102));
        VaccineTypeCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setForeground(new java.awt.Color(255, 102, 102));
        jLabel2.setText("VACCINE NAME");

        addVaccbtn.setForeground(new java.awt.Color(255, 102, 102));
        addVaccbtn.setText("ADD");
        addVaccbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVaccbtnActionPerformed(evt);
            }
        });
        
	jLabel3.setForeground(new java.awt.Color(255, 102, 102));
        thresholdtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                thresholdtxtKeyReleased(evt);
            }
        });

        jLabel3.setText("THRESHOLD QTY");

        jButton2.setBackground(new java.awt.Color(255, 102, 102));
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 102));
        jLabel4.setText("ADD NEW VACCINE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jButton2)
                        .addGap(196, 196, 196)
                        .addComponent(addVaccbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(thresholdtxt)
                            .addComponent(VaccineTypeCombo, 0, 244, Short.MAX_VALUE)
                            .addComponent(Vnametxt)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(245, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VaccineTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Vnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(thresholdtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addVaccbtn)
                    .addComponent(jButton2))
                .addGap(119, 119, 119))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addVaccbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addVaccbtnActionPerformed
 b=true;
 jLabel5.setText("");
 jLabel4.setText("");
        
    try{}
    catch(NumberFormatException e){
    jLabel5.setText("Enter a number");b=false;}
        if(Vnametxt.getText().trim().isEmpty()){
       jLabel4.setText("  field is empty");
        b=false;}
         if(thresholdtxt.getText().trim().isEmpty()){
       jLabel4.setText("  field is empty");
        b=false;}
        
  if(b){      
        String VType = String.valueOf(VaccineTypeCombo.getSelectedItem());
 String Vname = Vnametxt.getText();
 int TQty = Integer.parseInt(thresholdtxt.getText());
 int qty = 0;
VaccDetailsDir.CreateVaccineSpec(Vname, VType , TQty, qty);
VacInvDir.CreatevaccineStock(Vname, VType, TQty, qty);

  }

    }//GEN-LAST:event_addVaccbtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        VaccineManagementJPanel cmwjp = (VaccineManagementJPanel) component;
        cmwjp.populateRequestTable();
        //cmwjp.populateRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void thresholdtxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_thresholdtxtKeyReleased
jLabel5.setText("");
        try{}
catch(NumberFormatException e){
jLabel5.setText("Enter a number");b=false;}// TODO add your handling code here:
    }//GEN-LAST:event_thresholdtxtKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox VaccineTypeCombo;
    private javax.swing.JTextField Vnametxt;
    private javax.swing.JButton addVaccbtn;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField thresholdtxt;
    // End of variables declaration//GEN-END:variables
}
