package TestNGPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class AssertDemo {
	public WebDriver driver;

	@Test
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\visha\\eclipse-workspace\\Selenium_April_22\\Binary\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com");
		
		String ExpectedTitle="Facebook – log in or sign up";
		String ActualTitle = driver.getTitle();
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
		WebElement fblog = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
		Assert.assertTrue(fblog.isDisplayed());
		System.out.println("Welcome to test ng assert");
	}		
}
