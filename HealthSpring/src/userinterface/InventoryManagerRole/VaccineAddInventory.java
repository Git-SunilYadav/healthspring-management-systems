/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.InventoryManagerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.Vaccine.VaccineDetails;
import Business.Vaccine.VaccineDetailsDirectory;
import Business.Vaccine.VaccineInventory;
import Business.Vaccine.VaccineInventoryDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author nikhi
 */
public class VaccineAddInventory extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem business;
    private int quantity;
   // private Network sel_network;
    private VaccineDetailsDirectory VaccDetailsDir;
    private VaccineInventoryDirectory VaccInvDir;
    public VaccineAddInventory(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, Organization organization, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business = business;
        this.VaccDetailsDir = organization.getVaccineDetailsDir();
        this.VaccInvDir = organization.getVaccineInvDir();
        populateVTypeCombo();
        //populateComboBox();
            
    }

    private void populateVTypeCombo(){
        
        VaccineTypeCombo.removeAllItems();
        VaccineTypeCombo.addItem("Live-attenuated");
        VaccineTypeCombo.addItem("Inactivated");
        VaccineTypeCombo.addItem("Subunit");
        VaccineTypeCombo.addItem("Toxoid");
        VaccineTypeCombo.addItem("recombinant");
        VaccineTypeCombo.addItem("conjugate");
    }
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        addqtytxt = new javax.swing.JTextField();
        VaccineTypeCombo = new javax.swing.JComboBox();
        VNamejComboBox1 = new javax.swing.JComboBox();
        addiNVBTN = new javax.swing.JButton();
        thresholdtxt = new javax.swing.JTextField();
        currstocktxt = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel5.setText("QUANTITY TO BE ADDED");

        jLabel2.setForeground(new java.awt.Color(255, 102, 102));
        jLabel2.setText("VACCINE TYPE");

        jLabel3.setForeground(new java.awt.Color(255, 102, 102));
        jLabel3.setText("VACCINE NAME");

        VaccineTypeCombo.setForeground(new java.awt.Color(255, 102, 102));
        VaccineTypeCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VaccineTypeComboActionPerformed(evt);
            }
        });

        VNamejComboBox1.setForeground(new java.awt.Color(255, 102, 102));
        VNamejComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VNamejComboBox1ActionPerformed(evt);
            }
        });

        addiNVBTN.setText("ADD INVENTORY");
        addiNVBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addiNVBTNActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 102, 102));
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("THRESHOLD");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jButton2)
                        .addGap(238, 238, 238)
                        .addComponent(addiNVBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 158, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addqtytxt, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(229, 229, 229))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(thresholdtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(currstocktxt, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(216, 216, 216))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(234, 234, 234)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(27, 27, 27)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(VaccineTypeCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(VNamejComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(235, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(currstocktxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(thresholdtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addqtytxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addComponent(addiNVBTN)
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(33, 33, 33))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(148, 148, 148)
                    .addComponent(VaccineTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(49, 49, 49)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                            .addComponent(VNamejComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(217, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void VaccineTypeComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VaccineTypeComboActionPerformed

  /*      for (VaccineDetails vaccine : VaccDetailsDir.getVaccinerequestList())
        {
            if (VaccineTypeCombo.getSelectedItem().equals(vaccine.getVaccineType()))
            {
                VNamejComboBox1.addItem(vaccine.getVaccineName());
            }
        }
*/
        VNamejComboBox1.removeAllItems();
        
                for (VaccineInventory vaccine : VaccInvDir.getVaccineStockList())
        {
            if (VaccineTypeCombo.getSelectedItem().equals(vaccine.getVaccineType()))
            {
                VNamejComboBox1.addItem(vaccine.getVaccineName());
            }
        }
        
    }//GEN-LAST:event_VaccineTypeComboActionPerformed

    private void VNamejComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VNamejComboBox1ActionPerformed

          for (VaccineDetails vaccine : VaccDetailsDir.getVaccinerequestList())
                    {    if(vaccine.getVaccineName().equalsIgnoreCase(String.valueOf(VNamejComboBox1.getSelectedItem())))
                        {
                            thresholdtxt.setText(String.valueOf(vaccine.getThresholdQty()));
                            currstocktxt.setText(String.valueOf(vaccine.getQty()));
                        }
                    }
    }//GEN-LAST:event_VNamejComboBox1ActionPerformed

    private void addiNVBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addiNVBTNActionPerformed
        boolean vaccineexist = false;
        
        for (VaccineInventory vaccine : VaccInvDir.getVaccineStockList())
        {
        if (vaccine.getVaccineName().equals(VNamejComboBox1.getSelectedItem()))
        {
      //   String VType = String.valueOf(VaccineTypeCombo.getSelectedItem());
         //String Vname = String.valueOf(VNamejComboBox1.getSelectedItem());
        
        // int TQty = Integer.parseInt(thresholdtxt.getText());
         vaccineexist = true;
         int qty = vaccine.getInvStock() + Integer.parseInt(addqtytxt.getText());
         vaccine.setInvStock(qty);

        }
        }
        if (vaccineexist == false) 
        {
         String VType = String.valueOf(VaccineTypeCombo.getSelectedItem());
         String Vname = String.valueOf(VNamejComboBox1.getSelectedItem());
         int TQty = Integer.parseInt(thresholdtxt.getText());
        int S_quantity = Integer.parseInt(addqtytxt.getText());
           VaccInvDir.CreatevaccineStock(Vname, VType, TQty, S_quantity); 
        }
        
        

      
// TODO add your handling code here:
    }//GEN-LAST:event_addiNVBTNActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        VaccineInventoryManagerWorkAreaJPanel cmwjp = (VaccineInventoryManagerWorkAreaJPanel) component;
       // cmwjp.populateRequestTable();
        //cmwjp.populateRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox VNamejComboBox1;
    private javax.swing.JComboBox VaccineTypeCombo;
    private javax.swing.JButton addiNVBTN;
    private javax.swing.JTextField addqtytxt;
    private javax.swing.JTextField currstocktxt;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField thresholdtxt;
    // End of variables declaration//GEN-END:variables
}
