package April2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Launch_edge 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.edge.driver", "C:\\Users\\visha\\eclipse-workspace\\Selenium_April_22\\Binary\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.get("https://www.facebook.com");
	WebElement useremail = driver.findElement(By.id("email"));
	WebElement password = driver.findElement(By.id("pass"));
	WebElement loginBtn = driver.findElement(By.name("login"));
	
	useremail.sendKeys("dipalishinde613@gmail.com");
	password.sendKeys("vishal1810");
	loginBtn.click();
	
	
}
}
