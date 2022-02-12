package pages_ServiceNow;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import baseClass_ServiceNow.BaseClass_ServiceNow;

public class LoginPage extends BaseClass_ServiceNow{
	
	public LoginPage enterUserName() {
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='gsft_main']"));
	 	driver.switchTo().frame(frame);
	 	driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin",Keys.TAB);
	 	return new LoginPage();
	}
	
	public LoginPage enterPassword() {
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("Ishu1990");
		return this;
	}
	
	public ServiceNowPage clickOnLogin() {
		driver.findElement(By.id("sysverb_login")).click();
		return new ServiceNowPage();
	}

}
