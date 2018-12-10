/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Utility;

import java.util.Date;

// Author: Sunil M. Yadav
public class LabReportTemplate {
    
    public String getReportTemplate(String patientName, int age, String doctorName, Date date, String testName, String remark)
    {
        StringBuilder sb = new StringBuilder();
        
        // Lab Name
        sb.append("               HealthSpring Medical Laboratory " + "\n");
        sb.append("\n");
        // Patient Name
        sb.append("Patient Name:  " + patientName + " \n");
        sb.append("\n");
        
        // Age
        sb.append("Age:  " + age + " \n");
        sb.append("\n");
        
        // Doctor Name
        sb.append("Referred By:  " + doctorName + " \n");
        sb.append("\n");
        
        // Test Name
        sb.append("Test :  " + testName + " \n");
        sb.append("\n");
        
        // Date
        sb.append("Date:  " + date + " \n");
        sb.append("\n");
        
        // Lab Test remark
        sb.append("Lab test remark:  " + remark + " \n");
        sb.append("\n");
        sb.append("\n");
        
        // Disclaimer
        sb.append("Full Legal Disclaimer");
        sb.append("\n");
        sb.append("This report was prepared as an account of work sponsored by an agency of "
                + "the United States Government. Neither the United States Government nor any agency "
                + "thereof, nor any of their employees, nor any of their contractors, subcontractors"
                + " or their employees, makes any warranty, express or implied, or assumes any legal "
                + "liability or responsibility for the accuracy, completeness, or any third party's "
                + "use or the results of such use of any information, apparatus, product, or process "
                + "disclosed, or represents that its use would not infringe privately owned rights. "
                + "Reference herein to any specific commercial product, process, or service by trade name, "
                + "trademark, manufacturer, or otherwise, does not necessarily constitute or imply its "
                + "endorsement, recommendation, or favoring by the United States Government or any agency "
                + "thereof or its contractors or subcontractors. The views and opinions of authors "
                + "expressed herein do not necessarily state or reflect those of the United States "
                + "Government or any agency thereof.");
        
        return sb.toString();
    }
}
