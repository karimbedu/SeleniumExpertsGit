package arrayList;

import org.testng.annotations.Test;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class NewTabFunctionality {
	WebDriver driver;

	@Test
	public void newTabinBrowser() throws Exception{
		driver.get("https://irctc.co.in/");
		driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[5]/a")).click();
		Thread.sleep(3000);
		ArrayList<String> tab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab.get(1));
		
		driver.findElement(By.xpath("/html/body/app-root/app-header/header/nav/div/div[3]/div/ul/li[2]/a")).click();
		Thread.sleep(3000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[4]/a")).click();
		
	}
	
	@Test
	public void newTabinBrowserDemo() throws Exception{
		driver.get("https://www.google.com/");
		// Opens a new window and switches to new window
		Thread.sleep(3000);
		driver.switchTo().newWindow(WindowType.TAB);
		// Opens techlearn homepage in the newly opened tab
		driver.navigate().to("https://www.facebook.com/");
		
	}
		

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
