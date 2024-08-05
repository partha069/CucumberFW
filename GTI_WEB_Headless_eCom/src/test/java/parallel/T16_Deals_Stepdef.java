package parallel;

import com.driverfactory.DriverManager;
import com.resuableMethods.CommonAction;
import com.resuableMethods.Highlighter;
import com.utilities.Logger;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pom.gti.Banners;
import pom.gti.Header;
import pom.gti.T16_Deals_page;



public class T16_Deals_Stepdef extends CommonAction {
    Highlighter highlighter = new Highlighter();
    Header headeractions = new Header(DriverManager.getDriver());
    T16_Deals_page Deals = new T16_Deals_page(DriverManager.getDriver());
    Banners banners = new Banners(DriverManager.getDriver());

    @Given("user clicks Shop menu on global header")
    public void user_clicks_shop_menu_on_global_header() {
        if (headeractions.getHamburgerMenu().isDisplayed()){
            jsClick(headeractions.getHamburgerMenu());
//            headeractions.ClickOnHambergerMenu();
//            headeractions.clickheadershop();
            jsClick(headeractions.getheadershop());
            Logger.log("User clicked shop from hamburger menu");

        }else {
            if (headeractions.getheadershop().isDisplayed()){
//                headeractions.clickheadershop();
                jsClick(headeractions.getheadershop());
                Logger.log("User clicked shop menu from global header");
            }
        }

    }

    @When("user is on the expanded navigation")
    public void user_is_on_the_expanded_navigation() {
        Assert.assertTrue(headeractions.getexpandedshop().isDisplayed());
        Logger.log("user is on the expanded navigation");
    }

    @When("user clicks on the Deals option")
    public void user_clicks_on_the_deals_option() {
        if (headeractions.getexpandedshopDeals().isDisplayed()){
            jsClick(headeractions.getexpandedshopDeals());
            Logger.log("user clicks on the Deals option");
        }else {
            Logger.log("Deals option is not visible");
        }
    }

    @Then("user should navigate to the respective Deals Page")
    public void user_should_navigate_to_the_respective_deals_page() {
        if (Deals.getDeals_herobanner_headertext().isDisplayed()){
            highlighter.highLighterMethod(Deals.getDeals_herobanner_headertext(), DriverManager.getDriver());
            waitFor(1000);
            Assert.assertTrue(Deals.getDeals_herobanner_headertext().isDisplayed());
            Logger.log("user should navigate to the respective Deals Page");
        }else {
            Logger.log("User not able to view the deals page");
        }
    }


    @Then("user is able to see the Hero Content at the top of the page under global header")
    public void userIsAbleToSeeTheHeroContentAtTheTopOfThePageUnderGlobalHeader() {
        Assert.assertTrue(Deals.getDealspage_Herobanner().isDisplayed());
        Logger.log("user is able to see the Hero Content at the top of the page under global header");
    }

    @And("user should able to see the State dispensary deal information")
    public void userShouldAbleToSeeTheStateDispensaryDealInformation() {
            Assert.assertTrue(Deals.getDeals_herobanner_headertext().isDisplayed());
            Assert.assertTrue(Deals.getDeals_herobanner_description().isDisplayed());
            Logger.log("user should able to see the State dispensary deal information");
        }

    @Then("user should able to view the Title Text")
    public void userShouldAbleToViewTheTitleText() {
        highlighter.highLighterMethod(Deals.getDeals_herobanner_headertext(), DriverManager.getDriver());
        waitFor(1000);
        Assert.assertTrue(Deals.getDeals_herobanner_headertext().isDisplayed());
        Logger.log("user should able to view the Title Text");
    }

    @And("user should able to view the Copy Text")
    public void userShouldAbleToViewTheCopyText() {
        highlighter.highLighterMethod(Deals.getDeals_herobanner_description(), DriverManager.getDriver());
        waitFor(1000);
        Assert.assertTrue(Deals.getDeals_herobanner_description().isDisplayed());
        Logger.log("user should able to view the Copy Text");
    }

    @And("user should able view the image")
    public void userShouldAbleViewTheImage() {
        highlighter.highLighterMethod(Deals.getHerobanner_image(), DriverManager.getDriver());
        waitFor(1000);
        Assert.assertTrue(Deals.getHerobanner_image().isDisplayed());
        highlighter.highLighterMethod(Deals.getHerobanner_centerImage(), DriverManager.getDriver());
        waitFor(1000);
        Assert.assertTrue(Deals.getHerobanner_centerImage().isDisplayed());
        Logger.log("user should able view the image");
    }


