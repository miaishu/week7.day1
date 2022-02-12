package pagesLeaftapsParallelDataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import baseClass.BaseClassParallel;
import baseClass.BaseClassParallel_dataProvider;



public class FindLeadsPage extends BaseClassParallel_dataProvider {
	
		public FindLeadsPage(RemoteWebDriver driver) {
			this.driver= driver;
		}
	
		public static String leadID;

		public FindLeadsPage clickOnPhone() {
			driver.findElement(By.xpath("//span[text()='Phone']")).click();
			return this;
		}
		
		public FindLeadsPage enterPhoneNo(String pNo) {
			driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(pNo);
			return this;
		}
		
		public FindLeadsPage clickOnFindLeads() throws InterruptedException  {
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			Thread.sleep(2000);
			return this;
		}
		public FindLeadsPage getTheLeadID() {
			 leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
			return this;
			
		
		}
		public ViewLeadPage clickOnFirstOption() {
			driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
			return new ViewLeadPage(driver);
		
		}
		
		public FindLeadsPage enterLeadID() {
			driver.findElement(By.xpath("//label[text()='Lead ID:']/following::input")).sendKeys(leadID);
			return this;
		
		}
		
		public void verifyDeleteID() {
			String text = driver.findElement(By.className("x-paging-info")).getText();
			Assert.assertEquals(text,"No records to display");
		}

		

		

}


