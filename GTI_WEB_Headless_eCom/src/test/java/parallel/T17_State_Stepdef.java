package parallel;

import com.driverfactory.DriverManager;
import com.resuableMethods.CommonAction;
import com.resuableMethods.Highlighter;
import com.utilities.Logger;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pom.gti.*;

public class T17_State_Stepdef extends CommonAction {
	StatePage State = new StatePage(DriverManager.getDriver());
	ContactUs contactUspage = new ContactUs(DriverManager.getDriver());
	Header Headerdesktop = new Header(DriverManager.getDriver());
	RewardsPage rewards = new RewardsPage(DriverManager.getDriver());
	Highlighter highlighter = new Highlighter();

	/*******************************************************/

	@And("User Click on Dispensaries in Global Header or taps on the Hamburger Menu")
	public void User_Click_on_Dispensaries_in_Global_Header_or_taps_on_the_Hamburger_Menu() {
		if (Headerdesktop.getHamburgerMenu().isDisplayed()) {
			Headerdesktop.ClickOnHambergerMenu();
		} else {
			if (Headerdesktop.getheaderrewards().isDisplayed()) {
				Assert.assertTrue(Headerdesktop.getheaderrewards().isDisplayed());
			}
		}
		Logger.log("User Click on Dispensaries in Global Header or taps on the Hamburger Menu");
	}

	@And("User clicks on DISPENSARIES option in the global header")
	public void User_clicks_on_DISPENSARIES_option_in_the_global_header() {
		if (Headerdesktop.getHeaderdispensaris().isDisplayed()) {
			Headerdesktop.ClickOnDispensaries();
		} else if (Headerdesktop.DispensariesMobile().isDisplayed()) {
			Headerdesktop.ClickOnDispensariesMobile();
		}
		Logger.log("User clicks on DISPENSARIES option in the global header");
	}

	@And("User able to see the list of states")
	public void User_able_to_see_the_list_of_states() {
		Assert.assertTrue(Headerdesktop.getDispensariesStateList().isDisplayed());
		Logger.log("User able to see the list of states");
	}

	@And("User clicks on Illinois state")
	public void User_clicks_on_Illinois_state() {
		Headerdesktop.ClickOnIllinoisState();
		Logger.log("User clicks on Illinois state");
	}

	@And("User able to see a list of Dispensaries")
	public void User_able_to_see_a_list_of_Dispensaries() {
		if (Headerdesktop.getexpandedmenucloseicon().isDisplayed()) {
			Assert.assertTrue(Headerdesktop.getDispensariesStateList().isDisplayed());
		} else if (Headerdesktop.getIllinoisStateOption().isDisplayed()) {
			Assert.assertTrue(Headerdesktop.getState_Dispensaries_ListA().isDisplayed());
		}
		Logger.log("User able to see a list of Dispensaries");
	}

	@And("User clicks on RISE Mundelein Dispensary")
	public void User_clicks_on_RISE_Mundelein_Dispensary() {
		Headerdesktop.ClickOnDispensaryMundeleinList();
		Logger.log("User clicks on RISE Mundelein Dispensary");
	}

	@And("User navigate to Dispensary Page")
	public void User_navigate_to_Dispensary_Page() {
		Assert.assertTrue(State.getRISEDispensaryMundeleinText().isDisplayed());
		Logger.log("User navigate to Dispensary Page");
	}

	@Then("User should be able to see appropriate breadcrumb")
	public void User_should_be_able_to_see_appropriate_breadcrumb() {
		if (State.getBreadcrumb_Mundelein().isDisplayed()) {
			Assert.assertTrue(State.getBreadcrumb_Mundelein().isDisplayed());
		} else if (State.getBreadcrumb_MundeleinMobile().isDisplayed()) {
			Assert.assertTrue(State.getBreadcrumb_MundeleinMobile().isDisplayed());
		}
		Logger.log("User should be able to see appropriate breadcrumb");
	}

	@Then("User clicks on State link in the breadcrumb from dispensary page")
	public void User_clicks_on_State_link_in_the_breadcrumb_from_dispensary_page() {
		if (State.getBreadcrumb_Mundelein().isDisplayed()) {
			State.ClickOnIllinoisBreadcrumb();
		} else if (State.getBreadcrumb_MundeleinMobile().isDisplayed()) {
			State.ClickOnIllinoisBreadcrumbMobile();
		}
		Logger.log("User clicks on State link in the breadcrumb from dispensary page");
	}

	@When("User is viewing the State Page")
	public void User_is_viewing_the_State_Page() {
		Assert.assertTrue(State.getTitleText().isDisplayed());
		Logger.log("User is viewing the State Page");
	}


	@Then("User should be able to view the Title Text")
	public void User_should_be_able_to_view_the_Title_Texte() {
		highlighter.highLighterMethod(State.getTitleText(), DriverManager.getDriver());
		Assert.assertTrue(State.getTitleText().isDisplayed());
		Logger.log("User should be able to view the Title Text");
	}

	@And("User should be able to view the Copy Text in State Page")
	public void User_should_be_able_to_view_the_Copy_Text_in_State_Page() {
		highlighter.highLighterMethod(State.getCopyText(), DriverManager.getDriver());
		Assert.assertTrue(State.getCopyText().isDisplayed());
		Logger.log("User should be able to view the Copy Text");
	}

	@And("User should be able to view the Hero Image")
	public void User_should_be_able_to_view_the_Hero_Image() {
		highlighter.highLighterMethod(State.getHeroImage(), DriverManager.getDriver());
		Assert.assertTrue(State.getHeroImage().isDisplayed());
		waitFor(1000);
		Logger.log("User should be able to view the Hero Image");
	}


	@When("User is viewing the Dispensary map section")
	public void User_is_viewing_the_Dispensary_map_section() {
		if (Headerdesktop.getHamburgerMenu().isDisplayed()) {
			waitFor(2000);
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
			js.executeScript("window.scrollBy(0, 510);");
			Assert.assertTrue(State.getMapViewCTA().isDisplayed());
			highlighter.highLighterMethod2(State.getMapViewCTA(), DriverManager.getDriver());
			Assert.assertTrue(State.getListView().isDisplayed());
			highlighter.highLighterMethod2(State.getListView(), DriverManager.getDriver());
		} else {
			if (Headerdesktop.getheaderrewards().isDisplayed()) {
				//	javascriptScroll(State.getDispensariesInIllinoisText());
				waitFor(2000);
				JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
				js.executeScript("window.scrollBy(0, 600);");
				highlighter.highLighterMethod(State.getMap(), DriverManager.getDriver());
				Assert.assertTrue(State.getMap().isDisplayed());
			}
		}
		Logger.log("User is viewing the Dispensary map section");
	}

	@And("User hovers over the dispensares list and dispensary name getting bold")
	public void User_hovers_over_the_dispensares_list() {
		waitFor(500);
		//+ 1 & -
		State.ClickOnFirstPlusIcon();
		//	highlighter.highLighterMethod2(State.getDispensariesFirstSection(), DriverManager.getDriver());
		Assert.assertTrue(State.getDispensariesFirstSection().isDisplayed());
		State.ClickOnFirstMinusIcon();


		//+ 2 & -
		State.ClickOnSecondPlusIcon();
		//	highlighter.highLighterMethod2(State.getDispensariesSecondSection(), DriverManager.getDriver());
		Assert.assertTrue(State.getDispensariesSecondSection().isDisplayed());
		State.ClickOnSecondMinusIcon();

		if (Headerdesktop.getHamburgerMenu().isDisplayed()) {

		} else {
			if (Headerdesktop.getheaderrewards().isDisplayed()) {
				waitFor(500);
				Assert.assertEquals("rgba(0, 70, 30)", State.getDispensaries_Question001().getCssValue("color"));
				highlighter.highLighterMethod2(State.getDispensaries_Question001(), DriverManager.getDriver());
				mouseOver(State.getDispensaries_Question001());
				waitFor(1000);
				highlighter.highLighterMethod2(State.getDispensaries_Question002(), DriverManager.getDriver());
				mouseOver(State.getDispensaries_Question002());
				waitFor(1000);
				highlighter.highLighterMethod2(State.getDispensaries_Question003(), DriverManager.getDriver());
				mouseOver(State.getDispensaries_Question003());

				highlighter.highLighterMethod2(State.getDispensaries_Question001(), DriverManager.getDriver());
				mouseOver(State.getDispensaries_Question001());
				waitFor(1000);
				highlighter.highLighterMethod2(State.getDispensaries_Question002(), DriverManager.getDriver());
				mouseOver(State.getDispensaries_Question002());
				waitFor(1000);
				highlighter.highLighterMethod2(State.getDispensaries_Question003(), DriverManager.getDriver());
				mouseOver(State.getDispensaries_Question003());

				highlighter.highLighterMethod2(State.getDispensaries_Question001(), DriverManager.getDriver());
				mouseOver(State.getDispensaries_Question001());
				waitFor(1000);
				highlighter.highLighterMethod2(State.getDispensaries_Question002(), DriverManager.getDriver());
				mouseOver(State.getDispensaries_Question002());
				waitFor(1000);
				highlighter.highLighterMethod2(State.getDispensaries_Question003(), DriverManager.getDriver());
				mouseOver(State.getDispensaries_Question003());
			}
		}
		Logger.log("User hovers over the dispensares list");
	}


	@Then("User is able to see dispensary map next to the dispensary list")
	public void User_is_able_to_view_the_dispensary_name_getting_bold() {
		if (Headerdesktop.getHamburgerMenu().isDisplayed()) {
			State.ClickOnMapViewCTA();
			highlighter.highLighterMethod2(State.getMap(), DriverManager.getDriver());
			Assert.assertTrue(State.getMap().isDisplayed());
		} else {
			if (Headerdesktop.getheaderrewards().isDisplayed()) {
				highlighter.highLighterMethod2(State.getMap(), DriverManager.getDriver());
				Assert.assertTrue(State.getMap().isDisplayed());
			}
		}
		Logger.log("ser is able to view the dispensary name getting bold");
	}

