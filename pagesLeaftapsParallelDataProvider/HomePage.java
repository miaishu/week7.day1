package pagesLeaftapsParallelDataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;


import baseClass.BaseClassParallel;
import baseClass.BaseClassParallel_dataProvider;

public class HomePage extends BaseClassParallel_dataProvider {
	
	public HomePage(RemoteWebDriver driver) {
		this.driver= driver;
		}
	
	public MyHomePage clickCrmSfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage(driver);
	}
	public HomePage verifyHomePage() {
		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		Assert.assertTrue(displayed);
		return this;
		
	}

}
