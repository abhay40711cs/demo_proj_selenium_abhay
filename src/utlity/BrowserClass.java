package utlity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

 public class BrowserClass {

	
	static WebDriver driver;
	
	public static WebDriver startBrowser(String browserType,String url)
	{
		
		if(browserType.equalsIgnoreCase("firefox"))
		{
			   System.setProperty("webdriver.firefox.marionette","D:/16D/geckodriver-v0.14.0-win64/geckodriver.exe");
			  //final FirefoxProfile firefoxProfile = new FirefoxProfile();
 
			   //firefoxProfile.setPreference("xpinstall.signatures.required", false);

				driver =new FirefoxDriver();
		
		
		}
		
		if(browserType.equalsIgnoreCase("crome"))
		{
			System. setProperty("webdriver.chrome.driver", "D:/16D/chromedriver_win32/chromedriver.exe");

				driver =new ChromeDriver();
		}
		
		if(browserType.equalsIgnoreCase("IE"))
		{
				
				driver =new InternetExplorerDriver();
				
		}
		
	driver.manage().window().maximize();
	driver.get("http://demosite.center/wordpress/wp-login.php");
	return driver;
	}
}