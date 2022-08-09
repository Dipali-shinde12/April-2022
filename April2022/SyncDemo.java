package April2022;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SyncDemo {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\visha\\eclipse-workspace\\Selenium_April_22\\Binary\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		WebElement CreatnewAcc = driver.findElement(By.xpath("//a[contains(@class,'_42ft _4jy0 _6')]"));
		CreatnewAcc.click();
		
		//Static wait
		//Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='firstname']"))).sendKeys("dipali");
		//WebElement Firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		//Firstname.sendKeys("dipali");
		
		WebElement Surname = driver.findElement(By.xpath("//input[@name='lastname']"));
		Surname.sendKeys("Mohite");

		
		
		
	}

}
