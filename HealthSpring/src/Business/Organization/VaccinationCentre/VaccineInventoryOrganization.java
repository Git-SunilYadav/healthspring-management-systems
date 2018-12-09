/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.VaccinationCentre;

import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.VaccinationCentre.VaccineInventoryManagerRole;
import java.util.ArrayList;

/**
 *
 * @author nikhi
 */
public class VaccineInventoryOrganization extends Organization{
    

    public VaccineInventoryOrganization() {
        super(Organization.Type.VaccineInventoryManager.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new VaccineInventoryManagerRole());
        return roles;
    }
     
}
