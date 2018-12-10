/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.MakeADiffRole;

import Business.CrowdFunding.CFRFundingOrgs;
import Business.CrowdFundingWorkQueue.CFRCaseWorkRequest;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.SocialCrowdFunding.CFRStrategistOrganization;
import Business.Organization.SocialCrowdFunding.TerminalCasesOrganization;
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
    //private Network sel_network;
    private VaccineDetailsDirectory VaccDetailsDir;
    private boolean isvalid = false;
   
    public RequestVaccineJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, Organization organization, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business = business;
        this.VaccDetailsDir = organization.getVaccineDetailsDir();
       // populateVTypeCombo();
        populateComboBox();
        this.isvalid = true;
        msgtxt.setVisible(false);
        jLabel6.setVisible(false);
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
        msgtxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("VACCINE STOCK REQUEST");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 20, 205, 26));

        VaccineTypeCombo.setForeground(new java.awt.Color(255, 102, 102));
        VaccineTypeCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                VaccineTypeComboItemStateChanged(evt);
            }
        });
        VaccineTypeCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VaccineTypeComboActionPerformed(evt);
            }
        });
        add(VaccineTypeCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 104, 184, 29));

        jLabel2.setForeground(new java.awt.Color(255, 102, 102));
        jLabel2.setText("VACCINE TYPE");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 104, 108, 29));

        jLabel3.setForeground(new java.awt.Color(255, 102, 102));
        jLabel3.setText("VACCINE NAME");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 183, 136, 23));

        VNamejComboBox1.setForeground(new java.awt.Color(255, 102, 102));
        VNamejComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VNamejComboBox1ActionPerformed(evt);
            }
        });
        add(VNamejComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 178, 175, 33));

        jLabel4.setForeground(new java.awt.Color(255, 102, 102));
        jLabel4.setText("QUANTITY REQUIRED");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 332, 113, 26));

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
        add(QtyJSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 313, 418, -1));

        selectedQtyjLabel.setBackground(new java.awt.Color(204, 204, 204));
        selectedQtyjLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        selectedQtyjLabel.setForeground(new java.awt.Color(255, 51, 51));
        add(selectedQtyjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 320, 90, 37));

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SEND REQUEST");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 560, 128, 33));

        networkJComboBox.setForeground(new java.awt.Color(255, 102, 102));
        networkJComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                networkJComboBoxItemStateChanged(evt);
            }
        });
        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });
        add(networkJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 104, 175, 29));

        jLabel7.setForeground(new java.awt.Color(255, 102, 102));
        jLabel7.setText("CHOOSE NETWORK");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 104, 118, 29));

        jLabel5.setForeground(new java.awt.Color(255, 102, 102));
        jLabel5.setText("VACCINE STOCK AVAILABLE");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 257, 146, 26));
        add(currstocktxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 255, 173, 31));

        errormsg.setForeground(new java.awt.Color(255, 51, 51));
        add(errormsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 709, 33));

        jButton2.setBackground(new java.awt.Color(255, 102, 102));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 570, -1, -1));
        add(msgtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 409, 520, 33));

        jLabel6.setForeground(new java.awt.Color(255, 102, 102));
        jLabel6.setText("MESSAGE");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 409, 113, 33));
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

       String Network = String.valueOf(networkJComboBox.getSelectedItem());
        String VType = String.valueOf(VaccineTypeCombo.getSelectedItem());
        String VaccName =  String.valueOf(VNamejComboBox1.getSelectedItem());   //categorytxt.getText();
        int Vacc_qty = quantity;

        if (Vacc_qty <= Integer.parseInt(currstocktxt.getText()))
        {
        VaccineWorkRequest request = new VaccineWorkRequest();
        request.setVaccineType(VType);
        request.setVaccineName(VaccName);
        request.setQty(Vacc_qty);
        request.setNetwork(Network);
        request.setSender(userAccount);
        request.setStatus("New Vaccine Request");
        request.setMessage(msgtxt.getText());

        Organization org = null;
      
       Network sel_network  = (Network) networkJComboBox.getSelectedItem();
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
            msgtxt.setVisible(true);
            jLabel6.setVisible(true);
            errormsg.setText("Inventory is low on quantity , please try from different netwrk or enter additional quanityt in message field");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void VNamejComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VNamejComboBox1ActionPerformed

        if (isvalid) {
              Organization org = null;
     
          Network  sel_network  = (Network) networkJComboBox.getSelectedItem();
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
                   for (VaccineInventory vaccine : org.getVaccineInvDir().getVaccineStockList())
                   {    if(vaccine.getVaccineName().equalsIgnoreCase(String.valueOf(VNamejComboBox1.getSelectedItem()))) 
                   {
                       currstocktxt.setText(String.valueOf(vaccine.getInvStock())); 
                   }}
                       }
       
        }
    }//GEN-LAST:event_VNamejComboBox1ActionPerformed

    private void networkJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBoxActionPerformed
     
        
        
       if (isvalid)
       {
        populateVTypeCombo();
       /*    
        Network sel_network  = (Network) networkJComboBox.getSelectedItem();
         Organization org = null;
     
           // sel_network  = (Network) networkJComboBox.getSelectedItem();
      // for (Network network: business.getNetworkList()){
            for (Enterprise enterprise : sel_network.getEnterpriseDirectory().getEnterpriseList()){
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){

                    if (organization instanceof VaccineOrganization){
                        org = organization;
                        break;
                    }
                }}
        VaccineTypeCombo.removeAllItems();
                if (org!=null){
                    //org.getWorkQueue().getWorkRequestList().add(request);
                   for (VaccineInventory vaccine : org.getVaccineInvDir().getVaccineStockList())
                  // {    if(VaccineTypeCombo.getSelectedItem().equals(vaccine.getVaccineType())) 
                   {
                       
                      VaccineTypeCombo.addItem(vaccine.getVaccineType());
                   }}
         */              
       }
        // TODO add your handling code here:
    }//GEN-LAST:event_networkJComboBoxActionPerformed

    private void VaccineTypeComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VaccineTypeComboActionPerformed
              
         
        if(isvalid)
        {
            VNamejComboBox1.removeAllItems();
         Organization org = null;
     
           Network sel_network  = (Network) networkJComboBox.getSelectedItem();
       //for (Network network: business.getNetworkList()){
            for (Enterprise enterpris : sel_network.getEnterpriseDirectory().getEnterpriseList()){
                for (Organization organization : enterpris.getOrganizationDirectory().getOrganizationList()){

                    if (organization instanceof VaccineOrganization){
                        org = organization;
                        break;
                    }
                }}
        
                if (org!=null){
                    //org.getWorkQueue().getWorkRequestList().add(request);
                   for (VaccineInventory vaccine : org.getVaccineInvDir().getVaccineStockList())
                   {    if(String.valueOf(VaccineTypeCombo.getSelectedItem()).equals(vaccine.getVaccineType())) 
                   {
                      VNamejComboBox1.addItem(vaccine.getVaccineName());
                   }}
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
        cmwjp.populateVaccineRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void VaccineTypeComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_VaccineTypeComboItemStateChanged
        // TODO add your handling code here:
        
     /*   if(isvalid)
        {
         Organization org = null;
     
           Network sel_network  = (Network) networkJComboBox.getSelectedItem();
       //for (Network network: business.getNetworkList()){
            for (Enterprise enterpris : sel_network.getEnterpriseDirectory().getEnterpriseList()){
                for (Organization organization : enterpris.getOrganizationDirectory().getOrganizationList()){

                    if (organization instanceof VaccineOrganization){
                        org = organization;
                        break;
                    }
                }}
        
                if (org!=null){
                    //org.getWorkQueue().getWorkRequestList().add(request);
                   for (VaccineInventory vaccine : org.getVaccineInvDir().getVaccineStockList())
                   {    if(String.valueOf(VaccineTypeCombo.getSelectedItem()).equals(vaccine.getVaccineType())) 
                   {
                      VNamejComboBox1.addItem(vaccine.getVaccineName());
                   }}
        }               }
       */
        
        
       
    }//GEN-LAST:event_VaccineTypeComboItemStateChanged

    private void networkJComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_networkJComboBoxItemStateChanged
   
       // populateVTypeCombo();
       if (isvalid)
       {
           
        Network sel_network  = (Network) networkJComboBox.getSelectedItem();
         Organization org = null;
     
           // sel_network  = (Network) networkJComboBox.getSelectedItem();
      // for (Network network: business.getNetworkList()){
            for (Enterprise enterprise : sel_network.getEnterpriseDirectory().getEnterpriseList()){
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){

                    if (organization instanceof VaccineOrganization){
                        org = organization;
                        break;
                    }
                }}
        VaccineTypeCombo.removeAllItems();
                if (org!=null){
                    //org.getWorkQueue().getWorkRequestList().add(request);
                   for (VaccineInventory vaccine : org.getVaccineInvDir().getVaccineStockList())
                  // {    if(VaccineTypeCombo.getSelectedItem().equals(vaccine.getVaccineType())) 
                   {
                      VaccineTypeCombo.addItem(vaccine.getVaccineType());
                   }}
                       
       }
             // TODO add your handling code here:
    }//GEN-LAST:event_networkJComboBoxItemStateChanged


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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField msgtxt;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JLabel selectedQtyjLabel;
    // End of variables declaration//GEN-END:variables
}
