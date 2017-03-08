package proj_demo;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

	public class Object_Class {

	@Test

	public void create_project()
	{
		
		System.setProperty("webdriver.firefox.marionette","D:/16D/geckodriver-v0.14.0-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://pvcon:team_pcb@vsrv-ecwrd04:8001");
	    driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@class='ms-cui-tt-span'][text()='Site']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@id='Ribbon.ECWMasterSiteTab.ECWMasterSiteTabGroup.NewProject-Large']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.switchTo().frame(driver.findElement(By.tagName("iframe']")));
		
		driver.quit();
		
		
		}
	 

		
	}


