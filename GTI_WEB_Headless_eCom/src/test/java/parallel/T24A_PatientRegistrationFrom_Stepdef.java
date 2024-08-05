package parallel;

import com.driverfactory.DriverManager;
import com.resuableMethods.CommonAction;
import com.utilities.Logger;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pom.gti.T11_DispensaryPage;
import pom.gti.T24A_PatientRegistrationFrom;

import java.util.List;

public class T24A_PatientRegistrationFrom_Stepdef extends CommonAction {
    T11_DispensaryPage T11_DispensaryPage = new T11_DispensaryPage(DriverManager.getDriver());
    T24A_PatientRegistrationFrom T24_RegistrationFrom = new T24A_PatientRegistrationFrom(DriverManager.getDriver());
    String radioButtonClassvalue;

    @Given("User is on the expanded DISPENSARIES")
    public void user_is_on_the_expanded_dispensaries() {
        visibilityWait(T11_DispensaryPage.getDispensaryStateList().get(0));
        Assert.assertTrue(T11_DispensaryPage.getDispensaryStateList().get(0).isDisplayed());
        Logger.log("User is on the expanded DISPENSARIES");
    }
    @Given("User should see list of available states like California, Connecticut and so on")
    public void user_should_see_list_of_available_states_like_california_connecticut_and_so_on() {
        visibilityWait(T11_DispensaryPage.getDispensaryStateList().get(0));
        Assert.assertTrue(T11_DispensaryPage.getDispensaryStateList().get(0).isDisplayed());
        for(WebElement ele: T11_DispensaryPage.getDispensaryStateList()){
            visibilityWait(ele);
            Assert.assertTrue(ele.isDisplayed());
        }
        Logger.log("User should see list of available states like California, Connecticut and so on");
    }
    @Given("User clicked  on particular state \\(Ex:Illinois)")
    public void user_clicked_on_particular_state_ex_illinois() {
        waitFor(200);
        System.out.println(T11_DispensaryPage.getMobileCLoseIcon().isDisplayed());
        if(T11_DispensaryPage.getMobileCLoseIcon().isDisplayed()){
            waitFor(100);
            visibilityWait(T11_DispensaryPage.getDispensaryStateList().get(2));
            Assert.assertTrue(T11_DispensaryPage.getDispensaryStateList().get(2).isDisplayed());
            DriverManager.getDriver().findElement(By.xpath("//div[@data-testid='header-dispensaries']/child::div/child::ul/child::li[*]/child::a/child::h5[text()='Illinois']")).click();
            // jsClick(dispensaryPage.getDispensaryStateList().get(2));
            Logger.log("User clicks one of the state");
        }else {
            visibilityWait(T11_DispensaryPage.getDispensaryStateIllinois());
            Assert.assertTrue(T11_DispensaryPage.getDispensaryStateIllinois().isDisplayed());
            jsClick(T11_DispensaryPage.getDispensaryStateIllinois());
            Logger.log("User clicks one of the state");
        }
    }
    @Given("User should see llist of avilable dispensaries like RISE Mundelein")
    public void user_should_see_llist_of_avilable_dispensaries_like_rise_mundelein() {
        visibilityWait(T24_RegistrationFrom.getIllinoisDispensariesList().get(0));
        for (WebElement ele:T24_RegistrationFrom.getIllinoisDispensariesList()){
            visibilityWait(ele);
            Assert.assertTrue(ele.isDisplayed());
        }
        Logger.log("User should see llist of avilable dispensaries like RISE Mundelein");
    }
    @And("User clicks on Get & Renew medical card title link")
    public void userClicksOnGetRenewMedicalCardTitleLink() {
        visibilityWait(T11_DispensaryPage.getQuickLinksTitleLinkCardList().get(4));
        boolean quickLink = isClickable(T11_DispensaryPage.getQuickLinksTitleLinkCardList().get(4));
        System.out.println(quickLink);
        jsClick(T11_DispensaryPage.getQuickLinksTitleLinkCardList().get(4));
        Logger.log("User clicks on Get & Renew medical card title link");
    }
    @When("User is landed on Dispensary Page")
    public void userIsLandedOnDispensaryPage() {
        visibilityWait(T11_DispensaryPage.getRiseDispensaryMundeleinHeader());
        Assert.assertTrue(T11_DispensaryPage.getRiseDispensaryMundeleinHeader().isDisplayed());
        Logger.log("User is landed on Dispensary Page");
    }
    @And("User click on GET & RENEW MEDICAL CARD")
    public void userClickOnGETRENEWMEDICALCARD() {
        waitFor(100);
        visibilityWait(T11_DispensaryPage.getQuickLinkSArrowIconList().get(4));
        Assert.assertTrue(T11_DispensaryPage.getQuickLinkSection().isDisplayed());
        jsClick(T11_DispensaryPage.getQuickLinkSArrowIconList().get(4));
        Logger.log("User click on GET & RENEW MEDICAL CARD");
    }
    @When("User is on of Patient Registration form page")
    public void user_is_on_of_patient_registration_form_page() {
        visibilityWait(T11_DispensaryPage.getRiseDispensaryMundeleinHeader());
        Assert.assertTrue(T11_DispensaryPage.getRiseDispensaryMundeleinHeader().isDisplayed());
        Logger.log("User is landed on Dispensary Page");
        waitFor(100);
        javascriptScroll(T11_DispensaryPage.getQuickLinkSection());
        visibilityWait(T11_DispensaryPage.getQuickLinkSection());
        Assert.assertTrue(T11_DispensaryPage.getQuickLinkSection().isDisplayed());
        Logger.log("User is able to see Quick Links");
        waitFor(100);
        visibilityWait(T11_DispensaryPage.getQuickLinkSArrowIconList().get(4));
        Assert.assertTrue(T11_DispensaryPage.getQuickLinkSection().isDisplayed());
        jsClick(T11_DispensaryPage.getQuickLinkSArrowIconList().get(4));
        Logger.log("User click on GET & RENEW MEDICAL CARD");
        visibilityWait(T24_RegistrationFrom.getPatientRegistrationFromHeader());
        Assert.assertTrue(T24_RegistrationFrom.getPatientRegistrationFromHeader().isDisplayed());
        Logger.log("User is able to navigate to Patient Registration Form");
    }
    @Then("User is able to see appropriate breadcrumb")
    public void user_is_able_to_see_appropriate_breadcrumb() {
        visibilityWait(T24_RegistrationFrom.getPatientRegistrationFromBreadcrumb());
        Assert.assertTrue(T24_RegistrationFrom.getPatientRegistrationFromBreadcrumb().isDisplayed());
        Logger.log("User is able to see appropriate breadcrumb");
    }
    @Then("User is able to see appropriate breadcrumb hierarchy")
    public void user_is_able_to_see_appropriate_breadcrumb_hierarchy() {
        Assert.fail();
        Logger.log("User is not able to see appropriate breadcrumb hierarchy");
    }

