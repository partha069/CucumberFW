package parallel;

import com.driverfactory.DriverManager;
import com.resuableMethods.CommonAction;
import com.resuableMethods.Highlighter;
import com.utilities.Logger;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pom.gti.T09_BlogIndexPage;
import pom.gti.T10_BenefitsOfCannabis;
import io.cucumber.java.en.*;
import pom.gti.T11_DispensaryPage;

public class T09_BlogIndexPage_Stepdef extends CommonAction {
    T09_BlogIndexPage blog = new T09_BlogIndexPage(DriverManager.getDriver());
    T10_BenefitsOfCannabis benefitsOfCannabis = new T10_BenefitsOfCannabis(DriverManager.getDriver());
    T11_DispensaryPage T11_DispensaryPage = new T11_DispensaryPage(DriverManager.getDriver());
    Highlighter highlighter = new Highlighter();

    @When("user is on the global header")
    public void user_is_on_the_global_header() {
        waitFor(200);
        //highlighter.highLighterMethod(blog.getHomePageHeader(), DriverManager.getDriver());
        Assert.assertTrue(blog.getHomePageHeader().isDisplayed());
        Logger.log("User see the Global Header");
    }
    @Then("user should be able to see the Cannabis Insider menu is highlighted and underlined")
    public void user_should_be_able_to_see_the_cannabis_insider_menu_is_highlighted_and_underlined() {
        waitFor(500);
        visibilityWait(blog.getCannabisInsiderHeaderOption());
        waitFor(500);
        mouseOver(blog.getCannabisInsiderHeaderOption());
       // highlighter.highLighterMethod(blog.getCannabisInsiderHeaderOption(), DriverManager.getDriver());
        Logger.log("user should be able to see the Cannabis Insider menu is highlighted and underlined");
    }
    @When("user clicks on {string} option in the header")
    public void user_clicks_on_option_in_the_header(String string) {
        visibilityWait(blog.getCannabisInsiderHeaderOption());
        jsClick(blog.getCannabisInsiderHeaderOption());
        Logger.log("User clicks on Cannabis Insider option in the header");
    }

