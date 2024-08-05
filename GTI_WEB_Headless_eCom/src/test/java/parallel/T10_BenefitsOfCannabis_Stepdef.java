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
import pom.gti.T09_BlogIndexPage;
import pom.gti.T11_DispensaryPage;


public class T10_BenefitsOfCannabis_Stepdef extends CommonAction {
    pom.gti.T10_BenefitsOfCannabis benefitsOfCannabis = new pom.gti.T10_BenefitsOfCannabis(DriverManager.getDriver());
    T09_BlogIndexPage blog = new T09_BlogIndexPage(DriverManager.getDriver());
    T11_DispensaryPage T11_DispensaryPage = new T11_DispensaryPage(DriverManager.getDriver());
    Highlighter highlighter = new Highlighter();
    @And("user clicks on CANNABIS INSIDER menu from Global header")
    public void userClicksOnCANNABISINSIDERMenuFromGlobalHeader() {
        if(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed()){
            Assert.assertTrue(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed());
            jsClick(T11_DispensaryPage.getMobileHamburgerMenuCTA());
            Assert.assertTrue(T11_DispensaryPage.getMobileMenuOptionList().get(2).isDisplayed());
            jsClick(benefitsOfCannabis.getCannabisInsiderOptionCTA());
            Logger.log("user clicks on CANNABIS INSIDER menu from Global header");
        }else {
            visibilityWait(blog.getCannabisInsiderHeaderOption());
            jsClick(blog.getCannabisInsiderHeaderOption());
            Logger.log("User clicks on Cannabis Insider option in the header");
        }
    }
    @And("User clicks on BLOGS sub catogery")
    public void userClicksOnBLOGSSubCatogery() {
        if(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed()){
            Assert.assertTrue(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed());
            visibilityWait(benefitsOfCannabis.getCannabisInsiderOptionList().get(4));
            Assert.assertTrue(benefitsOfCannabis.getCannabisInsiderOptionList().get(4).isDisplayed());
            jsClick(benefitsOfCannabis.getBlogOptionCTA());
            Logger.log("User clicks on the Blogs sub category");
        }else {
            visibilityWait(blog.getBlogOption());
            highlighter.highLighterMethod(blog.getBlogOption(), DriverManager.getDriver());
            Assert.assertTrue(blog.getBlogOption().isDisplayed());
            Logger.log("User should be able to see Blogs sub category");
            jsClick(blog.getBlogOption());
            Logger.log("User clicks on the Blogs sub category");
        }
    }
    @When("user clicks on the Benefits of Cannabis resources blog")
    public void user_clicks_on_the_benefits_of_cannabis_resources_blog() {
        if(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed()) {
            visibilityWait(benefitsOfCannabis.getRecommendedResourcesHeader());
            javascriptScroll(benefitsOfCannabis.getShowMoreCTA());
            int i = 0;
            while (i<5){
                visibilityWait(benefitsOfCannabis.getRecommendedResourcesNextArrow());
                DriverManager.getDriver().findElement(By.xpath("//*[@data-testid='next-icon']")).click();
                //jsClick(benefitsOfCannabis.getRecommendedResourcesNextArrow());
                i++;
                waitFor(300);
            }
            visibilityWait(benefitsOfCannabis.getBenefitsOfCannabisRecommendedResourcescta());
            Assert.assertTrue(benefitsOfCannabis.getBenefitsOfCannabisRecommendedResourcescta().isDisplayed());
            jsClick(benefitsOfCannabis.getBenefitsOfCannabisRecommendedResourcescta());
            Logger.log("user clicks on the Benefits of Cannabis resources blog");
        }else {
            visibilityWait(benefitsOfCannabis.getWhasrightformeRecommendedResources());
            javascriptScroll(benefitsOfCannabis.getWhasrightformeRecommendedResources());
            visibilityWait(benefitsOfCannabis.getBenefitsOfCannabisRecommendedResourcescta());
            Assert.assertTrue(benefitsOfCannabis.getBenefitsOfCannabisRecommendedResourcescta().isDisplayed());
            jsClick(benefitsOfCannabis.getBenefitsOfCannabisRecommendedResourcescta());
            Logger.log("user clicks on the Benefits of Cannabis resources blog");
        }
    }
    @Then("User should land on the Benefits of cannabis article page")
    public void user_should_land_on_the_benefits_of_cannabis_article_page() {
        if(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed()) {
            visibilityWait(benefitsOfCannabis.getBenefitsOfCannabisHeader());
            Assert.assertTrue(benefitsOfCannabis.getBenefitsOfCannabisHeader().isDisplayed());
            Logger.log("User should land on the Benefits of cannabis article page");
        }else {
            visibilityWait(benefitsOfCannabis.getBenefitsOfCannabisHeader());
            Assert.assertTrue(benefitsOfCannabis.getBenefitsOfCannabisHeader().isDisplayed());
            Logger.log("User should land on the Benefits of cannabis article page");
        }
    }
    @When("User is in the Benefits of Cannabis blog page")
    public void user_is_in_the_benefits_of_cannabis_blog_page() {
        if(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed()) {
            visibilityWait(benefitsOfCannabis.getRecommendedResourcesHeader());
            javascriptScroll(benefitsOfCannabis.getShowMoreCTA());
            int i = 0;
            while (i<5){
                visibilityWait(benefitsOfCannabis.getRecommendedResourcesNextArrow());
                DriverManager.getDriver().findElement(By.xpath("//*[@data-testid='next-icon']")).click();
                //jsClick(benefitsOfCannabis.getRecommendedResourcesNextArrow());
                i++;
                waitFor(300);
            }
            visibilityWait(benefitsOfCannabis.getBenefitsOfCannabisRecommendedResourcescta());
            jsClick(benefitsOfCannabis.getBenefitsOfCannabisRecommendedResourcescta());
            Logger.log("user clicks on the Benefits of Cannabis resources blog");
            visibilityWait(benefitsOfCannabis.getBenefitsOfCannabisHeader());
            Assert.assertTrue(benefitsOfCannabis.getBenefitsOfCannabisHeader().isDisplayed());
            waitFor(500);
            Logger.log("User is in the Benefits of Cannabis blog page");
        }else {
            visibilityWait(benefitsOfCannabis.getWhasrightformeRecommendedResources());
            javascriptScroll(benefitsOfCannabis.getWhasrightformeRecommendedResources());
            visibilityWait(benefitsOfCannabis.getBenefitsOfCannabisRecommendedResourcescta());
            jsClick(benefitsOfCannabis.getBenefitsOfCannabisRecommendedResourcescta());
            Logger.log("user clicks on the Benefits of Cannabis resources blog");
            visibilityWait(benefitsOfCannabis.getBenefitsOfCannabisHeader());
            Assert.assertTrue(benefitsOfCannabis.getBenefitsOfCannabisHeader().isDisplayed());
            waitFor(500);
            Logger.log("User is in the Benefits of Cannabis blog page");
        }

    }
    @Then("User should be able to see breadcrumb  ‘Back to Cannabis Insider’ on Banner")
    public void user_should_be_able_to_see_breadcrumb_back_to_cannabis_insider_on_banner() {
        visibilityWait(benefitsOfCannabis.getBreadcrumb());
        Assert.assertTrue(benefitsOfCannabis.getBreadcrumb().isDisplayed());
        Logger.log("User should be able to see breadcrumb  ‘Back to Cannabis Insider’ on Banner");
    }

