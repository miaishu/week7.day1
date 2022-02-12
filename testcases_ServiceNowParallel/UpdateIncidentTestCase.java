package testcases_ServiceNowParallel;

import org.testng.annotations.Test;
import baseClass_ServiceNow.BaseClass_ServiceNowParallel;
import pages_ServiceNowParallel.LoginPage;


public class UpdateIncidentTestCase extends BaseClass_ServiceNowParallel{

	
	@Test
	public void runUpdateGroup() throws InterruptedException {
		
		LoginPage lp= new LoginPage(driver);
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