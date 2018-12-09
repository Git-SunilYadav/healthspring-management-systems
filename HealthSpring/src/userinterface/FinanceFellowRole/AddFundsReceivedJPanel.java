/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.FinanceFellowRole;

import Business.CrowdFunding.CFRFundingOrgs;
import Business.CrowdFunding.CFRFundingOrgsDirectory;
import Business.CrowdFunding.CFRFundsReceivedDirectory;
import Business.CrowdFunding.CFRPartnerBanks;
import Business.CrowdFundingWorkQueue.CFRFinanceFellowWorkRequest;
import Business.CrowdFundingWorkQueue.CFRFundsReceivedWorkRequest;
import Business.EcoSystem;
//import Business.EmailNotify.EmailSender;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.SocialCrowdFunding.CFRStrategistOrganization;
import Business.Organization.SocialCrowdFunding.CampaignOrganization;
import Business.Organization.SocialCrowdFunding.FinanceFellowOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Date;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;

/**
 *
 * @author nikhi
 */
public class AddFundsReceivedJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddFundsReceivedJPanel
     */
    private JPanel userProcessContainer;
    //CFRFinanceFellowWorkRequest request;
    private CFRFinanceFellowWorkRequest request;
    //private ButtonGroup bg1= new ButtonGroup();
    //private EmailSender emailSender;
    private Enterprise enterprise;
    private EcoSystem business;
    private UserAccount userAccount;
    private CFRFundsReceivedDirectory orgDir;
    
    private FinanceFellowOrganization FinanceFellowOrganization;
    private Organization organ;
    private CFRStrategistOrganization cfrOrg;
   private Boolean b;
    
    public AddFundsReceivedJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, 
            EcoSystem business, CFRFinanceFellowWorkRequest request, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        this.business = business;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.FinanceFellowOrganization =(FinanceFellowOrganization) organization;
        this.organ = organization;
        this.orgDir =   FinanceFellowOrganization.getCfrFundsReceivedDir();
       // this.cfrOrg = (CFRStrategistOrganization)organization;
        this.b=true;
        populateOrgComboBox();
        populateCFRRecAccountCombo();
       // populateCategoryCombo();
        Patienttxt.setText(request.getPatient());
        caseidtxt.setText(String.valueOf(request.getCaseId()));
        accnumtxt.setText(String.valueOf(request.getAcc_num()));
        banktxt.setText(request.getB_name());
       // caseidtxt.setText(String.valueOf(request.getCaseId()));
        categorytxt.setText(request.getCategory());
        amounttxt.setText(String.valueOf(request.getCost()));
       
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel17 = new javax.swing.JLabel();
        submitJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Patienttxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        caseidtxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        categorytxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        amounttxt = new javax.swing.JTextField();
        fundingorgJCombo = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        forgidtxt = new javax.swing.JTextField();
        forgemailtxt = new javax.swing.JTextField();
        banktxt = new javax.swing.JTextField();
        accnumtxt = new javax.swing.JTextField();
        refnumlbl = new javax.swing.JLabel();
        refnumtxt = new javax.swing.JTextField();
        bckbtn = new javax.swing.JButton();
        forgnametxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cfr_rec_accountJCombo = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        jLabel17.setForeground(new java.awt.Color(255, 102, 102));
        jLabel17.setText("PATIENT");

        setBackground(new java.awt.Color(255, 255, 255));

        submitJButton.setBackground(new java.awt.Color(255, 102, 102));
        submitJButton.setForeground(new java.awt.Color(255, 255, 255));
        submitJButton.setText("ADD FUNDS");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("ADD RECEIVED FUND DETAILS");

        jLabel2.setForeground(new java.awt.Color(255, 102, 102));
        jLabel2.setText("PATIENT");

        Patienttxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatienttxtActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 102, 102));
        jLabel3.setText("SELECT FUNDING ORG");

        jLabel4.setForeground(new java.awt.Color(255, 102, 102));
        jLabel4.setText("CASE ID");

        caseidtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                caseidtxtKeyReleased(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 102, 102));
        jLabel5.setText("AMOUNT RECEIVED");

        jLabel6.setForeground(new java.awt.Color(255, 102, 102));
        jLabel6.setText("PATIENT BANK NAME");

        jLabel7.setForeground(new java.awt.Color(255, 102, 102));
        jLabel7.setText("CATEGORY");

        categorytxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                categorytxtKeyReleased(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(255, 102, 102));
        jLabel8.setText("FUNDING ORG ID");

        jLabel9.setForeground(new java.awt.Color(255, 102, 102));
        jLabel9.setText("PATIENT ACCOUNT NUMBER");

        amounttxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                amounttxtKeyReleased(evt);
            }
        });

        fundingorgJCombo.setForeground(new java.awt.Color(255, 102, 102));
        fundingorgJCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        fundingorgJCombo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fundingorgJComboMouseClicked(evt);
            }
        });
        fundingorgJCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fundingorgJComboActionPerformed(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(255, 102, 102));
        jLabel10.setText("FUNDING ORG EMAIL");

        forgidtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                forgidtxtKeyReleased(evt);
            }
        });

        forgemailtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                forgemailtxtKeyReleased(evt);
            }
        });

        banktxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                banktxtKeyReleased(evt);
            }
        });

        refnumlbl.setForeground(new java.awt.Color(255, 102, 102));
        refnumlbl.setText("REFERENCE NUMBER");

        refnumtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                refnumtxtKeyReleased(evt);
            }
        });

        bckbtn.setBackground(new java.awt.Color(255, 102, 102));
        bckbtn.setForeground(new java.awt.Color(255, 255, 255));
        bckbtn.setText("BACK");
        bckbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bckbtnActionPerformed(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(255, 102, 102));
        jLabel11.setText("CFR RECEIVING ACC NUM");

        cfr_rec_accountJCombo.setForeground(new java.awt.Color(255, 102, 102));

        jLabel12.setForeground(new java.awt.Color(255, 102, 102));

        jLabel13.setForeground(new java.awt.Color(255, 102, 102));

        jLabel14.setForeground(new java.awt.Color(255, 102, 102));

        jLabel15.setForeground(new java.awt.Color(255, 102, 102));

        jLabel16.setForeground(new java.awt.Color(255, 102, 102));

        jLabel18.setForeground(new java.awt.Color(255, 102, 102));

        jLabel19.setForeground(new java.awt.Color(255, 102, 102));

        jLabel20.setForeground(new java.awt.Color(255, 102, 102));

        jLabel21.setForeground(new java.awt.Color(255, 102, 102));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(caseidtxt)
                                        .addComponent(amounttxt)
                                        .addComponent(banktxt)
                                        .addComponent(Patienttxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(accnumtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(83, 83, 83)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel10)
                                    .addComponent(refnumlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cfr_rec_accountJCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(194, 194, 194)))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(forgemailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(fundingorgJCombo, javax.swing.GroupLayout.Alignment.LEADING, 0, 137, Short.MAX_VALUE)
                                .addComponent(forgnametxt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(forgidtxt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(categorytxt, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(refnumtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(bckbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(241, 241, 241)
                        .addComponent(submitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Patienttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categorytxt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caseidtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fundingorgJCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(forgnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(amounttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(forgidtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(forgemailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(banktxt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(refnumlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(refnumtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(accnumtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cfr_rec_accountJCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(201, 201, 201))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(submitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bckbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(104, 104, 104))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        jLabel20.setText("");
        jLabel18.setText("");
 
        jLabel21.setText("");
        jLabel15.setText("");   jLabel12.setText("");
        jLabel19.setText(""); jLabel14.setText("");
        jLabel13.setText("");
        if(Patienttxt.getText().trim().isEmpty()){jLabel13.setText("Above field is empty"); b=false;} 
         if(caseidtxt.getText().trim().isEmpty()){jLabel12.setText("Above field is empty"); b=false;}
        if(categorytxt.getText().trim().isEmpty()){jLabel19.setText("Above field is empty"); b=false;}
        if(banktxt.getText().trim().isEmpty()){jLabel15.setText("Above field is empty"); b=false;} 
        if(amounttxt.getText().trim().isEmpty()){jLabel14.setText("Above field is empty"); b=false;}
        if(forgidtxt.getText().trim().isEmpty()){jLabel21.setText("Above field is empty"); b=false;} 
        if(refnumtxt.getText().trim().isEmpty()){jLabel20.setText("Above field is empty"); b=false;} 
        if(forgemailtxt.getText().trim().isEmpty()){jLabel18.setText("Above field is empty"); b=false;}
        try{int x=Integer.parseInt(refnumtxt.getText());
         }
         catch(NumberFormatException e){
             jLabel20.setText("Enter valid number");
             b=false;
         }
        if(b){
        request.setFund_org_name(String.valueOf(fundingorgJCombo.getSelectedItem()));
        request.setStatus("Funding Received");
        request.setEmail(forgemailtxt.getText());
        request.setFund_org_id(Integer.parseInt(forgidtxt.getText()));
       // request.setFund_org_name(String.valueOf(fundingorgJCombo.getSelectedItem()));
        request.setFund_org_name(forgnametxt.getText());
        request.setCfr_rec_account(Long.parseLong(String.valueOf(cfr_rec_accountJCombo.getSelectedItem())));
        // cfr_rec_accountJCombo
      
         int caseid =  Integer.parseInt(caseidtxt.getText());
         String Patient = Patienttxt.getText();
         String  category = categorytxt.getText();
         String bname = banktxt.getText();
         int amt_rec = Integer.parseInt(amounttxt.getText());
         long acc = Long.parseLong(accnumtxt.getText());
         //String fundname = String.valueOf(fundingorgJCombo.getSelectedItem());
         String fundname = forgnametxt.getText();
         String email = forgemailtxt.getText();
         int ref = Integer.parseInt(refnumtxt.getText());
         int fundid = Integer.parseInt(forgidtxt.getText());
         long cfr_rec_account = Long.parseLong(String.valueOf(cfr_rec_accountJCombo.getSelectedItem()));
    
         
        // Added for saving details of cases in entity class
        orgDir.CreateFundReceived(fundname, category, email, fundid, ref, caseid, Patient, acc, bname, amt_rec, cfr_rec_account);
        //populateTable(organization);
       
        
        CFRFundsReceivedWorkRequest request_sec = new CFRFundsReceivedWorkRequest();
        //request.setMessage(message);
        request_sec.setCaseId(request.getCaseId());
        request_sec.setAcc_num(request.getAcc_num());
         request_sec.setB_name(request.getB_name());
         request_sec.setCategory(request.getCategory());
         request_sec.setCost(request.getCost());
         request_sec.setPatient(request.getPatient());
         request_sec.setSender(userAccount);
         request_sec.setFund_org_id(fundid);
         request_sec.setFund_org_name(fundname);
         request_sec.setRefnum(ref);
         request_sec.setEmail(email);
         request_sec.setCfr_acc_num(cfr_rec_account);
         
         request_sec.setStatus("Awaiting Campaigner");
        
        Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof CampaignOrganization){ //FinanceFellowOrganization
                org = organization;
                break;
            }
        }
        if (org!=null){
            org.getWorkQueue().getCFRFundsReceivedWorkRequestList().add(request_sec);
            userAccount.getWorkQueue().getCFRFundsReceivedWorkRequestList().add(request_sec);
        }
     
      
        }
    }//GEN-LAST:event_submitJButtonActionPerformed

    public void populateOrgComboBox(){
        fundingorgJCombo.removeAllItems();
        //FinanceFellowOrganization
        
        Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof CFRStrategistOrganization){
                org = organization;
                break;
            }
        }
        if (org!=null){
            
        for (CFRFundingOrgs fundingOrg : org.getCfrFundingDir().getFundOrgList()){
            if (fundingOrg.getCategory().equalsIgnoreCase(request.getCategory()))
            {
            fundingorgJCombo.addItem(fundingOrg);
        }
        }
    }
    }
    
    
              public void populateCFRRecAccountCombo(){
        cfr_rec_accountJCombo.removeAllItems();
        //FinanceFellowOrganization
        //for ( CFRPartnerBanks banks : cfrPartnerBanksDir.getpartnerBankList()){
        
        Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof CampaignOrganization){
                org = organization;
                break;
            }
        }
        if (org!=null){
            
        for (CFRPartnerBanks banks : org.getCfrPartnerBanksDir().getpartnerBankList()){
             
            cfr_rec_accountJCombo.addItem(banks.getAccount_num());
        
        }
    }
    }
  
    private void fundingorgJComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fundingorgJComboActionPerformed
       
        Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof CFRStrategistOrganization){
                org = organization;
                break;
            }
        }
        if (org!=null){
        
       for (CFRFundingOrgs fundingOrg : org.getCfrFundingDir().getFundOrgList()){
            if (fundingOrg == (CFRFundingOrgs)fundingorgJCombo.getSelectedItem())
            {
            forgidtxt.setText(String.valueOf(fundingOrg.getFund_org_id()));
            forgemailtxt.setText(fundingOrg.getEmail());
        }
        }
        }
     
    }//GEN-LAST:event_fundingorgJComboActionPerformed

    private void PatienttxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatienttxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PatienttxtActionPerformed

    private void bckbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bckbtnActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        FinanceFellowWorkAreaJPanel cmwjp = (FinanceFellowWorkAreaJPanel) component;
        cmwjp.populateTable();
        cmwjp.populateDisburseTable();
        //cmwjp.populateRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_bckbtnActionPerformed

    private void fundingorgJComboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fundingorgJComboMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_fundingorgJComboMouseClicked

    private void caseidtxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caseidtxtKeyReleased
         // TODO add your handling code here:
    }//GEN-LAST:event_caseidtxtKeyReleased

    private void amounttxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amounttxtKeyReleased
         // TODO add your handling code here:
    }//GEN-LAST:event_amounttxtKeyReleased

    private void banktxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_banktxtKeyReleased
    // TODO add your handling code here:
    }//GEN-LAST:event_banktxtKeyReleased

    private void categorytxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_categorytxtKeyReleased
      // TODO add your handling code here:
    }//GEN-LAST:event_categorytxtKeyReleased

    private void forgidtxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_forgidtxtKeyReleased
       // TODO add your handling code here:
    }//GEN-LAST:event_forgidtxtKeyReleased

    private void forgemailtxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_forgemailtxtKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_forgemailtxtKeyReleased

    private void refnumtxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_refnumtxtKeyReleased
         // TODO add your handling code here:
    }//GEN-LAST:event_refnumtxtKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Patienttxt;
    private javax.swing.JTextField accnumtxt;
    private javax.swing.JTextField amounttxt;
    private javax.swing.JTextField banktxt;
    private javax.swing.JButton bckbtn;
    private javax.swing.JTextField caseidtxt;
    private javax.swing.JTextField categorytxt;
    private javax.swing.JComboBox cfr_rec_accountJCombo;
    private javax.swing.JTextField forgemailtxt;
    private javax.swing.JTextField forgidtxt;
    private javax.swing.JTextField forgnametxt;
    private javax.swing.JComboBox fundingorgJCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel refnumlbl;
    private javax.swing.JTextField refnumtxt;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}
