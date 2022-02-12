package testcases_LeaftapParallel;

import org.testng.annotations.Test;

import baseClass.BaseClassParallel;
import pagesLeaftapsParallel.LoginPage;


public class VerifyDuplicateLead  extends BaseClassParallel{
	@Test
	public void runVerifyDuplicateLead() throws InterruptedException {
		LoginPage lp= new LoginPage(driver);
		
		lp.enterUserName()
		.enterPassword()
		.clickOnLogin()
		.clickCrmSfa()
		.clickOnLeads()
		.clickOnFindLead()
		.clickOnPhone()
		.enterPhoneNo()
		.clickOnFindLeads()
		.clickOnFirstOption()
		.clickOnDuplicate()
		.clickOnCreateLead()
		.VerifyDuplicateLead();
		
	}

}
