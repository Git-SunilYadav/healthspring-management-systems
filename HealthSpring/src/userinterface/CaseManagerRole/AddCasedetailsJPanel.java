/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CaseManagerRole;

import Business.CrowdFunding.CFRCaseDirectory;
import Business.CrowdFunding.CFRCaseSpecs;
import Business.CrowdFundingWorkQueue.CFRCaseWorkRequest;
import Business.CrowdFundingWorkQueue.CFRFinanceFellowWorkRequest;
import Business.Enterprise.Enterprise;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.Organization.SocialCrowdFunding.FinanceFellowOrganization;
import Business.Organization.SocialCrowdFunding.TerminalCasesOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Locale.Category;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.LabAssistantRole.LabAssistantWorkAreaJPanel;

/**
 *
 * @author nikhi
 */
public class AddCasedetailsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddCasedetailsJPanel
     */
    CFRCaseWorkRequest request;
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private CFRCaseDirectory cfrCaseDir;
  
    
    public AddCasedetailsJPanel(JPanel userProcessContainer, CFRCaseWorkRequest request, UserAccount account, Enterprise enterprise,CFRCaseDirectory cfrCaseDir) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.cfrCaseDir = cfrCaseDir;
        patienttxt.setText(request.getPatient());
        categorytxt.setText(request.getCategory());
        costtxt.setText(String.valueOf(request.getCost()));
        caseidtxt.setEditable(false);
       // caseidtxt.setText(String.valueOf(request.getCaseId()));
        //populateCategoryCombo();
    }

    /*
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
        
    }  */ 
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        submitbtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        caseidtxt = new javax.swing.JTextField();
        costtxt = new javax.swing.JTextField();
        acctxt = new javax.swing.JTextField();
        patienttxt = new javax.swing.JTextField();
        categorytxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        bnametxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        submitbtn.setBackground(new java.awt.Color(255, 102, 102));
        submitbtn.setText("CREATE CFR CASE & SEND REQUEST");
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("ADD CASE DETAILS");

        jLabel2.setForeground(new java.awt.Color(255, 102, 102));
        jLabel2.setText("PATIENT NAME");

        jLabel3.setForeground(new java.awt.Color(255, 102, 102));
        jLabel3.setText("CATEGORY");

        jLabel4.setForeground(new java.awt.Color(255, 102, 102));
        jLabel4.setText("COST OF TREATMENT");

        jLabel5.setForeground(new java.awt.Color(255, 102, 102));
        jLabel5.setText("BANK NAME");

        jLabel6.setForeground(new java.awt.Color(255, 102, 102));
        jLabel6.setText("BANK ACC NUMBER");

        jLabel7.setForeground(new java.awt.Color(255, 102, 102));
        jLabel7.setText("CASE ID");

        jLabel8.setForeground(new java.awt.Color(255, 102, 102));

        jLabel9.setForeground(new java.awt.Color(255, 102, 102));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(14, 14, 14))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(categorytxt, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                    .addComponent(patienttxt)
                                    .addComponent(costtxt))
                                .addGap(71, 71, 71)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addComponent(caseidtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6))
                                        .addGap(30, 30, 30)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(acctxt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(bnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                                .addComponent(submitbtn)
                                .addGap(190, 190, 190)))
                        .addGap(291, 291, 291))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(patienttxt, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(categorytxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(caseidtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(costtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(acctxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbtnActionPerformed
        //request.setCaseId(Integer.parseInt(caseidtxt.getText()));
                jLabel8.setText("");
         jLabel9.setText("");
        Boolean b=true;
      try{int i=Integer.parseInt(acctxt.getText());}
      catch(NumberFormatException e){jLabel9.setText("Enter a number");b=false;}
        if(acctxt.getText().trim().isEmpty()){
           jLabel9.setText(" field is empty");
         b=false;}
        if(bnametxt.getText().trim().isEmpty()){
           jLabel8.setText(" field is empty");
         b=false;}
        
       if(b){
        request.setAcc_num(Long.parseLong(acctxt.getText()));
        request.setB_name(bnametxt.getText());
        request.setCategory(categorytxt.getText());                                         //(categorytxt.getText());
        request.setCost(Integer.parseInt(costtxt.getText()));
        request.setPatient(patienttxt.getText());
        
        request.setStatus("CFR Case Created");
        
      // int caseid =  Integer.parseInt(caseidtxt.getText());
       String Patient_name = patienttxt.getText();
       String  category = categorytxt.getText();
       String bName = bnametxt.getText();
         int cost = Integer.parseInt(costtxt.getText());
         long acc_num = Long.parseLong(acctxt.getText());
      //  String message = messageJTextField.getText();
       // Added for saving details of cases in entity class
        CFRCaseSpecs cfrcase = cfrCaseDir.CreateCaseSpec( Patient_name,  category,  bName, cost,  acc_num);
        //populateTable(organization);
       caseidtxt.setText(String.valueOf(cfrcase.getCase_id()));
       request.setCaseId(Integer.parseInt(caseidtxt.getText()));
        
        CFRFinanceFellowWorkRequest request_sec = new CFRFinanceFellowWorkRequest();
        //request.setMessage(message);
        request_sec.setCaseId(request.getCaseId());
        request_sec.setAcc_num(request.getAcc_num());
         request_sec.setB_name(request.getB_name());
         request_sec.setCategory(request.getCategory());
         request_sec.setCost(request.getCost());
         request_sec.setPatient(request.getPatient());
         request_sec.setSender(userAccount);
         request_sec.setStatus("Awaiting for Finance Team");
        
        Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof FinanceFellowOrganization){
                org = organization;
                break;
            }
        }
        if (org!=null){
            org.getWorkQueue().getCFRFinFellowWorkRequestList().add(request_sec);
            userAccount.getWorkQueue().getCFRFinFellowWorkRequestList().add(request_sec);
            JOptionPane.showMessageDialog(null, "Case deatils has been updated successfully !!");
        }
       }
            }//GEN-LAST:event_submitbtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CaseManagerWorkAreaJPanel cmwjp = (CaseManagerWorkAreaJPanel) component;
        cmwjp.populateTable();
        cmwjp.populateRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField acctxt;
    private javax.swing.JTextField bnametxt;
    private javax.swing.JTextField caseidtxt;
    private javax.swing.JTextField categorytxt;
    private javax.swing.JTextField costtxt;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField patienttxt;
    private javax.swing.JButton submitbtn;
    // End of variables declaration//GEN-END:variables
}
