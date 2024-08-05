package parallel;

import com.driverfactory.DriverManager;
import com.resuableMethods.CommonAction;
import com.utilities.Logger;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pom.gti.Footer_Desktop;
import pom.gti.Header;
import pom.gti.T09_Get_A_medicalCard_index;


public class T09_Get_A_medicalCard_index_Stepdef extends CommonAction {
        Header HeaderActions = new Header(DriverManager.getDriver());
        Footer_Desktop FooterActions = new Footer_Desktop(DriverManager.getDriver());
    T09_Get_A_medicalCard_index Getamedicalcard = new T09_Get_A_medicalCard_index(DriverManager.getDriver());


    @When("User clicks on Cannabis Insider from global header")
    public void user_clicks_on_cannabis_insider_from_global_header() {
        if (HeaderActions.getHamburgerMenu().isDisplayed()){
            jsClick(HeaderActions.getHamburgerMenu());
            jsClick(HeaderActions.getHeadercannabisinsider());

        }else {
            if (HeaderActions.getHeadercannabisinsider().isDisplayed()){
                jsClick(HeaderActions.getHeadercannabisinsider());
            }
        }
        Logger.log("User clicks on Cannabis Insider from global header");
    }

    @Then("user should be able to see get a medical card as sub category")
    public void user_should_be_able_to_see_get_a_medical_card_as_sub_category() {
        Assert.assertTrue(HeaderActions.getexpandedcannabisinsidermedicalcard().isDisplayed());
        Logger.log("user should be able to see get a medical card as sub category");
    }

    @And("User clicks on the Get a medical cards sub category")
    public void userClicksOnTheGetAMedicalCardsSubCategory() {
        jsClick(HeaderActions.getexpandedcannabisinsidermedicalcard());
        Logger.log("User clicks on the Get a medical cards sub category");

    }



    @Then("User lands on the the Get a medical card page")
    public void userLandsOnTheTheGetAMedicalCardPage() {
        Assert.assertTrue(Getamedicalcard.getGet_A_medicalCard_index_HeroHeader().isDisplayed());
        Logger.log("User lands on the the Get a medical card page");
    }


    @Then("User is able to see Hero Article at the top of the page")
    public void userIsAbleToSeeHeroArticleAtTheTopOfThePage() {
        Assert.assertTrue(Getamedicalcard.getIndex_herobanner().isDisplayed());
        Logger.log("User is able to see Hero Article at the top of the page");

    }




    @Then("User is able to see Recommended Resources located on the right side of page")
    public void userIsAbleToSeeRecommendedResourcesLocatedOnTheRightSideOfPage() {
        visibilityWait(Getamedicalcard.getindexPage_recommended_Resources_header());
        javascriptScroll(Getamedicalcard.getindexPage_recommended_Resources_header());
        Assert.assertTrue(isElementPresent(Getamedicalcard.getindexPage_recommended_Resources_header()));
        Logger.log("User is able to see Recommended Resources located on the right side of page");
    }

    @Then("The recommended Resources have all the other Cannabis Resources topics than the selected one")
    public void theRecommendedResourcesHaveAllTheOtherCannabisResourcesTopicsThanTheSelectedOne() {
        for (int i=0; i==Getamedicalcard.getindexPage_recommended_Resources_title().size(); i++){
            Assert.assertTrue(Getamedicalcard.getindexPage_recommended_Resources_title().get(i).isDisplayed());
            String recommendedResource_title = Getamedicalcard.getindexPage_recommended_Resources_title().get(i).getText();
            Logger.log("user should be able to view the "+ recommendedResource_title);
        }
    }

    @Then("User is able to see Localization indicator sticky, Global Header and Footer")
    public void userIsAbleToSeeLocalizationIndicatorStickyGlobalHeaderAndFooter() {
        Assert.assertTrue(HeaderActions.getheader().isDisplayed());
        Assert.assertTrue(FooterActions.Getfootersection().isDisplayed());
        Logger.log("User is able to see Localization indicator sticky, Global Header and Footer");

    }

    @Then("user should be able to view the title of the hero article")
    public void user_should_be_able_to_view_the_title_of_the_hero_article() {
        Assert.assertTrue(Getamedicalcard.getIndex_heroBanner_title().isDisplayed());
        Logger.log("user should be able to view the title of the hero article");
    }

    @Then("user should be able to view the overview the perticular article")
    public void user_should_be_able_to_view_the_overview_the_perticular_article() {
        Assert.assertTrue(Getamedicalcard.getIndex_heroBanner_description().isDisplayed());
        Logger.log("user should be able to view the overview the perticular article");
    }

    @Then("user should be able to view the readmore cta under the overview of the article")
    public void user_should_be_able_to_view_the_readmore_cta_under_the_overview_of_the_article() {
        Assert.assertTrue(Getamedicalcard.getIndex_heroBanner_cta().isDisplayed());
        Logger.log("user should be able to view the readmore cta under the overview of the article");
    }

