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
public class CFRPartnerBanks {

    private String bankname ;
    private String branchname; 
    private String acc_status;
    private int account_num;
    private int ifsc;
    private String account_name;
    private String bank_email;
    
    
    public CFRPartnerBanks() {
        
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public String getBranchname() {
        return branchname;
    }

    public void setBranchname(String branchname) {
        this.branchname = branchname;
    }

    public String getAcc_status() {
        return acc_status;
    }

    public void setAcc_status(String acc_status) {
        this.acc_status = acc_status;
    }

    public int getAccount_num() {
        return account_num;
    }

    public String getBank_email() {
        return bank_email;
    }

    public void setBank_email(String bank_email) {
        this.bank_email = bank_email;
    }

    
    public void setAccount_num(int account_num) {
        this.account_num = account_num;
    }

    public int getIfsc() {
        return ifsc;
    }

    public void setIfsc(int ifsc) {
        this.ifsc = ifsc;
    }

    public String getAccount_name() {
        return account_name;
    }

    public void setAccount_name(String account_name) {
        this.account_name = account_name;
    }
    
     @Override
    public String toString() {
        return bankname;
    }
    
    
}
