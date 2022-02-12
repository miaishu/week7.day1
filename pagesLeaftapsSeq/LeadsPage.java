package pagesLeaftapsSeq;

import org.openqa.selenium.By;

import baseClass.BaseClass;

public class LeadsPage extends BaseClass {
	
	public MyLeadsPage clickOnCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new MyLeadsPage();
	}

	public FindLeadsPage clickOnFindLead() {
		driver.findElement(By.linkText("Find Leads")).click();
		return new FindLeadsPage();
	}
	
	public MergeLeadsPage clickOnMergeLeads() {
		driver.findElement(By.linkText("Merge Leads")).click();
		return new MergeLeadsPage();
	}

	
	
}
