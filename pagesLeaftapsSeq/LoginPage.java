package pagesLeaftapsSeq;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseClass.BaseClass;

public class LoginPage extends BaseClass {

	
	 
	
	public LoginPage(RemoteWebDriver driver) {
		// TODO Auto-generated constructor stub
	}
	public LoginPage enterUserName() {
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		return new LoginPage();
		
		}
	public LoginPage enterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;
		}
	public HomePage clickOnLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new HomePage();
		}
}
