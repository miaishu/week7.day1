package testcases_LeaftapParalleldataProvider;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import baseClass.BaseClassParallel;
import baseClass.BaseClassParallel_dataProvider;
import pagesLeaftapsParallelDataProvider.LoginPage;



public class VerifyMergeLead extends BaseClassParallel_dataProvider {
	@BeforeTest
	public void setUp() {
		fileName="Merge_Lead";
	}
	
	@Test(dataProvider="fetchData")
	public void runVerifyMergeLead(String fromName, String toName) throws InterruptedException {
		
		LoginPage lp= new LoginPage(driver);
		lp.enterUserName()
		.enterPassword()
		.clickOnLogin()
		.clickCrmSfa()
		.clickOnLeads()
		.clickOnMergeLeads()
		.clickLookUpFromLead(fromName)
		.clickLookUpToLead(toName)
		.clickOnMerge()
		.verifyMergeLead();
		
	}

}
