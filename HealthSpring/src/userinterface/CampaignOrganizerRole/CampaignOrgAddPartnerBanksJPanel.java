/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CampaignOrganizerRole;

import Business.CrowdFunding.CFRPartnerBanks;
import Business.CrowdFunding.CFRPartnerBanksDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.SocialCrowdFunding.CampaignOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author nikhi
 */
public class CampaignOrgAddPartnerBanksJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private Organization organization;
    private CFRPartnerBanksDirectory partnerbanksDir;
    private Boolean b;
     public CampaignOrgAddPartnerBanksJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise,CampaignOrganization campaignOrganization,EcoSystem business) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.organization = campaignOrganization;
        this.partnerbanksDir = organization.getCfrPartnerBanksDir();
        statustxt.addItem("Active");
        statustxt.addItem("Inactive");
        this.b=true;
    
    }

       @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        addbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        bnametxt = new javax.swing.JTextField();
        ifsctxt = new javax.swing.JTextField();
        accnumtxt = new javax.swing.JTextField();
        brnametxt = new javax.swing.JTextField();
        accnametxt = new javax.swing.JTextField();
        backbtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        bemailtxt = new javax.swing.JTextField();
        statustxt = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        jLabel13.setForeground(new java.awt.Color(255, 102, 102));
        jLabel13.setText("BANK NAME");

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addbtn.setBackground(new java.awt.Color(255, 102, 102));
        addbtn.setForeground(new java.awt.Color(255, 255, 255));
        addbtn.setText("ADD BANK ACCOUNT");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });
        add(addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 521, 160, 31));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("ADD PARTNER BANKS INFO");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 30, 192, 30));

        jLabel2.setForeground(new java.awt.Color(255, 102, 102));
        jLabel2.setText("BANK NAME");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 120, 88, 28));

        jLabel3.setForeground(new java.awt.Color(255, 102, 102));
        jLabel3.setText("IFSC CODE");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 177, 88, 28));

        jLabel4.setForeground(new java.awt.Color(255, 102, 102));
        jLabel4.setText("BRANCH NAME");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 95, 28));

        jLabel5.setForeground(new java.awt.Color(255, 102, 102));
        jLabel5.setText("ACCOUNT STATUS");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 177, 110, -1));

        jLabel6.setForeground(new java.awt.Color(255, 102, 102));
        jLabel6.setText("ACCOUNT NUMBER");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 237, -1, 27));

        jLabel7.setForeground(new java.awt.Color(255, 102, 102));
        jLabel7.setText("ACCOUNT HOLDER NAME");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 237, -1, 27));

        bnametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnametxtActionPerformed(evt);
            }
        });
        add(bnametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 129, 28));

        ifsctxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ifsctxtKeyPressed(evt);
            }
        });
        add(ifsctxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 177, 129, 28));

        accnumtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                accnumtxtKeyPressed(evt);
            }
        });
        add(accnumtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 237, 130, 27));
        add(brnametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, 136, 28));
        add(accnametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 136, 27));

        backbtn.setBackground(new java.awt.Color(255, 102, 102));
        backbtn.setForeground(new java.awt.Color(255, 255, 255));
        backbtn.setText("BACK");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });
        add(backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 521, 70, 31));

        jLabel8.setForeground(new java.awt.Color(255, 102, 102));
        jLabel8.setText("BANK EMAIL");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 330, 100, 28));
        add(bemailtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 177, 28));

        statustxt.setForeground(new java.awt.Color(255, 102, 102));
        add(statustxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 136, 28));

        jLabel9.setForeground(new java.awt.Color(255, 102, 102));
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 154, 109, 12));

        jLabel10.setForeground(new java.awt.Color(255, 102, 102));
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 160, 20));

        jLabel11.setForeground(new java.awt.Color(255, 102, 102));
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 212, 140, 20));

        jLabel12.setForeground(new java.awt.Color(255, 102, 102));
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 364, 109, 20));

        jLabel14.setForeground(new java.awt.Color(255, 102, 102));
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 109, -1));

        jLabel15.setForeground(new java.awt.Color(255, 102, 102));
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 109, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
 b= true;
  jLabel9.setText("");
  jLabel14.setText("");
 jLabel11.setText("");
 jLabel10.setText("");
 jLabel12.setText("");
  jLabel15.setText("");
  
       try{int f = Integer.parseInt(ifsctxt.getText());}
           catch(NumberFormatException e)
                   {jLabel11.setText("Number format error"); b=false;}
  try{int j = Integer.parseInt(accnumtxt.getText());}
           catch(NumberFormatException e)
                   {jLabel10.setText("Number format error"); b=false;}
        if(bnametxt.getText().trim().isEmpty()){jLabel9.setText("Above field is empty"); b=false;}
        if(brnametxt.getText().trim().isEmpty()){jLabel14.setText("Above field is empty"); b=false;}
        if(ifsctxt.getText().trim().isEmpty()){jLabel11.setText("Above field is empty"); b=false;}
        if(accnumtxt.getText().trim().isEmpty()){jLabel10.setText("Above field is empty"); b=false;}
        if(bemailtxt.getText().trim().isEmpty()){jLabel12.setText("Above field is empty"); b=false;}
        if(accnametxt.getText().trim().isEmpty()){jLabel15.setText("Above field is empty"); b=false;}
 if(b){       
  String bankname = bnametxt.getText();
 String branch = brnametxt.getText();
 String accname = accnametxt.getText();
 int ifsc = Integer.parseInt(ifsctxt.getText());
 int accnum = Integer.parseInt(accnumtxt.getText());
 String accstatus = String.valueOf(statustxt.getSelectedItem());
 String b_email = bemailtxt.getText();
CFRPartnerBanks partner_banks = partnerbanksDir.CreatePartnerbank(bankname, branch, accname, ifsc, accnum, accstatus, b_email);

 }
    }//GEN-LAST:event_addbtnActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CampaignOrgManagePartnerBanksJPanel comjp = (CampaignOrgManagePartnerBanksJPanel) component;
        comjp.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backbtnActionPerformed

    private void bnametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bnametxtActionPerformed

    private void ifsctxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ifsctxtKeyPressed
      jLabel11.setText(""); 
        try{int f = Integer.parseInt(ifsctxt.getText());}
           catch(NumberFormatException e)
                   {jLabel11.setText("Number format error"); b=false;} // TODO add your handling code here:
    }//GEN-LAST:event_ifsctxtKeyPressed

    private void accnumtxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_accnumtxtKeyPressed
        jLabel10.setText(""); 
        try{int f = Integer.parseInt(accnumtxt.getText());}
           catch(NumberFormatException e)
                   {jLabel10.setText("Number format error"); b=false;}  // TODO add your handling code here:
    }//GEN-LAST:event_accnumtxtKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accnametxt;
    private javax.swing.JTextField accnumtxt;
    private javax.swing.JButton addbtn;
    private javax.swing.JButton backbtn;
    private javax.swing.JTextField bemailtxt;
    private javax.swing.JTextField bnametxt;
    private javax.swing.JTextField brnametxt;
    private javax.swing.JTextField ifsctxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox statustxt;
    // End of variables declaration//GEN-END:variables
}
