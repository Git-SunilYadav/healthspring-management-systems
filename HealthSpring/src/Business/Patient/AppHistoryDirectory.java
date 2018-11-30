/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import java.util.ArrayList;

/**
 *
 * @author nikhi
 */
public class AppHistoryDirectory {
    

/**
 *
 * @author nikhi
 */
    
    private ArrayList<AppointmentHistory> AppHistoryList;

    public AppHistoryDirectory() {
        AppHistoryList = new ArrayList();
    }

    public ArrayList<AppointmentHistory> getAppHistoryList() {
        return AppHistoryList;
    }
    
    public AppointmentHistory createPatient(String name){
        AppointmentHistory appHistory = new AppointmentHistory();
        // appHistory.setName(name);
        AppHistoryList.add(appHistory);
        return appHistory;
    }
}
    
    


    

