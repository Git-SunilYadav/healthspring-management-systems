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
    //private static int _a, _b, _o, _ab, a, b, ab, o;
    
    
 
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
   @Override
    public String toString() {
        return DonorName;
    }
}
/*
    public  int get_A() {
        return _a;
    }

    public  void set_A(int _a) {
        BloodSpecs._a = _a;
    }

    public  int get_B() {
        return _b;
    }

    public  void set_B(int _b) {
        BloodSpecs._b = _b;
    }

    public  int get_O() {
        return _o;
    }

    public static void set_O(int _o) {
        BloodSpecs._o = _o;
    }

    public  int get_Ab() {
        return _ab;
    }

    public  void set_Ab(int _ab) {
        BloodSpecs._ab = _ab;
    }

    public  int getA() {
        return a;
    }

    public  void setA(int a) {
        BloodSpecs.a = a;
    }

    public  int getB() {
        return b;
    }

    public static void setB(int b) {
        BloodSpecs.b = b;
    }

    public static int getAb() {
        return ab;
    }

    public static void setAb(int ab) {
        BloodSpecs.ab = ab;
    }

    public static int getO() {
        return o;
    }

    public static void setO(int o) {
        BloodSpecs.o = o;
    }   */
    
