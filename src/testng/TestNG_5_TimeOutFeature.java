package testng;

import org.testng.annotations.Test;
import org.junit.Ignore;
import org.junit.jupiter.api.Disabled;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TestNG_5_TimeOutFeature {
	WebDriver driver;

	@Test(timeOut=3000)
	void verifySelenium()  {
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Test
	void verifyTestNG()  {
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("TestNG");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
