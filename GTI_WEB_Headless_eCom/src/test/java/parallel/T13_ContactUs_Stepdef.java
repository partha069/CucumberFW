package parallel;

import com.driverfactory.DriverManager;
import com.resuableMethods.CommonAction;
import com.utilities.Logger;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pom.gti.ContactUs;
import pom.gti.Footer_Desktop;

import java.io.IOException;

import static com.utilities.ConfigReader.getTestData;

public class T13_ContactUs_Stepdef extends CommonAction {
    ContactUs contactUspage = new ContactUs(DriverManager.getDriver());
    Footer_Desktop footerAction =new Footer_Desktop(DriverManager.getDriver());

    @When("User  clicks  on Customer Center Option")
    public void user_clicks_on_customer_center_option() {
        javascriptScroll(footerAction.Getfootersection());
        jsClick(footerAction.getFooterCustomerCenter());
        Logger.log("User  clicks  on Customer Center Option");

    }

    @Then("User should be able to view a drawer getting opened from right to left")
    public void user_should_be_able_to_view_a_drawer_getting_opened_from_right_to_left() throws InterruptedException {
        waitFor(500);
        if(contactUspage.getcustomercenterdrawermobile().isDisplayed()){
            Assert.assertTrue(contactUspage.getcustomercenterdrawermobile().isDisplayed());
            Logger.log("User should be able to view a drawer getting opened from bottom to top");
        }
        else {
            if (contactUspage.getcustomercenterdrawerdesktop().isDisplayed()){
                Assert.assertTrue(contactUspage.getcustomercenterdrawerdesktop().isDisplayed());
                Logger.log("User should be able to view a drawer getting opened from right to left");
            }

        }

    }



    @Given("user able to view the customer center")
    public void user_able_to_view_the_customer_center() {
        Assert.assertTrue(Footer_Desktop.getFooterCustomerCenter().isDisplayed());
        Logger.log("user able to view the customer center");
    }

    @When("User is viewing the customer center drawer")
    public void user_is_viewing_the_customer_center_drawer() throws InterruptedException {
        waitFor(500);
        if (contactUspage.getcustomercenterdrawermobile().isDisplayed()){
            Assert.assertTrue(contactUspage.getcustomercenterdrawermobile().isDisplayed());
            Logger.log("User is viewing the customer center drawer");
        }
        else {
            if (contactUspage.getcustomercenterdrawerdesktop().isDisplayed()){
                Assert.assertTrue(contactUspage.getcustomercenterdrawerdesktop().isDisplayed());
                Logger.log("User is viewing the customer center drawer");
            }

        }


    }

    @Then("User should be able to view the title text")
    public void user_should_be_able_to_view_the_title_text() {
        Assert.assertTrue(contactUspage.getcustomercenterdrawerheader().isDisplayed());
        Logger.log("User is viewing the customer center drawer");
    }

    @Then("User should be able to view the copy text")
    public void user_should_be_able_to_view_the_copy_text() {
        Assert.assertTrue(contactUspage.getcustomercenterdrawerdescription().isDisplayed());
        Logger.log("User should be able to view the copy tex");

    }

    @Then("User should be able to view the image")
    public void user_should_be_able_to_view_the_image() {
        Assert.assertTrue(contactUspage.getcustomercenterdrawerimage().isDisplayed());
        Logger.log("User should be able to view the image");
    }

    @Then("User should be able to view the close CTA to close the drawer")
    public void user_should_be_able_to_view_the_close_cta_to_close_the_drawer() {
        Assert.assertTrue(contactUspage.getcustomercenterdrawerclosecta().isDisplayed());
        Logger.log("User should be able to view the close CTA to close the drawer");
    }

