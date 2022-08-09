package April2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectordemo {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\visha\\eclipse-workspace\\Selenium_April_22\\Binary\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		//loacator = css selector with id
		//WebElement email = driver.findElement(By.cssSelector("input#email"));
		
		//lo= css selector other attributes classname
		WebElement email = driver.findElement(By.cssSelector("input#email[class='inputtext _55r1 _6luy']"));
		email.sendKeys("dipalishinde@gmail.com");
		
		//css selector with class
		WebElement pass = driver.findElement(By.cssSelector("input.inputtext._55r1._6luy._9npi"));
		pass.sendKeys("vishal1810");
		
		//css selector with other attributes
		//WebElement loginBtn = driver.findElement(By.cssSelector("button[name='login']"));
		
		//parent to child tag
			//WebElement loginBtn = driver.findElement(By.cssSelector("div>button"));
			
			//substring with chatAt
			//WebElement loginBtn = driver.findElement(By.cssSelector("button[class^='_42ft']"));
			
			//substring with dollar
			//WebElement loginBtn = driver.findElement(By.cssSelector("button[class$='_51sy']"));
		
		//substring with star
		WebElement loginBtn = driver.findElement(By.cssSelector("button[class^='_42ft']"));
		
		loginBtn.click();
	
		
	}

}
