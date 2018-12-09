/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Patient.Patient;
import java.util.Date;

/**
 *
 * @author yadav
 */
public class LabTestRequest {
    private Patient objPatient;
    private String doctorName;
    private Date requestedDate;
    private String testName;

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public Patient getObjPatient() {
        return objPatient;
    }

    public void setObjPatient(Patient objPatient) {
        this.objPatient = objPatient;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public Date getRequestedDate() {
        return requestedDate;
    }

    public void setRequestedDate(Date requestedDate) {
        this.requestedDate = requestedDate;
    }

    public boolean isReportGenerated() {
        return reportGenerated;
    }

    public void setReportGenerated(boolean reportGenerated) {
        this.reportGenerated = reportGenerated;
    }

    public String getReportDetails() {
        return reportDetails;
    }

    public void setReportDetails(String reportDetails) {
        this.reportDetails = reportDetails;
    }
    private boolean reportGenerated;
    private String reportDetails;
    
    @Override
    public String toString(){
        
        return this.testName;
    }
}
