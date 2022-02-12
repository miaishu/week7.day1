package testcases_ServiceNowParallelDataProvider;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseClass_ServiceNow.BaseClass_ServiceNowParallelDataProvider;
import pages_ServiceNowParallelDataProvider.LoginPage;




public class CreateIncidentTestCase extends BaseClass_ServiceNowParallelDataProvider{
	
	@BeforeTest
	public void setUp() {
		fileName="ServiceNow_create";
	}
	@Test(dataProvider="fetchData")
	public void runCreateIncident(String name, String sd) throws InterruptedException {
		
		LoginPage lp= new LoginPage(driver);
		lp.enterUserName()
		.enterPassword()
		.clickOnLogin()
		.searchOnIncidentInFilters()
		.selectAllInFilters()
		.clickOnNew()
		.searchForCallerId()
		.selectCallerId(name)
		.enterShortDesc(sd)
		.clickOnSubmit();
	}
	

}
