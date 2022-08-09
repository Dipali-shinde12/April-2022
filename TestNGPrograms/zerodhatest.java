package TestNGPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class zerodhatest {
	public WebDriver driver;
	  @Test(dataProvider = "dp")
	  public void kitelogin(String username, String password, String pin) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\visha\\eclipse-workspace\\Selenium_April_22\\Binary\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://kite.zerodha.com");
		  WebElement Username = driver.findElement(By.xpath("//input[@id='userid']"));
		  WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
		  WebElement loginbtn = driver.findElement(By.xpath("//button[@class='button-orange wide']"));
		  Username.sendKeys(username);
		  Password.sendKeys(password);
		  loginbtn.click();
		  Thread.sleep(1000);
		  WebElement PIN = driver.findElement(By.xpath("//input=[@id='pin']"));
		  WebElement ContinueBtn = driver.findElement(By.xpath("//button[@class='button-orange wide']"));
		  PIN.sendKeys(pin);
		  ContinueBtn.click();
		  Thread.sleep(1000);
		  String ExpectedTitle = "Dashboard / kite";
		  String ActualTilte = driver.getTitle();
		  Assert.assertEquals(ActualTilte, ExpectedTitle);
	  }

	  @DataProvider
	  public Object[][] dp() {
	    return new Object[][] {
	      
	      new Object[] { "XA0634", "Sarika699!", "691991"},
	    };
	  }
}
