package pagesLeaftapsParallelDataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import baseClass.BaseClassParallel;
import baseClass.BaseClassParallel_dataProvider;

public class ViewLeadPage extends BaseClassParallel_dataProvider {
	
	public ViewLeadPage(RemoteWebDriver driver) {
		this.driver= driver;
		}
	
	public void verifyViewLead() {
		boolean displayed = driver.findElement(By.id("viewLead_firstName_sp")).isDisplayed();
		Assert.assertTrue(displayed);
	}
	 
	public EditLeadPage clickOnEdit() {
		driver.findElement(By.linkText("Edit")).click();
		return new EditLeadPage(driver);
	}
	
	public void VerifyEditLead() {
		boolean displayed = driver.findElement(By.id("viewLead_companyName_sp")).isDisplayed();
		Assert.assertTrue(displayed);
	}
	
	public void verifyMergeLead() {
		boolean displayed = driver.findElement(By.id("viewLead_firstName_sp")).isDisplayed();
		Assert.assertTrue(displayed);
	}
	
	public DuplicateLeadPage clickOnDuplicate() {
		driver.findElement(By.linkText("Edit")).click();
		return new DuplicateLeadPage(driver);
	}
	
	public void VerifyDuplicateLead() {
		boolean displayed = driver.findElement(By.id("viewLead_companyName_sp")).isDisplayed();
		Assert.assertTrue(displayed);
	}
	
	public LeadsPage clickOnDelete() {
		driver.findElement(By.linkText("Delete")).click();
		return new LeadsPage(driver);
	}
	
	
	}
	

