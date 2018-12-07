/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.FinanceFellowRole;

import Business.CrowdFundingWorkQueue.CFRFinanceFellowWorkRequest;
import Business.EcoSystem;
import Business.EmailNotify.EmailSender;
import Business.Organization.Organization;
import Business.Organization.SocialCrowdFunding.FinanceFellowOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.ButtonGroup;
import javax.swing.JFileChooser;
import javax.swing.JPanel;

/**
 *
 * @author nikhi
 */
public class SelectFundingOrgsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SelectFundingOrgsJPanel
     */
    private JPanel userProcessContainer;
    private CFRFinanceFellowWorkRequest request;
    private ButtonGroup bg1= new ButtonGroup();
    private EmailSender emailSender;
    private EcoSystem business;
    private UserAccount userAccount;
    private FinanceFellowOrganization FinanceFellowOrganization;
   
 
    public SelectFundingOrgsJPanel(JPanel userProcessContainer, UserAccount account, FinanceFellowOrganization organization, EcoSystem business, CFRFinanceFellowWorkRequest request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        this.business = business;
        this.FinanceFellowOrganization = organization;
        groupbutton();
        
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        SelCatJRadioButton2 = new javax.swing.JRadioButton();
        selALljRadioButton2 = new javax.swing.JRadioButton();
        CategoryJComboBox1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        notifybtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        browsebtn = new javax.swing.JButton();
        attachmentTextField = new javax.swing.JTextField();
        bckbtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("SEND NOTIFICATION FOR FUNDING");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 31, 203, 24));

        SelCatJRadioButton2.setForeground(new java.awt.Color(255, 102, 102));
        SelCatJRadioButton2.setText("SELECT CATEGORY");
        SelCatJRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelCatJRadioButton2ActionPerformed(evt);
            }
        });
        add(SelCatJRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 171, 141, -1));

        selALljRadioButton2.setForeground(new java.awt.Color(255, 102, 102));
        selALljRadioButton2.setText("SELECT ALL FUNDING ORGS");
        selALljRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selALljRadioButton2ActionPerformed(evt);
            }
        });
        add(selALljRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 130, -1, -1));

        CategoryJComboBox1.setForeground(new java.awt.Color(255, 102, 102));
        CategoryJComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(CategoryJComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 172, 135, -1));

        jLabel2.setForeground(new java.awt.Color(255, 102, 102));
        jLabel2.setText("SELECTION CRITERIA");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 87, 151, 25));

        notifybtn.setBackground(new java.awt.Color(255, 102, 102));
        notifybtn.setForeground(new java.awt.Color(255, 255, 255));
        notifybtn.setText("SEND NOTIFICATION");
        notifybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notifybtnActionPerformed(evt);
            }
        });
        add(notifybtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 102, 102));
        jLabel3.setText("ADD ATTACHEMENT");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 119, 20));

        browsebtn.setBackground(new java.awt.Color(255, 153, 153));
        browsebtn.setForeground(new java.awt.Color(255, 255, 255));
        browsebtn.setText("BROWSE");
        browsebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browsebtnActionPerformed(evt);
            }
        });
        add(browsebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, 171, -1));
        add(attachmentTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 220, 30));

        bckbtn.setBackground(new java.awt.Color(255, 102, 102));
        bckbtn.setText("BACK");
        bckbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bckbtnActionPerformed(evt);
            }
        });
        add(bckbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 340, 80, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void SelCatJRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelCatJRadioButton2ActionPerformed
       
        if(SelCatJRadioButton2.isSelected()){
            CategoryJComboBox1.setEnabled(true);
            populateCategoryCombo();
        }   
    }//GEN-LAST:event_SelCatJRadioButton2ActionPerformed

    private void selALljRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selALljRadioButton2ActionPerformed
           if(selALljRadioButton2.isSelected()){
            CategoryJComboBox1.setEnabled(false);
             CategoryJComboBox1.removeAllItems();
        }  
    }//GEN-LAST:event_selALljRadioButton2ActionPerformed

    private void notifybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notifybtnActionPerformed

        request.setReceiver(userAccount);
        request.setStatus("Email Sent for Funds");
        
        emailSender = new EmailSender();
        
    
        
    }//GEN-LAST:event_notifybtnActionPerformed

    private void browsebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browsebtnActionPerformed
         JFileChooser selectFile = new JFileChooser();
        selectFile.showOpenDialog(this);
        attachmentTextField.setText(selectFile.getSelectedFile().toString());
    
        
    }//GEN-LAST:event_browsebtnActionPerformed

    private void bckbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bckbtnActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        FinanceFellowWorkAreaJPanel cmwjp = (FinanceFellowWorkAreaJPanel) component;
        cmwjp.populateTable();
        //cmwjp.populateRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_bckbtnActionPerformed

    private void populateCategoryCombo(){
        CategoryJComboBox1.removeAllItems();
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
    
    public void groupbutton(){
   // ButtonGroup bg1= new ButtonGroup();
    selALljRadioButton2.setActionCommand("selALljRadioButton2");
    bg1.add(selALljRadioButton2);
    
    SelCatJRadioButton2.setActionCommand("SelCatJRadioButton2");
    bg1.add(SelCatJRadioButton2);
    
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox CategoryJComboBox1;
    private javax.swing.JRadioButton SelCatJRadioButton2;
    private javax.swing.JTextField attachmentTextField;
    private javax.swing.JButton bckbtn;
    private javax.swing.JButton browsebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton notifybtn;
    private javax.swing.JRadioButton selALljRadioButton2;
    // End of variables declaration//GEN-END:variables
}
