package pom.gti;

import com.resuableMethods.CommonAction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class T09_State_law_index extends CommonAction {
    public T09_State_law_index(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[text()='State law']")
    private WebElement state_law_header;
    @FindBy(xpath = "(//*[@class='w-full  block md:block lg:block']/div[1]/div[1]/p)[1]")
    private WebElement State_law_description;







    public WebElement getState_law_header(){
        return state_law_header;
    }
    public WebElement getState_law_description(){
        return State_law_description;
    }
}
