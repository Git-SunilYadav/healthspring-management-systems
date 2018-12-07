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
public class CFRCaseSpecs {
    
    private String Patient_name, Category, bName ;
    private int cost;
    private long acc_num;
    private static int count = 1;
    private int case_id;
    private Date creation_date;

    public CFRCaseSpecs() {
        count++;
        case_id = count;
        
    }

    public Date getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(Date creation_date) {
        this.creation_date = creation_date;
    }

    
    
    public int getCase_id() {
        return case_id;
    }
    
    

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
    
     @Override
    public String toString() {
        return String.valueOf(case_id);
    }
    
    
    
}
