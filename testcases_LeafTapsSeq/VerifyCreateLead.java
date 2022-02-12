package testcases_LeafTapsSeq;

import baseClass.BaseClass;
import pagesLeaftapsSeq.LoginPage;

public class VerifyCreateLead extends BaseClass{
	
	public void verifyCreateLead() {
		
		LoginPage lp = new LoginPage();
				
				lp.enterUserName()
				.enterPassword()
				.clickOnLogin()
				.verifyHomePage()
				.clickCrmSfa()
				.verifyMyHomePage()
				.clickOnLeads()
				.clickOnCreateLead()
				.enterCompanyName()
				.enterFirstName()
				.enterLastName()
				.clickOnSubmit()
				.verifyViewLead();
	

}
}