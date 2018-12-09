/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.CrowdFundingWorkQueue;

import Business.WorkQueue.WorkRequest;

/**
 *
 * @author nikhi
 */
public class CFRCaseWorkRequest extends WorkRequest {
    
   // private int count=0;
    private int caseId ;
    private String patient;
    private String category;
    private String b_name;
    private int cost;
    private long acc_num;
    
    
    public CFRCaseWorkRequest() {
    
    }

    public int getCaseId() {
        return caseId;
    }

    public void setCaseId(int caseId) {
        this.caseId = caseId;
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

    public long getAcc_num() {
        return acc_num;
    }

    public void setAcc_num(long acc_num) {
        this.acc_num = acc_num;
    }

        @Override
    public String toString() {
        return patient;
    }
 
    
}
