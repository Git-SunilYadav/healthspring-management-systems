/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DoctorOrganization;
import Business.Organization.MakeADiffOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.DoctorRole.DoctorWorkAreaJPanel;
import userinterface.MakeADiffRole.MakeADiffWorkAreaJPanel;

/**
 *
 * @author nikhi
 */
public class MakeADiffRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new MakeADiffWorkAreaJPanel(userProcessContainer, account, (MakeADiffOrganization)organization, enterprise,business);
    }
    
}
