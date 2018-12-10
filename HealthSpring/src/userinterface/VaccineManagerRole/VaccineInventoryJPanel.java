/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.VaccineManagerRole;

import Business.CrowdFundingWorkQueue.CFRCaseWorkRequest;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.VaccinationCentre.VaccineOrganization;
import Business.UserAccount.UserAccount;
import Business.Vaccine.VaccineInventory;
import Business.Vaccine.VaccineInventoryDirectory;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.statistics.BoxAndWhiskerXYDataset;
import userinterface.MakeADiffRole.RequestVaccineJPanel;

/**
 *
 * @author nikhi
 */
public class VaccineInventoryJPanel extends javax.swing.JPanel {

   private JPanel userProcessContainer;
    private Organization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem business;
    private VaccineInventoryDirectory VaccInvDir;
    private ButtonGroup bg1= new ButtonGroup();
    
    
    public VaccineInventoryJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization; //(VaccineInventoryOrganization)
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business = business;
        this.VaccInvDir = organization.getVaccineInvDir();
        populateRequestTable();
        groupbutton();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        VaccineInvStockJTable = new javax.swing.JTable();
        AddInvStockbtn = new javax.swing.JButton();
        StockGrapgbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        searchtxt1 = new javax.swing.JTextField();
        BthreshJCheckBox1 = new javax.swing.JCheckBox();
        AllVaccineJCheckBox2 = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        VaccineInvStockJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "VACCINE NAME", "VACCINE TYPE", "QUANTITY", "MIN THRESHOLD"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(VaccineInvStockJTable);

