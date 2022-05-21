package PageObjectModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import Utilities.screenshot;

public class Search {
WebDriver driver;
	
	public Search(WebDriver driver )
	{
		this.driver =driver;
	}
	@FindBy(xpath="//input[@id='search']") WebElement search_Ele;
    @FindBy(xpath="(//input[@id='filters_availability_In_Stock_Only'])") WebElement checkBox;
    @FindBy(xpath="(//span[@itemprop='name'])[1]") WebElement bed_text;

	public void search_bed() throws InterruptedException
	{
		System.out.println("=insearch");
	    search_Ele.sendKeys("bed");
	    search_Ele.sendKeys(Keys.ENTER);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		checkBox.click();
		Thread.sleep(5000);
		System.out.println(bed_text.getText());
		screenshot.captureScreenshots(driver);

		System.out.println("Search Success");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(500);
		System.out.println("================================");
		
		
	}
}
