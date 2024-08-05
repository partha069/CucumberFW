package parallel;

import org.apache.commons.collections.bag.SynchronizedSortedBag;
import org.junit.Assert;

import com.driverfactory.DriverManager;
import com.resuableMethods.CommonAction;
import com.utilities.Logger;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import pom.gti.Home;

public class T01_Home_Stepdef extends CommonAction{
	Home home= new Home(DriverManager.getDriver());
	
	
	@When("user is in home page")
	public void user_is_in_home_page() {
	    Assert.assertTrue(home.getherobanner().isDisplayed());
	    Logger.log("user is in home page");
	}

	@Then("user should be able to view the hero carousel")
	public void user_should_be_able_to_view_the_hero_carousel() {
		Assert.assertTrue(home.getherobanner().isDisplayed());
		Logger.log("user should be able to view the hero carousel");
	}

	@Then("user should be able to view thecategories section with show more CTA")
	public void user_should_be_able_to_view_thecategories_section_with_show_more_cta() {
		javascriptScroll(home.getcategoriessection());
		Assert.assertTrue(home.getcategoriessection().isDisplayed());
		Assert.assertTrue(home.getcategoriesshowmorecta().isDisplayed());
		Logger.log("user should be able to view thecategories section with show more CTA");
		
	}

	@Then("user should be able to view the product carousel with title text and copy text and CTA")
	public void user_should_be_able_to_view_the_product_carousel_with_title_text_and_copy_text_and_cta(){
		javascriptScroll(home.getproductcarousel());
		
		Assert.assertTrue(home.getproductcarousel().isDisplayed());
		Logger.log("user should be able to view the product carousel");
		Assert.assertTrue(home.getproductcarouseltitle().isDisplayed());
		Logger.log("user should be able to view the product carousel with title text");
		Assert.assertTrue(home.getproductcarouselcopytext().isDisplayed());
		Logger.log("user should be able to view the product carousel with title text and copy text");
		Assert.assertTrue(home.getproductcarouselcta().isDisplayed());
		Logger.log("user should be able to view the product carousel with title text and copy text and CTA");
	}

	@Then("user should be able to view the banner information with shop now CTA")
	public void user_should_be_able_to_view_the_banner_information_with_shop_now_cta() {
	    javascriptScroll(home.getbannerinfo());
	    
	    Assert.assertTrue(home.getbannerinfo().isDisplayed());
	    Logger.log("user should be able to view the banner information");
	    Assert.assertTrue(home.getbannerinfoCTA().isDisplayed());
	    Logger.log("user should be able to view the banner information with shop now CTA");
	}

	@Then("user should be able to view the about us banner with about us CTA")
	public void user_should_be_able_to_view_the_about_us_banner_with_about_us_cta() {
	    javascriptScroll(home.getaboutusbanner());
	    
	    Assert.assertTrue(home.getaboutusbanner().isDisplayed());
	    Logger.log("user should be able to view the about us banner");
	    Assert.assertTrue(home.getaboutusCTA().isDisplayed());
	    Logger.log("user should be able to view the about us banner with about us CTA");
	}

	@Then("user should be able to view the join now banner with join now CTA")
	public void user_should_be_able_to_view_the_join_now_banner_with_join_now_cta() {
	    javascriptScroll(home.getjoinnowbanner());
	    
	    Assert.assertTrue(home.getjoinnowbanner().isDisplayed());
	    Logger.log("user should be able to view the join now banner");
	    Assert.assertTrue(home.getjoinnowcta().isDisplayed());
	    Logger.log("user should be able to view the join now banner with join now CTA");
	    
	}

	@Then("user should be able to view the ariticle section with see all article results CTA")
	public void user_should_be_able_to_view_the_ariticle_section_with_see_all_article_results_cta() {
	    javascriptScroll(home.getarticlessection());
	    
	    Assert.assertTrue(home.getarticlessection().isDisplayed());
	    Logger.log("user should be able to view the ariticle section with see all article results CTA");
	    Assert.assertTrue(home.getarticleseeallcta().isDisplayed());
	    Logger.log("user should be able to view the ariticle section with see all article results CTA");
	}


	@When("user scroll down to the categories section")
	public void user_scroll_down_to_the_categories_section() {
	    javascriptScroll(home.getarticleseeallcta());
	    Logger.log("user scroll down to the categories section");
	}

	@When("user clicks the show more CTA")
	public void user_clicks_the_show_more_cta() {
	    home.clickshowmorecta();
	    
	}

	@Then("user should be able t view the expanded categories section")
	public void user_should_be_able_t_view_the_expanded_categories_section() {
	    Assert.assertTrue(home.getcategoriesshowlesscta().isDisplayed());
	    Logger.log("user should be able t view the expanded categories section");
	}


// Home screen scenario vise cases

	/*
	 * Hero banner steps
	 */

//	@When("user is viewing Light Theme Hero Carousel in Homepage")
//	public void user_is_viewing_light_theme_hero_carousel_in_homepage() {
//
//	}
//
//	@Then("User is able to View Hero Banner Carousel")
//	public void user_is_able_to_view_hero_banner_carousel() {
//		// Write code here that turns the phrase above into concrete actions
//		throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("User is able to view Background image")
//	public void user_is_able_to_view_background_image() {
//		// Write code here that turns the phrase above into concrete actions
//		throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("User is able to view Title Text")
//	public void user_is_able_to_view_title_text() {
//		// Write code here that turns the phrase above into concrete actions
//		throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("User is able to view Copy Text")
//	public void user_is_able_to_view_copy_text() {
//		// Write code here that turns the phrase above into concrete actions
//		throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("User is able to view CTA Button")
//	public void user_is_able_to_view_cta_button() {
//		// Write code here that turns the phrase above into concrete actions
//		throw new io.cucumber.java.PendingException();
//	}