    @Then("user should able to view the hero image in background in BlogIndexPage")
    public void user_should_able_to_view_the_hero_image_in_background_in_BlogIndexPage() {
        waitFor(5000);
        visibilityWait(benefitsOfCannabis.getHeroArticleBannerImage());
        Assert.assertTrue(benefitsOfCannabis.getHeroArticleBannerImage().isDisplayed());
        Logger.log("user should able to view the hero image in background");
    }
    @Then("user should able to view the Article  title")
    public void user_should_able_to_view_the_article_title() {
        visibilityWait(benefitsOfCannabis.getBenefitsOfCannabisHeader());
        Assert.assertTrue(benefitsOfCannabis.getBenefitsOfCannabisHeader().isDisplayed());
        Logger.log("User should able to view the main title");
    }
    @And("the overview of a particular article banner")
    public void theOverviewOfAParticularArticleBanner() {
        visibilityWait(benefitsOfCannabis.getHeroArticleOverviewText());
        Assert.assertTrue(benefitsOfCannabis.getHeroArticleOverviewText().isDisplayed());
        Logger.log("User should able to view the overview of a particular article banner");
    }
    @Then("user should able to view the description or copy text of the article")
    public void user_should_able_to_view_the_description_or_copy_text_of_the_article() {
        visibilityWait(benefitsOfCannabis.getContentHeader());
        javascriptScroll(benefitsOfCannabis.getRichtextList().get(0));
        visibilityWait(benefitsOfCannabis.getRichtextList().get(0));
        Assert.assertTrue(benefitsOfCannabis.getRichtextList().get(0).isDisplayed());
        highlighter.highLighterMethod(benefitsOfCannabis.getRichtextList().get(0), DriverManager.getDriver());
        Logger.log("user should able to view the description or copy text of the article");
    }
    @Then("user should able to view the published date of the article when it got published")
    public void user_should_able_to_view_the_published_date_of_the_article_when_it_got_published() {
        visibilityWait(benefitsOfCannabis.getHeroArticleBannerDate());
        Assert.assertTrue(benefitsOfCannabis.getHeroArticleBannerDate().isDisplayed());
        Logger.log("user should able to view the published date of the article when it got published");
    }

    @Then("user should able to view “New” tag for the article which has less than nor equal to15 days from published date")
    public void user_should_able_to_view_new_tag_for_the_article_which_has_less_than_nor_equal_to15_days_from_published_date() {
        if (benefitsOfCannabis.getHeroArticleBannerNewLabel().isDisplayed()){
            visibilityWait(benefitsOfCannabis.getHeroArticleBannerDate());
            Assert.assertTrue(benefitsOfCannabis.getHeroArticleBannerDate().isDisplayed());
            Logger.log("user should able to view “New” tag for the article which has less than nor equal to15 days from published date");
        }else {
            Logger.log("user should not able to view “New” tag for the article which has less than nor equal to15 days from published date");
        }
    }
    @Then("user should able to view the Category tag as {string}  in the article section in BenefitsOfCannabis")
    public void userShouldAbleToViewTheCategoryTagAsInTheArticleSection_in_BenefitsOfCannabis(String arg0) {
        visibilityWait(benefitsOfCannabis.getHeroArticleBannerLabel());
        String labelText = benefitsOfCannabis.getHeroArticleBannerLabel().getText();
        System.out.println(labelText);
        if(labelText.equals("Cannabis 101")){
            Assert.assertTrue(benefitsOfCannabis.getHeroArticleBannerLabel().isDisplayed());
            Logger.log("user should able to view the Category tag as Cannabis 101  in the article section");
        }else{
            Logger.log("user not able to view the Category tag as Cannabis 101  in the article section");
        }
    }
    @Then("User should be able to view the table of content on the left side of the page")
    public void user_should_be_able_to_view_the_table_of_content_on_the_left_side_of_the_page() {
        visibilityWait(benefitsOfCannabis.getContentHeader());
        Assert.assertTrue(benefitsOfCannabis.getContentHeader().isDisplayed());
        Logger.log("User should be able to view the ContentHeader on the left side of the page");
        for (WebElement ele: benefitsOfCannabis.getTableOfContentList()){
            visibilityWait(ele);
            Assert.assertTrue(ele.isDisplayed());
            Logger.log("User should be able to view the table of content on the left side of the page");
        }
    }
    @Then("User should be able to view the section heading within the page in a link format in BenefitsOfCannabis")
    public void user_should_be_able_to_view_the_section_heading_within_the_page_in_a_link_format_in_BenefitsOfCannabis() {
        visibilityWait(benefitsOfCannabis.getContentHeader());
        Assert.assertTrue(benefitsOfCannabis.getContentHeader().isDisplayed());
        Logger.log("User should be able to view the ContentHeader on the left side of the page");
        for (WebElement ele: benefitsOfCannabis.getTableOfContentList()){
            visibilityWait(ele);
            Assert.assertTrue(ele.isDisplayed());
            Logger.log("User should be able to view the table of content on the left side of the page");
        }
    }
    @When("User clicks on the links in BenefitsOfCannabis")
    public void user_clicks_on_the_links_in_BenefitsOfCannabis() {
        visibilityWait(benefitsOfCannabis.getTableOfContentList().get(1));
        Assert.assertTrue(benefitsOfCannabis.getTableOfContentList().get(1).isDisplayed());
        //jsClick(benefitsOfCannabis.getTableOfContentList().get(1));
        DriverManager.getDriver().findElement(By.xpath("//h5[text()='Content']/parent::div/child::div/child::div/a[text()='Understanding the benefits of marijuana ']")).click();
        Logger.log("User clicks on the links");

    }
    @Then("User should be able to view the links getting highlighted in BlogIndexPage")
    public void user_should_be_able_to_view_the_links_getting_highlighted_in_BlogIndexPage() {
        visibilityWait(benefitsOfCannabis.getTableOfContentList().get(1));
        waitFor(2000);
        String highlightedColor = benefitsOfCannabis.getTableOfContentList().get(1).getCssValue("color");
        System.out.println(highlightedColor);
        Logger.log("User should be able to view the links getting highlighted");
    }
    @When("User hovers over the link")
    public void user_hovers_over_the_link() {
        visibilityWait(benefitsOfCannabis.getTableOfContentList().get(1));
        Assert.assertTrue(benefitsOfCannabis.getTableOfContentList().get(1).isDisplayed());
        mouseOver(benefitsOfCannabis.getTableOfContentList().get(1));
        Logger.log("User hovers over the link");
    }
    @Then("User is able to view the link is getting highlighted with a red line on top")
    public void user_is_able_to_view_the_link_is_getting_highlighted_with_a_red_line_on_top() {
        Assert.fail();
        Logger.log("User not able to view the link is getting highlighted with a red line on top");
    }
    @When("User is navigated to respective section on clicking any link")
    public void user_is_navigated_to_respective_section_on_clicking_any_link() {
        visibilityWait(benefitsOfCannabis.getTableOfContentList().get(1));
        Assert.assertTrue(benefitsOfCannabis.getTableOfContentList().get(1).isDisplayed());
        //jsClick(benefitsOfCannabis.getTableOfContentList().get(1));
        DriverManager.getDriver().findElement(By.xpath("//h5[text()='Content']/parent::div/child::div/child::div/a[text()='Understanding the benefits of marijuana ']")).click();
        Logger.log("User is navigated to respective section on clicking any link");
    }
    @When("User scrolls down the page to view a particular section")
    public void user_scrolls_down_the_page_to_view_a_particular_section() {
        visibilityWait(benefitsOfCannabis.getUnderstandingTheBenefitsOfMarijuanaHeader());
        Assert.assertTrue(benefitsOfCannabis.getUnderstandingTheBenefitsOfMarijuanaHeader().isDisplayed());
        Logger.log("User scrolls down the page to view a particular section");
    }
    @Then("The Link should also be highlighted")
    public void the_link_should_also_be_highlighted() {
        visibilityWait(benefitsOfCannabis.getTableOfContentList().get(1));
        waitFor(2000);
        String highlightedColor = benefitsOfCannabis.getTableOfContentList().get(1).getCssValue("color");
        System.out.println(highlightedColor);
        Logger.log("User should be able to view the The Link should also be highlighted");
    }

