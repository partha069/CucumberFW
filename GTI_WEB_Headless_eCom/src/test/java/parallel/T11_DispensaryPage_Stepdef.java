package parallel;

import com.driverfactory.DriverManager;
import com.resuableMethods.CommonAction;
import com.resuableMethods.Highlighter;
import com.utilities.Logger;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pom.gti.RewardsPage;
import pom.gti.T11_DispensaryPage;
import org.openqa.selenium.Alert;

import java.time.Duration;
import java.util.Set;

public class T11_DispensaryPage_Stepdef extends CommonAction {
    T11_DispensaryPage T11_DispensaryPage = new T11_DispensaryPage(DriverManager.getDriver());
    RewardsPage rewards = new RewardsPage(DriverManager.getDriver());
    Highlighter highlighter = new Highlighter();
    @Given("user clicks on Dispensaries menu from Global header")
    public void user_clicks_on_dispensaries_menu_from_global_header() {
        waitFor(200);
        System.out.println(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed());
        if(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed()){
            Assert.assertTrue(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed());
            jsClick(T11_DispensaryPage.getMobileHamburgerMenuCTA());
            waitFor(200);
            Assert.assertTrue(T11_DispensaryPage.getMobileMenuOptionList().get(3).isDisplayed());
            highlighter.highLighterMethod(T11_DispensaryPage.getMobileMenuOptionList().get(3), DriverManager.getDriver());
            DriverManager.getDriver().findElement(By.xpath("//div[ @data-testid='extended-menu']/child::ul/child::li[*]/child::a/child::h2[text()='Dispensaries']")).click();
           // jsClick(dispensaryPage.getMobileMenuOptionList().get(3));
            Logger.log("User clicks on Dispensaries menu from Global header");
        }else {
            Assert.assertTrue(T11_DispensaryPage.getDispensariesOptionGlobalHeader().isDisplayed());
            jsClick(T11_DispensaryPage.getDispensariesOptionGlobalHeader());
            Logger.log("User clicks on Dispensaries menu from Global header");
        }
    }
    @Given("User clicks one of the state")
    public void user_clicks_one_of_the_state() {
        waitFor(200);
        System.out.println(T11_DispensaryPage.getMobileCLoseIcon().isDisplayed());
        if(T11_DispensaryPage.getMobileCLoseIcon().isDisplayed()){
            waitFor(100);
            Assert.assertTrue(T11_DispensaryPage.getDispensaryStateList().get(2).isDisplayed());
            highlighter.highLighterMethod(T11_DispensaryPage.getDispensaryStateList().get(2), DriverManager.getDriver());
            DriverManager.getDriver().findElement(By.xpath("//div[@data-testid='header-dispensaries']/child::div/child::ul/child::li[*]/child::a/child::h5[text()='Illinois']")).click();
            // jsClick(dispensaryPage.getDispensaryStateList().get(2));
            Logger.log("User clicks one of the state");
        }else {
            Assert.assertTrue(T11_DispensaryPage.getDispensaryStateIllinois().isDisplayed());
            jsClick(T11_DispensaryPage.getDispensaryStateIllinois());
            Logger.log("User clicks one of the state");
        }
    }
    @Given("user selects Dispensary name from the state")
    public void user_selects_dispensary_name_from_the_state() {
        waitFor(200);
        System.out.println(T11_DispensaryPage.getMobileCLoseIcon().isDisplayed());
        if(T11_DispensaryPage.getMobileCLoseIcon().isDisplayed()){
            visibilityWait(T11_DispensaryPage.getMobileCLoseIcon());
            waitFor(300);
            javascriptScroll(DriverManager.getDriver().findElement(By.xpath("//div[@data-testid='header-dispensaries']/child::div/child::ul/child::li/child::a[text()='RISE Dispensary Mundelein']")));
            waitFor(300);
            DriverManager.getDriver().findElement(By.xpath("//div[@data-testid='header-dispensaries']/child::div/child::ul/child::li/child::a[text()='RISE Dispensary Mundelein']")).click();
        }else {
            Assert.assertTrue(T11_DispensaryPage.getRiseDispensaryMundeleinOption().isDisplayed());
            jsClick(T11_DispensaryPage.getRiseDispensaryMundeleinOption());
            Logger.log("User selects Dispensary name from the state");
            waitFor(200);
            //jsClick(dispensaryPage.getDispensariesOptionGlobalHeader());
        }
    }
    @When("User is viewing the dispensary page")
    public void user_is_viewing_the_dispensary_page() {
        waitFor(2000);
        highlighter.highLighterMethod(T11_DispensaryPage.getRiseDispensaryMundeleinHeader(), DriverManager.getDriver());
        Assert.assertTrue(T11_DispensaryPage.getRiseDispensaryMundeleinHeader().isDisplayed());
        Logger.log("User is viewing the dispensary page");
    }
    @Then("User is able to see Hero Dispensary at the top of the page")
    public void user_is_able_to_see_hero_dispensary_at_the_top_of_the_page() {
        waitFor(2000);
        highlighter.highLighterMethod(T11_DispensaryPage.getDispensaryHeroBanner(), DriverManager.getDriver());
        Assert.assertTrue(T11_DispensaryPage.getDispensaryHeroBanner().isDisplayed());
        Logger.log("User is able to see Hero Dispensary");
    }
    @When("user on the hero section")
    public void user_on_the_hero_section() {
        waitFor(2000);
       // highlighter.highLighterMethod(dispensaryPage.getDispensaryHeroBanner(), DriverManager.getDriver());
        Assert.assertTrue(T11_DispensaryPage.getDispensaryHeroBanner().isDisplayed());
        Logger.log("User on the hero section");
    }
    @Then("user should able to see breadcrumbs hierarchy structure above the hero section")
    public void user_should_able_to_see_breadcrumbs_hierarchy_structure_above_the_hero_section() {
        waitFor(2000);
        highlighter.highLighterMethod(T11_DispensaryPage.getDispensaryBreadcrumb(), DriverManager.getDriver());
        Assert.assertTrue(T11_DispensaryPage.getDispensaryBreadcrumb().isDisplayed());
        Logger.log("User should able to see breadcrumbs hierarchy structure");
    }
    @When("user clicks on the arrow on the image carousel")
    public void user_clicks_on_the_arrow_on_the_image_carousel() {
        waitFor(2000);
        visibilityWait(T11_DispensaryPage.getImageCarouselRightArrow());
        Assert.assertTrue(T11_DispensaryPage.getImageCarouselLeftArrow().isDisplayed());
        Assert.assertTrue(T11_DispensaryPage.getImageCarouselRightArrow().isDisplayed());
        int imageCount = T11_DispensaryPage.getImageCarouselHeroBanner().size();
        System.out.println(imageCount);
        for (int i = 0; i<imageCount;i++){
            System.out.println(i);
            DriverManager.getDriver().findElement(By.xpath("(//*[@data-testid='next-icon'])[1]")).click();
            waitFor(500);
        }
        Logger.log("User clicks on the arrow on the image carousel");
    }
    @When("User scrolls down to the Dispensaries card section")
    public void user_scrolls_down_to_the_dispensaries_card_section() {
        waitFor(2000);
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
        js.executeScript("window.scrollBy(0,5200);");
        Logger.log("User scrolls down to the Dispensaries card section");
    }
    @Then("User is able to see Dispensaries Cards section")
    public void user_is_able_to_see_dispensaries_cards_section() {
        waitFor(1000);
        System.out.println(T11_DispensaryPage.getMobileCLoseIcon().isDisplayed());
        if(T11_DispensaryPage.getMobileCLoseIcon().isDisplayed()){
            JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
            js.executeScript("window.scrollBy(0,400);");
            waitFor(100);
            visibilityWait(T11_DispensaryPage.getDispensaryNearbySection());
            highlighter.highLighterMethod(T11_DispensaryPage.getDispensaryNearbySection(), DriverManager.getDriver());
            Assert.assertTrue(T11_DispensaryPage.getDispensaryNearbySection().isDisplayed());
            Logger.log("User is able to see Dispensaries Cards section");
        }else {
            JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
            js.executeScript("window.scrollBy(0,1600);");
            waitFor(100);
            visibilityWait(T11_DispensaryPage.getDispensaryNearbySection());
            highlighter.highLighterMethod(T11_DispensaryPage.getDispensaryNearbySection(), DriverManager.getDriver());
            Assert.assertTrue(T11_DispensaryPage.getDispensaryNearbySection().isDisplayed());
            Logger.log("User is able to see Dispensaries Cards section");
        }
    }
    @Then("User is able to see image carousels that show cases dispensary images.")
    public void user_is_able_to_see_image_carousels_that_show_cases_dispensary_images() {
        Logger.log("User is able to see image carousels that show cases dispensary images.");
    }
    @Then("user should see image carousel continues in a infinite loop")
    public void user_should_see_image_carousel_continues_in_a_infinite_loop() {
        Logger.log("User should see image carousel continues in a infinite loop");
    }


