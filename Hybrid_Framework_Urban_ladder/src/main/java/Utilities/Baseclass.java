package Utilities;


import java.io.File;
import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import Reusable.BrowserFactory;

 public class Baseclass {
	public WebDriver driver;
	public ConfigDataproviders config;
    public ExtentReports report;
    public ExtentSparkReporter spark;
    public ExtentTest logger;



@BeforeSuite
public void setupsuite() throws FileNotFoundException
   {
	Reporter.log("Creating reports", true);
	
	config=new ConfigDataproviders();
	report=new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter(new File(System.getProperty("user.dir")+"/Reports_U/Urban"+screenshot.getcurrentDateTime()+".html"));
	spark.config().setTheme(Theme.DARK);
	spark.config().setDocumentTitle("urbanladder_report");
	report.attachReporter(spark);
	Reporter.log("setting Done", true);

    }
	@BeforeClass
	 public void voidsetup()
	 {
		driver=BrowserFactory.startApplication(driver,config.getBrowser(), config.getStagingurl());
	 }
	
	@AfterClass
	 public void teardown() 
	 {
		BrowserFactory.quitBrowser(driver);
		 
	 }
	@AfterMethod
	public void terdown(ITestResult result) 
	{
		if(result.getStatus()==ITestResult.FAILURE)
				{
			screenshot.captureScreenshots(driver);
				}
		report.flush();
	}
	

	
	
		
	}
	
	
	
	
	
	 



