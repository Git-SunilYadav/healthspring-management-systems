/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

/**
 *
 * @author nikhi
 */
public class Patient {
    
    private String name;
    private int id;
    private static int count = 1;
    private String email;
    private int age;
    private long mobile_num;
    
    

    public Patient() {
        id = count;
        count++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getMobile_num() {
        return mobile_num;
    }

    public void setMobile_num(long mobile_num) {
        this.mobile_num = mobile_num;
    }

    
    
    
}