    @And("User should be able to click on any link in benefits TOC")
    public void userShouldBeAbleToClickOnAnyLinkInBenefitsTOC() {
        visibilityWait(benefitsOfCannabis.getTableOfContentList().get(1));
        Assert.assertTrue(benefitsOfCannabis.getTableOfContentList().get(1).isDisplayed());
        //jsClick(benefitsOfCannabis.getTableOfContentList().get(1));
        DriverManager.getDriver().findElement(By.xpath("//h5[text()='Content']/parent::div/child::div/child::div/a[text()='Understanding the benefits of marijuana ']")).click();
        Logger.log("User clicks on the links");
    }

    @Then("User should see the page being navigated to respective section in benefits TOC")
    public void userShouldSeeThePageBeingNavigatedToRespectiveSectionInBenefitsTOC() {
        visibilityWait(benefitsOfCannabis.getUnderstandingTheBenefitsOfMarijuanaHeader());
        Assert.assertTrue(benefitsOfCannabis.getUnderstandingTheBenefitsOfMarijuanaHeader().isDisplayed());
        Logger.log("User should see the page being navigated to respective section in benefits TOC");
    }
    @And("User is navigated to any large banner as Banner_C_ZeroNine")
    public void userIsNavigatedToAnyLargeBannerAsBanner_C_ZeroNine() {
        visibilityWait(benefitsOfCannabis.getC09Banner());
        javascriptScroll(benefitsOfCannabis.getC09Banner());
        waitFor(500);
        Assert.assertTrue(benefitsOfCannabis.getC09Banner().isDisplayed());
        Logger.log("User is navigated to any large banner as Banner_C09");
    }
    @Then("User should be able to see the anchor links ToC being scrolled in background behind")
    public void userShouldBeAbleToSeeTheAnchorLinksToCBeingScrolledInBackgroundBehind() {
        visibilityWait(benefitsOfCannabis.getUnderstandingTheBenefitsOfMarijuanaHeader());
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
        js.executeScript("window.scrollBy(0,-2000);");
        waitFor(500);
        Assert.assertTrue(benefitsOfCannabis.getUnderstandingTheBenefitsOfMarijuanaHeader().isDisplayed());
        Logger.log("User should be able to see the anchor links ToC being scrolled in background behind");
    }
    @When("User is viewing the title text in BenefitsOfCannabis")
    public void user_is_viewing_the_title_text_in_BenefitsOfCannabis() {
        visibilityWait(benefitsOfCannabis.getTableOfContentList().get(1));
        Assert.assertTrue(benefitsOfCannabis.getTableOfContentList().get(1).isDisplayed());
        //jsClick(benefitsOfCannabis.getTableOfContentList().get(1));
        DriverManager.getDriver().findElement(By.xpath("//h5[text()='Content']/parent::div/child::div/child::div/a[text()='Understanding the benefits of marijuana ']")).click();
        Logger.log("User clicks on the links");
        visibilityWait(benefitsOfCannabis.getUnderstandingTheBenefitsOfMarijuanaHeader());
        Assert.assertTrue(benefitsOfCannabis.getUnderstandingTheBenefitsOfMarijuanaHeader().isDisplayed());
        Logger.log("User is viewing the title text");
    }
    @Then("User is able to view the Title text in bold")
    public void user_is_able_to_view_the_title_text_in_bold() {
        visibilityWait(benefitsOfCannabis.getUnderstandingTheBenefitsOfMarijuanaHeader());
        waitFor(2000);
        String highlightedColor = benefitsOfCannabis.getUnderstandingTheBenefitsOfMarijuanaHeader().getCssValue("font-weight");
        System.out.println(highlightedColor);
        Logger.log("User is able to view the Title text in bold");
    }
//    @Then("User is able be able to view a red line above the title text")
//    public void user_is_able_be_able_to_view_a_red_line_above_the_title_text_in_BenefitsOfCannabis() {
//        visibilityWait(benefitsOfCannabis.getTableOfContentList().get(1));
//        waitFor(2000);
//        String highlightedColor = benefitsOfCannabis.getUnderstandingTheBenefitsOfMarijuanaHeader().getCssValue("border-top-color");
//        System.out.println(highlightedColor);
//        Logger.log("User is able be able to view a red line above the title text");
//    }
    @Then("User is able to view the text in in paragraph format in BenefitsOfCannabis")
    public void user_is_able_to_view_the_text_in_in_paragraph_format_in_BenefitsOfCannabis() {
        visibilityWait(benefitsOfCannabis.getContentHeader());
        javascriptScroll(benefitsOfCannabis.getRichtextList().get(0));
        visibilityWait(benefitsOfCannabis.getRichtextList().get(0));
        Assert.assertTrue(benefitsOfCannabis.getRichtextList().get(0).isDisplayed());
        highlighter.highLighterMethod(benefitsOfCannabis.getRichtextList().get(0), DriverManager.getDriver());
        Logger.log("User is able to view the text in in paragraph format");
    }
    @When("User is viewing the text in a quote")
    public void user_is_viewing_the_text_in_a_quote() {
        visibilityWait(benefitsOfCannabis.getUnderstandingTheBenefitsOfMarijuanaHeader());
        javascriptScroll(benefitsOfCannabis.getUnderstandingTheBenefitsOfMarijuanaHeader());
        Assert.assertTrue(benefitsOfCannabis.getUnderstandingTheBenefitsOfMarijuanaHeader().isDisplayed());
        visibilityWait(benefitsOfCannabis.getQuoteParagraph());
        Assert.assertTrue(benefitsOfCannabis.getQuoteParagraph().isDisplayed());
        Logger.log("User is viewing the text in a quote");
    }
    @Then(": User is able to view the text written inside a quote symbol")
    public void user_is_able_to_view_the_text_written_inside_a_quote_symbol() {
        visibilityWait(benefitsOfCannabis.getQuoteParagraphText());
        Assert.assertTrue(benefitsOfCannabis.getQuoteParagraphText().isDisplayed());
        Logger.log("User is able to view the text written inside a quote symbol");
    }
    @And("User is viewing the accordions in BenefitsOfCannabis")
    public void userIsViewingTheAccordions_in_BenefitsOfCannabis() {
        visibilityWait(benefitsOfCannabis.getAccordionsFaqList().get(0));
        javascriptScroll(benefitsOfCannabis.getAccordionsFaqList().get(0));
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
        js.executeScript("window.scrollBy(0,-500);");
        waitFor(500);
        Assert.assertTrue(benefitsOfCannabis.getAccordionsFaqList().get(0).isDisplayed());
        Logger.log("User is viewing the accordions");
    }
    @Then("User is able to view the each question with a {string} symbol")
    public void user_is_able_to_view_the_each_question_with_a_symbol(String string) {
        visibilityWait(benefitsOfCannabis.getAccordionsFaqButtonList().get(0));
        if (benefitsOfCannabis.getAccordionsFaqButtonList().size() == benefitsOfCannabis.getAccordionFaqButtonPlusIcon().size()) {
            for (WebElement ele : benefitsOfCannabis.getAccordionsFaqButtonList()) {
                visibilityWait(ele);
                Assert.assertTrue(ele.isDisplayed());
                Logger.log("User is able to view the each question");
            }
            for (WebElement ele: benefitsOfCannabis.getAccordionFaqButtonPlusIcon()){
                visibilityWait(ele);
                Assert.assertTrue(ele.isDisplayed());
                Logger.log("User is able to view the plus icon each question");
            }
        }else {
            Logger.log("User is not able to view the each question with a {string} symbol");
        }

    }
    @When("User clicks on {string} symbol")
    public void user_clicks_on_symbol(String string) {
        visibilityWait(benefitsOfCannabis.getAccordionFaqButtonPlusIcon().get(0));
        for (WebElement ele: benefitsOfCannabis.getAccordionFaqButtonPlusIcon()){
            visibilityWait(ele);
            Assert.assertTrue(ele.isDisplayed());
            jsClick(ele);
            Logger.log("User clicks on + symbol");
        }
    }
    @Then("The accordion expands")
    public void the_accordion_expands() {
        visibilityWait(benefitsOfCannabis.getAccordionFaqButtonPlusIcon().get(0));
        jsClick(benefitsOfCannabis.getAccordionFaqButtonPlusIcon().get(0));
        visibilityWait(benefitsOfCannabis.getAccordionFaqAnswerList().get(0));
        Assert.assertTrue(benefitsOfCannabis.getAccordionFaqAnswerList().get(0).isDisplayed());
        Logger.log("User verify The accordion expands");
    }
    @Then("User is able to view a {string} symbol")
    public void user_is_able_to_view_a_symbol(String string) {
        visibilityWait(benefitsOfCannabis.getAccordionFaqMinusIcon());
        Assert.assertTrue(benefitsOfCannabis.getAccordionFaqMinusIcon().isDisplayed());
        Logger.log("User is able to view a - symbol");
    }
    @Then("user should be able to see the big size image in 1192x606 pixel")
    public void user_should_be_able_to_see_the_big_size_image_in_1192x606_pixel() {
        visibilityWait(benefitsOfCannabis.getUnderstandingTheBenefitsOfMarijuanaHeader());
        javascriptScroll(benefitsOfCannabis.getUnderstandingTheBenefitsOfMarijuanaHeader());
        Assert.assertTrue(benefitsOfCannabis.getUnderstandingTheBenefitsOfMarijuanaHeader().isDisplayed());
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
        js.executeScript("window.scrollBy(0,-500);");
        visibilityWait(benefitsOfCannabis.getBigImage());
        Assert.assertTrue(benefitsOfCannabis.getBigImage().isDisplayed());
        Logger.log("user should be able to see the big size image in 1192x606 pixel");
    }
    @Then("user should be able to view the description under the image")
    public void user_should_be_able_to_view_the_description_under_the_image() {
        visibilityWait(benefitsOfCannabis.getBigImageDescription());
        Assert.assertTrue(benefitsOfCannabis.getBigImageDescription().isDisplayed());
        Logger.log("user should be able to view the description under the image");
    }
    @Then("user should be able to see the small size image in 736x368 pixel")
    public void user_should_be_able_to_see_the_small_size_image_in_736x368_pixel() {
        visibilityWait(benefitsOfCannabis.getSmallImage());
        javascriptScroll(benefitsOfCannabis.getSmallImage());
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
        js.executeScript("window.scrollBy(0,-700);");
        visibilityWait(benefitsOfCannabis.getSmallImage());
        Assert.assertTrue(benefitsOfCannabis.getSmallImage().isDisplayed());
        Logger.log("user should be able to see the small size image in 736x368 pixel");
    }
    @Then("user should be able to see the small images in grid format")
    public void user_should_be_able_to_see_the_small_images_in_grid_format_x() {
        visibilityWait(benefitsOfCannabis.getGridGalleryHeader());
        javascriptScroll(benefitsOfCannabis.getGridGalleryHeader());
        Logger.log("user scroll down to the grid section");
        visibilityWait(benefitsOfCannabis.getGridImage());
        Assert.assertTrue(benefitsOfCannabis.getGridImage().isDisplayed());
        Logger.log("user should be able to see the small images in grid format");
    }
    @When("user clicks any of the grid image")
    public void user_clicks_any_of_the_grid_image() {
        visibilityWait(benefitsOfCannabis.getGridGalleryHeader());
        javascriptScroll(benefitsOfCannabis.getGridGalleryHeader());
        Logger.log("user scroll down to the grid section");
        visibilityWait(benefitsOfCannabis.getGridEachImageList().get(0));
        Assert.assertTrue(benefitsOfCannabis.getGridEachImageList().get(0).isDisplayed());
        jsClick(benefitsOfCannabis.getGridEachImageList().get(0));
        Logger.log("user clicks any of the grid image");
    }
    @Then("user should see the image carousel in full screen showcases the images")
    public void user_should_see_the_image_carousel_in_full_screen_showcases_the_images() {
        Assert.fail();
        Logger.log("user not able see the image carousel in full screen showcases the images");
    }
    @Then("user should see the left and right arrow to scroll the imags")
    public void user_should_see_the_left_and_right_arrow_to_scroll_the_imags() {
        Assert.fail();
        Logger.log("user not see the left and right arrow to scroll the imags");
    }
    @Then("user should be able to see {string} by seeing on the slider")
    public void user_should_be_able_to_see_by_seeing_on_the_slider(String string) {
        Assert.fail();
        Logger.log("user not be able to see {string} by seeing on the slider");
    }
    @Then("user should see the {string} icon to close the full screen view")
    public void user_should_see_the_icon_to_close_the_full_screen_view(String string) {
        Assert.fail();
        Logger.log("user not see the {string} icon to close the full screen view");
    }
    @When("user clicks right arrow in the image")
    public void user_clicks_right_arrow_in_the_image() {
        Assert.fail();
        Logger.log("user clicks right arrow in the image");
    }
    @Then("user should see the carousel has been scrolled to next image")
    public void user_should_see_the_carousel_has_been_scrolled_to_next_image() {
        Assert.fail();
        Logger.log("user should see the carousel has been scrolled to next image");
    }
    @Then("user should see the slider count has been updated accordingly")
    public void user_should_see_the_slider_count_has_been_updated_accordingly() {
        Assert.fail();
        Logger.log("user should see the slider count has been updated accordingly");
    }
    @Given("user should see the right and left arrow to scroll the imags left to right")
    public void user_should_see_the_right_and_left_arrow_to_scroll_the_imags_left_to_right() {
        Assert.fail();
        Logger.log("user should see the right and left arrow to scroll the imags left to right");
    }
    @When("user clicks left arrow in the image")
    public void user_clicks_left_arrow_in_the_image() {
        Assert.fail();
        Logger.log("user clicks left arrow in the image");
    }
    @Then("user should see the carousel has been scrolled to previous image")
    public void user_should_see_the_carousel_has_been_scrolled_to_previous_image() {
        Assert.fail();
        Logger.log("user should see the carousel has been scrolled to previous imagee");
    }
    @When("user clicks the {string} icon")
    public void user_clicks_the_icon(String string) {
        Assert.fail();
        Logger.log("user should see the carousel has been scrolled to previous imagee");
    }
    @Then("user should see the full screen view has been closed")
    public void user_should_see_the_full_screen_view_has_been_closed() {
        Assert.fail();
        Logger.log("user should see the carousel has been scrolled to previous imagee");
    }
    @Then("user should see the images in grid format")
    public void user_should_see_the_images_in_grid_format() {
        Assert.fail();
        Logger.log("user should see the carousel has been scrolled to previous imagee");
    }
    @Then("User should see the source cards")
    public void user_should_see_the_source_cards_in_matrix() {
        visibilityWait(benefitsOfCannabis.getSourceCardList().get(0));
        for(WebElement ele: benefitsOfCannabis.getSourceCardList() ){
            visibilityWait(ele);
            Assert.assertTrue(ele.isDisplayed());
            Logger.log("User should see the source cards");
        }
    }
    @Then("User sees third party site name as the title text along with external icon in BenefitsOfCannabis")
    public void user_sees_third_party_site_name_as_the_title_text_along_with_external_icon_in_BenefitsOfCannabis() {
        visibilityWait(benefitsOfCannabis.getSourceCardTitleAndIconList().get(0));
        for(WebElement ele: benefitsOfCannabis.getSourceCardTitleAndIconList() ){
            visibilityWait(ele);
            Assert.assertTrue(ele.isDisplayed());
            Logger.log("User sees third party site name as the title text along with external icon");
        }
    }
    @Then("User should be able to view the copy text with a one line  briefing of the redirected external page.")
    public void user_should_be_able_to_view_the_copy_text_with_a_one_line_briefing_of_the_redirected_external_page() {
        visibilityWait(benefitsOfCannabis.getSourceCardCopyTextList().get(0));
        for(WebElement ele: benefitsOfCannabis.getSourceCardCopyTextList() ){
            visibilityWait(ele);
            Assert.assertTrue(ele.isDisplayed());
            Logger.log("User should be able to view the copy text with a one line  briefing of the redirected external page.");
        }
    }
    @When("User clicks on Title Text for external link.")
    public void user_clicks_on_title_text_for_external_link() {
        Assert.fail();
        Logger.log("User not able to clicks on Title Text for external link.");
    }
    @Then("User redirected to respective external site page in new tab.")
    public void user_redirected_to_respective_external_site_page_in_new_tab() {
        Logger.log("User not able redirected to respective external site page in new tab.");
    }
    @When("User clicks on Title Text for internal link.")
    public void user_clicks_on_title_text_for_internal_link() {
        Assert.fail();
        Logger.log("User not able to clicks on Title Text for internal link.");
    }
    @Then("User should be able to view the horizontal scroll with a left or right scroll")
    public void user_should_be_able_to_view_the_horizontal_scroll_with_a_left_or_right_scroll() {
        visibilityWait(benefitsOfCannabis.getSourceProgressbar());
        Assert.assertTrue(benefitsOfCannabis.getSourceProgressbar().isDisplayed());
        Logger.log("User should be able to view the horizontal scroll with a left or right scroll");
    }
    @When("User clicks on right arrow")
    public void user_clicks_on_right_arrow() {
        visibilityWait(benefitsOfCannabis.getSourceRightArrowCTA());
        Assert.assertTrue(benefitsOfCannabis.getSourceRightArrowCTA().isDisplayed());
        //jsClick(benefitsOfCannabis.getSourceRightArrowCTA());
        DriverManager.getDriver().findElement(By.xpath("//h3[text()='Sources']/parent::div/following-sibling::div/child::div[2]/child::div/child::div[3]/*[@data-testid='next-icon']")).click();
        Logger.log("User clicks on right arrow");
    }
    @Then("User should be able to view the sources moves {int} cards per slide")
    public void user_should_be_able_to_view_the_sources_moves_cards_per_slide(Integer int1) {
        visibilityWait(benefitsOfCannabis.getSourceCardList().get(0));
        if (benefitsOfCannabis.getSourceCardList().size()==3) {
            for (WebElement ele : benefitsOfCannabis.getSourceCardList()) {
                visibilityWait(ele);
                Assert.assertTrue(ele.isDisplayed());
                Logger.log("User should see the 3 source cards per slide");
            }
        }else {
            Logger.log("User not able to see the 3 source cards per slide");
        }
    }
    @Then("User should be able to view the indication of total sources")
    public void userShouldBeAbleToViewTheIndicationOfTotalSourcesOf() {
        visibilityWait(benefitsOfCannabis.getSourceProgressIndicator());
        Assert.assertTrue(benefitsOfCannabis.getSourceProgressIndicator().isDisplayed());
        jsClick(benefitsOfCannabis.getSourceProgressIndicator());
        Logger.log("User should be able to view the indication of total sources");
    }

