/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Vaccine;

import java.util.ArrayList;

/**
 *
 * @author nikhi
 */
public class VaccineDetailsDirectory {
    
      private ArrayList<VaccineDetails> vaccinerequestList;

    public VaccineDetailsDirectory() {
        vaccinerequestList =  new ArrayList();
    }

    public ArrayList<VaccineDetails> getVaccinerequestList() {
        return vaccinerequestList;
    }

    public void removeFOrg (VaccineDetails forg)
    {
       vaccinerequestList.remove(forg);
    }
    
      public VaccineDetails CreateVaccineSpec( String Vaccine_name, String type,int thresQty, int quantity){
        VaccineDetails Vcase = new VaccineDetails();
        Vcase.setVaccineName(Vaccine_name);
        Vcase.setVaccineType(type);
        Vcase.setThresholdQty(thresQty);
        Vcase.setQty(quantity);
        vaccinerequestList.add(Vcase);
        return Vcase;
        
       }

    
  
    
}
