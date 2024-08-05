package pom.gti;

import com.resuableMethods.CommonAction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class T03_UserAuthentication extends CommonAction {
    public T03_UserAuthentication(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    /*
     * Element
     */
    @FindBy(xpath = "//header[@data-testid='header-wrapper']/child::div/child::div/child::div[2]/child::a/child::*")
    private WebElement profileIcon;
    @FindBy(xpath = "//div[@data-testid='login-drawer']")
    private WebElement loginDrawer;
    @FindBy(xpath = "//div[@data-testid='phonenumber-screen']/child::h3")
    private WebElement loginPageHeader;
    @FindBy(xpath = "//div[@data-testid='login-drawer']/child::div[1]/child::div[2]")
    private WebElement loginPageIcon;
    @FindBy(xpath = "//div[@data-testid='login-drawer']/child::div[1]/child::*[3]")
    private WebElement closeIcon;
    @FindBy(xpath = "//div[@data-testid='phonenumber-screen']/child::form/child::div[1]/child::div/child::input")
    private WebElement mobileNumberTextField;
    @FindBy(xpath = "//div[@data-testid='phonenumber-screen']/child::form/child::button[text()='Get OTP']")
    private WebElement getOTPCTA;
    @FindBy(xpath = "//div[@data-testid='phonenumber-screen']/child::div/child::p")
    private WebElement loginPageCopyText;
    @FindBy(xpath = "//div[@data-testid='phonenumber-screen']/child::form/child::div/child::div[2]/child::span/child::p")
    private WebElement mobileNumberErrorText;
    @FindBy(xpath = "//div[@data-testid='login-drawer']")
    private WebElement otpScreen;
    @FindBy(xpath = "//div[@data-testid='otp-screen']/child::div[1]/child::h3[text()='Enter OTP']")
    private WebElement enterOTPHeader;
    @FindBy(xpath = "//div[@data-testid='otp-screen']/child::div[1]/child::p")
    private WebElement enterOTPCopyText;
    @FindBy(xpath = "//div[@data-testid='otp-screen']/child::form/child::div[1]")
    private WebElement otpField;
    @FindBy(xpath = "//div[@data-testid='otp-screen']/child::form/child::div[2]/child::button[@data-testid='submitBtn']")
    private WebElement otpSubmitCTA;
    @FindBy(xpath = "//div[@data-testid='otp-screen']/child::div[2]/child::button[@data-testid='resend-btn']")
    private WebElement resendOtpCTA;
    @FindBy(xpath = "//div[@data-testid='otp-screen']/child::div[2]/child::div/child::p")
    private WebElement resendCopyText;
    @FindBy(xpath = "//div[@data-testid='otp-screen']/child::form/child::div/child::div[*]/child::input")
    private List<WebElement> enterOtpTextFieldList;
    @FindBy(xpath = "//button[@data-testid='submitBtn' and text()='Submit']")
    private WebElement submitCTA;
    @FindBy(xpath = "//div[@data-testid='login-drawer']/child::div[1]/child::div[1]/child::div")
    private WebElement signUpPageProfileIcon;
    @FindBy(xpath = "//div[@data-testid='login-drawer']/child::div[1]/child::div[1]/child::button[@data-testid='close-button-icon']")
    private WebElement signUpPageCloseIcon;
    @FindBy(xpath = "//div[@data-testid='rise-form-drawer-body']/child::div[1]/child::h3")
    private WebElement signUpPageHeader;
    @FindBy(xpath = "//div[@data-testid='rise-form-drawer-body']/child::div[1]/child::div")
    private WebElement signUpPageCopyText;
    @FindBy(xpath = "//div[@data-testid='rise-form-drawer-body']/child::form/child::div[1]/child::div[*]/child::div")
    private List<WebElement> signUpPageTextFieldList;
    @FindBy(xpath = "//div[@data-testid='rise-form-drawer-body']/child::form/child::div[2]/child::div/child::label/child::input")
    private List<WebElement> signUpPageCheckoutBox;
    @FindBy(xpath = "//div[@data-testid='rise-form-drawer-body']/child::form/child::div[2]/child::button")
    private WebElement showMoreCTA;
    @FindBy(xpath = "//div[@data-testid='rise-form-drawer-body']/child::form/child::div[3]/child::button")
    private WebElement submitSignUpCTA;
    @FindBy(xpath = "//h3[text()='Are you sure you want to leave?']/parent::div/parent::div/parent::div/parent::div")
    private WebElement closePopUpScreen;
    @FindBy(xpath = "//div[@data-testid='rise-form-drawer-body']/child::form/child::div[2]/child::button/child::span[text()='Show less']")
    private WebElement showLessCTA;
    @FindBy(xpath = "//li[@id='material-tailwind-select-0']")
    private WebElement californiaDropDownOption;
    @FindBy(xpath = "//li[@id='material-tailwind-select-0']")
    private WebElement riseDispensaryPasadenaOption;
    @FindBy(xpath = "//div[@data-testid='rise-form-drawer-body']/child::form/child::div[1]/child::div[*]/child::div[1]/child::input")
    private List<WebElement> signUpPageTextInputFieldList;
    @FindBy(xpath = "//div[@data-testid='rise-form-drawer-body']/child::form/child::div[1]/child::div[*]/child::div[*]/child::button")
    private List<WebElement> signUpPageDropDownFieldList;
    @FindBy(xpath = "//h2[text()='CONGRATULATIONS!']/parent::div/parent::div")
    private WebElement congratulationScreen;
    @FindBy(xpath = "//h2[text()='CONGRATULATIONS!']/parent::div/parent::div/child::div[1]")
    private WebElement congratulationScreenImage;
    @FindBy(xpath = "//h2[text()='CONGRATULATIONS!']/parent::div/parent::div/child::div[2]/child::p")
    private WebElement congratulationScreenCopyText;
    /*
     * Mobile
     */

    /*
     * getter & setter
     */
    public WebElement getProfileIcon(){
        return profileIcon;
    }
    public WebElement getLoginDrawer(){
        return loginDrawer;
    }
    public WebElement getLoginPageHeader(){
        return loginPageHeader;
    }
    public WebElement getLoginPageIcon(){
        return loginPageIcon;
    }
    public WebElement getCloseIcon(){
        return closeIcon;
    }
    public WebElement getMobileNumberTextField(){
        return mobileNumberTextField;
    }
    public WebElement getGetOTPCTA(){
        return getOTPCTA;
    }
    public WebElement getLoginPageCopyText(){
        return loginPageCopyText;
    }
    public WebElement getMobileNumberErrorText(){
        return mobileNumberErrorText;
    }
    public WebElement getOtpScreen(){
        return otpScreen;
    }
    public WebElement getEnterOTPHeader(){
        return enterOTPHeader;
    }
    public WebElement getEnterOTPCopyText(){
        return enterOTPCopyText;
    }
    public WebElement getOtpField(){
        return otpField;
    }
    public WebElement getOtpSubmitCTA(){
        return otpSubmitCTA;
    }
    public WebElement getResendOtpCTA(){
        return resendOtpCTA;
    }
    public WebElement getResendCopyText(){
        return resendCopyText;
    }
    public List<WebElement> getEnterOtpTextFieldList(){
        return enterOtpTextFieldList;
    }
    public WebElement getSubmitCTA(){
        return submitCTA;
    }
    public WebElement getSignUpPageProfileIcon(){
        return signUpPageProfileIcon;
    }
    public WebElement getSignUpPageCloseIcon(){
        return signUpPageCloseIcon;
    }
    public WebElement getSignUpPageHeader(){
        return signUpPageHeader;
    }
    public WebElement getSignUpPageCopyText(){
        return signUpPageCopyText;
    }
    public List<WebElement> getSignUpPageTextFieldList(){
        return signUpPageTextFieldList;
    }
    public List<WebElement> getSignUpPageCheckoutBox(){
        return signUpPageCheckoutBox;
    }
    public WebElement getShowMoreCTA(){
        return showMoreCTA;
    }
    public WebElement getSubmitSignUpCTA(){
        return submitSignUpCTA;
    }
    public WebElement getClosePopUpScreen(){
        return closePopUpScreen;
    }
    public WebElement getShowLessCTA(){
        return showLessCTA;
    }
    public WebElement getCaliforniaDropDownOption(){
        return californiaDropDownOption;
    }
    public WebElement getRiseDispensaryPasadenaOption(){
        return riseDispensaryPasadenaOption;
    }
    public List<WebElement> getSignUpPageTextInputFieldList(){
        return signUpPageTextInputFieldList;
    }
    public List<WebElement> getSignUpPageDropDownFieldList(){
        return signUpPageDropDownFieldList;
    }
    public WebElement getCongratulationScreen(){
        return congratulationScreen;
    }
    public WebElement getCongratulationScreenImage(){
        return congratulationScreenImage;
    }
    public WebElement getCongratulationScreenCopyText(){
        return congratulationScreenCopyText;
    }
    /*
     * getter & setter mobile
     */

}
