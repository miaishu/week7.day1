package pages_ServiceNowParallel;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseClass_ServiceNow.BaseClass_ServiceNowParallel;

public class GroupsPage extends BaseClass_ServiceNowParallel {
	
	public GroupsPage(RemoteWebDriver driver) {
		this.driver=driver;
	}

	
	public Incident_ServiceNowPage selectGroupToAssign() throws InterruptedException {
		Set<String> windowHandles = driver.getWindowHandles();
		List<String>windows= new ArrayList<String>(windowHandles);
		driver.switchTo().window(windows.get(1));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='input-group']/input")).sendKeys("Software",Keys.ENTER);
		driver.findElement(By.xpath("//a[text()='Software']")).click();
		Thread.sleep(3000);
		driver.switchTo().window(windows.get(0));
		
		return new Incident_ServiceNowPage(driver);
	}

}
