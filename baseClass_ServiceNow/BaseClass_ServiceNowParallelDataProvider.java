package baseClass_ServiceNow;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ExcelData_Leads;

public class BaseClass_ServiceNowParallelDataProvider {
	 public RemoteWebDriver driver; 
	 public String fileName;
	 
	 @BeforeMethod
	 public void preCondn() throws InterruptedException {
	 	
	 	WebDriverManager.chromedriver().setup();
	 	driver=new ChromeDriver();
	 	driver.get("https://dev113523.service-now.com/");
	 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	 	driver.manage().window().maximize();
	 		
	 	}

	 	@AfterMethod
	 	public void postCondn() {
	 		driver.close();
	 	}
	 	
	 	@DataProvider(name="fetchData",indices= {1})
	 	public String[][] sendData()throws IOException {
	 		return ExcelData_Leads.readExcel(fileName);

}
}
