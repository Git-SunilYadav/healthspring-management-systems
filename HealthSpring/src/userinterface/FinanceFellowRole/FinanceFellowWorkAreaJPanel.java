/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.FinanceFellowRole;

import Business.CrowdFundingWorkQueue.CFRFinanceFellowWorkRequest;
import Business.CrowdFundingWorkQueue.CFRFundsReceivedWorkRequest;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.SocialCrowdFunding.FinanceFellowOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
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
    private Enterprise enterprise;
    private FinanceFellowOrganization FinanceFellowOrganization;
    private Organization org;
   
    
    public FinanceFellowWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
       // this.enterprise = enterprise;
        // this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.enterprise = enterprise;
        this.FinanceFellowOrganization = (FinanceFellowOrganization)organization;
        this.org = organization;
        
        populateTable();
        populateDisburseTable();
   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        CFRDisburseWorkReqJTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        sendReqJBtn = new javax.swing.JButton();
        addfundsbtn = new javax.swing.JButton();
        assignJButton = new javax.swing.JButton();
        pcCheckBox1 = new javax.swing.JCheckBox();
        afcheckbox2 = new javax.swing.JCheckBox();
        najCheckBox1 = new javax.swing.JCheckBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        CFRFinanceWorkQueueJTable2 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        FRjCheckBox1 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        searchtxt2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        adisJCheckBox1 = new javax.swing.JCheckBox();
        fdisJCheckBox2 = new javax.swing.JCheckBox();
        srchbyptxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        CFRDisburseWorkReqJTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(CFRDisburseWorkReqJTable1);

        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("WORK REQUEST (CASES PENDING DISBURSEMENT)");

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
        pcCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pcCheckBox1MouseClicked(evt);
            }
        });
        pcCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pcCheckBox1ActionPerformed(evt);
            }
        });

        afcheckbox2.setBackground(new java.awt.Color(255, 255, 255));
        afcheckbox2.setForeground(new java.awt.Color(255, 102, 102));
        afcheckbox2.setText("AWAITING FUNDING");
        afcheckbox2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                afcheckbox2MouseClicked(evt);
            }
        });
        afcheckbox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                afcheckbox2ActionPerformed(evt);
            }
        });

        najCheckBox1.setForeground(new java.awt.Color(255, 102, 102));
        najCheckBox1.setText("NOT ASSIGNED");
        najCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                najCheckBox1MouseClicked(evt);
            }
        });
        najCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                najCheckBox1ActionPerformed(evt);
            }
        });

        CFRFinanceWorkQueueJTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "PATIENT", "CASE ID", "CATEGORY", "AMOUNT REQD", "REQUESTED BY", "RECEIVER", "STATUS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(CFRFinanceWorkQueueJTable2);

        jLabel3.setForeground(new java.awt.Color(255, 102, 102));
        jLabel3.setText("WORK QUEUE (CASES PENDING FUNDING)");

        FRjCheckBox1.setForeground(new java.awt.Color(255, 102, 102));
        FRjCheckBox1.setText("FUNDING RECEIVED");
        FRjCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FRjCheckBox1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 102));
        jLabel2.setText("FINANCE FELLOW WORK AREA");

        searchtxt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchtxt2ActionPerformed(evt);
            }
        });
        searchtxt2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchtxt2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchtxt2KeyReleased(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 102, 102));
        jLabel5.setText("SEARCH BY REFERENCE NUMBER");

        adisJCheckBox1.setForeground(new java.awt.Color(255, 102, 102));
        adisJCheckBox1.setText("AWAITING DISBURSEMENT");
        adisJCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adisJCheckBox1MouseClicked(evt);
            }
        });

        fdisJCheckBox2.setForeground(new java.awt.Color(255, 102, 102));
        fdisJCheckBox2.setText("FUNDS DISBURSED");
        fdisJCheckBox2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fdisJCheckBox2MouseClicked(evt);
            }
        });
        fdisJCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fdisJCheckBox2ActionPerformed(evt);
            }
        });

        srchbyptxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                srchbyptxtKeyReleased(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 102, 102));
        jLabel4.setText("SEARCH BY PATIENT");

        jLabel6.setForeground(new java.awt.Color(255, 102, 102));
        jLabel6.setText("SEARCH BY REFERENCE NUMBER");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 795, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 887, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pcCheckBox1)
                                .addGap(18, 18, 18)
                                .addComponent(afcheckbox2)
                                .addGap(18, 18, 18)
                                .addComponent(najCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(FRjCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(searchtxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(adisJCheckBox1)
                                .addGap(18, 18, 18)
                                .addComponent(fdisJCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(srchbyptxt))
                        .addGap(82, 82, 82)
                        .addComponent(assignJButton)
                        .addGap(32, 32, 32)
                        .addComponent(sendReqJBtn)
                        .addGap(33, 33, 33)
                        .addComponent(addfundsbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pcCheckBox1)
                    .addComponent(afcheckbox2)
                    .addComponent(najCheckBox1)
                    .addComponent(FRjCheckBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sendReqJBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(assignJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(srchbyptxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(addfundsbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adisJCheckBox1)
                    .addComponent(fdisJCheckBox2))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchtxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void sendReqJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendReqJBtnActionPerformed
   int selectedRow = CFRFinanceWorkQueueJTable2.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        CFRFinanceFellowWorkRequest request = (CFRFinanceFellowWorkRequest)CFRFinanceWorkQueueJTable2.getValueAt(selectedRow, 0);
        if(request.getReceiver() == userAccount && (request.getStatus().equalsIgnoreCase("Finance Case Assigned") ))
         {
      
        // code for selecting the Funding Orgs
        
        SelectFundingOrgsJPanel SelectFundingOrgsJPanel = new SelectFundingOrgsJPanel( userProcessContainer,  userAccount,  FinanceFellowOrganization, business, request, enterprise);
        userProcessContainer.add("SelectFundingOrgsJPanel", SelectFundingOrgsJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
         }
        else{
     JOptionPane.showMessageDialog(null, "This request is already processed by someone");}
       // request.setReceiver(userAccount);
        //request.setStatus("Email Sent for Funds");
        //populateTable();
    
        // Code for Email 
        
    }//GEN-LAST:event_sendReqJBtnActionPerformed

    private void addfundsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addfundsbtnActionPerformed

           int selectedRow = CFRFinanceWorkQueueJTable2.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        CFRFinanceFellowWorkRequest request = (CFRFinanceFellowWorkRequest)CFRFinanceWorkQueueJTable2.getValueAt(selectedRow, 0);
       
        request.setStatus("Funding Locked");

        AddFundsReceivedJPanel AddFundsReceivedJPanel = new AddFundsReceivedJPanel(userProcessContainer,  userAccount,  org, business, request, enterprise);
        userProcessContainer.add("AddFundsReceivedJPanel", AddFundsReceivedJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_addfundsbtnActionPerformed

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = CFRFinanceWorkQueueJTable2.getSelectedRow();

        if (selectedRow < 0){
            return;
        }

        CFRFinanceFellowWorkRequest request = (CFRFinanceFellowWorkRequest)CFRFinanceWorkQueueJTable2.getValueAt(selectedRow, 0);
        
         if(request.getStatus().equalsIgnoreCase("Awaiting for Finance Team"))
     {
        request.setReceiver(userAccount);
        request.setStatus("Finance Case Assigned");
        populateTable();
         }
     else{
     JOptionPane.showMessageDialog(null, "This request is already assigned");}
    }//GEN-LAST:event_assignJButtonActionPerformed

    private void pcCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcCheckBox1ActionPerformed

      // populateTable();
        
        
    }//GEN-LAST:event_pcCheckBox1ActionPerformed

    private void afcheckbox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_afcheckbox2ActionPerformed

        //populateTable();

    }//GEN-LAST:event_afcheckbox2ActionPerformed

    private void najCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_najCheckBox1ActionPerformed

       //populateTable();
    }//GEN-LAST:event_najCheckBox1ActionPerformed

    private void pcCheckBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pcCheckBox1MouseClicked
        // TODO add your handling code here:
         populateTable();
       
    }//GEN-LAST:event_pcCheckBox1MouseClicked

    private void afcheckbox2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_afcheckbox2MouseClicked
    populateTable();
               // TODO add your handling code here:
    }//GEN-LAST:event_afcheckbox2MouseClicked

    private void najCheckBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_najCheckBox1MouseClicked
     populateTable();
               // TODO add your handling code here:
    }//GEN-LAST:event_najCheckBox1MouseClicked

    private void FRjCheckBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FRjCheckBox1MouseClicked
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_FRjCheckBox1MouseClicked

    private void searchtxt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchtxt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchtxt2ActionPerformed

    private void searchtxt2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchtxt2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchtxt2KeyPressed

    private void searchtxt2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchtxt2KeyReleased
        // TODO add your handling code here:
       try{int a=Integer.parseInt(searchtxt2.getText());}
       catch(NumberFormatException e){jLabel6.setText("Enter only numbers");}
        DefaultTableModel model = (DefaultTableModel)CFRDisburseWorkReqJTable1.getModel();
        
       model.setRowCount(0);
        for (CFRFundsReceivedWorkRequest request : userAccount.getWorkQueue().getCFRFundsReceivedWorkRequestList()){
          Object[] row = new Object[9];
          //if (request.getStatus() == "Funding Received" || request.getStatus() == "Funds Disbursed") {
          if (String.valueOf(request.getRefnum()).contains(searchtxt2.getText()))
           {
            row[0] = request;
            row[5] = request.getSender().getEmployee().getName();
            row[6] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[7] = request.getStatus();
            row[2] = request.getCategory();
            row[1] = request.getPatient();
            row[4] = request.getCost();
            row[1] = request.getCaseId();
            row[3] = request.getFund_org_name();
            row[8] = request.getCreation_date();
            
            model.addRow(row);
                }
        }
    }//GEN-LAST:event_searchtxt2KeyReleased

    private void adisJCheckBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adisJCheckBox1MouseClicked
       populateDisburseTable();
        // TODO add your handling code here:
    }//GEN-LAST:event_adisJCheckBox1MouseClicked

    private void fdisJCheckBox2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fdisJCheckBox2MouseClicked
  populateDisburseTable();        // TODO add your handling code here:
    }//GEN-LAST:event_fdisJCheckBox2MouseClicked

    private void fdisJCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fdisJCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fdisJCheckBox2ActionPerformed

    private void srchbyptxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_srchbyptxtKeyReleased
             
               DefaultTableModel model = (DefaultTableModel)CFRFinanceWorkQueueJTable2.getModel();
        
        model.setRowCount(0);
        
           Object[] row = new Object[7];
              
        for(CFRFinanceFellowWorkRequest request : FinanceFellowOrganization.getWorkQueue().getCFRFinFellowWorkRequestList()){
            if (request.getPatient().contains(srchbyptxt.getText())) {
                
            row[0] = request;
            row[4] = request.getSender().getEmployee().getName();
            row[5] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[6] = request.getStatus();
            row[2] = request.getCategory();
            row[1] = request.getCaseId();
            row[3] = request.getCost();
            
            model.addRow(row);
            }
                
             }
      
    }//GEN-LAST:event_srchbyptxtKeyReleased
 
     public void populateDisburseTable(){
        DefaultTableModel model = (DefaultTableModel)CFRDisburseWorkReqJTable1.getModel();
        
       model.setRowCount(0);
       Object[] row = new Object[9];
          
        if (adisJCheckBox1.isSelected() == true){
       
        for (CFRFundsReceivedWorkRequest request : userAccount.getWorkQueue().getCFRFundsReceivedWorkRequestList()){
            if (request.getStatus().equalsIgnoreCase("Awaiting Disbursement")) {
            
          //if (request.getStatus() == "Funding Received" || request.getStatus() == "Funds Disbursed") {
            row[0] = request;
            row[5] = request.getSender().getEmployee().getName();
            row[6] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[7] = request.getStatus();
            row[2] = request.getCategory();
            row[1] = request.getPatient();
            row[4] = request.getCost();
            row[1] = request.getCaseId();
            row[3] = request.getFund_org_name();
            row[8] = request.getCreation_date();
            
            model.addRow(row);
        }
        }
        }
        
                 if (fdisJCheckBox2.isSelected() == true){
       
        for (CFRFundsReceivedWorkRequest request : userAccount.getWorkQueue().getCFRFundsReceivedWorkRequestList()){
            if (request.getStatus().equalsIgnoreCase("Funds Disbursed")) {
            
          //if (request.getStatus() == "Funding Received" || request.getStatus() == "Funds Disbursed") {
            row[0] = request;
            row[5] = request.getSender().getEmployee().getName();
            row[6] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[7] = request.getStatus();
            row[2] = request.getCategory();
            row[1] = request.getPatient();
            row[4] = request.getCost();
            row[1] = request.getCaseId();
            row[3] = request.getFund_org_name();
            row[8] = request.getCreation_date();
            
            model.addRow(row);
        }
        }
                 }
        if (fdisJCheckBox2.isSelected() == false && adisJCheckBox1.isSelected() == false){
       
        for (CFRFundsReceivedWorkRequest request : userAccount.getWorkQueue().getCFRFundsReceivedWorkRequestList()){
            
          //if (request.getStatus() == "Funding Received" || request.getStatus() == "Funds Disbursed") {
            row[0] = request;
            row[5] = request.getSender().getEmployee().getName();
            row[6] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[7] = request.getStatus();
            row[2] = request.getCategory();
            row[1] = request.getPatient();
            row[4] = request.getCost();
            row[1] = request.getCaseId();
            row[3] = request.getFund_org_name();
            row[8] = request.getCreation_date();
            
            model.addRow(row);
        }
         
        }
                 
                 }  
     
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)CFRFinanceWorkQueueJTable2.getModel();
        
        model.setRowCount(0);
        
           Object[] row = new Object[7];
        if (pcCheckBox1.isSelected() == true){
            
        for(CFRFinanceFellowWorkRequest request : FinanceFellowOrganization.getWorkQueue().getCFRFinFellowWorkRequestList()){
            if (request.getStatus().equalsIgnoreCase("Finance Case Assigned")) {
                
            row[0] = request;
            row[4] = request.getSender().getEmployee().getName();
            row[5] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[6] = request.getStatus();
            row[2] = request.getCategory();
            row[1] = request.getCaseId();
            row[3] = request.getCost();
            
            model.addRow(row);
            }
                }
             }
          if (afcheckbox2.isSelected() == true){
            
        for(CFRFinanceFellowWorkRequest request1 : FinanceFellowOrganization.getWorkQueue().getCFRFinFellowWorkRequestList()){
            if (request1.getStatus().equalsIgnoreCase("Orgs Notified for Funding")) {
               // Object[] row = new Object[7];
            row[0] = request1;
            row[4] = request1.getSender().getEmployee().getName();
            row[5] = request1.getReceiver() == null ? null : request1.getReceiver().getEmployee().getName();
            row[6] = request1.getStatus();
            row[2] = request1.getCategory();
            row[1] = request1.getCaseId();
            row[3] = request1.getCost();
            
            model.addRow(row);
            }
                }
             }
          
          
                   if (najCheckBox1.isSelected() == true){
            
        for(CFRFinanceFellowWorkRequest request3 : FinanceFellowOrganization.getWorkQueue().getCFRFinFellowWorkRequestList()){
            if (request3.getStatus().equalsIgnoreCase("Awaiting for Finance Team")) {
                
            row[0] = request3;
            row[4] = request3.getSender().getEmployee().getName();
            row[5] = request3.getReceiver() == null ? null : request3.getReceiver().getEmployee().getName();
            row[6] = request3.getStatus();
            row[2] = request3.getCategory();
            row[1] = request3.getCaseId();
            row[3] = request3.getCost();
            
            model.addRow(row);
            }
                }
             }
                   
             if (FRjCheckBox1.isSelected() == true){
            
        for(CFRFinanceFellowWorkRequest request4 : FinanceFellowOrganization.getWorkQueue().getCFRFinFellowWorkRequestList()){
            if (request4.getStatus().equalsIgnoreCase("Funding Received")) {
                
            row[0] = request4;
            row[4] = request4.getSender().getEmployee().getName();
            row[5] = request4.getReceiver() == null ? null : request4.getReceiver().getEmployee().getName();
            row[6] = request4.getStatus();
            row[2] = request4.getCategory();
            row[1] = request4.getCaseId();
            row[3] = request4.getCost();
            
            model.addRow(row);
            }
                }
             }      
       
        if  (afcheckbox2.isSelected() == false && pcCheckBox1.isSelected() == false && najCheckBox1.isSelected() == false && FRjCheckBox1.isSelected() == false)
        {
         for(CFRFinanceFellowWorkRequest request2 : FinanceFellowOrganization.getWorkQueue().getCFRFinFellowWorkRequestList()){
            if (request2.getStatus().equalsIgnoreCase("Funding Received") == false) {
                //Object[] row = new Object[7];
            row[0] = request2;
            row[4] = request2.getSender().getEmployee().getName();
            row[5] = request2.getReceiver() == null ? null : request2.getReceiver().getEmployee().getName();
            row[6] = request2.getStatus();
            row[2] = request2.getCategory();
            row[1] = request2.getCaseId();
            row[3] = request2.getCost();
            
            model.addRow(row);
            }
         }
       
        }
       
        
    }
    
 
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CFRDisburseWorkReqJTable1;
    private javax.swing.JTable CFRFinanceWorkQueueJTable2;
    private javax.swing.JCheckBox FRjCheckBox1;
    private javax.swing.JButton addfundsbtn;
    private javax.swing.JCheckBox adisJCheckBox1;
    private javax.swing.JCheckBox afcheckbox2;
    private javax.swing.JButton assignJButton;
    private javax.swing.JCheckBox fdisJCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JCheckBox najCheckBox1;
    private javax.swing.JCheckBox pcCheckBox1;
    private javax.swing.JTextField searchtxt2;
    private javax.swing.JButton sendReqJBtn;
    private javax.swing.JTextField srchbyptxt;
    // End of variables declaration//GEN-END:variables
}
