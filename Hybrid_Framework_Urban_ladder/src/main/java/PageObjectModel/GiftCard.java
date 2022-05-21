package PageObjectModel;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import Utilities.screenshot;

public class GiftCard {
WebDriver driver;
	
	public GiftCard(WebDriver driver )
	{
		this.driver =driver;
	}
	
	@FindBy(xpath = "//figure[@class='header__topBar_logo']")
	WebElement logo;
	
	
	@FindBy(xpath = "//a[contains(@href,'gift-cards?src=g_footer')]")
	WebElement giftCard;
	
	@FindBy(xpath = "(//li[@tabindex='0'])[1]") WebElement wedding;
	
	@FindBy(xpath = "(//button[@tabindex='-1'])[1]") WebElement choose;
	
	@FindBy(xpath = "(//h2[@class='_FCNL'])[2]") WebElement text;

    
    public void gift_card() throws InterruptedException{
    		
    		logo.click();
    		Thread.sleep(3000);
    		giftCard.click();
    		Thread.sleep(3000);
    		Actions actions = new Actions(driver);
    		actions.moveToElement(wedding).perform();
       		Thread.sleep(3000);
       		choose.click();
       		Thread.sleep(2000);
    		String ExpectedText = "2. Now, customise your gift card";
    		screenshot.captureScreenshots(driver);

    		Assert.assertEquals(ExpectedText, text.getText());
    		System.out.println("Clicked on wedding");
    		driver.navigate().back();


    }
}