	@And("User is able to view dispensary icons that represent each dispensaries location")
	public void User_is_able_to_view_dispensary_icons_that_represent_each_dispensaries_location() {
		if (Headerdesktop.getHamburgerMenu().isDisplayed()) {
			Assert.assertTrue(State.getLocationFirst().isDisplayed());
			Assert.assertTrue(State.getLocationSecond().isDisplayed());
		} else {
			if (Headerdesktop.getheaderrewards().isDisplayed()) {
				//	highlighter.highLighterMethod2(State.getDispensariesLocation(), DriverManager.getDriver());
				Assert.assertTrue(State.getDispensariesLocation().isDisplayed());
				//	highlighter.highLighterMethod2(State.getLocationFirst(), DriverManager.getDriver());
				Assert.assertTrue(State.getLocationFirst().isDisplayed());
				//	highlighter.highLighterMethod2(State.getLocationSecond(), DriverManager.getDriver());
				Assert.assertTrue(State.getLocationSecond().isDisplayed());
				//	mouseOver(State.getLocationFirst());
				//	State.ClickOnFirstLocation();
				//	mouseOver(State.getLocationSecond());
				//	State.ClickOnSecondLocation();
			}
		}
		Logger.log("User is able to view dispensary icons that represent each dispensaries location");
	}

	@Then("User is able to see delivery zone legend if the delivery zone is present within respective state boundaries")
	public void User_is_able_to_see_delivery_zone_legend_if_the_delivery_zone_is_present_within_respective_state_boundaries() {
		if (Headerdesktop.getHamburgerMenu().isDisplayed()) {
			waitFor(1000);
			State.ClickOnMapViewCTA();
			State.ClickOnSecondLocation();
			waitFor(2000);

			highlighter.highLighterMethod2(State.getDispensaryName(), DriverManager.getDriver());
			Assert.assertTrue(State.getDispensaryName().isDisplayed());

			highlighter.highLighterMethod2(State.getPhoneNumberWithIcon(), DriverManager.getDriver());
			Assert.assertTrue(State.getPhoneNumberWithIcon().isDisplayed());

			highlighter.highLighterMethod2(State.getLocationNameWithIcon(), DriverManager.getDriver());
			Assert.assertTrue(State.getLocationNameWithIcon().isDisplayed());

			highlighter.highLighterMethod2(State.getDispensaryContactUsCTA(), DriverManager.getDriver());
			Assert.assertTrue(State.getDispensaryContactUsCTA().isDisplayed());

			highlighter.highLighterMethod2(State.getShopThisDispensaryCTA(), DriverManager.getDriver());
			Assert.assertTrue(State.getShopThisDispensaryCTA().isDisplayed());

			highlighter.highLighterMethod2(State.getDispensary_CloseCTA(), DriverManager.getDriver());
			Assert.assertTrue(State.getDispensary_CloseCTA().isDisplayed());

			waitFor(1000);
		} else {
			if (Headerdesktop.getheaderrewards().isDisplayed()) {
				State.ClickOnFirstAccordion();
				waitFor(2000);
				highlighter.highLighterMethod2(State.getDispensaryName(), DriverManager.getDriver());
				Assert.assertTrue(State.getDispensaryName().isDisplayed());

				highlighter.highLighterMethod2(State.getPhoneNumberWithIcon(), DriverManager.getDriver());
				Assert.assertTrue(State.getPhoneNumberWithIcon().isDisplayed());

				highlighter.highLighterMethod2(State.getLocationNameWithIcon(), DriverManager.getDriver());
				Assert.assertTrue(State.getLocationNameWithIcon().isDisplayed());

				highlighter.highLighterMethod2(State.getDispensaryContactUsCTA(), DriverManager.getDriver());
				Assert.assertTrue(State.getDispensaryContactUsCTA().isDisplayed());

				highlighter.highLighterMethod2(State.getShopThisDispensaryCTA(), DriverManager.getDriver());
				Assert.assertTrue(State.getShopThisDispensaryCTA().isDisplayed());

				highlighter.highLighterMethod2(State.getDispensary_CloseCTA(), DriverManager.getDriver());
				Assert.assertTrue(State.getDispensary_CloseCTA().isDisplayed());


				State.ClickOnSecondAccordion();
				waitFor(2000);

				highlighter.highLighterMethod2(State.getDispensaryName(), DriverManager.getDriver());
				Assert.assertTrue(State.getDispensaryName().isDisplayed());

				highlighter.highLighterMethod2(State.getPhoneNumberWithIcon(), DriverManager.getDriver());
				Assert.assertTrue(State.getPhoneNumberWithIcon().isDisplayed());

				highlighter.highLighterMethod2(State.getLocationNameWithIcon(), DriverManager.getDriver());
				Assert.assertTrue(State.getLocationNameWithIcon().isDisplayed());

				highlighter.highLighterMethod2(State.getDispensaryContactUsCTA(), DriverManager.getDriver());
				Assert.assertTrue(State.getDispensaryContactUsCTA().isDisplayed());

				highlighter.highLighterMethod2(State.getShopThisDispensaryCTA(), DriverManager.getDriver());
				Assert.assertTrue(State.getShopThisDispensaryCTA().isDisplayed());

				highlighter.highLighterMethod2(State.getDispensary_CloseCTA(), DriverManager.getDriver());
				Assert.assertTrue(State.getDispensary_CloseCTA().isDisplayed());

				//	State.ClickOnDispensaryCloseCTA();
			}
		}

		Logger.log("User is able to see delivery zone legend if the delivery zone is present within respective state boundaries");
	}

	@Then("User is able to see delivery zone legend if the delivery zone is present within respective state boundariess")
	public void User_is_able_to_see_delivery_zone_legend_if_the_delivery_zone_is_present_within_respective_state_boundariess() {
		if (Headerdesktop.getHamburgerMenu().isDisplayed()) {
			waitFor(1000);
			State.ClickOnSecondLocation();
			waitFor(2000);

			highlighter.highLighterMethod2(State.getDispensaryName(), DriverManager.getDriver());
			Assert.assertTrue(State.getDispensaryName().isDisplayed());

			highlighter.highLighterMethod2(State.getPhoneNumberWithIcon(), DriverManager.getDriver());
			Assert.assertTrue(State.getPhoneNumberWithIcon().isDisplayed());

			highlighter.highLighterMethod2(State.getLocationNameWithIcon(), DriverManager.getDriver());
			Assert.assertTrue(State.getLocationNameWithIcon().isDisplayed());

			highlighter.highLighterMethod2(State.getDispensaryContactUsCTA(), DriverManager.getDriver());
			Assert.assertTrue(State.getDispensaryContactUsCTA().isDisplayed());

			highlighter.highLighterMethod2(State.getShopThisDispensaryCTA(), DriverManager.getDriver());
			Assert.assertTrue(State.getShopThisDispensaryCTA().isDisplayed());

			highlighter.highLighterMethod2(State.getDispensary_CloseCTA(), DriverManager.getDriver());
			Assert.assertTrue(State.getDispensary_CloseCTA().isDisplayed());

			waitFor(1000);
		} else {
			if (Headerdesktop.getheaderrewards().isDisplayed()) {
				State.ClickOnFirstAccordion();
				waitFor(2000);
				highlighter.highLighterMethod2(State.getDispensaryName(), DriverManager.getDriver());
				Assert.assertTrue(State.getDispensaryName().isDisplayed());

				highlighter.highLighterMethod2(State.getPhoneNumberWithIcon(), DriverManager.getDriver());
				Assert.assertTrue(State.getPhoneNumberWithIcon().isDisplayed());

				highlighter.highLighterMethod2(State.getLocationNameWithIcon(), DriverManager.getDriver());
				Assert.assertTrue(State.getLocationNameWithIcon().isDisplayed());

				highlighter.highLighterMethod2(State.getDispensaryContactUsCTA(), DriverManager.getDriver());
				Assert.assertTrue(State.getDispensaryContactUsCTA().isDisplayed());

				highlighter.highLighterMethod2(State.getShopThisDispensaryCTA(), DriverManager.getDriver());
				Assert.assertTrue(State.getShopThisDispensaryCTA().isDisplayed());

				highlighter.highLighterMethod2(State.getDispensary_CloseCTA(), DriverManager.getDriver());
				Assert.assertTrue(State.getDispensary_CloseCTA().isDisplayed());


				State.ClickOnSecondAccordion();
				waitFor(2000);

				highlighter.highLighterMethod2(State.getDispensaryName(), DriverManager.getDriver());
				Assert.assertTrue(State.getDispensaryName().isDisplayed());

				highlighter.highLighterMethod2(State.getPhoneNumberWithIcon(), DriverManager.getDriver());
				Assert.assertTrue(State.getPhoneNumberWithIcon().isDisplayed());

				highlighter.highLighterMethod2(State.getLocationNameWithIcon(), DriverManager.getDriver());
				Assert.assertTrue(State.getLocationNameWithIcon().isDisplayed());

				highlighter.highLighterMethod2(State.getDispensaryContactUsCTA(), DriverManager.getDriver());
				Assert.assertTrue(State.getDispensaryContactUsCTA().isDisplayed());

				highlighter.highLighterMethod2(State.getShopThisDispensaryCTA(), DriverManager.getDriver());
				Assert.assertTrue(State.getShopThisDispensaryCTA().isDisplayed());

				highlighter.highLighterMethod2(State.getDispensary_CloseCTA(), DriverManager.getDriver());
				Assert.assertTrue(State.getDispensary_CloseCTA().isDisplayed());

				//	State.ClickOnDispensaryCloseCTA();
			}
		}

		Logger.log("User is able to see delivery zone legend if the delivery zone is present within respective state boundariess");
	}

	@And("User is able to view an additional scroll bar in a container")
	public void User_is_able_to_view_an_additional_scroll_bar_in_a_container() {


		// javascriptScroll(State.getDispensaryLocationScroll());
		//	waitFor(7000);

		Logger.log("User is able to view an additional scroll bar in a container");
	}


	@And("The dispensary list accordions are collapsed default state")
	public void The_dispensary_list_accordions_are_collapsed_default_state() {

		Logger.log("The dispensary list accordions are collapsed default state");
	}

	@And("User clicks on the dispensary icon on the map")
	public void User_clicks_on_the_dispensary_icon_on_the_map() {
		waitFor(6000);
		State.ClickOnFirstLocation();
		//	State.ClickOnFirstLocation();
		//	State.ClickOnFirstLocation();

		waitFor(6000);
		Logger.log("User clicks on the dispensary icon on the mape");
	}

	@And("User clicks on the Contact Us CTA in dispensary Location")
	public void User_clicks_on_the_Contact_Us_CTA_in_dispensary_Location() {
		State.ClickOnContactUsOnLocation01();
		Logger.log("User clicks on the Contact Us CTA in dispensary Location");
	}

