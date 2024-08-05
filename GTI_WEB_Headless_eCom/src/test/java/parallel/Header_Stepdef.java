package parallel;

import com.driverfactory.DriverManager;
import com.resuableMethods.CommonAction;
import com.utilities.Logger;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pom.gti.Header;
import pom.gti.Home;

import java.io.IOException;

public class Header_Stepdef extends CommonAction{
	Header Headerdesktop = new Header(DriverManager.getDriver());
	Home HomeActions = new Home(DriverManager.getDriver());


	@Given("user launches risecannabis {string} website")
	public void user_launches_risecannabis_website(String string) throws IOException {
		DriverManager.getDriver().get(getData("risecannabisQA"));
		Logger.log("User launched the home page URL");
	}

	@Given("user clicks on Yes in Age gate screen")
	public void user_clicks_on_yes_in_age_gate_screen() {
		if (Headerdesktop.getyescta().isDisplayed()){
			clickOn(Headerdesktop.getyescta());
		}

	}

	@When("user clicks on the Accept in cookies gate banner")
	public void user_clicks_on_the_accept_in_cookies_gate_banner() {
		waitFor(2000);
		jsClick(Headerdesktop.getacceptcta());
		Logger.log("user clicks on the Accept in cookies gate banner");
	}

	@When("User is at the top of the page")
	public void user_is_at_the_top_of_the_page() {
		Assert.assertTrue(Headerdesktop.getherocarousel().isDisplayed());
		Logger.log("User is at the top of the page");
	}

	@Then("User should see white color variant global header with RISE Logo and Text")
	public void user_should_see_white_color_variant_global_header_with_rise_logo_and_text() {
		Headerdesktop.headercolor();
		Assert.assertTrue(Headerdesktop.getwhiteheaderlogo().isDisplayed());
		Logger.log("verified white header logo displayed");
		Headerdesktop.whiteheadersearchiconcolor();
		Headerdesktop.whiteheaderaccounticon();
	}

	@When("User scrolls downwards")
	public void user_scrolls_downwards() {
		javascriptScroll(Headerdesktop.getscrolltocategoryheader());
	}

	@Then("User should see stacked green color variant global header with only RISE logo")
	public void user_should_see_stacked_green_color_variant_global_header_with_only_rise_logo() {
		Assert.assertTrue(Headerdesktop.getwhiteheaderlogo().isDisplayed());
		Logger.log("verified green header logo displayed");
		waitFor(1000);
		Headerdesktop.greenheadercolor();
		Headerdesktop.greenheaderaccounticon();
	}

	@Then("The color variant should change back to white and the user goes to top again")
	public void the_color_variant_should_change_back_to_white_and_the_user_goes_to_top_again() {
		javascriptScroll(Headerdesktop.getherocarousel());
		Logger.log("User scroll back to top");
		Headerdesktop.headercolor();
	}

	@When("User is on the expanded SHOP menu")
	public void user_is_on_the_expanded_shop_menu() {
		if (isElementPresent(Headerdesktop.getHamburgerMenu())){
			Headerdesktop.ClickOnHambergerMenu();
			Headerdesktop.clickheadershop();

		}else {
			if (Headerdesktop.getheadershop().isDisplayed()){
				Assert.assertTrue(Headerdesktop.getheadershop().isDisplayed());
				Headerdesktop.clickheadershop();
			}
		}
		Logger.log("User is on the expanded SHOP menu");

	}

	@Then("User should see list of available sub-categories like CATEGORIES, BRANDS, USAGES, DEALS, ALL PRODUCTS")
	public void user_should_see_list_of_available_sub_categories_like_categories_brands_usages_deals_all_products() {
		Assert.assertTrue(Headerdesktop.getexpandedshopcategories().isDisplayed());
		Logger.log("User can able to view categories from expanded shop menu");;
		Assert.assertTrue(Headerdesktop.getexpandedshopbrands().isDisplayed());
		Logger.log("User can able to view the brands from the expanded shop menu");
		Assert.assertTrue(Headerdesktop.getexpandedshopusages().isDisplayed());
		Logger.log("User can able to view the usages from the expanded shop menu");
		Assert.assertTrue(Headerdesktop.getexpandedshopDeals().isDisplayed());
		Logger.log("User can abe to view the Deals from expanded shop menu");
		Assert.assertTrue(Headerdesktop.getExpandedshopAllproducts().isDisplayed());
		Logger.log("User can able to view the all products from expanded menu");
		Logger.log("User should see list of available sub-categories like CATEGORIES, BRANDS, USAGES, DEALS, ALL PRODUCTS");


	}

