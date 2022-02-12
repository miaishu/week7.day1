package pagesLeaftapsParallel;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import baseClass.BaseClassParallel;

public class MyHomePage extends BaseClassParallel {
	
	public MyHomePage(RemoteWebDriver driver) {
		this.driver= driver;
		}
	
public MyHomePage verifyMyHomePage() {
	 boolean displayed = driver.findElement(By.linkText("Leads")).isDisplayed();
	 Assert.assertTrue(displayed);
	 return this;
	
}
public LeadsPage clickOnLeads() {
	driver.findElement(By.linkText("Leads")).click();
	return new LeadsPage(driver);
}
}
