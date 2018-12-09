/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import java.util.ArrayList;
import java.util.Date;

// Author: Sunil Yadav
public class AppointmentHistory {
    
    private int appointmentId;
    private static int appointmentCounter = 1;
    private String details;
    private String doctorName;
    private Date Date;
    private String time;
   
     public AppointmentHistory() {
        appointmentId = appointmentCounter;
        appointmentCounter++;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public Date getDate() {
        return Date;
    }

    public void setDate(Date Date) {
        this.Date = Date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
     
}
