package pagesLeaftapsParallelDataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;



import baseClass.BaseClassParallel_dataProvider;

public class DuplicateLeadPage extends BaseClassParallel_dataProvider{
	
	public DuplicateLeadPage(RemoteWebDriver driver) {
		this.driver= driver;
		}
	public ViewLeadPage clickOnCreateLead() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver);
	}

}
