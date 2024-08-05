package pom.gti;

import com.resuableMethods.CommonAction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class T09_Dispensary_guideindex extends CommonAction {
    public T09_Dispensary_guideindex(WebDriver driver){
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//h2[text()='Dispensary Guides']")
    private WebElement Dispensaryguide_index_header;

    @FindBy(xpath = "(//*[@class='w-full  block md:block lg:block']/div[1]/div[1]/p)[1]")
    private WebElement Dispensaryguide_index_headerdiscription;
    @FindBy(xpath = "//*[@class='xl:w-[884px] xl:pl-[60px] px-5']/h2")
    private WebElement dispensary_details_Hero_header;



    public WebElement getDispensaryguide_index_header(){
        return Dispensaryguide_index_header;
    }

    public WebElement getDispensaryguide_index_headerdiscription() {
        return Dispensaryguide_index_headerdiscription;
    }
    public WebElement getdispensary_details_Hero_header(){
        return dispensary_details_Hero_header;
    }
}
