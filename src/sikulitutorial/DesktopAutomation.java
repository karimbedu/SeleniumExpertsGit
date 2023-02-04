package sikulitutorial;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class DesktopAutomation {
	Screen s = new Screen();
  @Test
  public void desktop() throws FindFailed, Exception {
	//s.click("G:\\Lib\\experts\\Start.PNG"); 
	  System.out.println("Click on Windows Start button");
	Thread.sleep(4000);
	s.click("G:\\Lib\\experts\\W.PNG");
	 System.out.println("Click on Wifi icon");
	Thread.sleep(4000);
	//s.type("G:\\Lib\\experts\\Search.PNG", "sikuli");
	Thread.sleep(6000);
//	s.dragDrop("G:\\Lib\\experts\\Any.PNG", "G:\\Lib\\experts\\Selenium.PNG");	
  }
}
