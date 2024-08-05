package pom.gti;


import com.resuableMethods.CommonAction;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;
import java.util.Random;


public class ContactUs extends CommonAction {

    public ContactUs(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//div[@class='fixed z-[9999] pointer-events-auto bg-white box-border w-full shadow-2xl shadow-blue-gray-900/10 top-0 right-0 !top-[70px] !max-h-none rounded-t-md lg:!top-0 lg:rounded-t-none']")
    private WebElement customercenterdrawerdesktop;
    @FindBy(xpath = "//div[@class='fixed z-[9999] pointer-events-auto bg-white box-border w-full shadow-2xl shadow-blue-gray-900/10 bottom-0 left-0 !top-[70px] !max-h-none rounded-t-md lg:!top-0 lg:rounded-t-none']")
    private WebElement customercenterdrawermobile;

    @FindBy(xpath = "//h3[@data-testid='customerCenterHeading']")
    private WebElement customercenterdrawerheader;

    @FindBy(xpath = "//p[@data-testid='customerCenterDescription']")
    private WebElement customercenterdrawerdescription;

    @FindBy(xpath = "//img[@data-testid='customerCenterImage']")
    private WebElement customercenterdrawerimage;
    @FindBy(xpath = "//button[@data-testid='close-button-icon']")
    private WebElement customercenterdrawerclosecta;
    @FindBy(xpath = "(//a[@data-testid='customerCenterTabTitle'])[1]")
    private WebElement customercenterrecievemessagetitle;
    @FindBy(xpath = "(//a[@data-testid='customerCenterTabTitle'])[2]")
    private WebElement customercenterdrawerchatwithpersontitle;
    @FindBy(xpath = "//*[@data-testid='contact_us_form1']")
    private WebElement contactusform1;
    @FindBy(xpath = "//img[@alt='contactus-logo']")
    private WebElement contactuslogo;
    @FindBy(xpath = "//p[@data-testid='contactus_banner_title']")
    private WebElement contactustitle;
    @FindBy(xpath = "//h4[@data-testid='contactus_banner_subtitle']")
    private  WebElement contactusdescription;
    @FindBy(xpath = "//h3[@data-testid='contact_us_heading']")
    private WebElement contactusheading;
    @FindBy(xpath = "(//div[@class='flex items-center'])[1]/p")
    private WebElement contactusform1progress;
    @FindBy(xpath = "//button[@data-testid='contact_us_continue_button']")
    private WebElement contactusstep1continuecta;

    @FindBy(xpath = "//div[@data-testid='contact_us_form1']/div/label[2]")
    private List<WebElement> step1list;
    @FindBy(xpath = "(//div[@data-testid='contact_us_form1']/div/label[2])[1]")
    private static WebElement contactusfordispensaries;
    @FindBy(xpath = "//*[@data-testid='contact_us_form2']/div/textarea")
    private WebElement contactusform2textfield;
    @FindBy(xpath = "//p[text()='0 of 500 characters']")
    private WebElement textfieldcharcount;
    @FindBy(xpath = "//button[@data-testid='file-upload-button']")
    private WebElement uploadfilecta;
    @FindBy(xpath = "//p[text()='*Optional. Max file size is 50 Mb. Supported file types are .jpg, .png and .pdf']")
    private WebElement uploadfilectaassistivetext;
    @FindBy(xpath = "//button[@data-testid='contact_us_back_button']")
    private WebElement contactusbackcta;
    @FindBy(xpath = "//input[@name='firstName']")
    private WebElement Firstnameinputfield;
    @FindBy(xpath = "//input[@name='lastName']")
    private WebElement lastnameinputfield;
    @FindBy(xpath = "(//input[@name='phoneNumber'])[2]")
    private WebElement Phoneinputfield;
    @FindBy(xpath = "//input[@name='email']")
    private WebElement emailinputfield;

    @FindBy(xpath = "(//button[@aria-haspopup='listbox'])[1]")
    private WebElement State_checkbox;

    @FindBy(xpath = "//ul[@role='listbox']/li")
    private List<WebElement> state_suboptions;

    @FindBy(xpath = "(//button[@aria-haspopup='listbox'])[2]")
    private WebElement dispensary_checkbox;

    @FindBy(xpath = "(//ul[@role='listbox']/li)[1]")
    private WebElement dispensary_suboptions;
    @FindBy(xpath = "//h2[text()='Need more help?']")
    private WebElement need_Helptitle;
    @FindBy(xpath = "//p[@data-testid='dispensaryInfoDescription']")
    private WebElement need_helpdeskription;
    @FindBy(xpath = "//button[text()='Find Dispensary']")
    private WebElement findDispensary_button;
    @FindBy(xpath = "(//div[@data-testid='dispensarylist-drawer'])[1]")
    private WebElement dispensary_Drawer;
    @FindBy(xpath = "//*[@class='md:mr-10 sm:mr-0']/h3")
    private WebElement dispensary_Title;
    @FindBy(xpath = "//img[@class='dispensaryImage']")
    private WebElement dispensary_Image;
    @FindBy(xpath = "(//*[@class='md:mr-10 sm:mr-0']/h3/following::div/p)[1]")
    private WebElement dispensary_Currentday;
    @FindBy(xpath = "(//*[name()='svg'][@stroke='currentColor'])[12]")
    private WebElement dispensary_clockicon;
    @FindBy(xpath = "//*[@class='sm:flex md:block xl:flex items-center']/p")
    private WebElement dispensary_Phone;
    @FindBy(xpath = "(//*[name()='path'])[31]")
    private WebElement dispensary_phoneicon;
    @FindBy(xpath = "(//a[@buttontype='tertiary'])[1]")
    private WebElement dispensary_callnowcta;
    @FindBy(xpath = "//*[@class='sm:flex md:block xl:flex items-center sm:!block']/p")
    private WebElement dispensary_address;
    @FindBy(xpath = "(//*[@stroke='currentColor'])[15]")
    private WebElement dispensary_locicon;
    @FindBy(xpath = "(//a[@buttontype='tertiary'])[2]")
    private WebElement dispensary_viewonmapcta;
    @FindBy(xpath = "//a[@buttontype='secondary']")
    private WebElement dispensary_viewdispensarycta;






    /*
    contact Us drawer
     */
    public WebElement getcustomercenterdrawerdesktop(){
        return customercenterdrawerdesktop;
    }
    public WebElement getcustomercenterdrawermobile(){
        return customercenterdrawermobile;
    }
    public WebElement getcustomercenterdrawerheader(){
        return customercenterdrawerheader;
    }
    public WebElement getcustomercenterdrawerdescription(){
        return customercenterdrawerdescription;
    }
    public WebElement getcustomercenterdrawerimage(){
        return customercenterdrawerimage;
    }
    public WebElement getcustomercenterdrawerclosecta(){
        return customercenterdrawerclosecta;
    }
    public WebElement getcustomercenterrecievemessagetitle(){
        return customercenterrecievemessagetitle;
    }

    public WebElement getcustomercenterdrawerchatwithpersontitle(){
        return customercenterdrawerchatwithpersontitle;
    }

    /*
    contact Us form 1
     */


    public WebElement Getcontactusform1() {
        return contactusform1;
    }
    public WebElement getcontactuslogo(){
        return contactuslogo;
    }
    public WebElement getcontactustitle(){
        return contactustitle;
    }
    public WebElement getcontactusdescription(){
        return contactusdescription;
    }
    public WebElement getcontactusform1progress(){
        return contactusform1progress;
    }
    public WebElement getcontactusstep1continuecta(){
        return contactusstep1continuecta;
    }
    public WebElement getcontactusheading(){
        return contactusheading;
    }
    public static WebElement getcontactusfordispensaries(){
        return contactusfordispensaries;
    }

    /*
    contact Us form 2
     */

    public WebElement getcontactusform2textfield(){
        return contactusform2textfield;
    }
    public WebElement gettextfieldcharcount(){
        return textfieldcharcount;
    }
    public WebElement getuploadfilecta(){
        return uploadfilecta;
    }
    public WebElement getuploadfilectaassistivetext(){
        return uploadfilectaassistivetext;
    }
    public WebElement getcontactusbackcta(){
        return contactusbackcta;
    }

    /*
   contact Us form 3
    */
    public WebElement getFirstnameinputfield(){
        return Firstnameinputfield;
    }
    public WebElement getlastnameinputfield(){
        return lastnameinputfield;
    }
    public WebElement getPhoneinputfield(){
        return Phoneinputfield;
    }
    public WebElement getemailinputfield(){
        return emailinputfield;
    }


    /*
    Need help banner
     */

    public WebElement getneed_Helptitle(){
        return need_Helptitle;
    }
    public WebElement getneed_helpdeskription(){
        return need_helpdeskription;
    }
    public WebElement getfindDispensary_button(){
        return findDispensary_button;
    }
    public WebElement getdispensary_Drawer(){
        return dispensary_Drawer;
    }
    public WebElement getdispensary_Title(){
        return dispensary_Title;
    }
    public WebElement getdispensary_Image(){
        return dispensary_Image;
    }
    public WebElement getdispensary_Currentday(){
        return dispensary_Currentday;
    }
    public WebElement getdispensary_clockicon(){
        return dispensary_clockicon;
    }
    public WebElement getdispensary_Phone(){
        return dispensary_Phone;
    }
    public WebElement getdispensary_phoneicon(){
        return dispensary_phoneicon;
    }
    public WebElement getdispensary_callnowcta(){
        return dispensary_callnowcta;
    }
    public WebElement getdispensary_address(){
        return dispensary_address;
    }
    public WebElement getdispensary_locicon(){
        return dispensary_locicon;
    }
    public WebElement getdispensary_viewonmapcta(){
        return dispensary_viewonmapcta;
    }
    public WebElement etdispensary_viewdispensarycta(){
        return dispensary_viewdispensarycta;
    }




    public void assertcontactusform1progresscount(){
        String progresscount = getcontactusform1progress().getText();
        Assert.assertEquals("Step 1 of 3",progresscount);
    }
    public void defaultcontinuectacolor(){
        String defaultcontinuectacolor = contactusstep1continuecta.getCssValue("background-color");
        Assert.assertEquals("rgba(189, 194, 166, 1)",defaultcontinuectacolor );

    }
    public void selectinglistinstp1(){

        for(int i=0; i<step1list.size();i++) {
            jsClick(step1list.get(i));
            Assert.assertEquals("rgba(0, 70, 30, 1)", step1list.get(i).getCssValue("color"));

        }
    }

    public void assertcontactusform2progresscount(){
        String progresscount2 = getcontactusform1progress().getText();
        Assert.assertEquals("Step 2 of 3",progresscount2);
    }
    public void assertcontactusform3progresscount(){
        String progresscount2 = getcontactusform1progress().getText();
        Assert.assertEquals("Step 3 of 3",progresscount2);
    }
    public void enter_Contactdetails(String FirstName,String LastName,String MobileNumber,String Email ){
        SendKeysOnWebElement(getFirstnameinputfield(), FirstName);
        SendKeysOnWebElement(getlastnameinputfield(), LastName);
        SendKeysOnWebElement(getPhoneinputfield(), MobileNumber);
        SendKeysOnWebElement(getemailinputfield(), Email);


    }

    public void click_StateDropdown(){
        clickOn(State_checkbox);
        visibilityWait(state_suboptions.get(1));
        Random r = new Random();
        int randomValue = r.nextInt(state_suboptions.size());
        state_suboptions.get(randomValue).click();


    }
    public void click_dispensaryDropdown(){
        visibilityWait(dispensary_checkbox);
        clickOn(dispensary_checkbox);
        visibilityWait(dispensary_suboptions);
        clickOn(dispensary_suboptions);
    }

    public void scrollto_needhelpbanner(){
        javascriptScroll(getneed_Helptitle());
        Assert.assertTrue(getneed_Helptitle().isDisplayed());
    }
    public void get_currentday(){
        DayOfWeek currentday = LocalDate.now().getDayOfWeek();
        String Curerentday = currentday.toString();
        String day = dispensary_Currentday.getText();
        Assert.assertEquals(true, day.contains(Curerentday));

    }


}