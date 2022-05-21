package Runner;

import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import PageObjectModel.Booking;
import PageObjectModel.HomePageuserIcon;
import PageObjectModel.LoginPage;
import PageObjectModel.MoreInfo;
import PageObjectModel.PrivacyPolicy;
import PageObjectModel.Search;
import PageObjectModel.Stores;
import PageObjectModel.StudyPage;
import PageObjectModel.checkHeaderElements;
import PageObjectModel.GiftCard;

import Utilities.Baseclass;

public class TestExecution extends Baseclass {

	private static final String String = null;

	@Test(priority = 1)
	public void loginApp() throws InterruptedException

	{
		logger=report.createTest("Login");
		LoginPage Login = PageFactory.initElements(driver, LoginPage.class);
		Login.login_page();
	}
	@Test(priority = 2)

	public void sofaCart() throws InterruptedException

	{
		logger=report.createTest("sofaCart");
		Booking book = PageFactory.initElements(driver, Booking.class);
		book.sofaBooking();

	}

	@Test(priority = 3)

	public void searchApp() throws InterruptedException

	{
		logger=report.createTest("SearchPage");

		Search searching = PageFactory.initElements(driver, Search.class);
		searching.search_bed();

	}

	@Test(priority = 4)

	public void User() throws InterruptedException

	{
		logger=report.createTest("HomeUserIcon");
		HomePageuserIcon Icon = PageFactory.initElements(driver, HomePageuserIcon.class);
		Icon.User_icon();
	}

	@Test(priority = 5)
	public void giftCard() throws InterruptedException

	{
		logger=report.createTest("GiftCard");

		GiftCard opt = PageFactory.initElements(driver, GiftCard.class);
		opt.gift_card();
	}

	@Test(priority = 6)
	public void study() throws InterruptedException

	{
		logger=report.createTest("StudyPage");
		StudyPage stud = PageFactory.initElements(driver, StudyPage.class);
		stud.studyPage();
	}

	@Test(priority = 7)
	public void store() throws InterruptedException

	{
		logger=report.createTest("Stores");

		Stores store = PageFactory.initElements(driver, Stores.class);
		store.stores();
	}

	@Test(priority = 8)
	public void headerElement() throws InterruptedException

	{
		logger=report.createTest("HeaderElements");

		checkHeaderElements Header = PageFactory.initElements(driver, checkHeaderElements.class);
		Header.Header(String);
	}

	@Test(priority = 9)
	public void more_info() throws InterruptedException
	{
		logger=report.createTest("MoreInfo");

		MoreInfo M_text = PageFactory.initElements(driver, MoreInfo.class);
	    M_text.more_Info();
	}
	@Test(priority = 10)
	public void pri_policy() throws InterruptedException

	{
		logger=report.createTest("PrivacyPolicy");

		PrivacyPolicy P_text = PageFactory.initElements(driver, PrivacyPolicy.class);
		P_text.privacy_policy();
	}
}
