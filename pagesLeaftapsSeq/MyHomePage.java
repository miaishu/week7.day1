package pagesLeaftapsSeq;

import org.openqa.selenium.By;
import org.testng.Assert;

import baseClass.BaseClass;

public class MyHomePage extends BaseClass {
	
public MyHomePage verifyMyHomePage() {
	 boolean displayed = driver.findElement(By.linkText("Leads")).isDisplayed();
	 Assert.assertTrue(displayed);
	 return this;
	
}
public LeadsPage clickOnLeads() {
	driver.findElement(By.linkText("Leads")).click();
	return new LeadsPage();
}
}
