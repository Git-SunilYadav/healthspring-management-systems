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
    private boolean b;
   
    public CFRStratViewFundOrgJPanel(JPanel upc, CFRFundingOrgs f) {
        initComponents();
        
    this.userProcessContainer = upc;
        this.fundingOrg = f;
        populateCategoryCombo();
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
        CategoryJComboBox1 = new javax.swing.JComboBox();
        namelbl3 = new javax.swing.JLabel();
        telLbl = new javax.swing.JLabel();
        emailLbl = new javax.swing.JLabel();
        catLbl = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("ADD FUNDING ORGS");

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

        btnUpdate.setBackground(new java.awt.Color(255, 102, 102));
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(255, 102, 102));
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 102, 102));
        jLabel6.setText("FUNDING ORG ID");

        fundIDtxt.setEnabled(false);

        bckbtn.setBackground(new java.awt.Color(255, 102, 102));
        bckbtn.setForeground(new java.awt.Color(255, 255, 255));
        bckbtn.setText("BACK");
        bckbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bckbtnActionPerformed(evt);
            }
        });

        CategoryJComboBox1.setForeground(new java.awt.Color(255, 102, 102));
        CategoryJComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CategoryJComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoryJComboBox1ActionPerformed(evt);
            }
        });

        namelbl3.setForeground(new java.awt.Color(255, 102, 102));

        telLbl.setForeground(new java.awt.Color(255, 102, 102));

        emailLbl.setForeground(new java.awt.Color(255, 102, 102));

        catLbl.setForeground(new java.awt.Color(255, 102, 102));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(fundOrgtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CategoryJComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(categorytxt, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(catLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(namelbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(fundIDtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(48, 48, 48)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(telLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(mbtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(47, 47, 47)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(emailLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(bckbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(157, 157, 157)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(209, 209, 209)))
                .addGap(83, 364, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fundIDtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(fundOrgtxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(namelbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CategoryJComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(categorytxt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(catLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bckbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mbtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(telLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(116, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

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
telLbl.setText("");
namelbl3.setText("");
catLbl.setText("");
emailLbl.setText("");
         b=true;
try{Long mb = Long.parseLong(mbtxt.getText());}
catch(NumberFormatException e){telLbl.setText("Number format error"); b=false;}
 if(fundOrgtxt.getText().trim().isEmpty()){namelbl3.setText("Name field is empty"); b=false;}
  if(categorytxt.getText().trim().isEmpty()){catLbl.setText("Category field is empty"); b=false;}
   if(emailtxt.getText().trim().isEmpty()){emailLbl.setText("Email-Id field is empty"); b=false;}
    if(mbtxt.getText().trim().isEmpty()){telLbl.setText("Phone Number field is empty"); b=false;}

if(b){
         fundingOrg.setFund_org_name(fundOrgtxt.getText());
         fundingOrg.setCategory(categorytxt.getText());
         fundingOrg.setEmail(emailtxt.getText());
         fundingOrg.setMb_num(Long.parseLong(mbtxt.getText()));

        JLabel mdLabel1 = new JLabel("Information Updated successfully");
       // mdLabel1.setFont(new Font("Arial", Font.BOLD, 30));

        JOptionPane.showMessageDialog(null, mdLabel1);
        
        mbtxt.setEditable(false);
        fundOrgtxt.setEditable(false);
        fundIDtxt.setEditable(false);
        emailtxt.setEditable(false);
        categorytxt.setEditable(false);
        
       btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);

}
    }//GEN-LAST:event_btnSaveActionPerformed

    
    private void bckbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bckbtnActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CFRStrategistWorkAreaJPanel cfrsjp = (CFRStrategistWorkAreaJPanel) component;
        cfrsjp.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
      
    }//GEN-LAST:event_bckbtnActionPerformed

    private void CategoryJComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoryJComboBox1ActionPerformed

         categorytxt.setText(String.valueOf(CategoryJComboBox1.getSelectedItem()));
    }//GEN-LAST:event_CategoryJComboBox1ActionPerformed

    private void fundOrgtxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fundOrgtxtKeyReleased
      namelbl3.setText("");
       if(fundOrgtxt.getText().trim().isEmpty()){namelbl3.setText("Name field is empty"); b=false;}
      // TODO add your handling code here:
    }//GEN-LAST:event_fundOrgtxtKeyReleased

    private void emailtxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailtxtKeyReleased
        emailLbl.setText("");
           if(emailtxt.getText().trim().isEmpty()){emailLbl.setText("Email-Id field is empty"); b=false;}
// TODO add your handling code here:
    }//GEN-LAST:event_emailtxtKeyReleased

    private void mbtxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mbtxtKeyReleased
       telLbl.setText("");
       try{Long mb = Long.parseLong(mbtxt.getText());}
catch(NumberFormatException e){telLbl.setText("Number format error"); b=false;}
       if(mbtxt.getText().trim().isEmpty()){telLbl.setText("Phone Number field is empty"); b=false;}

       // TODO add your handling code here:
    }//GEN-LAST:event_mbtxtKeyReleased

    private void categorytxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_categorytxtKeyReleased
     catLbl.setText("");
       if(categorytxt.getText().trim().isEmpty()){catLbl.setText("Category field is empty"); b=false;}
     // TODO add your handling code here:
    }//GEN-LAST:event_categorytxtKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox CategoryJComboBox1;
    private javax.swing.JButton bckbtn;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel catLbl;
    private javax.swing.JTextField categorytxt;
    private javax.swing.JLabel emailLbl;
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
    private javax.swing.JLabel namelbl3;
    private javax.swing.JLabel telLbl;
    // End of variables declaration//GEN-END:variables
}
