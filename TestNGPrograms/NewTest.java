package TestNGPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class NewTest {
	public WebDriver driver;
  @Test(groups = "sanity")
  public void launchChrome() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\visha\\eclipse-workspace\\Selenium_April_22\\Binary\\chromedriver.exe" );
	  driver = new ChromeDriver();
	  driver.get("https://www.Google.com");
  }
  @Test(groups = "regression")
  public void launchEdge() {
	  System.setProperty("webdriver.edge.driver","C:\\Users\\visha\\eclipse-workspace\\Selenium_April_22\\Binary\\msedgedriver.exe" );
	  driver = new EdgeDriver();
	  driver.get("https://www.Google.com");
}
}
