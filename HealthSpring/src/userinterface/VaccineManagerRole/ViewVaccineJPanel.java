/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.VaccineManagerRole;

import Business.Vaccine.VaccineDetails;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author nikhi
 */
public class ViewVaccineJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewVaccineJPanel
     */
    private VaccineDetails vdetails;
    private JPanel userProcessContainer;
    
    public ViewVaccineJPanel(JPanel userProcessContainer , VaccineDetails v) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.vdetails = v;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VaccineTypeCombo = new javax.swing.JComboBox();
        thresholdtxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Vnametxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        updatebtn = new javax.swing.JButton();
        savebtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        VaccineTypeCombo.setForeground(new java.awt.Color(255, 102, 102));
        VaccineTypeCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 102));
        jLabel4.setText("VIEW VACCINE INFO");

        jLabel2.setForeground(new java.awt.Color(255, 102, 102));
        jLabel2.setText("VACCINE NAME");

        jLabel3.setForeground(new java.awt.Color(255, 102, 102));
        jLabel3.setText("THRESHOLD QTY");

        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("VACCINE TYPE");

        updatebtn.setBackground(new java.awt.Color(255, 102, 102));
        updatebtn.setForeground(new java.awt.Color(255, 255, 255));
        updatebtn.setText("UPDATE");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });

        savebtn.setBackground(new java.awt.Color(255, 102, 102));
        savebtn.setForeground(new java.awt.Color(255, 255, 255));
        savebtn.setText("SAVE");
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3))
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(thresholdtxt)
                            .addComponent(VaccineTypeCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Vnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(229, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(savebtn)
                .addGap(74, 74, 74)
                .addComponent(updatebtn)
                .addGap(349, 349, 349))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VaccineTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Vnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(thresholdtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updatebtn)
                    .addComponent(savebtn))
                .addContainerGap(126, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed

        vdetails.setVaccineName(Vnametxt.getText());
         vdetails.setThresholdQty(Integer.parseInt(thresholdtxt.getText()));
         vdetails.setVaccineType(String.valueOf(VaccineTypeCombo.getSelectedItem()));
       
        JLabel mdLabel1 = new JLabel("Information Updated successfully");
       // mdLabel1.setFont(new Font("Arial", Font.BOLD, 30));

        JOptionPane.showMessageDialog(null, mdLabel1);
        
         Vnametxt.setEditable(false);
        thresholdtxt.setEditable(false);
        VaccineTypeCombo.setEditable(false);
        savebtn.setEnabled(false);
        updatebtn.setEnabled(true);

       
    }//GEN-LAST:event_savebtnActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed

         Vnametxt.setEditable(true);
        thresholdtxt.setEditable(true);
        VaccineTypeCombo.setEditable(true);
        savebtn.setEnabled(true);
        updatebtn.setEnabled(false);
// TODO add your handling code here:
    }//GEN-LAST:event_updatebtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox VaccineTypeCombo;
    private javax.swing.JTextField Vnametxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton savebtn;
    private javax.swing.JTextField thresholdtxt;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}