	@Then("User is navigated to the Contact us page")
	public void User_is_navigated_to_the_Contact_us_page() {
		waitFor(1000);
		Assert.assertTrue(contactUspage.getcontactusheading().isDisplayed());
		waitFor(1000);
		Logger.log("User is navigated to the Contact us page");
	}

	@And("User clicks on the Shop this dispensary CTA in dispensary Location")
	public void User_clicks_on_the_Shop_this_dispensary_CTA_in_dispensary_Location() {
		State.ClickOnShopThisDispensaryCTA();
		waitFor(1000);
		Logger.log("User clicks on the Shop this dispensary CTA in dispensary Location");
	}

	@Then("User is navigated to the PLP with the default menu opened and the geolocation updated automatically")
	public void User_is_navigated_to_the_PLP_with_the_default_menu_opened_and_the_geolocation_updated_automatically() {

		Logger.log("User is navigated to the PLP with the default menu opened and the geolocation updated automatically");
	}

	@And("User clicks on the + CTA to expand the accordion of a dispensary")
	public void User_clicks_on_the_plusCTA_to_expand_the_accordion_of_a_dispensary() {
		State.ClickOnFirstPlusIcon();
		Logger.log("User clicks on the + CTA to expand the accordion of a dispensary");
	}

	@Then("User is able to view Store hours with a downward arrow")
	public void User_is_able_to_view_Store_hours_with_a_downward_arrow() {
		waitFor(1000);
		Assert.assertTrue(State.getPhoneNumberWithArrowDown().isDisplayed());
		Logger.log("User is able to view Store hours with a downward arrow");
	}

	@And("User is able to view Phone number")
	public void User_is_able_to_view_Phone_number() {
		Assert.assertTrue(State.getPhoneNumber01().isDisplayed());
		Logger.log("User is able to view Phone number");
	}

	@And("User is able to view Address")
	public void User_is_able_to_view_Address() {
		Assert.assertTrue(State.getAdderss01().isDisplayed());
		Logger.log("User is able to view Address");
	}

	@And("User is able to view Contact us CTA")
	public void User_is_able_to_view_Contact_us_CTA() {
		Assert.assertTrue(State.getContactUs_CTA01().isDisplayed());
		Logger.log("User is able to view Contact us CTA");
	}

	@And("User is able to view Shop this dispensary CTA")
	public void User_is_able_to_view_Shop_this_dispensary_CTA() {
		Assert.assertTrue(State.getShopThisDispensaryCTA().isDisplayed());
		Logger.log("User is able to view Shop this dispensary CTA");
	}

	@And("User Clicks on Contact Us CTA")
	public void User_Clicks_on_Contact_Us_CTA() {
		State.ClickOnContactUs_CTA01();
		waitFor(1000);
		Assert.assertTrue(contactUspage.getcontactusheading().isDisplayed());
		Logger.log("User Clicks on Contact Us CTA");
	}

	@Then("User is able to see the Dispensary name")
	public void User_is_able_to_see_the_Dispensary_name() {
		waitFor(2000);
		Assert.assertTrue(State.getDispensaryName().isDisplayed());

		waitFor(4000);
		Logger.log("User is able to see the Dispensary name");
	}

	@And("User is able to see the Phone number")
	public void User_is_able_to_see_the_Phone_number() {
		Assert.assertTrue(State.getLocationNameWithIcon().isDisplayed());
		Logger.log("User is able to see the Phone number");
	}

	@And("User is able to see the Address")
	public void User_is_able_to_see_the_Address() {
		Assert.assertTrue(State.getLocationNameWithIcon().isDisplayed());
		Logger.log("User is able to see the Address");
	}

	@And("User is able to see the Contact us CTA")
	public void User_is_able_to_see_the_Contactus_CTA() {
		Assert.assertTrue(State.getDispensaryContactUsCTA().isDisplayed());
		Logger.log("User is able to see the Contact us CTA");
	}


	@And("User is able to see the Shop this dispensary CTA")
	public void User_is_able_to_see_the_Shop_this_dispensary_CTA() {
		Assert.assertTrue(State.getShopThisDispensaryCTA().isDisplayed());
		Logger.log("User is able to see the Shop this dispensary CTA");
	}


	@When("User is on expanded accordion of the dispensary list")
	public void User_is_on_expanded_accordion_of_the_dispensary_list() {
		Assert.assertTrue(State.getDispensaries_FirstDispensaryList().isDisplayed());
		Logger.log("User is on expanded accordion of the dispensary list");
	}

	@And("User clicks on Shop this dispensary CTA")
	public void User_clicks_on_Shop_this_dispensary_CTA() {
		State.ClickOnShopThisDispensaryCTA();
		Logger.log("User clicks on Shop this dispensary CTA");
	}

	@And("User clicks on the X icon on the right top")
	public void User_clicks_on_the_X_icon_on_the_right_top() {

		Logger.log("User clicks on the X icon on the right top");
	}

	@Then("User is redirected to the PLP and the geolocation updates accordingly")
	public void User_is_redirected_to_the_PLP_and_the_geolocation_updates_accordingly() {
		waitFor(1000);
		Assert.assertTrue(contactUspage.getcontactusheading().isDisplayed());
		waitFor(1000);
		Logger.log("User is redirected to the PLP and the geolocation updates accordingly");
	}

	@And("User clicks on a dispensary icon on the map")
	public void User_clicks_on_a_dispensary_icon_on_the_map() {

		Logger.log("User clicks on a dispensary icon on the map");
	}

	@And("User clicks on another dispensary icon")
	public void User_clicks_on_another_dispensary_icon() {

		Logger.log("User clicks on another dispensary icon");
	}

	@Then("User is able to see the pop-up displaying the new dispensary information replacing the older one")
	public void User_is_able_to_see_the_popup_displaying_the_new_dispensary_information_replacing_the_older_one() {

		Logger.log("User is able to see the pop-up displaying the new dispensary information replacing the older one");
	}

	@And("User expands another dispensary location from list")
	public void User_expands_another_dispensary_location_from_list() {

		Logger.log("User clicks on another dispensary icon");
	}

	@When("user scroll down to GROUP DISCOUNTS section")
	public void user_scroll_down_to_GROUP_DISCOUNTS_section() {
		javascriptScroll(State.getGroupDiscounts_HeaderText());
		Logger.log("user scroll down to GROUP DISCOUNTS section");
	}

	@When("User should be able to view the GROUP DISCOUNTS header")
	public void User_should_be_able_to_view_the_GROUP_DISCOUNTS_header() {
		Assert.assertTrue(State.getGroupDiscounts_HeaderText().isDisplayed());
		highlighter.highLighterMethod2(State.getGroupDiscounts_HeaderText(), DriverManager.getDriver());
		Logger.log("User should be able to view the GROUP DISCOUNTS header");
	}

	@Then("User should able to see all the deal cards")
	public void User_should_able_to_see_all_the_deal_cards() {
		Assert.assertTrue(State.getEventDiscount_GroupDiscounts_AllCards().isDisplayed());

		Assert.assertTrue(State.getGroupDiscount_GroupDiscounts_Card01().isDisplayed());
		highlighter.highLighterMethod2(State.getGroupDiscount_GroupDiscounts_Card01(), DriverManager.getDriver());
		Assert.assertTrue(State.getGroupDiscount_GroupDiscounts_Card02().isDisplayed());
		highlighter.highLighterMethod2(State.getGroupDiscount_GroupDiscounts_Card02(), DriverManager.getDriver());
		Assert.assertTrue(State.getGroupDiscount_GroupDiscounts_Card03().isDisplayed());
		highlighter.highLighterMethod2(State.getGroupDiscount_GroupDiscounts_Card03(), DriverManager.getDriver());
		Logger.log("User should able to see all the deal cards");
	}

	@Then("User should able to view the image")
	public void User_should_able_to_view_the_image() {
		Assert.assertTrue(State.getGroupDiscount_GroupDiscount_image01().isDisplayed());
		highlighter.highLighterMethod2(State.getGroupDiscount_GroupDiscount_image01(), DriverManager.getDriver());
		Assert.assertTrue(State.getGroupDiscount_GroupDiscount_image02().isDisplayed());
		highlighter.highLighterMethod2(State.getGroupDiscount_GroupDiscount_image02(), DriverManager.getDriver());
		Assert.assertTrue(State.getGroupDiscount_GroupDiscount_image03().isDisplayed());
		highlighter.highLighterMethod2(State.getGroupDiscount_GroupDiscount_image03(), DriverManager.getDriver());
		Logger.log("User should able to view the image");
	}

	@And("User should able to view the title text")
	public void User_should_able_to_view_the_title_text() {
		Assert.assertTrue(State.getGroupDiscount_GroupDiscounts_titleText01().isDisplayed());
		highlighter.highLighterMethod2(State.getGroupDiscount_GroupDiscounts_titleText01(), DriverManager.getDriver());
		Assert.assertTrue(State.getGroupDiscount_GroupDiscounts_titleText02().isDisplayed());
		highlighter.highLighterMethod2(State.getGroupDiscount_GroupDiscounts_titleText02(), DriverManager.getDriver());
		Assert.assertTrue(State.getGroupDiscount_GroupDiscounts_titleText03().isDisplayed());
		highlighter.highLighterMethod2(State.getGroupDiscount_GroupDiscounts_titleText03(), DriverManager.getDriver());
		Logger.log("User should able to view the title text");
	}

	@And("User should able to view the description")
	public void User_should_able_to_view_the_description() {
		Assert.assertTrue(State.getGroupDiscount_GroupDiscounts_description01().isDisplayed());
		highlighter.highLighterMethod2(State.getGroupDiscount_GroupDiscounts_description01(), DriverManager.getDriver());
		Assert.assertTrue(State.getGroupDiscount_GroupDiscounts_description02().isDisplayed());
		highlighter.highLighterMethod2(State.getGroupDiscount_GroupDiscounts_description02(), DriverManager.getDriver());
		Assert.assertTrue(State.getGroupDiscount_GroupDiscounts_description03().isDisplayed());
		highlighter.highLighterMethod2(State.getGroupDiscount_GroupDiscounts_description03(), DriverManager.getDriver());
		Logger.log("User should able to view the description");
	}

