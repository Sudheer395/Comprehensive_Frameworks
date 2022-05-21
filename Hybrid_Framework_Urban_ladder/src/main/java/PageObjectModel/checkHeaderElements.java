package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import Utilities.screenshot;

public class checkHeaderElements {
WebDriver driver;
	
	public checkHeaderElements(WebDriver driver )
	{
		this.driver =driver;
	}
	 @FindBy(xpath = "//figure[@class=\"header__topBar_logo\"]")
	    WebElement home_icon;

	public void Header(String expected_header) throws InterruptedException
	{
		home_icon.click();
		Actions actions = new Actions(driver);
		List<WebElement> headerElements = driver.findElements(By.xpath("//li[contains(@class,'topnav_')]"));
		for(int i=0;i<headerElements.size();i++) {
			actions.moveToElement(headerElements.get(i)).perform();
			String uiText = headerElements.get(i).getText();
			System.out.println(uiText);
			screenshot.captureScreenshots(driver);

			Thread.sleep(3000);
		}
		
	}
}
