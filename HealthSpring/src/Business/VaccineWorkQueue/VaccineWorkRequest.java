/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.VaccineWorkQueue;

import Business.WorkQueue.WorkRequest;

/**
 *
 * @author nikhi
 */
public class VaccineWorkRequest extends WorkRequest {
    
    private String VaccineName;
    private String VaccineType;
    private int Qty;
    private String Network;

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

    public int getQty() {
        return Qty;
    }

    public void setQty(int Qty) {
        this.Qty = Qty;
    }

    public String getNetwork() {
        return Network;
    }

    public void setNetwork(String Network) {
        this.Network = Network;
    }
    
    

    @Override
    public String toString() {
        return VaccineName;
    }   
    
}
