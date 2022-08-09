package TestNGPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupDependencydemo {
	public WebDriver driver;
	@Test(groups = "LaunchB")
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\visha\\eclipse-workspace\\Selenium_April_22\\Binary\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test(groups = "CiheckT")
	public void checkTitle() {
		String expectedTitle = "Facebook – log in or sign up";
		String ActualTilte = driver.getTitle();
		Assert.assertEquals(ActualTilte, expectedTitle);
	}
	@Test(groups = "SignIn")
	public void login() {
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		WebElement LoginBtn = driver.findElement(By.xpath("//button[@name='login']"));
		username.sendKeys("dipalishinde613@gmail.com");
		password.sendKeys("123456");
		LoginBtn.click();
	}
@Test(groups = "SignOut")
public void teardown()
{
	driver.close();
}
}