    @And("user clicks on the left arrow in BenefitsOfCannabis")
    public void userClicksOnTheLeftArrow_in_BenefitsOfCannabis() {
        visibilityWait(benefitsOfCannabis.getSourceRightArrowCTA());
        Assert.assertTrue(benefitsOfCannabis.getSourceRightArrowCTA().isDisplayed());
        //jsClick(benefitsOfCannabis.getSourceRightArrowCTA());
        DriverManager.getDriver().findElement(By.xpath("//h3[text()='Sources']/parent::div/following-sibling::div/child::div[2]/child::div/child::div[3]/*[@data-testid='next-icon']")).click();
        Logger.log("User clicks on right arrow");
        visibilityWait(benefitsOfCannabis.getSourceLeftArrowCTA());
        Assert.assertTrue(benefitsOfCannabis.getSourceLeftArrowCTA().isDisplayed());
        //jsClick(benefitsOfCannabis.getSourceLeftArrowCTA());
        DriverManager.getDriver().findElement(By.xpath("//h3[text()='Sources']/parent::div/following-sibling::div/child::div[2]/child::div/child::div[3]/*[@data-testid='prev-icon']")).click();
        Logger.log("User clicks on left arrow");
    }
    @When("User is viewing variant A of the banner")
    public void user_is_viewing_variant_a_of_the_banner() {
        visibilityWait(benefitsOfCannabis.getC09Banner());
        Assert.assertTrue(benefitsOfCannabis.getC09Banner().isDisplayed());
        Logger.log("User is viewing variant A of the banner");
    }
    @Then("User should see a Title Text less than or equal to {int} lines for a Banner Image")
    public void user_should_see_a_title_text_less_than_or_equal_to_lines_for_a_banner_image(Integer int1) {
        visibilityWait(benefitsOfCannabis.getC09BannerTextTitle());
        Assert.assertTrue(benefitsOfCannabis.getC09BannerTextTitle().isDisplayed());
        Logger.log("User should see a Title Text less than or equal to {int} lines for a Banner Image");
    }
    @When("User clicks on an internal link CTA")
    public void user_clicks_on_an_internal_link_cta() {
        visibilityWait(benefitsOfCannabis.getC09BannerCTA());
        Assert.assertTrue(benefitsOfCannabis.getC09BannerCTA().isDisplayed());
        jsClick(benefitsOfCannabis.getC09BannerCTA());
        Logger.log("User clicks on an internal link CTA");
    }
    @Then("User should see link opening in the same tab")
    public void user_should_see_link_opening_in_the_same_tab() {
       Assert.fail();
        Logger.log("User not able see link opening in the same tab");
    }
    @When("User clicks on an external link CTA")
    public void user_clicks_on_an_external_link_cta() {
        visibilityWait(benefitsOfCannabis.getC09BannerCTA());
        Assert.assertTrue(benefitsOfCannabis.getC09BannerCTA().isDisplayed());
        jsClick(benefitsOfCannabis.getC09BannerCTA());
        Logger.log("User clicks on an internal link CTA");
    }
    @Then("User should see link opening in the new tab")
    public void user_should_see_link_opening_in_the_new_tab() {
        Assert.fail();
        Logger.log("User not able see link opening in the new tab");
    }
    @Then("User is able to view Product Carousel Section")
    public void user_is_able_to_view_product_carousel_section() {
        visibilityWait(benefitsOfCannabis.getProductCarousel());
        Assert.assertTrue(benefitsOfCannabis.getC09BannerCTA().isDisplayed());
        Logger.log("User is able to view Product Carousel Section");
    }

