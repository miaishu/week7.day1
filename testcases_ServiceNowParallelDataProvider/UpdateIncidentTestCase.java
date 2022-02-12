package testcases_ServiceNowParallelDataProvider;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import baseClass_ServiceNow.BaseClass_ServiceNowParallel;
import baseClass_ServiceNow.BaseClass_ServiceNowParallelDataProvider;
import pages_ServiceNowParallelDataProvider.LoginPage;



public class UpdateIncidentTestCase extends BaseClass_ServiceNowParallelDataProvider{
	@BeforeTest
	public void setUp() {
		fileName="ServiceNow_Update";
	}
	
	@Test(dataProvider="fetchData")
	public void runUpdateGroup(String incno, String wn) throws InterruptedException {
		
		LoginPage lp= new LoginPage(driver);
		lp.enterUserName()
		.enterPassword()
		.clickOnLogin()
		.searchOnIncidentInFilters()
		.selectOpenInFilters()
		.selectNumberInDropdown()
		.enterIncidentNumberForUpdate(incno)
		.clickOnIncident()
		.selectUrgencyValue()
		.selectStateValue()
		.enterWorkNotesForUpdate(wn)
		.clickOnUpdate()
		.selectNumberInDropDown()
		.verifyUpdatedIncident(incno);
}
}