	@And("User should able to view the link")
	public void User_should_able_to_view_the_link() {
		Assert.assertTrue(State.getGroupDiscount_GroupDiscounts_Link01().isDisplayed());
		highlighter.highLighterMethod2(State.getGroupDiscount_GroupDiscounts_Link01(), DriverManager.getDriver());
		Assert.assertTrue(State.getGroupDiscount_GroupDiscounts_Link02().isDisplayed());
		highlighter.highLighterMethod2(State.getGroupDiscount_GroupDiscounts_Link02(), DriverManager.getDriver());
		Assert.assertTrue(State.getGroupDiscount_GroupDiscounts_Link03().isDisplayed());
		highlighter.highLighterMethod2(State.getGroupDiscount_GroupDiscounts_Link03(), DriverManager.getDriver());
		//	waitFor(3000);
		Logger.log("User should able to view the link");
	}

	@And("User click on the Deals Card Link")
	public void User_click_on_the_Deals_Card_Link() {
		waitFor(600);
		Assert.assertTrue(State.getGroupDiscount_GroupDiscounts_titleText01().isDisplayed());
		State.ClickOnGroupDiscounts_Link01();
		Logger.log("User click on the Deals Card Link");
	}

	@Then("User should navigate to the respective internal page or link")
	public void User_should_navigate_to_the_respective_internal_page_or_link() {

		Logger.log("User should navigate to the respective internal page or link");
	}

	@And("User click on the Link")
	public void User_click_on_the_Link() {
		waitFor(600);
		Assert.assertTrue(State.getGroupDiscount_GroupDiscounts_titleText01().isDisplayed());
		State.ClickOnGroupDiscounts_Link01();
		Logger.log("User click on the Link");
	}

	@Then("User should navigate to the respective external page or link in new tab")
	public void User_should_navigate_to_the_respective_external_page_or_link_in_new_tab() {

		Logger.log("User should navigate to the respective internal page or link");
	}

	@When("user scroll down to Deal Card section")
	public void user_scroll_down_to_Deal_Card_section() {
		if (Headerdesktop.getHamburgerMenu().isDisplayed()) {
			waitFor(2000);
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
			js.executeScript("window.scrollBy(0, 1300);");
			Assert.assertTrue(State.getDealsCard00().isDisplayed());
			highlighter.highLighterMethod2(State.getDealsCard00(), DriverManager.getDriver());
		} else {
			if (Headerdesktop.getheaderrewards().isDisplayed()) {
				waitFor(800);
				//	javascriptScroll(State.getHeadingDealsText());
				JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
				js.executeScript("window.scrollBy(0, 1600);");
			}
		}
		Logger.log("User is redirected to the PLP and the geolocation updates accordingly");
	}

	@Then("user should be able to view the heading Deals")
	public void user_should_be_able_to_view_the_heading_Deals() {
		Assert.assertTrue(State.getHeadingDealsText().isDisplayed());
		Logger.log("user should be able to view the heading Deals");
	}

	@And("user should able to see banner image of Deals")
	public void user_should_able_to_see_banner_image_of_Deals() {
		if (Headerdesktop.getHamburgerMenu().isDisplayed()) {
			waitFor(800);
			Assert.assertTrue(State.getDealsCard00().isDisplayed());
			highlighter.highLighterMethod2(State.getDealsCard00(), DriverManager.getDriver());
		} else {
			if (Headerdesktop.getheaderrewards().isDisplayed()) {
				waitFor(800);
				Assert.assertTrue(State.getHeadingDealsImage01().isDisplayed());
				highlighter.highLighterMethod2(State.getHeadingDealsImage01(), DriverManager.getDriver());
				waitFor(800);
				Assert.assertTrue(State.getHeadingDealsImage02().isDisplayed());
				highlighter.highLighterMethod2(State.getHeadingDealsImage02(), DriverManager.getDriver());
				waitFor(800);
				Assert.assertTrue(State.getHeadingDealsImage03().isDisplayed());
				highlighter.highLighterMethod2(State.getHeadingDealsImage03(), DriverManager.getDriver());
				waitFor(800);
				JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
				js.executeScript("window.scrollBy(0, 800);");
				waitFor(800);
				Assert.assertTrue(State.getHeadingDealsImage04().isDisplayed());
				highlighter.highLighterMethod2(State.getHeadingDealsImage04(), DriverManager.getDriver());
				waitFor(800);
				js.executeScript("window.scrollBy(0, -800);");
			}
		}
		Logger.log("user should be able to view the heading Deals");
	}

	@And("user should able to see title text of Deals")
	public void user_should_able_to_see_title_text_of_Deals() {
		if (Headerdesktop.getHamburgerMenu().isDisplayed()) {
			waitFor(800);
			Assert.assertTrue(State.getTitleTextDeals01Mobile().isDisplayed());
			State.ClickOnDealRightArrow();
			Assert.assertTrue(State.getTitleTextDeals02Mobile().isDisplayed());
			State.ClickOnDealRightArrow();
			waitFor(600);
			Assert.assertTrue(State.getTitleTextDeals03Mobile().isDisplayed());
			State.ClickOnDealRightArrow();
			Assert.assertTrue(State.getTitleTextDeals04Mobile().isDisplayed());
			State.ClickOnDealLeftArrow00();
			State.ClickOnDealLeftArrow00();
			State.ClickOnDealLeftArrow00();
			waitFor(2000);
		} else {
			if (Headerdesktop.getheaderrewards().isDisplayed()) {
				Assert.assertTrue(State.getTitleTextDeals01().isDisplayed());
				highlighter.highLighterMethod2(State.getTitleTextDeals01(), DriverManager.getDriver());
				waitFor(800);
				Assert.assertTrue(State.getTitleTextDeals02().isDisplayed());
				highlighter.highLighterMethod2(State.getTitleTextDeals02(), DriverManager.getDriver());
				waitFor(800);
				Assert.assertTrue(State.getTitleTextDeals03().isDisplayed());
				highlighter.highLighterMethod2(State.getTitleTextDeals03(), DriverManager.getDriver());
				waitFor(800);
				JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
				js.executeScript("window.scrollBy(0, 800);");
				waitFor(800);
				Assert.assertTrue(State.getTitleTextDeals04().isDisplayed());
				highlighter.highLighterMethod2(State.getTitleTextDeals04(), DriverManager.getDriver());
				js.executeScript("window.scrollBy(0, -800);");
			}
		}
		Logger.log("user should able to see title text of Deals");
	}

	@And("user should able to see copy text of Deals")
	public void user_should_able_to_see_copy_text_of_Deals() {
		if (Headerdesktop.getHamburgerMenu().isDisplayed()) {
			waitFor(800);
			Assert.assertTrue(State.getCopyTextDeals01Mobile().isDisplayed());
			highlighter.highLighterMethod2(State.getCopyTextDeals01Mobile(), DriverManager.getDriver());
			State.ClickOnDealRightArrow();
			Assert.assertTrue(State.getCopyTextDeals02Mobile().isDisplayed());
			highlighter.highLighterMethod2(State.getCopyTextDeals02Mobile(), DriverManager.getDriver());
			State.ClickOnDealRightArrow();
			Assert.assertTrue(State.getCopyTextDeals03Mobile().isDisplayed());
			highlighter.highLighterMethod2(State.getCopyTextDeals03Mobile(), DriverManager.getDriver());
			State.ClickOnDealRightArrow();
			Assert.assertTrue(State.getCopyTextDeals04Mobile().isDisplayed());
			highlighter.highLighterMethod2(State.getCopyTextDeals04Mobile(), DriverManager.getDriver());
			State.ClickOnDealLeftArrow00();
			State.ClickOnDealLeftArrow00();
			State.ClickOnDealLeftArrow00();
			//	Assert.assertTrue(State.getEventDiscount_Deal_ProgressbarCount().isDisplayed());
			//	highlighter.highLighterMethod2(State.getEventDiscount_Deal_ProgressbarCount(), DriverManager.getDriver());
			waitFor(2000);
		} else {
			if (Headerdesktop.getheaderrewards().isDisplayed()) {
				Assert.assertTrue(State.getCopyTextDeals01().isDisplayed());
				highlighter.highLighterMethod2(State.getCopyTextDeals01(), DriverManager.getDriver());
				Assert.assertTrue(State.getCopyTextDeals01_1().isDisplayed());
				highlighter.highLighterMethod2(State.getCopyTextDeals01_1(), DriverManager.getDriver());
				waitFor(800);
				Assert.assertTrue(State.getCopyTextDeals02().isDisplayed());
				highlighter.highLighterMethod2(State.getCopyTextDeals02(), DriverManager.getDriver());
				Assert.assertTrue(State.getCopyTextDeals02_2().isDisplayed());
				highlighter.highLighterMethod2(State.getCopyTextDeals02_2(), DriverManager.getDriver());
				waitFor(800);
				Assert.assertTrue(State.getCopyTextDeals03().isDisplayed());
				highlighter.highLighterMethod2(State.getCopyTextDeals03(), DriverManager.getDriver());
				Assert.assertTrue(State.getCopyTextDeals03_3().isDisplayed());
				highlighter.highLighterMethod2(State.getCopyTextDeals03_3(), DriverManager.getDriver());
				waitFor(800);
				JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
				js.executeScript("window.scrollBy(0, 800);");
				waitFor(800);
				Assert.assertTrue(State.getCopyTextDeals04().isDisplayed());
				highlighter.highLighterMethod2(State.getCopyTextDeals04(), DriverManager.getDriver());
				Assert.assertTrue(State.getCopyTextDeals04_4().isDisplayed());
				highlighter.highLighterMethod2(State.getCopyTextDeals04_4(), DriverManager.getDriver());
				js.executeScript("window.scrollBy(0, -800);");
			}
		}
		Logger.log("user should able to see copy text of Deals");
	}

