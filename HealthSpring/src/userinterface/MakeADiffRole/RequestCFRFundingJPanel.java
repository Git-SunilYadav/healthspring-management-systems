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
import java.awt.CardLayout;
import java.awt.Component;
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
    
    public RequestCFRFundingJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business = business;
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

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 100, -1));

        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("PATIENT");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 61, 68, 23));
        add(patienttxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 99, -1));

        jLabel2.setForeground(new java.awt.Color(255, 102, 102));
        jLabel2.setText("CATEGORY");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 65, 90, -1));
        add(categorytxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(481, 62, 115, -1));

        jLabel3.setForeground(new java.awt.Color(255, 102, 102));
        jLabel3.setText("COST OF TREATMENT");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 124, 120, 22));
        add(costtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 100, -1));

        jButton2.setBackground(new java.awt.Color(255, 102, 102));
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

       // String message = messageJTextField.getText();
        String patient = patienttxt.getText();
        String catebgory = categorytxt.getText();
        int cost = Integer.parseInt(costtxt.getText());

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField categorytxt;
    private javax.swing.JTextField costtxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField patienttxt;
    // End of variables declaration//GEN-END:variables
}
