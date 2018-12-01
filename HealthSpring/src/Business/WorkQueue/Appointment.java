/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author yadav
 */
public class Appointment {
    private Date appointmentDate;
    private ArrayList<AppointmentSlots> appointmentSlots;
    private SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
    
    public Appointment(){
        this.appointmentSlots = new ArrayList();
    }

    public ArrayList<AppointmentSlots> getAppointmentSlots() {
        return appointmentSlots;
    }

    public void setAppointmentSlots(ArrayList<AppointmentSlots> appointmentSlots) {
        this.appointmentSlots = appointmentSlots;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }
    
    // to create slots
    public void createSlots(){
        for(int i=0;i < 9; i++){
            AppointmentSlots objAppointmentSlots = new AppointmentSlots();
            objAppointmentSlots.setId(i+1);
            objAppointmentSlots.setSlotTime((i+10)+":00");
            objAppointmentSlots.setIsBooked(false);
            this.appointmentSlots.add(objAppointmentSlots);
        }
    }
    
    @Override
    public String toString(){
        return sdf.format(appointmentDate);
    }
}
