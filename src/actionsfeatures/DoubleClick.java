package actionsfeatures;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class DoubleClick {
	WebDriver driver;

	@Test
	public void doubleclickfeature() throws InterruptedException {
		driver.get("http://www.seleniumlearn.com/double-click");
		Thread.sleep(5000);
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"node-104\"]/div/div[1]/div/div/button"))).doubleClick().build().perform();
	}
		

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