    @And("User should scroll down to respective banner variant C")
    public void userShouldScrollDownToRespectiveBannerVariantC() {
        javascriptScroll(banners.getBanner_type_c());
        Assert.assertTrue(banners.getBanner_type_c().isDisplayed());
        Logger.log("User should scroll down to respective banner variant C");
    }

    @Then("User should see a Title Text with {int} or {int} lines")
    public void userShouldSeeATitleTextWithOrLines(int arg0, int arg1) {
        highlighter.highLighterMethod(banners.getBanner_Typec_title(), DriverManager.getDriver());
        waitFor(1000);
        Assert.assertTrue(banners.getBanner_Typec_title().isDisplayed());
        Logger.log("User should see a Title Text with {int} or {int} lines");
    }

    @Then("User should see a Copy text with {int} or {int} lines")
    public void userShouldSeeACopyTextWithOrLines(int arg0, int arg1) {
        highlighter.highLighterMethod(banners.getBanner_Typec_description(), DriverManager.getDriver());
        waitFor(1000);
        Assert.assertTrue(banners.getBanner_Typec_description().isDisplayed());
        Logger.log("User should see a Copy text with {int} or {int} lines");
    }

    @Then("User should click on CTA on Banner Image")
    public void userShouldClickOnCTAOnBannerImage() {
        highlighter.highLighterMethod(banners.getBanner_Typec_Button(), DriverManager.getDriver());
        Assert.assertTrue(banners.getBanner_Typec_Button().isDisplayed());
        jsClick(banners.getBanner_Typec_Button());
        Logger.log("User should click on CTA on Banner Image");
    }

//    @And("User should see link is open in same tab")
//    public void userShouldSeeLinkIsOpenInSameTab() {
//        try{
//            switchToTabs("1");
//            Assert.assertTrue(banners.getJoinnow_PageHeader().isDisplayed());
//            Logger.log("User navigated to the next tab");
//        }catch (Exception e){
//
//            Assert.assertTrue(banners.getJoinnow_PageHeader().isDisplayed());
//            Logger.log("User should see link is open in same tab");
//        }
//
//    }

//    @And("User should see link is open in new tab")
//    public void userShouldSeeLinkIsOpenInNewTab() {
//        try{
//            switchToTabs("1");
//            Assert.assertTrue(banners.getJoinnow_PageHeader().isDisplayed());
//            Logger.log("User navigated to the next tab");
//        }catch (Exception e){
//
//            Assert.assertTrue(banners.getJoinnow_PageHeader().isDisplayed());
//            Logger.log("User should see link is open in same tab");
//        }
//    }

    @Then("User should see a background image in the banner along with background color")
    public void userShouldSeeABackgroundImageInTheBannerAlongWithBackgroundColor() {
        Assert.assertTrue(banners.getBanner_Typec_Backgroundimg().isDisplayed());
        Logger.log("User should see a background image in the banner along with background color");
    }

    @Then("User should see a Logo image on top of the banner")
    public void userShouldSeeALogoImageOnTopOfTheBanner() {
        Assert.assertTrue(banners.getBanner_Typec_Logo().isDisplayed());
        Logger.log("User should see a Logo image on top of the banner");

    }

    @Then("user should be able to view the Deals header")
    public void userShouldBeAbleToViewTheDealsHeader() {
        Assert.assertTrue(Deals.getDeals_Header().isDisplayed());
        Logger.log("user should be able to view the Deals header");
    }

    @And("user scroll down to Deal section")
    public void userScrollDownToDealSection() {
        javascriptScroll(Deals.getDeals_Header());
        Logger.log("user scroll down to Deal section");
    }

    @And("user should be able to view the first {int} deal cards in a row in the section")
    public void userShouldBeAbleToViewTheFirstDealCardsInARowInTheSection(int arg0) {
        Deals.Deals_card_list();
    }

    @And("user should be able to view the number of products shown and the total")
    public void userShouldBeAbleToViewTheNumberOfProductsShownAndTheTotal() {
        Assert.assertTrue(Deals.getDeals_current_count().isDisplayed());
        Logger.log("user should be able to view the number of products shown and the total");
    }

    @And("user should be able to see  {string} CTA")
    public void userShouldBeAbleToSeeShowMoreCTA() {
        Assert.assertTrue(Deals.getDeals_Showmore_cta().isDisplayed());
        Logger.log("user should be able to see  show more CTA");
    }

    @And("user should be able to see maximum of {int} cards is displayed")
    public void userShouldBeAbleToSeeMaximumOfCardsIsDisplayed(int arg0) {

    }

    @Then("user should able to see all the deal cards")
    public void userShouldAbleToSeeAllTheDealCards() {
        Deals.Deals_card_list();
    }

