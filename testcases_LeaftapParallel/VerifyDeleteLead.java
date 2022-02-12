package testcases_LeaftapParallel;

import org.testng.annotations.Test;


import baseClass.BaseClassParallel;
import pagesLeaftapsParallel.LoginPage;


public class VerifyDeleteLead extends BaseClassParallel {
	@Test
	public void runDeleteLead() throws InterruptedException {
		
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
		.getTheLeadID()
		.clickOnFirstOption()
		.clickOnDelete()
		.clickOnFindLead()
		.enterLeadID()
		.clickOnFindLeads()
		.verifyDeleteID();
		
	}

}
