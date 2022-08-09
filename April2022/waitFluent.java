package April2022;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchContextException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class waitFluent {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\visha\\eclipse-workspace\\Selenium_April_22\\Binary\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/dynamic-properties");
		
		WebElement colorch = driver.findElement(By.xpath("//button[@id='colorChange']"));
		WebElement enable = driver.findElement(By.xpath("//button[@id=\"enableAfter\"]"));
		
		System.out.println("Before button get enable"+enable.isEnabled());
		System.out.println("Before Visible After Button Shown"+colorch.getCssValue("color"));
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		.withTimeout(Duration.ofSeconds(20))
		.pollingEvery(Duration.ofSeconds(5))
		.ignoring(NoSuchContextException.class);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='visibleAfter']")));
		System.out.println("After button get enable"+enable.isEnabled());
		System.out.println("After Visible After Button Shown"+colorch.getCssValue("color"));
	}

}