    @Then("user should able to view the image in the card along with background color")
    public void userShouldAbleToViewTheImageInTheCardAlongWithBackgroundColor() {
        Deals.Deals_card_img_list();
        Logger.log("user should able to view the image in the card along with background color");
    }


    @And("user should able to view the deal label")
    public void userShouldAbleToViewTheDealLabel() {

    }

    @And("user should able to view the deal type text")
    public void userShouldAbleToViewTheDealTypeText() {
        Deals.Deals_card_typeList();
        Logger.log("user should able to view the deal type text");
    }
    @Then("user should able to view the deal card title")
    public void user_should_able_to_view_the_deal_card_title() {
        Deals.Deals_card_title_list();
        Logger.log("user should able to view the deal card title");
    }

    @Then("user should able to view the description in {int} or {int} lines")
    public void user_should_able_to_view_the_description_in_or_lines(Integer int1, Integer int2) {
        Deals.Deals_card_description_list();
        Logger.log("user should able to view the description in 1 or 2 lines");
    }
    @When("user click anywhere on deal card")
    public void user_click_anywhere_on_deal_card() {
        jsClick(Deals.getDeals_card_titleclick());
        Logger.log("user click anywhere on deal card");
    }


//    @Then("user should navigate to the respective internal page")
//    public void userShouldNavigateToTheRespectiveInternalPage() {
//
//    }
//
//    @Then("user should navigate to the respective external page in new tab")
//    public void userShouldNavigateToTheRespectiveExternalPageInNewTab() {
//
//    }

    @And("user scroll down to the Events Discouns section")
    public void userScrollDownToTheEventsDiscounsSection() {
        javascriptScroll(Deals.getEvent_discount_header());
        Logger.log("user scroll down to the Events Discouns section");
    }

    @Then("user should able to see Events Discouns banner with heading")
    public void userShouldAbleToSeeEventsDiscounsBannerWithHeading() {
        highlighter.highLighterMethod(Deals.getEvent_discount_header(), DriverManager.getDriver());
        waitFor(1000);
        Assert.assertTrue(Deals.getEvent_discount_header().isDisplayed());
        Logger.log("user should able to see Events Discouns banner with heading");
    }

    @And("user should able to see banner image of event discount banenr")
    public void userShouldAbleToSeeBannerImageOfEventDiscountBanenr() {
        highlighter.highLighterMethod(Deals.getEvent_discount_image(), DriverManager.getDriver());
        waitFor(500);
        Assert.assertTrue(Deals.getEvent_discount_image().isDisplayed());
        Logger.log("user should able to see banner image of event discount banenr");
    }
    @Then("user should able to see title text of event discount banenr")
    public void user_should_able_to_see_title_text_of_event_discount_banenr() {
        highlighter.highLighterMethod(Deals.getEvent_discount_title(), DriverManager.getDriver());
        waitFor(500);
        Assert.assertTrue(Deals.getEvent_discount_title().isDisplayed());
        Logger.log("user should able to see title text of event discount banenr" + Deals.getEvent_discount_title().getText());
    }

    @Then("user should able to see copy text of event discount banenr")
    public void user_should_able_to_see_copy_text_of_event_discount_banenr() {
        highlighter.highLighterMethod(Deals.getEvent_discount_description(), DriverManager.getDriver());
        waitFor(500);
        Assert.assertTrue(Deals.getEvent_discount_description().isDisplayed());
        Logger.log("user should able to see copy text of event discount banenr" + Deals.getEvent_discount_description().getText());
    }

    @Then("user should able to see CTA button")
    public void user_should_able_to_see_cta_button() {
        highlighter.highLighterMethod(Deals.getEvent_discount_button(), DriverManager.getDriver());
        waitFor(500);
        Assert.assertTrue(Deals.getEvent_discount_button().isDisplayed());
        Logger.log("user should able to see CTA button");
    }

    @And("user clicks on the Read more CTA from event s discount banner")
    public void userClicksOnTheReadMoreCTAFromEventSDiscountBanner() {
        jsClick(Deals.getEvent_discount_button());
        Logger.log("user clicks on the Read more CTA from event s discount banner");
    }

//    @Then("user should navigate to the respective internal link")
//    public void userShouldNavigateToTheRespectiveInternalLink() {
//
//    }
//
//    @Then("user should navigate to the respective external link in new tab")
//    public void userShouldNavigateToTheRespectiveExternalLinkInNewTab() {
//
//    }

    @And("user clicks on the right arrow")
    public void userClicksOnTheRightArrow() {
        jsClick(Deals.getEvent_discount_Nexticon());
        Logger.log("user clicks on the right arrow");
    }

