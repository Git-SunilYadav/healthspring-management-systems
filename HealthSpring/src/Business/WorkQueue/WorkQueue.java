/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.CrowdFundingWorkQueue.CFRCaseWorkRequest;
import Business.CrowdFundingWorkQueue.CFRFinanceFellowWorkRequest;
import Business.CrowdFundingWorkQueue.CFRFundsReceivedWorkRequest;
import Business.VaccineWorkQueue.VaccineWorkRequest;
import java.util.ArrayList;

public class WorkQueue {
    
    private ArrayList<WorkRequest> workRequestList;
    private ArrayList<CFRCaseWorkRequest> CFRCaseWorkRequestList;
    private ArrayList<CFRFinanceFellowWorkRequest> CFRFinFellowWorkRequestList;
    private ArrayList<CFRFundsReceivedWorkRequest> CFRFundsReceivedWorkRequestList;
     private ArrayList<VaccineWorkRequest> VaccineWorkRequestList;
            
    
    public WorkQueue() {
        workRequestList = new ArrayList();
        CFRCaseWorkRequestList = new ArrayList();
        CFRFinFellowWorkRequestList = new ArrayList();
        CFRFundsReceivedWorkRequestList = new ArrayList();
        VaccineWorkRequestList = new ArrayList();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
        
    }

    public ArrayList<CFRCaseWorkRequest> getCFRCaseWorkRequestList() {
        return CFRCaseWorkRequestList;
    }

    public ArrayList<CFRFinanceFellowWorkRequest> getCFRFinFellowWorkRequestList() {
        return CFRFinFellowWorkRequestList;
    }

    public ArrayList<CFRFundsReceivedWorkRequest> getCFRFundsReceivedWorkRequestList() {
        return CFRFundsReceivedWorkRequestList;
    }

    public ArrayList<VaccineWorkRequest> getVaccineWorkRequestList() {
        return VaccineWorkRequestList;
    }
    
    
    
    
}