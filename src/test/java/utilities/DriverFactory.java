package utilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory extends GlobalVariables {

	public static WebDriver driver;
	public static WebDriver openBrowser(String browserType) throws IOException
	{
		
		if(browserType.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
	        driver = new ChromeDriver();
	        
	        driver.get(GlobalVariables.extractProperties());
	        return driver;
		}
		else 		{
			System.setProperty("webdriver.gecko.driver","Driver/geckodriver.exe");
	        driver = new FirefoxDriver();
	        return driver;
		}
		
	}
}