    @Then("user is able to view the Heading")
    public void user_is_able_to_view_the_heading() {
        visibilityWait(benefitsOfCannabis.getProductCarouselTitleText());
        Assert.assertTrue(benefitsOfCannabis.getProductCarouselTitleText().isDisplayed());
        Logger.log("user is able to view the Heading");
    }
    @Then("User is able to view the Product cards,")
    public void user_is_able_to_view_the_product_cards() {
        visibilityWait(benefitsOfCannabis.getProductCarouselcard());
        Assert.assertTrue(benefitsOfCannabis.getProductCarouselcard().isDisplayed());
        Logger.log("User is able to view the Product cards,");
    }
    @Then("User is able to view the navigation control")
    public void user_is_able_to_view_the_navigation_control() {
        visibilityWait(benefitsOfCannabis.getProductCarouselProgressBar());
        Assert.assertTrue(benefitsOfCannabis.getProductCarouselProgressBar().isDisplayed());
        Logger.log("User is able to view the navigation control");
    }
    @Then("User is able to view the CTA Button")
    public void user_is_able_to_view_the_cta_button() {
        if(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed()) {
            visibilityWait(benefitsOfCannabis.getProductCarouselMobileCTA());
            Assert.assertTrue(benefitsOfCannabis.getProductCarouselMobileCTA().isDisplayed());
            Logger.log("User is able to view the CTA Button");
        }else {
            visibilityWait(benefitsOfCannabis.getProductCarouselCTA());
            Assert.assertTrue(benefitsOfCannabis.getProductCarouselCTA().isDisplayed());
            Logger.log("User is able to view the CTA Button");
        }
    }
    @Then("User should be able to view the first {int} or {int} product cards in a row based on the product carousel variant used")
    public void user_should_be_able_to_view_the_first_or_product_cards_in_a_row_based_on_the_product_carousel_variant_used(Integer int1, Integer int2) {
        if(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed()) {
            visibilityWait(benefitsOfCannabis.getCarouselProductCardList().get(0));
            int i=0;
            while (i<2){
                visibilityWait(benefitsOfCannabis.getCarouselProductCardList().get(i));
                Assert.assertTrue(benefitsOfCannabis.getCarouselProductCardList().get(i).isDisplayed());
                i++;
            }
            Logger.log("User should be able to view the first 3 or 4 product cards in a row based on the product carousel variant used");
        }else {
            visibilityWait(benefitsOfCannabis.getCarouselProductCardList().get(0));
            int i = 0;
            while (i < 3) {
                visibilityWait(benefitsOfCannabis.getCarouselProductCardList().get(i));
                Assert.assertTrue(benefitsOfCannabis.getCarouselProductCardList().get(i).isDisplayed());
                i++;
            }
            Logger.log("User should be able to view the first 3 or 4 product cards in a row based on the product carousel variant used");
        }
    }
    @Then("User should be able to browse the products using left and right arrows in the slider")
    public void user_should_be_able_to_browse_the_products_using_left_and_right_arrows_in_the_slider() {
        if(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed()) {
            visibilityWait(benefitsOfCannabis.getProductCarouselRightArrowMobileCTA());
            Assert.assertTrue(benefitsOfCannabis.getProductCarouselRightArrowMobileCTA().isDisplayed());
            int i=0;
            while (i<3){
                DriverManager.getDriver().findElement(By.xpath("//a[@button-type='primary']/parent::div/child::div/child::div/div[@data-testid='progressbar-status']/following-sibling::div[2]/*[@data-testid='next-icon']")).click();
                waitFor(300);
                i++;
            }
            Logger.log("User clicks on the right arrow slider");
            visibilityWait(benefitsOfCannabis.getProductCarouselLeftArrowMobileCTA());
            Assert.assertTrue(benefitsOfCannabis.getProductCarouselLeftArrowMobileCTA().isDisplayed());
            int j = 0;
            while (j<3){
                DriverManager.getDriver().findElement(By.xpath("//a[@button-type='primary']/parent::div/child::div/child::div/div[@data-testid='progressbar-status']/following-sibling::div[2]/*[@data-testid='prev-icon']")).click();
                waitFor(300);
                j++;
            }
            Logger.log("User clicks on the left arrow slider");
            Logger.log("User should be able to browse the products using left and right arrows in the slider");
        }else {
            visibilityWait(benefitsOfCannabis.getProductCarouselRightArrowCTA());
            Assert.assertTrue(benefitsOfCannabis.getProductCarouselRightArrowCTA().isDisplayed());
            int i = 0;
            while (i < 3) {
                DriverManager.getDriver().findElement(By.xpath("//h3[text()='Test Title']/parent::div/parent::div/parent::div/child::div[1]/child::div[2]/child::div[3]/*[@data-testid='next-icon']")).click();
                waitFor(300);
                i++;
            }
            Logger.log("User clicks on the right arrow slider");
            visibilityWait(benefitsOfCannabis.getProductCarouselLeftArrowCTA());
            Assert.assertTrue(benefitsOfCannabis.getProductCarouselLeftArrowCTA().isDisplayed());
            int j = 0;
            while (j < 3) {
                DriverManager.getDriver().findElement(By.xpath("//h3[text()='Test Title']/parent::div/parent::div/parent::div/child::div[1]/child::div[2]/child::div[3]/*[@data-testid='prev-icon']")).click();
                waitFor(300);
                j++;
            }
            Logger.log("User clicks on the left arrow slider");
            Logger.log("User should be able to browse the products using left and right arrows in the slider");
        }
    }
    @When("user clicks on see all CTA")
    public void user_clicks_on_see_all_cta() {
        if(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed()) {
            visibilityWait(benefitsOfCannabis.getProductCarouselMobileCTA());
            Assert.assertTrue(benefitsOfCannabis.getProductCarouselMobileCTA().isDisplayed());
            jsClick(benefitsOfCannabis.getProductCarouselMobileCTA());
            Logger.log("user clicks on see all CTA");
        }else {
            visibilityWait(benefitsOfCannabis.getProductCarouselCTA());
            Assert.assertTrue(benefitsOfCannabis.getProductCarouselCTA().isDisplayed());
            jsClick(benefitsOfCannabis.getProductCarouselCTA());
            Logger.log("user clicks on see all CTA");
        }
    }
    @Then("User should be redirected to the respective PLP page with the appropriate filters")
    public void user_should_be_redirected_to_the_respective_plp_page_with_the_appropriate_filters() {
        Assert.fail();
        Logger.log("User not able to be redirected to the respective PLP page with the appropriate filters");
    }

