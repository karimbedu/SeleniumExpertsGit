package verificationtitleurltext;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class VerificationTabTitleURLText {
	WebDriver driver;

	@Test
	public void webapplictiontitle() {
		driver.get("http://prakampanam.com/");
		
		String exptitle = "Selenium | Automation Tool";
		
		String acttitle = driver.getTitle();
		
		Assert.assertEquals(acttitle, exptitle);
	}
	
	
	@Test
	public void webapplictionurl() {
		driver.get("http://www.prakampanam.com");
		
		String expurl = "http://www.prakampanam.com/";
		
		String acturl = driver.getCurrentUrl();
		
		Assert.assertEquals(acturl, expurl);
		
	}
	
	
	@Test
	public void verifygmailindiamarati() {
		driver.get("https://www.google.com");
		
		String expgmail = "Gmail";
		
		String actgmail = driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[1]/a")).getText();
		Assert.assertEquals(actgmail, expgmail);
		
		String expin ="India";
		
		String actin = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[1]")).getText();
		
		Assert.assertEquals(actin, expin);
		
		
		String expmar ="मराठी";
		
		String actma = driver.findElement(By.xpath("//*[@id=\"SIvCob\"]/a[4]")).getText();
		
		Assert.assertEquals(actma, expmar);
		
		
	}
	

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
