package testcases_ServiceNowParallel;

import org.testng.annotations.Test;
import baseClass_ServiceNow.BaseClass_ServiceNowParallel;
import pages_ServiceNowParallel.LoginPage;



public class CreateIncidentTestCase extends BaseClass_ServiceNowParallel{
	@Test
	public void runCreateIncident() throws InterruptedException {
		
		LoginPage lp= new LoginPage(driver);
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
