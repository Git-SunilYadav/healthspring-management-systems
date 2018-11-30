/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BloodBankWorkQueue;

import Business.WorkQueue.WorkRequest;
import java.util.ArrayList;

/**
 *
 * @author mihir
 */
public class BBWorkQueue {
    
     
    private ArrayList<BloodbankWorkRequest> bbworkQ;

    public BBWorkQueue() {
        bbworkQ = new ArrayList();
    }

    public ArrayList<BloodbankWorkRequest> getWorkRequestList() {
        return bbworkQ;
    }
    
}
