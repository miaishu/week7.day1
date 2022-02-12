package pages_ServiceNow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import baseClass_ServiceNow.BaseClass_ServiceNow;

public class Incident_ServiceNowPage extends BaseClass_ServiceNow {
	private String incidentno;
	public GroupsPage clickOnSearchInAssignGroup() {
		
		driver.findElement(By.xpath("//button[@id='lookup.incident.assignment_group']/span")).click();
		return new GroupsPage();
		
	}
	public Incident_ServiceNowPage enterWorkNotesForAssign() {
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='gsft_main']"));
		driver.switchTo().frame(frame1);
		WebElement wn= driver.findElement(By.xpath("//textarea[@id='activity-stream-textarea']"));
		wn.clear();
		wn.sendKeys("Changed the Assignment group");
		return this;
	}
	
	public IncidentsPage clickOnUpdate() {
		driver.findElement(By.xpath("//button[text()='Update']")).click();
		return new IncidentsPage();
	}
	
	public Incident_ServiceNowPage selectUrgencyValue() {
		WebElement select = driver.findElement(By.xpath("//div[@id='element.incident.urgency']/div[2]/select"));
		
		Select urgency =new Select(select);
		
		urgency.selectByValue("1");
		return this;
	}
	
	public Incident_ServiceNowPage selectStateValue() {
		WebElement select1 = driver.findElement(By.xpath("//div[@id='element.incident.state']/div[2]/select"));
		
		Select state= new Select(select1);
		state.selectByValue("2");
		return this;
		}
	
	public String getTheIncidentNumber() {
		incidentno = driver.findElement(By.xpath("//div[@id='element.incident.number']/div[2]")).getText();
		return this.incidentno;
	}
	
	public Incident_ServiceNowPage enterWorkNotesForUpdate() {
		driver.findElement(By.xpath("//textarea[@id='activity-stream-work_notes-textarea']")).sendKeys("Updated the urgency & Priority");
		return this;
		}
	
	public  IncidentsPage clickOnDelete() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Delete']")).click();
		driver.findElement(By.xpath("//button[@id='ok_button']")).click();
		Thread.sleep(2000);
		return new IncidentsPage();
	}
}
