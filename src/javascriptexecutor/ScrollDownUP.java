package javascriptexecutor;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;
import org.testng.annotations.BeforeTest;

public class ScrollDownUP {
	WebDriver driver;

	@Test
	public void scrolldown() throws Exception {
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(5000);
		JavascriptExecutor je = (JavascriptExecutor)driver;
        je.executeScript("scroll(0, 2000)"); 		
	}
	
	@Test
	public void scrollup() throws Exception {
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(2000, 0)"); 		
	}
	
	
	@Test
    public void IndentifyLoacatorElement() throws Exception {
    driver.get("https://www.selenium.dev/downloads/");
       {
        WebElement element = (WebElement) driver.findElement(By.xpath("/html/body/div/footer/div/div/div[3]/p/a"));
        Coordinates coordinate = ((Locatable)element).getCoordinates(); 
        coordinate.onPage(); 
        coordinate.inViewPort();
         }    
      }

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

}
