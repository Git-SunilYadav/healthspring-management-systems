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
import Business.UserAccount.UserAccount;
import Business.Utility.Utilities;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.CaseManagerRole.CaseManagerWorkAreaJPanel;

/**
 *
 * @author nikhi
 */
public class RequestCFRFundingJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RequestCFRFundingJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem business;
    private Utilities utils;
    
    public RequestCFRFundingJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business = business;
        this.utils = new Utilities();
        populateCategoryCombo();
            }

    private void populateCategoryCombo(){
        CategoryJComboBox1.removeAllItems();
        CategoryJComboBox1.addItem("Generic");
        CategoryJComboBox1.addItem("Terminal Cases");
        CategoryJComboBox1.addItem("Rare Diseases");
        CategoryJComboBox1.addItem("Research & Development");
        CategoryJComboBox1.addItem("Child Care Funds");
        CategoryJComboBox1.addItem("Organ Transplant");
        CategoryJComboBox1.addItem("Cancer");
        CategoryJComboBox1.addItem("Mental Health");
        CategoryJComboBox1.addItem("AIDS");
        CategoryJComboBox1.addItem("Major Surgeries");
        CategoryJComboBox1.addItem("Women Oriented Funds");
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        patienttxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        categorytxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        costtxt = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        CategoryJComboBox1 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("PATIENT NAME");

        jLabel2.setForeground(new java.awt.Color(255, 102, 102));
        jLabel2.setText("PROBLEM CATEGORY");

        jLabel3.setForeground(new java.awt.Color(255, 102, 102));
        jLabel3.setText("COST OF TREATMENT");

        jButton2.setBackground(new java.awt.Color(255, 102, 102));
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        CategoryJComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CategoryJComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoryJComboBox1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 102));
        jLabel4.setText("CREATE FUNDING REQUEST");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(patienttxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(costtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(categorytxt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CategoryJComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jButton2)
                        .addGap(219, 219, 219)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(151, 151, 151))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(CategoryJComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(categorytxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(patienttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel2)))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(costtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jButton1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addGap(63, 63, 63))))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

       // String message = messageJTextField.getText();
        String patient = patienttxt.getText();
        if(patient.trim().equals("")){
            JOptionPane.showMessageDialog(null, "Patient name should not be blank");
            return;
        }
        
        String catebgory =  String.valueOf(CategoryJComboBox1.getSelectedItem());   //categorytxt.getText();
        int cost = 0;
        if(!utils.tryParseInt(costtxt.getText())){
            JOptionPane.showMessageDialog(null, "Please enter proper cost value");
            return;
             
        }
        else{
            cost= Integer.parseInt(costtxt.getText());
        }
        
        CFRCaseWorkRequest request = new CFRCaseWorkRequest();
        request.setPatient(patient);
        request.setCategory(catebgory);
        request.setCost(cost);
        
        request.setSender(userAccount);
        request.setStatus("Request Sent");

        Organization org = null;
        /*for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof TerminalCasesOrganization){
                org = organization;
                break;
            }
        }*/
        for (Network network: business.getNetworkList()){
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){

                    if (organization instanceof TerminalCasesOrganization){
                        org = organization;
                        break;
                    }
                }}}
                if (org!=null){
                    //org.getWorkQueue().getWorkRequestList().add(request);
                    org.getWorkQueue().getCFRCaseWorkRequestList().add(request);
                   // userAccount.getWorkQueue().getWorkRequestList().add(request);
                     userAccount.getWorkQueue().getCFRCaseWorkRequestList().add(request);
                     JOptionPane.showMessageDialog(null, "Request has been created successfully !!");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Terminal case organization does not exist !!");
                }

    }//GEN-LAST:event_jButton1ActionPerformed

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

    private void CategoryJComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoryJComboBox1ActionPerformed

      categorytxt.setText(String.valueOf(CategoryJComboBox1.getSelectedItem()));
    }//GEN-LAST:event_CategoryJComboBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox CategoryJComboBox1;
    private javax.swing.JTextField categorytxt;
    private javax.swing.JTextField costtxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField patienttxt;
    // End of variables declaration//GEN-END:variables
}
