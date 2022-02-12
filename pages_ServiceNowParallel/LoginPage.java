package pages_ServiceNowParallel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseClass_ServiceNow.BaseClass_ServiceNowParallel;

public class LoginPage extends BaseClass_ServiceNowParallel{
	
	public LoginPage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	
	
	public LoginPage enterUserName() {
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='gsft_main']"));
	 	driver.switchTo().frame(frame);
	 	driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin",Keys.TAB);
	 	return new LoginPage(driver);
	}
	
	public LoginPage enterPassword() {
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("Ishu1990");
		return this;
	}
	
	public ServiceNowPage clickOnLogin() {
		driver.findElement(By.id("sysverb_login")).click();
		return new ServiceNowPage(driver);
	}

}
