package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import Utilities.screenshot;

public class Booking {
	WebDriver driver;
	public Booking(WebDriver driver)
	{
		this.driver =driver;
	}
	@FindBy(xpath="(//li[@class='topnav_item topdealsunit'])") WebElement Topdeals;
	@FindBy(xpath="(//li[@class='subnav_item 15068'])") WebElement recliners;
	@FindBy(xpath="(//span[@class='name'])[1]") WebElement Lebrecliner;
	@FindBy(xpath="//button[@data-variantname=\"(One Seater, Smoke Fabric)\"]") WebElement addTo;

	public void sofaBooking() throws InterruptedException
	{
		System.out.println("in sofa book");
		Topdeals.click();
		Thread.sleep(2000);
		recliners.click();
		Thread.sleep(2000);
		Lebrecliner.click();
//		addTo.click();
		driver.navigate().back();
		driver.navigate().back();
		Thread.sleep(2000);

		
		screenshot.captureScreenshots(driver);
		System.out.println("================================");

	}
	
}
