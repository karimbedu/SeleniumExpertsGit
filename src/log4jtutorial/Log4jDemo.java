package log4jtutorial;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Log4jDemo {
	WebDriver driver;

	@Test
	public void f() throws InterruptedException {

		Logger log = Logger.getLogger("Google Search");
		PropertyConfigurator.configure("Log4j.properties");

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		log.info("Chrome Browser launch");
		driver.manage().window().maximize();
		log.info("Browser window maximize");
		driver.get("https://www.google.com");
		log.info("Google URL is entered in browser");
		Thread.sleep(2000);
		log.info("Wait for 2 Seconds");
		driver.findElement(By.name("q")).sendKeys("Tirupati");
		log.info("Tirupati text enter in google search");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		log.info("Enter button pressed in keyboard");
	}
}
