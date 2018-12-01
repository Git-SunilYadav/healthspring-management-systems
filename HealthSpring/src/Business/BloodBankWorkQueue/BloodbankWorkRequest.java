/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BloodBankWorkQueue;

import Business.WorkQueue.WorkRequest;
import java.util.Date;

/**
 *
 * @author mihir
 */
public  class BloodbankWorkRequest extends WorkRequest {
    
    private String BloodGroup;
    private int  Volume;

    public String getBloodGroup() {
        return BloodGroup;
    }

    public void setBloodGroup(String BloodGroup) {
        this.BloodGroup = BloodGroup;
    }

    public int getVolume() {
        return Volume;
    }

    public void setVolume(int Volume) {
        this.Volume = Volume;
    }
     @Override
    public String toString() {
        return BloodGroup;
    }
  
    
   
    
}