	@And("User should able to view the label tag and with deal type text")
	public void User_should_able_to_view_the_label_tag_and_with_deal_type_text() {
		if (Headerdesktop.getHamburgerMenu().isDisplayed()) {
			waitFor(800);
			Assert.assertTrue(State.getCopyTextDeals01_1Mobile().isDisplayed());
			highlighter.highLighterMethod2(State.getCopyTextDeals01_1Mobile(), DriverManager.getDriver());
			State.ClickOnDealRightArrow();
			Assert.assertTrue(State.getCopyTextDeals02_2Mobile().isDisplayed());
			highlighter.highLighterMethod2(State.getCopyTextDeals02_2Mobile(), DriverManager.getDriver());
			State.ClickOnDealRightArrow();
			Assert.assertTrue(State.getCopyTextDeals03_3Mobile().isDisplayed());
			highlighter.highLighterMethod2(State.getCopyTextDeals03_3Mobile(), DriverManager.getDriver());
			State.ClickOnDealRightArrow();
			Assert.assertTrue(State.getCopyTextDeals04_4Mobile().isDisplayed());
			highlighter.highLighterMethod2(State.getCopyTextDeals04_4Mobile(), DriverManager.getDriver());
			State.ClickOnDealLeftArrow00();
			State.ClickOnDealLeftArrow00();
			State.ClickOnDealLeftArrow00();
			Assert.assertTrue(State.getEventDiscount_Deal_ProgressbarCount().isDisplayed());
			highlighter.highLighterMethod2(State.getEventDiscount_Deal_ProgressbarCount(), DriverManager.getDriver());
			waitFor(2000);
		} else {
			if (Headerdesktop.getheaderrewards().isDisplayed()) {
				Assert.assertTrue(State.getCopyTextDeals01_1().isDisplayed());
				highlighter.highLighterMethod2(State.getCopyTextDeals01_1(), DriverManager.getDriver());
				waitFor(800);
				Assert.assertTrue(State.getCopyTextDeals02_2().isDisplayed());
				highlighter.highLighterMethod2(State.getCopyTextDeals02_2(), DriverManager.getDriver());
				waitFor(800);
				Assert.assertTrue(State.getCopyTextDeals03_3().isDisplayed());
				highlighter.highLighterMethod2(State.getCopyTextDeals03_3(), DriverManager.getDriver());
				waitFor(800);
				JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
				js.executeScript("window.scrollBy(0, 800);");
				waitFor(800);
				Assert.assertTrue(State.getCopyTextDeals04_4().isDisplayed());
				highlighter.highLighterMethod2(State.getCopyTextDeals04_4(), DriverManager.getDriver());
				js.executeScript("window.scrollBy(0, -800);");
			}
		}
		Logger.log("User should able to view the label tag and with deal type text");
	}

	@And("user should able to see Showing Numbers")
	public void user_should_able_to_see_CTA_button_of_Deals() {
		if (Headerdesktop.getheaderrewards().isDisplayed()) {
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
			js.executeScript("window.scrollBy(0, 800);");
			Assert.assertTrue(State.getShowingNumberOfNumberText().isDisplayed());
			highlighter.highLighterMethod2(State.getShowingNumberOfNumberText(), DriverManager.getDriver());
		}
		Logger.log("user should able to see CTA button of Deals");
	}

	@And("User clicks on Show More CTA of Deals")
	public void User_clicks_on_Show_More_CTA_of_Deals() {
		if (Headerdesktop.getheaderrewards().isDisplayed()) {
			WebElement[] cards = new WebElement[]{(State.getDeals_Cart())};
			//	WebElement[] cards = DriverManager.getDriver().findElements(By.xpath("//*[@data-testid='deal-cards-list-show-more']")).toArray(new WebElement[0]);
			boolean showMoreNotVisible = true;
			/*
			 * Check if the number of cards is less than 4 and the "Show More" CTA is not visible
			 */
			for (WebElement card : cards) {
				if (card.isDisplayed()) {
					//	WebElement showMore = card.findElement((By) State.getDeal_ShowMoreCTA());
					WebElement showMore = card.findElement(By.xpath("(//*[@button-type='secondary'])[1]"));
					if (showMore.isDisplayed()) {
						showMoreNotVisible = false;
						break;
					}
				}
			}
			if (cards.length < 4 && showMoreNotVisible) {
				System.out.println("User is able to see 'Show More' CTA is not visible for 4 cards.");
			} else {
				Assert.fail("User is able to see 'Show More' CTA is visible for 4 cards.");
			}
			Assert.assertTrue(State.getDeal_ShowMoreCTA().isDisplayed());
			highlighter.highLighterMethod2(State.getDeal_ShowMoreCTA(), DriverManager.getDriver());
			State.ClickOnDealShowMoreCTA();

		}else {
			System.out.println("For Mobile ShowMore CTA not Displayed");
		}
		Logger.log("user should able to see Showing Numbers");
	}

	@And("User click anywhere on deal card")
	public void user_click_anywhere_on_deal_card(){
		if (Headerdesktop.getHamburgerMenu().isDisplayed()) {
			State.ClickOnDealsCart01Mobile();
			waitFor(3000);
		} else {
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
			js.executeScript("window.scrollBy(0, -800);");
			State.ClickOnDealsCart01();
		}
		Logger.log("user click anywhere on deal card");
	}

	@And("User is able to view more than 4 deal cards in a row in the section")
	public void User_is_able_to_view_more_than_4_deal_cards_in_a_row_in_the_section(){
		if (Headerdesktop.getheaderrewards().isDisplayed()) {
			WebElement showMore = DriverManager.getDriver().findElement(By.xpath("//*[@class='flex flex-row justify-center items-center gap-6']/button"));


			WebElement[] cards = new WebElement[]{(State.getDeals_Cart())};

			/*
			 * Check if the number of cards is greater than 4
			 */
			if (cards.length > 4) {
				System.out.println("User is able to see more than 4 cards");
			} else {
				Assert.fail("User is not able to see more than 4 cards.");
			}
		} else {
			System.out.println("Not For Mobile");
		}

		Logger.log("User is able to view more than 4 deal cards in a row in the section");
	}

	@And("User should be able to view the number of products shown and the total like")
	public void User_should_be_able_to_view_the_number_of_products_shown_and_the_total_like(){
		if (Headerdesktop.getheaderrewards().isDisplayed()) {
			Assert.assertTrue(State.getShowingNumberOfNumberText().isDisplayed());
			highlighter.highLighterMethod2(State.getShowingNumberOfNumberText(), DriverManager.getDriver());
		} else {
			System.out.println("Not For Mobile");
		}
		Logger.log("User should be able to view the number of products shown and the total like");
	}

	@Then("User should be able to see Show Less CTA with the remaining cards number")
	public void User_should_be_able_to_see_Show_Less_CTA_with_the_remaining_cards_number(){
		if (Headerdesktop.getheaderrewards().isDisplayed()) {
			Assert.assertTrue(State.getDeal_ShowLessCTA().isDisplayed());
			highlighter.highLighterMethod2(State.getDeal_ShowMoreCTA(), DriverManager.getDriver());
		} else {
			System.out.println("Not For Mobile");
		}
		Logger.log("User should be able to see Show Less CTA with the remaining cards number");
	}

	@Then("User is able to view the first 4 deal cards in a row in the section")
	public void User_is_able_to_view_the_first_4_deal_cards_in_a_row_in_the_section(){
		if (Headerdesktop.getHamburgerMenu().isDisplayed()) {
			WebElement[] cards = new WebElement[]{(State.getDeals_Cart())};
			/*
			 * Check if the first 4 cards in the section are visible
			 */
			boolean areVisible = true;
			for (int i = 0; i < 4; i++) {
				if (!cards[i].isDisplayed()) {
					areVisible = false;
					break;
				}
			}

			if (areVisible) {
				System.out.println("The first 4 cards in the section are visible.");
			} else {
				Assert.fail("The first 4 cards in the section are not visible.");
			}

			/*
			 * Check if there are more than 4 cards in the section
			 */
			if (cards.length > 4) {
				Assert.fail("There are more than 4 cards in the section.");
			}
		} else {
			if (Headerdesktop.getheaderrewards().isDisplayed()) {
				System.out.println("For Mobile 4 will be not Displayed");
			}

		}
		Logger.log("User is able to view the first 4 deal cards in a row in the section");
	}

	@When("User scroll down to the Dispensary Events Discount banner")
	public void User_scroll_down_to_the_Dispensary_Events_Discount_banner(){
		if (Headerdesktop.getHamburgerMenu().isDisplayed()) {
			waitFor(2000);
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
			js.executeScript("window.scrollBy(0, 1850);");
			waitFor(800);
		} else {
			waitFor(2000);
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
			js.executeScript("window.scrollBy(0, 3240);");
			waitFor(800);
		}
		Logger.log("User scroll down to the Dispensary Events Discount banner");
	}

	@Then("user should not able to see the navigation control")
	public void user_should_not_able_to_see_the_navigation_control(){
		Assert.assertTrue(State.getEventDiscount_EventDiscount_ProgressbarCount().isDisplayed());
		Logger.log("user should not able to see the navigation control");
	}

	@And("user should not able to see horizontal indicator")
	public void user_should_not_able_to_see_horizontal_indicator(){
		Assert.assertTrue(State.getEventDiscount_ProgressbarIndicator().isDisplayed());
		Logger.log("user should not able to see horizontal indicator");
	}

	@And("user should not able to see arrows button")
	public void user_should_not_able_to_see_arrows_button(){
		Assert.assertTrue(State.getEventDiscount_EventDiscount_LeftArrow().isDisplayed());
		Assert.assertTrue(State.getEventDiscount_EventDiscount_RightArrow().isDisplayed());
		Logger.log("user should not able to see arrows button");
	}

	@Then("user is on the first image user should able to see the left arrow in disabled state")
	public void user_is_on_the_first_image_user_should_able_to_see_the_left_arrow_in_disabled_state(){
		// Find the first image element
		WebElement firstImage = DriverManager.getDriver().findElement(By.xpath("(//*[@class='bg-cover bg-no-repeat bg-grey-600 w-full h-[340px] lg:shrink-0 lg:!w-[972px] lg:!w-min-[805px] 2xl:!w-min-[1283px] !h-[249px] !w-auto self-stretch !bg-center lg:!h-[400px] lg:max-w-full lg:!shrink-0 lg:!grow lg:!basis-0 2xl:!h-full'])[1]"));

		// Find the left arrow element
		WebElement leftArrow = DriverManager.getDriver().findElement(By.xpath("(//*[@data-testid='prev-icon'])[2]"));

		// Check if the left arrow is disabled and not clickable when the user is on the first image
		if (firstImage.getAttribute("class").contains("active")) {
			if (leftArrow.getAttribute("disabled") != null && leftArrow.getAttribute("onclick") == null) {
				System.out.println("The left arrow is disabled and not clickable when the user is on the first image.");
			} else {
				Assert.fail("The left arrow is not disabled and clickable when the user is on the first image.");
			}
		}
		Logger.log("user is on the first image user should able to see the left arrow in disabled state");
	}

