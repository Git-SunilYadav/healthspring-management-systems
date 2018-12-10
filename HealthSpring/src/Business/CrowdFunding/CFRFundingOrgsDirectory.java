/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.CrowdFunding;

import java.util.ArrayList;

/**
 *
 * @author nikhi
 */
public class CFRFundingOrgsDirectory {

      private ArrayList<CFRFundingOrgs> fundOrgList;

    public CFRFundingOrgsDirectory() {
        fundOrgList =  new ArrayList();
    }

    public ArrayList<CFRFundingOrgs> getFundOrgList() {
        return fundOrgList;
    }
    
    public CFRFundingOrgs CreateFundingOrg(String fund_org_name, String Category, String email, long mb_num){
        CFRFundingOrgs fundingOrg = new CFRFundingOrgs();
        fundingOrg.setFund_org_name(fund_org_name);
        fundingOrg.setEmail(email);
        fundingOrg.setCategory(Category);
        fundingOrg.setMb_num(mb_num);
        fundingOrg.setFund_org_id(fundingOrg.getFund_org_id());
        fundOrgList.add(fundingOrg);
        return fundingOrg;
       }

    public void removeFOrg (CFRFundingOrgs forg)
    {
       fundOrgList.remove(forg);
    }
    
    public CFRFundingOrgs searchFOrg(String Cname)
    {
            for (CFRFundingOrgs forg : fundOrgList)
    {
    if(forg.getFund_org_name().equalsIgnoreCase(Cname)){
    return forg;
    }
    }
            return null;
    
    }
    
    
}