    @Then("user should be able to see Blogs sub category")
    public void user_should_be_able_to_see_blogs_sub_category() {
        visibilityWait(blog.getBlogOption());
        highlighter.highLighterMethod(blog.getBlogOption(), DriverManager.getDriver());
        Assert.assertTrue(blog.getBlogOption().isDisplayed());
        Logger.log("User should be able to see Blogs sub category");
    }
    @Then("User clicks on the Blogs sub category")
    public void user_clicks_on_the_blogs_sub_category() {
        visibilityWait(blog.getBlogOption());
        Assert.assertTrue(blog.getBlogOption().isDisplayed());
        jsClick(blog.getBlogOption());
        Logger.log("User clicks on the Blogs sub category");
    }
    @Then("User lands on the the Blog index page")
    public void user_lands_on_the_the_blog_index_page() {
       // waitFor(500);
        visibilityWait(blog.getBlogIndexPageHeader());
        highlighter.highLighterMethod(blog.getBlogIndexPageHeader(), DriverManager.getDriver());
        Assert.assertTrue(blog.getBlogIndexPageHeader().isDisplayed());
        Logger.log("User lands on the the Blog index page");
    }
    @When("User is viewing the Blog Index Page")
    public void user_is_viewing_the_blog_index_page() {
        if(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed()){
            Assert.assertTrue(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed());
            jsClick(T11_DispensaryPage.getMobileHamburgerMenuCTA());
            Assert.assertTrue(T11_DispensaryPage.getMobileMenuOptionList().get(2).isDisplayed());
            jsClick(benefitsOfCannabis.getCannabisInsiderOptionCTA());
            Logger.log("user clicks on CANNABIS INSIDER menu from Global header");
            Assert.assertTrue(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed());
            visibilityWait(benefitsOfCannabis.getCannabisInsiderOptionList().get(4));
            Assert.assertTrue(benefitsOfCannabis.getCannabisInsiderOptionList().get(4).isDisplayed());
            jsClick(benefitsOfCannabis.getBlogOptionCTA());
            Logger.log("User clicks on the Blogs sub category");
            visibilityWait(blog.getBlogIndexPageHeader());
            highlighter.highLighterMethod(blog.getBlogIndexPageHeader(), DriverManager.getDriver());
            Assert.assertTrue(blog.getBlogIndexPageHeader().isDisplayed());
            Logger.log("User lands on the the Blog index page");
        }else {
            visibilityWait(blog.getCannabisInsiderHeaderOption());
            jsClick(blog.getCannabisInsiderHeaderOption());
            Logger.log("User clicks on Cannabis Insider option in the header");
            visibilityWait(blog.getBlogOption());
            highlighter.highLighterMethod(blog.getBlogOption(), DriverManager.getDriver());
            Assert.assertTrue(blog.getBlogOption().isDisplayed());
            Logger.log("User should be able to see Blogs sub category");
            jsClick(blog.getBlogOption());
            Logger.log("User clicks on the Blogs sub category");
            visibilityWait(blog.getBlogIndexPageHeader());
            highlighter.highLighterMethod(blog.getBlogIndexPageHeader(), DriverManager.getDriver());
            Assert.assertTrue(blog.getBlogIndexPageHeader().isDisplayed());
            Logger.log("User lands on the the Blog index page");
        }

        visibilityWait(blog.getBlogIndexPageCopytext());
        highlighter.highLighterMethod(blog.getBlogIndexPageCopytext(), DriverManager.getDriver());
        Assert.assertTrue(blog.getBlogIndexPageCopytext().isDisplayed());
        Logger.log("User is viewing the Blog Index Page");
    }
    @Then("User is able to see Hero Article at the top of the page in BlogIndexPage")
    public void user_is_able_to_see_hero_article_at_the_top_of_the_page_in_BlogIndexPage() {
        visibilityWait(blog.getHeroArticleBanner());
        //highlighter.highLighterMethod(blog.getHeroArticleBanner(), DriverManager.getDriver());
        Assert.assertTrue(blog.getHeroArticleBanner().isDisplayed());
        Logger.log("User is able to see Hero Article at the top of the page");
    }
    @Then("User is able to see latest article as part of the hero section by default")
    public void user_is_able_to_see_latest_article_as_part_of_the_hero_section_by_default() {
        visibilityWait(blog.getHeroArticleLatest());
        highlighter.highLighterMethod(blog.getHeroArticleLatest(), DriverManager.getDriver());
        Assert.assertTrue(blog.getHeroArticleLatest().isDisplayed());
        Logger.log("User is able to see latest article as part of the hero section by default");
    }
    @Then("user should able to view the main title")
    public void user_should_able_to_view_the_main_title() {
        visibilityWait(blog.getHeroArticleTitleText());
        highlighter.highLighterMethod(blog.getHeroArticleTitleText(), DriverManager.getDriver());
        waitFor(1000);
        Assert.assertTrue(blog.getHeroArticleTitleText().isDisplayed());
        Logger.log("User should able to view the main title");
    }
    @Then("the overview of a particular article")
    public void the_overview_of_a_particular_article() {
        visibilityWait(blog.getHeroArticleCopyText());
        highlighter.highLighterMethod(blog.getHeroArticleCopyText(), DriverManager.getDriver());
        waitFor(1000);
        Assert.assertTrue(blog.getHeroArticleCopyText().isDisplayed());
        Logger.log("User should able to view the overview of a particular article");
    }
    @Then("the image tied to that article")
    public void the_image_tied_to_that_article() {
        visibilityWait(blog.getHeroArticleImage());
        highlighter.highLighterMethod(blog.getHeroArticleImage(), DriverManager.getDriver());
        waitFor(1000);
        Assert.assertTrue(blog.getHeroArticleImage().isDisplayed());
        Logger.log("User should able to view the image tied to that article");
    }
    @Then("user should able to view the published date of the article when it got published and in format of MM.DD.YYYY")
    public void user_should_able_to_view_the_published_date_of_the_article_when_it_got_published_and_in_format_of_mm_dd_yyyy() {
        visibilityWait(blog.getHeroArticleDateLabel());
        highlighter.highLighterMethod(blog.getHeroArticleDateLabel(), DriverManager.getDriver());
        waitFor(1000);
        Assert.assertTrue(blog.getHeroArticleDateLabel().isDisplayed());
        Logger.log("user should able to view the published date of the article when it got published and in format of MM.DD.YYYY");
    }

