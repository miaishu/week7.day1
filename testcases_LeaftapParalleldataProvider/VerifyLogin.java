package testcases_LeaftapParalleldataProvider;

import org.testng.annotations.Test;


import baseClass.BaseClassParallel;
import baseClass.BaseClassParallel_dataProvider;
import pagesLeaftapsParallel.LoginPage;


public class VerifyLogin extends BaseClassParallel_dataProvider{
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
