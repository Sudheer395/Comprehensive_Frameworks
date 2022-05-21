package PageObjectModel;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilities.screenshot;

public class StudyPage {

	WebDriver driver;

	public StudyPage(WebDriver driver )
	{
		this.driver =driver;
	}
	@FindBy(xpath="//li[@class='topnav_item studyunit']") WebElement findtext;
	@FindBy(xpath="//li[@class='subnav_item 1600']") WebElement findstudy;
	public void studyPage() throws InterruptedException
	 {
		findtext.click();
		System.out.println("================================");
		Thread.sleep(3000);
		 String str2=findtext.getText();
		 Thread.sleep(3000);
		 System.out.println(str2);
		 screenshot.captureScreenshots(driver);
		 findstudy.click();
		 System.out.println("================================");
			driver.navigate().back();

	 }
}
