/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Vaccine;

/**
 *
 * @author nikhi
 */
public class VaccineInventory {
 
 
    private String VaccineName;
    private String VaccineType;
     private static int count = 1;
     private int thresholdQty;
    private int InvStock;

    public VaccineInventory() {
        this.InvStock =count;
        
    }

    
    
    public String getVaccineName() {
        return VaccineName;
    }

    public void setVaccineName(String VaccineName) {
        this.VaccineName = VaccineName;
    }

    public int getThresholdQty() {
        return thresholdQty;
    }

    public void setThresholdQty(int thresholdQty) {
        this.thresholdQty = thresholdQty;
    }

    
    public String getVaccineType() {
        return VaccineType;
    }

    public void setVaccineType(String VaccineType) {
        this.VaccineType = VaccineType;
    }

    public int getInvStock() {
        return InvStock;
    }

    public void setInvStock(int InvStock) {
        this.InvStock = InvStock;
    }

    
    @Override
    public String toString() {
        return VaccineName;
    }
    
    
    
}

    

