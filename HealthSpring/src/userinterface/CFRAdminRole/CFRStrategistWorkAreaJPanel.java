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
import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
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
        jLabel2 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        viewbtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        searchtxt = new javax.swing.JTextField();
        searchbtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        fundingOrgJTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ADD FUNDING ORGS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("FUNDING ORGANIZATION MANAGEMENT");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 102));
        jLabel2.setText("GENERATE REPORTS FOR DATA ANALYSIS");

        jCheckBox1.setForeground(new java.awt.Color(255, 102, 102));
        jCheckBox1.setText("CATEGORY");

        jCheckBox2.setForeground(new java.awt.Color(255, 102, 102));
        jCheckBox2.setText("FUNDING ORGANIZATION");

        jCheckBox3.setForeground(new java.awt.Color(255, 102, 102));
        jCheckBox3.setText("RESEARCH & DEVELOPMENT");

        jCheckBox4.setForeground(new java.awt.Color(255, 102, 102));
        jCheckBox4.setText("MONTHLY REPORT");

        jButton2.setBackground(new java.awt.Color(255, 102, 102));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("GENERATE EXCEL REPORT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        viewbtn.setBackground(new java.awt.Color(255, 102, 102));
        viewbtn.setForeground(new java.awt.Color(255, 255, 255));
        viewbtn.setText("VIEW");
        viewbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbtnActionPerformed(evt);
            }
        });

        deletebtn.setBackground(new java.awt.Color(255, 102, 102));
        deletebtn.setForeground(new java.awt.Color(255, 255, 255));
        deletebtn.setText("DELETE");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 102, 102));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("SEND MONTHLY REPORT");

        searchbtn.setText("SEARCH");
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });

        fundingOrgJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "FUNDING ORG ID", "NAME", "CATEGORY", "EMAIL"
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
        jScrollPane2.setViewportView(fundingOrgJTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox1)
                            .addComponent(jCheckBox3))
                        .addGap(219, 219, 219)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox4)
                            .addComponent(jCheckBox2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton1)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(searchtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(searchbtn)
                                    .addGap(269, 269, 269)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(viewbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                            .addComponent(deletebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(200, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(deletebtn)
                        .addGap(18, 18, 18)
                        .addComponent(viewbtn)
                        .addGap(165, 165, 165))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchbtn))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox4))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton5))
                .addContainerGap(119, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    public void populateRequestTable(){
  
    
DefaultTableModel model = (DefaultTableModel) fundingOrgJTable.getModel();

       model.setRowCount(0);

       for (CFRFundingOrgs fundingOrg : organization.getCfrFundingDir().getFundOrgList()){
           Object[] row = new Object[4];
           row[0] = fundingOrg.getFund_org_id();
           row[1] = fundingOrg;
           row[2] = fundingOrg.getCategory();
           row[3] = fundingOrg.getEmail();
           model.addRow(row);
       }
       
}
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        
    }//GEN-LAST:event_jButton2ActionPerformed

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

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
    CFRFundingOrgs result =  orgDir.searchFOrg(searchtxt.getText());
        if (result == null)
        {
            JLabel mdLabel1 = new JLabel("Funding Org does not exist");
            mdLabel1.setFont(new Font("Arial", Font.BOLD, 30));
            JOptionPane.showMessageDialog(null, mdLabel1);
        }
        else
        {
            CFRStratViewFundOrgJPanel vp = new CFRStratViewFundOrgJPanel(userProcessContainer,result);
            userProcessContainer.add(vp);
            CardLayout layout = (CardLayout)userProcessContainer.getLayout();
            layout.next(userProcessContainer);

        }

    }//GEN-LAST:event_searchbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deletebtn;
    private javax.swing.JTable fundingOrgJTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton searchbtn;
    private javax.swing.JTextField searchtxt;
    private javax.swing.JButton viewbtn;
    // End of variables declaration//GEN-END:variables
}
