package pages_ServiceNow;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import baseClass_ServiceNow.BaseClass_ServiceNow;

public class UsersPage  extends BaseClass_ServiceNow{

	public CreateIncidentPage selectCallerId() throws InterruptedException {
	
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String>windows1=new ArrayList<String>(windowHandles1);
		driver.switchTo().window(windows1.get(1));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='input-group']/input")).sendKeys("Creator User",Keys.ENTER);
		driver.findElement(By.xpath("//a[text()='Creator User']")).click();
		driver.switchTo().window(windows1.get(0));
		return new CreateIncidentPage();
	}
}