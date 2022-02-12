package pagesLeaftapsParallel;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;


import baseClass.BaseClassParallel;

public class MyLeadsPage extends BaseClassParallel {
	
	public MyLeadsPage(RemoteWebDriver driver) {
		this.driver= driver;
		}
	
	public MyLeadsPage enterCompanyName() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		return this;
	}
	
	public MyLeadsPage enterFirstName() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ish");
		return this;
	}
	
	public MyLeadsPage enterLastName() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("P");
		return this;
	}
	
	public ViewLeadPage clickOnSubmit() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver);
	}
	
	

}