	/*
	 * category step def
	 */

	@When("user scroll down to Category Navigation section")
	public void user_scroll_down_to_category_navigation_section() {
		javascriptScroll(home.getcategoriessection());
		Assert.assertTrue(home.getcategoriessection().isDisplayed());
		Logger.log("user scroll down to Category Navigation section");
	}

	@Then("user should able to view the OUR CANNABIS PRODUCTS title text")
	public void user_should_able_to_view_the_our_cannabis_products_title_text() {
		Assert.assertTrue(home.getcategoriessection().isDisplayed());
		Logger.log("user should able to view the OUR CANNABIS PRODUCTS title text");
	}

	@Then("user should able to view the list of first {int} categories in grey in colour in default")
	public void user_should_able_to_view_the_list_of_first_categories_in_grey_in_colour_in_default(Integer int1) {

		Assert.assertTrue(home.getcategoriesflower().isDisplayed());
		home.flowercolor();
		Assert.assertTrue(home.getcategoriesprerolls().isDisplayed());
		home.prerollscolor();
		Assert.assertTrue(home.getcategoriesvape().isDisplayed());
		home.vapecolor();
		Assert.assertTrue(home.getcategoriesedibles().isDisplayed());
		home.ediblescolor();
		Logger.log("User can able to view the first 4 types by default flower, prerolls, vapes, edibles");
	}

	@Then("user should able to show more CTA")
	public void user_should_able_to_show_more_cta() {
		Assert.assertTrue(home.getcategoriesshowmorecta().isDisplayed());
	}
	@When("user clicks on the show more CTA")
	public void user_clicks_on_the_show_more_cta() {
		Assert.assertTrue(home.getcategoriesshowmorecta().isDisplayed());
		home.clickshowmorecta();
	}

	@Then("user should able to view complete list of categories available for the particular state")
	public void user_should_able_to_view_complete_list_of_categories_available_for_the_particular_state() {
		Assert.assertTrue(home.getcategoriesflower().isDisplayed());
		Assert.assertTrue(home.getcategoriesprerolls().isDisplayed());
		Assert.assertTrue(home.getcategoriesvape().isDisplayed());
		Assert.assertTrue(home.getcategoriesedibles().isDisplayed());
		Assert.assertTrue(home.getcategoriesdrinks().isDisplayed());
		Assert.assertTrue(home.getcategoriesconcentrates().isDisplayed());
		Assert.assertTrue(home.getcategoriesTinctures().isDisplayed());
		Assert.assertTrue(home.getcategoriestopicals().isDisplayed());
		Assert.assertTrue(home.getcategoriesCapsules().isDisplayed());
		Assert.assertTrue(home.getcategoriescbd().isDisplayed());
		Assert.assertTrue(home.getcategoriesGear().isDisplayed());
		Assert.assertTrue(home.getcategoriesMerch().isDisplayed());
		Assert.assertTrue(home.getcategoriesRYTHM().isDisplayed());
		Logger.log("user should able to view complete list of categories available for the particular state");
	}
	@Then("user should able see Showing <no of categories> of <total no of categories>")
	public void user_should_able_see_showing_no_of_categories_of_total_no_of_categories() {
		Assert.assertTrue(home.getcategoriesshowingtext().isDisplayed());
		Logger.log("user should able see Showing <no of categories> of <total no of categories>");
	}
	@Then("user should able to view show less CTA")
	public void user_should_able_to_view_show_less_cta() {
		Assert.assertTrue(home.getcategoriesshowlesscta().isDisplayed());
		Logger.log("user should able to view show less CTA");
	}
	@When("user clicks on the show less CTA")
	public void user_clicks_on_the_show_less_cta() {
		home.Clickshowlesscta();
	}

	/*
	 * home page product listing carousel
	 */
	@When("User scrolls down to carousel section")
	public void user_scrolls_down_to_carousel_section() {
	javascriptScroll(home.getProductlistblock());
	Logger.log("User scrolls down to carousel section");
	}

	@Then("User should be able to view the Product Carousel")
	public void user_should_be_able_to_view_the_product_carousel() {
	Assert.assertTrue(home.getProductcarouselproductblock().isDisplayed());
	}

	@When("Test Pseudo Elements")
	public void User_Test_Pseudo_Elements() {
	//	PseudoElement();
	//	mouseOver(DriverManager.getDriver().findElement(By.id("menu-item-187")));
	//	DriverManager.getDriver().findElement(By.id("menu-item-5587")).click();

		DriverManager.getDriver().findElement(By.xpath("(//*[@class='wrap']/child::ul/child::li/following-sibling::li)[1]")).click();
	//	element = DriverManager.getDriver().findElement(By.id("menu-item-5587")).click();
		waitFor(12000);
		Logger.log("Test Pseudo Elements");
	}

}
