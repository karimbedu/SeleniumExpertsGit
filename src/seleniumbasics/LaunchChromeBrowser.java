package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {
	
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "E:\\ABC\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
	//	driver.manage().window().minimize();
		
	//	driver.close();
		
	//	driver.quit();

	}

}
