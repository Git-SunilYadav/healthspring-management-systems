/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.SocialCrowdFunding;

import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SocialCrowdFunding.FinanceFellowRole;
import java.util.ArrayList;

/**
 *
 * @author nikhi
 */
public class FinanceFellowOrganization extends Organization{

    public FinanceFellowOrganization() {
        super(Type.FinanceFellow.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
             ArrayList<Role> roles = new ArrayList();
        roles.add(new FinanceFellowRole());
        return roles;
     }
    
}