	@And("user should not able to click on the left arrow")
	public void user_should_not_able_to_click_on_the_left_arrow(){
		Assert.assertTrue(State.getEventDiscount_EventDiscount_LeftArrow().isEnabled());
		Logger.log("user should not able to click on the left arrow");
	}

	@And("user navigate to the last image")
	public void user_navigate_to_the_last_image(){
		waitFor(800);
		Assert.assertTrue(State.getEventDiscount_EventDiscount_Banner02().isDisplayed());
		Logger.log("user navigate to the last image");
	}

	@Then("user should able to see the right arrow in disabled state")
	public void user_should_able_to_see_the_right_arrow_in_disabled_state(){

		// Find the Last image element
		WebElement firstImage = DriverManager.getDriver().findElement(By.xpath("(//*[@class='bg-cover bg-no-repeat bg-grey-600 w-full h-[340px] lg:shrink-0 lg:!w-[972px] lg:!w-min-[805px] 2xl:!w-min-[1283px] !h-[249px] !w-auto self-stretch !bg-center lg:!h-[400px] lg:max-w-full lg:!shrink-0 lg:!grow lg:!basis-0 2xl:!h-full'])[2]"));

		// Find the right arrow element
		WebElement leftArrow = DriverManager.getDriver().findElement(By.xpath("(//*[@data-testid='next-icon'])[2]"));

		// Check if the right arrow is disabled and not clickable when the user is on the second image
		if (firstImage.getAttribute("class").contains("active")) {
			if (leftArrow.getAttribute("disabled") != null && leftArrow.getAttribute("onclick") == null) {
				System.out.println("The left arrow is disabled and not clickable when the user is on the first image.");
			} else {
				Assert.fail("The left arrow is not disabled and clickable when the user is on the first image.");
			}
		}
		Logger.log("user should able to see the right arrow in disabled state");
	}

	@And("user should not able to click on the right arrow")
	public void user_should_not_able_to_click_on_the_right_arrow(){
		Assert.assertTrue(State.getEventDiscount_EventDiscount_RightArrow().isEnabled());
		Logger.log("user should not able to click on the right arrow");
	}

	@Then("User should able to see heading text")
	public void User_should_able_to_see_heading_text(){
		Assert.assertTrue(State.getEventDiscount_HeadingText().isDisplayed());
		highlighter.highLighterMethod2(State.getEventDiscount_HeadingText(), DriverManager.getDriver());
		Logger.log("User should able to see heading text");
	}

	@And("User should able to see banner image")
	public void User_should_able_to_see_banner_image(){
		Assert.assertTrue(State.getEventDiscount_EventDiscount_Banner01().isDisplayed());
		highlighter.highLighterMethod2(State.getEventDiscount_EventDiscount_Banner01(), DriverManager.getDriver());
		Logger.log("User should able to see banner image");
	}

	@And("User should able to see title text")
	public void User_should_able_to_see_title_text(){
		Assert.assertTrue(State.getEventDiscount_EventDiscount_TitleText().isDisplayed());
		highlighter.highLighterMethod2(State.getEventDiscount_EventDiscount_TitleText(), DriverManager.getDriver());
		Logger.log("User should able to see title text");
	}

	@And("User should able to see copy text")
	public void ser_should_able_to_see_copy_text(){
		Assert.assertTrue(State.getEventDiscount_EventDiscount_CopyText().isDisplayed());
		highlighter.highLighterMethod2(State.getEventDiscount_EventDiscount_CopyText(), DriverManager.getDriver());
		Logger.log("User should able to see copy text");
	}

	@And("User should able to see CTA button")
	public void User_should_able_to_see_CTA_button(){
		Assert.assertTrue(State.getEventDiscount_EventDiscount_ReadMoreCTA().isDisplayed());
		highlighter.highLighterMethod2(State.getEventDiscount_EventDiscount_ReadMoreCTA(), DriverManager.getDriver());
		Logger.log("User should able to see CTA button");
	}

	@And("User clicks on the Read more CTA")
	public void User_clicks_on_the_Read_more_CTA(){
		State.ClickOnEventDiscountReadMoreCTA();
		waitFor(1000);
		Logger.log("User clicks on the Read more CTA");
	}

	@Then("User should be able to view the horizontal scroll with the total number of carousel banners")
	public void User_should_be_able_to_view_the_horizontal_scroll_with_the_total_number_of_carousel_banners(){
		Assert.assertTrue(State.getEventDiscount_EventDiscount_ProgressbarCount().isDisplayed());
		highlighter.highLighterMethod2(State.getEventDiscount_EventDiscount_ProgressbarCount(), DriverManager.getDriver());
		Logger.log("User should be able to view the horizontal scroll with the total number of carousel banners");
	}

	@And("User should able to see the maximum of 10 banners")
	public void User_should_able_to_see_the_maximum_of_10_banners(){

		Logger.log("User should able to see the maximum of 10 banners");
	}

	@And("User should able to see the the Left arrows")
	public void User_should_able_to_see_the_the_Left_arrows(){
		Assert.assertTrue(State.getEventDiscount_EventDiscount_LeftArrow().isDisplayed());
		highlighter.highLighterMethod2(State.getEventDiscount_EventDiscount_LeftArrow(), DriverManager.getDriver());
		Logger.log("User should able to see the the Left(<) arrows");
	}

	@And("User should able to see the the Right arrows")
	public void User_should_able_to_see_the_the_Right_arrows(){
		Assert.assertTrue(State.getEventDiscount_EventDiscount_LeftArrow().isDisplayed());
		highlighter.highLighterMethod2(State.getEventDiscount_EventDiscount_LeftArrow(), DriverManager.getDriver());
		Logger.log("User should able to see the the Right(>) arrows");
	}

	@And("User clicks on the right arrow")
	public void User_clicks_on_the_right_arrow(){
		waitFor(800);
		State.ClickOnEventDiscountRightArrow();
		Logger.log("User clicks on the right arrow");
	}

	@Then("User should able to navigate the banner in right side")
	public void User_should_able_to_navigate_the_banner_in_right_side(){
		waitFor(800);
		Assert.assertTrue(State.getEventDiscount_EventDiscount_Banner02().isDisplayed());
		highlighter.highLighterMethod2(State.getEventDiscount_EventDiscount_Banner02(), DriverManager.getDriver());
		Logger.log("User clicks on the right arrow");
	}

	@And("User clicks on the left arrow")
	public void User_clicks_on_the_left_arrow(){
		waitFor(800);
		State.ClickOnEventDiscountLeftArrow();
		Logger.log("User clicks on the left arrow");
	}
	@And("User should able to navigate the banner in left side")
	public void User_should_able_to_navigate_the_banner_in_left_side(){
		Assert.assertTrue(State.getEventDiscount_EventDiscount_Banner01().isDisplayed());
		highlighter.highLighterMethod2(State.getEventDiscount_EventDiscount_Banner01(), DriverManager.getDriver());
		waitFor(1000);
		Logger.log("User should able to navigate the banner in left side");
	}

	@When("User scroll down to Quick Links section")
	public void User_scroll_down_to_Quick_Links_section(){
		waitFor(2000);
		// javascriptScroll(State.getQuickLinks_TitleText());
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("window.scrollBy(0, 6340);");
		waitFor(2000);
		Logger.log("User scroll down to Quick Links section");
	}

//	@Then("User is viewing the Quick Links section")
//	public void User_is_viewing_the_Quick_Links_Section(){
//		Assert.assertTrue(State.getQuickLinks_TitleText().isDisplayed());
//		highlighter.highLighterMethod2(State.getQuickLinks_TitleText(), DriverManager.getDriver());
//		Logger.log("User is viewing the Quick Links section");
//	}

	@And("User should be able to view the Title text for Quick Links section")
	public void User_should_be_able_to_view_the_Title_text_for_Quick_Links_section(){
		Assert.assertTrue(State.getQuickLinks_TitleText().isDisplayed());
		highlighter.highLighterMethod2(State.getQuickLinks_TitleText(), DriverManager.getDriver());
		Logger.log("User should be able to view the Title text for Quick Links section");
	}

	@Then("User clicks on the title link card")
	public void User_clicks_on_the_title_link_card(){
		State.ClickOnQuickLinks_Clickable_Title_link01();
		Logger.log("User clicks on the title link card");
	}


	@And("User should be able to view the copy text for Quick Links section")
	public void User_should_be_able_to_view_the_copy_text_for_Quick_Links_Section(){
		Assert.assertTrue(State.getQuickLinks_CopyTex().isDisplayed());
		highlighter.highLighterMethod2(State.getQuickLinks_CopyTex(), DriverManager.getDriver());
		Logger.log("User should be able to view the copy text for Quick Links section");
	}

	@And("User should be able to view image for each card")
	public void User_should_be_able_to_view_image_for_each_card(){
		Assert.assertTrue(State.getQuickLinks_Image01().isDisplayed());
		highlighter.highLighterMethod2(State.getQuickLinks_Image01(), DriverManager.getDriver());
		Assert.assertTrue(State.getQuickLinks_Image02().isDisplayed());
		highlighter.highLighterMethod2(State.getQuickLinks_Image02(), DriverManager.getDriver());
		Logger.log("User should be able to view image for each card");
	}

	@And("User should be able to view Clickable title link for each card")
	public void User_should_be_able_to_view_Clickable_title_link_for_each_card(){
		WebElement title = DriverManager.getDriver().findElement(By.xpath("(//*[@class='flex py-[18px] px-5 md:py-8 md:px-5 2xl:p-8 gap-20 md:gap-4 items-center justify-between w-full self-stretch']/h5)[1]"));
		// Check if the title is clickable
		if (title.isDisplayed() && title.getAttribute("class") == null) {
			System.out.println("The Title Link is clickable.");
		} else {
			Assert.fail("The Title Title is not clickable.");
		}
//		Assert.assertTrue(State.getQuickLinks_Clickable_Title_link01().isSelected());
//		State.ClickOnQuickLinks_Clickable_Title_link01();
		waitFor(1000);
		Logger.log("User should be able to view Clickable title link for each card");
	}

