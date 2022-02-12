package pages_ServiceNowParallel;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseClass_ServiceNow.BaseClass_ServiceNowParallel;


public class CreateIncidentPage extends BaseClass_ServiceNowParallel {
	public CreateIncidentPage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	
	
	public String attribute;
	public UsersPage searchForCallerId() throws InterruptedException {
		driver.findElement(By.xpath("//button[@id='lookup.incident.caller_id']")).click();
		return new UsersPage(driver);

	}
	
	public CreateIncidentPage enterShortDesc() {
		WebElement frame4 = driver.findElement(By.xpath("//iframe[@id='gsft_main']"));
		driver.switchTo().frame(frame4);	
		driver.findElement(By.xpath("//input[@id='incident.short_description']")).sendKeys("SystemError");
		return this;
	
	}
	
	public CreateIncidentPage getTheIncidentNumber() {
		WebElement element = driver.findElement(By.xpath("//input[@id='incident.number']"));
		attribute = element.getText();
		return this;
		
		
	}
	
	public IncidentsPage clickOnSubmit() {
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		return new IncidentsPage(driver);
	}
}
