package parallel;

import com.resuableMethods.CommonAction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pom.gti.Product;
import pom.gti.Search;

public class API_Testing_StepDef extends CommonAction{


	Product product;
	Search search;

	@Given("User have a search field on Amazon Page")
	public void User_have_a_search_field_on_Amazon_Page() {

	}

	@And("User search for a product with name {string} and price {int}")
	public void User_search_for_a_product_with_name_and_price(String Productname, Integer Productprice) {

		product = new Product(Productname, Productprice);

		System.out.println( Productname + Productprice );

	}


	@Then("User should display name of the apple product {string}")
	public void User_should_display_name_and_price_of_that_product(String Productname) {


		System.out.println( Productname );


		search =  new Search();
		String Name = search.displayProduct(product);
		System.out.println( Name );

		Assert.assertEquals(product.getProductList(), Name);

	}

}

