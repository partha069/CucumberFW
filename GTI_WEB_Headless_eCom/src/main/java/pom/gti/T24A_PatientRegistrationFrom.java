package pom.gti;

import com.resuableMethods.CommonAction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class T24A_PatientRegistrationFrom extends CommonAction {
    public T24A_PatientRegistrationFrom(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    /*
     * Element
     */
    @FindBy(xpath = "//div[@data-testid='header-dispensaries']/descendant::a")
    private List<WebElement> illinoisDispensariesList;
    @FindBy(xpath = "//h2[text()='Need Medical Card Assistance?']")
    private WebElement patientRegistrationFromHeader;
    @FindBy(xpath = "//h3[@data-testid='form_header_heading' and text()='Contact information']/parent::div/parent::div/following-sibling::div[@data-testid='patient_registration_form_contact']/child::div/child::div/child::div/child::button/span")
    private List<WebElement> contactInformationDropdownList;
    @FindBy(xpath = "//h3[@data-testid='form_header_heading' and text()='Contact information']")
    private WebElement contactInformationHeader;
    @FindBy(xpath = "//ol[@data-testid='breadcrumb-desktop']")
    private WebElement patientRegistrationFromBreadcrumb;
    @FindBy(xpath = "//h2[text()='Need Medical Card Assistance?']/parent::div/parent::div")
    private WebElement patientRegistrationFromBanner;
    @FindBy(xpath = "//h2[text()='Need Medical Card Assistance?']/following-sibling::p")
    private WebElement patientRegistrationFromBannerCopyText;
    @FindBy(xpath = "//h2[text()='Need Medical Card Assistance?']/parent::div/parent::div/child::div[1]/child::div/child::span")
    private WebElement patientRegistrationFromBannerImage;
    @FindBy(xpath = "//div[@data-testid='patient_registration_form_banner']")
    private WebElement patientRegistrationFromSideBanner;
    @FindBy(xpath = "//div[@data-testid='patient_registration_form_banner']/child::div[1]/child::span")
    private WebElement patientRegistrationFromSideBannerLogo;
    @FindBy(xpath = "//div[@data-testid='patient_registration_form_banner']/child::div[2]/child::div[1]")
    private WebElement patientRegistrationFromSideBannerDescription;
    @FindBy(xpath = "//div[@data-testid='patient_registration_form_banner']/child::div[2]/child::p")
    private WebElement patientRegistrationFromSideBannerTitle;
    @FindBy(xpath = "//h3[@data-testid='form_header_heading' and text()='I want assistance with']")
    private  WebElement  iWantAssistanceWithTitle;
    @FindBy(xpath = "//h3[@data-testid='form_header_heading' and text()='I want assistance with']/parent::div/preceding-sibling::p[text()='Step 1 of 3']")
    private  WebElement iWantAssistanceWithStepText;
    @FindBy(xpath = "//h3[@data-testid='form_header_heading' and text()='I want assistance with']/following-sibling::p[text()='This is a required step.']")
    private WebElement iWantAssistanceWithRequiredCopyText;
    @FindBy(xpath = "//h3[@data-testid='form_header_heading' and text()='I want assistance with']/parent::div/parent::div/following-sibling::div[@data-testid='patient_registration_radiobuttonlist']/child::div/child::div")
    private List<WebElement> iWantAssistanceWithRadioButtonList;
    @FindBy(xpath = "//h3[@data-testid='form_header_heading' and text()='I want assistance with']/parent::div/parent::div/following-sibling::div[@data-testid='patient_registration_radiobuttonlist']/child::div/child::div/child::label[1]")
    private List<WebElement> iWantAssistanceWithRadioButtonlabelList;
    @FindBy(xpath = "//h3[@data-testid='form_header_heading' and text()='Contact information']/parent::div//parent::div/preceding-sibling::p[text()='Step 2 of 3']")
    private WebElement contactInformationHeaderStepText;
    @FindBy(xpath = "//input[@name='firstName']")
    private WebElement contactInformationFirstName;
    @FindBy(xpath = "//input[@name='lastName']")
    private WebElement contactInformationLastName;
    @FindBy(xpath = "//input[@name='phoneNumber']")
    private WebElement contactInformationPhoneNumber;
    @FindBy(xpath = "//input[@name='email']")
    private WebElement contactInformationEmail;
    @FindBy(xpath = "//div[@data-testid='patient_registration_form_contact']/child::div/child::div/child::div/child::label/child::span/child::span[text()='*']")
    private List<WebElement> contactInformationDropdownAsteriskList;
    @FindBy(xpath = "//div[@data-testid='patient_registration_form_contact']/child::div/child::div/child::div/child::label/child::span[text()='*']")
    private List<WebElement> contactInformationTextfieldAsteriskList;
    @FindBy(xpath = "//div[@data-testid='patient_registration_form_contact']/child::div/child::div/child::div/child::button")
    private List<WebElement> contactInformationStateAndDispensaryDropdownList;
    @FindBy(xpath = "//span[contains(text(),'State')]/parent::label/following-sibling::ul/child::li")
    private List<WebElement> contactInformationStateDropdownOptionList;
    @FindBy(xpath = "//span[contains(text(),'Nearest RISE dispensary')]/parent::label/following-sibling::ul/child::li")
    private List<WebElement> contactInformationDispensaryDropdownOptionList;
    @FindBy(xpath = "//span[text()='RISE Dispensary Pasadena']")
    private WebElement contactInformationDispensaryPasadena;
    @FindBy(xpath = "//input[@name='firstName']/following-sibling::label[text()='First Name']")
    private WebElement contactInformationFirstNameTextField;
    @FindBy(xpath = "//input[@name='firstName']/parent::div/parent::div/child::div[2]")
    private WebElement contactInformationFirstNameErrorText;
    @FindBy(xpath = "//input[@name='lastName']/following-sibling::label[text()='Last Name']")
    private WebElement contactInformationLastNameTextField;
    @FindBy(xpath = "//input[@name='lastName']/parent::div/parent::div/child::div[2]")
    private WebElement contactInformationLastNameErrorText;
    @FindBy(xpath = "//input[@name='email']/following-sibling::label[text()='Email']")
    private WebElement contactInformationEmailTextField;
    @FindBy(xpath = "//input[@name='email']/parent::div/parent::div/child::div[2]")
    private WebElement contactInformationEmailErrorText;
    @FindBy(xpath = "//input[@name='phoneNumber']/following-sibling::label[text()='Mobile Number']")
    private WebElement contactInformationMobileTextField;
    @FindBy(xpath = "//input[@name='phoneNumber']/parent::div/parent::div/child::div[2]")
    private WebElement contactInformationMobileErrorText;
    //nextpage

    /*
     * Getter and Setter
     */
    public List<WebElement> getIllinoisDispensariesList(){
        return illinoisDispensariesList;
    }
    public WebElement getPatientRegistrationFromHeader(){
        return patientRegistrationFromHeader;
    }
    public List<WebElement> getContactInformationDropdownList(){
        return contactInformationDropdownList;
    }
    public WebElement getContactInformationHeader(){
        return contactInformationHeader;
    }
    public WebElement getPatientRegistrationFromBreadcrumb(){
        return patientRegistrationFromBreadcrumb;
    }
    public WebElement getPatientRegistrationFromBanner(){
        return patientRegistrationFromBanner;
    }
    public WebElement getPatientRegistrationFromBannerCopyText(){
        return patientRegistrationFromBannerCopyText;
    }
    public WebElement getPatientRegistrationFromBannerImage(){
        return patientRegistrationFromBannerImage;
    }
    public WebElement getPatientRegistrationFromSideBanner(){
        return patientRegistrationFromSideBanner;
    }
    public WebElement getPatientRegistrationFromSideBannerLogo(){
        return patientRegistrationFromSideBannerLogo;
    }
    public WebElement getPatientRegistrationFromSideBannerDescription(){
        return patientRegistrationFromSideBannerDescription;
    }
    public WebElement getPatientRegistrationFromSideBannerTitle(){
        return patientRegistrationFromSideBannerTitle;
    }
    public WebElement getiWantAssistanceWithTitle(){
        return iWantAssistanceWithTitle;
    }
    public WebElement getiWantAssistanceWithStepText(){
        return iWantAssistanceWithStepText;
    }
    public WebElement getiWantAssistanceWithRequiredCopyText(){
        return iWantAssistanceWithRequiredCopyText;
    }
    public List<WebElement> getiWantAssistanceWithRadioButtonList(){
        return iWantAssistanceWithRadioButtonList;
    }
    public List<WebElement> getiWantAssistanceWithRadioButtonlabelList(){
        return iWantAssistanceWithRadioButtonlabelList;
    }
    public WebElement getContactInformationHeaderStepText(){
        return contactInformationHeaderStepText;
    }
    public WebElement getContactInformationFirstName(){return contactInformationFirstName;}

    public WebElement getContactInformationLastName(){
        return contactInformationLastName;
    }
    public WebElement getContactInformationPhoneNumber(){
        return contactInformationPhoneNumber;
    }
    public WebElement getContactInformationEmail(){
        return contactInformationEmail;
    }
    public List<WebElement> getContactInformationDropdownAsteriskList(){
        return contactInformationDropdownAsteriskList;
    }
    public List<WebElement> getContactInformationTextfieldAsteriskList(){
        return contactInformationTextfieldAsteriskList;
    }
    public List<WebElement> getContactInformationStateAndDispensaryDropdownList(){
        return contactInformationStateAndDispensaryDropdownList;
    }
    public List<WebElement> getContactInformationStateDropdownOptionList(){
        return contactInformationStateDropdownOptionList;
    }
    public List<WebElement> getContactInformationDispensaryDropdownOptionList(){
        return contactInformationDispensaryDropdownOptionList;
    }
    public WebElement getContactInformationDispensaryPasadena(){
        return contactInformationDispensaryPasadena;
    }
    public WebElement getContactInformationFirstNameTextField(){
        return contactInformationFirstNameTextField;
    }
    public WebElement getContactInformationFirstNameErrorText(){
        return contactInformationFirstNameErrorText;
    }
    public WebElement getContactInformationLastNameTextField(){
        return contactInformationLastNameTextField;
    }
    public WebElement getContactInformationLastNameErrorText(){
        return contactInformationLastNameErrorText;
    }
    public WebElement getContactInformationEmailTextField(){
        return contactInformationEmailTextField;
    }
    public WebElement getContactInformationEmailErrorText(){
        return contactInformationEmailErrorText;
    }
    public WebElement getContactInformationMobileTextField(){
        return contactInformationMobileTextField;
    }
    public WebElement getContactInformationMobileErrorText(){
        return contactInformationMobileErrorText;
    }
    //next page

}