    @Then("user should able to view the published date of the article when it got published and in format of MMDDYYYY")
    public void user_should_able_to_view_the_published_date_of_the_article_when_it_got_published_and_in_format_of_mmddyyyy() {
        Assert.assertTrue(isElementPresent(Getamedicalcard.getIndex_heroBanner_dateTag()));
        String publishedDate = Getamedicalcard.getIndex_heroBanner_dateTag().getText();
        Logger.log("user should able to view the published date of the article when it got published and in format of MMDDYYYY "+publishedDate);
    }

    @Then("user should able to view the Category tag")
    public void user_should_able_to_view_the_category_tag() {
        Assert.assertTrue(Getamedicalcard.getIndex_heroBanner_categoryTag().isDisplayed());
        Logger.log("user should able to view the Category tag");
    }

    @And("user clicks on Read more CTA in the hero banner")
    public void userClicksOnReadMoreCTAInTheHeroBanner() {
        String heroBannertitle = Getamedicalcard.getIndex_heroBanner_title().getText();
        jsClick(Getamedicalcard.getIndex_heroBanner_cta());
        Logger.log("user clicks on Read more CTA in the hero banner");
    }

    @Then("user should be able to navigate to the article content page of that particular article given")
    public void userShouldBeAbleToNavigateToTheArticleContentPageOfThatParticularArticleGiven() {
        visibilityWait(Getamedicalcard.getArticleDetails_header());
        javascriptScroll(Getamedicalcard.getArticleDetails_header());

        Assert.assertTrue(isElementPresent(Getamedicalcard.getArticleDetails_header()));
        Logger.log("user should be able to navigate to the article content page of that particular article given");
    }
    @When("user should be able to view the grid article section")
    public void user_should_be_able_to_view_the_grid_article_section() {
        Assert.assertTrue(Getamedicalcard.getgridAritcle_section().isDisplayed());
        Logger.log("user should be able to view the grid article section");
    }

    @Then("user should view the title text of the articles under the grid section")
    public void user_should_view_the_title_text_of_the_articles_under_the_grid_section() {
        for (int i=0; i==Getamedicalcard.getgridAriticle_title().size(); i++){
            Assert.assertTrue(Getamedicalcard.getgridAriticle_title().get(i).isDisplayed());
        }
        Logger.log("user should view the title text of the articles under the gris section");
    }

    @Then("user should view image assosiated with article under the grid section")
    public void user_should_view_image_assosiated_with_article_under_the_grid_section() {
        for (int i=0; i==Getamedicalcard.getgridArticle_image().size(); i++){
            Assert.assertTrue(Getamedicalcard.getgridArticle_image().get(i).isDisplayed());
        }
        Logger.log("user should view image assosiated with article under the gris section");
    }

    @Then("user should see the new tags for a articles under the grid section")
    public void user_should_see_the_new_tags_for_a_articles_under_the_grid_section() {
        for (int i=0; i==Getamedicalcard.getgridArticle_image().size(); i++){
//            if (isElementPresent(Getamedicalcard.getGridArticle_newTag().get(i))){
                Assert.assertTrue(isElementPresent(Getamedicalcard.getGridArticle_newTag().get(i)));
//            }else {
//                Logger.log("User not able to view the new tag in the gris article");
//            }

        }
        Logger.log("user should see the new tags for a articles under the gris section");
    }

    @Then("user should view the categories label for a articles under the grid section")
    public void user_should_view_the_categories_label_for_a_articles_under_the_grid_section() {
        for (int i=0; i==Getamedicalcard.getgridArticle_categoryTag().size(); i++){
            Assert.assertTrue(Getamedicalcard.getgridArticle_categoryTag().get(i).isDisplayed());
        }
        Logger.log("user should view the categories label for a articles under the gris section");
    }

    @Then("user should view the published date for a articles under the grid section")
    public void user_should_view_the_published_date_for_a_articles_under_the_grid_section() {
        for (int i=0; i==Getamedicalcard.getgridArticle_publishedDate_Tag().size(); i++){
            Assert.assertTrue(Getamedicalcard.getgridArticle_publishedDate_Tag().get(i).isDisplayed());
            String published_date = Getamedicalcard.getgridArticle_publishedDate_Tag().get(i).getText();
            Logger.log("user should view the published date for a articles under the gris section "+ published_date);
        }
    }

    @Then("user should view the brief about the article for a articles under the grid section")
    public void user_should_view_the_brief_about_the_article_for_a_articles_under_the_grid_section() {
        for (int i=0; i==Getamedicalcard.getgridArticle_description().size(); i++){
            Assert.assertTrue(Getamedicalcard.getgridArticle_description().get(i).isDisplayed());
        }
        Logger.log("user should view the brief about the article for a articles under the gris section");
    }

    @Then("user should view the read more cta for a articles under the grid section")
    public void user_should_view_the_read_more_cta_for_a_articles_under_the_grid_section() {
        for (int i=0; i==Getamedicalcard.getgridArticle_cta().size(); i++){
            Assert.assertTrue(Getamedicalcard.getgridArticle_cta().get(i).isDisplayed());
        }
    }

