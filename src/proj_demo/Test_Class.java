package proj_demo;
import org.testng.annotations.Test;
import utlity.BrowserClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

	public class Test_Class {

	@Test

	public void verify_login()
	{
		

		WebDriver driver =BrowserClass.startBrowser("firefox","http://demosite.center/wordpress/wp-login.php");
		//Initilize the Page objects of Login Page
	    LoginPage loginpage =PageFactory.initElements(driver,LoginPage.class);
		//Passing login method the user name and password of LoginPage class
	    loginpage.login_page("admin","demo123");
	}
	 
	
		
	}


