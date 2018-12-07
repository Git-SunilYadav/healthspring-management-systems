/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.SocialCrowdFunding;

import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SocialCrowdFunding.CFRStrategistRole;
import java.util.ArrayList;

/**
 *
 * @author nikhi
 */
public class CFRStrategistOrganization extends Organization{

    public CFRStrategistOrganization() {
        super(Type.CFRStrategist.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
            ArrayList<Role> roles = new ArrayList();
        roles.add(new CFRStrategistRole());
        return roles;
     }
    
}
