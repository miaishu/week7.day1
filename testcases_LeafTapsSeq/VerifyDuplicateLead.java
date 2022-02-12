package testcases_LeafTapsSeq;

import org.testng.annotations.Test;

import baseClass.BaseClass;
import pagesLeaftapsSeq.LoginPage;

public class VerifyDuplicateLead  extends BaseClass{
	@Test
	public void runVerifyDuplicateLead() throws InterruptedException {
		LoginPage lp= new LoginPage();
		
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
