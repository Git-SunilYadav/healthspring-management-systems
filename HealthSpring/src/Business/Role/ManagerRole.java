/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Manager;
//import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import static Business.Organization.Organization.Type.Manager;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.ManagerRole.ManagerWorkAreaJPanel;
//import userinterface.DoctorRole.DoctorWorkAreaJPanel;
/**
 *
 * @author nikhi
 */
public class ManagerRole extends Role {
 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new ManagerWorkAreaJPanel(userProcessContainer, account, (Manager) organization, enterprise,business);
    }
    
    
}
   

