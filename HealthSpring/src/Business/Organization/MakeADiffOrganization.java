/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DoctorRole;
import Business.Role.MakeADiffRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author nikhi
 */
public class MakeADiffOrganization extends Organization{
    
    /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

    public MakeADiffOrganization() {
        super(Organization.Type.MakeADifference.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new MakeADiffRole());
        return roles;
    }
     

    
}