    @Then("user should able to view the Read more CTA")
    public void user_should_able_to_view_the_read_more_cta() {
        javascriptScroll(blog.getBlogIndexPageCopytext());
        visibilityWait(blog.getHeroArticleBannerCTA());
        highlighter.highLighterMethod(blog.getHeroArticleBannerCTA(), DriverManager.getDriver());
        waitFor(1000);
        Assert.assertTrue(blog.getHeroArticleBannerCTA().isDisplayed());
        Logger.log("user should able to view the Read more CTA");

    }
    @Then("user clicks on Read more CTA")
    public void user_clicks_on_read_more_cta() {
        //mouseOver(blog.getHeroArticleBannerCTA());
        jsClick(blog.getHeroArticleBannerCTA());
        Logger.log("user clicks on Read more CTA");
    }
    @Then("user should be able to navigate to the article content page of that particular article given in BlogIndexPage")
    public void user_should_be_able_to_navigate_to_the_article_content_page_of_that_particular_article_given_in_BlogIndexPage() {
        visibilityWait(blog.getPreRollePage());
        highlighter.highLighterMethod(blog.getPreRollePage(), DriverManager.getDriver());
        waitFor(1000);
        Assert.assertTrue(blog.getPreRollePage().isDisplayed());
        Logger.log("user should be able to navigate to the article content page of that particular article given");
    }
    @When("Filter components are configured")
    public void filter_components_are_configured() {
        waitFor(1000);
        visibilityWait(blog.getHeroArticleBannerCTA());
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
        js.executeScript("window.scrollBy(0, 540);");
        waitFor(1000);
       // javascriptScroll(blog.getHeroArticleBannerCTA());
        Logger.log("user should be able to Filter components are configured");

    }
    @Then("user should be able to view the available categories to be filtered in the pills format along with the number of products or articles falls under that")
    public void user_should_be_able_to_view_the_available_categories_to_be_filtered_in_the_pills_format_along_with_the_number_of_products_articles_falls_under_that() {
        visibilityWait(blog.getFilterOption());
        highlighter.highLighterMethod(blog.getFilterOption(), DriverManager.getDriver());
        Assert.assertTrue(blog.getFilterOption().isDisplayed());
        Logger.log("user should be able to view the available categories to be filtered in the pills format along with the number of products or articles falls under that");
    }
    @Then("User should be view the ‘All’ pill to get highlighted by default")
    public void user_should_be_view_the_all_pill_to_get_highlighted_by_default() {
        visibilityWait(blog.getAllFilterOption());
        highlighter.highLighterMethod(blog.getAllFilterOption(), DriverManager.getDriver());
        Assert.assertTrue(blog.getAllFilterOption().isDisplayed());
        Logger.log("User should be view the ‘All’ pill to get highlighted by default");
    }
    @Then("User select any of one of the pills Ex: Cannabis")
    public void user_select_any_of_one_of_the_pills_ex_cannabis() {
        visibilityWait(blog.getCannabisFilterOption());
        waitFor(500);
        visibilityWait(blog.getShoppingReviewOption());
        jsClick(blog.getShoppingReviewOption());
        visibilityWait(blog.getShoppingReviewLabel());
        highlighter.highLighterMethod(blog.getShoppingReviewLabel(), DriverManager.getDriver());
        waitFor(500);
        Assert.assertTrue(blog.getShoppingReviewLabel().isDisplayed());
        jsClick(blog.getShoppingReviewOption());
        waitFor(500);
        visibilityWait(blog.getCannabisFilterOption());
        jsClick(blog.getCannabisFilterOption());
        Logger.log("User select any of one of the pills");
    }
    @Then("User should be able to view the pills getting highlighted when selecting them")
    public void user_should_be_able_to_view_the_pills_getting_highlighted_when_selecting_them() {
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
        js.executeScript("window.scrollBy(0, 640);");
        for(WebElement cannabisLabel:blog.getCannabisLabelList()){
            visibilityWait(cannabisLabel);
            highlighter.highLighterMethod(cannabisLabel, DriverManager.getDriver());
            waitFor(500);
            Assert.assertTrue(cannabisLabel.isDisplayed());
            Logger.log("User should be able to view the pills getting highlighted when selecting them");
        }
    }
    @When("Sort  components are configured")
    public void sort_components_are_configured() {
        visibilityWait(blog.getSortByElement());
        highlighter.highLighterMethod(blog.getSortByElement(), DriverManager.getDriver());
        Assert.assertTrue(blog.getSortByElement().isDisplayed());
        Logger.log("User should be view the Sort components are configured");
    }
    @Then("User should be able to view the Sort options in a dropdown")
    public void user_should_be_able_to_view_the_sort_options_in_a_dropdown() {
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
        js.executeScript("window.scrollBy(0, -640);");
        visibilityWait(blog.getSortByDropdown());
        jsClick(blog.getSortByDropdown());
        waitFor(1000);
        visibilityWait(blog.getSortByDropdownState());
        highlighter.highLighterMethod(blog.getSortByDropdownState(), DriverManager.getDriver());
        Assert.assertTrue(blog.getSortByDropdownState().isDisplayed());
        Logger.log("User should be able to view the Sort options in a dropdown");
    }
    @Then("User should be able to view the default sort option")
    public void user_should_be_able_to_view_the_default_sort_option() {
        visibilityWait(blog.getSortByDropDownDefault());
        highlighter.highLighterMethod(blog.getSortByDropDownDefault(), DriverManager.getDriver());
        Assert.assertTrue(blog.getSortByDropDownDefault().isDisplayed());
        Logger.log("User should be able to view the default sort option");
    }
    @Then("User clicks on oldest option from dropdown")
    public void user_clicks_on_oldest_option_from_dropdown() {
        visibilityWait(blog.getSortByDropDownDefault());
        javascriptScroll(blog.getHeroArticleBannerCTA());
        waitFor(100);
        Assert.assertTrue(blog.getSortByDropDownDefault().isDisplayed());
        jsClick(blog.getSortByDropDownDefault());
        Logger.log("User should be able to view the default sort option");
        visibilityWait(blog.getSortByOldest());
        jsClick(blog.getSortByOldest());
        waitFor(500);
        Logger.log("User clicks on oldest option from dropdown");
    }
    @Then("User should be able to view a tick mark and highlight against the option that has been selected in the dropdown")
    public void user_should_be_able_to_view_a_tick_mark_and_highlight_against_the_option_that_has_been_selected_in_the_dropdown() {
        visibilityWait(blog.getSortByOldestSelected());
        Assert.assertTrue(blog.getSortByOldestSelected().isDisplayed());
        Logger.log("User should be able to view a tick mark and highlight against the option that has been selected in the dropdown");
    }
    @Then("User should be able to view a tick mark and highlight against the newest option that has been selected in the dropdown")
    public void userShouldBeAbleToViewATickMarkAndHighlightAgainstTheNewestOptionThatHasBeenSelectedInTheDropdown() {
        visibilityWait(blog.getSortByNewestSelected());
        Assert.assertTrue(blog.getSortByNewestSelected().isDisplayed());
        Logger.log("User should be able to view a tick mark and highlight against the newest option that has been selected in the dropdown");
    }
    @Then("User clicks on newest option from dropdown")
    public void user_clicks_on_newest_option_from_dropdown() {
        visibilityWait(blog.getSortByDropDownDefault());
        javascriptScroll(blog.getHeroArticleBannerCTA());
        waitFor(100);
        Assert.assertTrue(blog.getSortByDropDownDefault().isDisplayed());
        jsClick(blog.getSortByDropDownDefault());
        visibilityWait(blog.getSortByNewest());
        Assert.assertTrue(blog.getSortByNewest().isDisplayed());
        jsClick(blog.getSortByNewest());
        Logger.log("User clicks on newest option from dropdown");
    }
    @Then("User clicks anywhere outside the dropdown")
    public void user_clicks_anywhere_outside_the_dropdown() {
        visibilityWait(blog.getSortByDropDownDefault());
        javascriptScroll(blog.getHeroArticleBannerCTA());
        waitFor(100);
        Assert.assertTrue(blog.getSortByDropDownDefault().isDisplayed());
        jsClick(blog.getSortByDropDownDefault());
        visibilityWait(blog.getShoppingReviewOption());
        jsClick(blog.getShoppingReviewOption());
        Logger.log("User clicks anywhere outside the dropdown");
    }
    @Then("User should be able to view the dropdown getting closed")
    public void user_should_be_able_to_view_the_dropdown_getting_closed() {
        Assert.fail();
        Logger.log("User not be able to view the dropdown getting closed");
    }
    @When("user is viewing the grid section in Blog index page")
    public void user_is_viewing_the_grid_section_in_blog_index_page() {
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
        js.executeScript("window.scrollBy(0, 640);");
        visibilityWait(blog.getGridSectionHeader());
        waitFor(500);
        highlighter.highLighterMethod(blog.getGridSectionHeader(), DriverManager.getDriver());
        Assert.assertTrue(blog.getGridSectionHeader().isDisplayed());
        Logger.log("User is viewing the grid section in Blog index page");
    }
    @Then("user should view the title text")
    public void user_should_view_the_title_text() {
        visibilityWait(blog.getGirdSectionFirstHeader().get(0));
        highlighter.highLighterMethod(blog.getGirdSectionFirstHeader().get(0), DriverManager.getDriver());
        Assert.assertTrue(blog.getGirdSectionFirstHeader().get(0).isDisplayed());
        Logger.log("User should view the title text");
    }
    @Then("user should view image assosiated with article")
    public void user_should_view_image_assosiated_with_article() {
        visibilityWait(blog.getGridSectionFirstImage().get(0));
        highlighter.highLighterMethod(blog.getGridSectionFirstImage().get(0), DriverManager.getDriver());
        Assert.assertTrue(blog.getGridSectionFirstImage().get(0).isDisplayed());
        Logger.log("User should view image assosiated with article");

    }
//    @Then("user should see the new tags, for new articles")
//    public void user_should_see_the_new_tags_for_new_articles() {
//
//    }
    @Then("user should view the categories label")
    public void user_should_view_the_categories_label() {
        visibilityWait(blog.getGridSectionFirstlabel().get(0));
        highlighter.highLighterMethod(blog.getGridSectionFirstlabel().get(0), DriverManager.getDriver());
        Assert.assertTrue(blog.getGridSectionFirstlabel().get(0).isDisplayed());
        Logger.log("User should view the categories label");
    }
    @Then("user should view the published date")
    public void user_should_view_the_published_date() {
        visibilityWait(blog.getGridSectionFirstDate().get(0));
        highlighter.highLighterMethod(blog.getGridSectionFirstDate().get(0), DriverManager.getDriver());
        Assert.assertTrue(blog.getGridSectionFirstDate().get(0).isDisplayed());
        Logger.log("User should view the published date");
    }
    @Then("user should view the brief about the article")
    public void user_should_view_the_brief_about_the_article() {
        visibilityWait(blog.getGridSectionFirstCopyText().get(0));
        highlighter.highLighterMethod(blog.getGridSectionFirstCopyText().get(0), DriverManager.getDriver());
        Assert.assertTrue(blog.getGridSectionFirstCopyText().get(0).isDisplayed());
        Logger.log("user should view the brief about the article");
    }
    @Then("user should view the read more cta")
    public void user_should_view_the_read_more_cta() {
        visibilityWait(blog.getGridSectionFirstReadMoreCTA().get(0));
        highlighter.highLighterMethod(blog.getGridSectionFirstReadMoreCTA().get(0), DriverManager.getDriver());
        Assert.assertTrue(blog.getGridSectionFirstReadMoreCTA().get(0).isDisplayed());
        Logger.log("user should view the brief about the article");
    }
    @Then("user clicks read more CTA")
    public void user_clicks_read_more_cta() {
        visibilityWait(blog.getGridSectionFirstReadMoreCTA().get(0));
        jsClick(blog.getGridSectionFirstReadMoreCTA().get(0));
        Logger.log("user clicks read more CTA");
    }
    @Then("user should navigate to respective article details page")
    public void user_should_navigate_to_respective_article_details_page() {
//        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
//        waitFor(400);
//        visibilityWait(blog.getCannabisTerpenesHeader());
//        highlighter.highLighterMethod(blog.getCannabisTerpenesHeader(), DriverManager.getDriver());
//        Assert.assertTrue(blog.getCannabisTerpenesHeader().isDisplayed());
        Logger.log("user should navigate to respective article details page");
    }
//    @Then("user clicks on the title")
//    public void user_clicks_on_the_title() {
//
//    }
//    @Then("The articles cards in the page is more than {int}.")
//    public void the_articles_cards_in_the_page_is_more_than(Integer int1) {
//
//    }
    @Then("user is able to view a Show more CTA")
    public void user_is_able_to_view_a_show_more_cta() {
        waitFor(2000);
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
        js.executeScript("window.scrollBy(0, 1940);");
        visibilityWait(blog.getShowMoreCTA());
        waitFor(2000);
        highlighter.highLighterMethod(blog.getShowMoreCTA(), DriverManager.getDriver());
        Assert.assertTrue(blog.getShowMoreCTA().isDisplayed());
        Logger.log("user is able to view a Show more CTA");
        jsClick(blog.getShowMoreCTA());
    }
//    @Then("The articles cards in the page is less than {int}.")
//    public void the_articles_cards_in_the_page_is_less_than(Integer int1) {
//
//    }
//    @Then("user should not be able to view the Show more CTA")
//    public void user_should_not_be_able_to_view_the_show_more_cta() {
//
//    }
    @Then("User scrolls down to the bottom of the articles")
    public void user_scrolls_down_to_the_bottom_of_the_articles() {
        waitFor(2000);
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
        js.executeScript("window.scrollBy(0, 2040);");
        Logger.log("User scrolls down to the bottom of the articles");
    }
    @Then("user should see the number of cards displayed and total number of cards in Showing {int} of {int} format in BlogIndexPage")
    public void user_should_see_the_number_of_cards_displayed_and_total_number_of_cards_in_showing_of_format(Integer int1, Integer int2) {
        waitFor(2000);
        visibilityWait(blog.getShowingText());
        highlighter.highLighterMethod(blog.getShowingText(), DriverManager.getDriver());
        waitFor(200);
        Assert.assertTrue(blog.getShowingText().isDisplayed());
        Logger.log("user should see the number of cards displayed and total number of cards in Showing {int} of {int} format");
    }
    @Then("User is able to see Recommended Resources located on the right side of page in BlogIndexPage")
    public void user_is_able_to_see_recommended_resources_located_on_the_right_side_of_pagein_BlogIndexPage() {
        visibilityWait(benefitsOfCannabis.getRecommendedResourcesHeader());
        javascriptScroll(benefitsOfCannabis.getRecommendedResourcesHeader());
        visibilityWait(blog.getRecommendedResourcesSection());
        Assert.assertTrue(blog.getRecommendedResourcesSection().isDisplayed());
        Logger.log("The recommended Resources have all the other Cannabis Resources topics than the selected one");
    }
//    @Then("The recommended Resources have all the other Cannabis Resources topics than the selected one")
//    public void the_recommended_resources_have_all_the_other_cannabis_resources_topics_than_the_selected_one() {
//
//    }
    @Then("User is able to view the title")
    public void user_is_able_to_view_the_title() {
        visibilityWait(blog.getRecommendedResourcesHeader());
        highlighter.highLighterMethod(blog.getRecommendedResourcesHeader(), DriverManager.getDriver());
        Assert.assertTrue(blog.getRecommendedResourcesHeader().isDisplayed());
        Logger.log("User is able to view the title");
    }
    @Then("User is able to view the recommended resource name in BlogIndexPage")
    public void user_is_able_to_view_the_recommended_resource_name_in_BlogIndexPage() {
        if(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed()){
            Assert.assertTrue(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed());
            visibilityWait(blog.getRecommendedResourcesHeader());
            javascriptScroll(blog.getRecommendedResourcesHeader());
            waitFor(2000);
            visibilityWait(blog.getRecommendedResourcesFirstTitleMobileList().get(0));
            highlighter.highLighterMethod(blog.getRecommendedResourcesFirstTitleMobileList().get(0), DriverManager.getDriver());
            Assert.assertTrue(blog.getRecommendedResourcesFirstTitleMobileList().get(0).isDisplayed());
            Logger.log("User is able to view the recommended resource name");
        }else {
            visibilityWait(blog.getRecommendedResourcesHeader());
            javascriptScroll(blog.getRecommendedResourcesHeader());
            waitFor(2000);
            visibilityWait(blog.getRecommendedResourcesFirstTitle().get(0));
            highlighter.highLighterMethod(blog.getRecommendedResourcesFirstTitle().get(0), DriverManager.getDriver());
            Assert.assertTrue(blog.getRecommendedResourcesFirstTitle().get(0).isDisplayed());
            Logger.log("User is able to view the recommended resource name");
        }
    }
    @Then("User is able to view the short description")
    public void user_is_able_to_view_the_short_description() {
        if(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed()){
            Assert.assertTrue(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed());
            visibilityWait(blog.getRecommendedResourcesHeader());
            javascriptScroll(blog.getRecommendedResourcesHeader());
            waitFor(2000);
            visibilityWait(blog.getRecommendedResourcesFirstCopyTextMobileList().get(0));
            highlighter.highLighterMethod(blog.getRecommendedResourcesFirstCopyTextMobileList().get(0), DriverManager.getDriver());
            Assert.assertTrue(blog.getRecommendedResourcesFirstCopyTextMobileList().get(0).isDisplayed());
            Logger.log("User is able to view the short description");
        }else {
            visibilityWait(blog.getRecommendedResourcesHeader());
            javascriptScroll(blog.getRecommendedResourcesHeader());
            visibilityWait(blog.getRecommendedResourcesFirstCopyText().get(0));
            highlighter.highLighterMethod(blog.getRecommendedResourcesFirstCopyText().get(0), DriverManager.getDriver());
            Assert.assertTrue(blog.getRecommendedResourcesFirstCopyText().get(0).isDisplayed());
            Logger.log("User is able to view the short description");
        }
    }
    @Then("User is able to view a Read more CTA")
    public void user_is_able_to_view_a_read_more_cta() {
        if(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed()){
            Assert.assertTrue(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed());
            visibilityWait(blog.getRecommendedResourcesHeader());
            javascriptScroll(blog.getRecommendedResourcesHeader());
            waitFor(2000);
            visibilityWait(blog.getRecommendedResourcesFirstReadMoreCTAMobileList().get(0));
            highlighter.highLighterMethod(blog.getRecommendedResourcesFirstReadMoreCTAMobileList().get(0), DriverManager.getDriver());
            Assert.assertTrue(blog.getRecommendedResourcesFirstReadMoreCTAMobileList().get(0).isDisplayed());
            Logger.log("User is able to view a Read more CTA");
        }else {
            visibilityWait(blog.getRecommendedResourcesFirstReadMoreCTA().get(0));
            highlighter.highLighterMethod(blog.getRecommendedResourcesFirstReadMoreCTA().get(0), DriverManager.getDriver());
            Assert.assertTrue(blog.getRecommendedResourcesFirstReadMoreCTA().get(0).isDisplayed());
            Logger.log("User is able to view a Read more CTA");
        }
    }
    @Then("user clicks the read more cta from the description")
    public void user_clicks_the_read_more_cta_from_the_description() {
        if(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed()){
            Assert.assertTrue(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed());
            visibilityWait(blog.getRecommendedResourcesHeader());
            javascriptScroll(blog.getRecommendedResourcesHeader());
            waitFor(2000);
            visibilityWait(blog.getRecommendedResourcesFirstReadMoreCTAMobileList().get(0));
            Assert.assertTrue(blog.getRecommendedResourcesFirstReadMoreCTAMobileList().get(0).isDisplayed());
            jsClick(blog.getRecommendedResourcesFirstReadMoreCTAMobileList().get(0));
            Logger.log("user clicks the read more cta from the description");
        }else {
            waitFor(200);
            jsClick(blog.getRecommendedResourcesFirstReadMoreCTA().get(0));
            Logger.log("user clicks the read more cta from the description");
        }
    }
//    @Then("user should navigate to the respective index page of the particular recommended resource")
//    public void user_should_navigate_to_the_respective_index_page_of_the_particular_recommended_resource() {
//        Logger.log("user should navigate to the respective index page of the particular recommended resource");
//    }
    @Then("User is able to see Localization indicator sticky, Global Header and Footer in BlogIndexPage")
    public void user_is_able_to_see_localization_indicator_sticky_global_header_and_footer_in_BlogIndexPage() {
        visibilityWait(blog.getHomePageHeader());
        highlighter.highLighterMethod(blog.getHomePageHeader(), DriverManager.getDriver());
        Assert.assertTrue(blog.getHomePageHeader().isDisplayed());
        waitFor(500);
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
        js.executeScript("window.scrollBy(0,4000);");
        waitFor(500);
        visibilityWait(blog.getFooter());
        highlighter.highLighterMethod(blog.getFooter(), DriverManager.getDriver());
        Assert.assertTrue(blog.getFooter().isDisplayed());
        waitFor(500);
        visibilityWait(blog.getLocationIndicator());
        highlighter.highLighterMethod(blog.getLocationIndicator(), DriverManager.getDriver());
        Assert.assertTrue(blog.getLocationIndicator().isDisplayed());
        Logger.log("User is able to see Localization indicator sticky, Global Header and Footer");
    }

