package testcases_ServiceNow;

import org.testng.annotations.Test;

import baseClass_ServiceNow.BaseClass_ServiceNow;
import pages_ServiceNow.LoginPage;

public class DeleteIncidentTestCase extends BaseClass_ServiceNow{
	@Test
	public void runDeleteGroup() throws InterruptedException {
		
		LoginPage lp= new LoginPage();
		lp.enterUserName()
		.enterPassword()
		.clickOnLogin()
		.searchOnIncidentInFilters()
		.selectOpenInFilters()
		.selectNumberInDropdown()
		.enterIncidentNumberForDelete()
		.clickOnIncident()
		.clickOnDelete()
		.selectNumberInDropDown()
		.verifyDeletedIncident();
}
}