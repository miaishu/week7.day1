package testcases_ServiceNow;

import org.testng.annotations.Test;

import baseClass_ServiceNow.BaseClass_ServiceNow;
import pages_ServiceNow.LoginPage;


public class CreateIncidentTestCase extends BaseClass_ServiceNow{
	@Test
	public void runCreateIncident() throws InterruptedException {
		
		LoginPage lp= new LoginPage();
		lp.enterUserName()
		.enterPassword()
		.clickOnLogin()
		.searchOnIncidentInFilters()
		.selectAllInFilters()
		.clickOnNew()
		.searchForCallerId()
		.selectCallerId()
		.enterShortDesc()
		.clickOnSubmit();
	}
	

}