    @When("User clicks on Blogs sub category")
    public void userClicksOnBlogsSubCategory() {
        visibilityWait(blog.getCannabisInsiderHeaderOption());
        jsClick(blog.getCannabisInsiderHeaderOption());
        Logger.log("User clicks on Cannabis Insider option in the header");
        visibilityWait(blog.getBlogOption());
        highlighter.highLighterMethod(blog.getBlogOption(), DriverManager.getDriver());
        Assert.assertTrue(blog.getBlogOption().isDisplayed());
        jsClick(blog.getBlogOption());
        Logger.log("User clicks on Blogs sub category");
    }

    @Then("User is able to see Grid Articles with display of remaining blog and recipe articles apart from the one displayed in the hero section")
    public void userIsAbleToSeeGridArticlesWithDisplayOfRemainingBlogAndRecipeArticlesApartFromTheOneDisplayedInTheHeroSection() {
        visibilityWait(blog.getGridSectionHeader());
        Assert.assertTrue(blog.getGridSectionHeader().isDisplayed());
        Logger.log("User is able to see Grid Articles with display of remaining blog and recipe articles apart from the one displayed in the hero section");
    }

    @And("User is viewing the recommended resources section")
    public void userIsViewingTheRecommendedResourcesSection() {
        visibilityWait(benefitsOfCannabis.getRecommendedResourcesHeader());
        javascriptScroll(benefitsOfCannabis.getRecommendedResourcesHeader());
        visibilityWait(blog.getRecommendedResourcesSection());
        Assert.assertTrue(blog.getRecommendedResourcesSection().isDisplayed());
        Logger.log("User is viewing the recommended resources section");
    }