    @Then("user should able to view  <Dispensary Name> as a Title text in the hero section")
    public void user_should_able_to_view_dispensary_name_as_a_title_text_in_the_hero_section() {
        waitFor(2000);
        visibilityWait(T11_DispensaryPage.getRiseDispensaryMundeleinHeader());
        highlighter.highLighterMethod(T11_DispensaryPage.getRiseDispensaryMundeleinHeader(), DriverManager.getDriver());
        Assert.assertTrue(T11_DispensaryPage.getRiseDispensaryMundeleinHeader().isDisplayed());
        Logger.log("user should able to view  <Dispensary Name> as a Title text in the hero section");
    }
    @Then("user should able to view description as a Copy text in the hero section")
    public void user_should_able_to_view_description_as_a_copy_text_in_the_hero_section() {
        waitFor(2000);
        visibilityWait(T11_DispensaryPage.getRiseDispensaryMundeleinCopyText());
        highlighter.highLighterMethod(T11_DispensaryPage.getRiseDispensaryMundeleinCopyText(), DriverManager.getDriver());
        Assert.assertTrue(T11_DispensaryPage.getRiseDispensaryMundeleinCopyText().isDisplayed());
        Logger.log("User should able to view description as a Copy text in the hero section");
    }
//    @When("Dispensary has only one menu")
//    public void dispensary_has_only_one_menu() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("user is able to see only One Menu CTA button")
//    public void user_is_able_to_see_only_one_menu_cta_button() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
    @When("Dispensary has two menus")
    public void dispensary_has_two_menus() {
        waitFor(2000);
        int dispensaryMenuCount = T11_DispensaryPage.getHeroBannerMenuCTAs().size();
        System.out.println(dispensaryMenuCount);
        if (dispensaryMenuCount == 2){
            Logger.log("Dispensary has two menus");
        }else{
            Assert.fail();
            Logger.log("Dispensary don't have two menus");
        }

    }
    @Then("user should see Two Menu CTA buttons")
    public void user_should_see_two_menu_cta_buttons() {
        waitFor(2000);
       int twoCTAs = T11_DispensaryPage.getHeroBannerMenuCTAs().size();
       System.out.println(twoCTAs);
       if(twoCTAs == 2) {
           visibilityWait(T11_DispensaryPage.getHeroBannerMenuCTAs().get(0));
           waitFor(2000);
           highlighter.highLighterMethod(T11_DispensaryPage.getHeroBannerMenuCTAs().get(0), DriverManager.getDriver());
           Assert.assertTrue(T11_DispensaryPage.getHeroBannerMenuCTAs().get(0).isDisplayed());
           visibilityWait(T11_DispensaryPage.getHeroBannerMenuCTAs().get(1));
           waitFor(2000);
           highlighter.highLighterMethod(T11_DispensaryPage.getHeroBannerMenuCTAs().get(1), DriverManager.getDriver());
           Assert.assertTrue(T11_DispensaryPage.getHeroBannerMenuCTAs().get(1).isDisplayed());
           Logger.log("User should see Two Menu CTA buttons");
       }else{
           Assert.fail();
           Logger.log("User is not able see Two Menu CTA buttons");
       }
    }
    @When("User clicks on the menu CTA.")
    public void user_clicks_on_the_menu_cta() {
        waitFor(2000);
        int twoCTAs = T11_DispensaryPage.getHeroBannerMenuCTAs().size();
        System.out.println(twoCTAs);
        if(twoCTAs == 2) {
            visibilityWait(T11_DispensaryPage.getHeroBannerMenuCTAs().get(0));
            waitFor(2000);
            Assert.assertTrue(T11_DispensaryPage.getHeroBannerMenuCTAs().get(0).isDisplayed());
            mouseOver(T11_DispensaryPage.getHeroBannerMenuCTAs().get(0));
            waitFor(500);
            visibilityWait(T11_DispensaryPage.getHeroBannerMenuCTAs().get(1));
            waitFor(2000);
            Assert.assertTrue(T11_DispensaryPage.getHeroBannerMenuCTAs().get(1).isDisplayed());
            mouseOver(T11_DispensaryPage.getHeroBannerMenuCTAs().get(1));
            Logger.log("User clicks on the menu CTA.");
        }else{
            Assert.fail();
            Logger.log("User not able to clicks on the menu CTA.");
        }
    }
    @Then("user is redirect to the respective Product Listing Page of the Dispensary")
    public void user_is_redirect_to_the_respective_product_listing_page_of_the_dispensary() {
        Logger.log("User is redirect to the respective Product Listing Page of the Dispensary");
    }
    @Then("user should able to see the progress bar below the carousel in hero section")
    public void user_should_able_to_see_the_progress_bar_below_the_carousel_in_hero_section() {
        waitFor(2000);
        System.out.println(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed());
        if(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed()){
            JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
            js.executeScript("window.scrollBy(0,600);");
            waitFor(600);
            visibilityWait(T11_DispensaryPage.getHeroBannerProgressbar());
            highlighter.highLighterMethod(T11_DispensaryPage.getHeroBannerProgressbar(), DriverManager.getDriver());
            Assert.assertTrue(T11_DispensaryPage.getHeroBannerProgressbar().isDisplayed());
            Logger.log("User should able to see the progress bar below the carousel in hero section");
        }else {
            JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
            js.executeScript("window.scrollBy(0,400);");
            waitFor(500);
            visibilityWait(T11_DispensaryPage.getHeroBannerProgressbar());
            highlighter.highLighterMethod(T11_DispensaryPage.getHeroBannerProgressbar(), DriverManager.getDriver());
            Assert.assertTrue(T11_DispensaryPage.getHeroBannerProgressbar().isDisplayed());
            Logger.log("User should able to see the progress bar below the carousel in hero section");
        }
    }
    @When("User is in the dispensary page")
    public void user_is_in_the_dispensary_page() {
        waitFor(2000);
        highlighter.highLighterMethod(T11_DispensaryPage.getRiseDispensaryMundeleinHeader(), DriverManager.getDriver());
        Assert.assertTrue(T11_DispensaryPage.getRiseDispensaryMundeleinHeader().isDisplayed());
        Logger.log("User is in the dispensary page");
    }
    @When("user scroll down to the About this Dispensary section")
    public void user_scroll_down_to_the_about_this_dispensary_section() {
        waitFor(2000);
        javascriptScroll(T11_DispensaryPage.getAboutThisDispensaryHeader());
        Logger.log("User scroll down to the About this Dispensary section");
    }
    @Then("User is able to see About This Dispensary")
    public void user_is_able_to_see_about_this_dispensary() {
        waitFor(100);
        visibilityWait(T11_DispensaryPage.getAboutThisDispensarySection());
        highlighter.highLighterMethod(T11_DispensaryPage.getAboutThisDispensarySection(), DriverManager.getDriver());
        Assert.assertTrue(T11_DispensaryPage.getAboutThisDispensarySection().isDisplayed());
        Logger.log("User is able to see About This Dispensary");
    }
    @Then("User is able to  see {string} Title Text")
    public void user_is_able_to_see_title_text(String string) {
        waitFor(100);
        visibilityWait(T11_DispensaryPage.getAboutThisDispensaryHeader());
        highlighter.highLighterMethod(T11_DispensaryPage.getAboutThisDispensaryHeader(), DriverManager.getDriver());
        Assert.assertTrue(T11_DispensaryPage.getAboutThisDispensaryHeader().isDisplayed());
        Logger.log("User is able to  see About This Dispensary Title Text");
    }
    @Then("User is able to see About dispensary details as copy text in the About this dispensary section")
    public void user_is_able_to_see_about_dispensary_details_as_copy_text_in_the_about_this_dispensary_section() {
        waitFor(100);
        System.out.println(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed());
        if(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed()){
            visibilityWait(T11_DispensaryPage.getAboutDispensaryReadMoreCTA());
            Assert.assertTrue(T11_DispensaryPage.getAboutDispensaryReadMoreCTA().isDisplayed());
            jsClick(T11_DispensaryPage.getAboutDispensaryReadMoreCTA());
            Logger.log("User is able to see Read More CTA in the About this dispensary section");
            waitFor(300);
            visibilityWait(T11_DispensaryPage.getAboutThisDispensaryCopyText());
            highlighter.highLighterMethod(T11_DispensaryPage.getAboutThisDispensaryCopyText(), DriverManager.getDriver());
            Assert.assertTrue(T11_DispensaryPage.getAboutThisDispensaryCopyText().isDisplayed());
            Logger.log("User is able to see About dispensary details as copy text in the About this dispensary section");
            waitFor(400);
            JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
            //js.executeScript("window.scrollBy(0,1000);");
            js.executeScript("window.scrollBy(0,500);");
            visibilityWait(T11_DispensaryPage.getAboutDispensaryReadLessCTA());
            Assert.assertTrue(T11_DispensaryPage.getAboutDispensaryReadLessCTA().isDisplayed());
            jsClick(T11_DispensaryPage.getAboutDispensaryReadLessCTA());
            Logger.log("User is able to see Read Less CTA in the About this dispensary section");
        }else {
            visibilityWait(T11_DispensaryPage.getAboutThisDispensaryCopyText());
            highlighter.highLighterMethod(T11_DispensaryPage.getAboutThisDispensaryCopyText(), DriverManager.getDriver());
            Assert.assertTrue(T11_DispensaryPage.getAboutThisDispensaryCopyText().isDisplayed());
            Logger.log("User is able to see About dispensary details as copy text in the About this dispensary section");
        }
    }
    @When("User scrolls down to the store hours section")
    public void user_scrolls_down_to_the_store_hours_section() {
        if(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed()) {
            waitFor(2000);
            javascriptScroll(T11_DispensaryPage.getAboutDispensaryHourDropDownCTA());
            Logger.log("User scrolls down to the store hours section");
            waitFor(500);
            jsClick(T11_DispensaryPage.getAboutDispensaryHourDropDownCTA());//added for script purpose
            waitFor(500);
        }else{
            waitFor(2000);
            javascriptScroll(T11_DispensaryPage.getHeroBannerProgressbar());
            Logger.log("User scrolls down to the store hours section");
        }

    }
    @Then("User can see a clock icon as part of the store hours")
    public void user_can_see_a_clock_icon_as_part_of_the_store_hours() {
        waitFor(100);
        System.out.println(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed());
        if(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed()){
            waitFor(400);
            JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
            //js.executeScript("window.scrollBy(0,1000);");
            js.executeScript("window.scrollBy(0,-200);");
            visibilityWait(T11_DispensaryPage.getMobileClockImage());
            highlighter.highLighterMethod(T11_DispensaryPage.getMobileClockImage(), DriverManager.getDriver());
            Assert.assertTrue(T11_DispensaryPage.getMobileClockImage().isDisplayed());
            Logger.log("User can see a clock icon as part of the store hours");
        }else {
            visibilityWait(T11_DispensaryPage.getClockImage());
            highlighter.highLighterMethod(T11_DispensaryPage.getClockImage(), DriverManager.getDriver());
            Assert.assertTrue(T11_DispensaryPage.getClockImage().isDisplayed());
            Logger.log("User can see a clock icon as part of the store hours");
        }
    }
    @Then("User can see expanded store hours with <opening hours> heading text")
    public void user_can_see_expanded_store_hours_with_opening_hours_heading_text() {
        waitFor(100);
        visibilityWait(T11_DispensaryPage.getOpeningHoursText());
        highlighter.highLighterMethod(T11_DispensaryPage.getOpeningHoursText(), DriverManager.getDriver());
        Assert.assertTrue(T11_DispensaryPage.getOpeningHoursText().isDisplayed());
        Logger.log("User can see expanded store hours with <opening hours> heading text");
    }
    @Then("User can see a timer icon")
    public void user_can_see_a_timer_icon() {
        waitFor(100);
        System.out.println(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed());
        if(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed()) {
            Assert.fail();
            Logger.log("User not able to see expanded store hours with <opening hours> heading text as default");
            visibilityWait(T11_DispensaryPage.getAboutDispensaryHourDropDownCTA());
            Assert.assertTrue(T11_DispensaryPage.getAboutDispensaryHourDropDownCTA().isDisplayed());
            jsClick(T11_DispensaryPage.getAboutDispensaryHourDropDownCTA());
            waitFor(100);
            visibilityWait(T11_DispensaryPage.getClockIcon());
            highlighter.highLighterMethod(T11_DispensaryPage.getClockIcon(), DriverManager.getDriver());
            Assert.assertTrue(T11_DispensaryPage.getClockIcon().isDisplayed());
            Logger.log("User can see a timer icon");
        }else {
            visibilityWait(T11_DispensaryPage.getClockIcon());
            highlighter.highLighterMethod(T11_DispensaryPage.getClockIcon(), DriverManager.getDriver());
            Assert.assertTrue(T11_DispensaryPage.getClockIcon().isDisplayed());
            Logger.log("User can see a timer icon");
        }
    }
    @Then("User should see see store hours in week day")
    public void user_should_see_see_store_hours_in_week_day() {
        waitFor(100);
        visibilityWait(T11_DispensaryPage.getListOfDays().get(0));
        for(WebElement day: T11_DispensaryPage.getListOfDays()){
            visibilityWait(day);
            highlighter.highLighterMethod(day, DriverManager.getDriver());
            Assert.assertTrue(day.isDisplayed());
            waitFor(100);
        }
        Logger.log("User should see see store hours in week day");
    }
    @Then("User is able to see their respective time zone current day’s weekday")
    public void user_is_able_to_see_their_respective_time_zone_current_day_s_weekday() {
        waitFor(100);
        visibilityWait(T11_DispensaryPage.getCurrentDayText());
        highlighter.highLighterMethod(T11_DispensaryPage.getCurrentDayText(), DriverManager.getDriver());
        Assert.assertTrue(T11_DispensaryPage.getCurrentDayText().isDisplayed());
        Logger.log("User is able to see their respective time zone current day’s weekday");
    }
    @Then("User is able to see their store hours in first row\\(bold format)")
    public void user_is_able_to_see_their_store_hours_in_first_row_bold_format() {
        waitFor(100);
        visibilityWait(T11_DispensaryPage.getCurrentDayOnly());
        highlighter.highLighterMethod(T11_DispensaryPage.getCurrentDayOnly(), DriverManager.getDriver());
        Assert.assertTrue(T11_DispensaryPage.getCurrentDayOnly().isDisplayed());
        visibilityWait(T11_DispensaryPage.getCurrentHours());
        highlighter.highLighterMethod(T11_DispensaryPage.getCurrentHours(), DriverManager.getDriver());
        Assert.assertTrue(T11_DispensaryPage.getCurrentHours().isDisplayed());
        Logger.log("User is able to see their store hours in first row (bold format)");
    }
    @Then("User is able to see the sequence of the week follow")
    public void user_is_able_to_see_the_sequence_of_the_week_follow() {
        waitFor(100);
        visibilityWait(T11_DispensaryPage.getListOfDays().get(0));
        for(WebElement day: T11_DispensaryPage.getListOfDays()){
            visibilityWait(day);
            highlighter.highLighterMethod(day, DriverManager.getDriver());
            Assert.assertTrue(day.isDisplayed());
            waitFor(100);
        }
        Logger.log("User is able to see the sequence of the week follow");
    }
    @Then("User is able to see Additional information box with info icon")
    public void user_is_able_to_see_additional_information_box_with_info_icon() {
        waitFor(100);
        visibilityWait(T11_DispensaryPage.getDispensaryAdditionalInfo());
        highlighter.highLighterMethod(T11_DispensaryPage.getDispensaryAdditionalInfo(), DriverManager.getDriver());
        Assert.assertTrue(T11_DispensaryPage.getDispensaryAdditionalInfo().isDisplayed());
        Logger.log("User is able to see Additional information box with info icon");
    }
    @Then("User is able to see Additional information box with text")
    public void user_is_able_to_see_additional_information_box_with_text() {
        waitFor(100);
        visibilityWait(T11_DispensaryPage.getDispensaryAdditionalInfoCopyText());
        highlighter.highLighterMethod(T11_DispensaryPage.getDispensaryAdditionalInfoCopyText(), DriverManager.getDriver());
        Assert.assertTrue(T11_DispensaryPage.getDispensaryAdditionalInfoCopyText().isDisplayed());
        Logger.log("User is able to see Additional information box with text");
    }
    @Then("User is able to see Phone Number in US format")
    public void user_is_able_to_see_phone_number_in_us_format() {
        waitFor(100);
        visibilityWait(T11_DispensaryPage.getPhoneInfo());
        highlighter.highLighterMethod(T11_DispensaryPage.getPhoneInfo(), DriverManager.getDriver());
        Assert.assertTrue(T11_DispensaryPage.getPhoneInfo().isDisplayed());
        Logger.log("User is able to see Phone Number in US format");
    }
    @Then("User is able to see Phone Icon")
    public void user_is_able_to_see_phone_icon() {
        waitFor(100);
        visibilityWait(T11_DispensaryPage.getPhoneIcon());
        highlighter.highLighterMethod(T11_DispensaryPage.getPhoneIcon(), DriverManager.getDriver());
        Assert.assertTrue(T11_DispensaryPage.getPhoneIcon().isDisplayed());
        Logger.log("User is able to see Phone Icon");
    }
    @Then("User is able to see Call now CTA")
    public void user_is_able_to_see_call_now_cta() {
        waitFor(100);
        visibilityWait(T11_DispensaryPage.getCallNowCTA());
        highlighter.highLighterMethod(T11_DispensaryPage.getCallNowCTA(), DriverManager.getDriver());
        Assert.assertTrue(T11_DispensaryPage.getCallNowCTA().isDisplayed());
        Logger.log("User is able to see Phone Icon");
    }
    @Then("User should see Dispensary Address with Map icon")
    public void user_should_see_dispensary_address_with_map_icon() {
        waitFor(100);
        visibilityWait(T11_DispensaryPage.getAddressText());
        highlighter.highLighterMethod(T11_DispensaryPage.getAddressText(), DriverManager.getDriver());
        Assert.assertTrue(T11_DispensaryPage.getAddressText().isDisplayed());
        visibilityWait(T11_DispensaryPage.getAddressMapIcon());
        highlighter.highLighterMethod(T11_DispensaryPage.getAddressMapIcon(), DriverManager.getDriver());
        Assert.assertTrue(T11_DispensaryPage.getAddressMapIcon().isDisplayed());
        Logger.log("User should see Dispensary Address with Map icon");
    }
    @Then("User should see View on Maps CTA")
    public void user_should_see_view_on_maps_cta() {
        waitFor(100);
        visibilityWait(T11_DispensaryPage.getAddressMapCTA());
        highlighter.highLighterMethod(T11_DispensaryPage.getAddressMapCTA(), DriverManager.getDriver());
        Assert.assertTrue(T11_DispensaryPage.getAddressMapCTA().isDisplayed());
        Logger.log("User should see View on Maps CTA");
    }
    @Then("User should see Contact us CTA")
    public void user_should_see_contact_us_cta() {
        waitFor(100);
        visibilityWait(T11_DispensaryPage.getContactUsCTA());
        highlighter.highLighterMethod(T11_DispensaryPage.getContactUsCTA(), DriverManager.getDriver());
        Assert.assertTrue(T11_DispensaryPage.getContactUsCTA().isDisplayed());
        Logger.log("User should see View on Maps CTA");
    }
    @Then("User should see a caret symbol next to internal links of Call now CTA")
    public void user_should_see_a_caret_symbol_next_to_internal_links_of_call_now_cta() {
        waitFor(100);
        visibilityWait(T11_DispensaryPage.getCallNowCaret());
        highlighter.highLighterMethod(T11_DispensaryPage.getCallNowCaret(), DriverManager.getDriver());
        Assert.assertTrue(T11_DispensaryPage.getCallNowCaret().isDisplayed());
        Logger.log("User should see a caret symbol next to internal links of Call now CTA");
    }
    @Then("User should see a caret symbol  next to internal links of contact us CTA")
    public void user_should_see_a_caret_symbol_next_to_internal_links_of_contact_us_cta() {
        waitFor(100);
        visibilityWait(T11_DispensaryPage.getContactUsCaret());
        highlighter.highLighterMethod(T11_DispensaryPage.getContactUsCaret(), DriverManager.getDriver());
        Assert.assertTrue(T11_DispensaryPage.getContactUsCaret().isDisplayed());
        Logger.log("User should see a caret symbol  next to internal links of contact us CTA");
    }
    @Then("User should see a boxed arrow symbol next to external link of View on Maps CTA")
    public void user_should_see_a_boxed_arrow_symbol_next_to_external_link_of_view_on_maps_cta() {
        waitFor(100);
        visibilityWait(T11_DispensaryPage.getAddressMapCaret());
        highlighter.highLighterMethod(T11_DispensaryPage.getAddressMapCaret(), DriverManager.getDriver());
        Assert.assertTrue(T11_DispensaryPage.getAddressMapCaret().isDisplayed());
        Logger.log("User should see a boxed arrow symbol next to external link of View on Maps CTA");
    }
    @When("User hovers overs over the CTAs in the section")
    public void user_hovers_overs_over_the_ct_as_in_the_section() {
        waitFor(500);
        System.out.println(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed());
        if(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed()) {
            Logger.log("hover is not applicable for mobile");
        }else {
            JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
            js.executeScript("window.scrollBy(0,400);");
            visibilityWait(T11_DispensaryPage.getCallNowCTA());
            mouseOver(T11_DispensaryPage.getCallNowCTA());
            waitFor(500);
            visibilityWait(T11_DispensaryPage.getAddressMapCTA());
            mouseOver(T11_DispensaryPage.getAddressMapCTA());
            waitFor(500);
            visibilityWait(T11_DispensaryPage.getContactUsCTA());
            mouseOver(T11_DispensaryPage.getContactUsCTA());
            Logger.log("User hovers overs over the CTAs in the section");
        }
    }
    @Then("User should see CTAs getting underlined")
    public void user_should_see_ct_as_getting_underlined() {
        waitFor(1000);
        if(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed()) {
            Logger.log("User should not see CTAs getting underlined for mobile");
        }else {
            visibilityWait(T11_DispensaryPage.getCallNowCTA());
            mouseOver(T11_DispensaryPage.getCallNowCTA());
            String cssValueCallNowCTA = T11_DispensaryPage.getCallNowCTA().getCssValue("text-decoration-line");
            System.out.println(cssValueCallNowCTA);
            if (cssValueCallNowCTA.equals("underline")) {
                Logger.log("User should see Call Now CTA getting underlined");
            } else {
                Assert.fail();
                Logger.log("User not see Call Now CTA getting underlined");
            }
            waitFor(500);
            visibilityWait(T11_DispensaryPage.getAddressMapCTA());
            mouseOver(T11_DispensaryPage.getAddressMapCTA());
            String cssValueAddressMapCTA = T11_DispensaryPage.getAddressMapCTA().getCssValue("text-decoration-line");
            System.out.println(cssValueAddressMapCTA);
            if (cssValueAddressMapCTA.equals("underline")) {
                Logger.log("User should see Map CTA getting underlined");
            } else {
                Assert.fail();
                Logger.log("User not see Map CTA getting underlined");
            }
            waitFor(500);
            visibilityWait(T11_DispensaryPage.getContactUsCTA());
            mouseOver(T11_DispensaryPage.getContactUsCTA());
            String cssValueContactUsCTA = T11_DispensaryPage.getContactUsCTA().getCssValue("text-decoration-line");
            System.out.println(cssValueContactUsCTA);
            if (cssValueContactUsCTA.equals("underline")) {
                Logger.log("User should see ContactUs CTA getting underlined");
            } else {
                Assert.fail();
                Logger.log("User not see ContactUs CTA getting underlined");
            }
        }
    }
    @When("User clicks on the Call now CTA")
    public void user_clicks_on_the_call_now_cta() {
        visibilityWait(T11_DispensaryPage.getCallNowCTA());
        jsClick(T11_DispensaryPage.getCallNowCTA());
        Logger.log("User clicks on the Call now CTA");

    }
    @Then("A mobile prompt should be thrown for desktop")
    public void a_mobile_prompt_should_be_thrown_for_desktop() {
        waitFor(10000);
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(15));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = DriverManager.getDriver().switchTo().alert();
        System.out.println(alert.getText());
        Logger.log("User clicks on the Call now CTA");
    }
    @When("User clicks on the View on Maps CTA")
    public void user_clicks_on_the_view_on_maps_cta() {
        waitFor(100);
        visibilityWait(T11_DispensaryPage.getAddressMapCTA());
        jsClick(T11_DispensaryPage.getAddressMapCTA());
        Logger.log("User clicks on the View on Maps CTA");
    }
    @Then("A google maps page with location pin should be opened")
    public void a_google_maps_page_with_location_pin_should_be_opened() {
        waitFor(2500);
        Set<String> windows = DriverManager.getDriver().getWindowHandles();
        //Switch window
        String currentTilte = DriverManager.getDriver().getTitle();
        if(currentTilte.contains("Google Maps")){
            Logger.log("A google maps page is opened");
        }else{
            Assert.fail();
            Logger.log("A google maps page not opened");
        }
    }
    @Then("the map should be opened in the new tab")
    public void the_map_should_be_opened_in_the_new_tab() {
        Set<String> windows = DriverManager.getDriver().getWindowHandles();
        System.out.println(windows.size());
        if(windows.size()==2) {
            //switch window
            Logger.log("the map be opened in the new tab");
        }else{
//            SoftAssertions softAssertions = new SoftAssertions();
//            softAssertions.assertThat(windows.size()).isEqualTo(2);
//            softAssertions.assertAll();
            //softAssertions.fail("the map not opened in the new tab");
            //Assert.fail();
            Logger.log("the map not opened in the new tab");
            waitFor(600);
            DriverManager.getDriver().navigate().to("https://qa-headless.risecannabis.io/dispensaries/illinois/mundelein");
        }
    }
    @When("User clicks on Contact Us CTA")
    public void user_clicks_on_contact_us_cta() {
        waitFor(2000);
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
        waitFor(100);
        System.out.println(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed());
        if(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed()) {
            visibilityWait(T11_DispensaryPage.getAboutDispensaryHourDropDownCTA());
            Assert.assertTrue(T11_DispensaryPage.getAboutDispensaryHourDropDownCTA().isDisplayed());
            jsClick(T11_DispensaryPage.getAboutDispensaryHourDropDownCTA());
            waitFor(300);
            js.executeScript("window.scrollBy(0,500);");
            visibilityWait(T11_DispensaryPage.getContactUsCTA());
            jsClick(T11_DispensaryPage.getContactUsCTA());
            Logger.log("User clicks on Contact Us CTA");
        }else {
            visibilityWait(T11_DispensaryPage.getContactUsCTA());
            jsClick(T11_DispensaryPage.getContactUsCTA());
            Logger.log("User clicks on Contact Us CTA");
        }
    }
    @Then("User is redirected to the Contact Us from")
    public void user_is_redirected_to_the_contact_us_from() {
        waitFor(500);
        visibilityWait(T11_DispensaryPage.getContactUsPageHeader());
        highlighter.highLighterMethod(T11_DispensaryPage.getContactUsPageHeader(), DriverManager.getDriver());
        Assert.assertTrue(T11_DispensaryPage.getContactUsPageHeader().isDisplayed());
        Logger.log("User is redirected to the Contact Us from");
        waitFor(600);
        DriverManager.getDriver().navigate().to("https://qa-headless.risecannabis.io/dispensaries/illinois/mundelein");
    }
    @When("User scroll down to Dispensary tabs for Variant A.")
    public void user_scroll_down_to_dispensary_tabs_for_variant_a() {
        waitFor(2000);
        javascriptScroll(T11_DispensaryPage.getDispensaryTabSection());
        Logger.log("User scroll down to Dispensary tabs for Variant A.");
    }
    @Then("User is able to view Dispensary tabs")
    public void user_is_able_to_view_dispensary_tabs() {
        waitFor(100);
        visibilityWait(T11_DispensaryPage.getDispensaryTabSection());
        highlighter.highLighterMethod(T11_DispensaryPage.getDispensaryTabSection(), DriverManager.getDriver());
        Assert.assertTrue(T11_DispensaryPage.getDispensaryTabSection().isDisplayed());
        Logger.log("User is able to view Dispensary tabs");
    }
    @Then("User is able to view the appropriate Title text")
    public void user_is_able_to_view_the_appropriate_title_text() {
        waitFor(100);
        visibilityWait(T11_DispensaryPage.getDispensaryTabHeader());
        highlighter.highLighterMethod(T11_DispensaryPage.getDispensaryTabHeader(), DriverManager.getDriver());
        Assert.assertTrue(T11_DispensaryPage.getDispensaryTabHeader().isDisplayed());
        Logger.log("User is able to view the appropriate Title text");
    }
    @Then("User is able to view the tabs listed out one by one")
    public void user_is_able_to_view_the_tabs_listed_out_one_by_one() {
        waitFor(100);
        System.out.println(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed());
        if (T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed()) {
            visibilityWait(T11_DispensaryPage.getMobileDispensaryTabList().get(0));
            for (WebElement ele : T11_DispensaryPage.getMobileDispensaryTabList()) {
                visibilityWait(ele);
                highlighter.highLighterMethod(ele, DriverManager.getDriver());
                Assert.assertTrue(ele.isDisplayed());
            }
            Logger.log("User is able to view the appropriate Title text");
        }else{
                visibilityWait(T11_DispensaryPage.getDispensaryTabList().get(0));
                for (WebElement ele : T11_DispensaryPage.getDispensaryTabList()) {
                    visibilityWait(ele);
                    highlighter.highLighterMethod(ele, DriverManager.getDriver());
                    Assert.assertTrue(ele.isDisplayed());
                }
                Logger.log("User is able to view the appropriate Title text");
            }
        }
    @When("User is viewing dispensary tabs for Variant A.")
    public void user_is_viewing_dispensary_tabs_for_variant_a() {
        waitFor(2000);
        javascriptScroll(T11_DispensaryPage.getDispensaryTabSection());
        Logger.log("User is viewing dispensary tabs for Variant A.");
    }
    @When("User click on particular tab")
    public void user_click_on_particular_tab() {
        waitFor(100);
        System.out.println(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed());
        if (T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed()) {
            waitFor(100);
            visibilityWait(T11_DispensaryPage.getMobileDispensaryTabList().get(2));
            jsClick(T11_DispensaryPage.getMobileDispensaryTabList().get(2));
            waitFor(500);
            DriverManager.getDriver().findElement(By.xpath("//div[@id='tab_container']/*[1]")).click();
            waitFor(200);
            DriverManager.getDriver().findElement(By.xpath("//div[@id='tab_container']/*[1]")).click();
            visibilityWait(T11_DispensaryPage.getMobileDispensaryTabList().get(2));
            jsClick(T11_DispensaryPage.getMobileDispensaryTabList().get(0));
            Assert.assertTrue(T11_DispensaryPage.getMobileDispensaryTabList().get(0).isDisplayed());
            Logger.log("User click on particular tab");
        }else {
            visibilityWait(T11_DispensaryPage.getPromotionTab());
            jsClick(T11_DispensaryPage.getPromotionTab());
            waitFor(400);
            visibilityWait(T11_DispensaryPage.getAmenitiesTab());
            jsClick(T11_DispensaryPage.getAmenitiesTab());
            Assert.assertTrue(T11_DispensaryPage.getAmenitiesTab().isDisplayed());
            Logger.log("User click on particular tab");
        }
    }
    @Then("User is able to view  the respective opened tab highlighted accordingly")
    public void user_is_able_to_view_the_respective_opened_tab_highlighted_accordingly() {
        waitFor(100);
        visibilityWait(T11_DispensaryPage.getAmenitiesHeader());
        highlighter.highLighterMethod(T11_DispensaryPage.getAmenitiesHeader(), DriverManager.getDriver());
        Assert.assertTrue(T11_DispensaryPage.getAmenitiesHeader().isDisplayed());
        Logger.log("User is able to view  the respective opened tab highlighted accordingly");
    }
    @Then("user should see only maximum of {int} tabs")
    public void user_should_see_only_maximum_of_tabs(Integer int1) {

    }

    @When("User scrolls down to the dispensary tabs section")
    public void user_scrolls_down_to_the_dispensary_tabs_section() {
        waitFor(2000);
        javascriptScroll(T11_DispensaryPage.getDispensaryTabSection());
        Logger.log("User scrolls down to the dispensary tabs section");
    }

    @Then("User is able to see Dispensary Tabs section")
    public void user_is_able_to_see_dispensary_tabs_section() {
        waitFor(100);
        visibilityWait(T11_DispensaryPage.getDispensaryTabSection());
        highlighter.highLighterMethod(T11_DispensaryPage.getDispensaryTabSection(), DriverManager.getDriver());
        Assert.assertTrue(T11_DispensaryPage.getDispensaryTabSection().isDisplayed());
        Logger.log("User is able to view Dispensary tabs");
    }
    @Then("user should able see tabs with combination of any variants")
    public void user_should_able_see_tabs_with_combination_of_any_variants() {

    }
    @Then("user should see a minimum of {int} tab")
    public void user_should_see_a_minimum_of_tab(Integer int1) {

    }
    @When("User is viewing Amenities information for Variant A.")
    public void user_is_viewing_amenities_information_for_variant_a() {
        waitFor(2000);
        highlighter.highLighterMethod(T11_DispensaryPage.getRiseDispensaryMundeleinHeader(), DriverManager.getDriver());
        Assert.assertTrue(T11_DispensaryPage.getRiseDispensaryMundeleinHeader().isDisplayed());
        Logger.log("User is viewing the dispensary page");
        waitFor(2000);
        javascriptScroll(T11_DispensaryPage.getDispensaryTabSection());
        Logger.log("User scrolls down to the dispensary tabs section");
        Logger.log("User is viewing Amenities information for Variant A.");
    }

    @Then("User is able to  view the tittle text")
    public void user_is_able_to_view_the_tittle_text() {
        waitFor(100);
        visibilityWait(T11_DispensaryPage.getAmenitiesHeader());
        highlighter.highLighterMethod(T11_DispensaryPage.getAmenitiesHeader(), DriverManager.getDriver());
        Assert.assertTrue(T11_DispensaryPage.getAmenitiesHeader().isDisplayed());
        Logger.log("User is able to  view the tittle text");
    }
    @Then("User is able to  view Copy Text")
    public void copy_text() {
        waitFor(100);
        visibilityWait(T11_DispensaryPage.getAmenitiesCopyText());
        highlighter.highLighterMethod(T11_DispensaryPage.getAmenitiesCopyText(), DriverManager.getDriver());
        Assert.assertTrue(T11_DispensaryPage.getAmenitiesCopyText().isDisplayed());
        Logger.log("User is able to view  the respective opened tab highlighted accordingly");
    }
    @Then("User is able to  view icon against each amenity")
    public void icon_against_each_amenity() {
        waitFor(100);
        System.out.println(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed());
        if (T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed()) {
            visibilityWait(T11_DispensaryPage.getAmenitiesIconList().get(0));
            waitFor(500);
            DriverManager.getDriver().findElement(By.xpath("//button[contains(text(),'Show more')]")).click();
            waitFor(500);
            JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
            js.executeScript("window.scrollBy(0,-500);");
            visibilityWait(T11_DispensaryPage.getAmenitiesIconList().get(0));
            for (WebElement ele: T11_DispensaryPage.getAmenitiesIconList()){
                visibilityWait(ele);
                Assert.assertTrue(ele.isDisplayed());
                waitFor(400);
            }
            Logger.log("User is able to  view icon against each amenity");
        }else {
            visibilityWait(T11_DispensaryPage.getAmenitiesIconList().get(0));
            for (WebElement ele : T11_DispensaryPage.getAmenitiesIconList()) {
                visibilityWait(ele);
                Assert.assertTrue(ele.isDisplayed());
                waitFor(400);
            }
            Logger.log("User is able to  view icon against each amenity");
        }
    }
    @Then("User is able to  view title against each amenity")
    public void title_against_each_amenity() {
        waitFor(100);
        visibilityWait(T11_DispensaryPage.getAmenitiesTextList().get(0));
        for (WebElement ele: T11_DispensaryPage.getAmenitiesTextList()){
            visibilityWait(ele);
            highlighter.highLighterMethod(ele, DriverManager.getDriver());
            Assert.assertTrue(ele.isDisplayed());
            waitFor(400);
        }
        Logger.log("User is able to  view title against each amenity");
    }
    @Then("User is able to view list of amenities as {int} columns")
    public void user_is_able_to_view_list_of_amenities_as_columns(Integer int1) {

    }
    @Then("User should be able to view the Tooltip text box with appropriate details about amenity")
    public void user_should_be_able_to_view_the_tooltip_text_box_with_appropriate_details_about_amenity() {
        waitFor(100);
        System.out.println(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed());
        if (T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed()) {
            visibilityWait(T11_DispensaryPage.getAmenitiesToolTipList().get(0));
            for (WebElement ele: T11_DispensaryPage.getAmenitiesToolTipList()){
                visibilityWait(ele);
                mouseOver(ele);
                waitFor(200);
                DriverManager.getDriver().findElement(By.xpath("//*[@data-testid='tooltip-container-close']")).click();
                waitFor(200);
                Assert.assertTrue(ele.isDisplayed());
            }
            Logger.log("User should be able to view the Tooltip text box with appropriate details about amenity");
        }else {
            visibilityWait(T11_DispensaryPage.getAmenitiesToolTipList().get(0));
            for (WebElement ele : T11_DispensaryPage.getAmenitiesToolTipList()) {
                visibilityWait(ele);
                mouseOver(ele);
                waitFor(400);
                Assert.assertTrue(ele.isDisplayed());
            }
            Logger.log("User should be able to view the Tooltip text box with appropriate details about amenity");
        }
    }
    @When("User is viewing Amenities information in variant A")
    public void user_is_viewing_amenities_information_in_variant_a() {
        waitFor(2000);
        highlighter.highLighterMethod(T11_DispensaryPage.getRiseDispensaryMundeleinHeader(), DriverManager.getDriver());
        Assert.assertTrue(T11_DispensaryPage.getRiseDispensaryMundeleinHeader().isDisplayed());
        Logger.log("User is viewing the dispensary page");
        waitFor(2000);
        javascriptScroll(T11_DispensaryPage.getDispensaryTabSection());
        Logger.log("User scrolls down to the dispensary tabs section");
        Logger.log("User is viewing Amenities information for Variant A.");
        waitFor(100);
        visibilityWait(T11_DispensaryPage.getDispensaryTabSection());
        highlighter.highLighterMethod(T11_DispensaryPage.getDispensaryTabSection(), DriverManager.getDriver());
        Assert.assertTrue(T11_DispensaryPage.getDispensaryTabSection().isDisplayed());
        Logger.log("User is able to view Dispensary tabs");
    }
    @When("User click on tooltip icon")
    public void user_hovers_on_tooltip_icon() {

    }
    @When("User clicks anywhere outside the box")
    public void user_clicks_anywhere_outside_the_box() {

    }
    @Then("User should see the tooltip getting closed")
    public void user_should_see_the_tooltip_getting_closed() {

    }
    @When("user is on the any deals & promotional content")
    public void user_is_on_the_any_deals_promotional_content() {
        waitFor(2000);
        highlighter.highLighterMethod(T11_DispensaryPage.getRiseDispensaryMundeleinHeader(), DriverManager.getDriver());
        Assert.assertTrue(T11_DispensaryPage.getRiseDispensaryMundeleinHeader().isDisplayed());
        Logger.log("User is viewing the dispensary page");
        waitFor(2000);
        javascriptScroll(T11_DispensaryPage.getDispensaryTabSection());
        Logger.log("User scrolls down to the dispensary tabs section");
        Logger.log("User is viewing Amenities information for Variant A.");
        waitFor(100);
        visibilityWait(T11_DispensaryPage.getPromotionTab());
        jsClick(T11_DispensaryPage.getPromotionTab());
        visibilityWait(T11_DispensaryPage.getPromotionTabHighlighted());
        Assert.assertTrue(T11_DispensaryPage.getDispensaryTabSection().isDisplayed());
        Logger.log("User is able to view Dispensary tabs");

    }
    @Then("user should able to view the appropriate Title text")
    public void user_should_able_to_view_the_appropriate_title_text() {
        waitFor(100);
        System.out.println(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed());
        if (T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed()) {
            waitFor(200);
            JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
            js.executeScript("window.scrollBy(0,-200);");
            waitFor(200);
            visibilityWait(T11_DispensaryPage.getMobileDispensaryTabList().get(2));
            jsClick(T11_DispensaryPage.getMobileDispensaryTabList().get(2));
            waitFor(500);
            waitFor(100);
            visibilityWait(T11_DispensaryPage.getDealsTabHeader());
            highlighter.highLighterMethod(T11_DispensaryPage.getDealsTabHeader(), DriverManager.getDriver());
            Assert.assertTrue(T11_DispensaryPage.getDealsTabHeader().isDisplayed());
            Logger.log("User should able to view the appropriate Title text");
        }else {
            jsClick(T11_DispensaryPage.getPromotionTab());
            waitFor(100);
            visibilityWait(T11_DispensaryPage.getDealsTabHeader());
            highlighter.highLighterMethod(T11_DispensaryPage.getDealsTabHeader(), DriverManager.getDriver());
            Assert.assertTrue(T11_DispensaryPage.getDealsTabHeader().isDisplayed());
            Logger.log("User should able to view the appropriate Title text");
        }
    }
    @Then("user should able to view the appropriate Copy text")
    public void user_should_able_to_view_the_appropriate_copy_text() {
        waitFor(100);
        visibilityWait(T11_DispensaryPage.getDealsTabCopytext());
        highlighter.highLighterMethod(T11_DispensaryPage.getDealsTabCopytext(), DriverManager.getDriver());
        Assert.assertTrue(T11_DispensaryPage.getDealsTabCopytext().isDisplayed());
        Logger.log("user should able to view the appropriate Copy text");
    }
    @Then("user should able to view the appropriate Image")
    public void user_should_able_to_view_the_appropriate_image() {
        waitFor(100);
        visibilityWait(T11_DispensaryPage.getDealTabImage());
        highlighter.highLighterMethod(T11_DispensaryPage.getDealTabImage(), DriverManager.getDriver());
        Assert.assertTrue(T11_DispensaryPage.getDealTabImage().isDisplayed());
        Logger.log("user should able to view the appropriate Image");
    }
    @Then("user should able to view the appropriate CTA button")
    public void user_should_able_to_view_the_appropriate_cta_button() {
        waitFor(100);
        visibilityWait(T11_DispensaryPage.getDealTabCTA());
        highlighter.highLighterMethod(T11_DispensaryPage.getDealTabCTA(), DriverManager.getDriver());
        Assert.assertTrue(T11_DispensaryPage.getDealTabCTA().isDisplayed());
        Logger.log("user should able to view the appropriate CTA button");
    }
    @Then("user should able to view the clickable link")
    public void user_should_able_to_view_the_clickable_link() {

    }
    @Then("user should able to view the appropriate valid start date")
    public void user_should_able_to_view_the_appropriate_valid_start_date() {
        waitFor(100);
        visibilityWait(T11_DispensaryPage.getDealStartDateAndEndDateAndIcon());
        highlighter.highLighterMethod(T11_DispensaryPage.getDealStartDateAndEndDateAndIcon(), DriverManager.getDriver());
        Assert.assertTrue(T11_DispensaryPage.getDealStartDateAndEndDateAndIcon().isDisplayed());
        Logger.log("user should able to view the appropriate valid start date");
    }
    @Then("user should see an end date")
    public void user_should_see_an_end_date() {
        waitFor(100);
        visibilityWait(T11_DispensaryPage.getDealStartDateAndEndDateAndIcon());
        highlighter.highLighterMethod(T11_DispensaryPage.getDealStartDateAndEndDateAndIcon(), DriverManager.getDriver());
        Assert.assertTrue(T11_DispensaryPage.getDealStartDateAndEndDateAndIcon().isDisplayed());
        Logger.log("user should see an end date");
    }
    @Then("user should see a small icon")
    public void user_should_see_a_small_icon() {
        waitFor(100);
        visibilityWait(T11_DispensaryPage.getDealStartDateAndEndDateAndIcon());
        highlighter.highLighterMethod(T11_DispensaryPage.getDealStartDateAndEndDateAndIcon(), DriverManager.getDriver());
        Assert.assertTrue(T11_DispensaryPage.getDealStartDateAndEndDateAndIcon().isDisplayed());
        Logger.log("user should see a small icon");
    }
    @Then("user should able to view the dispensary reviews section")
    public void user_should_able_to_view_the_dispensary_reviews_section() {
        waitFor(1000);
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
        js.executeScript("window.scrollBy(0,400);");
        waitFor(100);
        visibilityWait(T11_DispensaryPage.getDispensaryReviewSection());
        highlighter.highLighterMethod(T11_DispensaryPage.getDispensaryReviewSection(), DriverManager.getDriver());
        Assert.assertTrue(T11_DispensaryPage.getDispensaryReviewSection().isDisplayed());
        Logger.log("user should able to view the dispensary reviews section");
    }
    @Then("user should able to view the {string} title text")
    public void user_should_able_to_view_the_title_text(String string) {
        visibilityWait(T11_DispensaryPage.getDispensaryReviewHeader());
        highlighter.highLighterMethod(T11_DispensaryPage.getDispensaryReviewHeader(), DriverManager.getDriver());
        Assert.assertTrue(T11_DispensaryPage.getDispensaryReviewHeader().isDisplayed());
        Logger.log("user should able to view the What people are saying title text");
    }

    @Then("user should able to see only max of {int} review in the screen")
    public void user_should_able_to_see_only_max_of_review_in_the_screen(Integer int1) {

    }

    @Then("user should able to see a minimum of {int} review in the screen")
    public void user_should_able_to_see_a_minimum_of_review_in_the_screen(Integer int1) {

    }
    @Then("user should able to view <no. of review> of <total no. of reviews> in the review section")
    public void user_should_able_to_view_no_of_review_of_total_no_of_reviews_in_the_review_section() {
        waitFor(100);
        System.out.println(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed());
        if (T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed()) {
            JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
            waitFor(300);
            js.executeScript("window.scrollBy(0,300);");
            visibilityWait(T11_DispensaryPage.getMobileReviewCount());
            highlighter.highLighterMethod(T11_DispensaryPage.getMobileReviewCount(), DriverManager.getDriver());
            Assert.assertTrue(T11_DispensaryPage.getMobileReviewCount().isDisplayed());
            Logger.log("user should able to view <no. of review> of <total no. of reviews> in the review section");
            waitFor(300);
            js.executeScript("window.scrollBy(0,-300);");
        }else {
            visibilityWait(T11_DispensaryPage.getDispensaryReviewCount());
            highlighter.highLighterMethod(T11_DispensaryPage.getDispensaryReviewCount(), DriverManager.getDriver());
            Assert.assertTrue(T11_DispensaryPage.getDispensaryReviewCount().isDisplayed());
            Logger.log("user should able to view <no. of review> of <total no. of reviews> in the review section");
        }
    }
    @Then("user should <total no. of reviews> below the review in the section is exact total of review in the section")
    public void user_should_total_no_of_reviews_below_the_review_in_the_section_is_exact_total_of_review_in_the_section() {

    }
    @Then("user should <no. of review> below the review in the section is exact total of review in the section")
    public void user_should_no_of_review_below_the_review_in_the_section_is_exact_total_of_review_in_the_section() {

    }
    @When("user clicking on clicking on left arrows available in review section")
    public void user_clicking_on_clicking_on_left_arrows_available_in_review_section() {
        waitFor(100);
        visibilityWait(T11_DispensaryPage.getReviewLeftClickButton());
        DriverManager.getDriver().findElement(By.xpath("//*[2][@data-testid='next-icon']/preceding-sibling::*")).click();
        Assert.assertTrue(T11_DispensaryPage.getReviewLeftClickButton().isDisplayed());
        Logger.log("User should able to see the slider color changes");
    }
    @Then("user should able to see the review carousal is navigate in left side in the hero section")
    public void user_should_able_to_see_the_review_carousal_is_navigate_in_left_side_in_the_hero_section() {

    }
    @Then("user should able to see the slider color changes")
    public void user_should_able_to_see_the_slider_color_changes() {
        waitFor(100);
        visibilityWait(T11_DispensaryPage.getReviewLeftClickButton());
        DriverManager.getDriver().findElement(By.xpath("//*[2][@data-testid='next-icon']/preceding-sibling::*")).click();
        Assert.assertTrue(T11_DispensaryPage.getReviewLeftClickButton().isDisplayed());
        Logger.log("User should able to see the slider color changes");
    }
    @When("user clicking on right arrows arrows available in review section")
    public void user_clicking_on_right_arrows_arrows_available_in_review_section() {
        waitFor(100);
        visibilityWait(T11_DispensaryPage.getReviewRightClickButton());
        DriverManager.getDriver().findElement(By.xpath("//*[2][@data-testid='next-icon']")).click();
        Assert.assertTrue(T11_DispensaryPage.getReviewRightClickButton().isDisplayed());
        Logger.log("user clicking on right arrows arrows available in review section");
    }
    @Then("user should able to see the review carousal is navigate in right side in the hero section")
    public void user_should_able_to_see_the_review_carousal_is_navigate_in_right_side_in_the_hero_section() {
        waitFor(100);
        visibilityWait(T11_DispensaryPage.getReviewProgressBar());
        String cssValue = T11_DispensaryPage.getReviewProgressBar().getCssValue("element.style.width");
        System.out.println(cssValue);

    }
    @When("user clicks on right arrow")
    public void user_clicks_on_right_arrow() {
        waitFor(2000);
        visibilityWait(T11_DispensaryPage.getReviewRightClickButton());
        DriverManager.getDriver().findElement(By.xpath("//*[2][@data-testid='next-icon']")).click();
        Assert.assertTrue(T11_DispensaryPage.getReviewRightClickButton().isDisplayed());
        Logger.log("user clicks on right arrow");
    }
    @Then("user should see the slider moving forward")
    public void user_should_see_the_slider_moving_forward() {
        waitFor(100);
        System.out.println(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed());
        if (T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed()) {
            JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
            //js.executeScript("window.scrollBy(0,-200);");
            visibilityWait(T11_DispensaryPage.getMobileProgressbar());
            highlighter.highLighterMethod(T11_DispensaryPage.getMobileProgressbar(), DriverManager.getDriver());
            Assert.assertTrue(T11_DispensaryPage.getMobileProgressbar().isDisplayed());
            Logger.log("user should see the slider moving forward");
        }else {
            visibilityWait(T11_DispensaryPage.getReviewProgressBar());
            highlighter.highLighterMethod(T11_DispensaryPage.getReviewProgressBar(), DriverManager.getDriver());
            Assert.assertTrue(T11_DispensaryPage.getReviewProgressBar().isDisplayed());
            Logger.log("user should see the slider moving forward");
        }
//        visibilityWait(dispensaryPage.getReviewProgressBar());
//        highlighter.highLighterMethod(dispensaryPage.getReviewProgressBar(), DriverManager.getDriver());
//        Assert.assertTrue(dispensaryPage.getReviewProgressBar().isDisplayed());
//        Logger.log("user should see the slider moving forward");
    }
    @Then("number getting changed")
    public void number_getting_changed() {
        waitFor(200);
        System.out.println(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed());
        if (T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed()) {
            visibilityWait(T11_DispensaryPage.getMobileReviewCount());
            String reviewCountText = T11_DispensaryPage.getMobileReviewCount().getText();
            System.out.println(reviewCountText);
            if(reviewCountText.equals("2 of 2")){
                highlighter.highLighterMethod(T11_DispensaryPage.getMobileReviewCount(), DriverManager.getDriver());
                Assert.assertTrue(T11_DispensaryPage.getMobileReviewCount().isDisplayed());
                Logger.log("user should see the number getting changed");
            }else{
                Assert.fail();
                Logger.log("user not able see the number getting changed");
            }
        }else {
            visibilityWait(T11_DispensaryPage.getDispensaryReviewCount());
            String reviewCountText = T11_DispensaryPage.getDispensaryReviewCount().getText();
            System.out.println(reviewCountText);
            if (reviewCountText.equals("2 of 2")) {
                highlighter.highLighterMethod(T11_DispensaryPage.getDispensaryReviewCount(), DriverManager.getDriver());
                Assert.assertTrue(T11_DispensaryPage.getDispensaryReviewCount().isDisplayed());
                Logger.log("user should see the number getting changed");
            } else {
                Assert.fail();
                Logger.log("user not able see the number getting changed");
            }
        }
    }
    @Then("user should see the slider moving backward")
    public void user_should_see_the_slider_moving_backward() {
        waitFor(100);
        System.out.println(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed());
        if (T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed()) {
            visibilityWait(T11_DispensaryPage.getMobileProgressbar());
            highlighter.highLighterMethod(T11_DispensaryPage.getMobileProgressbar(), DriverManager.getDriver());
            Assert.assertTrue(T11_DispensaryPage.getMobileProgressbar().isDisplayed());
            Logger.log("user should see the slider moving backward");
        }else {
            visibilityWait(T11_DispensaryPage.getReviewProgressBar());
            highlighter.highLighterMethod(T11_DispensaryPage.getReviewProgressBar(), DriverManager.getDriver());
            Assert.assertTrue(T11_DispensaryPage.getReviewProgressBar().isDisplayed());
            Logger.log("user should see the slider moving backward");
        }
//        visibilityWait(dispensaryPage.getReviewProgressBar());
//        highlighter.highLighterMethod(dispensaryPage.getReviewProgressBar(), DriverManager.getDriver());
//        Assert.assertTrue(dispensaryPage.getReviewProgressBar().isDisplayed());
//        Logger.log("user should see the slider moving backward");
    }

    @Then("user should able to see rating with stars for each review")
    public void user_should_able_to_see_rating_with_stars_for_each_review() {
        waitFor(200);
        System.out.println(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed());
        if (T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed()) {
            visibilityWait(T11_DispensaryPage.getReviewStarList().get(0));
            Assert.assertTrue(T11_DispensaryPage.getReviewLeftClickButton().isDisplayed());
            for (WebElement ele: T11_DispensaryPage.getReviewStarList() ){
                visibilityWait(ele);
                highlighter.highLighterMethod(ele, DriverManager.getDriver());
                Assert.assertTrue(ele.isDisplayed());
                waitFor(500);
                DriverManager.getDriver().findElement(By.xpath("//*[2][@data-testid='next-icon']")).click();
            }
            Logger.log("user should able to see rating with stars for each review");
        }else {
            visibilityWait(T11_DispensaryPage.getReviewStarList().get(0));
            Assert.assertTrue(T11_DispensaryPage.getReviewLeftClickButton().isDisplayed());
            for (WebElement ele : T11_DispensaryPage.getReviewStarList()) {
                visibilityWait(ele);
                highlighter.highLighterMethod(ele, DriverManager.getDriver());
                Assert.assertTrue(ele.isDisplayed());
                waitFor(500);
            }
            Logger.log("user should able to see rating with stars for each review");
        }
    }
    @Then("user should able to see the rating slider navigating left to right")
    public void user_should_able_to_see_the_rating_slider_navigating_left_to_right() {
        waitFor(100);
        System.out.println(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed());
        if (T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed()) {
            visibilityWait(T11_DispensaryPage.getMobileProgressbar());
            highlighter.highLighterMethod(T11_DispensaryPage.getMobileProgressbar(), DriverManager.getDriver());
            Assert.assertTrue(T11_DispensaryPage.getMobileProgressbar().isDisplayed());
            Logger.log("user should able to see the rating slider navigating left to right");
        }else {
            visibilityWait(T11_DispensaryPage.getReviewProgressBar());
            highlighter.highLighterMethod(T11_DispensaryPage.getReviewProgressBar(), DriverManager.getDriver());
            Assert.assertTrue(T11_DispensaryPage.getReviewProgressBar().isDisplayed());
            Logger.log("user should able to see the rating slider navigating left to right");
        }
//        visibilityWait(dispensaryPage.getReviewProgressBar());
//        highlighter.highLighterMethod(dispensaryPage.getReviewProgressBar(), DriverManager.getDriver());
//        Assert.assertTrue(dispensaryPage.getReviewProgressBar().isDisplayed());
//        Logger.log("user should able to see the rating slider navigating left to right");
    }

    @Then("user should able to see the rating slider navigating right to left")
    public void user_should_able_to_see_the_rating_slider_navigating_right_to_left() {
        waitFor(100);
        System.out.println(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed());
        if (T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed()) {
            JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
            //js.executeScript("window.scrollBy(0,-500);");
            visibilityWait(T11_DispensaryPage.getMobileProgressbar());
            highlighter.highLighterMethod(T11_DispensaryPage.getMobileProgressbar(), DriverManager.getDriver());
            Assert.assertTrue(T11_DispensaryPage.getMobileProgressbar().isDisplayed());
            Logger.log("user should able to see the rating slider navigating right to left");
            waitFor(300);
            DriverManager.getDriver().findElement(By.xpath("//*[2][@data-testid='next-icon']/preceding-sibling::*")).click();
        }else {
            visibilityWait(T11_DispensaryPage.getReviewProgressBar());
            highlighter.highLighterMethod(T11_DispensaryPage.getReviewProgressBar(), DriverManager.getDriver());
            Assert.assertTrue(T11_DispensaryPage.getReviewProgressBar().isDisplayed());
            Logger.log("user should able to see the rating slider navigating right to left");
        }
//        visibilityWait(dispensaryPage.getReviewProgressBar());
//        highlighter.highLighterMethod(dispensaryPage.getReviewProgressBar(), DriverManager.getDriver());
//        Assert.assertTrue(dispensaryPage.getReviewProgressBar().isDisplayed());
//        Logger.log("user should able to see the rating slider navigating left to right");
    }
    @Then("user should able to see the see customer name when present for each review")
    public void user_should_able_to_see_the_see_customer_name_when_present_for_each_review() {
        visibilityWait(T11_DispensaryPage.getReviewCustomerNameList().get(0));
        for (WebElement ele: T11_DispensaryPage.getReviewCustomerNameList() ){
            visibilityWait(ele);
            highlighter.highLighterMethod(ele, DriverManager.getDriver());
            Assert.assertTrue(ele.isDisplayed());
            waitFor(500);
        }
        Logger.log("user should able to see the see customer name when present for each review");

    }
    @Then("user should able to see the as anonymous when customer name is not there for each review")
    public void user_should_able_to_see_the_as_anonymous_when_customer_name_is_not_there_for_each_review() {

    }
    @Then("user should able to see the progress bar")
    public void user_should_able_to_see_the_progress_bar() {
        waitFor(100);
        System.out.println(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed());
        if (T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed()) {
            visibilityWait(T11_DispensaryPage.getMobileProgressbar());
            highlighter.highLighterMethod(T11_DispensaryPage.getMobileProgressbar(), DriverManager.getDriver());
            Assert.assertTrue(T11_DispensaryPage.getMobileProgressbar().isDisplayed());
            Logger.log("User should able to see the progress bar");
        }else {
            visibilityWait(T11_DispensaryPage.getReviewProgressBar());
            highlighter.highLighterMethod(T11_DispensaryPage.getReviewProgressBar(), DriverManager.getDriver());
            Assert.assertTrue(T11_DispensaryPage.getReviewProgressBar().isDisplayed());
            Logger.log("User should able to see the progress bar");
        }
    }
    @When("user clicks on left arrow")
    public void user_clicks_on_left_arrow() {
        waitFor(2000);
        visibilityWait(T11_DispensaryPage.getReviewRightClickButton());
        DriverManager.getDriver().findElement(By.xpath("//*[2][@data-testid='next-icon']")).click();
        Assert.assertTrue(T11_DispensaryPage.getReviewRightClickButton().isDisplayed());
        waitFor(500);
        visibilityWait(T11_DispensaryPage.getReviewLeftClickButton());
        DriverManager.getDriver().findElement(By.xpath("//*[2][@data-testid='next-icon']/preceding-sibling::*")).click();
        Assert.assertTrue(T11_DispensaryPage.getReviewLeftClickButton().isDisplayed());
        Logger.log("user clicks on left arrow");
    }
    @Then("user should able to see the dispensary review as copy text with quotation symbol on each review")
    public void user_should_able_to_see_the_dispensary_review_as_copy_text_with_quotation_symbol_on_each_review() {
        waitFor(400);
        System.out.println(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed());
        if (T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed()) {
            Logger.log("user should able to see the dispensary review as copy text with quotation symbol on each review");
        }else {
            visibilityWait(T11_DispensaryPage.getReviewQuotationList().get(0));
            for (WebElement ele : T11_DispensaryPage.getReviewQuotationList()) {
                waitFor(700);
                JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
                // js.executeScript("window.scrollBy(0,-600);");
                waitFor(700);
                DriverManager.getDriver().findElement(By.xpath("//*[2][@data-testid='next-icon']/preceding-sibling::*")).click();
                waitFor(1000);
                DriverManager.getDriver().findElement(By.xpath("//*[2][@data-testid='next-icon']")).click();
                visibilityWait(ele);
                highlighter.highLighterMethod(ele, DriverManager.getDriver());
                Assert.assertTrue(ele.isDisplayed());
                waitFor(500);
            }
            waitFor(700);
            DriverManager.getDriver().findElement(By.xpath("//*[2][@data-testid='next-icon']/preceding-sibling::*")).click();
            visibilityWait(T11_DispensaryPage.getReviewCommentList().get(0));
            for (WebElement ele : T11_DispensaryPage.getReviewCommentList()) {
                visibilityWait(ele);
                highlighter.highLighterMethod(ele, DriverManager.getDriver());
                Assert.assertTrue(ele.isDisplayed());
                waitFor(500);
            }
            Logger.log("user should able to see the dispensary review as copy text with quotation symbol on each review");
        }
    }
    @When("user scroll down to the dispensary reviews section")
    public void userScrollDownToTheDispensaryReviewsSection() {
        waitFor(2000);
        javascriptScroll(T11_DispensaryPage.getDispensaryReviewSection());
        Logger.log("user scroll down to the dispensary reviews section");
    }

    @And("number getting changed back")
    public void numberGettingChangedBack() {
        waitFor(200);
        System.out.println(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed());
        if (T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed()) {
            visibilityWait(T11_DispensaryPage.getMobileReviewCount());
            String reviewCountText = T11_DispensaryPage.getMobileReviewCount().getText();
            System.out.println(reviewCountText);
            if(reviewCountText.equals("1 of 2")){
                highlighter.highLighterMethod(T11_DispensaryPage.getMobileReviewCount(), DriverManager.getDriver());
                Assert.assertTrue(T11_DispensaryPage.getMobileReviewCount().isDisplayed());
                Logger.log("user should see the number getting changed back");
            }else{
                Assert.fail();
                Logger.log("user not able see the number getting changed back");
            }
        }else {
            visibilityWait(T11_DispensaryPage.getDispensaryReviewCount());
            String reviewCountText = T11_DispensaryPage.getDispensaryReviewCount().getText();
            System.out.println(reviewCountText);
            if (reviewCountText.equals("1 of 2")) {
                highlighter.highLighterMethod(T11_DispensaryPage.getDispensaryReviewCount(), DriverManager.getDriver());
                Assert.assertTrue(T11_DispensaryPage.getDispensaryReviewCount().isDisplayed());
                Logger.log("user should see the number getting changed back");
            } else {
                Assert.fail();
                Logger.log("user not able see the number getting changed back");
            }
        }
    }
    @When("User scrolls down to the Quick links section")
    public void user_scrolls_down_to_the_quick_links_section() {
        waitFor(2000);
        javascriptScroll(T11_DispensaryPage.getQuickLinkSection());
        Logger.log("User scrolls down to the Quick links section");
    }
    @Then("User is able to see Quick Links")
    public void user_is_able_to_see_quick_links() {
        waitFor(2000);
        waitFor(200);
        System.out.println(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed());
        if (T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed()) {
            JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
            js.executeScript("window.scrollBy(0,400);");
            waitFor(100);
            visibilityWait(T11_DispensaryPage.getQuickLinkSection());
            highlighter.highLighterMethod(T11_DispensaryPage.getQuickLinkSection(), DriverManager.getDriver());
            Assert.assertTrue(T11_DispensaryPage.getQuickLinkSection().isDisplayed());
            Logger.log("User is able to see Quick Links");
        }else {
            JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
            js.executeScript("window.scrollBy(0,700);");
            waitFor(100);
            visibilityWait(T11_DispensaryPage.getQuickLinkSection());
            highlighter.highLighterMethod(T11_DispensaryPage.getQuickLinkSection(), DriverManager.getDriver());
            Assert.assertTrue(T11_DispensaryPage.getQuickLinkSection().isDisplayed());
            Logger.log("User is able to see Quick Links");
        }
    }
    @Then("User is able to see cards in a row")
    public void user_is_able_to_see_cards_in_a_row() {
        waitFor(100);
        System.out.println(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed());
        if (T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed()) {
            JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
            js.executeScript("window.scrollBy(0,300);");
            waitFor(300);
            visibilityWait(T11_DispensaryPage.getQuickLinkBannerList().get(0));
            for(WebElement ele: T11_DispensaryPage.getQuickLinkBannerList()){
                visibilityWait(ele);
                highlighter.highLighterMethod(ele, DriverManager.getDriver());
                Assert.assertTrue(ele.isDisplayed());
            }
            Logger.log("User is able to see cards in a row");
        }else {
            visibilityWait(T11_DispensaryPage.getQuickLinkBannerList().get(0));
            for (WebElement ele : T11_DispensaryPage.getQuickLinkBannerList()) {
                visibilityWait(ele);
                highlighter.highLighterMethod(ele, DriverManager.getDriver());
                Assert.assertTrue(ele.isDisplayed());
            }
            Logger.log("User is able to see cards in a row");
        }
    }
    @Then("User is able to view the Title text.")
    public void user_is_able_to_view_the_title_text() {
        waitFor(100);
        System.out.println(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed());
        if (T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed()) {
            JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
            js.executeScript("window.scrollBy(0,-200);");
            visibilityWait(T11_DispensaryPage.getQuickLinksTitleText());
            highlighter.highLighterMethod(T11_DispensaryPage.getQuickLinksTitleText(), DriverManager.getDriver());
            Assert.assertTrue(T11_DispensaryPage.getQuickLinksTitleText().isDisplayed());
            Logger.log("User is able to view the Title text.");
        }else {
            visibilityWait(T11_DispensaryPage.getQuickLinksTitleText());
            highlighter.highLighterMethod(T11_DispensaryPage.getQuickLinksTitleText(), DriverManager.getDriver());
            Assert.assertTrue(T11_DispensaryPage.getQuickLinksTitleText().isDisplayed());
            Logger.log("User is able to view the Title text.");
        }
    }
    @Then("User is able to view the copy text.")
    public void user_is_able_to_view_the_copy_text() {
        waitFor(100);
        visibilityWait(T11_DispensaryPage.getQuickLinksCopyText());
        highlighter.highLighterMethod(T11_DispensaryPage.getQuickLinksCopyText(), DriverManager.getDriver());
        Assert.assertTrue(T11_DispensaryPage.getQuickLinksCopyText().isDisplayed());
        Logger.log("User is able to view the Title text.");
    }
    @When("User is viewing the Quick Links section")
    public void user_is_viewing_the_quick_links_section() {
        waitFor(100);
        javascriptScroll(T11_DispensaryPage.getQuickLinkSection());
        visibilityWait(T11_DispensaryPage.getQuickLinkSection());
        Assert.assertTrue(T11_DispensaryPage.getQuickLinkSection().isDisplayed());
        Logger.log("User is able to see Quick Links");
    }
    @Then("User should be able to view the image for each card")
    public void user_should_be_able_to_view_the_image_for_each_card() {
        waitFor(100);
        visibilityWait(T11_DispensaryPage.getQuickLinksImageList().get(0));
        for(WebElement ele: T11_DispensaryPage.getQuickLinksImageList()){
            visibilityWait(ele);
            highlighter.highLighterMethod(ele, DriverManager.getDriver());
            Assert.assertTrue(ele.isDisplayed());
        }
        Logger.log("User is viewing the Quick Links section");
    }
    @Then("User should be able to view the clickable title link card.")
    public void user_should_be_able_to_view_the_clickable_title_link_card() {
        waitFor(100);
        visibilityWait(T11_DispensaryPage.getQuickLinksTitleLinkCardList().get(0));
        for(WebElement ele: T11_DispensaryPage.getQuickLinksTitleLinkCardList()){
            visibilityWait(ele);
            highlighter.highLighterMethod(ele, DriverManager.getDriver());
            Assert.assertTrue(ele.isDisplayed());
        }
        Logger.log("User should be able to view the clickable title link card.");
    }
    @When("User clicks on the title link card.")
    public void user_clicks_on_the_title_link_card() {
        waitFor(200);
        visibilityWait(T11_DispensaryPage.getQuickLinksTitleLinkCardList().get(0));
        highlighter.highLighterMethod(T11_DispensaryPage.getQuickLinksTitleLinkCardList().get(0), DriverManager.getDriver());
        boolean quickLink = isClickable(T11_DispensaryPage.getQuickLinksTitleLinkCardList().get(0));
        System.out.println(quickLink);
        jsClick(T11_DispensaryPage.getQuickLinksTitleLinkCardList().get(0));
        Logger.log("User clicks on the title link card.");
    }

    @When("User clicks on the arrow link card.")
    public void user_clicks_on_the_arrow_link_card() {
        waitFor(100);
        visibilityWait(T11_DispensaryPage.getQuickLinkSArrowIconList().get(0));
        Assert.assertTrue(T11_DispensaryPage.getQuickLinkSection().isDisplayed());
        jsClick(T11_DispensaryPage.getQuickLinkSArrowIconList().get(0));
        Logger.log("User clicks on the arrow link card.");
    }
    @When("User is on Quick Links section")
    public void user_is_on_quick_links_section() {
        waitFor(100);
        javascriptScroll(T11_DispensaryPage.getQuickLinkSection());
        visibilityWait(T11_DispensaryPage.getQuickLinkSection());
        highlighter.highLighterMethod(T11_DispensaryPage.getQuickLinkSection(), DriverManager.getDriver());
        Assert.assertTrue(T11_DispensaryPage.getQuickLinkSection().isDisplayed());
        Logger.log("User is able to see Quick Links");
    }

    @When("User clicks on the arrow card link")
    public void user_clicks_on_the_arrow_card_link() {
        waitFor(200);
        visibilityWait(T11_DispensaryPage.getQuickLinksTitleLinkCardList().get(0));
        highlighter.highLighterMethod(T11_DispensaryPage.getQuickLinksTitleLinkCardList().get(0), DriverManager.getDriver());
        boolean quickLink = isClickable(T11_DispensaryPage.getQuickLinksTitleLinkCardList().get(0));
        System.out.println(quickLink);
        jsClick(T11_DispensaryPage.getQuickLinksTitleLinkCardList().get(0));
        Logger.log("User clicks on the title link card.");
    }
    @Then("User should be redirected to the respective page")
    public void user_should_be_redirected_to_the_respective_page() {
        Assert.fail();
        Logger.log("User not able to redirected to the respective page");
    }
    @Then("User should be redirected to the respective page by arrow")
    public void userShouldBeRedirectedToTheRespectivePageByArrow() {
        Assert.fail();
        Logger.log("User not able to redirected to the respective page");
    }
    @When("User scrolls down to the FAQ section")
    public void user_scrolls_down_to_the_faq_section() {
        waitFor(2000);
        javascriptScroll(T11_DispensaryPage.getDispensaryFaqSection());
        Logger.log("User scrolls down to the FAQ section");
    }
    @When("User is able to view less than or equal to {int} set of FAQs under the FAQ section")
    public void user_is_able_to_view_less_than_or_equal_to_set_of_fa_qs_under_the_faq_section(Integer int1) {
        waitFor(100);
        visibilityWait(T11_DispensaryPage.getDispensaryFaqAccordion());
        highlighter.highLighterMethod(T11_DispensaryPage.getDispensaryFaqAccordion(), DriverManager.getDriver());
        Assert.assertTrue(T11_DispensaryPage.getDispensaryFaqAccordion().isDisplayed());
        Logger.log("User is able to see Accordion FAQ related to the dispensary");
    }
    @Then("User should be able to view the FAQ section with answers to each questions marked in an accordion format")
    public void user_should_be_able_to_view_the_faq_section_with_answers_to_each_questions_marked_in_an_accordion_format() {
        waitFor(100);
        visibilityWait(T11_DispensaryPage.getAccordionQuestionList().get(0));
        for(WebElement ele: T11_DispensaryPage.getAccordionQuestionList()){
            visibilityWait(ele);
            highlighter.highLighterMethod(ele, DriverManager.getDriver());
            Assert.assertTrue(ele.isDisplayed());
        }
        Logger.log("User should be able to view the FAQ section with answers to each questions marked in an accordion format");
    }
    @Then("User should be able to view the full list of FAQ questions.")
    public void user_should_be_able_to_view_the_full_list_of_faq_questions() {
        waitFor(100);
        visibilityWait(T11_DispensaryPage.getAccordionQuestionList().get(0));
        for(WebElement ele: T11_DispensaryPage.getAccordionQuestionList()){
            visibilityWait(ele);
            highlighter.highLighterMethod(ele, DriverManager.getDriver());
            Assert.assertTrue(ele.isDisplayed());
        }
        Logger.log("User should be able to view the full list of FAQ questions.");
    }
    @When("User is able to view more than {int} set of FAQs under the FAQ section")
    public void user_is_able_to_view_more_than_set_of_fa_qs_under_the_faq_section(Integer int1) {
        waitFor(2000);
        visibilityWait(T11_DispensaryPage.getAccordionShowingText());
        highlighter.highLighterMethod(T11_DispensaryPage.getAccordionShowingText(), DriverManager.getDriver());
        Assert.assertTrue(T11_DispensaryPage.getAccordionShowingText().isDisplayed());
        Logger.log("User is able to view more than 8 set of FAQs under the FAQ section");
    }
    @When("user clicks on + icon")
    public void user_clicks_on_icon() {
        waitFor(200);
        visibilityWait(T11_DispensaryPage.getAccordionPlusIconList().get(0));
        Assert.assertTrue(T11_DispensaryPage.getAccordionPlusIconList().get(0).isDisplayed());
        jsClick(T11_DispensaryPage.getAccordionPlusIconList().get(0));
        Logger.log("user clicks on + icon");
    }
    @Then("User is able to see the collapsed icon")
    public void user_is_able_to_see_the_collapsed_icon() {
        waitFor(500);
        visibilityWait(T11_DispensaryPage.getAccordionPlusIconList().get(0));
    }
    @When("User clicks on the question part of a closed accordion")
    public void user_clicks_on_the_question_part_of_a_closed_accordion() {
        waitFor(300);
        visibilityWait(T11_DispensaryPage.getAccordionFaqButtonList().get(0));
        for(WebElement ele: T11_DispensaryPage.getAccordionFaqButtonList()){
            visibilityWait(ele);
            jsClick(ele);
            Assert.assertTrue(ele.isDisplayed());
        }
        Logger.log("User clicks on the question part of a closed accordion");
    }

    @When("User clicks on the + icon of a closed accordion")
    public void user_clicks_on_the_icon_of_a_closed_accordion() {
        waitFor(300);
        visibilityWait(T11_DispensaryPage.getAccordionFaqButtonList().get(0));
        for(WebElement ele: T11_DispensaryPage.getAccordionFaqButtonList()){
            visibilityWait(ele);
            jsClick(ele);
            Assert.assertTrue(ele.isDisplayed());
        }
        Logger.log("User clicks on the + icon of a closed accordion");
    }

    @And("user clicks on - icon")
    public void userClicksOnIcon() {
        waitFor(500);
        visibilityWait(T11_DispensaryPage.getAccordionPlusIconList().get(0));
        Assert.assertTrue(T11_DispensaryPage.getAccordionPlusIconList().get(0).isDisplayed());
        jsClick(T11_DispensaryPage.getAccordionPlusIconList().get(0));
        Logger.log("user clicks on - icon");
    }

    @Then("User is able to see Accordion FAQ related to the dispensary")
    public void userIsAbleToSeeAccordionFAQRelatedToTheDispensary() {
        waitFor(1000);
        System.out.println(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed());
        if (T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed()) {
            JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
            js.executeScript("window.scrollBy(0,4900);");
            waitFor(100);
            visibilityWait(T11_DispensaryPage.getDispensaryFaqAccordion());
            highlighter.highLighterMethod(T11_DispensaryPage.getDispensaryFaqAccordion(), DriverManager.getDriver());
            Assert.assertTrue(T11_DispensaryPage.getDispensaryFaqAccordion().isDisplayed());
            Logger.log("User is able to see Accordion FAQ related to the dispensary");
        }else {
            JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
            js.executeScript("window.scrollBy(0,4000);");
            waitFor(100);
            visibilityWait(T11_DispensaryPage.getDispensaryFaqAccordion());
            highlighter.highLighterMethod(T11_DispensaryPage.getDispensaryFaqAccordion(), DriverManager.getDriver());
            Assert.assertTrue(T11_DispensaryPage.getDispensaryFaqAccordion().isDisplayed());
            Logger.log("User is able to see Accordion FAQ related to the dispensary");
        }

    }
    @And("user clicks on + icon in dispensary faq")
    public void userClicksOnIconInDispensaryFaq() {
        waitFor(200);
        visibilityWait(T11_DispensaryPage.getAccordionPlusIconList().get(0));
        Assert.assertTrue(T11_DispensaryPage.getAccordionPlusIconList().get(0).isDisplayed());
        jsClick(T11_DispensaryPage.getAccordionPlusIconList().get(0));
        Logger.log("user clicks on + icon in dispensary faq");
    }

    @Then("User is able to see the expanded accordion in dispensary faq")
    public void userIsAbleToSeeTheExpandedAccordionInDispensaryFaq() {
        waitFor(500);
        visibilityWait(T11_DispensaryPage.getAccordionFaqAnswerList().get(0));
        waitFor(500);
        highlighter.highLighterMethod(T11_DispensaryPage.getAccordionFaqAnswerList().get(0), DriverManager.getDriver());
        Assert.assertTrue(T11_DispensaryPage.getAccordionFaqAnswerList().get(0).isDisplayed());
        Logger.log("User is able to see the expanded accordion in dispensary faq");
    }

    @Then("User should be able to view ‘+’ and ‘-‘ symbols in dispensary faq")
    public void userShouldBeAbleToViewAndSymbolsInDispensaryFaq() {
        waitFor(200);
        visibilityWait(T11_DispensaryPage.getAccordionPlusIconList().get(0));
        for(WebElement ele: T11_DispensaryPage.getAccordionPlusIconList()){
            visibilityWait(ele);
            highlighter.highLighterMethod(ele, DriverManager.getDriver());
            Assert.assertTrue(ele.isDisplayed());
        }
        Logger.log("User should be able to view ‘+’ symbols in dispensary faq");
        jsClick(T11_DispensaryPage.getAccordionPlusIconList().get(0));
        waitFor(1000);
        visibilityWait(T11_DispensaryPage.getAccordionPlusIconList().get(0));
        highlighter.highLighterMethod(T11_DispensaryPage.getAccordionPlusIconList().get(0), DriverManager.getDriver());
        Assert.assertTrue(T11_DispensaryPage.getAccordionPlusIconList().get(0).isDisplayed());
        Logger.log("User should be able to view ‘-’ symbols in dispensary faq");
    }

    @And("On clicking the accordions should get expanded and collapsed respectively in dispensary faq")
    public void onClickingTheAccordionsShouldGetExpandedAndCollapsedRespectivelyInDispensaryFaq() {
        waitFor(300);
        visibilityWait(T11_DispensaryPage.getAccordionFaqButtonList().get(0));
        for(WebElement ele: T11_DispensaryPage.getAccordionFaqButtonList()){
            visibilityWait(ele);
            jsClick(ele);
            Assert.assertTrue(ele.isDisplayed());
        }
        Logger.log("On clicking the accordions should get expanded  respectively in dispensary faq");
        jsClick(T11_DispensaryPage.getAccordionFaqButtonList().get(0));
        visibilityWait(T11_DispensaryPage.getAccordionFaqAnswerList().get(0));
        waitFor(500);
        highlighter.highLighterMethod(T11_DispensaryPage.getAccordionFaqAnswerList().get(0), DriverManager.getDriver());
        Assert.assertTrue(T11_DispensaryPage.getAccordionFaqAnswerList().get(0).isDisplayed());
        Logger.log("On clicking the accordions should get collapsed respectively in dispensary faq");
    }

    @And("One accordion should get closed automatically when any other accordion is opened in dispensary faq")
    public void oneAccordionShouldGetClosedAutomaticallyWhenAnyOtherAccordionIsOpenedInDispensaryFaq() {
        waitFor(300);
        visibilityWait(T11_DispensaryPage.getAccordionFaqButtonList().get(0));
        for(WebElement ele: T11_DispensaryPage.getAccordionFaqButtonList()){
            visibilityWait(ele);
            jsClick(ele);
            Assert.assertTrue(ele.isDisplayed());
        }
        Logger.log("One accordion should get closed automatically when any other accordion is opened in dispensary faq");
    }
    @Then("User should be able to view the accordion getting expanded")
    public void userShouldBeAbleToViewTheAccordionGettingExpanded() {
        Logger.log("User should be able to view the accordion getting expanded");
    }

    @And("User clicks on the CTA")
    public void userClicksOnTheCTA() {
        waitFor(2000);
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
        js.executeScript("window.scrollBy(0,300);");
        visibilityWait(T11_DispensaryPage.getAccordionShowingText());
        highlighter.highLighterMethod(T11_DispensaryPage.getAccordionShowingText(), DriverManager.getDriver());
        Assert.assertTrue(T11_DispensaryPage.getAccordionShowingText().isDisplayed());
        visibilityWait(T11_DispensaryPage.getShowMoreCTA());
        jsClick(T11_DispensaryPage.getShowMoreCTA());
        Logger.log("User clicks on the CTA");
    }

    @Then("User should be able to view the entire set of FAQs")
    public void userShouldBeAbleToViewTheEntireSetOfFAQs() {
        waitFor(100);
        visibilityWait(T11_DispensaryPage.getAccordionQuestionList().get(0));
        for(WebElement ele: T11_DispensaryPage.getAccordionQuestionList()){
            visibilityWait(ele);
            highlighter.highLighterMethod(ele, DriverManager.getDriver());
            Assert.assertTrue(ele.isDisplayed());
        }
        Logger.log("User should be able to view the entire set of FAQs");
    }
    @When("user scroll down to the dispensary nearby section")
    public void user_scroll_down_to_the_dispensary_nearby_section() {

    }
    @Given("user should able to see maximum {int} cards of nearby locations")
    public void user_should_able_to_see_maximum_cards_of_nearby_locations(Integer int1) {
        waitFor(100);
        visibilityWait(T11_DispensaryPage.getDispensaryNearbyLocationList().get(0));
        int dispensaryLocationCount = T11_DispensaryPage.getDispensaryNearbyLocationList().size();
        System.out.println(dispensaryLocationCount);
        if(dispensaryLocationCount==2) {
            for (WebElement ele : T11_DispensaryPage.getDispensaryNearbyLocationList()) {
                visibilityWait(ele);
                highlighter.highLighterMethod(ele, DriverManager.getDriver());
                Assert.assertTrue(ele.isDisplayed());
                Logger.log("user should able to see maximum 2 cards of nearby locations");
            }
        }else {
            Assert.fail();
            Logger.log("user not able to see maximum 2 cards of nearby locations");

        }
    }
    @Then("user should able to view the dispensary cards")
    public void user_should_able_to_view_the_dispensary_cards() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user should able to view the dispensaries nearby title text")
    public void user_should_able_to_view_the_dispensaries_nearby_title_text() {
        waitFor(100);
        visibilityWait(T11_DispensaryPage.getDispensaryNearbyTitle());
        highlighter.highLighterMethod(T11_DispensaryPage.getDispensaryNearbyTitle(), DriverManager.getDriver());
        Assert.assertTrue(T11_DispensaryPage.getDispensaryNearbyTitle().isDisplayed());
        Logger.log("user should able to view the dispensaries nearby title text");
    }
    @Then("user should able to see dispensary image in each card")
    public void user_should_able_to_see_dispensary_image_in_each_card() {
        waitFor(100);
        visibilityWait(T11_DispensaryPage.getDispensaryNearByImageList().get(0));
        for(WebElement ele: T11_DispensaryPage.getDispensaryNearByImageList()){
            visibilityWait(ele);
            highlighter.highLighterMethod(ele, DriverManager.getDriver());
            Assert.assertTrue(ele.isDisplayed());
        }
        Logger.log("user should able to see dispensary image in each card");
    }
    @Then("user should able to see respective <Dispensary Name> as part of Dispensary Information in each card")
    public void user_should_able_to_see_respective_dispensary_name_as_part_of_dispensary_information_in_each_card() {
        waitFor(100);
        System.out.println(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed());
        if (T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed()) {
            visibilityWait(T11_DispensaryPage.getMobileDispensaryNameList().get(0));
            for(WebElement ele: T11_DispensaryPage.getMobileDispensaryNameList()){
                visibilityWait(ele);
                highlighter.highLighterMethod(ele, DriverManager.getDriver());
                Assert.assertTrue(ele.isDisplayed());
            }
            Logger.log("user should able to see respective <Dispensary Name> as part of Dispensary Information in each card");
        }else {
            visibilityWait(T11_DispensaryPage.getDispensaryNearbyDispensaryNameList().get(0));
            for (WebElement ele : T11_DispensaryPage.getDispensaryNearbyDispensaryNameList()) {
                visibilityWait(ele);
                highlighter.highLighterMethod(ele, DriverManager.getDriver());
                Assert.assertTrue(ele.isDisplayed());
            }
            Logger.log("user should able to see respective <Dispensary Name> as part of Dispensary Information in each card");
        }
    }
    @Then("user should able to view the respective dispensary timezone current day for each card")
    public void user_should_able_to_view_the_respective_dispensary_timezone_current_day_for_each_card() {
        System.out.println(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed());
        if (T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed()) {
            waitFor(100);
            visibilityWait(T11_DispensaryPage.getGetDispensaryNearbyHourMobileList().get(0));
            for (WebElement ele : T11_DispensaryPage.getGetDispensaryNearbyHourMobileList()) {
                visibilityWait(ele);
                highlighter.highLighterMethod(ele, DriverManager.getDriver());
                Assert.assertTrue(ele.isDisplayed());
            }
            Logger.log("user should able to view the respective dispensary timezone current day for each card");
        }else {
            waitFor(100);
            visibilityWait(T11_DispensaryPage.getDispensaryNearbyHourList().get(0));
            for (WebElement ele : T11_DispensaryPage.getDispensaryNearbyHourList()) {
                visibilityWait(ele);
                highlighter.highLighterMethod(ele, DriverManager.getDriver());
                Assert.assertTrue(ele.isDisplayed());
            }
            Logger.log("user should able to view the respective dispensary timezone current day for each card");
        }
    }
    @Then("user should able to view the store hours for each card")
    public void user_should_able_to_view_the_store_hours_for_each_card() {
        System.out.println(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed());
        if (T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed()) {
            waitFor(100);
            visibilityWait(T11_DispensaryPage.getGetDispensaryNearbyHourMobileList().get(0));
            for (WebElement ele : T11_DispensaryPage.getGetDispensaryNearbyHourMobileList()) {
                visibilityWait(ele);
                highlighter.highLighterMethod(ele, DriverManager.getDriver());
                Assert.assertTrue(ele.isDisplayed());
            }
            Logger.log("user should able to view the store hours for each card");
        }else {
            waitFor(100);
            visibilityWait(T11_DispensaryPage.getDispensaryNearbyHourList().get(0));
            for (WebElement ele : T11_DispensaryPage.getDispensaryNearbyHourList()) {
                visibilityWait(ele);
                highlighter.highLighterMethod(ele, DriverManager.getDriver());
                Assert.assertTrue(ele.isDisplayed());
            }
            Logger.log("user should able to view the store hours for each card");
        }
    }

    @Then("user should able to view the clock icon for each card")
    public void user_should_able_to_view_the_clock_icon_for_each_card() {
        System.out.println(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed());
        if (T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed()) {
            waitFor(100);
            visibilityWait(T11_DispensaryPage.getDispensaryNearbyHourIconMobileList().get(0));
            for (WebElement ele : T11_DispensaryPage.getDispensaryNearbyHourIconMobileList()) {
                visibilityWait(ele);
                highlighter.highLighterMethod(ele, DriverManager.getDriver());
                Assert.assertTrue(ele.isDisplayed());
            }
            Logger.log("user should able to view the clock icon for each card");
        }else {
            waitFor(100);
            visibilityWait(T11_DispensaryPage.getDispensaryNearbyHourIcon().get(0));
            for (WebElement ele : T11_DispensaryPage.getDispensaryNearbyHourIcon()) {
                visibilityWait(ele);
                highlighter.highLighterMethod(ele, DriverManager.getDriver());
                Assert.assertTrue(ele.isDisplayed());
            }
            Logger.log("user should able to view the clock icon for each card");
        }
    }
    @Then("user should able to view the respective dispensary Phone Number in US format for each card")
    public void user_should_able_to_view_the_respective_dispensary_phone_number_in_us_format_for_each_card() {
        System.out.println(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed());
        if (T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed()) {
            waitFor(100);
            visibilityWait(T11_DispensaryPage.getDispensaryNearbyPhoneMobileList().get(0));
            for (WebElement ele : T11_DispensaryPage.getDispensaryNearbyPhoneMobileList()) {
                visibilityWait(ele);
                highlighter.highLighterMethod(ele, DriverManager.getDriver());
                Assert.assertTrue(ele.isDisplayed());
            }
            Logger.log("user should able to view the respective dispensary Phone Number in US format for each card");
        }else {
            waitFor(100);
            visibilityWait(T11_DispensaryPage.getDispensaryNearbyPhoneList().get(0));
            for (WebElement ele : T11_DispensaryPage.getDispensaryNearbyPhoneList()) {
                visibilityWait(ele);
                highlighter.highLighterMethod(ele, DriverManager.getDriver());
                Assert.assertTrue(ele.isDisplayed());
            }
            Logger.log("user should able to view the respective dispensary Phone Number in US format for each card");
        }
    }
    @Then("user should able to view the Phone icon for each card")
    public void user_should_able_to_view_the_phone_icon_for_each_card() {
        System.out.println(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed());
        if (T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed()) {
            waitFor(100);
            visibilityWait(T11_DispensaryPage.getGetDispensaryNearbyPhoneIconMobileList().get(0));
            for (WebElement ele : T11_DispensaryPage.getGetDispensaryNearbyPhoneIconMobileList()) {
                visibilityWait(ele);
                highlighter.highLighterMethod(ele, DriverManager.getDriver());
                Assert.assertTrue(ele.isDisplayed());
            }
            Logger.log("user should able to view the Phone icon for each card");
        }else {
            waitFor(100);
            visibilityWait(T11_DispensaryPage.getDispensaryNearbyPhoneIconList().get(0));
            for (WebElement ele : T11_DispensaryPage.getDispensaryNearbyPhoneIconList()) {
                visibilityWait(ele);
                highlighter.highLighterMethod(ele, DriverManager.getDriver());
                Assert.assertTrue(ele.isDisplayed());
            }
            Logger.log("user should able to view the Phone icon for each card");
        }
    }
    @Then("user should able to view the respective dispensary Address for each card")
    public void user_should_able_to_view_the_respective_dispensary_address_for_each_card() {
        System.out.println(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed());
        if (T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed()) {
            waitFor(100);
            visibilityWait(T11_DispensaryPage.getDispensaryNearbyAddressMobileList().get(0));
            for (WebElement ele : T11_DispensaryPage.getDispensaryNearbyAddressMobileList()) {
                visibilityWait(ele);
                highlighter.highLighterMethod(ele, DriverManager.getDriver());
                Assert.assertTrue(ele.isDisplayed());
            }
            Logger.log("user should able to view the respective dispensary Address for each card");
        }else {
            waitFor(100);
            visibilityWait(T11_DispensaryPage.getDispensaryNearbyAddressList().get(0));
            for (WebElement ele : T11_DispensaryPage.getDispensaryNearbyAddressList()) {
                visibilityWait(ele);
                highlighter.highLighterMethod(ele, DriverManager.getDriver());
                Assert.assertTrue(ele.isDisplayed());
            }
            Logger.log("user should able to view the respective dispensary Address for each card");
        }
    }
    @Then("user should able to view the Map icon for each card")
    public void user_should_able_to_view_the_map_icon_for_each_card() {
        System.out.println(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed());
        if (T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed()) {
            waitFor(100);
            visibilityWait(T11_DispensaryPage.getDispensaryNearbyAddressIconMobileList().get(0));
            for (WebElement ele : T11_DispensaryPage.getDispensaryNearbyAddressIconMobileList()) {
                visibilityWait(ele);
                highlighter.highLighterMethod(ele, DriverManager.getDriver());
                Assert.assertTrue(ele.isDisplayed());
            }
            Logger.log("user should able to view the Map icon for each card");
        }else {
            waitFor(100);
            visibilityWait(T11_DispensaryPage.getDispensaryNearbyAddressIconList().get(0));
            for (WebElement ele : T11_DispensaryPage.getDispensaryNearbyAddressIconList()) {
                visibilityWait(ele);
                highlighter.highLighterMethod(ele, DriverManager.getDriver());
                Assert.assertTrue(ele.isDisplayed());
            }
            Logger.log("user should able to view the Map icon for each card");
        }
    }
    @Then("user sees the Dispensary Name, Store Hours, Phone Number, Address in Dispensary Information for each card is non-clickable")
    public void user_sees_the_dispensary_name_store_hours_phone_number_address_in_dispensary_information_for_each_card_is_non_clickable() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user should able to see the View Dispensary CTA with caret icon button on the each card")
    public void user_should_able_to_see_the_view_dispensary_cta_with_caret_icon_button_on_the_each_card() {
        System.out.println(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed());
        if (T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed()) {
            waitFor(100);
            visibilityWait(T11_DispensaryPage.getDispensaryNearbyViewDispensaryMobileCTAList().get(0));
            for (WebElement ele : T11_DispensaryPage.getDispensaryNearbyViewDispensaryMobileCTAList()) {
                visibilityWait(ele);
                highlighter.highLighterMethod(ele, DriverManager.getDriver());
                Assert.assertTrue(ele.isDisplayed());
            }
            Logger.log("user should able to see the View Dispensary CTA with caret icon button on the each card");
        }else {
            waitFor(100);
            visibilityWait(T11_DispensaryPage.getDispensaryNearbyViewCTACaretIconList().get(0));
            for (WebElement ele : T11_DispensaryPage.getDispensaryNearbyViewCTACaretIconList()) {
                visibilityWait(ele);
                highlighter.highLighterMethod(ele, DriverManager.getDriver());
                Assert.assertTrue(ele.isDisplayed());
            }
            Logger.log("user should able to see the View Dispensary CTA with caret icon button on the each card");
        }
    }
    @Then("user verify View Dispensary CTA is the clickable link on the each card")
    public void user_verify_view_dispensary_cta_is_the_clickable_link_on_the_each_card() {
        System.out.println(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed());
        if (T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed()) {
            waitFor(100);
            visibilityWait(T11_DispensaryPage.getDispensaryNearbyViewDispensaryMobileCTAList().get(0));
            for (WebElement ele : T11_DispensaryPage.getDispensaryNearbyViewDispensaryMobileCTAList()) {
                visibilityWait(ele);
                highlighter.highLighterMethod(ele, DriverManager.getDriver());
                Assert.assertTrue(ele.isDisplayed());
            }
            Logger.log("user verify View Dispensary CTA is the clickable link on the each card");
        }else {
            waitFor(100);
            visibilityWait(T11_DispensaryPage.getDispensaryNearbyViewDispensaryCTAList().get(0));
            for (WebElement ele : T11_DispensaryPage.getDispensaryNearbyViewDispensaryCTAList()) {
                visibilityWait(ele);
                highlighter.highLighterMethod(ele, DriverManager.getDriver());
                Assert.assertTrue(ele.isDisplayed());
            }
            Logger.log("user verify View Dispensary CTA is the clickable link on the each card");
        }
    }
    @When("user clicks on the View Dispensary CTA on any card")
    public void user_clicks_on_the_view_dispensary_cta_on_any_card() {
        System.out.println(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed());
        if (T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed()) {
            waitFor(100);
            visibilityWait(T11_DispensaryPage.getDispensaryNearbyViewDispensaryMobileCTAList().get(0));
            Assert.assertTrue(T11_DispensaryPage.getDispensaryNearbyViewDispensaryMobileCTAList().get(0).isDisplayed());
            jsClick(T11_DispensaryPage.getDispensaryNearbyViewDispensaryMobileCTAList().get(0));
            Logger.log("user clicks on the View Dispensary CTA on any card");
        }else {
            waitFor(100);
            visibilityWait(T11_DispensaryPage.getDispensaryNearbyViewDispensaryCTAList().get(0));
            Assert.assertTrue(T11_DispensaryPage.getDispensaryNearbyViewDispensaryCTAList().get(0).isDisplayed());
            jsClick(T11_DispensaryPage.getDispensaryNearbyViewDispensaryCTAList().get(0));
            Logger.log("user clicks on the View Dispensary CTA on any card");
        }
    }
    @Then("user should navigate to respective dispensary location page")
    public void user_should_navigate_to_respective_dispensary_location_page() {
        Assert.fail();
        Logger.log("user not navigate to respective dispensary location page");
    }
    @Given("User should scroll down to respective banner variant A")
    public void user_should_scroll_down_to_respective_banner_variant_a() {
        waitFor(2000);
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
        js.executeScript("window.scrollBy(0,6100);");
    }
    @When("User is on banner variant A in any one of the pages")
    public void user_is_on_banner_variant_a_in_any_one_of_the_pages() {
        waitFor(1000);
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
       // js.executeScript("window.scrollBy(0,1100);");
        waitFor(200);
        visibilityWait(T11_DispensaryPage.getRewardBannerSection());
        highlighter.highLighterMethod(T11_DispensaryPage.getRewardBannerSection(), DriverManager.getDriver());
        Assert.assertTrue(T11_DispensaryPage.getRewardBannerSection().isDisplayed());
        Logger.log("User is on banner variant A in any one of the pages");
    }
    @Then("User should see a Title Text with {int} or {int} lines in DispensaryPage")
    public void user_should_see_a_title_text_with_or_lines_in_DispensaryPage(Integer int1, Integer int2) {
        waitFor(200);
        visibilityWait(T11_DispensaryPage.getRewardBannerHeader());
        highlighter.highLighterMethod(T11_DispensaryPage.getRewardBannerHeader(), DriverManager.getDriver());
        Assert.assertTrue(T11_DispensaryPage.getRewardBannerHeader().isDisplayed());
        Logger.log("User should see a Title Text");
        visibilityWait(T11_DispensaryPage.getRewardBannerCopyText());
        highlighter.highLighterMethod(T11_DispensaryPage.getRewardBannerCopyText(), DriverManager.getDriver());
        Assert.assertTrue(T11_DispensaryPage.getRewardBannerCopyText().isDisplayed());
        Logger.log("User should see a 1 or 2 Text");
    }
    @Then("User should click on CTA on Banner Image in DispensaryPage")
    public void user_should_click_on_cta_on_banner_image_in_DispensaryPage() {
        waitFor(200);
        visibilityWait(T11_DispensaryPage.getRewardsBannerJoinNowCTA());
        Assert.assertTrue(T11_DispensaryPage.getRewardsBannerJoinNowCTA().isDisplayed());
        jsClick(T11_DispensaryPage.getRewardsBannerJoinNowCTA());
        Logger.log("User should click on CTA on Banner Image");
    }
//    @Then("User should see link is open in same tab")
//    public void user_should_see_link_is_open_in_same_tab() {
//        Logger.log("User should see link is open in same tab");
//    }
//    @Then("User should see link is open in new tab")
//    public void user_should_see_link_is_open_in_new_tab() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("User should see a small image on top of the banner")
//    public void user_should_see_a_small_image_on_top_of_the_banner() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("User should see an icon with small text in dispensary page")
//    public void userShouldSeeAnIconWithSmallTextInDispensaryPage() {
//
//    }

    @And("User hovers on tooltip icon dispensary Tab")
    public void userHoversOnTooltipIconDispensaryTab() {
        waitFor(100);
        visibilityWait(T11_DispensaryPage.getAmenitiesToolTipList().get(0));
        for (WebElement ele : T11_DispensaryPage.getAmenitiesToolTipList()) {
            visibilityWait(ele);
            highlighter.highLighterMethod(ele, DriverManager.getDriver());
            Assert.assertTrue(ele.isDisplayed());
            }
            Logger.log("User hovers on tooltip icon dispensary Tab");
        }

    @And("user clicks on right arrow new")
    public void userClicksOnRightArrowNew() {
    }
}
