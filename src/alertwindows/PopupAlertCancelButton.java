package alertwindows;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class PopupAlertCancelButton {
	WebDriver driver;

	@Test
	public void alertcancelbutton() throws Exception {
		driver.get("http://seleniumlearn.com/confirmation-dialog-box");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"node-102\"]/div/div[1]/div/div/button")).click();
		Thread.sleep(4000);

		driver.switchTo().alert().dismiss();
		
		//	driver.switchTo().alert().accept();
		
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

}
