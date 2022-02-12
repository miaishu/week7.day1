package pagesLeaftapsSeq;

import org.openqa.selenium.By;

import baseClass.BaseClass;

public class MyLeadsPage extends BaseClass {
	
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
		return new ViewLeadPage();
	}
	
	

}
