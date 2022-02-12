package pagesLeaftapsSeq;

import org.openqa.selenium.By;

import baseClass.BaseClass;

public class EditLeadPage extends BaseClass {
	
	public EditLeadPage editCompanyName() {
	driver.findElement(By.id("updateLeadForm_companyName")).clear();
	driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TCS");
	return this;
	
	}
	
	public ViewLeadPage clickOnSubmit() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage();
	}
}
