package pagesLeaftapsParallelDataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseClass.BaseClassParallel;
import baseClass.BaseClassParallel_dataProvider;



public class EditLeadPage extends BaseClassParallel_dataProvider {
	
	public EditLeadPage(RemoteWebDriver driver) {
		this.driver= driver;
		}
	
	public EditLeadPage editCompanyName(String cName) {
	driver.findElement(By.id("updateLeadForm_companyName")).clear();
	driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(cName);
	return this;
	
	}
	
	public ViewLeadPage clickOnSubmit() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver);
	}
}
