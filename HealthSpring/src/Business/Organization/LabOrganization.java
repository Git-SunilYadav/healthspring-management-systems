/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.LabAssistantRole;
import Business.Role.Role;
import Business.WorkQueue.LabTestRequest;
import java.util.ArrayList;

// Author: Sunil M. Yadav 

public class LabOrganization extends Organization{
    private ArrayList<LabTestRequest> objLabTestRequestList;
    public LabOrganization() {
        super(Organization.Type.Lab.getValue());
        objLabTestRequestList = new ArrayList<LabTestRequest>();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new LabAssistantRole());
        return roles;
    }

    public ArrayList<LabTestRequest> getObjLabTestRequestList() {
        return objLabTestRequestList;
    }

    public void setObjLabTestRequestList(ArrayList<LabTestRequest> objLabTestRequestList) {
        this.objLabTestRequestList = objLabTestRequestList;
    }  
}
