package pages_ServiceNowParallelDataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


import baseClass_ServiceNow.BaseClass_ServiceNowParallel;
import baseClass_ServiceNow.BaseClass_ServiceNowParallelDataProvider;

public class IncidentsPage extends BaseClass_ServiceNowParallelDataProvider{
	
	public IncidentsPage  (RemoteWebDriver driver) {
		this.driver=driver;
	}
	
	//public void verifyCreatedIncident() {
		//driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys(attribute,Keys.ENTER);
		//String incidentcreate = driver.findElement(By.xpath("//tbody[@class='list2_body']/tr/td[3]")).getText();
	//}
	public  IncidentsPage selectNumberInDropDown() {
		WebElement filter1 = driver.findElement(By.xpath("//div[@class='input-group']/span//select"));
		Select search1= new Select(filter1);
		search1.selectByValue("number");
		return this;
	}
	public void verifyAssignedGroup() {
		
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("INC0010029");
		String state = driver.findElement(By.xpath("(//td[@class='vt'])[8]")).getText();
		String actualState="Software";
		Assert.assertEquals(actualState,state);
	}

	public void verifyUpdatedIncident(String incno) {
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys(incno);
		String actualState="In Progress";
		String stateLevel= driver.findElement(By.xpath("(//td[@class='vt list_edit_cursor_cell'])[1]")).getText();
		Assert.assertEquals(actualState,stateLevel);
		String priority= driver.findElement(By.xpath("(//td[@class='vt'])[5]")).getText();
		String actualPriority="1 - High";
		Assert.assertEquals(actualPriority,priority);
		
	}

	
	public void verifyDeletedIncident() {
		
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("INC0010097");
		String actualStatus= driver.findElement(By.xpath("//td[@colspan='14']")).getText(); 
		String expectedStatus="No records to display";
		Assert.assertEquals(actualStatus, expectedStatus);
	}
}

