package PageObjectModel;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import Utilities.screenshot;

public class HomePageuserIcon {
WebDriver driver;
	
	public HomePageuserIcon(WebDriver driver )
	{
		this.driver =driver;
	}
		@FindBy(xpath = "//span[contains(@class,'user-profile-icon')]")
		WebElement userUserProfile;
	
	 	@FindBy(xpath = "//a[contains(@href,'profile')]")
	    WebElement profileElement;
	 
	    @FindBy(xpath = "//h1[contains(@class,'account_header')]")
	    WebElement accountHeader;
	    
	    @FindBy(xpath = "//a[contains(@href,'orders')]")
	    WebElement orderElement;
	
	    @FindBy(xpath = "//a[text()='Vouchers']")
	    WebElement voucherElement;
	 
	    
	    public void User_icon() throws InterruptedException{
	    	
	    		userUserProfile.click();
	    		Thread.sleep(3000);
	    		profileElement.click();
	    		Thread.sleep(3000);
	    		screenshot.captureScreenshots(driver);

	    		userUserProfile.click();
	    		Thread.sleep(2000);
	    		orderElement.click();
	    		Thread.sleep(3000);
	    		screenshot.captureScreenshots(driver);

	    		driver.navigate().back();
	    		Thread.sleep(2000);
	    		userUserProfile.click();
	    		Thread.sleep(2000);
	            voucherElement.click();
	    		Thread.sleep(3000);
	    		screenshot.captureScreenshots(driver);


	    }
}
