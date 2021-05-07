package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.OperatingSystem;

public class TestBase {
	
	
	
public static WebDriver driver;
	
	@BeforeSuite
	public void sestup() {
		
		WebDriverManager.chromedriver().operatingSystem(OperatingSystem.WIN).setup();
		driver =new ChromeDriver();
		
		driver.navigate().to("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
		driver.manage().window().maximize();
		
	}
	
	
	@AfterSuite
	public void close() {
		
		driver.close();
		driver.quit();
	}


}