    @Then("User should be able to view the {int} customer center options in CTA format with a small description text")
    public void user_should_be_able_to_view_the_customer_center_options_in_cta_format_with_a_small_description_text(Integer int1) {
        Assert.assertTrue(contactUspage.getcustomercenterrecievemessagetitle().isDisplayed());
        Assert.assertTrue(contactUspage.getcustomercenterdrawerchatwithpersontitle().isDisplayed());
        Logger.log("User should be able to view the {int} customer center options in CTA format with a small description text");
    }

    @Then("User should be redirected to the Contact Us form")
    public void user_should_be_redirected_to_the_contact_us_form() {
        Assert.assertTrue(contactUspage.Getcontactusform1().isDisplayed());
        Logger.log("User should be redirected to the Contact Us form");
    }
    @When("User is clicking on I prefer to chat with a person")
    public void user_is_clicking_on_i_prefer_to_chat_with_a_person() {
        jsClick(contactUspage.getcustomercenterdrawerchatwithpersontitle());
        Logger.log("User is clicking on I prefer to chat with a person");
    }

    @Then("AWS connect chat opens")
    public void aws_connect_chat_opens() {

    }

    @When("User is clicking on I would like to receive a message")
    public void user_is_clicking_on_i_would_like_to_receive_a_message() {
        jsClick(contactUspage.getcustomercenterrecievemessagetitle());
        jsClick(contactUspage.getcustomercenterdrawerclosecta());
        Logger.log("User is clicking on 'I would like to receive a message'");
    }

    @When("User is clicking on Close icon")
    public void user_is_clicking_on_close_icon() {
        jsClick(contactUspage.getcustomercenterdrawerclosecta());
        Logger.log("User is clicking on Close icon");

    }

    @Then("user should be able to view the Drawer closes")
    public void user_should_be_able_to_view_the_drawer_closes() {
        if (contactUspage.getcustomercenterdrawermobile().isDisplayed()){
            Assert.assertEquals(contactUspage.getcustomercenterdrawermobile().isDisplayed(), false);
            Logger.log("User should be able to view a drawer getting opened from bottom to top");
        }
        else {
            if (contactUspage.getcustomercenterdrawerdesktop().isDisplayed()){
                Assert.assertEquals(contactUspage.getcustomercenterdrawerdesktop().isDisplayed(), false);
                Logger.log("User should be able to view a drawer getting opened from right to left");
            }
        }

    }

    @Then("User is in the step {int} of ‘Contact us’ form in default state")
    public void user_is_in_the_step_of_contact_us_form_in_default_state(Integer int1) {
        Assert.assertTrue(contactUspage.Getcontactusform1().isDisplayed());
        Logger.log("User is in the step 1 of ‘Contact us’ form in default state");
    }

    @When("User is on the step {int} of ‘Contact us’ form in default state")
    public void user_is_on_the_step_of_contact_us_form_in_default_state(Integer int1) {
        javascriptScroll(footerAction.Getfootersection());
        jsClick(footerAction.getFooterCustomerCenter());
        jsClick(contactUspage.getcustomercenterrecievemessagetitle());
        jsClick(contactUspage.getcustomercenterdrawerclosecta());
        Assert.assertTrue(contactUspage.getcontactusheading().isDisplayed());


    }

    @Then("User is able to view the title text")
    public void user_is_able_to_view_the_title_text() {
        Assert.assertTrue(contactUspage.getcontactustitle().isDisplayed());
        Logger.log("User is able to view the title text");
    }

    @Then("User is able to view the copy text")
    public void user_is_able_to_view_the_copy_text() {
        Assert.assertTrue(contactUspage.getcontactusdescription().isDisplayed());
        Logger.log("User is able to view the copy text");
    }

    @Then("User is able to view the logo")
    public void user_is_able_to_view_the_logo() {
        Assert.assertTrue(contactUspage.getcontactuslogo().isDisplayed());
        Logger.log("User is able to view the logo");
    }

