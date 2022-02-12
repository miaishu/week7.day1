package testcases_LeaftapParallel;

import org.testng.annotations.Test;


import baseClass.BaseClassParallel;
import pagesLeaftapsParallel.LoginPage;


public class VerifyLogin extends BaseClassParallel{
	@Test
	public void runVerifyLogin()  {
	
LoginPage lp = new LoginPage(driver);
		
		lp.enterUserName()
		.enterPassword()
		.clickOnLogin()
		.verifyHomePage()
		.clickCrmSfa();
		
		
	}

	
}
