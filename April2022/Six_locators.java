package April2022;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Six_locators 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\visha\\eclipse-workspace\\Selenium_April_22\\Binary\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		WebElement useremail = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
		
		//WebElement loginBtn = driver.findElement(By.name("login"));
		
		
		useremail.sendKeys("dipalishinde613@gmail.com");
		password.sendKeys("vishal1810");
		//loginBtn.click();
		
		
		//LOCATOR = LinkText
		//WebElement FBPay = driver.findElement(By.linkText("Facebook Pay"));
		//FBPay.click();
		
		//Partial linl locator
		WebElement VIC = driver.findElement(By.partialLinkText("Voting Infor"));
		VIC.click();
		
		
		//driver.get("https://kite.zerodha.com/");
		
		
		//WebElement userid = driver.findElement(By.id("userid"));
		//WebElement password1 = driver.findElement(By.id("password"));
		
		List<WebElement> links = driver.findElements(By.tagName("anchor"));
		System.out.println(links.size());
		if(links.size() !=0) {
			for(WebElement linkname : links) {
				System.out.println(linkname.getText());
			}
		}
		
		//WebElement Login = driver.findElement(By.className("button-orange")); 
		
		//userid.sendKeys("XA0634");
		//password1.sendKeys("123455");
		//Login.click();
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		