    @Then("User should be able to view the horizontal bar to show the progress of the steps Ex: Step {int} of {int}")
    public void user_should_be_able_to_view_the_horizontal_bar_to_show_the_progress_of_the_steps_ex_step_of(Integer int1, Integer int2) {
        contactUspage.assertcontactusform1progresscount();
        Logger.log("User should be able to view the horizontal bar to show the progress of the steps Ex: Step 1 of 3");

    }
    @Then("User is able to view the list of issues type  with the radio button")
    public void user_is_able_to_view_the_list_of_issues_type_with_the_radio_button() {
        Assert.assertTrue(contactUspage.Getcontactusform1().isDisplayed());
        Logger.log("User is able to view the list of issues type  with the radio button");

    }
    @Then("The user is able to view the Continue CTA in the disabled state by default")
    public void the_user_is_able_to_view_the_continue_cta_in_the_disabled_state_by_default() {
        contactUspage.defaultcontinuectacolor();
    }

    @Then("User is able to view the selection of radio button switches to the last selected one")
    public void user_is_able_to_view_the_selection_of_radio_button_switches_to_the_last_selected_one() {
        contactUspage.selectinglistinstp1();
    }



    @When("User selects an issue type: Ex : Dispensaries")
    public void user_selects_an_issue_type_ex_dispensaries() {
        jsClick(ContactUs.getcontactusfordispensaries());
        Assert.assertEquals("rgba(0, 70, 30, 1)", ContactUs.getcontactusfordispensaries().getCssValue("color"));
    }

    @Then("User is able to view the issue type is getting highlighted and the ‘Continue’ CTA getting enabled")
    public void user_is_able_to_view_the_issue_type_is_getting_highlighted_and_the_continue_cta_getting_enabled() {
        Assert.assertEquals("rgba(0, 70, 30, 1)", ContactUs.getcontactusfordispensaries().getCssValue("color"));
        Assert.assertEquals("rgba(0, 70, 30, 1)", contactUspage.getcontactusstep1continuecta().getCssValue("background-color"));
        Logger.log("User is able to view the issue type is getting highlighted and the ‘Continue’ CTA getting enabled");
    }

    @When("User click on Continue CTA")
    public void user_click_on_continue_cta() {
        jsClick(contactUspage.getcontactusstep1continuecta());
        Logger.log("User click on Continue CTA");
    }

    @Then("user is able to view the horizontal bar to show the progress of the steps Ex: Step {int} of {int}")
    public void user_is_able_to_view_the_horizontal_bar_to_show_the_progress_of_the_steps_ex_step_of(Integer int1, Integer int2) {
        contactUspage.assertcontactusform2progresscount();
        Logger.log("user is able to view the horizontal bar to show the progress of the steps Ex: Step 2 of 3");
    }

    @Then("User is able to view the input text box field has a maximin character limit of {int} to {int} characters to describe the query")
    public void user_is_able_to_view_the_input_text_box_field_has_a_maximin_character_limit_of_to_characters_to_describe_the_query(Integer int1, Integer int2) {
        Assert.assertTrue(contactUspage.getcontactusform2textfield().isDisplayed());
        Assert.assertTrue(contactUspage.gettextfieldcharcount().isDisplayed());
        Logger.log("User is able to view the input text box field has a maximin character limit of 0 to 500 characters to describe the query");
    }

    @Then("User is able to view Upload file and an info text next to it")
    public void user_is_able_to_view_upload_file_and_an_info_text_next_to_it() {
        Assert.assertTrue(contactUspage.getuploadfilecta().isDisplayed());
        Assert.assertTrue(contactUspage.getuploadfilectaassistivetext().isDisplayed());
        Logger.log("User is able to view Upload file and an info text next to it");
    }

    @Then("User is able to view Back link to go back")
    public void user_is_able_to_view_back_link_to_go_back() {
        Assert.assertTrue(contactUspage.getcontactusbackcta().isDisplayed());
        Logger.log("User is able to view Back link to go back");
    }