    @When("User scroll down to Article Cards Section in BenefitsOfCannabis")
    public void user_scroll_down_to_article_cards_section_in_BenefitsOfCannabis() {
        visibilityWait(benefitsOfCannabis.getArticleCardHeader());
        javascriptScroll(benefitsOfCannabis.getArticleCardHeader());
        Assert.assertTrue(benefitsOfCannabis.getArticleCardHeader().isDisplayed());
        Logger.log("User scroll down to Article Cards Section");
    }

    @Then("User is viewing view Title text in BenefitsOfCannabis")
    public void user_is_viewing_view_title_text_in_BenefitsOfCannabis() {
        visibilityWait(benefitsOfCannabis.getArticleCardHeader());
        Assert.assertTrue(benefitsOfCannabis.getArticleCardHeader().isDisplayed());
        Logger.log("User is viewing view Title text");
    }


    @Then("User should be able to see latest {int} article cards related to Blogs and Recipe section only")
    public void user_should_be_able_to_see_latest_article_cards_related_to_blogs_and_recipe_section_only(Integer int1) {
        visibilityWait(benefitsOfCannabis.getArticleCardList().get(0));
        if (benefitsOfCannabis.getArticleCardList().size()==3){
                for (WebElement ele: benefitsOfCannabis.getArticleCardList()){
                    visibilityWait(ele);
                    Assert.assertTrue(ele.isDisplayed());
                }
            Logger.log("User should be able to see latest 3 article cards related to Blogs and Recipe section only");
        }else {
            Logger.log("User not be able to see latest 3 article cards related to Blogs and Recipe section only");
        }
    }

