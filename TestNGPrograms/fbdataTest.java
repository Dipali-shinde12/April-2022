package TestNGPrograms;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class fbdataTest {
	public WebDriver driver;
  @Test(dataProvider = "dp")
  public void fblogin(String username, String password) {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\visha\\eclipse-workspace\\Selenium_April_22\\Binary\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.facebook.com");
	  WebElement Username = driver.findElement(By.xpath("//input[@id='email']"));
	  WebElement Password = driver.findElement(By.xpath("//input[@id='pass']"));
	  WebElement loginbtn = driver.findElement(By.xpath("//button[@name='login']"));
	  Username.sendKeys(username);
	  Password.sendKeys(password);
	  loginbtn.click();
	  String ExpectedTitle = "Facebook";
	  String ActualTilte = driver.getTitle();
	  Assert.assertEquals(ActualTilte, ExpectedTitle);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "dipalishinde613@gmail.com", "123456"},
      new Object[] { "akshayshinde105@gmail.com","123456"},
	new Object[] { "vishalmohite1810@gmail.com","5423"},
    };
  }
}
