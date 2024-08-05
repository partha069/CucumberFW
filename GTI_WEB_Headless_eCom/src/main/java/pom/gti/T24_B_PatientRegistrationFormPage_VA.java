package pom.gti;

import com.resuableMethods.CommonAction;
import com.utilities.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class T24_B_PatientRegistrationFormPage_VA extends CommonAction {
    public T24_B_PatientRegistrationFormPage_VA(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    /*
     * Bredcrumb
     */
    @FindBy(xpath = "//*[@data-testid='breadcrumb-desktop']/child::li/child::a")
    private WebElement BredcrumbHomeIconVirginiaLink;
    @FindBy(xpath = "//*[@data-testid='breadcrumb-desktop']/child::li[2]")
    private WebElement BredcrumVirginiaPatientPreRegistrationForm;


    /*
     * Header Section
     */
    @FindBy(xpath = "//*[@data-testid='breadcrumb-desktop']/../../following-sibling::h2")
    private WebElement HeaderTitleText_PreRegistrationForm;
    @FindBy(xpath = "//*[@data-testid='breadcrumb-desktop']/../../following-sibling::p")
    private WebElement CopyText_PreRegistrationForm;
    @FindBy(xpath = "//*[@data-testid='breadcrumb-desktop']/../../../../../child::div")
    private WebElement BannerSection_PreRegistrationForm;
    @FindBy(xpath = "//*[@data-testid='breadcrumb-desktop']/../../../../../child::div/child::div[1]")
    private WebElement Banner_PreRegistrationForm;
    @FindBy(xpath = "//*[@data-testid='breadcrumb-desktop']/../../../../../following-sibling::div/child::div/child::div/child::div/span")
    private WebElement RiseLog_PreRegistrationForm;
    @FindBy(xpath = "//*[@data-testid='breadcrumb-desktop']/../../../../../following-sibling::div/child::div/child::div/child::div/following-sibling::div/child::p")
    private WebElement TitleText_PreRegistrationForm;
    @FindBy(xpath = "//*[@data-testid='breadcrumb-desktop']/../../../../../following-sibling::div/child::div/child::div/child::div/following-sibling::div/child::div")
    private WebElement Description_PreRegistrationForm;


    /*
     * Your History
     */
    @FindBy(xpath = "//*[@data-testid='patient_registration_step_1']")
    private WebElement stepCount_YourHistory;
    @FindBy(xpath = "//*[@data-testid='patient_registration_step_1']/child::div/child::p")
    private WebElement stepCount_YourHistory_YourHours;
    @FindBy(xpath = "//*[@data-testid='patient_registration_step_1']/child::div/child::div/child::h3")
    private WebElement stepCount_YourHistory_TitleText;
    @FindBy(xpath = "//*[@data-testid='patient_registration_step_1']/child::h5[@data-testid='patient_registration_label']/span")
    private List<WebElement> stepCount_YourHistory_asterisk;
    @FindBy(xpath = "//*[@data-testid='patient_registration_step_1']/child::div/child::div/child::p")
    private WebElement stepCount_YourHistory_CopyText;
    @FindBy(xpath = "//*[@data-testid='patient_registration_step_1']/child::h5[@data-testid='patient_registration_label'][1]")
    private WebElement stepCount_YourHistory_TitleText_ARE_YOU_A_REGISTERED_PATIENT;

    @FindBy(xpath = "//*[@data-testid='patient_registration_registeredWithCommonwealth']/child::div/child::div")
    private List<WebElement> stepCount_YourHistory_ARE_YOU_A_REGISTERED_PATIENT_Yes_No_SectionList;
    @FindBy(xpath = "//*[@data-testid='patient_registration_registeredWithCommonwealth']/child::div/child::div/child::label[1]")
    private List<WebElement> stepCount_YourHistory_ARE_YOU_A_REGISTERED_PATIENT_Yes_No_CTA_List;

    @FindBy(xpath = "//*[@data-testid='patient_registration_registeredWithCommonwealth']/child::div/child::div/child::label[1]")
    private WebElement stepCount_YourHistory_TitleText_ARE_YOU_A_VETERIAN;

    @FindBy(xpath = "//*[@data-testid='patient_registration_veteran']/child::div/child::div/child::label[1]")
    private List<WebElement> stepCount_YourHistory_ARE_YOU_A_VETERIAN_Yes_No_CTA;

    @FindBy(xpath = "//*[@data-testid='patient_registration_veteran']/following-sibling::h5")
    private WebElement stepCount_YourHistory_TitleText_HOW_DID_YOU_FIND_US_CHECK_ALL_THAT_APPLY;

    @FindBy(xpath = "//*[@data-testid='patient_registration_checkbox']/child::div/child::div/child::label[1]")
    private List<WebElement> stepCount_YourHistory_HOW_DID_YOU_FIND_US_CHECK_ALL_THAT_APPLY_CheckBox;


    /*
     * New patient registration
     */
    @FindBy(xpath = "//*[@data-testid='patient_registration_step_2']/child::div/child::p")
    private WebElement stepCount_YourHistory_PreRegistrationForm;

    @FindBy(xpath = "//*[@data-testid='patient_registration_step_2']/child::div/div/child::h3")
    private WebElement TitleText_YourHistory_PreRegistrationForm;

    @FindBy(xpath = "//*[@data-testid='patient_registration_step_2']/child::div/div/child::p")
    private WebElement CopyText_YourHistory_PreRegistrationForm;

    @FindBy(xpath = "//*[@aria-label='First Name' and @aria-required='true']")
    private WebElement New_Patient_Registration_FirstName;

    @FindBy(xpath = "//*[@aria-label='Middle Name' and @aria-required='false']") //Fail
    private WebElement New_Patient_Registration_MiddleName;

    @FindBy(xpath = "//*[@aria-label='Last Name' and @aria-required='true']")
    private WebElement New_Patient_Registration_LastName;

    @FindBy(xpath = "//*[@aria-label='Email' and @aria-required='true']")
    private WebElement New_Patient_Registration_Email;

    @FindBy(xpath = "//*[@aria-label='Mobile Number' and @aria-required='true']")
    private WebElement New_Patient_Registration_MobileNumber;

    @FindBy(xpath = "//*[@aria-label='Date of birth' and @aria-required='false']") //Fail
    private WebElement New_Patient_Registration_DateOfBirth;

    @FindBy(xpath = "//*[@aria-label='Address line 2' and @aria-required='false']") //Fail
    private WebElement New_Patient_Registration_AddressLine1;

    @FindBy(xpath = "//*[@aria-label='Address line 1' and @aria-required='false']") //Fail
    private WebElement New_Patient_Registration_Addressline2;

    @FindBy(xpath = "//*[@aria-label='City' and @aria-required='true']")
    private WebElement New_Patient_Registration_City;

    @FindBy(xpath = "//*[@aria-label='Virginia' and @aria-invalid='false']")
    private WebElement New_Patient_Registration_Virginia;

    @FindBy(xpath = "//*[@aria-label='Zip' and @aria-required='true']")
    private WebElement New_Patient_Registration_Zip;

    @FindBy(xpath = "//*[@aria-label='Patient ID No./Medical Marijuana Card No.' and @aria-required='true']")
    private WebElement New_Patient_Registration_PatientID;

    @FindBy(xpath = "//*[@aria-label='Expiration date' and @aria-required='true']")
    private WebElement New_Patient_Registration_ExpirationDate;

    @FindBy(xpath = "//*[@data-testid='patient_registration_step_2']/child::div/following-sibling::div/child::div/child::div/child::div/child::div/child::button")
    private WebElement New_Patient_Registration_Dropdown_For_Nearest_RISE_Dispensary;

    @FindBy(xpath = "//*[@data-testid='patient_registration_step_2']/child::div/following-sibling::div/child::div/child::div/child::div/child::div/child::ul/child::li")
    private List<WebElement> New_Patient_Registration_DropdownList_For_Nearest_RISE_Dispensary;

    @FindBy(xpath = "//*[@data-testid='patient_registration_step_2']/child::div/following-sibling::div/child::div/child::div/following-sibling::div/child::div/child::div/child::input")
    private List<WebElement> New_Patient_Registration_TextFieldList;


    /*
     * Bredcrumb
     */
    public WebElement getBredcrumbHomeIconVirginiaLink() {
        return BredcrumbHomeIconVirginiaLink;
    }

    public WebElement getBredcrumVirginiaPatientPreRegistrationForm() {
        return BredcrumVirginiaPatientPreRegistrationForm;
    }


    /*
     * Header Section
     */
    public WebElement getHeaderTitleText_PreRegistrationForm() {
        return HeaderTitleText_PreRegistrationForm;
    }

    public WebElement getCopyText_PreRegistrationForm() {
        return CopyText_PreRegistrationForm;
    }

    public WebElement getBannerSection_PreRegistrationForm() {
        return BannerSection_PreRegistrationForm;
    }

    public WebElement getBanner_PreRegistrationForm() {
        return Banner_PreRegistrationForm;
    }

    public WebElement getRiseLog_PreRegistrationForm() {
        return RiseLog_PreRegistrationForm;
    }

    public WebElement getTitleText_PreRegistrationForm() {
        return TitleText_PreRegistrationForm;
    }

    public WebElement getDescription_PreRegistrationForm() {
        return Description_PreRegistrationForm;
    }


    /*
     *  Your History
     */
    public WebElement getStepCount_YourHistory() {
        return stepCount_YourHistory;
    }

    public WebElement getStepCount_YourHistory_YourHours() {
        return stepCount_YourHistory_YourHours;
    }

    public WebElement getStepCount_YourHistory_TitleText() {
        return stepCount_YourHistory_TitleText;
    }

    public WebElement getStepCount_YourHistory_CopyText() {
        return stepCount_YourHistory_CopyText;
    }

    public List<WebElement> getStepCount_YourHistory_asterisk() {
        return stepCount_YourHistory_asterisk;
    }

    public WebElement getStepCount_YourHistory_TitleText_ARE_YOU_A_REGISTERED_PATIENT() {
        return stepCount_YourHistory_TitleText_ARE_YOU_A_REGISTERED_PATIENT;
    }

    public List<WebElement> getStepCount_YourHistory_ARE_YOU_A_REGISTERED_PATIENT_Yes_No_SectionList() {
        return stepCount_YourHistory_ARE_YOU_A_REGISTERED_PATIENT_Yes_No_SectionList;
    }

    public List<WebElement> getStepCount_YourHistory_ARE_YOU_A_REGISTERED_PATIENT_Yes_No_CTA_List() {
        return stepCount_YourHistory_ARE_YOU_A_REGISTERED_PATIENT_Yes_No_CTA_List;
    }


    /*
     * New patient registration
     */
    public WebElement getStepCount_YourHistory_PreRegistrationForm() {
        return stepCount_YourHistory_PreRegistrationForm;
    }

    public WebElement getTitleText_YourHistory_PreRegistrationForm() {
        return TitleText_YourHistory_PreRegistrationForm;
    }

    public WebElement getCopyText_YourHistory_PreRegistrationForm() {
        return CopyText_YourHistory_PreRegistrationForm;
    }

    public WebElement getNew_Patient_Registration_Virginia() {
        return New_Patient_Registration_Virginia;
    }

    public WebElement getNew_Patient_Registration_FirstName() {
        return New_Patient_Registration_FirstName;
    }

    public WebElement getNew_Patient_Registration_MiddleName() {
        return New_Patient_Registration_MiddleName;
    }

    public WebElement getNew_Patient_Registration_LastName() {
        return New_Patient_Registration_LastName;
    }

    public WebElement getNew_Patient_Registration_Email() {
        return New_Patient_Registration_Email;
    }

    public WebElement getNew_Patient_Registration_MobileNumber() {
        return New_Patient_Registration_MobileNumber;
    }

    public WebElement getNew_Patient_Registration_DateOfBirth() {
        return New_Patient_Registration_DateOfBirth;
    }

    public WebElement getNew_Patient_Registration_AddressLine1() {
        return New_Patient_Registration_AddressLine1;
    }

    public WebElement getNew_Patient_Registration_AddressLine2() {
        return New_Patient_Registration_Addressline2;
    }

    public WebElement getNew_Patient_Registration_City() {
        return New_Patient_Registration_City;
    }

    public WebElement getNew_Patient_Registration_Zip() {
        return New_Patient_Registration_Zip;
    }

    public WebElement getNew_Patient_Registration_PatientID() {
        return New_Patient_Registration_PatientID;
    }

    public WebElement getNew_Patient_Registration_ExpirationDate() {
        return New_Patient_Registration_ExpirationDate;
    }

    public WebElement getNew_Patient_Registration_Dropdown_For_Nearest_RISE_Dispensary() {
        return New_Patient_Registration_Dropdown_For_Nearest_RISE_Dispensary;
    }

    public List<WebElement> getNew_Patient_Registration_TextFieldList() {
        return New_Patient_Registration_TextFieldList;
    }

    public List<WebElement> getNew_Patient_Registration_DropdownList_For_Nearest_RISE_Dispensary() {
        return New_Patient_Registration_DropdownList_For_Nearest_RISE_Dispensary;
    }









    public void ValidateDropDownList() {
        for (WebElement DropdownList: getNew_Patient_Registration_DropdownList_For_Nearest_RISE_Dispensary()){
            visibilityWait(DropdownList);
            Assert.assertTrue(DropdownList.isDisplayed());
        }
    }

        public void ClickOnDropdown_For_Nearest_RISE_Dispensary () {
            try {
                jsClick(New_Patient_Registration_Dropdown_For_Nearest_RISE_Dispensary);
                Logger.log("Clicked on Click DropDown");
            } catch (Exception e) {
                Logger.log("Didn't Click On Click DropDown");
            }
        }


        public void selectinglist () {
            for (int i = 0; i < stepCount_YourHistory_ARE_YOU_A_REGISTERED_PATIENT_Yes_No_CTA_List.size(); i++) {
                jsClick(stepCount_YourHistory_ARE_YOU_A_REGISTERED_PATIENT_Yes_No_CTA_List.get(i));
                Assert.assertEquals("rgba(0, 70, 30)", stepCount_YourHistory_ARE_YOU_A_REGISTERED_PATIENT_Yes_No_SectionList.get(i).getCssValue("color"));
            }
        }

    }
