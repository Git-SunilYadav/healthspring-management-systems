/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.CrowdFunding;

import java.util.Date;

/**
 *
 * @author nikhi
 */
public class CFRFundsReceived {
 
    private String Patient_name, Category, bName ;
    private int cost;
    private long acc_num;
    private int case_id;
    private Date creation_date;
    private String fund_org_name, email ;
    private long mb_num;
    private int fund_org_id;

    public String getPatient_name() {
        return Patient_name;
    }

    public void setPatient_name(String Patient_name) {
        this.Patient_name = Patient_name;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public long getAcc_num() {
        return acc_num;
    }

    public void setAcc_num(long acc_num) {
        this.acc_num = acc_num;
    }

    public int getCase_id() {
        return case_id;
    }

    public void setCase_id(int case_id) {
        this.case_id = case_id;
    }

    public Date getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(Date creation_date) {
        this.creation_date = creation_date;
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

    public long getMb_num() {
        return mb_num;
    }

    public void setMb_num(long mb_num) {
        this.mb_num = mb_num;
    }

    public int getFund_org_id() {
        return fund_org_id;
    }

    public void setFund_org_id(int fund_org_id) {
        this.fund_org_id = fund_org_id;
    }

    

    
}
