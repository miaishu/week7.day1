package baseClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ExcelData_Leads;

public class BaseClassParallel_dataProvider {
	
	public RemoteWebDriver driver;
	public String fileName;
	
@BeforeMethod	
public void preCondn() {
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
}
@AfterMethod
public void postCondn() {
	driver.close();
}

@DataProvider(name="fetchData",indices= {1})
public String[][] sendData() throws IOException{
	
	return ExcelData_Leads.readExcel(fileName);
}

}