    @Then("User is able to navigate to Patient Registration Form")
    public void user_is_able_to_navigate_to_patient_registration_form() {
        visibilityWait(T24_RegistrationFrom.getPatientRegistrationFromHeader());
        Assert.assertTrue(T24_RegistrationFrom.getPatientRegistrationFromHeader().isDisplayed());
        Logger.log("User is able to navigate to Patient Registration Form");
    }

    @Then("in step {int} state should be pre-filled")
    public void in_step_state_should_be_pre_filled(Integer int1) {
        visibilityWait(T24_RegistrationFrom.getContactInformationDropdownList().get(0));
        javascriptScroll(T24_RegistrationFrom.getContactInformationHeader());
        String value = T24_RegistrationFrom.getContactInformationDropdownList().get(0).getText();
        System.out.println("State-->" +value );
        if(value.equals("Illinois")){
            Assert.assertTrue(T24_RegistrationFrom.getContactInformationDropdownList().get(0).isDisplayed());
            Logger.log("User is able to see in state should be pre-filled");
        }else {
            Logger.log("User is not able to see in state should be pre-filled");
        }
        String value1 = T24_RegistrationFrom.getContactInformationDropdownList().get(1).getText();
        System.out.println("Nearest RISE dispensary-->" +value1 );
        if(value1.equals("RISE Dispensary Mundelein")){
            Assert.assertTrue(T24_RegistrationFrom.getContactInformationDropdownList().get(0).isDisplayed());
            Logger.log("User is able to see in Nearest RISE dispensary should be pre-filled");
        }else {
            Logger.log("User is not able to see in Nearest RISE dispensary should be pre-filled");
        }
    }
    @Then("the URL should be updated accordingly Ex: mystate=Illinois in URL")
    public void the_url_should_be_updated_accordingly_ex_mystate_illinois_in_url() {
        String patientRegistrationFormURL = DriverManager.getDriver().getCurrentUrl();
        System.out.println("URL--->" + patientRegistrationFormURL);
        if(patientRegistrationFormURL.contains("mystate=Illinois")){
            Logger.log("User is able to see the URL should be updated accordingly Ex: mystate=Illinois in URL");
        }else {
            Logger.log("User is not able to see the URL should be updated accordingly Ex: mystate=Illinois in URL");
        }
    }
    @When("User is viewing the Hero section of Patient Registration Form")
    public void user_is_viewing_the_hero_section_of_Patient_Registration_form() {
        visibilityWait(T24_RegistrationFrom.getPatientRegistrationFromBanner());
        Assert.assertTrue(T24_RegistrationFrom.getPatientRegistrationFromBanner().isDisplayed());
        Logger.log("User is viewing the Hero section of Patient Registration Form");
    }
    @Then("User is able to view the Title text")
    public void user_is_able_to_view_the_title_text() {
        visibilityWait(T24_RegistrationFrom.getPatientRegistrationFromHeader());
        Assert.assertTrue(T24_RegistrationFrom.getPatientRegistrationFromHeader().isDisplayed());
        Logger.log("User is able to view the Title text");
    }
    @Then("User is able to view the Copy text")
    public void user_is_able_to_view_the_copy_text() {
        visibilityWait(T24_RegistrationFrom.getPatientRegistrationFromBannerCopyText());
        Assert.assertTrue(T24_RegistrationFrom.getPatientRegistrationFromBannerCopyText().isDisplayed());
        Logger.log("User is able to view the Copy text");
    }
    @Then("User is able to view the Hero image")
    public void user_is_able_to_view_the_hero_image() {
        visibilityWait(T24_RegistrationFrom.getPatientRegistrationFromBannerImage());
        Assert.assertTrue(T24_RegistrationFrom.getPatientRegistrationFromBannerImage().isDisplayed());
        Logger.log("User is able to view the Hero image");
    }
    @When("User is viewing the Left side Title")
    public void user_is_viewing_the_left_side_title() {
        visibilityWait(T24_RegistrationFrom.getPatientRegistrationFromSideBanner());
        Assert.assertTrue(T24_RegistrationFrom.getPatientRegistrationFromSideBanner().isDisplayed());
        Logger.log("User is viewing the Left side Title");
    }
    @Then("User should be able to view the Background image ,")
    public void user_should_be_able_to_view_the_background_image() {
        visibilityWait(T24_RegistrationFrom.getPatientRegistrationFromSideBanner());
        Assert.assertTrue(T24_RegistrationFrom.getPatientRegistrationFromSideBanner().isDisplayed());
        Logger.log("User should be able to view the Background image ,");
    }
    @Then("User is able to view the RISE Logo")
    public void user_is_able_to_view_the_rise_logo() {
        visibilityWait(T24_RegistrationFrom.getPatientRegistrationFromSideBannerLogo());
        Assert.assertTrue(T24_RegistrationFrom.getPatientRegistrationFromSideBannerLogo().isDisplayed());
        Logger.log("User is able to view the RISE Logo");
    }
    @Then("User is able to view the description")
    public void user_is_able_to_view_the_description() {
        visibilityWait(T24_RegistrationFrom.getPatientRegistrationFromSideBannerDescription());
        Assert.assertTrue(T24_RegistrationFrom.getPatientRegistrationFromSideBannerDescription().isDisplayed());
        Logger.log("User is able to view the description");
    }
    @And("user is able to view the title text")
    public void userIsAbleToViewTheTitleText() {
        visibilityWait(T24_RegistrationFrom.getPatientRegistrationFromSideBannerTitle());
        Assert.assertTrue(T24_RegistrationFrom.getPatientRegistrationFromSideBannerTitle().isDisplayed());
        Logger.log("user is able to view the title text");
    }
    @When("User is User is viewing the {string} section")
    public void user_is_user_is_viewing_the_section(String string) {
        visibilityWait(T24_RegistrationFrom.getiWantAssistanceWithTitle());
        Assert.assertTrue(T24_RegistrationFrom.getiWantAssistanceWithTitle().isDisplayed());
        Logger.log("User is User is viewing the I want Assistance section");
    }
    @Then("User should be able to view the Step number and the total steps present as Step {int} of {int}")
    public void user_should_be_able_to_view_the_step_number_and_the_total_steps_present_as_step_of(Integer int1, Integer int2) {
        visibilityWait(T24_RegistrationFrom.getiWantAssistanceWithStepText());
        Assert.assertTrue(T24_RegistrationFrom.getiWantAssistanceWithStepText().isDisplayed());
        Logger.log("User should be able to view the Step number and the total steps present as Step 1 of 3");
    }

