/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import Business.Organization.SocialCrowdFunding.CFRStrategistOrganization;
import Business.Organization.SocialCrowdFunding.CampaignOrganization;
import Business.Organization.SocialCrowdFunding.FinanceFellowOrganization;
import Business.Organization.SocialCrowdFunding.TerminalCasesOrganization;
import Business.Organization.VaccinationCentre.VaccineOrganization;
import java.util.ArrayList;

public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Lab.getValue())){
            organization = new LabOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.BloodBankStaff.getValue())){
            organization = new BloodBankStaffOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.CFRStrategist.getValue())){
            organization = new CFRStrategistOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.CampaignOrganizer.getValue())){
            organization = new CampaignOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.FinanceFellow.getValue())){
            organization = new FinanceFellowOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.TerminalCasesManager.getValue())){
            organization = new TerminalCasesOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.MakeADifference.getValue())){
            organization = new MakeADiffOrganization();
            organizationList.add(organization);
        }
        // create Appointment manager 
        else if (type.getValue().equals(Type.Manager.getValue())){
            organization = new Manager();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.VaccineManager.getValue())){
            organization = new VaccineOrganization();
            organizationList.add(organization);
        }
       
        return organization;
    }
    
     /*  public Organization createBloodBankOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.BloodBankStaff.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Lab.getValue())){
            organization = new LabOrganization();
            organizationList.add(organization);
        }
        return organization;
    }*/
}