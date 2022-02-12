package testcases_ServiceNowParallelDataProvider;

import org.testng.annotations.Test;

import baseClass_ServiceNow.BaseClass_ServiceNow;
import baseClass_ServiceNow.BaseClass_ServiceNowParallel;
import pages_ServiceNowParallel.LoginPage;


public class AssignIncidentTestCase extends BaseClass_ServiceNowParallel {

	@Test
	public void runAssignGroup() throws InterruptedException {
		
		LoginPage lp= new LoginPage(driver);
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