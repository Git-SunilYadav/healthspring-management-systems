/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.VaccineManagerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.VaccinationCentre.VaccineOrganization;
import Business.UserAccount.UserAccount;
import Business.Vaccine.VaccineDetailsDirectory;
import Business.VaccineWorkQueue.VaccineWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nikhi
 */
public class VaccineManagerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form VaccineManagerWorkAreaJPanel
     */
     private JPanel userProcessContainer;
    private VaccineOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem business;
    private VaccineDetailsDirectory VaccineDetailsDir;
  
    public VaccineManagerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
       initComponents(); 
        this.userProcessContainer = userProcessContainer;
        this.organization = (VaccineOrganization)organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business = business;
        this.VaccineDetailsDir = organization.getVaccineDetailsDir();
        //valueLabel.setText(enterprise.getName());
//        populateRequestTable();
        populateTable();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        asjCheckBox3 = new javax.swing.JCheckBox();
        VrecjCheckBox1 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        VaccineWRequestjTable1 = new javax.swing.JTable();
        Vacctxtsearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        SendStockBtn = new javax.swing.JButton();
        assignJButton = new javax.swing.JButton();

        jButton2.setBackground(new java.awt.Color(255, 102, 102));
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        asjCheckBox3.setForeground(new java.awt.Color(255, 102, 102));
        asjCheckBox3.setText("PENDING ACTION");
        asjCheckBox3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                asjCheckBox3MouseClicked(evt);
            }
        });
        asjCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asjCheckBox3ActionPerformed(evt);
            }
        });

        VrecjCheckBox1.setForeground(new java.awt.Color(255, 102, 102));
        VrecjCheckBox1.setText("NOT ASSIGNED");
        VrecjCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VrecjCheckBox1MouseClicked(evt);
            }
        });

        VaccineWRequestjTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "VACCINE NAME", "VACCINE TYPE", "QUANTITY", "REQUESTOR", "RECEIVER", "MESSAGE", "NETWORK", "STATUS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(VaccineWRequestjTable1);

        Vacctxtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                VacctxtsearchKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("VACCINE WORK QUEUE AREA");

        SendStockBtn.setBackground(new java.awt.Color(255, 102, 102));
        SendStockBtn.setForeground(new java.awt.Color(255, 255, 255));
        SendStockBtn.setText("SEND VACCINE STOCK");
        SendStockBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendStockBtnActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(293, 293, 293)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(VrecjCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(asjCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Vacctxtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(assignJButton)
                            .addGap(52, 52, 52)
                            .addComponent(SendStockBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(asjCheckBox3)
                        .addComponent(VrecjCheckBox1))
                    .addComponent(Vacctxtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SendStockBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(assignJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(55, 55, 55))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)VaccineWRequestjTable1.getModel();
        
        model.setRowCount(0);
        
         Object[] row = new Object[8];
           
         
         if (VrecjCheckBox1.isSelected() == true){
         for(VaccineWorkRequest request : organization.getWorkQueue().getVaccineWorkRequestList()){
            if (request.getStatus().equalsIgnoreCase("New Vaccine Request")) {
           // row[0] = request;
          row[3] = request.getSender().getEmployee().getName();
            row[4] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[7] = request.getStatus();
            row[0] = request;
            row[5] = request.getMessage();
            row[6] = request.getNetwork();
            row[1] = request.getVaccineType();
            row[2] = request.getQty();
              
            model.addRow(row);
      //  }
         }
         }
         }
     if (asjCheckBox3.isSelected() == true){
         for(VaccineWorkRequest request : organization.getWorkQueue().getVaccineWorkRequestList()){
            if (request.getStatus().equalsIgnoreCase("Vaccine Request Assigned") || request.getStatus().equalsIgnoreCase("Vaccine Request Processing")) {
           // row[0] = request;
          row[3] = request.getSender().getEmployee().getName();
            row[4] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[7] = request.getStatus();
            row[0] = request;
            row[5] = request.getMessage();
            row[6] = request.getNetwork();
            row[1] = request.getVaccineType();
            row[2] = request.getQty();
              
            model.addRow(row);
      //  }
         }
         }
     }
    //} 
     if (VrecjCheckBox1.isSelected() == false && asjCheckBox3.isSelected() == false){
         for(VaccineWorkRequest request : organization.getWorkQueue().getVaccineWorkRequestList()){
           // if (request.getStatus().equalsIgnoreCase("Request Sent")) {
           // row[0] = request;
          row[3] = request.getSender().getEmployee().getName();
            row[4] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[7] = request.getStatus();
            row[0] = request;
            row[5] = request.getMessage();
            row[6] = request.getNetwork();
            row[1] = request.getVaccineType();
            row[2] = request.getQty();
              
            model.addRow(row);
      //  }
         
         }
    }
    //}
   }
   
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        VaccineMainJPanel cmwjp = (VaccineMainJPanel) component;
        //cmwjp.populateRequestTable();
        //cmwjp.populateRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void asjCheckBox3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_asjCheckBox3MouseClicked
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_asjCheckBox3MouseClicked

    private void asjCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asjCheckBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_asjCheckBox3ActionPerformed

    private void VrecjCheckBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VrecjCheckBox1MouseClicked
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_VrecjCheckBox1MouseClicked

    private void VacctxtsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_VacctxtsearchKeyReleased

        DefaultTableModel model = (DefaultTableModel) VaccineWRequestjTable1.getModel();

        model.setRowCount(0);
        Object[] row = new Object[8];

        for (VaccineWorkRequest request : userAccount.getWorkQueue().getVaccineWorkRequestList()){
            if (request.getVaccineName().contains(Vacctxtsearch.getText())) {

                //row[0] = request;
                row[3] = request.getSender().getEmployee().getName();
                row[4] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
                row[7] = request.getStatus();
                row[0] = request;
                row[5] = request.getMessage();
                row[6] = request.getNetwork();
                row[1] = request.getVaccineType();
                row[2] = request.getQty();

                model.addRow(row);
            }
        }

    }//GEN-LAST:event_VacctxtsearchKeyReleased

    private void SendStockBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendStockBtnActionPerformed
