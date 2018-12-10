/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CampaignOrganizerRole;

import Business.CrowdFundingWorkQueue.CFRCaseWorkRequest;
import Business.CrowdFundingWorkQueue.CFRFinanceFellowWorkRequest;
import Business.CrowdFundingWorkQueue.CFRFundsReceivedWorkRequest;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.SocialCrowdFunding.CampaignOrganization;
import Business.Organization.SocialCrowdFunding.FinanceFellowOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.CaseManagerRole.AddCasedetailsJPanel;

/**
 *
 * @author nikhi
 */
public class CampaignOrganizerWorkAreaJPanel extends javax.swing.JPanel {

  private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private Enterprise enterprise;
     private CampaignOrganization campaignOrganization;
       
    
    /** Creates new form AdminWorkAreaJPanel */
    public CampaignOrganizerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, CampaignOrganization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
       this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.enterprise = enterprise;
        this.campaignOrganization = organization;
         
        populateTable();
        populateDisburseTable();
       }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        disbursebtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        CFRDisburseWorkQueueJTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        CFRDisburseWorkReqJTable2 = new javax.swing.JTable();
        nassJCheckBox1 = new javax.swing.JCheckBox();
        adisbJCheckBox2 = new javax.swing.JCheckBox();
        assignJButton = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();
        disAllJCombo = new javax.swing.JCheckBox();
        searchCattxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        searchAcctxt1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("CAMPAIGN ORGANIZER WORKAREA");

        disbursebtn.setBackground(new java.awt.Color(255, 102, 102));
        disbursebtn.setForeground(new java.awt.Color(255, 255, 255));
        disbursebtn.setText("DISBURSE FUNDS");
        disbursebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disbursebtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 102));
        jLabel2.setText("WORK QUEUE (FUNDS RECEIVED & AWAITING DISBURSEMENT)");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 102));
        jLabel3.setText("CASES FULFILLED");

        CFRDisburseWorkQueueJTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "REFERENCE NUM", "CASE ID", "CATEGORY", "FUNDING ORG", "AMOUNT RECEIVED", "REQUESTED BY", "RECEIVER", "DISBURSEMENT STATUS", "DATE RECEIVED"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(CFRDisburseWorkQueueJTable1);

        CFRDisburseWorkReqJTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "REFERENCE NUM", "CASE ID", "CATEGORY", "FUNDING ORG", "AMOUNT RECEIVED", "REQUESTED BY", "RECEIVER", "DISBURSEMENT STATUS", "DATE RECEIVED"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(CFRDisburseWorkReqJTable2);

        nassJCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        nassJCheckBox1.setForeground(new java.awt.Color(255, 102, 102));
        nassJCheckBox1.setText("NOT ASSIGNED");
        nassJCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nassJCheckBox1MouseClicked(evt);
            }
        });
        nassJCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nassJCheckBox1ActionPerformed(evt);
            }
        });

        adisbJCheckBox2.setBackground(new java.awt.Color(255, 255, 255));
        adisbJCheckBox2.setForeground(new java.awt.Color(255, 102, 102));
        adisbJCheckBox2.setText("AWAITING DISBURSEMENT");
        adisbJCheckBox2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adisbJCheckBox2MouseClicked(evt);
            }
        });
        adisbJCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adisbJCheckBox2ActionPerformed(evt);
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

        backbtn.setBackground(new java.awt.Color(255, 102, 102));
        backbtn.setForeground(new java.awt.Color(255, 255, 255));
        backbtn.setText("BACK");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        disAllJCombo.setBackground(new java.awt.Color(255, 255, 255));
        disAllJCombo.setForeground(new java.awt.Color(255, 102, 102));
        disAllJCombo.setText("DISBURSE ALL PENDING");

        searchCattxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchCattxtKeyReleased(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 102, 102));
        jLabel4.setText("SEARCH BY CATEGORY");

        searchAcctxt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchAcctxt1KeyReleased(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 102, 102));
        jLabel5.setText("SEARCH BY CFR Account");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(assignJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(188, 188, 188)
                        .addComponent(disAllJCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(disbursebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(183, 183, 183)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(searchCattxt, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 887, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 887, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nassJCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(adisbJCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(searchAcctxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backbtn)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nassJCheckBox1)
                        .addComponent(adisbJCheckBox2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchAcctxt1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(disbursebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(assignJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(disAllJCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchCattxt, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void disbursebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disbursebtnActionPerformed

        
         if (disAllJCombo.isSelected() == true)
             {
        DisburseMoneyJPanel DisburseMoneyJPanel = null;
             try {
                 DisburseMoneyJPanel = new DisburseMoneyJPanel(userProcessContainer, userAccount,enterprise , campaignOrganization);
             } catch (IOException ex) {
                 Logger.getLogger(CampaignOrganizerWorkAreaJPanel.class.getName()).log(Level.SEVERE, null, ex);
             }
        userProcessContainer.add("DisburseMoneyJPanel", DisburseMoneyJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
                 
             }
      
    }//GEN-LAST:event_disbursebtnActionPerformed
    
     public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)CFRDisburseWorkQueueJTable1.getModel();
        
        model.setRowCount(0);
        
         Object[] row = new Object[9];
       
         if (nassJCheckBox1.isSelected() == true){
            
        for(CFRFundsReceivedWorkRequest request : campaignOrganization.getWorkQueue().getCFRFundsReceivedWorkRequestList()){
            if (request.getStatus().equalsIgnoreCase("Awaiting Campaigner")) {
                
            row[0] = request;
            row[5] = request.getSender().getEmployee().getName();
            row[6] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[7] = request.getStatus();
            row[2] = request.getCategory();
           // row[1] = request.getPatient();
            row[4] = request.getCost();
            row[1] = request.getCaseId();
            row[3] = request.getFund_org_name();
            row[8] = request.getCreation_date();
            
            model.addRow(row);
            }
                }
             }
          if (adisbJCheckBox2.isSelected() == true){
            
        for(CFRFundsReceivedWorkRequest request1 : campaignOrganization.getWorkQueue().getCFRFundsReceivedWorkRequestList()){
            if (request1.getStatus().equalsIgnoreCase("Awaiting Disbursement")) {
               // Object[] row = new Object[7];
            row[0] = request1;
            row[5] = request1.getSender().getEmployee().getName();
            row[6] = request1.getReceiver() == null ? null : request1.getReceiver().getEmployee().getName();
            row[7] = request1.getStatus();
            row[2] = request1.getCategory();
           // row[1] = request.getPatient();
            row[4] = request1.getCost();
            row[1] = request1.getCaseId();
            row[3] = request1.getFund_org_name();
            row[8] = request1.getCreation_date();
            
            model.addRow(row);
            }
                }
             }
          
        if  (nassJCheckBox1.isSelected()==false && adisbJCheckBox2.isSelected() == false )
        {
         for(CFRFundsReceivedWorkRequest request2 : campaignOrganization.getWorkQueue().getCFRFundsReceivedWorkRequestList()){
           row[0] = request2;
            row[5] = request2.getSender().getEmployee().getName();
            row[6] = request2.getReceiver() == null ? null : request2.getReceiver().getEmployee().getName();
            row[7] = request2.getStatus();
            row[2] = request2.getCategory();
           // row[1] = request.getPatient();
            row[4] = request2.getCost();
            row[1] = request2.getCaseId();
            row[3] = request2.getFund_org_name();
            row[8] = request2.getCreation_date();
            
            model.addRow(row);
            
         }
        }
    }
    
     
     public void populateDisburseTable(){
        DefaultTableModel model = (DefaultTableModel)CFRDisburseWorkReqJTable2.getModel();
        
        model.setRowCount(0);
        
         Object[] row = new Object[9];
       
            
        for(CFRFundsReceivedWorkRequest request : campaignOrganization.getWorkQueue().getCFRFundsReceivedWorkRequestList()){
            if (request.getStatus().equalsIgnoreCase("Funds Disbursed")) {
                
            row[0] = request;
            row[5] = request.getSender().getEmployee().getName();
            row[6] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[7] = request.getStatus();
            row[2] = request.getCategory();
           // row[1] = request.getPatient();
            row[4] = request.getCost();
            row[1] = request.getCaseId();
            row[3] = request.getFund_org_name();
            row[8] = request.getCreation_date();
            
            model.addRow(row);
            }
                }
             }
    
    private void nassJCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nassJCheckBox1ActionPerformed
     //  populateTable();
    }//GEN-LAST:event_nassJCheckBox1ActionPerformed

    private void adisbJCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adisbJCheckBox2ActionPerformed
       // populateTable();
    }//GEN-LAST:event_adisbJCheckBox2ActionPerformed

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = CFRDisburseWorkQueueJTable1.getSelectedRow();

        if (selectedRow < 0){
            return;
        }

        
        CFRFundsReceivedWorkRequest request = (CFRFundsReceivedWorkRequest)CFRDisburseWorkQueueJTable1.getValueAt(selectedRow, 0);
        if (request.getStatus() == "Awaiting Campaigner")
        {
        request.setReceiver(userAccount);
        request.setStatus("Awaiting Disbursement");
        populateTable();
        }
        else{
     JOptionPane.showMessageDialog(null, "This request is already assigned");}
    }//GEN-LAST:event_assignJButtonActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CampaignOrgMainJPanel comjp = (CampaignOrgMainJPanel) component;
        //comjp.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backbtnActionPerformed

    private void nassJCheckBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nassJCheckBox1MouseClicked
        populateTable();
    }//GEN-LAST:event_nassJCheckBox1MouseClicked

    private void adisbJCheckBox2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adisbJCheckBox2MouseClicked
       populateTable();
    }//GEN-LAST:event_adisbJCheckBox2MouseClicked

    private void searchCattxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchCattxtKeyReleased
              // searchCattxt
         DefaultTableModel model = (DefaultTableModel)CFRDisburseWorkReqJTable2.getModel();
        
        model.setRowCount(0);
        
         Object[] row = new Object[9];
       
            
        for(CFRFundsReceivedWorkRequest request : campaignOrganization.getWorkQueue().getCFRFundsReceivedWorkRequestList()){
            if (request.getCategory().contains(searchCattxt.getText())) {
                
            row[0] = request;
            row[5] = request.getSender().getEmployee().getName();
            row[6] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[7] = request.getStatus();
            row[2] = request.getCategory();
           // row[1] = request.getPatient();
            row[4] = request.getCost();
            row[1] = request.getCaseId();
            row[3] = request.getFund_org_name();
            row[8] = request.getCreation_date();
            
            model.addRow(row);
            
                }
             }
       
    }//GEN-LAST:event_searchCattxtKeyReleased

    private void searchAcctxt1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchAcctxt1KeyReleased
        
        
        
                DefaultTableModel model = (DefaultTableModel)CFRDisburseWorkQueueJTable1.getModel();
        
        model.setRowCount(0);
        
         Object[] row = new Object[9];
       
            
        for(CFRFundsReceivedWorkRequest request : campaignOrganization.getWorkQueue().getCFRFundsReceivedWorkRequestList()){
            if (String.valueOf(request.getCfr_acc_num()).contains(searchAcctxt1.getText())) {
                
            row[0] = request;
            row[5] = request.getSender().getEmployee().getName();
            row[6] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[7] = request.getStatus();
            row[2] = request.getCategory();
           // row[1] = request.getPatient();
            row[4] = request.getCost();
            row[1] = request.getCaseId();
            row[3] = request.getFund_org_name();
            row[8] = request.getCreation_date();
            
            model.addRow(row);
            }
               
             
}   
    }//GEN-LAST:event_searchAcctxt1KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CFRDisburseWorkQueueJTable1;
    private javax.swing.JTable CFRDisburseWorkReqJTable2;
    private javax.swing.JCheckBox adisbJCheckBox2;
    private javax.swing.JButton assignJButton;
    private javax.swing.JButton backbtn;
    private javax.swing.JCheckBox disAllJCombo;
    private javax.swing.JButton disbursebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JCheckBox nassJCheckBox1;
    private javax.swing.JTextField searchAcctxt1;
    private javax.swing.JTextField searchCattxt;
    // End of variables declaration//GEN-END:variables
}
