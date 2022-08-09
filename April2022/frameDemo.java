package April2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameDemo {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\visha\\eclipse-workspace\\Selenium_April_22\\Binary\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/frames");
	driver.manage().window().maximize();
	
	//String MainWindow = driver.getWindowHandle();(two types switch& getwindowhandle)
	
	driver.switchTo().frame("frame1");
	
	WebElement SampleHeading = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
	System.out.println(SampleHeading.getText());
	
	//driver.switchTo().window(MainWindow);
	
	driver.switchTo().parentFrame();
	driver.switchTo().frame("frame2");
	
	WebElement SampleHeading1 = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
	System.out.println(SampleHeading1.getText());
	
	driver.switchTo().parentFrame();
	
	WebElement pageText = driver.findElement(By.xpath("//div[contains(text(),'Sample Iframe page')]"));
	System.out.println(pageText.getText());
	
	
	
}
}
