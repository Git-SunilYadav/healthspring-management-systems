/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CFRAdminRole;

import Business.CrowdFunding.CFRFundingOrgs;
import Business.CrowdFunding.CFRFundingOrgsDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.SocialCrowdFunding.CFRStrategistOrganization;
import Business.UserAccount.UserAccount;
//import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import java.awt.CardLayout;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nikhi
 */
public class CFRStrategistWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CFRStrategistWorkAreaJPanel
     */
     private JPanel userProcessContainer;
    private Enterprise enterprise;
    private CFRStrategistOrganization organization;
    private EcoSystem business;
    //private Organization;
    private CFRFundingOrgsDirectory orgDir;
    private static final String FILE_PATH = "N:/AED FInal Project/testFile.xlsx";
    /** Creates new form AdminWorkAreaJPanel */
    public CFRStrategistWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise, Organization organization, EcoSystem business) {
       
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.organization = (CFRStrategistOrganization)organization;
        this.orgDir = this.organization.getCfrFundingDir();
        this.business = business;
       // valueLabel.setText(enterprise.getName());
        populateRequestTable();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        viewbtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        searchtxt = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        fundingOrgJTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ADD FUNDING ORG");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, 147, 32));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FUNDING ORGANIZATION MANAGEMENT");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 23, 259, 23));

        viewbtn.setBackground(new java.awt.Color(255, 102, 102));
        viewbtn.setForeground(new java.awt.Color(255, 255, 255));
        viewbtn.setText("VIEW");
        viewbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbtnActionPerformed(evt);
            }
        });
        add(viewbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 193, 100, 30));

        deletebtn.setBackground(new java.awt.Color(255, 102, 102));
        deletebtn.setForeground(new java.awt.Color(255, 255, 255));
        deletebtn.setText("DELETE");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });
        add(deletebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(682, 148, 100, 30));

        searchtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchtxtActionPerformed(evt);
            }
        });
        searchtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchtxtKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchtxtKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchtxtKeyTyped(evt);
            }
        });
        add(searchtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 96, 143, 29));

        fundingOrgJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "FUNDING ORG ID", "NAME", "CATEGORY", "EMAIL", "CONTACT NUM"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(fundingOrgJTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 136, 614, 120));

        jLabel3.setForeground(new java.awt.Color(255, 102, 102));
        jLabel3.setText("SEARCH BY NAME");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 96, 153, 29));
    }// </editor-fold>//GEN-END:initComponents
    public void populateRequestTable(){
  
    
DefaultTableModel model = (DefaultTableModel) fundingOrgJTable.getModel();

       model.setRowCount(0);

       for (CFRFundingOrgs fundingOrg : organization.getCfrFundingDir().getFundOrgList()){
           Object[] row = new Object[5];
           row[0] = fundingOrg.getFund_org_id();
           row[1] = fundingOrg;
           row[2] = fundingOrg.getCategory();
           row[3] = fundingOrg.getEmail();
           row[4] =  fundingOrg.getMb_num();
           model.addRow(row);
       }
       
}
    
    /*public static void writeStudentsListToExcel(List<Student> studentList){

        // Using XSSF for xlsx format, for xls use HSSF
        Workbook workbook = new XSSFWorkbook();

        Sheet studentsSheet = workbook.createSheet("Students");

        int rowIndex = 0;
        for(Student student : studentList){
            Row row = studentsSheet.createRow(rowIndex++);
            int cellIndex = 0;
            //first place in row is name
            row.createCell(cellIndex++).setCellValue(student.getName());

            //second place in row is marks in maths
            row.createCell(cellIndex++).setCellValue(student.getMaths());

            //third place in row is marks in Science
            row.createCell(cellIndex++).setCellValue(student.getScience());

            //fourth place in row is marks in English
            row.createCell(cellIndex++).setCellValue(student.getEnglish());

        }

        //write this workbook in excel file.
        try {
            FileOutputStream fos = new FileOutputStream(FILE_PATH);
            workbook.write(fos);
            fos.close();

            System.out.println(FILE_PATH + " is successfully written");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    
} 
*/
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

       CFRStratAddFundOrgJPanel StratAddFundOrgJPanel = new CFRStratAddFundOrgJPanel(userProcessContainer, enterprise, organization, orgDir);
        userProcessContainer.add("CFRStratAddFundOrgJPanel", StratAddFundOrgJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
       //createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
         

    }//GEN-LAST:event_jButton1ActionPerformed

    private void viewbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = fundingOrgJTable.getSelectedRow();
        if(selectedRow<0)
        {
            JLabel mdLabel1 = new JLabel("Please select a row");
            mdLabel1.setFont(new Font("Arial", Font.BOLD, 30));
            JOptionPane.showMessageDialog(null, mdLabel1);
        }
        else {
             CFRFundingOrgs fundOrgs = (CFRFundingOrgs)fundingOrgJTable.getValueAt(selectedRow,1);
             CFRStratViewFundOrgJPanel viewFundOrgJPanel = new CFRStratViewFundOrgJPanel(userProcessContainer, fundOrgs);
      
            userProcessContainer.add(viewFundOrgJPanel);
            CardLayout layout = (CardLayout)userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }

    }//GEN-LAST:event_viewbtnActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed

    int selectedRow = fundingOrgJTable.getSelectedRow();
        if(selectedRow>=0){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete??","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
                CFRFundingOrgs fundOrgs = (CFRFundingOrgs)fundingOrgJTable.getValueAt(selectedRow,1);
                orgDir.removeFOrg(fundOrgs);
                populateRequestTable();
            }}
            else{
                JLabel mdLabel1 = new JLabel("Please select a row");
                mdLabel1.setFont(new Font("Arial", Font.BOLD, 30));
                JOptionPane.showMessageDialog(null, mdLabel1);
            }
        
    }//GEN-LAST:event_deletebtnActionPerformed

    private void searchtxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchtxtKeyPressed
/*
           String searchtx = searchtxt.getText();
           
           
            DefaultTableModel model = (DefaultTableModel) fundingOrgJTable.getModel();

       model.setRowCount(0);

       for (CFRFundingOrgs fundingOrg : organization.getCfrFundingDir().getFundOrgList()){
           if (fundingOrg.getFund_org_name().contains(searchtx))
           {
           Object[] row = new Object[4];
           row[0] = fundingOrg.getFund_org_id();
           row[1] = fundingOrg;
           row[2] = fundingOrg.getCategory();
           row[3] = fundingOrg.getEmail();
           model.addRow(row);
       }
       }
*/
    }//GEN-LAST:event_searchtxtKeyPressed

    private void searchtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchtxtActionPerformed

    private void searchtxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchtxtKeyTyped
        // TODO add your handling code here:
        
        /*  String searchtx = searchtxt.getText();
           
           
            DefaultTableModel model = (DefaultTableModel) fundingOrgJTable.getModel();

       model.setRowCount(0);

       for (CFRFundingOrgs fundingOrg : organization.getCfrFundingDir().getFundOrgList()){
           if (fundingOrg.getFund_org_name().contains(searchtx))
           {
           Object[] row = new Object[4];
           row[0] = fundingOrg.getFund_org_id();
           row[1] = fundingOrg;
           row[2] = fundingOrg.getCategory();
           row[3] = fundingOrg.getEmail();
           model.addRow(row);
       }
       }*/
    }//GEN-LAST:event_searchtxtKeyTyped

    private void searchtxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchtxtKeyReleased

          String searchtx = searchtxt.getText();
           
           
            DefaultTableModel model = (DefaultTableModel) fundingOrgJTable.getModel();

       model.setRowCount(0);

       for (CFRFundingOrgs fundingOrg : organization.getCfrFundingDir().getFundOrgList()){
           if (fundingOrg.getFund_org_name().contains(searchtx))
           {
           Object[] row = new Object[5];
           row[0] = fundingOrg.getFund_org_id();
           row[1] = fundingOrg;
           row[2] = fundingOrg.getCategory();
           row[3] = fundingOrg.getEmail();
               row[4] =  fundingOrg.getMb_num();
       
           model.addRow(row);
       }
       }        // TODO add your handling code here:
    }//GEN-LAST:event_searchtxtKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deletebtn;
    private javax.swing.JTable fundingOrgJTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField searchtxt;
    private javax.swing.JButton viewbtn;
    // End of variables declaration//GEN-END:variables
}
