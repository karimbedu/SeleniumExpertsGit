package actionsfeatures;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class MouseHover {
	WebDriver driver;

	@Test
	public void mousehoverfeature() throws InterruptedException {
		driver.get("http://www.seleniumlearn.com/");
		Thread.sleep(5000);
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.id("menu-336-1"))).build().perform();
		Thread.sleep(3000);
		act.moveToElement(driver.findElement(By.linkText("Selenium Training"))).click().build().perform();
		
	}
		

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
