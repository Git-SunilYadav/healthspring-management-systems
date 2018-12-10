/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import java.util.ArrayList;

// Author : Sunil M. Yadav
public class Patient {
    
    private String name;
    private int id;
    private static int count = 1;
    private String email;
    private int age;
    private String mobile_num;

    public ArrayList<LabTestReport> getLabTestReportList() {
        return labTestReportList;
    }

    public void setLabTestReportList(ArrayList<LabTestReport> labTestReportList) {
        this.labTestReportList = labTestReportList;
    }
    private ArrayList<AppointmentHistory> appointmentHistoryList;
    private ArrayList<LabTestReport> labTestReportList;
    

    public Patient() {
        id = count;
        count++;
        appointmentHistoryList = new ArrayList<AppointmentHistory>();
        labTestReportList = new ArrayList<LabTestReport>();
    }

    public ArrayList<AppointmentHistory> getAppointmentHistoryList() {
        return appointmentHistoryList;
    }

    public void setAppointmentHistoryList(ArrayList<AppointmentHistory> appointmentHistoryList) {
        this.appointmentHistoryList = appointmentHistoryList;
    }

    public String getMobile_num() {
        return mobile_num;
    }

    public void setMobile_num(String mobile_num) {
        this.mobile_num = mobile_num;
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
    
    @Override
    public String toString(){
        return this.name;
    }
}


