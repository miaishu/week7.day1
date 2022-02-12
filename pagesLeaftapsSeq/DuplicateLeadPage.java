package pagesLeaftapsSeq;

import org.openqa.selenium.By;

import baseClass.BaseClass;

public class DuplicateLeadPage extends BaseClass{
	
	public ViewLeadPage clickOnCreateLead() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage();
	}

}
