package testcases_LeafTapsSeq;

import org.testng.annotations.Test;

import baseClass.BaseClass;
import pagesLeaftapsSeq.LoginPage;

public class VerifyLogin extends BaseClass{
	@Test
	public void runVerifyLogin()  {
	
LoginPage lp = new LoginPage();
		
		lp.enterUserName()
		.enterPassword()
		.clickOnLogin()
		.verifyHomePage()
		.clickCrmSfa();
		
		
	}

	
}
