/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.SocialCrowdFunding;

import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SocialCrowdFunding.CFRAdminRole;
import java.util.ArrayList;

/**
 *
 * @author nikhi
 */
public class CFRAdminOrganization extends Organization{

    public CFRAdminOrganization() {
        super(Type.CFRAdmin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
            ArrayList<Role> roles = new ArrayList();
        roles.add(new CFRAdminRole());
        return roles;
     }
    
}
