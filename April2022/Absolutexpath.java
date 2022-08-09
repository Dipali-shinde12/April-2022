package April2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolutexpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\visha\\eclipse-workspace\\Selenium_April_22\\Binary\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		
		WebElement userid = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/div/form/div[2]/input"));
		userid.sendKeys("XA0613");
		
		WebElement password = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/div/form/div[3]/input"));
		password.sendKeys("120345");
		
		WebElement LoginBtn = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/div/form/div[4]/button"));
		LoginBtn.click();
		
		
		
		
		
		

	}

}