	@Then("User should also see Full RISE logo with RISE logo and text")
	public void user_should_also_see_full_rise_logo_with_rise_logo_and_text() {
		Assert.assertTrue(Headerdesktop.getgreenheaderlogo().isDisplayed());
		Logger.log("verified green header logo displayed");

	}
	@When("user is on the expanded Cannabis insider menu")
	public void user_is_on_the_expanded_cannabis_insider_menu() {
		if (isElementPresent(Headerdesktop.getHamburgerMenu())){
			Headerdesktop.ClickOnHambergerMenu();
			Headerdesktop.clickHeadercannabisinsider();

		}else {
			if (Headerdesktop.getheadershop().isDisplayed()){
				Headerdesktop.clickheadershop();
			}
		}
		Logger.log("user is on the expanded Cannabis insider menu");
	}

	@Then("user should be able to view the subcategories like DISPENSARY GUIDES, GET A MEDICAL CARD, STATE LAWS, RECIPES, BLOGS")
	public void user_should_be_able_to_view_the_subcategories_like_dispensary_guides_get_a_medical_card_state_laws_recipes_blogs() {
		Assert.assertTrue(Headerdesktop.getexpandedcannabisinsiderdispensaryguide().isDisplayed());
		Logger.log("User can able to view the dispensary guides from expanded cannabis insider menu");
		Assert.assertTrue(Headerdesktop.getexpandedcannabisinsidermedicalcard().isDisplayed());
		Logger.log("User can able to view the get a medical card from expanded cannabis insider menu");
		Assert.assertTrue(Headerdesktop.getexpandedcannabisinsiderstatelaws().isDisplayed());
		Logger.log("User can able to view the state lawse from expanded cannabis insider menu");
		Assert.assertTrue(Headerdesktop.getExpandedcannabisinsiderrecipes().isDisplayed());
		Logger.log("User can able to view the recipes from expanded cannabis insider menu");
		Assert.assertTrue(Headerdesktop.getexpandedcannabisinsiderblogs().isDisplayed());
		Logger.log("User can able to view the Bloges option from expanded cannabis insider menu");
	}

	@Given("user is on any page expect Minnesota dispensary")
	public void user_is_on_any_page_expect_minnesota_dispensary() {
		if (isElementPresent(Headerdesktop.getHamburgerMenu())) {
			Headerdesktop.ClickOnHambergerMenu();
			jsClick(Headerdesktop.getheaderrewards());
//			Headerdesktop.clickhambergurmenuclose_CTA();
		} else {
			if (Headerdesktop.getheaderrewards().isDisplayed()){
				Assert.assertTrue(isElementPresent(Headerdesktop.getheaderrewards()));
				jsClick(Headerdesktop.getheaderrewards());
			}
		}
		Logger.log("User clicks on Rewards option from global header");
		Assert.assertTrue(Headerdesktop.getrewardsheroimage().isDisplayed());
		Logger.log("user is on any page expect Minnesota dispensary");
	}

	@When("user on the global header")
	public void user_on_the_global_header() {
		Assert.assertTrue(Headerdesktop.getheader().isDisplayed());
		Logger.log("user on the global header");
	}

	@When("user clicks on the Rise logo from the global header")
	public void user_clicks_on_the_rise_logo_from_the_global_header() {
		Headerdesktop.clickheaerlogo();
	}

	@Then("user should be navigate to the Rise Homepage")
	public void user_should_be_navigate_to_the_rise_homepage() {
		waitFor(200);
		Assert.assertTrue(HomeActions.getherobanner().isDisplayed());
		Logger.log("user navigated to the Rise Homepage");
	}

	@When("user clicks the dispensaries option from the global header")
	public void user_clicks_the_dispensaries_option_from_the_global_header() {
		if (isElementPresent(Headerdesktop.getHamburgerMenu())){
			Headerdesktop.ClickOnHambergerMenu();
			Headerdesktop.clickheaderdispensary();
		}else {
			if (Headerdesktop.getHeaderdispensaris().isDisplayed()){
				Headerdesktop.clickheaderdispensary();
			}
		}
		Logger.log("user clicks the dispensaries option from the global header");
	}

