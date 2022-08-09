package April2022;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Headless_without_chrome {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.edge.driver","C:\\Users\\visha\\eclipse-workspace\\Selenium_April_22\\Binary\\msedgedriver.exe");

		EdgeOptions opt = new EdgeOptions();
		opt.addArguments("--headless");
		WebDriver driver = new EdgeDriver(opt);
		driver.get("http://www.facebook.com");
		System.out.println(driver.getTitle());
	}

}
