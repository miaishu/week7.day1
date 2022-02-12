package pagesLeaftapsParallel;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseClass.BaseClassParallel;



public class EditLeadPage extends BaseClassParallel {
	
	public EditLeadPage(RemoteWebDriver driver) {
		this.driver= driver;
		}
	
	public EditLeadPage editCompanyName() {
	driver.findElement(By.id("updateLeadForm_companyName")).clear();
	driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TCS");
	return this;
	
	}
	
	public ViewLeadPage clickOnSubmit() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver);
	}
}
