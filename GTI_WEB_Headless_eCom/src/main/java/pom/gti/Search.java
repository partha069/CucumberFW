package pom.gti;

import com.resuableMethods.CommonAction;
import org.openqa.selenium.support.PageFactory;

public class Search extends CommonAction {

    public Search(){
        PageFactory.initElements(driver, this);
    }

      public String displayProduct(Product productName){

        if(productName.getProductList().contains(productName.getProductname())) {

            return productName.getProductname();
        }
          return null;
      }

}
