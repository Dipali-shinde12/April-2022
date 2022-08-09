package April2022;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\visha\\eclipse-workspace\\Selenium_April_22\\Binary\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.location='https://demoqa.com/text-box'");
		
		/*driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//input[@id='userName']"));

		js.executeScript("arguments[0].value='Dipali Shinde'", username);
		
		WebElement SubmitBtn = driver.findElement(By.xpath("//button[@id='submit']"));
		js.executeScript("arguments[0].click()", SubmitBtn);
		
		js.executeScript("alert('Welcome in java script executor demo')");
		driver.switchTo().alert().accept();*/
		
		String DomainName = js.executeScript("return document.domain;").toString();
		System.out.println("Domain name of the site = "+DomainName);
		
		String url = js.executeScript("return document.URL;").toString();
		System.out.println("url site = "+url);
		
		String TitleName = js.executeScript("return document.title;").toString();
		System.out.println("Title of the page = "+TitleName);
		
		WebElement checkbox = driver.findElement(By.xpath("//span[text()='Check Box']"));
		js.executeScript("arguments[0].scrollIntoView(true)", checkbox);
		
		js.executeScript("location.reload()");
		
		String sText = js.executeScript("return document.documentElement.innerText").toString();
		System.out.println("Inner Text of web page" +sText);
		
		WebElement logo = driver.findElement(By.xpath("//img[@src='/images/Toolsqa.jpg']"));
		System.out.println(logo.isDisplayed());
		
		WebElement image = driver.findElement(By.xpath("//img[@src='media/50a4515d7570d4d36887427c3a5a0073.svg']"));
		System.out.println(image.isDisplayed());
		
		
		
		
		
		
	}

}