    @Then("user should able to navigate the banner in right side")
    public void userShouldAbleToNavigateTheBannerInRightSide() {
        Deals.Deals_banner_left_to_right_swipe();
//        Assert.assertTrue(Deals.getEvent_discount_title().isDisplayed());
        Logger.log("user should able to navigate the banner in right side");

    }
    @When("user clicks on the left arrow")
    public void user_clicks_on_the_left_arrow() {
        Assert.assertTrue(Deals.getEvent_discount_title().isDisplayed());
        jsClick(Deals.getEvent_discount_Nexticon());
        jsClick(Deals.getEvent_discount_previcon());
        Logger.log("user clicks on the left arrow");

    }

    @Then("user should able to navigate the banner in left side")
    public void user_should_able_to_navigate_the_banner_in_left_side() {
        Assert.assertTrue(Deals.getEvent_discount_title().isDisplayed());
        Logger.log("user should able to navigate the banner in left side");
    }

    @When("user is on the first image")
    public void user_is_on_the_first_image() {
        Assert.assertTrue(Deals.getEvent_discount_image().isDisplayed());
        Logger.log("user is on the first image");
    }

    @Then("user should able to see the left arrow in disabled state")
    public void user_should_able_to_see_the_left_arrow_in_disabled_state() {
        String leftarro_color = Deals.getEvent_discount_previcon().getCssValue("color");
        Assert.assertEquals("rgb(189, 194, 166)", leftarro_color);
        Logger.log("user should able to see the left arrow in disabled state");
    }

    @And("user navigate to the last image of the event discount")
    public void userNavigateToTheLastImageOfTheEventDiscount() {
        for (int i=0; i>=0; i++){
            jsClick(Deals.getEvent_discount_Nexticon());
            visibilityWait(Deals.getEvent_discount_image());
        }
        Logger.log("user navigate to the last image");
    }


    @Then("user should able to see the right arrow in disabled state for event discount")
    public void userShouldAbleToSeeTheRightArrowInDisabledStateForEventDiscount() {
        String right_arrow_color = Deals.getEvent_discount_Nexticon().getCssValue("color");
        Assert.assertEquals("rgb(189, 194, 166)", right_arrow_color);
        Logger.log("user should able to see the right arrow in disabled state");
    }

    @And("user scroll down to GROUP DISCOUNTS section in Deals Page")
    public void userScrollDownToGROUPDISCOUNTSSectionInDealsPage() {
        javascriptScroll(Deals.getGroupdiscount_header());
        Logger.log("user scroll down to GROUP DISCOUNTS section in Deals Page");
    }

    @Then("user should be able to view the GROUP DISCOUNTS header")
    public void user_should_be_able_to_view_the_group_discounts_header() {
        Assert.assertTrue(Deals.getGroupdiscount_header().isDisplayed());
        Logger.log("user should be able to view the GROUP DISCOUNTS header");
    }

    @And("user should be able to view the discount cards row in the section")
    public void userShouldBeAbleToViewTheDiscountCardsRowInTheSection() {
        Assert.assertTrue(Deals.getGroupdiscount_card_section().isDisplayed());
        Logger.log("user should be able to view the discount cards row in the section");
    }

    @Then("user should be able to see maximum of {int} GROUP DISCOUNTS cards is displayed")
    public void user_should_be_able_to_see_maximum_of_group_discounts_cards_is_displayed(Integer int1) {
        for (int i=0; i<Deals.getGroupDiscount_cards_list().size(); i++){
            Assert.assertTrue(Deals.getGroupDiscount_cards_list().get(i).isDisplayed());
            Logger.log("user should be able to see maximum of 10 GROUP DISCOUNTS cards is displayed");
        }
    }

//    @Then("user should not see any show more cta")
//    public void user_should_not_see_any_show_more_cta() {
//
//    }
    @Then("user scroll the card vertically and able to view all the GROUP DISCOUNTS deal cards")
    public void userScrollTheCardVerticallyAndAbleToViewAllTheGROUPDISCOUNTSDealCards() {
        for (int i=0; i<Deals.getGroupDiscount_cards_list().size(); i++){
            javascriptScroll(Deals.getGroupDiscount_cards_list().get(i));
            Assert.assertTrue(Deals.getGroupDiscount_cards_list().get(i).isDisplayed());
        }
        Logger.log("user scroll the card vertically and able to view all the GROUP DISCOUNTS deal cards");
    }