	@Then("user should view the list of dispensaries")
	public void user_should_view_the_list_of_dispensaries() {
		Assert.assertTrue(Headerdesktop.getexpandeddispensariescalifornia().isDisplayed());
		Logger.log("California dispensary displayed");
		Assert.assertTrue(Headerdesktop.GetexpandeddispensariesConnecticut().isDisplayed());
		Logger.log("Connecticut dispensary displayed");
		Assert.assertTrue(Headerdesktop.getexpandeddispensariesFlorida().isDisplayed());
		Logger.log("Florida dispensary displayed");
		Assert.assertTrue(Headerdesktop.getexpandeddispensariesIllinois().isDisplayed());
		Logger.log("Illinois dispensary displayed");
		Assert.assertTrue(Headerdesktop.getexpandeddispensariesMaryland().isDisplayed());
		Logger.log("Maryland dispensary displayed");
		Assert.assertTrue(Headerdesktop.getexpandeddispensariesMassachusetts().isDisplayed());
		Logger.log("Massachusetts dispensary displayed");
		Assert.assertTrue(Headerdesktop.getexpandeddispensariesMinnesota().isDisplayed());
		Logger.log("Minnesota dispensary displayed");
		Assert.assertTrue(Headerdesktop.getexpandeddispensariesNevada().isDisplayed());
		Logger.log("Nevada dispensary displayed");
		Assert.assertTrue(Headerdesktop.getexpandeddispensariesNewJersey().isDisplayed());
		Logger.log("New Jersey dispensary displayed");
		Assert.assertTrue(Headerdesktop.getexpandeddispensariesNewYork().isDisplayed());
		Logger.log("New York dispensary displayed");
		Assert.assertTrue(Headerdesktop.getexpandeddispensariesOhio().isDisplayed());
		Logger.log("Ohio dispensary displayed");
		Assert.assertTrue(Headerdesktop.getexpandeddispensariesPennsylvania().isDisplayed());
		Logger.log("Pennsylvania dispensary displayed");
		Assert.assertTrue(Headerdesktop.getexpandeddispensariesRhodeIsland().isDisplayed());
		Logger.log("RhodeIsland dispensary displayed");
		Assert.assertTrue(Headerdesktop.getexpandeddispensariesVirginia().isDisplayed());
		Logger.log("Virginia dispensary displayed");

	}

	@When("user clicks on the Rise logo from the footer")
	public void user_clicks_on_the_rise_logo_from_the_footer() {
		Headerdesktop.clickfooterlogo();
	}



	@When("User clicks on Minnesota from the state list")
	public void user_clicks_on_minnesota_from_the_state_list() {
		Headerdesktop.clickMinnesota();
		Headerdesktop.clickminnesotaeagandispensary();
		if (Headerdesktop.getexpandedmenucloseicon().isDisplayed()){
			jsClick(Headerdesktop.getexpandedmenucloseicon());
		}else {
			if(Headerdesktop.getdispensaryclosearrow().isDisplayed()){
				jsClick(Headerdesktop.getdispensaryclosearrow());
			}
		}
	}

	@Then("User should see only Minnesota RISE text logo for the white variant")
	public void user_should_see_only_minnesota_rise_text_logo_for_the_white_variant() {
		Assert.assertTrue(Headerdesktop.getminnesotaheaderlogo().isDisplayed());
		Logger.log("User should see only Minnesota RISE text logo for the white variant");
	}

	@Then("User should see an image in the Desktop")
	public void user_should_see_an_image_in_the_desktop() {
		Assert.assertTrue(Headerdesktop.getdispensaryimage().isDisplayed());
		Logger.log("User should see an image in the Desktop");
	}

	@Given("User clicks on OHIO from the state list")
	public void user_clicks_on_ohio_from_the_state_list() {
		Headerdesktop.clickohiodispensary();
		Headerdesktop.clickohioClevelanddispensary();
		Headerdesktop.clickexpandedmenubackicon();
		if (Headerdesktop.getexpandedmenucloseicon().isDisplayed()){
			jsClick(Headerdesktop.getexpandedmenucloseicon());
		}else {
			if(Headerdesktop.getdispensaryclosearrow().isDisplayed()){
				jsClick(Headerdesktop.getdispensaryclosearrow());
			}
		}
		Logger.log("User clicks on OHIO from the state list");

	}

	@Then("User should not see {string} in the list of available sub-categories like CATEGORIES, BRANDS, USAGES, DEALS, ALL PRODUCTS")
	public void user_should_not_see_in_the_list_of_available_sub_categories_like_categories_brands_usages_deals_all_products(String string) {
		Assert.assertFalse(Headerdesktop.getexpandedshopusages().isDisplayed());
		Logger.log("User is not able to view the shop from the sub-categories");

		Assert.assertTrue(Headerdesktop.getexpandedshopcategories().isDisplayed());
		Logger.log("User can able to view categories from expanded shop menu");;
		Assert.assertTrue(Headerdesktop.getexpandedshopbrands().isDisplayed());
		Logger.log("User can able to view the brands from the expanded shop menu");
		Assert.assertTrue(Headerdesktop.getexpandedshopDeals().isDisplayed());
		Logger.log("User can abe to view the Deals from expanded shop menu");
		Assert.assertTrue(Headerdesktop.getExpandedshopAllproducts().isDisplayed());
		Logger.log("User can able to view the all products from expanded menu");
	}
	@When("user is on Minnesota dispensary page")
	public void user_is_on_minnesota_dispensary_page() {
		Assert.assertTrue(Headerdesktop.getminnesotaheaderlogo().isDisplayed());
		Logger.log("user is on Minnesota dispensary page");
	}


}

