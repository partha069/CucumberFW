package parallel;

import com.driverfactory.DriverManager;
import com.github.javafaker.Faker;
import com.resuableMethods.CommonAction;
import com.resuableMethods.Highlighter;
import com.utilities.Logger;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pom.gti.T03_UserAuthentication;
import pom.gti.T09_BlogIndexPage;
import pom.gti.T10_BenefitsOfCannabis;
import pom.gti.T11_DispensaryPage;

import java.util.Locale;


public class T03_UserAuthentication_Stepdef extends CommonAction {
    T03_UserAuthentication userAuth = new T03_UserAuthentication(DriverManager.getDriver());
    Highlighter highlighter = new Highlighter();

    @When("user clicked on the profile icon in the header")
    public void user_clicked_on_the_profile_icon_in_the_header() {
        visibilityWait(userAuth.getProfileIcon());
        Assert.assertTrue(userAuth.getProfileIcon().isDisplayed());
       // jsClick(userAuth.getProfileIcon());
        DriverManager.getDriver().findElement(By.xpath("//header[@data-testid='header-wrapper']/child::div/child::div/child::div[2]/child::a/child::*")).click();
        waitFor(200);

        Logger.log("user clicked on the profile icon in the header");
    }
    @Then("User should be able to view the drawer getting opened from the right side of the screen")
    public void user_should_be_able_to_view_the_drawer_getting_opened_from_the_right_side_of_the_screen() {
        visibilityWait(userAuth.getLoginDrawer());
        Assert.assertTrue(userAuth.getLoginDrawer().isDisplayed());
        Logger.log("User should be able to view the drawer getting opened");
    }
    @Then("User should be able to view the title")
    public void user_should_be_able_to_view_the_title() {
        visibilityWait(userAuth.getLoginPageHeader());
        Assert.assertTrue(userAuth.getLoginPageHeader().isDisplayed());
        Logger.log("User should be able to view the title");
    }
    @Then("User should be able to view the profile icon at the top")
    public void user_should_be_able_to_view_the_profile_icon_at_the_top() {
        visibilityWait(userAuth.getLoginPageIcon());
        Assert.assertTrue(userAuth.getLoginPageIcon().isDisplayed());
        Logger.log("User should be able to view the profile icon at the top");
    }
    @Then("User should be able to view the close icon to close the drawer")
    public void user_should_be_able_to_view_the_close_icon_to_close_the_drawer() {
        visibilityWait(userAuth.getCloseIcon());
        Assert.assertTrue(userAuth.getCloseIcon().isDisplayed());
        Logger.log("User should be able to view the close icon to close the drawer");
    }
    @Then("User should be able to view the field to enter the mobile number with an assistive text within the field")
    public void user_should_be_able_to_view_the_field_to_enter_the_mobile_number_with_an_assistive_text_within_the_field() {
        visibilityWait(userAuth.getMobileNumberTextField());
        Assert.assertTrue(userAuth.getMobileNumberTextField().isDisplayed());
        Logger.log("User should be able to view the field to enter the mobile number with an assistive text within the field");
    }
    @Then("User should be able to view the CTA to get the OTP")
    public void user_should_be_able_to_view_the_cta_to_get_the_otp() {
        visibilityWait(userAuth.getGetOTPCTA());
        Assert.assertTrue(userAuth.getGetOTPCTA().isDisplayed());
        Logger.log("User should be able to view the CTA to get the OTP");
    }
    @Then("User should be able to view the CTA in disabled state in default")
    public void user_should_be_able_to_view_the_cta_in_disabled_state_in_default() {
        if(userAuth.getGetOTPCTA().getAttribute("disabled").equals("true")){
        visibilityWait(userAuth.getGetOTPCTA());
        Assert.assertTrue(userAuth.getGetOTPCTA().isDisplayed());
        Logger.log("User should be able to view the CTA in disabled state in default");
        }else {
            Assert.fail();
            Logger.log("User not able to view the CTA in disabled state in default");
        }
    }
    @Then("User should be able to view the highlighted copy text at the bottom")
    public void user_should_be_able_to_view_the_highlighted_copy_text_at_the_bottom() {
        visibilityWait(userAuth.getLoginPageCopyText());
        Assert.assertTrue(userAuth.getLoginPageCopyText().isDisplayed());
        Logger.log("User should be able to view the highlighted copy text at the bottom");
    }
    @Then("User should be able to fill in with {int} digits mobile number")
    public void user_should_be_able_to_fill_in_with_digits_mobile_number(Integer int1) {
        waitFor(400);
        long mobileNumber = generateRandomNumber();
        String mobileNumberString = Long.toString(mobileNumber);
        userAuth.getMobileNumberTextField().sendKeys(mobileNumberString);
        Logger.log("User should be able to fill in with {int} digits mobile number");
    }
    @Then("User fills mobile number with valid number of digits")
    public void user_fills_mobile_number_with_valid_number_of_digits() {
        waitFor(400);
        long mobileNumber = generateRandomNumber();
        String mobileNumberString = Long.toString(mobileNumber);
        userAuth.getMobileNumberTextField().sendKeys(mobileNumberString);
        Logger.log("User fills mobile number with valid number of digits");
    }
    @Then("User should be able to view the CTA getting in enabled state")
    public void user_should_be_able_to_view_the_cta_getting_in_enabled_state() {
        waitFor(200);
       Object obj =  userAuth.getGetOTPCTA().getAttribute("disabled");
        if(obj != null) {
            Assert.fail();
            Logger.log("User not able to view the CTA getting in enabled state");
        }else {
            visibilityWait(userAuth.getGetOTPCTA());
            Assert.assertTrue(userAuth.getGetOTPCTA().isDisplayed());
            Logger.log("User should be able to view the CTA getting in enabled state");
        }
    }
    @Then("User should be able to view an error message")
    public void user_should_be_able_to_view_an_error_message() {
        visibilityWait(userAuth.getMobileNumberErrorText());
        waitFor(1000);
        Assert.assertTrue(userAuth.getMobileNumberErrorText().isDisplayed());
        Logger.log("User should be able to view an error message");
    }
    @Then("User should be able to view the CTA in disabled state until the user enters mobile number with valid number of digits")
    public void user_should_be_able_to_view_the_cta_in_disabled_state_until_the_user_enters_mobile_number_with_valid_number_of_digits() {
        if(userAuth.getGetOTPCTA().getAttribute("disabled").equals("true")) {
            visibilityWait(userAuth.getGetOTPCTA());
            Assert.assertTrue(userAuth.getGetOTPCTA().isDisplayed());
            Logger.log("User should be able to view the CTA in disabled state until the user enters mobile number with valid number of digits");
        }else {
            Assert.fail();
            Logger.log("User not able to view the CTA in disabled state until the user enters mobile number with valid number of digits");
        }
    }
    @When("User click on the CTA to get the OTP")
    public void user_click_on_the_cta_to_get_the_otp() {
        visibilityWait(userAuth.getGetOTPCTA());
        Assert.assertTrue(userAuth.getGetOTPCTA().isDisplayed());
        jsClick(userAuth.getGetOTPCTA());
        Logger.log("User click on the CTA to get the OTP");
    }
    @Then("User should be able to view a copy text with entered mobile number")
    public void user_should_be_able_to_view_a_copy_text_with_entered_mobile_number() {
        visibilityWait(userAuth.getEnterOTPCopyText());
        Assert.assertTrue(userAuth.getEnterOTPCopyText().isDisplayed());
        Logger.log("User should be able to view a copy text with entered mobile number");
    }
    @Then("User should be able to view the fields to enter the OTP")
    public void user_should_be_able_to_view_the_fields_to_enter_the_otp() {
        visibilityWait(userAuth.getOtpField());
        Assert.assertTrue(userAuth.getOtpField().isDisplayed());
        Logger.log("User should be able to view the fields to enter the OTP");
    }
    @Then("User should be able to view the CTA to submit the OTP")
    public void user_should_be_able_to_view_the_cta_to_submit_the_otp() {
        visibilityWait(userAuth.getOtpSubmitCTA());
        Assert.assertTrue(userAuth.getOtpSubmitCTA().isDisplayed());
        Logger.log("User should be able to view the CTA to submit the OTP");
    }
    @Then("User should be able to view the CTA in disabled state until user enters all the fields")
    public void user_should_be_able_to_view_the_cta_in_disabled_state_until_user_enters_all_the_fields() {
        if(userAuth.getOtpSubmitCTA().getAttribute("disabled").equals("true")) {
            visibilityWait(userAuth.getOtpSubmitCTA());
            Assert.assertTrue(userAuth.getOtpSubmitCTA().isDisplayed());
            Logger.log("User should be able to view the CTA in disabled state until user enters all the fields");
        }else {
            Assert.fail();
            Logger.log("User not able to view the CTA in disabled state until user enters all the fields");
        }
    }
    @Then("User should be able to view the CTA to resend the OTP")
    public void user_should_be_able_to_view_the_cta_to_resend_the_otp() {
        visibilityWait(userAuth.getResendOtpCTA());
        Assert.assertTrue(userAuth.getResendOtpCTA().isDisplayed());
        Logger.log("User should be able to view the CTA to resend the OTP");
    }
    @Then("User should be able to view the ‘Resend’ CTA to be disabled for the next {int} seconds from the triggering of the OTP")
    public void user_should_be_able_to_view_the_resend_cta_to_be_disabled_for_the_next_seconds_from_the_triggering_of_the_otp(Integer int1) {
        if(userAuth.getResendOtpCTA().getAttribute("disabled").equals("true")) {
            visibilityWait(userAuth.getResendOtpCTA());
            Assert.assertTrue(userAuth.getResendOtpCTA().isDisplayed());
            Logger.log("User should be able to view the ‘Resend’ CTA to be disabled for the next {int} seconds from the triggering of the OTP");
        }else {
            Assert.fail();
            Logger.log("User not able to view the ‘Resend’ CTA to be disabled for the next {int} seconds from the triggering of the OTP");
        }
    }
    @Then("User should be able to view informatory text")
    public void user_should_be_able_to_view_informatory_text() {
        waitFor(35000);
        visibilityWait(userAuth.getResendCopyText());
        Assert.assertTrue(userAuth.getResendCopyText().isDisplayed());
        Logger.log("User should be able to view informatory tex");
    }
    @Then("User should be able to view the ‘Resend OTP’ CTA getting enabled")
    public void user_should_be_able_to_view_the_resend_otp_cta_getting_enabled() {
        if(!userAuth.getResendOtpCTA().getAttribute("disabled").equals("true")) {
            visibilityWait(userAuth.getResendOtpCTA());
            Assert.assertTrue(userAuth.getResendOtpCTA().isDisplayed());
            waitFor(2000);
            Logger.log("User should be able to view the ‘Resend OTP’ CTA getting enabled");
        }else {
            Assert.fail();
            Logger.log("User not able to view the ‘Resend OTP’ CTA getting enabled");
        }
    }
    @When("User enter the valid otp")
    public void user_enter_the_valid_otp() {
        visibilityWait(userAuth.getEnterOtpTextFieldList().get(0));
        userAuth.getEnterOtpTextFieldList().get(0).sendKeys("1");
        visibilityWait(userAuth.getEnterOtpTextFieldList().get(1));
        userAuth.getEnterOtpTextFieldList().get(1).sendKeys("2");
        visibilityWait(userAuth.getEnterOtpTextFieldList().get(2));
        userAuth.getEnterOtpTextFieldList().get(2).sendKeys("3");
        visibilityWait(userAuth.getEnterOtpTextFieldList().get(3));
        userAuth.getEnterOtpTextFieldList().get(3).sendKeys("4");
        visibilityWait(userAuth.getEnterOtpTextFieldList().get(4));
        userAuth.getEnterOtpTextFieldList().get(4).sendKeys("5");
        visibilityWait(userAuth.getEnterOtpTextFieldList().get(5));
        userAuth.getEnterOtpTextFieldList().get(5).sendKeys("6");
        Logger.log("User enter the valid otp");
    }
    @When("user click on the Submit button")
    public void user_click_on_the_submit_button() {
        visibilityWait(userAuth.getSubmitCTA());
        Assert.assertTrue(userAuth.getSubmitCTA().isDisplayed());
        jsClick(userAuth.getSubmitCTA());
        Logger.log("user click on the Submit button");
    }
    @Then("User should be able to see logo & icon at the top center of the drawer")
    public void user_should_be_able_to_see_logo_icon_at_the_top_center_of_the_drawer() {
        visibilityWait(userAuth.getSignUpPageProfileIcon());
        Assert.assertTrue(userAuth.getSignUpPageProfileIcon().isDisplayed());
        Logger.log("User should be able to see logo & icon at the top center of the drawer");
    }
    @Then("User should be able to see close CTA")
    public void user_should_be_able_to_see_close_cta() {
        visibilityWait(userAuth.getSignUpPageCloseIcon());
        Assert.assertTrue(userAuth.getSignUpPageCloseIcon().isDisplayed());
        Logger.log("User should be able to see close CTA");
    }
    @Then("User should be able to see the title and description text")
    public void user_should_be_able_to_see_the_title_and_description_text() {
        visibilityWait(userAuth.getSignUpPageHeader());
        Assert.assertTrue(userAuth.getSignUpPageHeader().isDisplayed());
        Logger.log("User should be able to see the title text");
        visibilityWait(userAuth.getSignUpPageCopyText());
        Assert.assertTrue(userAuth.getSignUpPageCopyText().isDisplayed());
        Logger.log("User should be able to see the description text");
    }
    @Then("User should be able to see mandatory fields to be filled")
    public void user_should_be_able_to_see_mandatory_fields_to_be_filled() {
        visibilityWait(userAuth.getSignUpPageTextFieldList().get(0));
        Assert.assertTrue(userAuth.getSignUpPageTextFieldList().get(0).isDisplayed());
        for (WebElement ele : userAuth.getSignUpPageTextFieldList() ){
            visibilityWait(ele);
            Assert.assertTrue(ele.isDisplayed());
        }
        Logger.log("User should be able to see mandatory fields to be filled");
    }
    @Then("User should be able to see a checkbox")
    public void user_should_be_able_to_see_a_checkbox() {
        visibilityWait(userAuth.getSignUpPageCheckoutBox().get(0));
        Assert.assertTrue(userAuth.getSignUpPageCheckoutBox().get(0).isDisplayed());
        for (WebElement ele : userAuth.getSignUpPageCheckoutBox() ){
            visibilityWait(ele);
            Assert.assertTrue(ele.isDisplayed());
        }
        Logger.log("User should be able to see a checkbox");
    }
    @Then("User should be able to see ‘Show more’ CTA with downward arrow icon facing downwards to collapse details if necessary")
    public void user_should_be_able_to_see_show_more_cta_with_downward_arrow_icon_facing_downwards_to_collapse_details_if_necessary() {
        visibilityWait(userAuth.getShowMoreCTA());
        Assert.assertTrue(userAuth.getShowMoreCTA().isDisplayed());
        Logger.log("User should be able to see ‘Show more’ CTA with downward arrow icon facing downwards to collapse details if necessary");
    }
    @Then("User should be able to see the ‘Submit’ button sticky at the bottom of the page in disabled state as default")
    public void user_should_be_able_to_see_the_submit_button_sticky_at_the_bottom_of_the_page_in_disabled_state_as_default() {
        visibilityWait(userAuth.getSubmitSignUpCTA());
        Assert.assertTrue(userAuth.getSubmitSignUpCTA().isDisplayed());
        Logger.log("User should be able to see the ‘Submit’ button sticky at the bottom of the page in disabled state as default");
    }
    @When("User clicks on the close icon")
    public void user_clicks_on_the_close_icon() {
        visibilityWait(userAuth.getSignUpPageCloseIcon());
        Assert.assertTrue(userAuth.getSignUpPageCloseIcon().isDisplayed());
        jsClick(userAuth.getSignUpPageCloseIcon());
        Logger.log("User clicks on the close icon");
    }
    @Then("User should be able to view a pop-up for confirmation to exit")
    public void user_should_be_able_to_view_a_pop_up_for_confirmation_to_exit() {
        visibilityWait(userAuth.getClosePopUpScreen());
        Assert.assertTrue(userAuth.getClosePopUpScreen().isDisplayed());
        Logger.log("User should be able to view a pop-up for confirmation to exit");
    }
    @When("User clicks on the Show more cta")
    public void user_clicks_on_the_show_more_cta() {
        javascriptScroll(userAuth.getSignUpPageTextFieldList().get(4));
        visibilityWait(userAuth.getShowMoreCTA());
        Assert.assertTrue(userAuth.getShowMoreCTA().isDisplayed());
        jsClick(userAuth.getShowMoreCTA());
        Logger.log("User clicks on the Show more cta");
    }
    @Then("User should be able to see ‘Show less’ CTA with arrow facing upwards once the full details is displayed")
    public void user_should_be_able_to_see_show_less_cta_with_arrow_facing_upwards_once_the_full_details_is_displayed() {
        visibilityWait(userAuth.getShowLessCTA());
        Assert.assertTrue(userAuth.getShowLessCTA().isDisplayed());
        Logger.log("User should be able to see ‘Show less’ CTA with arrow facing upwards once the full details is displayed");
    }
    @When("user wnter all valid details in the form")
    public void user_wnter_all_valid_details_in_the_form() {
        visibilityWait(userAuth.getSignUpPageTextFieldList().get(0));
        Assert.assertTrue(userAuth.getSignUpPageTextFieldList().get(0).isDisplayed());
        jsClick(userAuth.getSignUpPageTextInputFieldList().get(0));
        userAuth.getSignUpPageTextInputFieldList().get(0).sendKeys("Test");
        visibilityWait(userAuth.getSignUpPageTextInputFieldList().get(1));
        Assert.assertTrue(userAuth.getSignUpPageTextInputFieldList().get(1).isDisplayed());
        jsClick(userAuth.getSignUpPageTextInputFieldList().get(1));
        userAuth.getSignUpPageTextInputFieldList().get(1).sendKeys("LastName");
        visibilityWait(userAuth.getSignUpPageTextInputFieldList().get(2));
        Assert.assertTrue(userAuth.getSignUpPageTextInputFieldList().get(2).isDisplayed());
        jsClick(userAuth.getSignUpPageTextInputFieldList().get(2));
        userAuth.getSignUpPageTextInputFieldList().get(2).sendKeys("03/21/2003");
        visibilityWait(userAuth.getSignUpPageTextInputFieldList().get(3));
        Assert.assertTrue(userAuth.getSignUpPageTextInputFieldList().get(3).isDisplayed());
        jsClick(userAuth.getSignUpPageTextInputFieldList().get(3));
        userAuth.getSignUpPageTextInputFieldList().get(3).sendKeys("testuser001@test.com");
        jsClick(userAuth.getSignUpPageTextInputFieldList().get(3));
        waitFor(500);
        javascriptScroll(userAuth.getSignUpPageTextInputFieldList().get(3));
        visibilityWait(userAuth.getSignUpPageDropDownFieldList().get(0));
        Assert.assertTrue(userAuth.getSignUpPageDropDownFieldList().get(0).isDisplayed());
        jsClick(userAuth.getSignUpPageDropDownFieldList().get(0));
        waitFor(200);
        userAuth.getCaliforniaDropDownOption().click();
        visibilityWait(userAuth.getSignUpPageDropDownFieldList().get(1));
        Assert.assertTrue(userAuth.getSignUpPageDropDownFieldList().get(1).isDisplayed());
        jsClick(userAuth.getSignUpPageDropDownFieldList().get(1));
        waitFor(200);
        userAuth.getRiseDispensaryPasadenaOption().click();
        visibilityWait(userAuth.getSignUpPageCheckoutBox().get(0));
        Assert.assertTrue(userAuth.getSignUpPageCheckoutBox().get(0).isDisplayed());
        jsClick(userAuth.getSignUpPageCheckoutBox().get(0));
        waitFor(200);
        userAuth.getSignUpPageCheckoutBox().get(1).click();
        visibilityWait(userAuth.getSignUpPageCheckoutBox().get(1));
        Assert.assertTrue(userAuth.getSignUpPageCheckoutBox().get(1).isDisplayed());
        jsClick(userAuth.getSignUpPageCheckoutBox().get(1));
        waitFor(200);
        userAuth.getSignUpPageCheckoutBox().get(1).click();
        Logger.log("user wnter all valid details in the form");
    }
    @When("user clicks on the submit button")
    public void user_clicks_on_the_submit_button() {
        visibilityWait(userAuth.getSubmitSignUpCTA());
        Assert.assertTrue(userAuth.getSubmitSignUpCTA().isDisplayed());
        jsClick(userAuth.getSubmitSignUpCTA());
        Logger.log("user clicks on the submit button");
    }
    @Then("User should be able to view confirmation screen upon successful submission of the Form")
    public void user_should_be_able_to_view_confirmation_screen_upon_successful_submission_of_the_form() {
        visibilityWait(userAuth.getCongratulationScreen());
        Assert.assertTrue(userAuth.getCongratulationScreen().isDisplayed());
        Logger.log("User should be able to view confirmation screen upon successful submission of the Form");
    }
    @Then("User should be able to view the image in UserAuthentication")
    public void user_should_be_able_to_view_the_image_in_UserAuthentication() {
        visibilityWait(userAuth.getCongratulationScreenImage());
        Assert.assertTrue(userAuth.getCongratulationScreenImage().isDisplayed());
        Logger.log("User should be able to view the image");
    }
    @Then("User should be able to view a copy text with entered email address")
    public void user_should_be_able_to_view_a_copy_text_with_entered_email_address() {
        visibilityWait(userAuth.getCongratulationScreenCopyText());
        Assert.assertTrue(userAuth.getCongratulationScreenCopyText().isDisplayed());
        Logger.log("User should be able to view a copy text with entered email address");
    }
    @Then("User should be able to view the ‘Finish’ CTA to submit the OTP")
    public void user_should_be_able_to_view_the_finish_cta_to_submit_the_otp() {
        Assert.fail();
        Logger.log("User not be able to view the ‘Finish’ CTA to submit the OTP");
    }
    @Then("User should be able to view the ‘Skip and continue shopping’ CTA")
    public void user_should_be_able_to_view_the_skip_and_continue_shopping_cta() {
        visibilityWait(userAuth.getCongratulationScreenCopyText());
        Assert.assertTrue(userAuth.getCongratulationScreenCopyText().isDisplayed());
        Logger.log("User should be able to view the ‘Skip and continue shopping’ CTA");
    }
    @And("User starts entering on the field")
    public void userStartsEnteringOnTheField() {
        int mobileNumber = generateRandomNumber1();
        String mobileNumberString = Integer.toString(mobileNumber);
        userAuth.getMobileNumberTextField().sendKeys(mobileNumberString);
        Logger.log("User starts entering on the field");
    }
    @Then("User should be able to view the title in Enter OTP screen")
    public void userShouldBeAbleToViewTheTitleInEnterOTPScreen() {
        visibilityWait(userAuth.getOtpScreen());
        Assert.assertTrue(userAuth.getOtpScreen().isDisplayed());
        Logger.log("User should be able to view the Enter OTP screen");
        visibilityWait(userAuth.getEnterOTPHeader());
        Assert.assertTrue(userAuth.getEnterOTPHeader().isDisplayed());
        Logger.log("User should be able to view the title in Enter OTP screen");
    }

}
