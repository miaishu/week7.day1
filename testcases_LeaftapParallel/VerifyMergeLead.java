package testcases_LeaftapParallel;

import org.testng.annotations.Test;
import baseClass.BaseClassParallel;
import pagesLeaftapsParallel.LoginPage;


public class VerifyMergeLead extends BaseClassParallel {
	@Test
	public void runVerifyMergeLead() throws InterruptedException {
		
		LoginPage lp= new LoginPage(driver);
		lp.enterUserName()
		.enterPassword()
		.clickOnLogin()
		.clickCrmSfa()
		.clickOnLeads()
		.clickOnMergeLeads()
		.clickLookUpFromLead()
		.clickLookUpToLead()
		.clickOnMerge()
		.verifyMergeLead();
		
	}

}
