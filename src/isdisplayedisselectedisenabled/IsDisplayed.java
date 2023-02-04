package isdisplayedisselectedisenabled;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class IsDisplayed {
	WebDriver driver;

	@Test
	public void isdisplayed() throws Exception {
		driver.get("http://www.techlearn.in/admin");
		Thread.sleep(3000);
		
		Boolean logo = driver.findElement(By.xpath("//*[@id=\"login\"]/h1/a")).isDisplayed();
		
		if(logo==true)
		{
			System.out.println("Techlearn Logo is Displayed");
		}
		
		else 
		{
			System.out.println("Techlearn Logo is NOT Displayed");
		}
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