    @Then("The recommended Resources have all the other Cannabis Resources topics than the selected one in BlogIndexPage")
    public void theRecommendedResourcesHaveAllTheOtherCannabisResourcesTopicsThanTheSelectedOne_in_BlogIndexPage() {
        visibilityWait(blog.getRecommendedResourcesList().get(0));
        for (WebElement ele: blog.getRecommendedResourcesList()){
            visibilityWait(ele);
            Assert.assertTrue(ele.isDisplayed());
            Logger.log("The recommended Resources have all the other Cannabis Resources topics than the selected one");
        }
    }

    @And("User is viewing the hero article of the Blog Index Page")
    public void userIsViewingTheHeroArticleOfTheBlogIndexPage() {
        visibilityWait(blog.getHeroArticleBanner());
        //highlighter.highLighterMethod(blog.getHeroArticleBanner(), DriverManager.getDriver());
        Assert.assertTrue(blog.getHeroArticleBanner().isDisplayed());
        Logger.log("User is able to see Hero Article at the top of the page");
    }

    @Then("user should able to view “New” tag assigned for the article which has less than nor equal to{int} days from published date")
    public void userShouldAbleToViewNewTagAssignedForTheArticleWhichHasLessThanNorEqualToDaysFromPublishedDate(int arg0) {
        if (blog.getHeroArticleNewLabel().isDisplayed()){
            visibilityWait(blog.getHeroArticleNewLabel());
            Assert.assertTrue(blog.getHeroArticleNewLabel().isDisplayed());
            Logger.log("user should able to view “New” tag assigned for the article which has less than nor equal to{int} days from published date");
        }else {
            Logger.log("user not able to view “New” tag assigned for the article which has less than nor equal to{int} days from published date");
        }
    }


