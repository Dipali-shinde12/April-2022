package April2022;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Headless_html 
{
public static void main(String[] args) 
{
	HtmlUnitDriver driver = new HtmlUnitDriver();
	driver.get("http://www.facebook.com");
	System.out.println(driver.getTitle());
	
}

}
