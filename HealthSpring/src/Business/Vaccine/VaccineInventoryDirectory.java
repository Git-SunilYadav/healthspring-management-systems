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
public class VaccineInventoryDirectory {
    
     private ArrayList<VaccineInventory> vaccineStockList;

    public VaccineInventoryDirectory() {
        vaccineStockList =  new ArrayList();
    }

    public ArrayList<VaccineInventory> getVaccineStockList() {
        return vaccineStockList;
    }

    

    
      public VaccineInventory CreatevaccineStock( String Vaccine_name, String type, int threshold, int quantity){
        VaccineInventory Vcase = new VaccineInventory();
        Vcase.setVaccineName(Vaccine_name);
        Vcase.setVaccineType(type);
        Vcase.setThresholdQty(threshold);
        Vcase.setInvStock(quantity);
        vaccineStockList.add(Vcase);
        return Vcase;
        
       }
      
      

    
}
