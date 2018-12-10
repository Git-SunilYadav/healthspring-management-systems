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
public class CFRPartnerBanksDirectory {
    
          private ArrayList<CFRPartnerBanks> partnerBankList;

    public CFRPartnerBanksDirectory() {
        partnerBankList =  new ArrayList();
    }

    public ArrayList<CFRPartnerBanks> getpartnerBankList() {
        return partnerBankList;
    }

    
    public CFRPartnerBanks CreatePartnerbank(String bankname, String branch, String accname, int ifsc, int accnum, String acc_status, String b_email){
        CFRPartnerBanks part_bank = new CFRPartnerBanks();
        part_bank.setBankname(bankname);
        part_bank.setBranchname(branch);
        part_bank.setAccount_name(accname);
        part_bank.setIfsc(ifsc);
        part_bank.setAcc_status(acc_status);
        part_bank.setAccount_num(accnum);
        part_bank.setBank_email(b_email);
        partnerBankList.add(part_bank);
        return part_bank;
       }

   /* public void removeFOrg (CFRPartnerBanks fRec)
    {
       fundRecList.remove(fRec);
    }
    */
    public CFRPartnerBanks searchFOrg(String Cname)
    {
            for (CFRPartnerBanks part_bank : partnerBankList)
    {
    if(part_bank.getBankname().equalsIgnoreCase(Cname)){
    return part_bank;
    }
    }
            return null;
    
    }

    
}
