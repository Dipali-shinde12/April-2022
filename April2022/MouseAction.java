package April2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\visha\\eclipse-workspace\\Selenium_April_22\\Binary\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement doubleclickBtn = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		act.doubleClick(doubleclickBtn).perform();
		
		WebElement rightclickBtn = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		act.contextClick(rightclickBtn).perform();
		
		WebElement Buttons = driver.findElement(By.xpath("//span[text()='Buttons']"));
		act.moveToElement(Buttons).perform();
		
		WebElement DynamicClickBtn = driver.findElement(By.xpath("//button[text()='Click Me']"));
		act.click().perform();
		
		driver.get("https://www.naukri.com/browse-jobs");
		WebElement jobs = driver.findElement(By.xpath("//div[text()='Jobs']"));
		act.moveToElement(jobs).perform();
		
		driver.get("https://demoqa.com/droppable");
		WebElement inteactions = driver.findElement(By.xpath("//div[text()='Interactions']"));
		act.moveToElement(inteactions).perform();	
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='draggable']//following-sibling::div"));
		act.dragAndDrop(source, target).perform();
		
	}

}
