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
public class VaccineDetails {
    
    private String VaccineName;
    private String VaccineType;
    private int ThresholdQty;
    private int Qty;

    public String getVaccineName() {
        return VaccineName;
    }

    public void setVaccineName(String VaccineName) {
        this.VaccineName = VaccineName;
    }

    public String getVaccineType() {
        return VaccineType;
    }

    public void setVaccineType(String VaccineType) {
        this.VaccineType = VaccineType;
    }

    public int getThresholdQty() {
        return ThresholdQty;
    }

    public void setThresholdQty(int ThresholdQty) {
        this.ThresholdQty = ThresholdQty;
    }
    

    public int getQty() {
        return Qty;
    }

    public void setQty(int Qty) {
        this.Qty = Qty;
    }
    
    @Override
    public String toString() {
        return VaccineName;
    }
    
    
    
}
