package testng;

import org.testng.annotations.Test;
import org.junit.Ignore;
import org.junit.jupiter.api.Disabled;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TestNG_6_DependsOnMethods {
	WebDriver driver;

	@Test(dependsOnMethods="method2")
	void method1() {
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Test
	void method2() {
		driver.get("https://www.google.com");

	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
