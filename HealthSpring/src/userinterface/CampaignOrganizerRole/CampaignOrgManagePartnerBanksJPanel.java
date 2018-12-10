/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CampaignOrganizerRole;

import Business.CrowdFunding.CFRFundingOrgs;
import Business.CrowdFunding.CFRPartnerBanks;
import Business.CrowdFunding.CFRPartnerBanksDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.SocialCrowdFunding.CampaignOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nikhi
 */
public class CampaignOrgManagePartnerBanksJPanel extends javax.swing.JPanel {

     private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private CampaignOrganization campaignOrganization;
    private CFRPartnerBanksDirectory partnerbanksDir;
  public CampaignOrgManagePartnerBanksJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise,CampaignOrganization campaignOrganization,EcoSystem business) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.enterprise = enterprise;
        this.campaignOrganization = campaignOrganization;
        this.partnerbanksDir = campaignOrganization.getCfrPartnerBanksDir();
        populateRequestTable();
  
    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addbtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        partnerbanksJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        viewbtn = new javax.swing.JButton();
        AbJCheckBox1 = new javax.swing.JCheckBox();
        backbtn = new javax.swing.JButton();
        searchbyBanktxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        addbtn.setBackground(new java.awt.Color(255, 102, 102));
        addbtn.setForeground(new java.awt.Color(255, 255, 255));
        addbtn.setText("ADD NEW BANK ACCOUNT");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });

        partnerbanksJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "BANK NAME", "BRANCH", "IFSC CODE", "BANKS EMAIL", "ACCOUNT HOLDER", "ACCOUNT NUM", "STATUS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane2.setViewportView(partnerbanksJTable);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("MANAGE PARTNER BANKS & ACCOUNTS");

        viewbtn.setBackground(new java.awt.Color(255, 102, 102));
        viewbtn.setForeground(new java.awt.Color(255, 255, 255));
        viewbtn.setText("VIEW DETAILS");
        viewbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbtnActionPerformed(evt);
            }
        });

        AbJCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        AbJCheckBox1.setForeground(new java.awt.Color(255, 102, 102));
        AbJCheckBox1.setText("ACTIVE BANK ACC");
        AbJCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AbJCheckBox1MouseClicked(evt);
            }
        });
        AbJCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbJCheckBox1ActionPerformed(evt);
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

        searchbyBanktxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchbyBanktxtKeyReleased(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 102, 102));
        jLabel2.setText("SEARCH BY BANK NAME");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(viewbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(AbJCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchbyBanktxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AbJCheckBox1)
                    .addComponent(searchbyBanktxt)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addComponent(backbtn)
                .addGap(84, 84, 84))
        );
    }// </editor-fold>//GEN-END:initComponents
  public void populateRequestTable(){
  
    
DefaultTableModel model = (DefaultTableModel) partnerbanksJTable.getModel();

       model.setRowCount(0);
       Object[] row = new Object[7];
       
 if (AbJCheckBox1.isSelected() == true){
        
       for (CFRPartnerBanks partner_banks : campaignOrganization.getCfrPartnerBanksDir().getpartnerBankList()){
               if (partner_banks.getAcc_status().equalsIgnoreCase("Active")) {
               row[1] = partner_banks.getBranchname();
           row[0] = partner_banks;
           row[2] = partner_banks.getIfsc();
           row[3] = partner_banks.getBank_email();
           row[4] = partner_banks.getAccount_name();
           row[5] = partner_banks.getAccount_num();
           row[6] = partner_banks.getAcc_status();
           model.addRow(row);
       }
       }
 }
 
 else
 {
       for (CFRPartnerBanks partner_banks : campaignOrganization.getCfrPartnerBanksDir().getpartnerBankList()){
               row[1] = partner_banks.getBranchname();
           row[0] = partner_banks;
           row[2] = partner_banks.getIfsc();
              row[3] = partner_banks.getBank_email();
           row[4] = partner_banks.getAccount_name();
           row[5] = partner_banks.getAccount_num();
           row[6] = partner_banks.getAcc_status();
           model.addRow(row);
       
       }
 }
       
       

  }
    
    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("CampaignOrgAddPartnerBanksJPanel", new CampaignOrgAddPartnerBanksJPanel(userProcessContainer, userAccount, enterprise,campaignOrganization, business));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_addbtnActionPerformed

    private void viewbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = partnerbanksJTable.getSelectedRow();
        if(selectedRow<0)
        {
            JLabel mdLabel1 = new JLabel("Please select a row");
            mdLabel1.setFont(new Font("Arial", Font.BOLD, 30));
            JOptionPane.showMessageDialog(null, mdLabel1);
        }
        else {
            CFRPartnerBanks partBanks = (CFRPartnerBanks)partnerbanksJTable.getValueAt(selectedRow,0);
            CampaignOrgViewPartnerBanksJPanel viewPartnerBanksJPanel = new CampaignOrgViewPartnerBanksJPanel(userProcessContainer, partBanks);
            userProcessContainer.add(viewPartnerBanksJPanel);
            CardLayout layout = (CardLayout)userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_viewbtnActionPerformed

    private void AbJCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbJCheckBox1ActionPerformed

//populateRequestTable();
    }//GEN-LAST:event_AbJCheckBox1ActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CampaignOrgMainJPanel comjp = (CampaignOrgMainJPanel) component;
       // comjp.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backbtnActionPerformed

    private void AbJCheckBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AbJCheckBox1MouseClicked
populateRequestTable();
        // TODO add your handling code here:
    }//GEN-LAST:event_AbJCheckBox1MouseClicked

    private void searchbyBanktxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchbyBanktxtKeyReleased
        //searchbyBanktxt
        DefaultTableModel model = (DefaultTableModel) partnerbanksJTable.getModel();

       model.setRowCount(0);
       Object[] row = new Object[7];
       
        
       for (CFRPartnerBanks partner_banks : campaignOrganization.getCfrPartnerBanksDir().getpartnerBankList()){
               if (partner_banks.getBankname().contains(searchbyBanktxt.getText())) {
               row[1] = partner_banks.getBranchname();
           row[0] = partner_banks;
           row[2] = partner_banks.getIfsc();
           row[3] = partner_banks.getBank_email();
           row[4] = partner_banks.getAccount_name();
           row[5] = partner_banks.getAccount_num();
           row[6] = partner_banks.getAcc_status();
           model.addRow(row);
 
       }
 }

    }//GEN-LAST:event_searchbyBanktxtKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox AbJCheckBox1;
    private javax.swing.JButton addbtn;
    private javax.swing.JButton backbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable partnerbanksJTable;
    private javax.swing.JTextField searchbyBanktxt;
    private javax.swing.JButton viewbtn;
    // End of variables declaration//GEN-END:variables
}
