/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Utility;

/**
 *
 * @author yadav
 */
public class LabMailTemplate {
    
    public String getMailTemplate(String patientName ){
        StringBuilder sb = new StringBuilder();
        sb.append("Hello " + patientName + "\n");
        sb.append("\n");
        sb.append("Reports for below mentioned tests with respect to Order ID PO2435782394-155 are now available from HealthSpring Diagnostics");
        sb.append("\n");
        sb.append("For your convenience, the reports have been attached to this email. Click here  to avail your free consultation.");
        sb.append("\n");
        sb.append("\n");
        sb.append("Thank you for using HealthSpring Labs !\n" +" Our customer care executives are available from 6 AM - 8 PM (Monday - Sunday).");
        return sb.toString();
    }
}
