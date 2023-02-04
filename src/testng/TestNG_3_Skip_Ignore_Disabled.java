package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TestNG_3_Skip_Ignore_Disabled {
	WebDriver driver;	

	@Test(priority=1)
	public void twitter() {
		driver.get("https://www.twitter.com");
	}
	
	@Test
	public void google() {
		driver.get("https://www.google.com");	
	}
	
	@Test(enabled=true,priority=2)
	public void facebook() {
		driver.get("https://www.facebook.com");
	}
	
	@Test(priority=3,enabled=false)
	public void gmail() {
		driver.get("https://www.gmail.com");
	}
	
	@Test(priority=0)
	public void selenium() {
		driver.get("https://www.selenium.dev");
	}
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
  }

}
