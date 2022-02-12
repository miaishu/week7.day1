package pagesLeaftapsParallel;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseClass.BaseClassParallel;

public class LoginPage extends BaseClassParallel {
	
	public LoginPage(RemoteWebDriver driver) {
	this.driver= driver;
	}

	public LoginPage enterUserName() {
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		return new LoginPage(driver);
		
		}
	public LoginPage enterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;
		}
	public HomePage clickOnLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new HomePage(driver);
		}
}
