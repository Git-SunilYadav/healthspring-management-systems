/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CFRAdminRole;

import Business.CrowdFunding.CFRFundingOrgs;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Font;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author nikhi
 */
public class CFRStratViewFundOrgJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CFRStratViewFundOrgJPanel
     */
     private JPanel userProcessContainer;
    private CFRFundingOrgs fundingOrg;
    //private Date date;
    private boolean isValid;
   
    public CFRStratViewFundOrgJPanel(JPanel upc, CFRFundingOrgs f) {
        initComponents();
        
    this.userProcessContainer = upc;
        this.fundingOrg = f;
        
          fundOrgtxt.setText(fundingOrg.getFund_org_name());
       fundIDtxt.setText(String.valueOf(fundingOrg.getFund_org_id()));
       emailtxt.setText(fundingOrg.getEmail());
      categorytxt.setText(fundingOrg.getCategory());
        mbtxt.setText(String.valueOf(fundingOrg.getMb_num()));
        mbtxt.setEditable(false);
        fundOrgtxt.setEditable(false);
        fundIDtxt.setEditable(false);
        emailtxt.setEditable(false);
        categorytxt.setEditable(false);
        
       btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);
       
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fundOrgtxt = new javax.swing.JTextField();
        emailtxt = new javax.swing.JTextField();
        categorytxt = new javax.swing.JTextField();
        mbtxt = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        fundIDtxt = new javax.swing.JTextField();
        bckbtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("ADD FUNDING ORGS");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 23, 150, 23));

        jLabel2.setForeground(new java.awt.Color(255, 102, 102));
        jLabel2.setText("ORGANIZATION NAME");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 76, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 102, 102));
        jLabel3.setText("CATEGORY");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 148, 80, -1));

        jLabel4.setForeground(new java.awt.Color(255, 102, 102));
        jLabel4.setText("EMAIL ID");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 102, 102));
        jLabel5.setText("TELEPHONE");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, -1, -1));
        add(fundOrgtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 73, 100, -1));
        add(emailtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, 110, -1));
        add(categorytxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 145, 100, -1));
        add(mbtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 110, -1));

        btnUpdate.setBackground(new java.awt.Color(255, 102, 102));
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 80, -1));

        btnSave.setBackground(new java.awt.Color(255, 102, 102));
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 70, -1));

        jLabel6.setForeground(new java.awt.Color(255, 102, 102));
        jLabel6.setText("FUNDING ORG ID");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 95, 25));
        add(fundIDtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 110, -1));

        bckbtn.setText("BACK");
        bckbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bckbtnActionPerformed(evt);
            }
        });
        add(bckbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
          fundOrgtxt.setEditable(true);
        fundIDtxt.setEditable(true);
        emailtxt.setEditable(true);
        categorytxt.setEditable(true);
        mbtxt.setEditable(true);
        btnSave.setEnabled(true);
        btnUpdate.setEnabled(false);
    
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed


         fundingOrg.setFund_org_name(fundOrgtxt.getText());
         fundingOrg.setCategory(categorytxt.getText());
         fundingOrg.setEmail(emailtxt.getText());
         fundingOrg.setMb_num(Long.parseLong(mbtxt.getText()));

        JLabel mdLabel1 = new JLabel("Information Updated successfully");
        mdLabel1.setFont(new Font("Arial", Font.BOLD, 30));

        JOptionPane.showMessageDialog(null, mdLabel1);
        
        mbtxt.setEditable(false);
        fundOrgtxt.setEditable(false);
        fundIDtxt.setEditable(false);
        emailtxt.setEditable(false);
        categorytxt.setEditable(false);
        
       btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);
       
    

       
    }//GEN-LAST:event_btnSaveActionPerformed

    private void bckbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bckbtnActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        //CFRStrategistWorkAreaJPanel cfrsjp = (CFRStrategistWorkAreaJPanel) component;
        //cfrsjp.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
      
    }//GEN-LAST:event_bckbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bckbtn;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JTextField categorytxt;
    private javax.swing.JTextField emailtxt;
    private javax.swing.JTextField fundIDtxt;
    private javax.swing.JTextField fundOrgtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField mbtxt;
    // End of variables declaration//GEN-END:variables
}
