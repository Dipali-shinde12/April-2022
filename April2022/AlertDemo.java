package April2022;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertDemo 
{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\visha\\eclipse-workspace\\Selenium_April_22\\Binary\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/alerts");
	driver.manage().window().maximize();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));	
	WebElement alert = driver.findElement(By.xpath("//button[@id='alertButton']"));
	alert.click();
	
	driver.switchTo().alert().accept();
	
	
	WebElement timeralertBtn = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
	timeralertBtn.click();
	wait.until(ExpectedConditions.alertIsPresent()).accept();
	
	WebElement ConfirmBtn =driver.findElement(By.xpath("//button[@id='confirmButton']"));
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();",ConfirmBtn);
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().dismiss();
	
	WebElement promptBtn = driver.findElement(By.xpath("//button[@id='promtButton']"));
	js.executeScript("arguments[0].click();",promptBtn);
	driver.switchTo().alert().sendKeys("Adhira");
	driver.switchTo().alert().accept();
	
	
}
}
