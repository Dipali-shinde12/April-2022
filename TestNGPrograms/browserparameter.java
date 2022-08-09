package TestNGPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class browserparameter {
  @Test
  @Parameters("browser")
  public void f(String browser) {
	  if (browser.equalsIgnoreCase("chrome")) {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\visha\\eclipse-workspace\\Selenium_April_22\\Binary\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.google.com");
	  }
	  else if(browser.equals("edge")) {
		  System.setProperty("webdriver.edge.driver","C:\\Users\\visha\\eclipse-workspace\\Selenium_April_22\\Binary\\msedgedriver.exe");
		  WebDriver driver = new EdgeDriver();
		  driver.get("https://www.facebook.com");
	  }
  }
}
