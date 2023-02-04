package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class JunitTutorial {
	static WebDriver driver;
	
	

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.quit();
	}

	@Test
	void signin() throws Exception {
		driver.get("https://www.redmine.org/");
		driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div/ul/li[1]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Prashanthi");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div[1]/div[3]/div[2]/div[1]/form/table/tbody/tr[2]/td[2]/input")).sendKeys("Hello@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"autologin\"]")).click();
		
	}
	
	@Disabled  // Junit 5
	@Test
	void register() throws Exception {
		driver.get("https://www.redmine.org/");
		driver.findElement(By.xpath("//*[@id=\"account\"]/ul/li[2]/a")).click();
	}
	
	@Disabled
	@Test  
	void topmenus() throws Exception {
		driver.get("https://www.redmine.org/");
	driver.findElement(By.xpath("//*[@class=\"home\"]")).click();	
	driver.findElement(By.xpath("//*[@id=\"top-menu\"]/ul/li[2]/a")).click();
	}
	
	@Test
	void logo() throws Exception {
		driver.get("https://www.redmine.org/");
		
	}
	
	@Ignore // Junit 3 and 4
	@Test
	void search() throws Exception {
		driver.get("https://www.redmine.org/");
		driver.findElement(By.xpath("//*[@id=\"q\"]")).sendKeys("Java");
		driver.findElement(By.xpath("//*[@id=\"q\"]")).sendKeys(Keys.ENTER);
	}
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	
	

}
