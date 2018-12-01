/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DoctorRole;
import Business.Role.Role;
import Business.WorkQueue.Appointment;
import java.util.ArrayList;

public class DoctorOrganization extends Organization{
    private ArrayList<Appointment> appointmentList;
    
    public DoctorOrganization() {
        super(Organization.Type.Doctor.getValue());
        this.appointmentList = new ArrayList<Appointment>();
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DoctorRole());
        return roles;
    }
     
}