/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.CrowdFunding;

/**
 *
 * @author nikhi
 */
public class CFRFundingOrgs {

     private String fund_org_name, Category, email ;
   // private int cost;
    private long mb_num;
    private static int count = 1;
    private int fund_org_id;

    public CFRFundingOrgs() {
        count++;
        fund_org_id = count;
                
    }

    public int getFund_org_id() {
        return fund_org_id;
    }

    public void setFund_org_id(int fund_org_id) {
        this.fund_org_id = fund_org_id;
    }
    
    

    public String getFund_org_name() {
        return fund_org_name;
    }

    public void setFund_org_name(String fund_org_name) {
        this.fund_org_name = fund_org_name;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
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
    
     @Override
    public String toString() {
        return fund_org_name;
    }
    
}