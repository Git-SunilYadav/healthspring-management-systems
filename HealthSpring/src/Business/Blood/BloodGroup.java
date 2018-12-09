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
public class BloodGroup {
    private  int Apositive;
    private  int Anegative;
    private  int Bpositive;
    private  int Bnegative;
    private  int Opositive;
    private  int Onegative;
    private  int ABpositive;
    private  int Abnegative;

    public void BloodGroup(){
        this.Anegative=0;
        this.Bpositive=0;
        this.Bnegative=0;
        this.Opositive=0;
        this.Onegative=0;
        this.ABpositive=0;
        this.Abnegative=0;
    }
 
    public int getBnegative() {
        return Bnegative;
    }

    public void setBnegative(int Bnegative) {
        this.Bnegative = Bnegative;
    }

    public int getApositive() {
        return Apositive;
    }

    public void setApositive(int Apositive) {
        this.Apositive = Apositive;
    }

    public int getAnegative() {
        return Anegative;
    }

    public void setAnegative(int Anegative) {
        this.Anegative = Anegative;
    }

    public int getBpositive() {
        return Bpositive;
    }

    public void setBpositive(int Bpositive) {
        this.Bpositive = Bpositive;
    }

    public int getOpositive() {
        return Opositive;
    }

    public void setOpositive(int Opositive) {
        this.Opositive = Opositive;
    }

    public int getOnegative() {
        return Onegative;
    }

    public void setOnegative(int Onegative) {
        this.Onegative = Onegative;
    }

    public int getABpositive() {
        return ABpositive;
    }

    public void setABpositive(int ABpositive) {
        this.ABpositive = ABpositive;
    }

    public int getAbnegative() {
        return Abnegative;
    }

    public void setAbnegative(int Abnegative) {
        this.Abnegative = Abnegative;
    }
    
   
}