        AddInvStockbtn.setBackground(new java.awt.Color(255, 102, 102));
        AddInvStockbtn.setForeground(new java.awt.Color(255, 255, 255));
        AddInvStockbtn.setText("ADD INVENTORY STOCK");
        AddInvStockbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddInvStockbtnActionPerformed(evt);
            }
        });

        StockGrapgbtn.setBackground(new java.awt.Color(255, 102, 102));
        StockGrapgbtn.setForeground(new java.awt.Color(255, 255, 255));
        StockGrapgbtn.setText("VIEW STOCK GRAPH");
        StockGrapgbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StockGrapgbtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("INVENTORY DATA ANALYSIS");

        jRadioButton1.setForeground(new java.awt.Color(255, 102, 102));
        jRadioButton1.setText("SORTED BY VACCINE TYPE");

        jRadioButton2.setForeground(new java.awt.Color(255, 102, 102));
        jRadioButton2.setText("SORTED BY VACCINE NAME");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 102));
        jLabel2.setText("VACCINE : MANAGE INVENTORY");

        BthreshJCheckBox1.setForeground(new java.awt.Color(255, 102, 102));
        BthreshJCheckBox1.setText("BELOW THRESHOLD");
        BthreshJCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BthreshJCheckBox1MouseClicked(evt);
            }
        });

        AllVaccineJCheckBox2.setForeground(new java.awt.Color(255, 102, 102));
        AllVaccineJCheckBox2.setText("ALL VACCINES");
        AllVaccineJCheckBox2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AllVaccineJCheckBox2MouseClicked(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 102, 102));
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(AddInvStockbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(253, 253, 253)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BthreshJCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(AllVaccineJCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(searchtxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jRadioButton1)
                        .addGap(80, 80, 80)
                        .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(StockGrapgbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(247, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchtxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BthreshJCheckBox1)
                    .addComponent(AllVaccineJCheckBox2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AddInvStockbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton1))
                .addGap(57, 57, 57)
                .addComponent(StockGrapgbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(69, 69, 69))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AddInvStockbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddInvStockbtnActionPerformed
        int selectedRow = VaccineInvStockJTable.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        VaccineInventory request = (VaccineInventory)VaccineInvStockJTable.getValueAt(selectedRow, 0);
     
     
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("VaccineAddInventory", new VaccineAddInventory(userProcessContainer, request, userAccount, enterprise ,organization, business));
        layout.next(userProcessContainer);

    }//GEN-LAST:event_AddInvStockbtnActionPerformed
public void groupbutton(){
   // ButtonGroup bg1= new ButtonGroup();
    jRadioButton1.setActionCommand("jRadioButton1");
    bg1.add(jRadioButton1);
    
    jRadioButton2.setActionCommand("jRadioButton2");
    bg1.add(jRadioButton2);
    
    
    }

    
    private void StockGrapgbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StockGrapgbtnActionPerformed
        
        
        
          if (jRadioButton1.isSelected())
        {
		int a = 0;
                int b =0;
                int c=0; 
                int d=0;
                int e=0;
                int f=0;
                DefaultCategoryDataset dataset=new DefaultCategoryDataset();
  
         for (VaccineInventory vaccine : VaccInvDir.getVaccineStockList())
        {
     if (vaccine.getVaccineType().equals("Live-attenuated"))
	 {
	 a =a + vaccine.getInvStock();
	    
	 }
	 if (vaccine.getVaccineType().equals("Inactivated"))
	 {
	 b =b + vaccine.getInvStock();
	    
	 }

	 if (vaccine.getVaccineType().equals("Subunit"))
	 {
	 c =c + vaccine.getInvStock();
	    
	 }

	 if (vaccine.getVaccineType().equals("Toxoid"))
	 {
	 d =d + vaccine.getInvStock();
	    
	 }

	 if (vaccine.getVaccineType().equals("recombinant"))
	 {
	 e =e + vaccine.getInvStock();
	    
	 }
if (vaccine.getVaccineType().equals("conjugate"))
	 {
	 f =f + vaccine.getInvStock();
	    
	 }

        
        }
		dataset.setValue(a,"Quantity","Live-attenuated");
		dataset.setValue(b,"Quantity","Inactivated");
		dataset.setValue(c,"Quantity","Subunit");
		dataset.setValue(d,"Quantity","Toxoid");
		dataset.setValue(e,"Quantity","recombinant");
		dataset.setValue(f,"Quantity","conjugate");
		
        JFreeChart jchart= ChartFactory.createBarChart("Vaccines Inventory", "Vaccine Types", "Quantity", dataset, PlotOrientation.VERTICAL, true, true, false);
        CategoryPlot plot = jchart.getCategoryPlot();
        plot.setRangeGridlinePaint(Color.CYAN);
        ChartFrame chtfrm=new ChartFrame("Vaccines Inventory",jchart,true);
        chtfrm.setVisible(true);
        chtfrm.setSize(1000,800);
        
        }
		
	    
  
        if (jRadioButton2.isSelected())
        {
            DefaultCategoryDataset dataset=new DefaultCategoryDataset();
  
         for (VaccineInventory vaccine : VaccInvDir.getVaccineStockList())
        {
     
        dataset.setValue(vaccine.getInvStock(),"Quantity",vaccine.getVaccineName());
        
        }
        JFreeChart jchart= ChartFactory.createBarChart("Vaccines Inventory", "Vaccines", "Quantity", dataset, PlotOrientation.VERTICAL, true, true, false);
        CategoryPlot plot = jchart.getCategoryPlot();
        plot.setRangeGridlinePaint(Color.CYAN);
        ChartFrame chtfrm=new ChartFrame("Vaccines Inventory",jchart,true);
        chtfrm.setVisible(true);
        chtfrm.setSize(1000,800);
        
        }
    }//GEN-LAST:event_StockGrapgbtnActionPerformed

    private void BthreshJCheckBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BthreshJCheckBox1MouseClicked
            populateRequestTable();

    }//GEN-LAST:event_BthreshJCheckBox1MouseClicked

    private void AllVaccineJCheckBox2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AllVaccineJCheckBox2MouseClicked
              populateRequestTable();
    }//GEN-LAST:event_AllVaccineJCheckBox2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        VaccineMainJPanel cmwjp = (VaccineMainJPanel) component;
       // cmwjp.populateRequestTable();
        //cmwjp.populateRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) VaccineInvStockJTable.getModel();
         Object[] row = new Object[4];
           
        model.setRowCount(0);
        if (AllVaccineJCheckBox2.isSelected()){
             for (VaccineInventory vaccine : VaccInvDir.getVaccineStockList())
          {     
             
            //row[0] = request;
            row[0] = vaccine;
            row[1] = vaccine.getVaccineType();
            row[3] = vaccine.getThresholdQty();
            row[2] = vaccine.getInvStock();
            model.addRow(row);
        }
    }
            
        
        else 
        {
          for (VaccineInventory vaccine : VaccInvDir.getVaccineStockList())
          {     
              if (vaccine.getInvStock() < vaccine.getThresholdQty())
              {
            //row[0] = request;
            row[0] = vaccine;
            row[1] = vaccine.getVaccineType();
            row[3] = vaccine.getThresholdQty();
            row[2] = vaccine.getInvStock();
            model.addRow(row);
        }
    }
    }
      
        
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddInvStockbtn;
    private javax.swing.JCheckBox AllVaccineJCheckBox2;
    private javax.swing.JCheckBox BthreshJCheckBox1;
    private javax.swing.JButton StockGrapgbtn;
    private javax.swing.JTable VaccineInvStockJTable;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField searchtxt1;
    // End of variables declaration//GEN-END:variables
}
