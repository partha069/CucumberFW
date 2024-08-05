package parallel;

import org.junit.Assert;

import com.driverfactory.DriverManager;
import com.resuableMethods.CommonAction;
import com.utilities.Logger;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.gti.Footer_Desktop;

public class Footer_Stepdef extends CommonAction{
	Footer_Desktop Footerdesktop = new Footer_Desktop(DriverManager.getDriver());

	@When("user scrolls down to the footer section")
	public void user_scrolls_down_to_the_footer_section() {
	    javascriptScroll(Footerdesktop.Getfootersection());
	    Logger.log("user scrolls down to the footer section");
	}

	@Then("user should able to view the Footer section")
	public void user_should_able_to_view_the_footer_section() {
	    Assert.assertTrue(Footerdesktop.Getfootersection().isDisplayed());
	    Logger.log("user should able to view the Footer section");
	}

	@Then("user should be able to view the Home navigation list with the components {string} and {string} and {string} and {string} and {string} and {string}")
	public void user_should_be_able_to_view_the_home_navigation_list_with_the_components_and_and_and_and_and(String string, String string2, String string3, String string4, String string5, String string6) {
		Assert.assertTrue(Footerdesktop.getFooterhometext().isDisplayed());
	    Logger.log("user should able to view the Home option from the Footer section");
	    Assert.assertTrue(Footerdesktop.getfootershoptext().isDisplayed());
	    Logger.log("user should able to view the shop option from the Footer section");
	    Assert.assertTrue(Footerdesktop.getFooterrewardstext().isDisplayed());
	    Logger.log("user should able to view the Rewards option from the Footer section");
	    Assert.assertTrue(Footerdesktop.getFootercannabisinsidertext().isDisplayed());
	    Logger.log("user should able to view the cannabis insider option from the Footer section");
	    Assert.assertTrue(Footerdesktop.getfooterdispensariestext().isDisplayed());
	    Logger.log("user should able to view the dispensaries option from the Footer section");
	    Assert.assertTrue(Footerdesktop.getFooterlogo().isDisplayed());
	    Logger.log("user should able to view the logo from the Footer section");
	    
	    Assert.assertTrue(Footerdesktop.getFooterCustomerCenter().isDisplayed());
	    Logger.log("user should able to view the Footer Customer Center option from the Footer section");
	    Assert.assertTrue(Footerdesktop.getfootercontactus().isDisplayed());
	    Logger.log("user should able to view the contactus option from the Footer section");
	    Assert.assertTrue(Footerdesktop.getfooterfaq().isDisplayed());
	    Logger.log("user should able to view the FAQ option from the Footer section");
	    Assert.assertTrue(Footerdesktop.getfootertermsofuse().isDisplayed());
	    Logger.log("user should able to view the terms of use option from the Footer section");
	    Assert.assertTrue(Footerdesktop.getfooterprivacypolicy().isDisplayed());
	    Logger.log("user should able to view the privacypolicy option from the Footer section");
	    Assert.assertTrue(Footerdesktop.getfooterNoticeofPrivacyPractices().isDisplayed());
	    Logger.log("user should able to view the Notice of Privacy Practices option from the Footer section");
	    Assert.assertTrue(Footerdesktop.getFooterchatwithus().isDisplayed());
	    Logger.log("user should able to view the chat with us option from the Footer section");
	    
	    Assert.assertTrue(Footerdesktop.getFootercareers().isDisplayed());
	    Logger.log("user should able to view the careers option from the Footer section");
	    Assert.assertTrue(Footerdesktop.getFooterinstagramicon().isDisplayed());
	    Logger.log("user should able to view the instagram icon from the Footer section");
	    Assert.assertTrue(Footerdesktop.getFooterfacebookicon().isDisplayed());
	    Logger.log("user should able to view the facebook icon from the Footer section");
	    Assert.assertTrue(Footerdesktop.getFootertwittericon().isDisplayed());
	    Logger.log("user should able to view the twitter icon from the Footer section");
	}
	
	@Then("user should be able to view the license details for the geo located dispensary")
	public void user_should_be_able_to_view_the_license_details_for_the_geo_located_dispensary() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user should be able to view the copyrights text from the footer")
	public void user_should_be_able_to_view_the_copyrights_text_from_the_footer() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user should be redirected to the RISE Home Page by clicking on the Home option")
	public void user_should_be_redirected_to_the_rise_home_page_by_clicking_on_the_home_option() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user should be redirected to the Geolocated PLP page by clicking on the Shop option")
	public void user_should_be_redirected_to_the_geolocated_plp_page_by_clicking_on_the_shop_option() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user should get redirected to the REWARDS page by clicking on the Rewards option")
	public void user_should_get_redirected_to_the_rewards_page_by_clicking_on_the_rewards_option() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user should be redirected to the Cannabis Insider Index Page by clicking on the Cannabis Insider menu")
	public void user_should_be_redirected_to_the_cannabis_insider_index_page_by_clicking_on_the_cannabis_insider_menu() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user should be redirected to the Primary dispensaries page by clicking on the Dispensaries menu")
	public void user_should_be_redirected_to_the_primary_dispensaries_page_by_clicking_on_the_dispensaries_menu() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user should redirected to the home page by clicking the Rise logo from the footer")
	public void user_should_redirected_to_the_home_page_by_clicking_the_rise_logo_from_the_footer() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