    @Then("User is able to view Continue CTA")
    public void user_is_able_to_view_continue_cta() {
        Assert.assertTrue(contactUspage.getcontactusstep1continuecta().isDisplayed());
        Logger.log("User is able to view Continue CTA");
    }
    @Then("User is able to view the heading text")
    public void user_is_able_to_view_the_heading_text() {
        Assert.assertTrue(contactUspage.getcontactusheading().isDisplayed());
    }

    @When("User is in the Contact information page")
    public void user_is_in_the_contact_information_page() throws IOException {
        javascriptScroll(footerAction.Getfootersection());
        jsClick(footerAction.getFooterCustomerCenter());
        jsClick(contactUspage.getcustomercenterrecievemessagetitle());
        jsClick(ContactUs.getcontactusfordispensaries());
        Assert.assertEquals("rgba(0, 70, 30, 1)", contactUspage.getcontactusstep1continuecta().getCssValue("background-color"));
        jsClick(contactUspage.getcontactusstep1continuecta());
        Assert.assertTrue(contactUspage.getcontactusheading().isDisplayed());
        jsClick(contactUspage.getcontactusform2textfield());
        SendKeysOnWebElement(contactUspage.getcontactusform2textfield(), getTestData("textfields"));
        jsClick(contactUspage.getcontactusstep1continuecta());
        Assert.assertTrue(contactUspage.getcontactusheading().isDisplayed());
        Logger.log("User is in the Contact information page");
    }

    @Then("user can able to view the horizontal bar to show the progress of the steps Ex: Step {int} of {int}")
    public void user_can_able_to_view_the_horizontal_bar_to_show_the_progress_of_the_steps_ex_step_of(Integer int1, Integer int2) {
        contactUspage.assertcontactusform3progresscount();
        Logger.log("user can able to view the horizontal bar to show the progress of the steps Ex: Step 3 of 3");

    }

    @Then("User is able to view the fields to enter the {string}, {string}, {string}, {string}")
    public void user_is_able_to_view_the_fields_to_enter_the(String FirstName, String LastName, String MobileNumber, String Email) {
        contactUspage.enter_Contactdetails( FirstName, LastName, MobileNumber, Email );
    }

    @Then("user is able rto see select states, select dispensary")
    public void user_is_able_rto_see_select_states_select_dispensary() {
        contactUspage.click_StateDropdown();
        contactUspage.click_dispensaryDropdown();
    }


    @And("User is able to view the dropdown to select the dispensary according to the state selected")
    public void userIsAbleToViewTheDropdownToSelectTheDispensaryAccordingToTheStateSelected() {
        contactUspage.click_dispensaryDropdown();
        Logger.log("User is able to view the dropdown to select the dispensary according to the state selected");


    }

    @Then("user is able to view the dropdown to select the state")
    public void userIsAbleToViewTheDropdownToSelectTheState() {
        contactUspage.click_StateDropdown();
        Logger.log("user is able to view the dropdown to select the state");
    }

    @Then("user should able the view title text")
    public void userShouldAbleTheViewTitleText() {
        Assert.assertTrue(contactUspage.getneed_Helptitle().isDisplayed());
        Logger.log("user should able the view title text");
    }

    @When("user scroll down to Need more help banner")
    public void userScrollDownToNeedMoreHelpBanner() {
        javascriptScroll(footerAction.Getfootersection());
        jsClick(footerAction.getFooterCustomerCenter());
        jsClick(contactUspage.getcustomercenterrecievemessagetitle());
        contactUspage.scrollto_needhelpbanner();
        Logger.log("user scroll down to Need more help banner");

    }

    @And("user should also see the respective copy text")
    public void userShouldAlsoSeeTheRespectiveCopyText() {
        Assert.assertTrue(contactUspage.getneed_helpdeskription().isDisplayed());
        Logger.log("user should also see the respective copy text");
    }

