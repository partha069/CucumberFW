package pom.gti;

import com.resuableMethods.CommonAction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ProductCarousel extends CommonAction {
    public ProductCarousel(WebDriver driver){
        PageFactory.initElements(driver, this);
    }



}
