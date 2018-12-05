/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.FinanceFellowRole;

import Business.CrowdFundingWorkQueue.CFRFinanceFellowWorkRequest;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.SocialCrowdFunding.FinanceFellowOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nikhi
 */
public class FinanceFellowWorkAreaJPanel extends javax.swing.JPanel {

   //JPanel userProcessContainer;
    //Enterprise enterprise;
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private FinanceFellowOrganization FinanceFellowOrganization;
   
    
    public FinanceFellowWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
       // this.enterprise = enterprise;
        // this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.FinanceFellowOrganization = (FinanceFellowOrganization)organization;
        
        populateTable();
   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        CFRFinanceWorkQueueJTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        sendReqJBtn = new javax.swing.JButton();
        addfundsbtn = new javax.swing.JButton();
        assignJButton = new javax.swing.JButton();
        pcCheckBox1 = new javax.swing.JCheckBox();
        afcheckbox2 = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(255, 255, 255));

        CFRFinanceWorkQueueJTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "CASE ID", "PATIENT", "CATEGORY", "AMOUNT REQD", "REQUESTED BY", "RECEIVER", "STATUS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(CFRFinanceWorkQueueJTable1);

        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("WORK QUEUE (CASES PENDING FUNDING)");

        sendReqJBtn.setBackground(new java.awt.Color(255, 102, 102));
        sendReqJBtn.setForeground(new java.awt.Color(255, 255, 255));
        sendReqJBtn.setText("SEND REQUEST FOR FUNDING");
        sendReqJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendReqJBtnActionPerformed(evt);
            }
        });

        addfundsbtn.setBackground(new java.awt.Color(255, 102, 102));
        addfundsbtn.setForeground(new java.awt.Color(255, 255, 255));
        addfundsbtn.setText("ADD FUNDS RECEIVED");
        addfundsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addfundsbtnActionPerformed(evt);
            }
        });

        assignJButton.setBackground(new java.awt.Color(255, 102, 102));
        assignJButton.setForeground(new java.awt.Color(255, 255, 255));
        assignJButton.setText("ASSIGN TO ME");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });

        pcCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        pcCheckBox1.setForeground(new java.awt.Color(255, 102, 102));
        pcCheckBox1.setText("PENDING CASES");
        pcCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pcCheckBox1ActionPerformed(evt);
            }
        });

        afcheckbox2.setBackground(new java.awt.Color(255, 255, 255));
        afcheckbox2.setForeground(new java.awt.Color(255, 102, 102));
        afcheckbox2.setText("AWAITING FUNDING");
        afcheckbox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                afcheckbox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pcCheckBox1)
                                .addGap(18, 18, 18)
                                .addComponent(afcheckbox2))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 795, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(74, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(assignJButton)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addfundsbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sendReqJBtn, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(94, 94, 94))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pcCheckBox1)
                    .addComponent(afcheckbox2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sendReqJBtn)
                    .addComponent(assignJButton))
                .addGap(18, 18, 18)
                .addComponent(addfundsbtn)
                .addContainerGap(198, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void sendReqJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendReqJBtnActionPerformed
   int selectedRow = CFRFinanceWorkQueueJTable1.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        CFRFinanceFellowWorkRequest request = (CFRFinanceFellowWorkRequest)CFRFinanceWorkQueueJTable1.getValueAt(selectedRow, 0);
        
        // code for selecting the Funding Orgs
        
        SelectFundingOrgsJPanel SelectFundingOrgsJPanel = new SelectFundingOrgsJPanel( userProcessContainer,  userAccount,  FinanceFellowOrganization, business, request);
        userProcessContainer.add("SelectFundingOrgsJPanel", SelectFundingOrgsJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

        
       // request.setReceiver(userAccount);
        //request.setStatus("Email Sent for Funds");
        //populateTable();
    
        // Code for Email 
        
    }//GEN-LAST:event_sendReqJBtnActionPerformed

    private void addfundsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addfundsbtnActionPerformed

           int selectedRow = CFRFinanceWorkQueueJTable1.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        CFRFinanceFellowWorkRequest request = (CFRFinanceFellowWorkRequest)CFRFinanceWorkQueueJTable1.getValueAt(selectedRow, 0);
        request.setStatus("Funding Locked");

        AddFundsReceivedJPanel AddFundsReceivedJPanel = new AddFundsReceivedJPanel(userProcessContainer,  userAccount,  FinanceFellowOrganization, business, request);
        userProcessContainer.add("AddFundsReceivedJPanel", AddFundsReceivedJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_addfundsbtnActionPerformed

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = CFRFinanceWorkQueueJTable1.getSelectedRow();

        if (selectedRow < 0){
            return;
        }

        CFRFinanceFellowWorkRequest request = (CFRFinanceFellowWorkRequest)CFRFinanceWorkQueueJTable1.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        request.setStatus("Finance Case Assigned");
        populateTable();
    }//GEN-LAST:event_assignJButtonActionPerformed

    private void pcCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcCheckBox1ActionPerformed

       populateTable();
        
        
    }//GEN-LAST:event_pcCheckBox1ActionPerformed

    private void afcheckbox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_afcheckbox2ActionPerformed
populateTable();
    }//GEN-LAST:event_afcheckbox2ActionPerformed
 public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)CFRFinanceWorkQueueJTable1.getModel();
        
        model.setRowCount(0);
        
           Object[] row = new Object[7];
        if (pcCheckBox1.isSelected() == true){
            
        for(CFRFinanceFellowWorkRequest request : FinanceFellowOrganization.getWorkQueue().getCFRFinFellowWorkRequestList()){
            if (request.getStatus() == "Finance Case Assigned") {
                
            
             
            row[0] = request;
            row[4] = request.getSender().getEmployee().getName();
            row[5] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[6] = request.getStatus();
            row[2] = request.getCategory();
            row[1] = request.getPatient();
            row[3] = request.getCost();
            
            model.addRow(row);
            }
                }
             }
          if (afcheckbox2.isSelected() == true){
            
        for(CFRFinanceFellowWorkRequest request : FinanceFellowOrganization.getWorkQueue().getCFRFinFellowWorkRequestList()){
            if (request.getStatus() == "Email Sent for Funds") {
            
               // Object[] row = new Object[7];
            row[0] = request;
            row[4] = request.getSender().getEmployee().getName();
            row[5] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[6] = request.getStatus();
            row[2] = request.getCategory();
            row[1] = request.getPatient();
            row[3] = request.getCost();
            
            model.addRow(row);
            }
                }
             }
        if  (afcheckbox2.isSelected() == false && pcCheckBox1.isSelected() == false)
        {
         for(CFRFinanceFellowWorkRequest request : FinanceFellowOrganization.getWorkQueue().getCFRFinFellowWorkRequestList()){
            
                //Object[] row = new Object[7];
            row[0] = request;
            row[4] = request.getSender().getEmployee().getName();
            row[5] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[6] = request.getStatus();
            row[2] = request.getCategory();
            row[1] = request.getPatient();
            row[3] = request.getCost();
            
            model.addRow(row);
            }
       
        }
       
        
    }
    
 
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CFRFinanceWorkQueueJTable1;
    private javax.swing.JButton addfundsbtn;
    private javax.swing.JCheckBox afcheckbox2;
    private javax.swing.JButton assignJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JCheckBox pcCheckBox1;
    private javax.swing.JButton sendReqJBtn;
    // End of variables declaration//GEN-END:variables
}
