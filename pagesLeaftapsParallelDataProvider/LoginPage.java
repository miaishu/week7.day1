package pagesLeaftapsParallelDataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseClass.BaseClassParallel;
import baseClass.BaseClassParallel_dataProvider;

public class LoginPage extends BaseClassParallel_dataProvider {
	
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
