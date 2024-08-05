package parallel;

import com.driverfactory.DriverManager;
import com.resuableMethods.CommonAction;
import com.resuableMethods.Highlighter;
import com.utilities.Logger;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pom.gti.T12_FaqPage;

public class T12_FaqPage_Stepdef extends CommonAction {
    T12_FaqPage faq = new T12_FaqPage(DriverManager.getDriver());
    Highlighter highlighter = new Highlighter();

    @Given("user landed on risecannabis Faq {string} website")
    public void user_launches_risecannabis_faqs_website(String string) throws Exception {
        DriverManager.getDriver().get(getData("risecannabisQA"));
        Logger.log("User on landed on risecannabis FAQs website");
    }
    @When("User is able to view the FAQ header banner already configured the FAQ components of FAQ")
    public void user_is_able_to_view_the_faq_header_banner_already_configured_the_faq_components_of_faq() {
        waitFor(200);
        highlighter.highLighterMethod(faq.getFaqHeroBanner(), DriverManager.getDriver());
        Assert.assertTrue(faq.getFaqHeroBanner().isDisplayed());
        Logger.log("User see the FAQ Hero Banner");
    }
    @Then("User should be able to view Title Text, Copy Text and Image")
    public void user_should_be_able_to_view_title_text_copy_text_and_image() {
        waitFor(200);
        highlighter.highLighterMethod(faq.getFaqHeroBannerTitleText(), DriverManager.getDriver());
        Assert.assertTrue(faq.getFaqHeroBannerTitleText().isDisplayed());
        Logger.log("User see the Title text in FAQ Hero Banner");
        waitFor(200);
        highlighter.highLighterMethod(faq.getFaqHeroBannerCopyText(), DriverManager.getDriver());
        Assert.assertTrue(faq.getFaqHeroBannerCopyText().isDisplayed());
        Logger.log("User see the Copy text in FAQ Hero Banner");
        visibilityWait(faq.getFaqHeroBannerImage());
        try {
            if (faq.getFaqHeroBannerImage().isDisplayed()) {
                highlighter.highLighterMethod(faq.getFaqHeroBannerImage(), DriverManager.getDriver());
                waitFor(200);
                Assert.assertTrue(faq.getFaqHeroBannerImage().isDisplayed());
                Logger.log("User see the Image in FAQ Hero Banner");
            }
        }
        catch (Exception e){
                highlighter.highLighterMethod(faq.getfaqHeroBannerImageMobile(), DriverManager.getDriver());
                waitFor(200);
                Assert.assertTrue(faq.getfaqHeroBannerImageMobile().isDisplayed());
                Logger.log("User see the Image in FAQ Hero Banner for mobile");
        }
//        if (faq.getFaqHeroBannerImage().isDisplayed()) {
//            highlighter.highLighterMethod(faq.getFaqHeroBannerImage(), DriverManager.getDriver());
//            Assert.assertTrue(faq.getFaqHeroBannerImage().isDisplayed());
//            Logger.log("User see the Image in FAQ Hero Banner");
//        } else {
//            visibilityWait(faq.getfaqHeroBannerImageMobile());
//            if (faq.getfaqHeroBannerImageMobile().isDisplayed()){
//                System.out.println("Here");
//                highlighter.highLighterMethod(faq.getfaqHeroBannerImageMobile(), DriverManager.getDriver());
//                waitFor(500);
//                Assert.assertTrue(faq.getfaqHeroBannerImageMobile().isDisplayed());
//                Logger.log("User see the Image in FAQ Hero Banner for mobile");
//            }
//        }
    }
    @When("User is on FAQ page with Table of Contents")
    public void user_is_on_faq_page_with_table_of_contents() {
        try {
            if(faq.getDrawerButtonMobile().isDisplayed()){
                waitFor(100);
                //highlighter.highLighterMethod(faq.getfaqHeroBannerImageMobile(), DriverManager.getDriver());
                jsClick(faq.getDrawerButtonMobile());
            }
        }catch (Exception e){
            visibilityWait(faq.getgeneralInquiriesHeader());
            javascriptScroll(faq.getgeneralInquiriesHeader());
        }
        highlighter.highLighterMethod(faq.getTopicsHeader(), DriverManager.getDriver());
        Assert.assertTrue(faq.getTopicsHeader().isDisplayed());
        Logger.log("User see the Table of Contents of Faq page");
    }
    @When("User should be able to click on any link")
    public void user_should_be_able_to_click_on_any_link() {
        visibilityWait(faq.getRiseDispensaries());
        Assert.assertTrue(faq.getRiseDispensaries().isDisplayed());
        jsClick(faq.getRiseDispensaries());
        waitFor(100);
        Logger.log("User see the click on the Rise Dispensaries link");
    }
    @Then("User should see the page being navigated to respective section")
    public void user_should_see_the_page_being_navigated_to_respective_section() {
    visibilityWait(faq.getriseDispensariesHeader());
    highlighter.highLighterMethod(faq.getriseDispensariesHeader(), DriverManager.getDriver());
    waitFor(200);
    Assert.assertTrue(faq.getriseDispensariesHeader().isDisplayed());
    Logger.log("User see the Rise Dispensaries header");
    }
    @When("user is viewing FAQ page")
    public void user_is_viewing_faq_page() {
        visibilityWait(faq.getFaqHeroBanner());
        Assert.assertTrue(faq.getFaqHeroBannerTitleText().isDisplayed());
        Logger.log("User see the Title text in FAQ Hero Banner");
    }
    @Then("user should be able to view the list of FAQs for the selected topic")
    public void user_should_be_able_to_view_the_list_of_fa_qs_for_the_selected_topic() {
        try {
            if(faq.getDrawerButtonMobile().isDisplayed()){
                waitFor(100);
                //highlighter.highLighterMethod(faq.getfaqHeroBannerImageMobile(), DriverManager.getDriver());
                jsClick(faq.getDrawerButtonMobile());
            }
        }catch (Exception e){
            visibilityWait(faq.getgeneralInquiriesHeader());
            javascriptScroll(faq.getgeneralInquiriesHeader());
        }
        visibilityWait(faq.getRiseDispensaries());
        jsClick(faq.getRiseDispensaries());
        Assert.assertTrue(faq.getTopicsHeader().isDisplayed());
        Logger.log("User see the click on the Rise Dispensaries link");
        for(WebElement RiseDispensaryQuestion : faq.getRiseDispensaryList()){
            visibilityWait(RiseDispensaryQuestion);
            Assert.assertTrue(RiseDispensaryQuestion.isDisplayed());
        }
        Logger.log("User see the view the list of FAQs for the selected topic");

    }
    @Then("user should be able click the + symbol to expand the answer")
    public void user_should_be_able_click_the_symbol_to_expand_the_answer() {
        for(WebElement RiseDispensaryPlusIcon : faq.getRiseDispensaryListPlusIcon()) {
            visibilityWait(RiseDispensaryPlusIcon);
            Assert.assertTrue(RiseDispensaryPlusIcon.isDisplayed());
            waitFor(100);
            jsClick(RiseDispensaryPlusIcon);
        }
        Logger.log("User see the able click the + symbol to expand the answer for selected topic");
    }
    @Then("user should be able to view the answer for the expanded FAQ")
    public void user_should_be_able_to_view_the_answer_for_the_expanded_faq() {
        for(int i =0; i<faq.getRiseDispensaryListPlusIcon().size(); i++){
            visibilityWait(faq.getRiseDispensaryListPlusIcon().get(i));
            jsClick(faq.getRiseDispensaryListPlusIcon().get(i));
            for (int j=i; j<faq.getRiseDispensaryListAnswer().size();){
                waitFor(200);
                visibilityWait(faq.getRiseDispensaryListAnswer().get(j));
                highlighter.highLighterMethod(faq.getRiseDispensaryListAnswer().get(j), DriverManager.getDriver());
                waitFor(100);
                Assert.assertTrue(faq.getRiseDispensaryListAnswer().get(j).isDisplayed());
                break;
            }
        }
        Logger.log("User see the answer for the expanded faq for selected topic");
    }
    @When("User is able to view the FAQ components in the FAQ section")
    public void user_is_able_to_view_the_faq_components_in_the_faq_section() {
        Assert.assertTrue(faq.getFaqHeroBannerTitleText().isDisplayed());
        Logger.log("User see the FAQ components in the FAQ section");
    }
    @Then("User should be able to view ‘+’ and ‘-‘ symbols")
    public void user_should_be_able_to_view_and_symbols() {
        waitFor(100);
        try {
            if(faq.getDrawerButtonMobile().isDisplayed()){
                waitFor(100);
                jsClick(faq.getDrawerButtonMobile());
            }
        }catch (Exception e){
            visibilityWait(faq.getTopicsHeader());
            javascriptScroll(faq.getTopicsHeader());
        }
        Assert.assertTrue(faq.getTopicsHeader().isDisplayed());
        waitFor(500);
        visibilityWait(faq.getGeneralInquiries());
        jsClick(faq.getGeneralInquiries());
    for (WebElement plusIcon: faq.getFaqQuestionPlusIconList()){
        waitFor(200);
        highlighter.highLighterMethod(plusIcon, DriverManager.getDriver());
        Assert.assertTrue(plusIcon.isDisplayed());
        }
        Logger.log("User able to view ‘+’symbols");
        waitFor(100);
        try {
            if(faq.getDrawerButtonMobile().isDisplayed()){
                waitFor(100);
                jsClick(faq.getDrawerButtonMobile());
                visibilityWait(faq.getRiseDispensaries());
                jsClick(faq.getRiseDispensaries());
            }
        }catch (Exception e){
            visibilityWait(faq.getRiseDispensaries());
            jsClick(faq.getRiseDispensaries());
        }
        visibilityWait(faq.getFaqQuestionPlusIconList().get(0));
    if (faq.getFaqQuestionPlusIconList().get(0).isDisplayed()) {
        waitFor(2000);
        jsClick(faq.getRiseDispensaryListPlusIcon().get(0));
        //faq.getRiseDispensaryListPlusIcon().get(0).click();
        waitFor(500);
       // highlighter.highLighterMethod(faq.getRiseDispensaryQuestionOneMinusIcon(), DriverManager.getDriver());
        waitFor(500);
        Assert.assertTrue(faq.getRiseDispensaryQuestionOneMinusIcon().isDisplayed());
        Logger.log("User able to view ‘-’symbols");
        }
    }
    @Then("On clicking the accordions should get expanded and collapsed respectively")
    public void on_clicking_the_accordions_should_get_expanded_and_collapsed_respectively() {
        for(WebElement RiseDispensaryPlusIcon : faq.getRiseDispensaryListPlusIcon()) {
            visibilityWait(RiseDispensaryPlusIcon);
            Assert.assertTrue(RiseDispensaryPlusIcon.isDisplayed());
            waitFor(100);
            jsClick(RiseDispensaryPlusIcon);
        }
        Logger.log("User see the accordions get expanded and collapsed respectively");
    }
    @Then("One accordion should get closed automatically when any other accordion is opened")
    public void one_accordion_should_get_closed_automatically_when_any_other_accordion_is_opened() {
        visibilityWait(faq.getRiseDispensaryListPlusIcon().get(0));
        jsClick(faq.getRiseDispensaryListPlusIcon().get(0));
        visibilityWait(faq.getRiseDispensaryListAnswer().get(0));
        highlighter.highLighterMethod(faq.getRiseDispensaryListAnswer().get(0), DriverManager.getDriver());
        waitFor(100);
        Assert.assertTrue(faq.getRiseDispensaryListAnswer().get(0).isDisplayed());
        visibilityWait(faq.getRiseDispensaryListPlusIcon().get(1));
        jsClick(faq.getRiseDispensaryListPlusIcon().get(1));
       highlighter.highLighterMethod(faq.getRiseDispensaryListAnswer().get(1), DriverManager.getDriver());
        waitFor(100);
        Assert.assertTrue(faq.getRiseDispensaryListAnswer().get(1).isDisplayed());
        Logger.log("User see the accordions get expanded and collapsed respectively");
    }
    @Then("User should be able to view the accordion getting expanded on clicking on the whole atom \\(question part) when closed.")
    public void user_should_be_able_to_view_the_accordion_getting_expanded_on_clicking_on_the_whole_atom_question_part_when_closed() {
        visibilityWait(faq.getRiseDispensarySecondAccordion());
        jsClick(faq.getRiseDispensarySecondAccordion());
        waitFor(500);
        visibilityWait(faq.getRiseDispensaryListAnswer().get(1));
        highlighter.highLighterMethod(faq.getRiseDispensaryListAnswer().get(1), DriverManager.getDriver());
        waitFor(100);
        Assert.assertTrue(faq.getRiseDispensaryListAnswer().get(1).isDisplayed());
        Logger.log("User see the accordion getting expanded on clicking on the whole atom \\(question part) when closed.");
    }
    @When("User is on banner help variant in the pages")
    public void user_is_on_banner_help_variant_in_the_pages() {
        waitFor(100);
        try {
            if(faq.getDrawerButtonMobile().isDisplayed()){
                waitFor(100);
                jsClick(faq.getDrawerButtonMobile());
                visibilityWait(faq.getMyCategory());
                jsClick(faq.getMyCategory());
                highlighter.highLighterMethod(faq.getMyCategory(), DriverManager.getDriver());
                Assert.assertTrue(faq.getMyCategory().isDisplayed());
            }
        }catch (Exception e){
            visibilityWait(faq.getTopicsHeader());
            javascriptScroll(faq.getmyCategoryHeader());
            visibilityWait(faq.getmyCategoryHeader());
            highlighter.highLighterMethod(faq.getmyCategoryHeader(), DriverManager.getDriver());
            Assert.assertTrue(faq.getmyCategoryHeader().isDisplayed());
        }
//        waitFor(100);
//        if(faq.getDrawerButtonMobile().isDisplayed()){
//            javascriptScroll(faq.getmyCategoryHeader());
//            visibilityWait(faq.getmyCategoryHeader());
//            highlighter.highLighterMethod(faq.getmyCategoryHeader(), DriverManager.getDriver());
//            Assert.assertTrue(faq.getmyCategoryHeader().isDisplayed());
//        }else {
//            javascriptScroll(faq.getmyCategoryHeader());
//            visibilityWait(faq.getmyCategoryHeader());
//            highlighter.highLighterMethod(faq.getmyCategoryHeader(), DriverManager.getDriver());
//            Assert.assertTrue(faq.getmyCategoryHeader().isDisplayed());
//        }
        visibilityWait(faq.getHelpBanner());
		highlighter.highLighterMethod(faq.getHelpBanner(), DriverManager.getDriver());
		Assert.assertTrue(faq.getHelpBanner().isDisplayed());
		Logger.log("User able to see the banner help variant in the pages");
    }
    @Then("User should see a Title Text")
    public void user_should_see_a_title_text() {
        visibilityWait(faq.getHelpBannerTitleText());
        highlighter.highLighterMethod(faq.getHelpBannerTitleText(), DriverManager.getDriver());
        Assert.assertTrue(faq.getHelpBannerTitleText().isDisplayed());
        Logger.log("User able to see a Title Text");
    }
    @Then("User should see a Copy Text")
    public void user_should_see_a_copy_text() {
        visibilityWait(faq.getHelpBannerCopyText());
        highlighter.highLighterMethod(faq.getHelpBannerCopyText(), DriverManager.getDriver());
        Assert.assertTrue(faq.getHelpBannerCopyText().isDisplayed());
        Logger.log("User able to see a Copy Text");
    }
    @When("User is on banner help variant in any one of the pages")
    public void user_is_on_banner_help_variant_in_any_one_of_the_pages() {
        javascriptScroll(faq.getmyCategoryHeader());
        visibilityWait(faq.getmyCategoryHeader());
        //highlighter.highLighterMethod(faq.getmyCategoryHeader(), DriverManager.getDriver());
        Assert.assertTrue(faq.getmyCategoryHeader().isDisplayed());
        visibilityWait(faq.getHelpBanner());
        highlighter.highLighterMethod(faq.getHelpBanner(), DriverManager.getDriver());
        Assert.assertTrue(faq.getHelpBanner().isDisplayed());
        Logger.log("User able to see the banner help variant in any one of the pages");
    }
    @Then("User should see the CTA.")
    public void user_should_see_the_cta() {
        visibilityWait(faq.getHelpBannerContactUsButton());
        highlighter.highLighterMethod(faq.getHelpBannerContactUsButton(), DriverManager.getDriver());
        Assert.assertTrue(faq.getHelpBannerContactUsButton().isDisplayed());
        Logger.log("User able to see the banner help the CTA.");
    }
    @Then("User should click on CTA to redirect to contact us page")
    public void user_should_click_on_cta_to_redirect_to_contact_us_page() {
        waitFor(500);
        mouseOver(faq.getHelpBannerContactUsButton());
        waitFor(500);
        Logger.log("User able to click on CTA to redirect to contact us page");
    }
    @Given("user sees the FAQ page")
    public void user_sees_the_faq_page() {
        Assert.assertTrue(faq.getFaqHeroBanner().isDisplayed());
        Logger.log("User see the FAQ Hero Banner");
    }
    @Given("user should be able to view the Anchor links of topics located on the left side of the page")
    public void user_should_be_able_to_view_the_anchor_links_of_topics_located_on_the_left_side_of_the_page() {
        waitFor(100);
        try {
            if(faq.getDrawerButtonMobile().isDisplayed()){
                waitFor(100);
                jsClick(faq.getDrawerButtonMobile());
                visibilityWait(faq.getTopicsHeader());
            }
        }catch (Exception e){
            visibilityWait(faq.getRiseDispensaries());
            jsClick(faq.getRiseDispensaries());
            visibilityWait(faq.getTopicsHeader());
            javascriptScroll(faq.getTopicsHeader());
        }
		highlighter.highLighterMethod(faq.getTopicsHeader(), DriverManager.getDriver());
		Assert.assertTrue(faq.getTopicsHeader().isDisplayed());
		waitFor(200);
		highlighter.highLighterMethod(faq.getGeneralInquiries(), DriverManager.getDriver());
		Assert.assertTrue(faq.getGeneralInquiries().isDisplayed());
		waitFor(200);
		highlighter.highLighterMethod(faq.getRiseDispensaries(), DriverManager.getDriver());
		Assert.assertTrue(faq.getRiseDispensaries().isDisplayed());
		waitFor(200);
		highlighter.highLighterMethod(faq.getPayment(), DriverManager.getDriver());
		Assert.assertTrue(faq.getPayment().isDisplayed());
		waitFor(200);
		highlighter.highLighterMethod(faq.getOrdersAndOffers(), DriverManager.getDriver());
		Assert.assertTrue(faq.getOrdersAndOffers().isDisplayed());
		waitFor(200);
		highlighter.highLighterMethod(faq.getMyCategory(), DriverManager.getDriver());
		Assert.assertTrue(faq.getMyCategory().isDisplayed());
		Logger.log("User see the Topics header");
		Logger.log("User see the Anchor links of topics");
    }
    @When("user should be able scroll down the page")
    public void user_should_be_able_scroll_down_the_page() {
        visibilityWait(faq.getorderAndOffersHeader());
		waitFor(500);
		javascriptScroll(faq.getorderAndOffersHeader());
		waitFor(500);
		highlighter.highLighterMethod(faq.getorderAndOffersHeader(), DriverManager.getDriver());
		waitFor(200);
		Assert.assertTrue(faq.getorderAndOffersHeader().isDisplayed());
		Logger.log("User scroll down till Order & Offers header");
    }
    @Then("user should see the anchor links of topics should stay fixed in the desktop")
    public void user_should_see_the_anchor_links_of_topics_should_stay_fixed_in_the_desktop() {
        visibilityWait(faq.getTopicsHeader());
		waitFor(200);
		highlighter.highLighterMethod(faq.getTopicsHeader(), DriverManager.getDriver());
		Assert.assertTrue(faq.getTopicsHeader().isDisplayed());
		waitFor(200);
		highlighter.highLighterMethod(faq.getGeneralInquiries(), DriverManager.getDriver());
		Assert.assertTrue(faq.getGeneralInquiries().isDisplayed());
		waitFor(200);
		highlighter.highLighterMethod(faq.getRiseDispensaries(), DriverManager.getDriver());
		Assert.assertTrue(faq.getRiseDispensaries().isDisplayed());
		waitFor(200);
		highlighter.highLighterMethod(faq.getPayment(), DriverManager.getDriver());
		Assert.assertTrue(faq.getPayment().isDisplayed());
		waitFor(200);
		highlighter.highLighterMethod(faq.getOrdersAndOffers(), DriverManager.getDriver());
		Assert.assertTrue(faq.getOrdersAndOffers().isDisplayed());
		waitFor(200);
		highlighter.highLighterMethod(faq.getMyCategory(), DriverManager.getDriver());
		Assert.assertTrue(faq.getMyCategory().isDisplayed());
		waitFor(200);
		Logger.log("User see the Topics header");
		Logger.log("User see the Anchor links of topics");
    }
    @When("user should be able scroll down to end of the page")
    public void user_should_be_able_scroll_down_to_end_of_the_page() {
        javascriptScroll(faq.getmyCategoryHeader());
		visibilityWait(faq.getmyCategoryHeader());
		//highlighter.highLighterMethod(faq.getmyCategoryHeader(), DriverManager.getDriver());
		Assert.assertTrue(faq.getmyCategoryHeader().isDisplayed());
		Logger.log("User scroll down till my Category Header header");
    }
    @Then("user should see banner help at end of the accordion FAQ")
    public void user_should_see_banner_help_at_end_of_the_accordion_faq() {
        visibilityWait(faq.getHelpBanner());
		highlighter.highLighterMethod(faq.getHelpBanner(), DriverManager.getDriver());
		waitFor(2000);
		Assert.assertTrue(faq.getHelpBanner().isDisplayed());
		Logger.log("User able to see the banner help");
    }
    @When("user sees FAQ page")
    public void user_sees_faq_page() {
        visibilityWait(faq.getFaqHeroBanner());
        Assert.assertTrue(faq.getFaqHeroBanner().isDisplayed());
        Logger.log("User see the FAQ Hero Banner");
    }
    @Then("user should see the global header")
    public void user_should_see_the_global_header() {
        visibilityWait(faq.getFaqHeader());
        Assert.assertTrue(faq.getFaqHeader().isDisplayed());
        Logger.log("User see the global header");
    }
    @Then("user scroll down to the page")
    public void user_scroll_down_to_the_page() {
        javascriptScroll(faq.getHelpBanner());
        Assert.assertTrue(faq.getHelpBanner().isDisplayed());
        Logger.log("User scroll down to the page");
    }
    @Then("user should see the footer")
    public void user_should_see_the_footer() {
        visibilityWait(faq.getFaqFooter());
        Assert.assertTrue(faq.getFaqFooter().isDisplayed());
        Logger.log("User should able see the footer");
        for (int i = 0; i<=100;){
            mouseOver(faq.getgeneralInquiriesHeader());
            i++;
        }
    }

    @And("user scroll down to footer section")
    public void userScrollDownToFooterSection() {
        visibilityWait(faq.getFooterLicenceSection());
        Assert.assertTrue(faq.getFooterLicenceSection().isDisplayed());
        javascriptScroll(faq.getFooterLicenceSection());
        Logger.log("user scroll down to footer section");
    }

    @And("user clicks on {string} link available in the Footer section")
    public void userClicksOnLinkAvailableInTheFooterSection(String arg0) {
        visibilityWait(faq.getFooterFaqOption());
        Assert.assertTrue(faq.getFooterFaqOption().isDisplayed());
        jsClick(faq.getFooterFaqOption());
        Logger.log("user clicks on faq link available in the Footer section");
    }
}
