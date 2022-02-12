package testcases_LeaftapParalleldataProvider;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import baseClass.BaseClassParallel_dataProvider;
import pagesLeaftapsParallelDataProvider.LoginPage;



public class VerifyCreateLead extends BaseClassParallel_dataProvider{
	@BeforeTest
	public void setUp() {
	fileName = "Create_Lead";
	}
	
	
	@Test(dataProvider ="fetchData")
	public void verifyCreateLead(String cName,String fName,String lName,String pNo) {
		
		LoginPage lp = new LoginPage(driver);
				
				lp.enterUserName()
				.enterPassword()
				.clickOnLogin()
				.verifyHomePage()
				.clickCrmSfa()
				.verifyMyHomePage()
				.clickOnLeads()
				.clickOnCreateLead()
				.enterCompanyName(cName)
				.enterFirstName(fName)
				.enterLastName(lName)
				.enterPhoneNo(pNo)
				.clickOnSubmit()
				.verifyViewLead();
	

}
}