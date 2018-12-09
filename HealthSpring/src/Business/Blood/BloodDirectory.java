/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Blood;

import Business.Employee.Employee;
import java.util.ArrayList;

/**
 *
 * @author mihir
 */
public class BloodDirectory {
    
     private ArrayList<BloodSpecs> BloodList;
     private BloodGroup bloodgroup;
     public BloodDirectory() {
        BloodList = new ArrayList();
    }

    public ArrayList<BloodSpecs> getBloodList() {
        return BloodList;
    }
   
      public BloodSpecs CreateBloodSpec(String name, String BloodGroup, int Volume){
        BloodSpecs blood = new BloodSpecs();
        blood.setDonorName(name);
        blood.setBloodGroup(BloodGroup);
        blood.setVolume(Volume);
        BloodList.add(blood);
     
        return blood;
}

}