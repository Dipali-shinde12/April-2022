package April2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class zeroselector {

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\visha\\eclipse-workspace\\Selenium_April_22\\Binary\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://accounts.google.com/");
	
	WebElement id = driver.findElement(By.cssSelector("input#identifierId"));
	id.sendKeys("123456");
	
	WebElement nextBtn = driver.findElement(By.cssSelector("div.VfPpkd.-vQzf8d"));
	nextBtn.click();
	
	WebElement create = driver.findElement(By.cssSelector("div.[class='VfPpkd-RLmnJb']"));
	create.click();
	}

}