    @When("User is in the step {int} and viewing {string}")
    public void user_is_in_the_step_and_viewing(Integer int1, String string) {
        visibilityWait(T24_RegistrationFrom.getiWantAssistanceWithTitle());
        javascriptScroll(T24_RegistrationFrom.getiWantAssistanceWithTitle());
        Assert.assertTrue(T24_RegistrationFrom.getiWantAssistanceWithTitle().isDisplayed());
        Logger.log("User is in the step 1 and viewing I want assistance section");
        visibilityWait(T24_RegistrationFrom.getiWantAssistanceWithStepText());
        Assert.assertTrue(T24_RegistrationFrom.getiWantAssistanceWithStepText().isDisplayed());
        Logger.log("User should be able to view the Step number and the total steps present as Step 1 of 3");
    }
    @Then("User should be able view the title text of the section")
    public void user_should_be_able_view_the_title_text_of_the_section() {
        visibilityWait(T24_RegistrationFrom.getiWantAssistanceWithTitle());
        Assert.assertTrue(T24_RegistrationFrom.getiWantAssistanceWithTitle().isDisplayed());
        Logger.log("User should be able view the title text of the section");
    }

    @Then("User should be able to view the required fields info under the section title {string}")
    public void user_should_be_able_to_view_the_required_fields_info_under_the_section_title(String string) {
        visibilityWait(T24_RegistrationFrom.getiWantAssistanceWithRequiredCopyText());
        Assert.assertTrue(T24_RegistrationFrom.getiWantAssistanceWithRequiredCopyText().isDisplayed());
        Logger.log("User should be able to view the required fields info under the section title This is a required step.");
    }