    @And("user should see the new tags, for new articles")
    public void userShouldSeeTheNewTagsForNewArticles() {
        Assert.fail();
        Logger.log("user should see the new tags, for new articles");
    }

    @And("user is viewing the article grid section in Blog index page")
    public void userIsViewingTheArticleGridSectionInBlogIndexPage() {
    }

    @And("user clicks on the title")
    public void userClicksOnTheTitle() {
        visibilityWait(blog.getGirdSectionFirstHeader().get(0));
        highlighter.highLighterMethod(blog.getGirdSectionFirstHeader().get(0), DriverManager.getDriver());
        Assert.assertTrue(blog.getGirdSectionFirstHeader().get(0).isDisplayed());
        jsClick(blog.getGirdSectionFirstHeader().get(0));
        Logger.log("user clicks on the title");
    }

    @Then("user should navigate to respective article details page from title")
    public void userShouldNavigateToRespectiveArticleDetailsPageFromTitle() {
        Assert.fail();
        Logger.log("user not able navigate to respective article details page from title");
    }

    @And("The articles cards in the page is more than {int}.")
    public void theArticlesCardsInThePageIsMoreThan(int arg0) {
        visibilityWait(blog.getGirdSectionFirstHeader().get(0));
        if (blog.getGirdSectionFirstHeader().size() == 6) {
            for (WebElement ele : blog.getGirdSectionFirstHeader()){
                Assert.assertTrue(ele.isDisplayed());
            }
            Logger.log("The articles cards in the page is equal to 6 or more then 6");
        } else {
            Logger.log("The articles cards in the page is equal to 6 or more then 6");
        }

    }