    @And("user is able to view the Find dispensary CTA with Map icon")
    public void userIsAbleToViewTheFindDispensaryCTAWithMapIcon() {
        Assert.assertTrue(contactUspage.getfindDispensary_button().isDisplayed());
        Logger.log("user is able to view the Find dispensary CTA with Map icon");
    }

    @And("user clicks on the Find dispensary button CTA")
    public void userClicksOnTheFindDispensaryButtonCTA() {
        jsClick(contactUspage.getfindDispensary_button());
        Logger.log("user clicks on the Find dispensary button CTA");
    }

    @Then("user should navigate to the Dispensary list screen")
    public void userShouldNavigateToTheDispensaryListScreen() {
        visibilityWait(contactUspage.getdispensary_Drawer());
        Assert.assertTrue(contactUspage.getdispensary_Drawer().isDisplayed());
        Logger.log("user should navigate to the Dispensary list screen");
    }
    @Then("user should able to view the Dispensary information with disensary image based on geolocated dispensary or user pre-selected home dispensary")
    public void user_should_able_to_view_the_dispensary_information_with_disensary_image_based_on_geolocated_dispensary_or_user_pre_selected_home_dispensary() {
        String currentdispensary = contactUspage.getdispensary_Title().getText();
        Assert.assertTrue(contactUspage.getdispensary_Title().isDisplayed());
        Assert.assertTrue(contactUspage.getdispensary_Image().isDisplayed());
        Logger.log("geolocated dispensary or user pre-selected home dispensary is "+currentdispensary);
    }

    @Then("user should able to view the respective dispensary timezone current day")
    public void user_should_able_to_view_the_respective_dispensary_timezone_current_day() {
        String current_Day = contactUspage.getdispensary_Currentday().getText();
        contactUspage.get_currentday();
        Logger.log("user should able to view the respective dispensary timezone current day");
    }



    @Then("user should able to view the clock icon")
    public void user_should_able_to_view_the_clock_icon() {
        Assert.assertTrue(contactUspage.getdispensary_clockicon().isDisplayed());
        Logger.log("user should able to view the clock icon");
    }

    @Then("user is able to see the respective dispensary Phone Number in US format with Phone Icon")
    public void user_is_able_to_see_the_respective_dispensary_phone_number_in_us_format_with_phone_icon() {
        Assert.assertTrue(contactUspage.getdispensary_Phone().isDisplayed());
        Assert.assertTrue(contactUspage.getdispensary_phoneicon().isDisplayed());
        Logger.log("user is able to see the respective dispensary Phone Number in US format with Phone Icon");
    }

    @Then("user should see the Call now CTA")
    public void user_should_see_the_call_now_cta() {
        Assert.assertTrue(contactUspage.getdispensary_callnowcta().isDisplayed());
        Logger.log("user should see the Call now CTA");
    }

    @Then("user is able to see the respective  Dispensary Address with Map icon")
    public void user_is_able_to_see_the_respective_dispensary_address_with_map_icon() {
        Assert.assertTrue(contactUspage.getdispensary_address().isDisplayed());
        Assert.assertTrue(contactUspage.getdispensary_locicon().isDisplayed());
        Logger.log("user is able to see the respective  Dispensary Address with Map icon");
    }

    @Then("user should be able to see View on Maps CTA")
    public void user_should_be_able_to_see_view_on_maps_cta() {
        Assert.assertTrue(contactUspage.getdispensary_viewonmapcta().isDisplayed());
        Logger.log("user should be able to see View on Maps CTA");
    }

    @Then("user should be able to view the view dispensary cta")
    public void user_should_be_able_to_view_the_view_dispensary_cta() {
        Assert.assertTrue(contactUspage.etdispensary_viewdispensarycta().isDisplayed());
        Logger.log("user should be able to view the view dispensary cta");
    }

    @Then("To verify user is able to see the {string} in the Need more help banner")
    public void to_verify_user_is_able_to_see_the_in_the_need_more_help_banner(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("user should able to see copy text")
    public void user_should_able_to_see_copy_text() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
