/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.VaccineManagerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.Organization.PatientOrganization;
import Business.Organization.VaccinationCentre.VaccineOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author nikhi
 */
public class VaccineManagerWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private VaccineOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem business;
  
    public VaccineManagerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = (VaccineOrganization)organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business = business;
        //valueLabel.setText(enterprise.getName());
        //populateRequestTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addVaccbtn = new javax.swing.JButton();

        addVaccbtn.setText("ADD NEW VACCINE");
        addVaccbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVaccbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(addVaccbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(549, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 339, Short.MAX_VALUE)
                .addComponent(addVaccbtn)
                .addGap(229, 229, 229))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addVaccbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addVaccbtnActionPerformed
        // TODO add your handling code here:
        
        AddNewVaccineJPanel AddNewVaccineJPanel = new AddNewVaccineJPanel(userProcessContainer,  userAccount,  organization,enterprise, business);
        userProcessContainer.add("AddFundsReceivedJPanel", AddNewVaccineJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
   
    }//GEN-LAST:event_addVaccbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addVaccbtn;
    // End of variables declaration//GEN-END:variables
}
