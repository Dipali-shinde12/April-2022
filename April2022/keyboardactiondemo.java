package April2022;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardactiondemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\visha\\eclipse-workspace\\Selenium_April_22\\Binary\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement username = driver.findElement(By.xpath("//input[@id= 'userName']"));
		act.sendKeys(username,"Dipali Shinde").perform();
		
		act.sendKeys(Keys.TAB).perform();
		
		act.sendKeys("dipalishinde613@gmail.com").perform();
		
		act.sendKeys(Keys.TAB).perform();
		
		act.sendKeys("At post patkhal.tal dist satara-415011").perform();
		
		act.keyDown(Keys.CONTROL);
		
		act.sendKeys("a");
		
		act.build().perform();
		
		act.keyUp(Keys.CONTROL).perform();
		
		act.keyDown(Keys.CONTROL);
		
		act.sendKeys("c");
		
		act.build().perform();
		
		act.keyUp(Keys.CONTROL).perform();
		
		act.sendKeys(Keys.TAB).perform();
		
		act.keyDown(Keys.CONTROL);
		
		act.sendKeys("v");
		
		act.build().perform();
		
		act.keyUp(Keys.CONTROL).perform();
		
		act.sendKeys(Keys.TAB).perform();
		
		act.sendKeys(Keys.ENTER).perform();
		
		WebElement forms = driver.findElement(By.xpath("//div[text()='Forms']"));
		act.scrollToElement(forms).perform();
		
		}

}
