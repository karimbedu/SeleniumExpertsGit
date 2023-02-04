package isdisplayedisselectedisenabled;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class IsEnabledMethod {
	WebDriver driver;

	@Test
	public void isenabled() throws Exception {
		driver.get("http://www.techlearn.in/admin");
		Thread.sleep(3000);
		
		Boolean username = driver.findElement(By.xpath("//*[@id=\"user_login\"]")).isEnabled();
		
		if(username==true)
		{
			System.out.println("Username name text field is available to enter the Username");
		}
		
		else {
			System.out.println("Username name text field is NOT available to enter the Username");
		}
	
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
