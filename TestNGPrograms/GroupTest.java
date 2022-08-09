package TestNGPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupTest {
	public WebDriver driver;
	@Test(groups = {"sanity","regression"},priority = 1)
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\visha\\eclipse-workspace\\Selenium_April_22\\Binary\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test(groups = "regression",priority = 2,enabled = false)
	public void checkTitle() {
		String expectedTitle = "Facebook – log in or sign UP";
		String ActualTilte = driver.getTitle();
		Assert.assertEquals(ActualTilte, expectedTitle);
	}
	@Test(groups ="sanity",priority = 3)
	public void login() {
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		WebElement LoginBtn = driver.findElement(By.xpath("//button[@name='login']"));
		username.sendKeys("dipalishinde613@gmail.com");
		password.sendKeys("123456");
		LoginBtn.click();
	}
@Test(groups = {"sanity","regression"},priority=4)
public void teardown()
{
	driver.close();
}
}
