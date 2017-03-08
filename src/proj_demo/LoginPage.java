package proj_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * 
 * @author abhayk
 *
 *This class will have locators or the login page, which will interact with our test class
 *
 */

public class LoginPage {

	//Defining  constructor to call this from Test class 
	
	WebDriver driver;
	public LoginPage(WebDriver localdriver){
		
		this.driver=localdriver; 
		
	}
	
	@FindBy(id="user_login")
	WebElement username;
	
	@FindBy(xpath="//input[@id='user_pass']")
	WebElement password;
	
	@FindBy(xpath="//input[@class='button-primary']")
	WebElement button;
	
	
	public void login_page(String uname,String pass)
	{
		
		username.sendKeys(uname);
		password.sendKeys(pass);
		button.click();
	}
	
	
	
}
