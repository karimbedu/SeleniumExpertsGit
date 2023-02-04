package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocators {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\ABC\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.get("https://archives.peoplesdemocracy.in/");
		Thread.sleep(1000);
		
	List<WebElement> tl = driver.findElements(By.tagName("a"));
	
	
	
	System.out.println("Total Links on Website:--->"+tl.size());
		
//		driver.findElement(By.linkText("Photos")).click();
		Thread.sleep(3000);
//		driver.findElement(By.partialLinkText("News")).click();
/*		driver.findElement(By.id("edit-name")).sendKeys("revanth");
		Thread.sleep(3000);
		driver.findElement(By.name("pass")).sendKeys("Hello@123");
		Thread.sleep(3000);
	//	driver.findElement(By.className("form-submit")).click();
		
	//	driver.findElement(By.cssSelector(".form-submit")).click();
		
		driver.findElement(By.cssSelector("input.form-submit")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("edit-name")).clear();
		Thread.sleep(3000);
		
		driver.findElement(By.id("edit-name")).sendKeys("Ramesh");  */

	}

}
