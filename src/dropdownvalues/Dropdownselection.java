package dropdownvalues;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

class Dropdownselection {
	
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}

	@Test
	void dropdownvalues() throws Exception{
		driver.get("http://baalabharathi.com/upload-story/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@name='field-5vlVJGcSKva7av0']")).sendKeys("517501");
		Thread.sleep(3000);
		new Select(driver.findElement(By.xpath("//*[@id=\"field-5gVECDat8HE4BHW\"]"))).selectByIndex(7);
	//	new Select(driver.findElement(By.xpath("//*[@id=\"field-5gVECDat8HE4BHW\"]"))).selectByValue("CA");
	//	new Select(driver.findElement(By.xpath("//*[@id=\"field-5gVECDat8HE4BHW\"]"))).selectByVisibleText("Australia");
	}

}
