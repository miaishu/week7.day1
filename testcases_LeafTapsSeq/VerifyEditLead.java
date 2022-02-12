package testcases_LeafTapsSeq;

import org.testng.annotations.Test;

import baseClass.BaseClass;
import pagesLeaftapsSeq.LoginPage;

public class VerifyEditLead extends BaseClass {
	@Test
	public void verifyEditLead() throws InterruptedException {
		
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
		.clickOnEdit()
		.editCompanyName()
		.clickOnSubmit()
		.VerifyEditLead();
		
	}

}
