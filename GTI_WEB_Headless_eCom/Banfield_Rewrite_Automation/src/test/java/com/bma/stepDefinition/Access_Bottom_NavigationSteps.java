package com.bma.stepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;
import com.bma.Utilities.Utilities;
import com.bma.pageObject.BottomNavigationScreen;
import com.bma.pageObject.ChatScreen;
import com.bma.pageObject.HomeScreen;
import com.bma.pageObject.LoginCredentials;
import com.bma.pageObject.LoginScreen;
import com.bma.pageObject.ProfileScreen;
import com.bma.pageObject.UpcomingAppointmentsScreen;
import com.bma.pageObject.ViewWelcomeScreen;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;



public class Access_Bottom_NavigationSteps extends Utilities {

	public ViewWelcomeScreen ViewWelcome = new ViewWelcomeScreen(driver);
	public BottomNavigationScreen BottomNavigation = new BottomNavigationScreen(driver);
	public ViewWelcomeScreen ViewWelcomeScreen= new ViewWelcomeScreen(driver);
	public ProfileScreen Profile = new ProfileScreen(driver);
	public LoginScreen Login = new LoginScreen(driver);
	public HomeScreen Home = new HomeScreen(driver);
	public LoginCredentials LoginUser = new LoginCredentials(driver);
	public ChatScreen Chat = new ChatScreen(driver);
	public UpcomingAppointmentsScreen UpcomingAppointments = new UpcomingAppointmentsScreen(driver);

	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(Access_Bottom_NavigationSteps.class);

	@When("^user is tapped on Sign In from the Login screen$")
	public void user_is_tapped_on_Sign_In_from_the_Login_screen() {
		TapElement(ViewWelcomeScreen._signInbutton);
		Login.verifyLoginScreen();
		logger.info("user is tapped on Sign In from the Login screen");
	}
	
	@When("^the user is successfully logged in$")
	public void the_user_is_successfully_logged_in() throws Throwable {
		ViewWelcome.verifyWelcomeScreenUIElement();
		TapElement(ViewWelcomeScreen._signInbutton);
		LoginUser.logintoApp();
		logger.info("the user is successfully logged in");
	}
	
	
	@And("^the user should be able to access the bottom Navigation through following tabs Home, Appointments, Chat, Profile$")
	public void the_user_should_be_able_to_access_the_bottom_Navigation_through_tabs() throws Throwable {
		Thread.sleep(1000);
		BottomNavigation.verifybottomnavigationelements();
		logger.info("the user should be able to access the bottom Navigation through following tabs Home, Appointments, Chat, Profile");
	}
	
	@And("^the user will be landing on the Home Tab by default$")
	public void the_user_will_be_landing_on_the_Home_Tab_by_default() throws Throwable {
		TapElement(BottomNavigation._homeCTA);
		Thread.sleep(400);
		Assert.assertTrue(Home._HiUser_header.isDisplayed());
		logger.info("the user will be landing on the Home Tab by default");
	}
	
	@And("^the user taps on Appointments to get redirected to the Appointments screen$")
	public void the_user_taps_on_Appointments_to_get_redirected_to_the_Appointments_screen() throws Throwable {
		TapElement(BottomNavigation._appointments);
		Thread.sleep(2000);
		Assert.assertTrue(UpcomingAppointments._UpcomingAppointmentsTitle.isDisplayed());
		logger.info("the user taps on Appointments to get redirected to the Appointments screen");
	}
	
	@And("^the user taps on Chat to get redirected to the Chat Screen$")
	public void the_user_taps_on_Chat_to_get_redirected_to_the_Chat_Screen() throws Throwable {
		TapElement(BottomNavigation._chatCTA);
		Thread.sleep(2000);
		Assert.assertTrue(Chat._ChatTitle.isDisplayed());
		logger.info("the user taps on Chat to get redirected to the Chat Screen");
	}
	
	@And("^the user taps on Profile to get redirected to the Profile screen$")
	public void the_user_taps_on_Profile_to_get_redirected_to_the_Profile_screen() {
		TapElement(BottomNavigation._profileCTA);
		Assert.assertTrue(Profile._HiUser_header.isDisplayed());
		logger.info("the user taps on Profile to get redirected to the Profile screen");
	}
}