    @When("User should be able to view the article image for each card")
    public void user_should_be_able_to_view_the_article_image_for_each_card() {
        visibilityWait(benefitsOfCannabis.getArticleCardImageList().get(0));
        if (benefitsOfCannabis.getArticleCardImageList().size()==3) {
            for (WebElement ele : benefitsOfCannabis.getArticleCardImageList()) {
                visibilityWait(ele);
                Assert.assertTrue(ele.isDisplayed());
            }
            Logger.log("User should be able to view the article image for each card");
        }else {
            Logger.log("User not able to view the article image for each card");
        }
    }
    @When("user should is able to voew the Article title")
    public void user_should_is_able_to_voew_the_article_title() {
        visibilityWait(benefitsOfCannabis.getArticleCardTitleList().get(0));
        if (benefitsOfCannabis.getArticleCardTitleList().size()==3) {
            for (WebElement ele : benefitsOfCannabis.getArticleCardTitleList()) {
                visibilityWait(ele);
                Assert.assertTrue(ele.isDisplayed());
            }
            Logger.log("user should is able to voew the Article title");
        }else {
            Logger.log("user not able to voew the Article title");
        }
    }
    @When("user should be able to view the Article Desription")
    public void user_should_be_able_to_view_the_article_desription() {
        visibilityWait(benefitsOfCannabis.getArticleCardDescriptionList().get(0));
        if (benefitsOfCannabis.getArticleCardDescriptionList().size()==3) {
            for (WebElement ele : benefitsOfCannabis.getArticleCardDescriptionList()) {
                visibilityWait(ele);
                Assert.assertTrue(ele.isDisplayed());
            }
            Logger.log("user should be able to view the Article Desription");
        }else {
            Logger.log("user not able to view the Article Desription");
        }
    }
    @When("user should be able to view the Category Tags in BenefitsOfCannabis")
    public void user_should_be_able_to_view_the_category_tags_in_BenefitsOfCannabis() {
        Assert.fail();
        Logger.log("user not able to view the Category Tags");
    }
    @When("user should be able to view the New Tags")
    public void user_should_be_able_to_view_the_new_tags() {
        Logger.log("user should be able to view the New Tags");
    }
    @When("user should be able to view the Date in \\(MM-DD-YYYY) format")
    public void user_should_be_able_to_view_the_date_in_mm_dd_yyyy_format() {
        Logger.log("user should be able to view the Date in \\(MM-DD-YYYY) format");
    }
    @Then("User should be able to view the date in which article get published")
    public void user_should_be_able_to_view_the_date_in_which_article_get_published() {
        visibilityWait(benefitsOfCannabis.getArticleCardDateList().get(0));
        if (benefitsOfCannabis.getArticleCardDateList().size()==3) {
            for (WebElement ele : benefitsOfCannabis.getArticleCardDateList()) {
                visibilityWait(ele);
                Assert.assertTrue(ele.isDisplayed());
            }
            Logger.log("User should be able to view the date in which article get published");
        }else {
            Logger.log("User not able to view the date in which article get published");
        }
    }

