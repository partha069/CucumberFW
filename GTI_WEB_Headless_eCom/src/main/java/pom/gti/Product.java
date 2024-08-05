package pom.gti;

import com.resuableMethods.CommonAction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class Product extends CommonAction {

    public Product(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

      String Productname;
      int price;


      public Product(String Productname, int price){

          this.price = price;
          this.Productname = Productname;
      }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getProductname() {
        return Productname;
    }

    public void setProductname(String productname) {
        Productname = productname;
    }



    public List<String> getProductList() {
        List<String> productList = new ArrayList<>();
        productList.add("Apple MacBook One");
        productList.add("Apple MacBook Two");
        productList.add("Apple MacBook Three");
        return productList;
    }

}
