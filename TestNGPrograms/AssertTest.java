package TestNGPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertTest {
		public WebDriver driver;

	@Test(groups="sanity")
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\visha\\eclipse-workspace\\Selenium_April_22\\Binary\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com");
		
		Reporter.log("Welcome to facebook page", true);
		String ExpectedTitle="Facebook – log in or sign Up";
		String ActualTitle = driver.getTitle();
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
		WebElement fblog = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
		Assert.assertTrue(fblog.isDisplayed());
		System.out.println("Welcome to test ng assert");
		
		
}
	@Test  (groups = "regression")
	public void kitelaunch() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\visha\\eclipse-workspace\\Selenium_April_22\\Binary\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://kite.zerodha.com");
		
		Reporter.log("Welcome to zerodha page", true);
		String ExpectedTitle="Kite - Zerodha's fast and elegant flagship trading Platform</title>";
		String ActualTitle = driver.getTitle();
		SoftAssert sAssert = new SoftAssert();
		sAssert.assertEquals(ActualTitle, ExpectedTitle);
		
		WebElement kitelog = driver.findElement(By.xpath("//img[contains(@src,'/static/images/kite-logo.svg')]"));
		Assert.assertTrue(kitelog.isDisplayed());
		System.out.println("Welcome to test ng assert");
		sAssert.assertAll();
}
	@Test(enabled = false)
	public void SkipMethod() {
		
		
		
	}
}