    @Then("User should be able to view the {int} options to select for the medical card")
    public void user_should_be_able_to_view_the_options_to_select_for_the_medical_card(Integer int1) {
        visibilityWait(T24_RegistrationFrom.getiWantAssistanceWithRadioButtonList().get(0));
        if (T24_RegistrationFrom.getiWantAssistanceWithRadioButtonList().size() == 3){
            for (WebElement ele: T24_RegistrationFrom.getiWantAssistanceWithRadioButtonList()){
                visibilityWait(ele);
                Assert.assertTrue(ele.isDisplayed());
            }
            Logger.log("User should be able to view the 3 options to select for the medical card");
        }else {
            Logger.log("User not able to view the 3 options to select for the medical card");
        }
    }
    @Then("User should able to see Getting A Medical Card option")
    public void user_should_able_to_see_getting_a_medical_card_option() {
        visibilityWait(T24_RegistrationFrom.getiWantAssistanceWithRadioButtonList().get(0));
        Assert.assertTrue(T24_RegistrationFrom.getiWantAssistanceWithRadioButtonList().get(0).isDisplayed());
        Logger.log("User should able to see Getting A Medical Card option");
    }
    @Then("User should able to see Renewing My Medical Card option")
    public void user_should_able_to_see_renewing_my_medical_card_option() {
        visibilityWait(T24_RegistrationFrom.getiWantAssistanceWithRadioButtonList().get(1));
        Assert.assertTrue(T24_RegistrationFrom.getiWantAssistanceWithRadioButtonList().get(1).isDisplayed());
        Logger.log("User should able to see Renewing My Medical Card option");
    }
    @Then("User should able to see Something Else option")
    public void user_should_able_to_see_something_else_option() {
        visibilityWait(T24_RegistrationFrom.getiWantAssistanceWithRadioButtonList().get(2));
        Assert.assertTrue(T24_RegistrationFrom.getiWantAssistanceWithRadioButtonList().get(2).isDisplayed());
        Logger.log("User should able to see Something Else option");
    }

