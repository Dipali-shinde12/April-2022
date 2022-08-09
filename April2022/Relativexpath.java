package April2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relativexpath 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\visha\\eclipse-workspace\\Selenium_April_22\\Binary\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https:www.facebook.com");
	
	//WebElement email  = driver.findElement(By.xpath("//input[@id='email']"));
	
	WebElement email = driver.findElement(By.xpath("//input[@type='text'and@name='email']"));
	//WebElement email = driver.findElement(By.xpath("//input[@class='inputtext _55r1 inputtext _1kbt inputtext _1kbt'or@id='email']"));
	email.sendKeys("dipalishinde@gmail.com");
	
	WebElement password = driver.findElement(By.xpath("//input[contains(@id,'pass')]"));
	password.sendKeys("123456");
	
	//WebElement condiBtn = driver.findElement(By.xpath("//a[text()='Terms']"));
	//condiBtn.click();
	
	//WebElement 
	
	//WebElement loginBtn = driver.findElement(By.xpath("//button[starts-with(@name,'login')]"));
	//loginBtn.click();
	 WebElement forgotten = driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]"));
	 forgotten.click();
}
}
