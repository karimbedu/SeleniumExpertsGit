package actionsfeatures;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class KeyboardActions {
	WebDriver driver;

	@Test
	public void keyboardfunctions() throws InterruptedException {
		driver.get("https://www.redmine.org/login");
		Thread.sleep(3000);
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).build().perform();
		
	}
		

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