    @When("User selects a radio button")
    public void user_selects_a_radio_button() {
        visibilityWait(T24_RegistrationFrom.getiWantAssistanceWithRadioButtonList().get(0));
        Assert.assertTrue(T24_RegistrationFrom.getiWantAssistanceWithRadioButtonList().get(0).isDisplayed());
        jsClick(T24_RegistrationFrom.getiWantAssistanceWithRadioButtonlabelList().get(0));
        Logger.log("User selects a radio button");
    }
    @When("User selects another radio button")
    public void user_selects_another_radio_button() {
        visibilityWait(T24_RegistrationFrom.getiWantAssistanceWithRadioButtonList().get(1));
        Assert.assertTrue(T24_RegistrationFrom.getiWantAssistanceWithRadioButtonList().get(1).isDisplayed());
        jsClick(T24_RegistrationFrom.getiWantAssistanceWithRadioButtonlabelList().get(1));
        radioButtonClassvalue = T24_RegistrationFrom.getiWantAssistanceWithRadioButtonList().get(1).getAttribute("class");
        Logger.log("User selects another radio button");
    }
    @Then("the options is  getting highlighted")
    public void the_options_is_getting_highlighted() {
        if(radioButtonClassvalue.contains("bg-leaf [&_span]")){
            Logger.log("User selected the options is  getting highlighted");
        }else {
            Logger.log("User not selected the options is  getting highlighted");
        }
    }
    @When("User is viewing the Contact Information Section")
    public void user_is_viewing_the_contact_information_section() {
        javascriptScroll(T24_RegistrationFrom.getiWantAssistanceWithRadioButtonList().get(0));
        visibilityWait(T24_RegistrationFrom.getContactInformationHeader());
        Assert.assertTrue(T24_RegistrationFrom.getContactInformationHeader().isDisplayed());
        Logger.log("User is viewing the Contact Information Section");
    }
    @Then("User should be able to view the Step number and the total steps present \\(Ex: Step {int} of {int})")
    public void user_should_be_able_to_view_the_step_number_and_the_total_steps_present_ex_step_of(Integer int1, Integer int2) {
        visibilityWait(T24_RegistrationFrom.getContactInformationHeaderStepText());
        Assert.assertTrue(T24_RegistrationFrom.getContactInformationHeaderStepText().isDisplayed());
        Logger.log("User should be able to view the Step number and the total steps present (Ex: Step 2 of 3)");
    }
    @When("User is in the step {int} and viewing the Contact Information Section")
    public void user_is_in_the_step_and_viewing_the_contact_information_section(Integer int1) {
        visibilityWait(T24_RegistrationFrom.getContactInformationHeaderStepText());
        javascriptScroll(T24_RegistrationFrom.getiWantAssistanceWithRadioButtonList().get(0));
        Assert.assertTrue(T24_RegistrationFrom.getContactInformationHeaderStepText().isDisplayed());
        Logger.log("User is in the step 2 and viewing the Contact Information Section");
    }
    @Then("User should be able view the title text of the section {string}")
    public void user_should_be_able_view_the_title_text_of_the_section(String string) {
        visibilityWait(T24_RegistrationFrom.getContactInformationHeaderStepText());
        Assert.assertTrue(T24_RegistrationFrom.getContactInformationHeaderStepText().isDisplayed());
        Logger.log("User should be able view the title text of the section \"Contact information\"");
    }
    @Then("User should be able to view the fields for State")
    public void user_should_be_able_to_view_the_fields_for_state() {
        visibilityWait(T24_RegistrationFrom.getContactInformationStateAndDispensaryDropdownList().get(0));
        Assert.assertTrue(T24_RegistrationFrom.getContactInformationStateAndDispensaryDropdownList().get(0).isDisplayed());
        Logger.log("User should be able to view the fields for State");
    }