// Stock Sent
               int selectedRow = VaccineWRequestjTable1.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        VaccineWorkRequest request = (VaccineWorkRequest)VaccineWRequestjTable1.getValueAt(selectedRow, 0);
     
        if(request.getReceiver() == userAccount && (request.getStatus().equalsIgnoreCase("Vaccine Request Assigned") || request.getStatus().equalsIgnoreCase("Vaccine Request Processing")))
         {
         
        request.setStatus("Vaccine Request Processing");
        
        
       CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ProcessVaccineRequestJPanel", new ProcessVaccineRequestJPanel(userProcessContainer, request, userAccount,organization, enterprise , business));;
        layout.next(userProcessContainer);
         }
         else 
         {
         JOptionPane.showMessageDialog(null, "This request is already processed");
         }
              
    }//GEN-LAST:event_SendStockBtnActionPerformed

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = VaccineWRequestjTable1.getSelectedRow();

        if (selectedRow < 0){
            return;
        }

        
        VaccineWorkRequest request = (VaccineWorkRequest)VaccineWRequestjTable1.getValueAt(selectedRow, 0);
         if(request.getStatus().equalsIgnoreCase("New Vaccine Request"))
         {
        request.setReceiver(userAccount);
        request.setStatus("Vaccine Request Assigned");
        populateTable();
         }
         else 
         {
         JOptionPane.showMessageDialog(null, "This request is already assigned");
         }
    }//GEN-LAST:event_assignJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SendStockBtn;
    private javax.swing.JTable VaccineWRequestjTable1;
    private javax.swing.JTextField Vacctxtsearch;
    private javax.swing.JCheckBox VrecjCheckBox1;
    private javax.swing.JCheckBox asjCheckBox3;
    private javax.swing.JButton assignJButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
