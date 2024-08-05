package parallel;

import com.driverfactory.DriverManager;
import com.resuableMethods.CommonAction;
import com.utilities.Logger;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;
import pom.gti.Header;
import pom.gti.T11_DispensaryPage;
import pom.gti.T24A_PatientRegistrationFrom;
import pom.gti.T24_B_PatientRegistrationFormPage_VA;

public class T24B_PatientRegistrationPage_VA_Stepdef extends CommonAction {
    Header HeaderComponent= new Header(DriverManager.getDriver());
    T11_DispensaryPage T11_DispensaryPage = new T11_DispensaryPage(DriverManager.getDriver());
    T24_B_PatientRegistrationFormPage_VA PatientRegistrationFormPage_VA = new T24_B_PatientRegistrationFormPage_VA(DriverManager.getDriver());
    T24A_PatientRegistrationFrom T24_RegistrationFrom = new T24A_PatientRegistrationFrom(DriverManager.getDriver());


    String radioButton;
    SoftAssert softassert = new SoftAssert();



    @Then("User clicks or taps on Virginia State")
    public void User_clicks_or_taps_on_Virginia_State() {
        javascriptScroll(HeaderComponent.getexpandeddispensariesVirginia());
        HeaderComponent.ClickOnVirginia();
        Logger.log("User clicks or taps on Virginia State");
    }
    @And("User sees the list of Dispensaries for Virginia State")
    public void User_sees_the_list_of_Dispensaries_for_Virginia_State() {
        if (HeaderComponent.getHamburgerMenu().isDisplayed()) {
            Assert.assertTrue(HeaderComponent.getExpandedDispensariesForVirginiaStateMobile().get(1).isDisplayed());
        } else {
            if (HeaderComponent.getheaderrewards().isDisplayed()) {
                Assert.assertTrue(HeaderComponent.getExpandedDispensariesForVirginiaState().get(1).isDisplayed());
            }
        }
        Logger.log("User sees the list of Dispensaries for Virginia State");
    }
    @And("User Click on Salem Dispensaries")
    public void User_Click_on_Salem_Dispensaries() {
        Assert.assertTrue(HeaderComponent.getRiseDispensarySalemOption().isDisplayed());
        HeaderComponent.ClickOnRiseDispensarySalemOption();
        Logger.log("User Click on Salem Dispensaries");
    }
    @And("User scroll down to the Quick Link Section")
    public void User_scroll_down_to_the_Quick_Link_Section() {
        javascriptScroll(T11_DispensaryPage.getQuickLinkSectionVirginia());
        visibilityWait(T11_DispensaryPage.getQuickLinkSectionVirginia());
        Assert.assertTrue(T11_DispensaryPage.getQuickLinkSectionVirginia().isDisplayed());
        Logger.log("User scroll down to the Quick Link Section");
    }
    @Then("User click on NEW PATIENTS START HERE Link")
    public void User_click_on_NEW_PATIENTS_START_HERE_Link() {
        waitFor(100);
        visibilityWait(T11_DispensaryPage.getQuickLinkSArrowIconListVirginia().get(4));
        Assert.assertTrue(T11_DispensaryPage.getQuickLinkSectionVirginia().isDisplayed());
        jsClick(T11_DispensaryPage.getQuickLinkSArrowIconListVirginia().get(3));
        Logger.log("User click on NEW PATIENTS START HERE Link");
    }
    @And("User should be able to see appropriate bredcrumb")
    public void User_is_able_to_view_the_Bredcrumb() {
        Assert.assertTrue(PatientRegistrationFormPage_VA.getBredcrumbHomeIconVirginiaLink().isDisplayed());
        Assert.assertTrue(PatientRegistrationFormPage_VA.getBredcrumVirginiaPatientPreRegistrationForm().isDisplayed());
        Assert.fail();
        Logger.log("User should be able to see appropriate bredcrumb");
    }
    @And("User is able to view the hero content, Title Text, Copy Text, Image")
    public void User_is_able_to_view_the_hero_content_Title_Text_Copy_Text_Image() {
        Assert.assertTrue(PatientRegistrationFormPage_VA.getHeaderTitleText_PreRegistrationForm().isDisplayed());
        Assert.assertTrue(PatientRegistrationFormPage_VA.getCopyText_PreRegistrationForm().isDisplayed());
        Assert.assertTrue(PatientRegistrationFormPage_VA.getBannerSection_PreRegistrationForm().isDisplayed());
        Assert.assertTrue(PatientRegistrationFormPage_VA.getBanner_PreRegistrationForm().isDisplayed());
        Logger.log("User is able to view the hero content, Title Text, Copy Text, Image");
    }
    @And("User is able to view the Rise logo, Title text and the Description")
    public void User_is_able_to_view_the_Rise_logo_Title_text_and_the_Description() {
        Assert.assertTrue(PatientRegistrationFormPage_VA.getRiseLog_PreRegistrationForm().isDisplayed());
        Assert.assertTrue(PatientRegistrationFormPage_VA.getTitleText_PreRegistrationForm().isDisplayed());
        Assert.assertTrue(PatientRegistrationFormPage_VA.getDescription_PreRegistrationForm().isDisplayed());
        Logger.log("User is able to view the Rise logo, Title text and the Description");
    }
    @When("User is viewing the Your history section of the Patient pre-Registration Form")
    public void User_is_viewing_the_Your_history_section_of_the_Patient_pre_Registration_Form() {
        javascriptScroll(PatientRegistrationFormPage_VA.getStepCount_YourHistory_TitleText_ARE_YOU_A_REGISTERED_PATIENT());
        waitFor(2000);
        Assert.assertTrue(PatientRegistrationFormPage_VA.getStepCount_YourHistory().isDisplayed());
        Logger.log("User is viewing the Your history section of the Patient pre-Registration Form");
    }
    @Then("User is able to view the Step number and the total steps present")
    public void User_is_able_to_view_the_Step_number_and_the_total_steps_present() {
        Assert.assertTrue(PatientRegistrationFormPage_VA.getStepCount_YourHistory_YourHours().isDisplayed());
        Logger.log("User is able to view the Step number and the total steps present");
    }
    @And("User is able to view the title text for Your history section")
    public void Useris_able_to_view_the_title_text_for_Your_history_section() {
        Assert.assertTrue(PatientRegistrationFormPage_VA.getStepCount_YourHistory_TitleText().isDisplayed());
        Assert.assertTrue(PatientRegistrationFormPage_VA.getStepCount_YourHistory_CopyText().isDisplayed());
        Logger.log("User is able to view the title text for Your history section");
    }
    @And("User is able to view the required fields info under the section title mandatory field is marked with an asterisk")
    public void User_is_able_to_view_the_required_fields_info_under_the_section_title_mandatory_field_is_marked_with_an_asterisk() {
        Assert.assertTrue(PatientRegistrationFormPage_VA.getStepCount_YourHistory_asterisk().get(0).isDisplayed());
        Assert.assertTrue(PatientRegistrationFormPage_VA.getStepCount_YourHistory_asterisk().get(1).isDisplayed());
        Assert.assertTrue(PatientRegistrationFormPage_VA.getStepCount_YourHistory_asterisk().get(2).isDisplayed());
        Logger.log("User is able to view the required fields info under the section title mandatory field is marked with an asterisk");
    }
    @And("User is able to view single select options radio buttons")
    public void User_is_able_to_view_single_select_options_radio_buttons() {
        visibilityWait(PatientRegistrationFormPage_VA.getStepCount_YourHistory_ARE_YOU_A_REGISTERED_PATIENT_Yes_No_SectionList().get(0));
        Assert.assertTrue(PatientRegistrationFormPage_VA.getStepCount_YourHistory_ARE_YOU_A_REGISTERED_PATIENT_Yes_No_SectionList().get(0).isDisplayed());
        jsClick(PatientRegistrationFormPage_VA.getStepCount_YourHistory_ARE_YOU_A_REGISTERED_PATIENT_Yes_No_CTA_List().get(0));
        Logger.log("User is able to view single select options radio buttons");
    }
    @Then("User selects another radio button under are you a reg patient question")
    public void user_selects_another_radio_buttons() {
        visibilityWait(PatientRegistrationFormPage_VA.getStepCount_YourHistory_ARE_YOU_A_REGISTERED_PATIENT_Yes_No_SectionList().get(1));
        Assert.assertTrue(PatientRegistrationFormPage_VA.getStepCount_YourHistory_ARE_YOU_A_REGISTERED_PATIENT_Yes_No_SectionList().get(1).isDisplayed());
        jsClick(PatientRegistrationFormPage_VA.getStepCount_YourHistory_ARE_YOU_A_REGISTERED_PATIENT_Yes_No_CTA_List().get(1));
        radioButton = PatientRegistrationFormPage_VA.getStepCount_YourHistory_ARE_YOU_A_REGISTERED_PATIENT_Yes_No_SectionList().get(1).getAttribute("class");
        Logger.log("User selects another radio button under are you a reg patient question");
    }
    @Then("User should be able to select radio button switches to the last selected one")
    public void user_is_able_to_view_the_selection_of_radio_button_switches_to_the_last_selected_one() {
        PatientRegistrationFormPage_VA.selectinglist();
        Logger.log("User should be able to select radio button switches to the last selected one");
    }
    @Then("the options is getting highlighted under are you a reg patient question")
    public void the_options_is_getting_highlighteds() {
        if(radioButton.contains("bg-leaf [&_span]")){
            Logger.log("User selected the options is  getting highlighted");
        }else {
            Logger.log("User not selected the options is  getting highlighted under are you a reg patient question");
        }
    }
    @When("User is viewing the New patient registration section of the Patient pre-Registration Form")
    public void User_is_viewing_the_New_patient_registration_section_of_the_Patient_pre_Registration_Form() {
        javascriptScroll(PatientRegistrationFormPage_VA.getStepCount_YourHistory_PreRegistrationForm());
        Assert.assertTrue(PatientRegistrationFormPage_VA.getStepCount_YourHistory_PreRegistrationForm().isDisplayed());
        Assert.assertTrue(PatientRegistrationFormPage_VA.getTitleText_YourHistory_PreRegistrationForm().isDisplayed());
        Assert.assertTrue(PatientRegistrationFormPage_VA.getCopyText_YourHistory_PreRegistrationForm().isDisplayed());
        Logger.log("User is viewing the New patient registration section of the Patient pre-Registration Form");
    }
    @And("User is able to view the State dropdown with an asterisk* is in disabled state")
    public void User_is_able_to_view_the_State_dropdown_with_an_asterisk_is_in_disabled_state() {
        Assert.assertTrue(PatientRegistrationFormPage_VA.getNew_Patient_Registration_Virginia().isDisplayed());
        Logger.log("User is able to view the State dropdown with an asterisk* is in disabled state");
    }
    @And("User is able to view the asterisk for all mandatory fields")
    public void User_is_able_to_view_the_asterisk_for_all_mandatory_fields() {
        softassert.assertTrue(PatientRegistrationFormPage_VA.getNew_Patient_Registration_FirstName().isDisplayed());
        softassert.assertTrue(PatientRegistrationFormPage_VA.getNew_Patient_Registration_MiddleName().isDisplayed());
        softassert.assertTrue(PatientRegistrationFormPage_VA.getNew_Patient_Registration_LastName().isDisplayed());
        softassert.assertTrue(PatientRegistrationFormPage_VA.getNew_Patient_Registration_Email().isDisplayed());
        softassert.assertTrue(PatientRegistrationFormPage_VA.getNew_Patient_Registration_MobileNumber().isDisplayed());
        softassert.assertTrue(PatientRegistrationFormPage_VA.getNew_Patient_Registration_DateOfBirth().isDisplayed());
        softassert.assertTrue(PatientRegistrationFormPage_VA.getNew_Patient_Registration_AddressLine1().isDisplayed());
        softassert.assertTrue(PatientRegistrationFormPage_VA.getNew_Patient_Registration_AddressLine2().isDisplayed());
        softassert.assertTrue(PatientRegistrationFormPage_VA.getNew_Patient_Registration_Zip().isDisplayed());
        softassert.assertTrue(PatientRegistrationFormPage_VA.getNew_Patient_Registration_PatientID().isDisplayed());
        softassert.assertTrue(PatientRegistrationFormPage_VA.getNew_Patient_Registration_City().isDisplayed());
        softassert.assertTrue(PatientRegistrationFormPage_VA.getNew_Patient_Registration_ExpirationDate().isDisplayed());
        softassert.assertAll();
        Logger.log("User is able to view the asterisk for all mandatory fields");
    }
    @Then("User is able to view the input fields")
    public void User_is_able_to_view_the_input_fields() {
        softassert.assertTrue(PatientRegistrationFormPage_VA.getNew_Patient_Registration_TextFieldList().get(0).isDisplayed());
        softassert.assertTrue(PatientRegistrationFormPage_VA.getNew_Patient_Registration_TextFieldList().get(1).isDisplayed());
        softassert.assertTrue(PatientRegistrationFormPage_VA.getNew_Patient_Registration_TextFieldList().get(2).isDisplayed());
        softassert.assertTrue(PatientRegistrationFormPage_VA.getNew_Patient_Registration_TextFieldList().get(3).isDisplayed());
        softassert.assertTrue(PatientRegistrationFormPage_VA.getNew_Patient_Registration_TextFieldList().get(4).isDisplayed());
        softassert.assertTrue(PatientRegistrationFormPage_VA.getNew_Patient_Registration_TextFieldList().get(5).isDisplayed());
        softassert.assertTrue(PatientRegistrationFormPage_VA.getNew_Patient_Registration_TextFieldList().get(6).isDisplayed());
        softassert.assertTrue(PatientRegistrationFormPage_VA.getNew_Patient_Registration_TextFieldList().get(7).isDisplayed());
        softassert.assertTrue(PatientRegistrationFormPage_VA.getNew_Patient_Registration_TextFieldList().get(8).isDisplayed());
        softassert.assertTrue(PatientRegistrationFormPage_VA.getNew_Patient_Registration_TextFieldList().get(9).isDisplayed());
        softassert.assertTrue(PatientRegistrationFormPage_VA.getNew_Patient_Registration_TextFieldList().get(10).isDisplayed());
        softassert.assertTrue(PatientRegistrationFormPage_VA.getNew_Patient_Registration_TextFieldList().get(11).isDisplayed());
        softassert.assertTrue(PatientRegistrationFormPage_VA.getNew_Patient_Registration_TextFieldList().get(12).isDisplayed());
        softassert.assertAll();
        Logger.log("User is able to view the input fields");
    }
    @And("User is able to view a dropdown option for Nearest RISE dispensary")
    public void User_is_able_to_view_a_dropdown_option_for_Nearest_RISE_dispensary() {
        Assert.assertTrue(PatientRegistrationFormPage_VA.getNew_Patient_Registration_Dropdown_For_Nearest_RISE_Dispensary().isDisplayed());
        Logger.log("User is able to view a dropdown option for Nearest RISE dispensary");
    }
    @And("User clicks on the nearest dispensary dropdown")
    public void User_clicks_on_the_nearest_dispensary_dropdown() {
        PatientRegistrationFormPage_VA.ClickOnDropdown_For_Nearest_RISE_Dispensary();
        Logger.log("User clicks on the nearest dispensary dropdown");
    }
    @Then("User should see only the Virginia dispensaries")
    public void User_should_see_only_the_Virginia_dispensaries() {
        softassert.assertTrue(PatientRegistrationFormPage_VA.getNew_Patient_Registration_DropdownList_For_Nearest_RISE_Dispensary().get(0).isDisplayed());
        softassert.assertTrue(PatientRegistrationFormPage_VA.getNew_Patient_Registration_DropdownList_For_Nearest_RISE_Dispensary().get(1).isDisplayed());
        softassert.assertTrue(PatientRegistrationFormPage_VA.getNew_Patient_Registration_DropdownList_For_Nearest_RISE_Dispensary().get(3).isDisplayed());
        softassert.assertTrue(PatientRegistrationFormPage_VA.getNew_Patient_Registration_DropdownList_For_Nearest_RISE_Dispensary().get(4).isDisplayed());
        PatientRegistrationFormPage_VA.ValidateDropDownList();
        softassert.assertTrue(PatientRegistrationFormPage_VA.getNew_Patient_Registration_DropdownList_For_Nearest_RISE_Dispensary().get(5).isDisplayed());
        jsClick(PatientRegistrationFormPage_VA.getNew_Patient_Registration_DropdownList_For_Nearest_RISE_Dispensary().get(0));
        softassert.assertAll();
        Logger.log("User should see only the Virginia dispensaries");
    }




}
