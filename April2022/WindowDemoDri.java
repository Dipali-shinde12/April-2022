package April2022;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowDemoDri {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\visha\\eclipse-workspace\\Selenium_April_22\\Binary\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.naukri.com/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		String MainWindow = driver.getWindowHandle();
		
		WebElement jobs = driver.findElement(By.xpath("//div[text()='Jobs']"));
		WebElement companies = driver.findElement(By.xpath("//div[text()='Companies']"));
		//WebElement Services = driver.findElement(By.xpath("//div[text()='Services']"));
		jobs.click();
		companies.click();
		//Services.click();
		
		Set<String> Childwindows = driver.getWindowHandles();
		
		Iterator<String> itr = Childwindows.iterator();
		
		while(itr.hasNext()) {
		String Child_window = itr.next();
		if(!MainWindow.equalsIgnoreCase(Child_window)) {
			driver.switchTo().window(Child_window);
		System.out.println(driver.getTitle());
		
		WebElement Skills = driver.findElement(By.xpath("//div[@id='skill']//input[@name='qp']"));
		WebElement location = driver.findElement(By.xpath("//div[@id='location']//input[@name='ql']"));
		WebElement searchBtn = driver.findElement(By.xpath("//button[@class=\"qsbSrch blueBtn\"]"));
		Skills.sendKeys("selenium");
		location.sendKeys("pune");
		searchBtn.click();
		}
		}
		driver.switchTo().window(MainWindow);
		driver.quit();
	}

}
