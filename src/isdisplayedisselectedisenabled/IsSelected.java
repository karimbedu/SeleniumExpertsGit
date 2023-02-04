package isdisplayedisselectedisenabled;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class IsSelected {
	WebDriver driver;

	@Test
	public void isselected() throws Exception {
		driver.get("http://www.techlearn.in/admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).click();
		Thread.sleep(3000);
		
		Boolean remembermecheckbox = driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).isSelected();
		
		if(remembermecheckbox==true)
		{
			System.out.println("Remember Me Checkbox is Selected");
		}
		
		else {
			System.out.println("Remember Me Checkbox is Not Selected");
		}
	
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
