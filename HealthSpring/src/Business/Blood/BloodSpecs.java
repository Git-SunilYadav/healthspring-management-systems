/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Blood;

/**
 *
 * @author mihir
 */
public class BloodSpecs {
    private String BloodGroup;
    private int Volume;
    private String DonorName;

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

    public String getDonorName() {
        return DonorName;
    }

    public void setDonorName(String DonorName) {
        this.DonorName = DonorName;
    }
    
}
