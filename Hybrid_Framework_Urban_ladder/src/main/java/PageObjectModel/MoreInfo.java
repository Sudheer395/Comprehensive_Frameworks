package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import Utilities.screenshot;

public class MoreInfo {
	WebDriver driver;
	public MoreInfo(WebDriver driver )
	{
		this.driver =driver;
	}
	@FindBy(xpath="( //ul[@class='col-md-6 no-padding bodytext'])[3]") WebElement infotext;

	
	public void more_Info()
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(infotext).perform();
		System.out.println("================================");
		 System.out.println(infotext.getText());
		screenshot.captureScreenshots(driver);
		System.out.println("================================");

	}

}
