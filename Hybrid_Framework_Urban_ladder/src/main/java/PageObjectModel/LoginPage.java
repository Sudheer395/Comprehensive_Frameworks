package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilities.screenshot;

public class LoginPage {
WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver =driver;
	}
	
	@FindBy(xpath = "//span[contains(@class,'user-profile-icon')]")
    WebElement userUserProfile;
    
    @FindBy(xpath = "//a[contains(@class,'login-link auth')]")
    WebElement loginLink;
 
    @FindBy(xpath = "(//input[contains(@class,'email required')])[2]")
    WebElement usernameField;
 
    @FindBy(xpath = "(//input[contains(@type,'password')])[2]")
    WebElement passwordField;
 
    @FindBy(xpath = "//input[contains(@value,'Log In')]")
    WebElement loginButton;

	public void login_page() throws InterruptedException {
		
		
		System.out.println("in loginpage");
		userUserProfile.click();
		Thread.sleep(2000);
		loginLink.click();
		usernameField.sendKeys("sudheerbabuaccount@gmail.com");
		passwordField.sendKeys("Sudhir@5900");
		Thread.sleep(2000);
		screenshot.captureScreenshots(driver);

		loginButton.click();

	}

}
