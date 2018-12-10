/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CFRAdminRole;

import Business.CrowdFunding.CFRFundingOrgsDirectory;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Utility.Utilities;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author nikhi
 */
public class CFRStratAddFundOrgJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CFRStratAddFundOrgJPanel
     */
    
     JPanel userProcessContainer;
    Enterprise enterprise;
    Organization organization;
    private CFRFundingOrgsDirectory fundorgDir;
    private Utilities utils;
    private Boolean b;
    public CFRStratAddFundOrgJPanel(JPanel userProcessContainer, Enterprise enterprise, Organization organization, CFRFundingOrgsDirectory orgDir) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.organization = organization;
        this.fundorgDir = orgDir;
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fundOrgtxt = new javax.swing.JTextField();
        emailtxt = new javax.swing.JTextField();
        categorytxt = new javax.swing.JTextField();
        mbtxt = new javax.swing.JTextField();
        submitbtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        CategoryJComboBox1 = new javax.swing.JComboBox();
        telLbl = new javax.swing.JLabel();
        emailLbl = new javax.swing.JLabel();
        catLbl = new javax.swing.JLabel();
        namelbl3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("ADD FUNDING ORGANIZATIONS");

        jLabel2.setForeground(new java.awt.Color(255, 102, 102));
        jLabel2.setText("ORGANIZATION NAME");

        jLabel3.setForeground(new java.awt.Color(255, 102, 102));
        jLabel3.setText("CATEGORY");

        jLabel4.setForeground(new java.awt.Color(255, 102, 102));
        jLabel4.setText("EMAIL ID");

        jLabel5.setForeground(new java.awt.Color(255, 102, 102));
        jLabel5.setText("TELEPHONE");

        fundOrgtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fundOrgtxtKeyReleased(evt);
            }
        });

        emailtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailtxtKeyReleased(evt);
            }
        });

        categorytxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                categorytxtKeyReleased(evt);
            }
        });

        mbtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mbtxtKeyReleased(evt);
            }
        });

        submitbtn.setBackground(new java.awt.Color(255, 102, 102));
        submitbtn.setText("SUBMIT");
        submitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbtnActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 102, 102));
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        CategoryJComboBox1.setForeground(new java.awt.Color(255, 102, 102));
        CategoryJComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoryJComboBox1ActionPerformed(evt);
            }
        });

        telLbl.setForeground(new java.awt.Color(255, 102, 102));

        emailLbl.setForeground(new java.awt.Color(255, 102, 102));

        catLbl.setForeground(new java.awt.Color(255, 102, 102));

        namelbl3.setForeground(new java.awt.Color(255, 102, 102));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fundOrgtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(categorytxt)
                                .addComponent(CategoryJComboBox1, 0, 149, Short.MAX_VALUE))
                            .addComponent(namelbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(catLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(157, 157, 157)
                                .addComponent(submitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(446, 446, 446)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(246, 246, 246)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(446, 446, 446)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mbtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(292, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fundOrgtxt, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(emailtxt)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(namelbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mbtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CategoryJComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(emailLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(categorytxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(catLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(351, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbtnActionPerformed
telLbl.setText("");
namelbl3.setText("");
catLbl.setText("");
emailLbl.setText("");
        b= true;


 if(!utils.validateEmail(emailtxt.getText())){
            emailLbl.setText("Invalid");
            b = false;
        }
       
 if(fundOrgtxt.getText().trim().isEmpty()){namelbl3.setText("Name field is empty"); b=false;}
  if(categorytxt.getText().trim().isEmpty()){catLbl.setText("Category field is empty"); b=false;}
   if(emailtxt.getText().trim().isEmpty()){emailLbl.setText("Email-Id field is empty"); b=false;}
    if(mbtxt.getText().trim().isEmpty()){telLbl.setText("Phone Number field is empty"); b=false;}
 if(!utils.validateEmail(emailtxt.getText())){
            emailLbl.setText("Invalid");
            b = false;
        }
       
if(b){
     String fund_org_name = fundOrgtxt.getText();
 String Category = categorytxt.getText();
 String email = emailtxt.getText();
 Long mb_num = Long.parseLong(mbtxt.getText());
fundorgDir.CreateFundingOrg(fund_org_name, Category, email, mb_num);
JOptionPane.showMessageDialog(null,"New entry added successfully!");
}

    }//GEN-LAST:event_submitbtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
         userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CFRStrategistWorkAreaJPanel cfrsjp = (CFRStrategistWorkAreaJPanel) component;
        cfrsjp.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void CategoryJComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoryJComboBox1ActionPerformed
 categorytxt.setText(String.valueOf(CategoryJComboBox1.getSelectedItem()));
    }//GEN-LAST:event_CategoryJComboBox1ActionPerformed

    private void fundOrgtxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fundOrgtxtKeyReleased
      namelbl3.setText("");   
        if(fundOrgtxt.getText().trim().isEmpty()){namelbl3.setText("Name field is empty"); b=false;}           // TODO add your handling code here:
    }//GEN-LAST:event_fundOrgtxtKeyReleased

    private void mbtxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mbtxtKeyReleased
telLbl.setText("");
        try{Long mb = Long.parseLong(mbtxt.getText());}
catch(NumberFormatException e){telLbl.setText("Number format error"); b=false;}        // TODO add your handling code here:
    }//GEN-LAST:event_mbtxtKeyReleased

    private void emailtxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailtxtKeyReleased
     emailLbl.setText("");
        if(emailtxt.getText().trim().isEmpty()){emailLbl.setText("Email-Id field is empty"); b=false;}  // TODO add your handling code here:
    }//GEN-LAST:event_emailtxtKeyReleased

    private void categorytxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_categorytxtKeyReleased
       catLbl.setText("");
        if(categorytxt.getText().trim().isEmpty()){catLbl.setText("Category field is empty"); b=false;}   // TODO add your handling code here:
    }//GEN-LAST:event_categorytxtKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox CategoryJComboBox1;
    private javax.swing.JLabel catLbl;
    private javax.swing.JTextField categorytxt;
    private javax.swing.JLabel emailLbl;
    private javax.swing.JTextField emailtxt;
    private javax.swing.JTextField fundOrgtxt;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField mbtxt;
    private javax.swing.JLabel namelbl3;
    private javax.swing.JButton submitbtn;
    private javax.swing.JLabel telLbl;
    // End of variables declaration//GEN-END:variables
}
