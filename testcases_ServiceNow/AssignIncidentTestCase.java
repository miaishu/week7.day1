package testcases_ServiceNow;

import org.testng.annotations.Test;

import baseClass_ServiceNow.BaseClass_ServiceNow;
import pages_ServiceNow.LoginPage;

public class AssignIncidentTestCase extends BaseClass_ServiceNow {

	@Test
	public void runAssignGroup() throws InterruptedException {
		
		LoginPage lp= new LoginPage();
		lp.enterUserName()
		.enterPassword()
		.clickOnLogin()
		.searchOnIncidentInFilters()
		.selectOpenInFilters()
		.selectNumberInDropdown()
		.enterIncidentNumberForAssign()
		.clickOnIncident()
		.clickOnSearchInAssignGroup()
		.selectGroupToAssign()
		.enterWorkNotesForAssign()
		.clickOnUpdate()
		.verifyAssignedGroup();
}
}