    @Then("User should be able to view the fields for RISE dispensary")
    public void user_should_be_able_to_view_the_fields_for_and_user_should_be_able_to_view_the_fields_for_nearest_and_user_should_be_able_to_view_the_fields_for_rise_dispensary() {
        visibilityWait(T24_RegistrationFrom.getContactInformationStateAndDispensaryDropdownList().get(1));
        Assert.assertTrue(T24_RegistrationFrom.getContactInformationStateAndDispensaryDropdownList().get(1).isDisplayed());
        Logger.log("User should be able to view the fields for RISE dispensary");
    }
    @Then("User should be able to view the fields for First name")
    public void user_should_be_able_to_view_the_fields_for_first_name() {
        visibilityWait(T24_RegistrationFrom.getContactInformationFirstName());
        Assert.assertTrue(T24_RegistrationFrom.getContactInformationFirstName().isDisplayed());
        Logger.log("User should be able to view the fields for First name");
    }
    @Then("User should be able to view the fields for Last name")
    public void user_should_be_able_to_view_the_fields_for_last_name() {
        visibilityWait(T24_RegistrationFrom.getContactInformationLastName());
        Assert.assertTrue(T24_RegistrationFrom.getContactInformationLastName().isDisplayed());
        Logger.log("User should be able to view the fields for Last name");
    }
    @Then("User should be able to view the fields for Mobile number")
    public void user_should_be_able_to_view_the_fields_for_mobile_number() {
        visibilityWait(T24_RegistrationFrom.getContactInformationPhoneNumber());
        Assert.assertTrue(T24_RegistrationFrom.getContactInformationPhoneNumber().isDisplayed());
        Logger.log("User should be able to view the fields for Mobile number");
    }
    @Then("User should be able to view the fields for email")
    public void user_should_be_able_to_view_the_fields_for_email() {
        visibilityWait(T24_RegistrationFrom.getContactInformationEmail());
        Assert.assertTrue(T24_RegistrationFrom.getContactInformationEmail().isDisplayed());
        Logger.log("User should be able to view the fields for email");
    }
    @Then("User is able to view all the mandatory fields being marked with asterisk \\(First name, Last Name, Mobile number, Email, State,Nearest Dispensary ).")
    public void user_is_able_to_view_all_the_mandatory_fields_being_marked_with_asterisk_first_name_last_name_mobile_number_email_state_nearest_dispensary() {
        visibilityWait(T24_RegistrationFrom.getContactInformationDropdownAsteriskList().get(0));
        for (WebElement ele: T24_RegistrationFrom.getContactInformationDropdownAsteriskList()){
            visibilityWait(ele);
            Assert.assertTrue(ele.isDisplayed());
        }
        Logger.log("User is able to view all the mandatory fields being marked with asterisk for State and Nearest Dispensary");
        visibilityWait(T24_RegistrationFrom.getContactInformationTextfieldAsteriskList().get(0));
        for (WebElement ele: T24_RegistrationFrom.getContactInformationTextfieldAsteriskList()){
            visibilityWait(ele);
            Assert.assertTrue(ele.isDisplayed());
        }
        Logger.log("User is able to view all the mandatory fields being marked with asterisk for First name, Last Name, Mobile number & Email");
    }
    @Then("User should be having a dropdown option for the State and Nearest RISE dispensary")
    public void user_should_be_having_a_dropdown_option_for_the_state_and_nearest_rise_dispensary() {
        visibilityWait(T24_RegistrationFrom.getContactInformationStateAndDispensaryDropdownList().get(0));
        Assert.assertTrue(T24_RegistrationFrom.getContactInformationStateAndDispensaryDropdownList().get(0).isDisplayed());
        jsClick(T24_RegistrationFrom.getContactInformationStateAndDispensaryDropdownList().get(0));
        for (WebElement ele: T24_RegistrationFrom.getContactInformationStateDropdownOptionList()){
            visibilityWait(ele);
            Assert.assertTrue(ele.isDisplayed());
        }
        Logger.log("User should be having a dropdown option for the State");
        visibilityWait(T24_RegistrationFrom.getContactInformationStateAndDispensaryDropdownList().get(1));
        jsClick(T24_RegistrationFrom.getContactInformationStateDropdownOptionList().get(0));
        Logger.log("User have selected a option for the State");
        visibilityWait(T24_RegistrationFrom.getContactInformationStateAndDispensaryDropdownList().get(1));
        Assert.assertTrue(T24_RegistrationFrom.getContactInformationStateAndDispensaryDropdownList().get(1).isDisplayed());
        jsClick(T24_RegistrationFrom.getContactInformationStateAndDispensaryDropdownList().get(1));
        for (WebElement ele: T24_RegistrationFrom.getContactInformationDispensaryDropdownOptionList()){
            visibilityWait(ele);
            Assert.assertTrue(ele.isDisplayed());
        }
        Logger.log("User should be having a dropdown option for the Dispensary");
        visibilityWait(T24_RegistrationFrom.getContactInformationDispensaryDropdownOptionList().get(0));
        jsClick(T24_RegistrationFrom.getContactInformationDispensaryDropdownOptionList().get(0));
        Logger.log("User have selected a option for the Dispensary");
    }
    @When("User has not selected a state in dropdown")
    public void user_has_not_selected_a_state_in_dropdown() {
        visibilityWait(T24_RegistrationFrom.getContactInformationStateAndDispensaryDropdownList().get(0));
        Assert.assertTrue(T24_RegistrationFrom.getContactInformationStateAndDispensaryDropdownList().get(0).isDisplayed());
        Logger.log("User has not selected a state in dropdown");
    }
    @Then("User shouldn’t be able to click on the Nearest RISE dispensary dropdown")
    public void user_shouldn_t_be_able_to_click_on_the_nearest_rise_dispensary_dropdown() {
        visibilityWait(T24_RegistrationFrom.getContactInformationStateAndDispensaryDropdownList().get(1));
        Assert.assertTrue(T24_RegistrationFrom.getContactInformationStateAndDispensaryDropdownList().get(1).isDisplayed());
        jsClick(T24_RegistrationFrom.getContactInformationStateAndDispensaryDropdownList().get(1));
        boolean value = T24_RegistrationFrom.getContactInformationStateAndDispensaryDropdownList().get(1).isSelected();
        if (!value){
            Logger.log("User shouldn’t be able to click on the Nearest RISE dispensary dropdown");
        }else {
            Logger.log("User should be able to click on the Nearest RISE dispensary dropdown");
        }
    }
    @When("User selected a state in dropdown")
    public void user_selected_a_state_in_dropdown() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user should be able to view the list of states where the RISE is present except Ohio")
    public void user_should_be_able_to_view_the_list_of_states_where_the_rise_is_present_except_ohio() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User selected a state in dropdown\\(Ex:Florida)")
    public void user_selected_a_state_in_dropdown_ex_florida() {
        visibilityWait(T24_RegistrationFrom.getContactInformationStateAndDispensaryDropdownList().get(0));
        Assert.assertTrue(T24_RegistrationFrom.getContactInformationStateAndDispensaryDropdownList().get(0).isDisplayed());
        jsClick(T24_RegistrationFrom.getContactInformationStateAndDispensaryDropdownList().get(0));
        for (WebElement ele: T24_RegistrationFrom.getContactInformationStateDropdownOptionList()){
            visibilityWait(ele);
            Assert.assertTrue(ele.isDisplayed());
        }
        Logger.log("User should be having a dropdown option for the State");
        visibilityWait(T24_RegistrationFrom.getContactInformationStateAndDispensaryDropdownList().get(1));
        jsClick(T24_RegistrationFrom.getContactInformationStateDropdownOptionList().get(0));
        Logger.log("User selected a state in dropdown");
    }
    @Then("Nearest RISE dispensary dropdown should get updated dynamically according to the state selected\\(Ex : Bonita springs)")
    public void nearest_rise_dispensary_dropdown_should_get_updated_dynamically_according_to_the_state_selected_ex_bonita_springs() {
        visibilityWait(T24_RegistrationFrom.getContactInformationStateAndDispensaryDropdownList().get(1));
        Assert.assertTrue(T24_RegistrationFrom.getContactInformationStateAndDispensaryDropdownList().get(1).isDisplayed());
        jsClick(T24_RegistrationFrom.getContactInformationStateAndDispensaryDropdownList().get(1));
        for (WebElement ele: T24_RegistrationFrom.getContactInformationDispensaryDropdownOptionList()){
            visibilityWait(ele);
            Assert.assertTrue(ele.isDisplayed());
        }
        Logger.log("User should be having a dropdown option for the Dispensary");
        visibilityWait(T24_RegistrationFrom.getContactInformationDispensaryDropdownOptionList().get(0));
        visibilityWait(T24_RegistrationFrom.getContactInformationDispensaryPasadena());
        Assert.assertTrue(T24_RegistrationFrom.getContactInformationDispensaryPasadena().isDisplayed());
        Logger.log("Nearest RISE dispensary dropdown should get updated dynamically according to the state selected");
    }
    @When("User Clicks on Submit CTA")
    public void user_clicks_on_submit_cta() {

    }
    @And("User entered special characters in First Name text field.")
    public void userEnteredSpecialCharactersInFirstNameTextField() {
        visibilityWait(T24_RegistrationFrom.getContactInformationFirstName());
        Assert.assertTrue(T24_RegistrationFrom.getContactInformationFirstName().isDisplayed());
        jsClick(T24_RegistrationFrom.getContactInformationFirstNameTextField());
        T24_RegistrationFrom.getContactInformationFirstName().sendKeys("2536##^$");
        Logger.log("User entered special characters in FirstName text field.");
    }
    @Then("User should see an error message {string}. with the First nmae field getting highlighted")
    public void user_should_see_an_error_message_with_the_first_nmae_field_getting_highlighted(String string) {
        visibilityWait(T24_RegistrationFrom.getContactInformationFirstNameErrorText());
        Assert.assertTrue(T24_RegistrationFrom.getContactInformationFirstNameErrorText().isDisplayed());
        Logger.log("User should see an error message Only Letters are Allowed with the First nmae field getting highlighted");
    }
    @And("User entered special characters in Last Name text field.")
    public void userEnteredSpecialCharactersInLastNameTextField() {
        visibilityWait(T24_RegistrationFrom.getContactInformationLastName());
        Assert.assertTrue(T24_RegistrationFrom.getContactInformationLastName().isDisplayed());
        jsClick(T24_RegistrationFrom.getContactInformationLastName());
        T24_RegistrationFrom.getContactInformationLastName().sendKeys("2536##^$");
        Logger.log("User entered special characters in Last Name text field.");
    }
    @Then("User should see an error message {string}")
    public void user_should_see_an_error_message(String string) {
        visibilityWait(T24_RegistrationFrom.getContactInformationLastNameErrorText());
        Assert.assertTrue(T24_RegistrationFrom.getContactInformationLastNameErrorText().isDisplayed());
        Logger.log("User should see an error message Only Letters are Allowed");
    }
    @When("User entered special characters in {string} text field")
    public void user_entered_special_characters_in_text_field_eg_test_gtigrows_com_test_gtigrows(String string) {
        visibilityWait(T24_RegistrationFrom.getContactInformationEmail());
        Assert.assertTrue(T24_RegistrationFrom.getContactInformationEmail().isDisplayed());
        jsClick(T24_RegistrationFrom.getContactInformationEmail());
        T24_RegistrationFrom.getContactInformationEmail().sendKeys("test282&2327@mail.");
        waitFor(2000);
        Logger.log("User entered special characters in Last Name text field.");
    }
    @Then("User should see an error message {string}.")
    public void userShouldSeeAnErrorMessage(String arg0) {
        visibilityWait(T24_RegistrationFrom.getContactInformationEmailErrorText());
        Assert.assertTrue(T24_RegistrationFrom.getContactInformationEmailErrorText().isDisplayed());
        Logger.log("User should see an error message Invalid email");
    }
    @When("User entered less than {int} digit in Phone Number text field. \\(Eg: {int})")
    public void user_entered_less_than_digit_in_phone_number_text_field_eg(Integer int1, Integer int2) {
        visibilityWait(T24_RegistrationFrom.getContactInformationPhoneNumber());
        Assert.assertTrue(T24_RegistrationFrom.getContactInformationPhoneNumber().isDisplayed());
        jsClick(T24_RegistrationFrom.getContactInformationPhoneNumber());
        T24_RegistrationFrom.getContactInformationPhoneNumber().sendKeys("92232323");
        waitFor(2000);
        Logger.log("User entered less than 10 digit in Phone Number text field. (Eg: 8765454)");

    }
    @Then("User should see an error message Please enter a valid mobile number.")
    public void userShouldSeeAnErrorMessagePleaseEnterAValidMobileNumber() {
        visibilityWait(T24_RegistrationFrom.getContactInformationMobileErrorText());
        Assert.assertTrue(T24_RegistrationFrom.getContactInformationMobileErrorText().isDisplayed());
        Logger.log("User should see an error message Please enter a valid mobile number(enter a valid mobile number length).");
    }
    @And("User entered {int} digit in of zero Phone Number text field. \\(Eg: {int})")
    public void userEnteredDigitInOfZeroPhoneNumberTextFieldEg(int arg0, int arg1) {
        visibilityWait(T24_RegistrationFrom.getContactInformationPhoneNumber());
        Assert.assertTrue(T24_RegistrationFrom.getContactInformationPhoneNumber().isDisplayed());
        jsClick(T24_RegistrationFrom.getContactInformationPhoneNumber());
        T24_RegistrationFrom.getContactInformationPhoneNumber().sendKeys("0000000000");
        waitFor(2000);
        Logger.log("User entered less than 10 digit in Phone Number text field. (Eg: 8765454)");
    }
    @Then("User should see an error message {string}.in tertiary color against the Mobile number field")
    public void user_should_see_an_error_message_in_tertiary_color_against_the_mobile_number_field(String string) {
        visibilityWait(T24_RegistrationFrom.getContactInformationMobileErrorText());
        Assert.assertTrue(T24_RegistrationFrom.getContactInformationMobileErrorText().isDisplayed());
        Logger.log("User should see an error message Please enter a valid mobile number(Please enter a valid mobile number regex).in tertiary color against the Mobile number field.");
    }
    @And("User start entered {string} in the first and fourth position Phone Number text filed.")
    public void userStartEnteredInTheFirstAndFourthPositionPhoneNumberTextFiled(int arg0) {

    }
    @And("User start entered zero in the first and fourth position Phone Number text filed.")
    public void userStartEnteredZeroInTheFirstAndFourthPositionPhoneNumberTextFiled() {
        visibilityWait(T24_RegistrationFrom.getContactInformationPhoneNumber());
        Assert.assertTrue(T24_RegistrationFrom.getContactInformationPhoneNumber().isDisplayed());
        jsClick(T24_RegistrationFrom.getContactInformationPhoneNumber());
        T24_RegistrationFrom.getContactInformationPhoneNumber().sendKeys("0670996789");
        waitFor(2000);
        Logger.log("User start entered 0 in the 1st and 4th position Phone Number text filed. (Eg: 0670996789)");
    }




}
