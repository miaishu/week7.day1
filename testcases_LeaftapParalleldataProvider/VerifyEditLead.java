package testcases_LeaftapParalleldataProvider;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import baseClass.BaseClassParallel_dataProvider;
import pagesLeaftapsParallelDataProvider.LoginPage;



public class VerifyEditLead extends BaseClassParallel_dataProvider {
	@BeforeTest
	public void setUp() {
		fileName="Edit_Lead";
	}
	
	@Test(dataProvider ="fetchData")
	public void verifyEditLead(String pNo, String cName) throws InterruptedException {
		
		LoginPage lp= new LoginPage(driver);
		lp.enterUserName()
		.enterPassword()
		.clickOnLogin()
		.clickCrmSfa()
		.clickOnLeads()
		.clickOnFindLead()
		.clickOnPhone()
		.enterPhoneNo(pNo)
		.clickOnFindLeads()
		.clickOnFirstOption()
		.clickOnEdit()
		.editCompanyName(cName)
		.clickOnSubmit()
		.VerifyEditLead();
		
	}

}
