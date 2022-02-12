package testcases_LeaftapParallel;


import baseClass.BaseClassParallel;
import pagesLeaftapsParallel.LoginPage;


public class VerifyCreateLead extends BaseClassParallel{
	
	public void verifyCreateLead() {
		
		LoginPage lp = new LoginPage(driver);
				
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