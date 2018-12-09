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
public class CFRFundsReceivedDirectory {
 
      private ArrayList<CFRFundsReceived> fundRecList;

    public CFRFundsReceivedDirectory() {
        fundRecList =  new ArrayList();
    }

    public ArrayList<CFRFundsReceived> getFundRecList() {
        return fundRecList;
    }

    
    public CFRFundsReceived CreateFundReceived(String fund_org_name, String Category,
            String email, int fundID, int RefNum, int caseID, String patient, long acc_num, String bname, int amt_rec, long cfr_rec_account
    ){
        CFRFundsReceived fundRec = new CFRFundsReceived();
        fundRec.setFund_org_name(fund_org_name);
        fundRec.setEmail(email);
        fundRec.setCategory(Category);
        //fundRec.setMb_num(mb_num);
        fundRec.setFund_org_id(fundID);
        fundRec.setRefnum(RefNum);
        fundRec.setCase_id(caseID);
        fundRec.setPatient_name(patient);
        fundRec.setAcc_num(acc_num);
        fundRec.setbName(bname);
        fundRec.setCost(amt_rec);
        fundRec.setCfr_rec_account(cfr_rec_account);
        
        fundRecList.add(fundRec);
        return fundRec;
       }

    public void removeFOrg (CFRFundsReceived fRec)
    {
       fundRecList.remove(fRec);
    }
    
    public CFRFundsReceived searchFOrg(String Cname)
    {
            for (CFRFundsReceived forg : fundRecList)
    {
    if(forg.getFund_org_name().equalsIgnoreCase(Cname)){
    return forg;
    }
    }
            return null;
    
    }
    
    
}