	@Then("user should be able to view the Terms of use internal navigation list with the components {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string}")
	public void user_should_be_able_to_view_the_terms_of_use_internal_navigation_list_with_the_components_and_and_and_and_and_and_and(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
		Assert.assertTrue(Footerdesktop.getFooterCustomerCenter().isDisplayed());
	    Logger.log("user should able to view the Footer Customer Center option from the Footer section");
	    Assert.assertTrue(Footerdesktop.getfootercontactus().isDisplayed());
	    Logger.log("user should able to view the contactus option from the Footer section");
	    Assert.assertTrue(Footerdesktop.getfooterfaq().isDisplayed());
	    Logger.log("user should able to view the FAQ option from the Footer section");
	    Assert.assertTrue(Footerdesktop.getfootertermsofuse().isDisplayed());
	    Logger.log("user should able to view the terms of use option from the Footer section");
	    Assert.assertTrue(Footerdesktop.getfooterprivacypolicy().isDisplayed());
	    Logger.log("user should able to view the privacypolicy option from the Footer section");
	    Assert.assertTrue(Footerdesktop.getfooterNoticeofPrivacyPractices().isDisplayed());
	    Logger.log("user should able to view the Notice of Privacy Practices option from the Footer section");
	    Assert.assertTrue(Footerdesktop.getFooterchatwithus().isDisplayed());
	    Logger.log("user should able to view the chat with us option from the Footer section");
	}

	@Then("user should be able redirected to the contact us menu with call, chat and mail options by clicking on customer center option")
	public void user_should_be_able_redirected_to_the_contact_us_menu_with_call_chat_and_mail_options_by_clicking_on_customer_center_option() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user should be redirected to the contact us form by clicking contact us option")
	public void user_should_be_redirected_to_the_contact_us_form_by_clicking_contact_us_option() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user should be redirected to the FAQ page by cliking on FAQ option")
	public void user_should_be_redirected_to_the_faq_page_by_cliking_on_faq_option() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user should be redirected to the sitemap page by clicking on Sitemap option")
	public void user_should_be_redirected_to_the_sitemap_page_by_clicking_on_sitemap_option() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user should be redirected to the  GTI Terms of Use link by clicking on Terms of Use from the list")
	public void user_should_be_redirected_to_the_gti_terms_of_use_link_by_clicking_on_terms_of_use_from_the_list() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user Should be redirected to the GTI Privacy Policy link by clicking on Privacy Policy from the list")
	public void user_should_be_redirected_to_the_gti_privacy_policy_link_by_clicking_on_privacy_policy_from_the_list() {
	    
	}

	@Then("user Should be redirected to the  GTI Privacy Practices link by clicking on Notice of Privacy Practices from the list")
	public void user_should_be_redirected_to_the_gti_privacy_practices_link_by_clicking_on_notice_of_privacy_practices_from_the_list() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user should see the chatbot to be opened by clicking on Chat with us")
	public void user_should_see_the_chatbot_to_be_opened_by_clicking_on_chat_with_us() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user should be able to view the terms of use external navigation list with the components {string} and {string} and {string} and {string}")
	public void user_should_be_able_to_view_the_terms_of_use_external_navigation_list_with_the_components_and_and_and(String string, String string2, String string3, String string4) {
		Assert.assertTrue(Footerdesktop.getFootercareers().isDisplayed());
	    Logger.log("user should able to view the careers option from the Footer section");
	    Assert.assertTrue(Footerdesktop.getFooterinstagramicon().isDisplayed());
	    Logger.log("user should able to view the instagram icon from the Footer section");
	    Assert.assertTrue(Footerdesktop.getFooterfacebookicon().isDisplayed());
	    Logger.log("user should able to view the facebook icon from the Footer section");
	    Assert.assertTrue(Footerdesktop.getFootertwittericon().isDisplayed());
	    Logger.log("user should able to view the twitter icon from the Footer section");
	}

	@Then("user should be redirected to the External GTI Careers page by clicking on Careers from the list")
	public void user_should_be_redirected_to_the_external_gti_careers_page_by_clicking_on_careers_from_the_list() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user should be redirected to instagram page by clicking on instagram icon from the footer")
	public void user_should_be_redirected_to_instagram_page_by_clicking_on_instagram_icon_from_the_footer() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user should be redirected to Facebook page by clicking on Facebook icon from the footer")
	public void user_should_be_redirected_to_facebook_page_by_clicking_on_facebook_icon_from_the_footer() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user should be redirected to twitter page by clicking on twitter icon from the footer")
	public void user_should_be_redirected_to_twitter_page_by_clicking_on_twitter_icon_from_the_footer() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
