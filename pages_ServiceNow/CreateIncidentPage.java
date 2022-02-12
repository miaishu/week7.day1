package pages_ServiceNow;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import baseClass_ServiceNow.BaseClass_ServiceNow;

public class CreateIncidentPage extends BaseClass_ServiceNow {
	private static String attribute;
	
	public UsersPage searchForCallerId() throws InterruptedException {
		driver.findElement(By.xpath("//button[@id='lookup.incident.caller_id']")).click();
		return new UsersPage();

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
		return new IncidentsPage();
	}
}
