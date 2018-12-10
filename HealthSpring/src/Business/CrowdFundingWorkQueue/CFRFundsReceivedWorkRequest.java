/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.CrowdFundingWorkQueue;

import Business.WorkQueue.WorkRequest;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author nikhi
 */
public class CFRFundsReceivedWorkRequest extends WorkRequest{
    
    private int caseId ;
    private String patient;
    private String category;
    private String b_name;
    private int cost;
    private long acc_num;
    private Date creation_date;
    
    private String fund_org_name;
    private String email;
    private int fund_org_id;
    private int refnum;
    
    private String partner_bank;
    private String bank_email;
    private long cfr_acc_num; 
    private int ifsc;
    private String cfr_AccHolder_Name;
    
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    Date date = new Date();

    

    public CFRFundsReceivedWorkRequest() {
        this.creation_date = date;
    }

    public int getCaseId() {
        return caseId;
    }

    public void setCaseId(int caseId) {
        this.caseId = caseId;
    }

    public int getRefnum() {
        return refnum;
    }

    public void setRefnum(int refnum) {
        this.refnum = refnum;
    }

    public String getPartner_bank() {
        return partner_bank;
    }

    public String getCfr_AccHolder_Name() {
        return cfr_AccHolder_Name;
    }

    public void setCfr_AccHolder_Name(String cfr_AccHolder_Name) {
        this.cfr_AccHolder_Name = cfr_AccHolder_Name;
    }

    
    public void setPartner_bank(String partner_bank) {
        this.partner_bank = partner_bank;
    }

    public long getCfr_acc_num() {
        return cfr_acc_num;
    }

    public void setCfr_acc_num(long cfr_acc_num) {
        this.cfr_acc_num = cfr_acc_num;
    }

    public String getBank_email() {
        return bank_email;
    }

    public void setBank_email(String bank_email) {
        this.bank_email = bank_email;
    }

    
    public int getIfsc() {
        return ifsc;
    }

    public void setIfsc(int ifsc) {
        this.ifsc = ifsc;
    }

    
    
    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getB_name() {
        return b_name;
    }

    public void setB_name(String b_name) {
        this.b_name = b_name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Date getCreation_date() {
        return creation_date;
    }

    
    
    public long getAcc_num() {
        return acc_num;
    }

    public void setAcc_num(long acc_num) {
        this.acc_num = acc_num;
    }

    public String getFund_org_name() {
        return fund_org_name;
    }

    public void setFund_org_name(String fund_org_name) {
        this.fund_org_name = fund_org_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getFund_org_id() {
        return fund_org_id;
    }

    public void setFund_org_id(int fund_org_id) {
        this.fund_org_id = fund_org_id;
    }
    
      @Override
    public String toString() {
        return String.valueOf(refnum);
    }
    
}
