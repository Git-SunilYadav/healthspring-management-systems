/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import Business.Employee.Employee;
import java.util.ArrayList;

/**
 *
 * @author nikhi
 */
public class PatientDirectory {
    
    private ArrayList<Patient> patientList;

    public PatientDirectory() {
        this.patientList = new ArrayList<Patient>();
    }

    public ArrayList<Patient> getpatientList() {
        return patientList;
    }
    
    public Patient createPatient(String name, int age, String email, String MobileNo){
        Patient patient = new Patient();
        patient.setName(name);
        patient.setAge(age);
        patient.setEmail(email);
        patient.setMobile_num(MobileNo);
        patientList.add(patient);
        return patient;
    }
}
    
    

