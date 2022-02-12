package pagesLeaftapsParallelDataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;


import baseClass.BaseClassParallel;
import baseClass.BaseClassParallel_dataProvider;

public class MyLeadsPage extends BaseClassParallel_dataProvider {
	
	public MyLeadsPage(RemoteWebDriver driver) {
		this.driver= driver;
		}
	
	public MyLeadsPage enterCompanyName(String cName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		return this;
	}
	
	public MyLeadsPage enterFirstName(String fName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		return this;
	}
	
	public MyLeadsPage enterLastName(String lName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		return this;
	}
	
	public MyLeadsPage enterPhoneNo(String pNo) {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(pNo);
		return this;
	}
	
	public ViewLeadPage clickOnSubmit() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver);
	}
	
	

}
