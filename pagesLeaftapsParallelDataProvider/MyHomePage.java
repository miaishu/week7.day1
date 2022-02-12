package pagesLeaftapsParallelDataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import baseClass.BaseClassParallel;
import baseClass.BaseClassParallel_dataProvider;

public class MyHomePage extends BaseClassParallel_dataProvider {
	
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
