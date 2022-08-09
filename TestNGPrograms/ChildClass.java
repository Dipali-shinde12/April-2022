package TestNGPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChildClass extends Superclass {
	@Test(dependsOnMethods = "launchBrowser")
	public void checkTitle() {
		String expectedTitle = "Facebook – log in or sign up";
		String ActualTilte = driver.getTitle();
		Assert.assertEquals(ActualTilte, expectedTitle);
	}
	@Test(dependsOnMethods = "checkTitle")
	public void login() {
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		WebElement LoginBtn = driver.findElement(By.xpath("//button[@name='login']"));
		username.sendKeys("dipalishinde613@gmail.com");
		password.sendKeys("123456");
		LoginBtn.click();
	}
@Test(dependsOnMethods = "login")
public void teardown()
{
	driver.close();
}
}
