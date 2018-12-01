/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;
import Business.WorkQueue.Appointment;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

public class UserAccount {
    
    private String username;
    private String password;
    private Employee employee;
    private Role role;
    private WorkQueue workQueue;

    private ArrayList<Appointment> appointmentList;

    public ArrayList<Appointment> getAppointmentList() {
        return appointmentList;
    }

    public void setAppointmentList(ArrayList<Appointment> appointmentList) {
        this.appointmentList = appointmentList;
    }
    
    public UserAccount() {
        workQueue = new WorkQueue();
        this.appointmentList = new ArrayList<>();
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    
    
    @Override
    public String toString() {
        return username;
    }
    
    
    
}