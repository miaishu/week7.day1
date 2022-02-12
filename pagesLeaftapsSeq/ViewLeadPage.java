package pagesLeaftapsSeq;

import org.openqa.selenium.By;
import org.testng.Assert;

import baseClass.BaseClass;

public class ViewLeadPage extends BaseClass {
	
	public void verifyViewLead() {
		boolean displayed = driver.findElement(By.id("viewLead_firstName_sp")).isDisplayed();
		Assert.assertTrue(displayed);
	}
	 
	public EditLeadPage clickOnEdit() {
		driver.findElement(By.linkText("Edit")).click();
		return new EditLeadPage();
	}
	
	public void VerifyEditLead() {
		boolean displayed = driver.findElement(By.id("viewLead_companyName_sp")).isDisplayed();
		Assert.assertTrue(displayed);
	}
	
	public void verifyMergeLead() {
		boolean displayed = driver.findElement(By.id("viewLead_firstName_sp")).isDisplayed();
		Assert.assertTrue(displayed);
	}
	
	public DuplicateLeadPage clickOnDuplicate() {
		driver.findElement(By.linkText("Edit")).click();
		return new DuplicateLeadPage();
	}
	
	public void VerifyDuplicateLead() {
		boolean displayed = driver.findElement(By.id("viewLead_companyName_sp")).isDisplayed();
		Assert.assertTrue(displayed);
	}
	
	public LeadsPage clickOnDelete() {
		driver.findElement(By.linkText("Delete")).click();
		return new  LeadsPage();
	}
	
	
	}
	

