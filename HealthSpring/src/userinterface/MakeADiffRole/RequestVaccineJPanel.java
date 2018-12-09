/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.MakeADiffRole;

import Business.CrowdFundingWorkQueue.CFRCaseWorkRequest;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.SocialCrowdFunding.TerminalCasesOrganization;
import Business.Organization.VaccinationCentre.VaccineInventoryOrganization;
import Business.Organization.VaccinationCentre.VaccineOrganization;
import Business.UserAccount.UserAccount;
import Business.Vaccine.VaccineDetails;
import Business.Vaccine.VaccineDetailsDirectory;
import Business.Vaccine.VaccineInventory;
import Business.VaccineWorkQueue.VaccineWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author nikhi
 */
public class RequestVaccineJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RequestVaccineJPanel
     */
     private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem business;
    private int quantity;
    private Network sel_network;
    private VaccineDetailsDirectory VaccDetailsDir;
   
    public RequestVaccineJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, Organization organization, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business = business;
        this.VaccDetailsDir = organization.getVaccineDetailsDir();
        populateVTypeCombo();
        populateComboBox();
            }
    // VaccineTypeCombo

    private void populateVTypeCombo(){
        
        VaccineTypeCombo.removeAllItems();
        VaccineTypeCombo.addItem("Live-attenuated");
        VaccineTypeCombo.addItem("Inactivated");
        VaccineTypeCombo.addItem("Subunit");
        VaccineTypeCombo.addItem("Toxoid");
        VaccineTypeCombo.addItem("recombinant");
        VaccineTypeCombo.addItem("conjugate");
        
        
        }@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        VaccineTypeCombo = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        VNamejComboBox1 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        QtyJSlider1 = new javax.swing.JSlider();
        selectedQtyjLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        networkJComboBox = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        currstocktxt = new javax.swing.JTextField();
        errormsg = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("VACCINE STOCK REQUEST");

        VaccineTypeCombo.setForeground(new java.awt.Color(255, 102, 102));
        VaccineTypeCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        VaccineTypeCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VaccineTypeComboActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 102, 102));
        jLabel2.setText("VACCINE TYPE");

        jLabel3.setForeground(new java.awt.Color(255, 102, 102));
        jLabel3.setText("VACCINE NAME");

        VNamejComboBox1.setForeground(new java.awt.Color(255, 102, 102));
        VNamejComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        VNamejComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VNamejComboBox1ActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 102, 102));
        jLabel4.setText("QUANTITY REQUIRED");

        QtyJSlider1.setBackground(new java.awt.Color(204, 204, 255));
        QtyJSlider1.setForeground(new java.awt.Color(0, 0, 51));
        QtyJSlider1.setMajorTickSpacing(50);
        QtyJSlider1.setMaximum(500);
        QtyJSlider1.setMinorTickSpacing(10);
        QtyJSlider1.setPaintLabels(true);
        QtyJSlider1.setPaintTicks(true);
        QtyJSlider1.setSnapToTicks(true);
        QtyJSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                QtyJSlider1StateChanged(evt);
            }
        });

        selectedQtyjLabel.setBackground(new java.awt.Color(204, 204, 204));
        selectedQtyjLabel.setForeground(new java.awt.Color(255, 51, 51));

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SEND REQUEST");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        networkJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });

        jLabel7.setText("CHOOSE NETWORK");

        jLabel5.setText("VACCINE STOCK AVAILABLE");

        jButton2.setBackground(new java.awt.Color(255, 102, 102));
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(QtyJSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(VaccineTypeCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(VNamejComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(networkJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(selectedQtyjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(currstocktxt, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(errormsg, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jButton2)))
                .addGap(41, 41, 41)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(505, 505, 505)
                        .addComponent(errormsg, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(networkJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(VaccineTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                                .addComponent(VNamejComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(currstocktxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(QtyJSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(selectedQtyjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void QtyJSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_QtyJSlider1StateChanged
      selectedQtyjLabel.setText(Integer.toString(QtyJSlider1.getValue()));
         quantity = QtyJSlider1.getValue();
   
        // TODO add your handling code here:
    }//GEN-LAST:event_QtyJSlider1StateChanged

     private void populateComboBox() {
        networkJComboBox.removeAllItems();
      //  enterpriseTypeJComboBox.removeAllItems();

        for (Network network : business.getNetworkList()) {
            networkJComboBox.addItem(network);
        }
     }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
        String VType = String.valueOf(VaccineTypeCombo.getSelectedItem());
        String VaccName =  String.valueOf(VNamejComboBox1.getSelectedItem());   //categorytxt.getText();
        int Vacc_qty = quantity;

        if (Vacc_qty == Integer.parseInt(currstocktxt.getText()))
        {
        VaccineWorkRequest request = new VaccineWorkRequest();
        request.setVaccineType(VType);
        request.setVaccineName(VaccName);
        request.setQty(Vacc_qty);
        request.setSender(userAccount);
        request.setStatus("Vaccine Request Sent");

        Organization org = null;
      
       sel_network  = (Network)networkJComboBox.getSelectedItem();
        //for (Network network: business.getNetworkList()){
            for (Enterprise enterprise : sel_network.getEnterpriseDirectory().getEnterpriseList()){
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){

                    if (organization instanceof VaccineOrganization){
                        org = organization;
                        break;
                    }
                }}
        
                if (org!=null){
                    //org.getWorkQueue().getWorkRequestList().add(request);
                    org.getWorkQueue().getVaccineWorkRequestList().add(request);
                   // userAccount.getWorkQueue().getWorkRequestList().add(request);
                     userAccount.getWorkQueue().getVaccineWorkRequestList().add(request);
                }
        }
        else 
        {
        //dialog box 
            errormsg.setText("not enough quanity , try different netwrk");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void VNamejComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VNamejComboBox1ActionPerformed

              Organization org = null;
     
            sel_network  = (Network)networkJComboBox.getSelectedItem();
        //for (Network network: business.getNetworkList()){
            for (Enterprise enterprise : sel_network.getEnterpriseDirectory().getEnterpriseList()){
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){

                    if (organization instanceof VaccineInventoryOrganization){
                        org = organization;
                        break;
                    }
                }}
        
                if (org!=null){
                    //org.getWorkQueue().getWorkRequestList().add(request);
                   for (VaccineInventory vaccine : org.getVaccineInvDir().getVaccineStockList())
                   {    if(vaccine.getVaccineName().equalsIgnoreCase(String.valueOf(VNamejComboBox1.getSelectedItem()))) 
                   {
                       currstocktxt.setText(String.valueOf(vaccine.getInvStock())); 
                   }}
                       }
       
        
    }//GEN-LAST:event_VNamejComboBox1ActionPerformed

    private void networkJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_networkJComboBoxActionPerformed

    private void VaccineTypeComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VaccineTypeComboActionPerformed

        for (VaccineDetails vaccine : VaccDetailsDir.getVaccinerequestList())
        {
            if (VaccineTypeCombo.getSelectedItem().equals(vaccine.getVaccineType()))
            {
        VNamejComboBox1.addItem(vaccine);
        }
        }
        
// TODO add your handling code here:
    }//GEN-LAST:event_VaccineTypeComboActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        MakeADiffWorkAreaJPanel cmwjp = (MakeADiffWorkAreaJPanel) component;
        cmwjp.populateRequestTable();
        //cmwjp.populateRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider QtyJSlider1;
    private javax.swing.JComboBox VNamejComboBox1;
    private javax.swing.JComboBox VaccineTypeCombo;
    private javax.swing.JTextField currstocktxt;
    private javax.swing.JLabel errormsg;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JLabel selectedQtyjLabel;
    // End of variables declaration//GEN-END:variables
}
