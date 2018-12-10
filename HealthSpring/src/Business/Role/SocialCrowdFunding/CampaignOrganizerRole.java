/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role.SocialCrowdFunding;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.AdministrativeRole.AdminWorkAreaJPanel;
import userinterface.CampaignOrganizerRole.CampaignOrgMainJPanel;
import userinterface.CampaignOrganizerRole.CampaignOrganizerWorkAreaJPanel;

/**
 *
 * @author nikhi
 */
public class CampaignOrganizerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new CampaignOrgMainJPanel(userProcessContainer, enterprise , account, organization, business);
    }
}
