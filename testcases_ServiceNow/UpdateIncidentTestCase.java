package testcases_ServiceNow;

import org.testng.annotations.Test;

import baseClass_ServiceNow.BaseClass_ServiceNow;
import pages_ServiceNow.LoginPage;

public class UpdateIncidentTestCase extends BaseClass_ServiceNow{

	
	@Test
	public void runUpdateGroup() throws InterruptedException {
		
		LoginPage lp= new LoginPage();
		lp.enterUserName()
		.enterPassword()
		.clickOnLogin()
		.searchOnIncidentInFilters()
		.selectOpenInFilters()
		.selectNumberInDropdown()
		.enterIncidentNumberForUpdate()
		.clickOnIncident()
		.selectUrgencyValue()
		.selectStateValue()
		.enterWorkNotesForUpdate()
		.clickOnUpdate()
		.selectNumberInDropDown()
		.verifyAssignedGroup();
}
}