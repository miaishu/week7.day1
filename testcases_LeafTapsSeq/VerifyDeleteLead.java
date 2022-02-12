package testcases_LeafTapsSeq;

import org.testng.annotations.Test;

import baseClass.BaseClass;
import pagesLeaftapsSeq.LoginPage;

public class VerifyDeleteLead extends BaseClass {
	@Test
	public void runDeleteLead() throws InterruptedException {
		
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
		.getTheLeadID()
		.clickOnFirstOption()
		.clickOnDelete()
		.clickOnFindLead()
		.enterLeadID()
		.clickOnFindLeads()
		.verifyDeleteID();
		
	}

}
