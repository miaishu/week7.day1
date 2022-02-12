package testcases_LeafTapsSeq;

import org.testng.annotations.Test;

import baseClass.BaseClass;
import pagesLeaftapsSeq.LoginPage;

public class VerifyMergeLead extends BaseClass {
	@Test
	public void runVerifyMergeLead() throws InterruptedException {
		
		LoginPage lp= new LoginPage();
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
