package com.bma.stepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.FilterScreen;
import com.bma.pageObject.WhenAndWhereScreen;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class MakeAppointment_LoggedinUserStep4B_WhenAndWhere_Filter_ScreenSteps extends Utilities {

	public WhenAndWhereScreen WhenAndWhere = new WhenAndWhereScreen(driver);
	public FilterScreen Filter = new FilterScreen(driver);

	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(MakeAppointment_LoggedinUserStep4B_WhenAndWhere_Filter_ScreenSteps.class);

	@Then("^the user should be redirected to filter page$")
	public void user_should_be_redirected_to_filter_pages() throws Throwable {
		Thread.sleep(2000);
		Filter.verifyFilterPage();
		TapElement(Filter._backCTA);
		logger.info("the user should be redirected to filter screen");
	}
	
	@And("^the Apply CTA gets enabled only after the user selects a location from the list$")
	public void Apply_CTA_gets_enabled_only_after_the_user_selects_a_location_from_the_list() throws Throwable {
		softassert.assertTrue(Filter._ApplyCTA.isEnabled());
		softassert.assertAll();
		logger.info("the Apply CTA gets enabled only after the user selects a location from the list");
	}
	
	@And("^the Cancel CTA will be enabled when the user enters a keyword in the search field$")
	public void Cancel_CTA_will_be_enabled_when_the_user_enters_a_keyword_in_the_search_field() throws Throwable {
	    TapElement(Filter._FiltercancelCTA);
		logger.info("the Cancel CTA will be enabled when the user enters a keyword in the search field");
	}
	
	@And("^the user taps on Cancel CTA to restart the search and empty the search field$")
	public void the_user_taps_on_Cancel_CTA_to_restart_the_search_and_empty_the_search_field() throws Throwable {
		String loc= " ";
		softassert.assertNotSame(loc,Filter._SearchCTA.getText());
		softassert.assertAll();
		logger.info("the user taps on Cancel CTA to restart the search and empty the search field");
	}
	
	@And("^the user taps on Apply CTA to get redirected to when and where screen$")
	public void the_user_taps_on_Apply_CTA_to_get_redirected_to_When_and_where_screen() throws Throwable {
		Thread.sleep(2000);
		Assert.assertTrue(WhenAndWhere._whenAndWhereTitle.isDisplayed());
		logger.info("the user taps on Apply CTA to get redirected to When and where screen ");
	}
	
	@And("^the user taps on < from Filter screen  to get redirected to previous when and where screen$")
	public void the_user_taps_on_back_from_Filter_screen_to_get_redirected_to_previous_when_and_where_screen() throws Throwable {
		TapElement(Filter._backCTA);
		Thread.sleep(3000);
		softassert.assertTrue(WhenAndWhere._whenAndWhereTitle.isDisplayed());
		softassert.assertAll();
		logger.info("the user taps on < from Filter screen  to get redirected to previous when and where screen");
	}
	
	@And("^the user taps on X from Filter screen to get redirected to previous when and where screen$")
	public void the_user_taps_on_X_from_Filter_screen_to_get_redirected_to_previous_when_and_where_screen() throws Throwable {
		TapElement(Filter._cancelCTA);
		Thread.sleep(3000);
		softassert.assertTrue(WhenAndWhere._whenAndWhereTitle.isDisplayed());
		softassert.assertAll();
		logger.info("the user taps on X from Filter screen to get redirected to previous when and where screen");
	}
	
	@And("^the user will be displayed with Last visited location or Your preferred location$")
	public void the_user_will_be_displayed_with_Last_visited_location_or_Your_preferred_location() throws Throwable {
		softassert.assertTrue(WhenAndWhere._YourPreferredLocationText.isDisplayed());
		softassert.assertAll();
		logger.info("the user will be displayed with Last visited location or Your preferred location");
	}
	
	@And("^the user is displayed with the six nearest Banfield location based on the chosen city state or zip is displayed$")
	public void the_user_is_displayed_with_the_six_nearest_Banfield_location_based_on_the_chosen_city_state_or_zip_is_displayed() throws Throwable {
		Thread.sleep(3000);
		softassert.assertTrue(WhenAndWhere._hospital8.isDisplayed());
		softassert.assertAll();
		WhenAndWhere.closestlocationforLoggedInUser();
		logger.info("the user is displayed with the six nearest Banfield location based on the chosen city state or zip is displayed");
	}
	
	@And("^the Next CTA is enabled only after selecting location from the list  of  six nearest Banfield location$")
	public void the_Next_CTA_is_enabled_only_after_selecting_location_from_the_list_of_six_nearest_Banfield_location() throws Throwable {
		ScrolltoElement("Garfield");
		TapElement(WhenAndWhere._hospital8);
		softassert.assertTrue(WhenAndWhere._nextCTA.isDisplayed());
		softassert.assertAll();
		logger.info("the Next CTA is enabled only after selecting location from the list  of  six nearest Banfield location");
	}
	
	@And("^the user taps on Next CTA to get redirected to the next screen when & wherew screen$")
	public void the_user_taps_on_Next_CTA_to_get_redirected_to_the_next_screen_when_and_wherew_screen() throws Throwable {
		TapElement(WhenAndWhere._nextCTA);
		Thread.sleep(3000);
		Assert.assertTrue(WhenAndWhere._whenAndWhereTitle.isDisplayed());
		logger.info("the user taps on Next CTA to get redirected to the next screen when & wherew screen");
	}
	
}