    @Then("user should be able to view the Read the article CTA in BenefitsOfCannabis")
    public void user_should_be_able_to_view_the_read_the_article_cta_in_BenefitsOfCannabis() {
        visibilityWait(benefitsOfCannabis.getArticleCardReadTheArticleList().get(0));
        if (benefitsOfCannabis.getArticleCardReadTheArticleList().size()==3) {
            for (WebElement ele : benefitsOfCannabis.getArticleCardReadTheArticleList()) {
                visibilityWait(ele);
                Assert.assertTrue(ele.isDisplayed());
            }
            Logger.log("user should be able to view the Read the article CTA");
        }else {
            Logger.log("user not able to view the Read the article CTA");
        }
    }


    @When("user clicks on title text in BenefitsOfCannabis")
    public void user_clicks_on_title_text_in_BenefitsOfCannabis() {
        visibilityWait(benefitsOfCannabis.getArticleCardTitleList().get(0));
        Assert.assertTrue(benefitsOfCannabis.getArticleCardTitleList().get(0).isDisplayed());
        jsClick(benefitsOfCannabis.getArticleCardTitleList().get(0));
        Logger.log("user clicks on title text");
    }
    @When("user clicks on Read Article CTA in BenefitsOfCannabis")
    public void user_clicks_on_read_article_cta_in_BenefitsOfCannabis() {
        visibilityWait(benefitsOfCannabis.getArticleCardReadTheArticleList().get(0));
        Assert.assertTrue(benefitsOfCannabis.getArticleCardReadTheArticleList().get(0).isDisplayed());
        jsClick(benefitsOfCannabis.getArticleCardReadTheArticleList().get(0));
        Logger.log("user clicks on Read Article CTA");
    }
    @And("User scrolls down to Source Section.")
    public void userScrollsDownToSourceSection() {
        visibilityWait(benefitsOfCannabis.getSourceTOCHeader());
        javascriptScroll(benefitsOfCannabis.getSourceTOCHeader());
        Assert.assertTrue(benefitsOfCannabis.getSourceTOCHeader().isDisplayed());
        Logger.log("User scrolls down to Source Section.");
    }
    @Then("User should see CTA on Banner")
    public void userShouldSeeCTAOnBanner() {
        visibilityWait(benefitsOfCannabis.getC09BannerCTA());
        Assert.assertTrue(benefitsOfCannabis.getC09BannerCTA().isDisplayed());
        Logger.log("User should see CTA on Banner");
    }

    @And("User scrolls down to Product Carousel")
    public void userScrollsDownToProductCarousel() {
        visibilityWait(benefitsOfCannabis.getProductCarousel());
        Assert.assertTrue(benefitsOfCannabis.getC09BannerCTA().isDisplayed());
        javascriptScroll(benefitsOfCannabis.getProductCarousel());
        waitFor(700);
        Logger.log("User scrolls down to Product Carousel");

    }
    @And("User scrolls down to the banner section")
    public void userScrollsDownToTheBannerSection() {
        visibilityWait(benefitsOfCannabis.getThe_medical_benefit_of_the_marijuana_plant_in_the_scientific_literatureHeader());
        javascriptScroll(benefitsOfCannabis.getThe_medical_benefit_of_the_marijuana_plant_in_the_scientific_literatureHeader());
        Assert.assertTrue(benefitsOfCannabis.getThe_medical_benefit_of_the_marijuana_plant_in_the_scientific_literatureHeader().isDisplayed());
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
        js.executeScript("window.scrollBy(0,-1000);");
        Logger.log("User scrolls down to the banner section");
    }

    @Then("User should see an icon with small text in benefits")
    public void userShouldSeeAnIconWithSmallTextInBenefits() {
        visibilityWait(benefitsOfCannabis.getC09BannerSmallText());
        Assert.assertTrue(benefitsOfCannabis.getC09BannerSmallText().isDisplayed());
        Logger.log("User should see an icon with small text in benefits");
    }

    @Then("user should be redirected to the respective Blog&Recipe page")
    public void userShouldBeRedirectedToTheRespectiveBlogRecipePage() {
        Assert.fail();
        Logger.log("user not able be redirected to the respective Blog&Recipe page");
    }

    @Then("user should be redirected to the respective BlogandRecipe page")
    public void userShouldBeRedirectedToTheRespectiveBlogandRecipePage() {
        visibilityWait(benefitsOfCannabis.gethOWTOGETAMEDICALCARDINRHODEISLANDHeader());
        Assert.assertTrue(benefitsOfCannabis.gethOWTOGETAMEDICALCARDINRHODEISLANDHeader().isDisplayed());
        Logger.log("user should be redirected to the respective BlogandRecipe page");
    }


}