    @Then("user should able to view the image")
    public void user_should_able_to_view_the_image() {
        for (int i=0; i<Deals.getGroupDiscount_card_img().size(); i++){
//            javascriptScroll(Deals.getGroupDiscount_card_img().get(i));
            highlighter.highLighterMethod(Deals.getGroupDiscount_card_img().get(i), DriverManager.getDriver());
            Assert.assertTrue(Deals.getGroupDiscount_card_img().get(i).isDisplayed());

            highlighter.highLighterMethod(Deals.getGroupDiscount_card_title_list().get(i), DriverManager.getDriver());
            Assert.assertTrue(Deals.getGroupDiscount_card_title_list().get(i).isDisplayed());

            highlighter.highLighterMethod(Deals.getGroupDiscount_card_description_list().get(i), DriverManager.getDriver());
            Assert.assertTrue(Deals.getGroupDiscount_card_description_list().get(i).isDisplayed());

            highlighter.highLighterMethod(Deals.getGroupDiscount_card_cta_list().get(i), DriverManager.getDriver());
            Assert.assertTrue(Deals.getGroupDiscount_card_cta_list().get(i).isDisplayed());
        }
        Logger.log("user should able to view the image");
    }

    @Then("user should able to view the title text")
    public void user_should_able_to_view_the_title_text() {
        for (int i=0; i<Deals.getGroupDiscount_card_title_list().size(); i++){
            javascriptScroll(Deals.getGroupDiscount_card_title_list().get(i));
            Assert.assertTrue(Deals.getGroupDiscount_card_title_list().get(i).isDisplayed());
        }
        Logger.log("user should able to view the title text");
    }

    @Then("user should able to view the description")
    public void user_should_able_to_view_the_description() {
        for (int i=0; i<Deals.getGroupDiscount_card_description_list().size(); i++){
            javascriptScroll(Deals.getGroupDiscount_card_description_list().get(i));
            Assert.assertTrue(Deals.getGroupDiscount_card_description_list().get(i).isDisplayed());
        }
        Logger.log("user should able to view the description");
    }

    @Then("user should able to view the {string} link")
    public void user_should_able_to_view_the_link(String string) {
        for (int i=0; i<Deals.getGroupDiscount_card_cta_list().size(); i++){
            javascriptScroll(Deals.getGroupDiscount_card_cta_list().get(i));
            Assert.assertTrue(Deals.getGroupDiscount_card_cta_list().get(i).isDisplayed());
        }
        Logger.log("user should able to view the 'Get this deal' link");
    }

    @When("user click on the Get this deal cta")
    public void user_click_on_the_get_this_deal_cta() {
        jsClick(Deals.getGroupDiscount_card_cta_list().get(1));
        Logger.log("user click on the Get this deal cta");

    }

    @Then("user should navigate to the respective internal Get this deal page")
    public void user_should_navigate_to_the_respective_internal_get_this_deal_page() {
        String groupdiscount_card_tite = Deals.getGroupDiscount_card_title_list().get(1).getText();
        String GroupDscount_card1_detailsPage_titla = Deals.getGroupDscount_card1_detailsPage_titla().getText();
        try{
            switchToTabs("1");
            Assert.assertTrue(groupdiscount_card_tite.contains(GroupDscount_card1_detailsPage_titla));
            Logger.log("user should navigate to the respective external Get this deal page in new tab");
        }catch (Exception e){

            Assert.assertTrue(groupdiscount_card_tite.contains(GroupDscount_card1_detailsPage_titla));
            Logger.log("user should navigate to the respective internal Get this deal page");
        }
    }

    @Then("user should navigate to the respective external Get this deal page in new tab")
    public void user_should_navigate_to_the_respective_external_get_this_deal_page_in_new_tab() {
        String groupdiscount_card_tite = Deals.getGroupDiscount_card_title_list().get(1).getText();
        String GroupDscount_card1_detailsPage_titla = Deals.getGroupDscount_card1_detailsPage_titla().getText();
        try{
            switchToTabs("1");
            Assert.assertTrue(groupdiscount_card_tite.contains(GroupDscount_card1_detailsPage_titla));
            Logger.log("user should navigate to the respective external Get this deal page in new tab");
        }catch (Exception e){

            Assert.assertTrue(groupdiscount_card_tite.contains(GroupDscount_card1_detailsPage_titla));
            Logger.log("user should navigate to the respective internal Get this deal page");
        }
    }



    @Then("User should be able to  view title")
    public void user_should_be_able_to_view_title() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User should be able to view the copy text at the left side\"")
    public void user_should_be_able_to_view_the_copy_text_at_the_left_side() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User is able to view the CTA")
    public void user_is_able_to_view_the_cta() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



}