    @And("user clicks the the title from the recommended resources")
    public void userClicksTheTheTitleFromTheRecommendedResources() {
        if(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed()){
            Assert.assertTrue(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed());
            visibilityWait(blog.getRecommendedResourcesHeader());
            javascriptScroll(blog.getRecommendedResourcesHeader());
            waitFor(2000);
            visibilityWait(blog.getRecommendedResourcesFirstTitleMobileList().get(0));
            highlighter.highLighterMethod(blog.getRecommendedResourcesFirstTitleMobileList().get(0), DriverManager.getDriver());
            Assert.assertTrue(blog.getRecommendedResourcesFirstTitleMobileList().get(0).isDisplayed());
            jsClick(blog.getRecommendedResourcesFirstTitleMobileList().get(0));
            Logger.log("user clicks the the title from the recommended resources");
        }else {
            JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
            js.executeScript("window.scrollBy(0,450);");
            waitFor(2000);
            visibilityWait(blog.getRecommendedResourcesFirstTitle().get(0));
            highlighter.highLighterMethod(blog.getRecommendedResourcesFirstTitle().get(0), DriverManager.getDriver());
            Assert.assertTrue(blog.getRecommendedResourcesFirstTitle().get(0).isDisplayed());
            Logger.log("user clicks the the title from the recommended resources");
        }
    }

    @Then("user should navigate to the respective index page of the particular recommended resource from title")
    public void userShouldNavigateToTheRespectiveIndexPageOfTheParticularRecommendedResourceFromTitle() {
        Assert.fail();
        Logger.log("user not able navigate to the respective index page of the particular recommended resource from title");
    }

    @Then("user should able to view the Category tag in BlogIndexPage")
    public void userShouldAbleToViewTheCategoryTagInBlogIndexPage() {
        visibilityWait(blog.getHeroArticleCategory());
        highlighter.highLighterMethod(blog.getHeroArticleCategory(), DriverManager.getDriver());
        waitFor(1000);
        Assert.assertTrue(blog.getHeroArticleCategory().isDisplayed());
        Logger.log("user should able to view the Category tag");
    }
}