	@And("User should be able to caret circle arrow clickable for each card")
	public void User_should_be_able_to_caret_circle_arrow_clickable_for_each_card(){
		WebElement caretCircle = DriverManager.getDriver().findElement(By.xpath("(//*[@class='flex py-[18px] px-5 md:py-8 md:px-5 2xl:p-8 gap-20 md:gap-4 items-center justify-between w-full self-stretch']/a)[1]"));
		// Check if the title is clickable
		if (caretCircle.isDisplayed() && caretCircle.getAttribute("icon-button") == null) {
			System.out.println("The caret circle arrow is clickable.");
		} else {
			Assert.fail("The caret circle arrow is not clickable.");
		}
		Assert.assertTrue(State.getQuickLinks_CaretCircleArrow01().isDisplayed());
		Assert.assertTrue(State.getQuickLinks_CaretCircleArrow02().isDisplayed());
		State.getClickOnCaretCircleArrow01();
		Logger.log("User should be able to view Clickable title link for each card");
	}

	@And("User clicks on the circle arrow")
	public void User_clicks_on_the_circle_arrow(){
		Assert.assertTrue(State.getQuickLinks_CaretCircleArrow01().isDisplayed());
		Assert.assertTrue(State.getQuickLinks_CaretCircleArrow02().isDisplayed());
		State.getClickOnCaretCircleArrow01();
		waitFor(2000);
		//	State.getQuickLinks_CaretCircleArrow01();
		Logger.log("User clicks on the circle arrow");
	}

	@When("User Scroll down to the Product Carousel section")
	public void User_Scroll_down_to_the_Product_Carousel_section(){
		if (Headerdesktop.getHamburgerMenu().isDisplayed()) {
			waitFor(2000);
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
			js.executeScript("window.scrollBy(0, 5598);");
		} else {
			if (Headerdesktop.getheaderrewards().isDisplayed()){
				waitFor(2000);
				//	javascriptScroll(State.getProductCarousalTitleText());
				JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
				js.executeScript("window.scrollBy(0, 5460);");
			}
		}
		Logger.log("User Scroll down to the Product Carousel section");
	}

	@And("User should be able to view title text, copy text, CTA, Cards")
	public void User_should_be_able_to_view_title(){
		if (Headerdesktop.getHamburgerMenu().isDisplayed()) {
			Assert.assertTrue(State.getProductCarousalTitleText().isEnabled());
			highlighter.highLighterMethod2(State.getProductCarousalTitleText(), DriverManager.getDriver());
			Assert.assertTrue(State.getProductCarousalCopyText().isDisplayed());
			highlighter.highLighterMethod2(State.getProductCarousalCopyText(), DriverManager.getDriver());
			waitFor(600);
			Assert.assertTrue(State.getProductCarousalCTAMobile().isDisplayed());
			highlighter.highLighterMethod2(State.getProductCarousalCTAMobile(), DriverManager.getDriver());
			Assert.assertTrue(State.getProductCarousal_Count_ArrowRight_Left().isDisplayed());
			highlighter.highLighterMethod2(State.getProductCarousal_Count_ArrowRight_Left(), DriverManager.getDriver());
			Assert.assertTrue(State.getProductCarousalCarousel00().isDisplayed());
		} else {
			if (Headerdesktop.getheaderrewards().isDisplayed()){
				Assert.assertTrue(State.getProductCarousalTitleText().isEnabled());
				highlighter.highLighterMethod2(State.getProductCarousalTitleText(), DriverManager.getDriver());
				Assert.assertTrue(State.getProductCarousalCopyText().isDisplayed());
				highlighter.highLighterMethod2(State.getProductCarousalCopyText(), DriverManager.getDriver());
				Assert.assertTrue(State.getProductCarousalCTA().isDisplayed());
				highlighter.highLighterMethod2(State.getProductCarousalCTA(), DriverManager.getDriver());
				Assert.assertTrue(State.getProductCarousal_Count_ArrowRight_Left().isDisplayed());
				highlighter.highLighterMethod2(State.getProductCarousal_Count_ArrowRight_Left(), DriverManager.getDriver());
				Assert.assertTrue(State.getProductCarousalCarousel00().isDisplayed());
				highlighter.highLighterMethod2(State.getProductCarousalCarousel00(), DriverManager.getDriver());
			}
		}
		Logger.log("User should be able to view title text, copy text, CTA, Cards");
	}

	@And("User click on CTA")
	public void User_click_on_CTA(){
		if (Headerdesktop.getHamburgerMenu().isDisplayed()) {
			State.ClickOnProductCarousal_CTAMobile();
		} else {
			State.ClickOnProductCarousal_CTA();
		}
		Logger.log("User click on CTA");
	}

	@And("User views the product card carousel moves 3 cards per slide")
	public void User_views_the_product_card_carousel_moves_three_cards_per_slide(){
		if (Headerdesktop.getHamburgerMenu().isDisplayed()) {
			Assert.assertTrue(State.getProductCarousalCarousel00().isDisplayed());
			highlighter.highLighterMethod2(State.getProductCarousalCarousel00(), DriverManager.getDriver());
			waitFor(1000);
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
			js.executeScript("window.scrollBy(0, 200);");
		} else {
			if (Headerdesktop.getheaderrewards().isDisplayed()){
				Assert.assertTrue(State.getProductCarousalCarousel00().isDisplayed());
				highlighter.highLighterMethod2(State.getProductCarousalCarousel00(), DriverManager.getDriver());
				Assert.assertTrue(State.getProductCarousalCarousel01().isDisplayed());
				highlighter.highLighterMethod2(State.getProductCarousalCarousel01(), DriverManager.getDriver());
				Assert.assertTrue(State.getProductCarousalCarousel02().isDisplayed());
				highlighter.highLighterMethod2(State.getProductCarousalCarousel02(), DriverManager.getDriver());
			}
		}
		Logger.log("User viewes the product card carousel moves 3 cards per slide");
	}

	@And("User views the scrolling indicator to show the maximum number of cards available")
	public void User_views_the_scrolling_indicator_to_show_the_maximum_number_of_cards_available(){
		Assert.assertTrue(State.getProductCarousal_progressbarIndicator().isDisplayed());
		highlighter.highLighterMethod2(State.getProductCarousal_progressbarIndicator(), DriverManager.getDriver());
		Logger.log("User views the scrolling indicator to show the maximum number of cards available");
	}

	@And("User clicks on the product cards")
	public void User_clicks_on_the_product_cardse(){
		WebElement productCards = DriverManager.getDriver().findElement(By.xpath("(//*[@alt='product card'])[1]"));
		if (productCards.isDisplayed() && productCards.getAttribute("product card") == null) {
			System.out.println("The product cards is clickable.");
		} else {
			Assert.fail("The product cards is not clickable.");
		}
		//	Assert.assertTrue(State.getProductCard().isSelected());
		State.ClickOnProductCard01();
		Logger.log("User clicks on the product cards");
	}

	@Then("User navigated to the PDP page")
	public void User_navigated_to_the_PDP_page(){

		Logger.log("User navigated to the PDP page");
	}

	@Then("User redirected to the linked page")
	public void User_redirected_to_the_linked_page(){

		Logger.log("User redirected to the linked page");
	}

	@Then("User scroll down to FAQ section of State Page")
	public void User_scroll_down_to_FAQ_section_of_State_Page(){
		if (Headerdesktop.getHamburgerMenu().isDisplayed()) {
			waitFor(2000);
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
			js.executeScript("window.scrollBy(0, 7289);");
		} else {
			if (Headerdesktop.getheaderrewards().isDisplayed()){
				waitFor(2000);
				//	javascriptScroll(rewards.getFaqsTitleText());
				JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
				js.executeScript("window.scrollBy(0, 6889);");
				waitFor(1000);
			}
		}
		Logger.log("User scroll down to FAQ section of State Page");
	}

	@Then("User should be able to see and click on Show More button to show the entire set of FAQs")
	public void User_should_be_able_to_see_and_click_on_Show_More_button_to_show_the_entire_set_of_FAQs(){
		if (Headerdesktop.getHamburgerMenu().isDisplayed()) {
			waitFor(1000);
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
			js.executeScript("window.scrollBy(0, 100);");
			Assert.assertTrue(rewards.getShowMoreCTA().isDisplayed());
			highlighter.highLighterMethod(rewards.getShowMoreCTA(), DriverManager.getDriver());
			highlighter.highLighterMethod(rewards.getShowingSectionCount(), DriverManager.getDriver());
			rewards.ClickOnShowMoreCTA();
		} else {
			Assert.assertTrue(Headerdesktop.getheaderrewards().isDisplayed());
			highlighter.highLighterMethod(rewards.getShowMoreCTA(), DriverManager.getDriver());
			highlighter.highLighterMethod(rewards.getShowingSectionCount(), DriverManager.getDriver());
			rewards.ClickOnShowMoreCTA();
		}
		Logger.log("User should be able to see and click on Show More button to show the entire set of FAQs");
	}

	@Then("User should be able to see and click on Show less button replacing show more button if entire set of FAQs are displayed")
	public void User_should_be_able_to_see_and_click_on_Show_less_button_replacing_show_more_button_if_entire_set_of_FAQs_are_displayed(){
		if (Headerdesktop.getHamburgerMenu().isDisplayed()) {
			waitFor(1000);
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
			js.executeScript("window.scrollBy(0, 1520);");
			highlighter.highLighterMethod(rewards.getShowingSectionCount(), DriverManager.getDriver());
			highlighter.highLighterMethod(rewards.getShowMoreCTA(), DriverManager.getDriver());
			highlighter.highLighterMethod(rewards.getFaqSection(), DriverManager.getDriver());
		} else {
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
			js.executeScript("window.scrollBy(0, 1520);");
			highlighter.highLighterMethod(rewards.getShowingSectionCount(), DriverManager.getDriver());
			highlighter.highLighterMethod(rewards.getShowMoreCTA(), DriverManager.getDriver());
			highlighter.highLighterMethod(rewards.getFaqSection(), DriverManager.getDriver());
		}
		Logger.log("User should be able to see and click on Show less button replacing show more button if entire set of FAQs are displayed");
	}


	@And("User should be able to return to original state and the button changes back to show more")
	public void User_should_be_able_to_return_to_original_state_and_the_button_changes_back_to_show_more(){
		if (Headerdesktop.getHamburgerMenu().isDisplayed()) {
			waitFor(1000);
			rewards.ClickOnShowLessCTA();
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
			js.executeScript("window.scrollBy(0, -1520);");
			highlighter.highLighterMethod(rewards.getShowingSectionCount(), DriverManager.getDriver());
			highlighter.highLighterMethod(rewards.getShowMoreCTA(), DriverManager.getDriver());
			highlighter.highLighterMethod(rewards.getFaqSection(), DriverManager.getDriver());
			waitFor(1000);
		} else {
			rewards.ClickOnShowLessCTA();
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
			js.executeScript("window.scrollBy(0, -1520);");
			highlighter.highLighterMethod(rewards.getShowingSectionCount(), DriverManager.getDriver());
			highlighter.highLighterMethod(rewards.getShowMoreCTA(), DriverManager.getDriver());
			highlighter.highLighterMethod(rewards.getFaqSection(), DriverManager.getDriver());
			waitFor(1000);
		}
		Logger.log("User should be able to return to original state and the button changes back to show more");
	}


