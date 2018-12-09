/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role.VaccinationCentre;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.VaccineManagerRole.VaccineMainJPanel;
import userinterface.VaccineManagerRole.VaccineManagementJPanel;

/**
 *
 * @author nikhi
 */
public class VaccineManagerRole extends Role{
     
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new VaccineMainJPanel(userProcessContainer, account,organization, enterprise, business);
    }
}
