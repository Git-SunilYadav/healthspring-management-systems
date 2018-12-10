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
public class CFRCaseDirectory {
    
    private ArrayList<CFRCaseSpecs> caseList;

    public CFRCaseDirectory() {
        caseList =  new ArrayList();
    }

    public ArrayList<CFRCaseSpecs> getCaseList() {
        return caseList;
    }
    
    
      public CFRCaseSpecs CreateCaseSpec( String Patient_name, String Category, String bName, int cost, long acc_num){
        CFRCaseSpecs Cfrcase = new CFRCaseSpecs();
        Cfrcase.setPatient_name(Patient_name);
        Cfrcase.setCategory(Category);
        Cfrcase.setbName(bName);
        Cfrcase.setCost(cost);
        Cfrcase.setAcc_num(acc_num);
        caseList.add(Cfrcase);
        return Cfrcase;
        
       }

    
    
    
}