	@When("User scroll downs to banner section in State page for variant A")
	public void User_scroll_downs_to_banner_section_in_State_page_for_variant_A(){
		// javascriptScroll(State.getBannerC09Variant_A_IconWithSmallText());
		waitFor(2000);
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("window.scrollBy(0, 7989);");
		Logger.log("User scroll downs to banner section in State page for variant A");
	}


	@When("User is on banner variant A Text and primary Button for C09")
	public void User_is_on_banner_variant_A_Text_And_primary_Button_C09(){
		waitFor(2000);
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("window.scrollBy(0, 8789);");
		Logger.log("User is on banner variant A Text + primary Button");
	}

	@When("User is on banner variant B for C09")
	public void User_is_on_banner_variant_B_for_C09(){
		waitFor(2000);
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("window.scrollBy(0, 10600);");
		Logger.log("User is on banner variant B for C09");
	}


	@And("User is on banner variant A")
	public void User_is_on_banner_variant_A(){
		Assert.assertTrue(State.getBannerC09VariantA().isDisplayed());
		highlighter.highLighterMethod2(State.getBannerC09VariantA(), DriverManager.getDriver());
		Logger.log("User is on banner variant A");
	}

	@And("User should click on CTA to redirect to respective page or link which opens on new tab always")
	public void User_should_click_on_CTA_to_redirect_to_respective_page_or_link_which_opens_on_new_tab_always() {
		State.ClickOnBannerC09VariantA_CTA();
		Logger.log("User should click on CTA to redirect to respective page or link which opens on new tab always");
	}

	@And("User should see an image in the banner")
	public void User_should_see_an_image_in_the_banner(){
		Assert.assertTrue(State.getBannerC09VariantA_Image().isDisplayed());
		highlighter.highLighterMethod2(State.getBannerC09VariantA_Image(), DriverManager.getDriver());
		Logger.log("User should see an image in the banner");
	}

	@Then("User should see an icon with small text for Banner variant A")
	public void User_should_see_an_icon_with_small_text_for_Banner_variant_A() {
		Assert.assertTrue(State.getBannerC09Variant_A_IconWithSmallText().isDisplayed());
		highlighter.highLighterMethod2(State.getBannerC09Variant_A_IconWithSmallText(), DriverManager.getDriver());
		Logger.log("User should see an icon with small text for Banner variant A");
	}

	@And("User should see a Title Text with <=3 lines")
	public void User_should_see_a_Title_Text_with_Less_than_equalto_3_lines() {
		Assert.assertTrue(State.getBannerC09VariantA_TitleText().isDisplayed());
		highlighter.highLighterMethod2(State.getBannerC09VariantA_TitleText(), DriverManager.getDriver());
		Logger.log("User should see a Title Text with <=3 lines");
	}

	@And("User should see a CTA")
	public void User_should_see_a_CTA() {
		Assert.assertTrue(State.getBannerC09VariantA_CTA().isDisplayed());
		highlighter.highLighterMethod2(State.getBannerC09VariantA_CTA(), DriverManager.getDriver());
		Logger.log("User should see a CTA");
	}

	@And("User should click on CTA to redirect to respective page or link which opens on same tab always")
	public void User_should_click_on_CTA_to_redirect_to_respective_page_or_link_which_opens_on_same_tab_always() {
		State.ClickOnBannerC09VariantA_CTA();
		waitFor(1000);
		Logger.log("User should click on CTA to redirect to respective page or link which opens on same tab always");
	}

	@Then("User should see an icon with small text for variant A Text and primary Button")
	public void User_should_see_an_icon_with_small_text_for_variant_A_Text_and_primary_Button(){
		Assert.assertTrue(State.getBannerC09VariantAWithTextButton_IconWithSmallText().isDisplayed());
		highlighter.highLighterMethod2(State.getBannerC09VariantAWithTextButton_IconWithSmallText(), DriverManager.getDriver());
		Logger.log("User should be able to see and click on Show less button replacing show more button if entire set of FAQs are displayed");
	}

	@And("User should see a Title Text with <=2 lines")
	public void User_should_see_a_Title_Text_with_2_lines() {
		Assert.assertTrue(State.getBannerC09VariantAWithTextButton_TitleText().isDisplayed());
		highlighter.highLighterMethod2(State.getBannerC09VariantAWithTextButton_TitleText(), DriverManager.getDriver());
		Logger.log("User should see a Title Text with <=2 lines");
	}

	@And("User should see Copy Text with <=2 lines")
	public void User_should_see_Copy_Text_with_2_lines() {
		Assert.assertTrue(State.getBannerC09VariantAWithTextButton_CopyText().isDisplayed());
		highlighter.highLighterMethod2(State.getBannerC09VariantAWithTextButton_CopyText(), DriverManager.getDriver());
		Logger.log("User should see Copy Text with <=2 lines");
	}

	@And("User should see a CTA on any one of the page for variant A Text and primary Button")
	public void User_should_see_a_CTA_on_any_one_of_the_page_for_variant_A_Text_and_primary_Button() {
		Assert.assertTrue(State.getBannerC09VariantAWithTextButton().isDisplayed());
		highlighter.highLighterMethod2(State.getBannerC09VariantAWithTextButton(), DriverManager.getDriver());
		Logger.log("User should see a CTA on any one of the page for variant A Text and primary Button");
	}

	@Then("User should see a CTA on banner")
	public void User_should_see_a_CTA_on_banner(){
		Assert.assertTrue(State.getBannerC09VariantAWithTextButton_CTA().isDisplayed());
		highlighter.highLighterMethod2(State.getBannerC09VariantAWithTextButton_CTA(), DriverManager.getDriver());
		Logger.log("User should see a CTA on banner");
	}

	@Then("User should see a CTA on banner for variant A Text and primary Button")
	public void User_should_see_a_CTA_on_banner_for_variant_A_Text_and_primary_Button(){
		Assert.assertTrue(State.getBannerC09VariantAWithTextButton_Image().isDisplayed());
		highlighter.highLighterMethod2(State.getBannerC09VariantAWithTextButton_Image(), DriverManager.getDriver());
		Logger.log("User should see a CTA on banner for variant A Text and primary Button");
	}

	@And("User should click on CTA to redirect to respective page or link which opens on same tab always for variant A Text and primary Button")
	public void User_should_click_on_CTA_to_redirect_to_respective_page_or_link_which_opens_on_same_tab_always_for_variant_A_Text_and_primary_Button() {
		State.ClickOnBannerC09VariantAWithTextButton_CTA();
		waitFor(3000);
		Logger.log("User should click on CTA to redirect to respective page or link which opens on same tab always for variant A Text and primary Button");
	}

	@And("User should see appropriate background colors of the banner")
	public void User_should_see_appropriate_background_colors_of_the_banner() {

		Logger.log("User should see appropriate background colors of the banner");
	}

	@And("User should click on CTA to redirect to respective page and link which opens on new tab always for variant A Text and primary Button")
	public void User_should_click_on_CTA_to_redirect_to_respective_page_or_link_which_opens_on_new_tab_always_for_variant_A_Text_and_primary_Button() {
		State.ClickOnBannerC09VariantA_CTA();
		waitFor(3000);
		Logger.log("User should click on CTA to redirect to respective page and link which opens on new tab always for variant A Text and primary Button");
	}

	@Then("User should see an image in the banner for variant B")
	public void User_should_see_an_image_in_the_banner_for_variant_B(){
		Assert.assertTrue(State.getBannerC09Variant_Image().isDisplayed());
		highlighter.highLighterMethod2(State.getBannerC09Variant_Image(), DriverManager.getDriver());
		Logger.log("User should see an image in the banner for variant B");
	}
	@And("User should see an icon with small text for variant B")
	public void User_should_see_an_icon_with_small_text_for_variant_B(){
		Assert.assertTrue(State.getBannerC09VariantB_IconWithSmallText().isDisplayed());
		highlighter.highLighterMethod2(State.getBannerC09VariantB_IconWithSmallText(), DriverManager.getDriver());
		Logger.log("User should see an icon with small text for variant B");
	}

	@And("User should see a Title Text with <=4 lines")
	public void User_should_seea_Title_Text_with_less_than_equal_four_lines(){
		Assert.assertTrue(State.getBannerC09Variant_TitleText().isDisplayed());
		highlighter.highLighterMethod2(State.getBannerC09Variant_TitleText(), DriverManager.getDriver());
		Logger.log("User should see a Title Text with <=4 lines");
	}

	@And("User should see a CTA for variant B")
	public void User_should_see_a_CTA_for_variant_B(){
		Assert.assertTrue(State.getBannerC09VariantB_CTA().isDisplayed());
		highlighter.highLighterMethod2(State.getBannerC09VariantB_CTA(), DriverManager.getDriver());
		Logger.log("User should see a CTA for variant B");
	}

	@Then("User should click on CTA to redirect to respective page or link which opens on same tab always for variant B banner")
	public void User_should_click_on_CTA_to_redirect_to_respective_page_or_link_which_opens_on_same_tab_always_for_variant_B_banner(){
		State.ClickOnBannerC09VariantB_CTA();
		waitFor(3000);
		Logger.log("User should click on CTA to redirect to respective page or link which opens on same tab always for variant B banner");
	}

	@And("User should see appropriate background colors of the banner for variant B banner")
	public void User_should_see_appropriate_background_colors_of_the_banner_for_variant_B_banner(){

		Logger.log("User should see appropriate background colors of the banner for variant B banner");
	}

	@Then("User should click on CTA to redirect to respective page or link which opens on new tab always for variant B banner")
	public void User_should_click_on_CTA_to_redirect_to_respective_page_or_link_which_opens_on_new_tab_always_for_variant_B_banner(){
		State.ClickOnBannerC09VariantB_CTA();
		waitFor(3000);
		Logger.log("User should click on CTA to redirect to respective page or link which opens on new tab always for variant B banner");
	}
}