    @And("user clicks read more CTA of articles from grid articles section")
    public void userClicksReadMoreCTAOfArticlesFromGridArticlesSection() {
        Getamedicalcard.clickreadmore_cta();
        Logger.log("user clicks read more CTA of articles from grid articles section");
    }

    @And("user clicks on the title of articles from grid articles section")
    public void userClicksOnTheTitleOfArticlesFromGridArticlesSection() {
        Getamedicalcard.clickarticletitle();
        Logger.log("user clicks on the title of articles from grid articles section");
    }

    @And("User scrolls down to the bottom of the grid articles")
    public void userScrollsDownToTheBottomOfTheGridArticles() {
        if (isElementPresent(Getamedicalcard.getshowMore_cta())){
            javascriptScroll(Getamedicalcard.getshowMore_cta());
            Logger.log("User scrolls down to the bottom of the grid articles");
        }else {
            Logger.log("User not able to view more than 6 cards");
        }
    }

    @Then("user should see the number of cards displayed and total number of cards in Showing {int} of {int} format")
    public void userShouldSeeTheNumberOfCardsDisplayedAndTotalNumberOfCardsInShowingOfFormat(int arg0, int arg1) {
        if (isElementPresent(Getamedicalcard.getdisplayed_card_count())){
            Assert.assertTrue(Getamedicalcard.getdisplayed_card_count().isDisplayed());
            Logger.log("user should see the number of cards displayed and total number of cards in Showing 6 of 56 format");
        }else {
            Logger.log("User not able to view more than 6 cards");
        }
    }


    @Then("User is able to view the title for recommended resources")
    public void userIsAbleToViewTheTitleForRecommendedResources() {
        Assert.assertTrue(Getamedicalcard.getindexPage_recommended_Resources_header().isDisplayed());


    }

    @And("User is able to view the recommended resource name")
    public void userIsAbleToViewTheRecommendedResourceName() {
        for (int i=0; i==Getamedicalcard.getindexPage_recommended_Resources_title().size(); i++){
            Assert.assertTrue(Getamedicalcard.getindexPage_recommended_Resources_title().get(i).isDisplayed());
            String recommendedResource_title = Getamedicalcard.getindexPage_recommended_Resources_title().get(i).getText();
            Logger.log("user should be able to view the "+ recommendedResource_title);
        }
    }

    @And("User is able to view the short description of recommended resource")
    public void userIsAbleToViewTheShortDescriptionOfRecommendedResource() {
        for (int i=0; i==Getamedicalcard.getindexPage_recommended_resources_description().size(); i++){
            Assert.assertTrue(Getamedicalcard.getindexPage_recommended_resources_description().get(i).isDisplayed());

        }
        Logger.log("User is able to view the short description of recommended resource");
    }

    @And("User is able to view a Read more CTA of recommended resource")
    public void userIsAbleToViewAReadMoreCTAOfRecommendedResource() {
        for (int i=0; i==Getamedicalcard.getindexPage_recommended_resources_cta().size(); i++){
            Assert.assertTrue(Getamedicalcard.getindexPage_recommended_resources_cta().get(i).isDisplayed());
    }
        Logger.log("User is able to view a Read more CTA of recommended resource");
    }

    @And("user clicks the read more cta from the description of recommended resources")
    public void userClicksTheReadMoreCtaFromTheDescriptionOfRecommendedResources() {
        Getamedicalcard.click_recommended_resources_cta();
        Logger.log("user clicks the read more cta from the description of recommended resources");
    }

    @Then("user should navigate to the respective index page of the particular recommended resource")
    public void userShouldNavigateToTheRespectiveIndexPageOfTheParticularRecommendedResource() {
        Assert.assertTrue(Getamedicalcard.getIndex_herobanner().isDisplayed());
        Logger.log("user should navigate to the respective index page of the particular recommended resource");
    }

    @And("user clicks the title from the recommended resources")
    public void userClicksTheTitleFromTheRecommendedResources() {
        Getamedicalcard.click_recommended_resources_title();
        Logger.log("user clicks the title from the recommended resources");
    }


    @And("user clicks on Read more CTA from the hero article")
    public void userClicksOnReadMoreCTAFromTheHeroArticle() {
        jsClick(Getamedicalcard.getIndex_heroBanner_cta());
        Logger.log("user clicks on Read more CTA from the hero article");

    }

    @Then("user should not able to view the article in grid article which is displayed in hero article")
    public void userShouldNotAbleToViewTheArticleInGridArticleWhichIsDisplayedInHeroArticle() {
        String HeroBannertitle = Getamedicalcard.getIndex_heroBanner_title().getText();
        for (int i=0; i==Getamedicalcard.getGrid_Article_title().size(); i++){
            String Current_gridTitle = Getamedicalcard.getGrid_Article_title().get(i).getText();
            Assert.assertNotEquals(HeroBannertitle, Current_gridTitle);
        }
        Logger.log("user should not able to view the article in grid article which is displayed in hero article");
    }
}
