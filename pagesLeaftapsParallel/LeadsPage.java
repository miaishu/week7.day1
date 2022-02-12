package pagesLeaftapsParallel;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseClass.BaseClassParallel;

public class LeadsPage extends BaseClassParallel {
	
	public LeadsPage(RemoteWebDriver driver) {
		this.driver= driver;
		}
	
	public MyLeadsPage clickOnCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new MyLeadsPage(driver);
	}

	public FindLeadsPage clickOnFindLead() {
		driver.findElement(By.linkText("Find Leads")).click();
		return new FindLeadsPage(driver);
	}
	
	public MergeLeadsPage clickOnMergeLeads() {
		driver.findElement(By.linkText("Merge Leads")).click();
		return new MergeLeadsPage(driver);
	}

	
	
}
