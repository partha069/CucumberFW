package pom.gti;

import com.google.j2objc.annotations.Weak;
import com.resuableMethods.CommonAction;
import org.apache.poi.xwpf.usermodel.BreakType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Banners extends CommonAction {

    public Banners(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    /*
        Banner information type c
         */
    @FindBy(xpath = "//div[@class='grid md:grid-cols-2 md:grid-rows-1']")
    private WebElement Banner_type_c;
    @FindBy(xpath = "//*[@class='absolute inset-0 grid h-full w-full place-items-center']/div/div/h3")
    private WebElement  Banner_Typec_title;
    @FindBy(xpath = "//*[@class='absolute inset-0 grid h-full w-full place-items-center']/div/div/p")
    private WebElement Banner_Typec_description;
    @FindBy(xpath = "//*[@class='absolute inset-0 grid h-full w-full place-items-center']/div/div/a")
    private WebElement Banner_Typec_Button;
    @FindBy(xpath = "")
    private WebElement Joinnow_PageHeader;
    @FindBy(xpath = "//img[@alt='RISE-BrandGuidelines-for-MediaMonks Page 10 Image 0001']")
    private WebElement Banner_Typec_Backgroundimg;
    @FindBy(xpath = "//img[@alt='Rewardslogo']")
    private WebElement Banner_Typec_Logo;
    @FindBy(xpath = "//div[@class=\'bg-kief grid md:grid-cols-3\']")
    private WebElement Banner_information_typeA;
    @FindBy(xpath = "//div[@class='p-0 md:px-[60px] md:py-[88px] col-span-3']/p")
    private WebElement Banner_information_typeA_smalltext;
    @FindBy(xpath = "//div[@class='p-0 md:px-[60px] md:py-[88px] col-span-3']/h3")
    private WebElement Banner_information_typeA_title;
    @FindBy(xpath = "//div[@class='p-0 md:px-[60px] md:py-[88px] col-span-3']/button")
    private WebElement Banner_information_typeA_cta;
    @FindBy(xpath = "//div[@class='grid place-items-center bg-grey-100 md:grid-cols-2']")
    private WebElement Banner_information_typeB;
    @FindBy(xpath = "//div[@class='grid place-items-center bg-grey-100 md:grid-cols-2']/div/p")
    private WebElement Banner_information_typeB_smalltext;
    @FindBy(xpath = "//div[@class='grid place-items-center bg-grey-100 md:grid-cols-2']/div/div/h2")
    private WebElement Banner_information_typeB_title;
    @FindBy(xpath = "//div[@class='grid place-items-center bg-grey-100 md:grid-cols-2']/div/div/p")
    private WebElement Banner_information_typeB_description;
    @FindBy(xpath = "//div[@class='grid place-items-center bg-grey-100 md:grid-cols-2']/div/div[2]/a")
    private WebElement Banner_information_typeB_cta;



    /*
            Banner information type c
             */

    public WebElement getBanner_type_c(){
        return Banner_type_c;
    }
    public WebElement getBanner_Typec_title(){
        return Banner_Typec_title;
    }
    public WebElement getBanner_Typec_description(){
        return Banner_Typec_description;
    }
    public WebElement getBanner_Typec_Button(){
        return Banner_Typec_Button;
    }
    public WebElement getJoinnow_PageHeader(){
        return Joinnow_PageHeader;
    }
    public WebElement getBanner_Typec_Backgroundimg(){
        return Banner_Typec_Backgroundimg;
    }
    public WebElement getBanner_Typec_Logo(){
        return Banner_Typec_Logo;
    }


    /*
            Banner information type A
             */

    public WebElement getBanner_information_typeA(){
        return Banner_information_typeA;
    }
    public WebElement getBanner_information_typeA_smalltext(){
        return Banner_information_typeA_smalltext;
    }
    public WebElement getBanner_information_typeA_title(){
        return Banner_information_typeA_title;
    }
    public WebElement getBanner_information_typeA_cta(){
        return Banner_information_typeA_cta;
    }

    /*
    Banner information type B
     */
    public WebElement getBanner_information_typeB(){
        return Banner_information_typeB;
    }
    public WebElement getBanner_information_typeB_smalltext(){
        return Banner_information_typeB_smalltext;
    }
    public WebElement getBanner_information_typeB_title(){
        return Banner_information_typeB_title;
    }
    public WebElement getBanner_information_typeB_description(){
        return Banner_information_typeB_description;
    }
    public WebElement getBanner_information_typeB_cta(){
        return Banner_information_typeB_cta;
    }

}
