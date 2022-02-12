package pages_ServiceNow;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import baseClass_ServiceNow.BaseClass_ServiceNow;

public class ServiceNowPage extends BaseClass_ServiceNow {
	
	public ServiceNowPage searchOnIncidentInFilters() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='filter']")).sendKeys("incident",Keys.ENTER);
	 	Thread.sleep(1000);
	 	return this;
	}
	
	public ServiceNowPage selectAllInFilters() {
		driver.findElement(By.xpath("//a[@id='b55b4ab0c0a80009007a9c0f03fb4da9']")).click();
		return this;
	}

	public CreateIncidentPage clickOnNew() {
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@id='gsft_main']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//button[text()='New']")).click();
		return new CreateIncidentPage();
		
	}

	public ServiceNowPage selectOpenInFilters() {
		driver.findElement(By.xpath("//div[text()='Open']")).click();
		return this;
	}
	
	public ServiceNowPage selectNumberInDropdown() {
		WebElement frame0 = driver.findElement(By.xpath("//iframe[@id='gsft_main']"));
		driver.switchTo().frame(frame0);
		WebElement filter = driver.findElement(By.xpath("//div[@class='input-group']/span//select"));
		Select search= new Select(filter);
		search.selectByValue("number");
		return this;
	}
	
	public ServiceNowPage enterIncidentNumberForAssign() {
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("INC0010090",Keys.ENTER);
		return this;
	}
	
	public ServiceNowPage enterIncidentNumberForUpdate() {
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("INC0010095",Keys.ENTER);
		return this;
	}
	public ServiceNowPage enterIncidentNumberForDelete() {
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("INC0010094",Keys.ENTER);
		return this;
	}
	public Incident_ServiceNowPage clickOnIncident() {
		driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
		return new Incident_ServiceNowPage();
	}
	
	//another option to select first incident no.for update. verify is an issue here. didnt use
	public ServiceNowPage doubleClickOnPriority() throws InterruptedException {
		WebElement iframe0 = driver.findElement(By.xpath("//iframe[@id='gsft_main']"));
		driver.switchTo().frame(iframe0);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//th[@name='priority']"));
		Actions builder = new Actions(driver);
		builder.doubleClick();
		return this;
	}
	//another option to select first incident no.for update. verify is an issue here. didnt use
	public Incident_ServiceNowPage selectFirstIncident() {
		driver.findElement(By.xpath("//td[@class='vt']/a")).click();
		return new Incident_ServiceNowPage();
	}


	
}



