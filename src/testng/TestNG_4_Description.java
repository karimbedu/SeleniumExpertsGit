package testng;

import org.testng.annotations.Test;
import org.junit.Ignore;
import org.junit.jupiter.api.Disabled;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TestNG_4_Description {
	WebDriver driver;

	@Test(description="Sign In Module", enabled=false , priority=0)
	void testcase1() throws Exception {
		driver.get("https://www.redmine.org/");
		driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div/ul/li[1]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Prashanthi");
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("/html/body/div/div/div[1]/div[3]/div[2]/div[1]/form/table/tbody/tr[2]/td[2]/input"))
				.sendKeys("Hello@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"autologin\"]")).click();

	}

	@Test (description="Registration Module")
	void testcase2() throws Exception {
		driver.get("https://www.redmine.org/");
		driver.findElement(By.xpath("//*[@id=\"account\"]/ul/li[2]/a")).click();
	}

	@Test(description="Top Menus Module")
	void testcase3() throws Exception {
		driver.get("https://www.redmine.org/");
		driver.findElement(By.xpath("//*[@class=\"home\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"top-menu\"]/ul/li[2]/a")).click();
	}

	@Test(description="Search Module")
	void testcase4() throws Exception {
		driver.get("https://www.redmine.org/");
		driver.findElement(By.xpath("//*[@id=\"q\"]")).sendKeys("Java");
		driver.findElement(By.xpath("//*[@id=\"q\"]")).sendKeys(Keys.ENTER);
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
