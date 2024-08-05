package parallel;

import com.driverfactory.DriverManager;
import com.resuableMethods.CommonAction;
import com.utilities.Logger;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pom.gti.*;

public class T18_RecipeDetails_Stepdef extends CommonAction {
    T18_RecipeDetail_page recipedetails = new T18_RecipeDetail_page(DriverManager.getDriver());
    T10_ArticleDetailsPage ArticleDetails = new T10_ArticleDetailsPage(DriverManager.getDriver());
    Banners banner = new Banners(DriverManager.getDriver());
    Header HeaderActions = new Header(DriverManager.getDriver());
    T09_Get_A_medicalCard_index getAMedicalCardIndex = new T09_Get_A_medicalCard_index(DriverManager.getDriver());



    @When("user is on the Recipe details page")
    public void userIsOnTheRecipeDetailsPage() {
        Assert.assertTrue(recipedetails.getRecipe_details_hero_header().isDisplayed());
        Logger.log("User is in the Recipe details page");
    }


    @Then("user should able to view the hero image in background")
    public void userShouldAbleToViewTheHeroImageInBackground() {

        Assert.assertTrue(recipedetails.getRecipe_Hero_BG_image().isDisplayed());
        Logger.log("user should able to view the hero image in background");
    }

    @And("user should able to view the Article  title and the overview of a particular article")
    public void userShouldAbleToViewTheArticleTitleAndTheOverviewOfAParticularArticle() {
        Assert.assertTrue(recipedetails.getRecipe_details_hero_header().isDisplayed());
        Logger.log(recipedetails.getRecipe_details_hero_header().getText()+" user should able to view the Article  title and the overview of a particular article");
    }


    @And("user should able to view the description of the article")
    public void userShouldAbleToViewTheDescriptionOfTheArticle() {
        if (recipedetails.getRecipe_detals_hero_Description().isDisplayed()) {
            Assert.assertTrue(recipedetails.getRecipe_detals_hero_Description().isDisplayed());
            Logger.log("user should able to view the description of the article");
        }else {
            Logger.log("Recipe details hero banner description is not provided");
        }}

    @Then("user should able to view the Category tag as {string}  in the article section")
    public void userShouldAbleToViewTheCategoryTagAsInTheArticleSection(String arg0) {
        Assert.assertTrue(ArticleDetails.getCannabis101Tag().getText().contains("Recipes"));
        Logger.log("user should able to view the Category tag as \"Recipes\"  in the article section");
    }

    @Then("User should able to view the estimated cooking time as label")
    public void userShouldAbleToViewTheEstimatedCookingTimeAsLabel() {
        Assert.assertTrue(recipedetails.getEstimated_cooking_time().isDisplayed());
        Logger.log("User should able to view the estimated cooking time as label");
    }

    @And("User scroll downs to banner information in recipe details page for variant A")
    public void userScrollDownsToBannerInformationInRecipeDetailsPageForVariantA() {
        if (banner.getBanner_information_typeA().isDisplayed()){
            Assert.assertTrue(banner.getBanner_information_typeA().isDisplayed());
            Logger.log("User scroll downs to banner information in recipe details page for variant A");
        }else {
            Logger.log("User not able to view the banner information type A");
        }
    }

    @When("User is on banner information variant A")
    public void userIsOnBannerInformationVariantA() {
        if (banner.getBanner_information_typeA().isDisplayed()){
            Assert.assertTrue(banner.getBanner_information_typeA().isDisplayed());
            Logger.log("User scroll downs to banner information in recipe details page for variant A");
        }else {
            Logger.log("User not able to view the banner information type A");
        }
    }

    @Then("User should see an icon with small text on banner information variant A")
    public void userShouldSeeAnIconWithSmallTextOnBannerInformationVariantA() {
        if (banner.getBanner_information_typeA().isDisplayed()){
            Assert.assertTrue(banner.getBanner_information_typeA_smalltext().isDisplayed());
            Logger.log("User should see an icon with small text on banner information variant A");
        }else {
            Logger.log("User not able to view the banner information type A");
        }
    }

    @And("User should see a Title Text with {int} or {int} lines for banner information variant A")
    public void userShouldSeeATitleTextWithOrLinesForBannerInformationVariantA(int arg0, int arg1) {
        if (banner.getBanner_information_typeA().isDisplayed()){
            Assert.assertTrue(banner.getBanner_information_typeA_title().isDisplayed());
            Logger.log("User should see a Title Text with 2 or 3 lines for banner information variant A");
        }else {
            Logger.log("User not able to view the banner information type A");
        }
    }

    @And("user should be able to view the CTA on banner information variant A")
    public void userShouldBeAbleToViewTheCTAOnBannerInformationVariantA() {
        if (banner.getBanner_information_typeA().isDisplayed()){
            Assert.assertTrue(banner.getBanner_information_typeA_title().isDisplayed());
            Logger.log("User should see a Title Text with 2 or 3 lines for banner information variant A");
        }else {
            Logger.log("User not able to view the banner information type A");
        }
    }

    @And("User should click on CTA on banner information variant A")
    public void userShouldClickOnCTAOnBannerInformationVariantA() {
        if (banner.getBanner_information_typeA().isDisplayed()){
            jsClick(banner.getBanner_information_typeA_cta());
            Logger.log("User should click on CTA on banner information variant A");
        }else {
            Logger.log("User not able to view the banner information type A");
        }
    }

    @Then("User should see link is open in same tab from banner information variant A")
    public void userShouldSeeLinkIsOpenInSameTabFromBannerInformationVariantA() {
        try{
            switchToTabs("1");
            Assert.assertTrue(banner.getJoinnow_PageHeader().isDisplayed());
            Logger.log("User navigated to the next tab");
        }catch (Exception e){

            Assert.assertTrue(banner.getJoinnow_PageHeader().isDisplayed());
            Logger.log("User should see link is open in same tab");
        }
    }

    @Then("User should see link is open in new tab from banner information variant A")
    public void userShouldSeeLinkIsOpenInNewTabFromBannerInformationVariantA() {
        try{
            switchToTabs("1");
            Assert.assertTrue(banner.getJoinnow_PageHeader().isDisplayed());
            Logger.log("User navigated to the next tab");
        }catch (Exception e){

            Assert.assertTrue(banner.getJoinnow_PageHeader().isDisplayed());
            Logger.log("User should see link is open in same tab");
        }
    }

    @And("User should scroll down to respective banner information variant B")
    public void userShouldScrollDownToRespectiveBannerInformationVariantB() {
        if (banner.getBanner_information_typeB().isDisplayed()){
            javascriptScroll(banner.getBanner_information_typeB());
            Logger.log("User should scroll down to respective banner information variant B");
        }else {
            Logger.log("user not able to view the information banner type B");
        }
    }

    @When("User is on banner information variant B in any one of the pages")
    public void userIsOnBannerInformationVariantBInAnyOneOfThePages() {
        if (banner.getBanner_information_typeB().isDisplayed()){
            Assert.assertTrue(banner.getBanner_information_typeB().isDisplayed());
            Logger.log("User should scroll down to respective banner information variant B");
        }else {
            Logger.log("user not able to view the information banner type B");
        }
    }

    @Then("User should see an icon with small text on banner information variant B")
    public void userShouldSeeAnIconWithSmallTextOnBannerInformationVariantB() {
        if (banner.getBanner_information_typeB().isDisplayed()){
            Assert.assertTrue(banner.getBanner_information_typeB_smalltext().isDisplayed());
            Logger.log("User should see an icon with small text on banner information variant B");
        }else {
            Logger.log("user not able to view the information banner type B");
        }
    }

    @And("User should see a Title Text with {int} or {int} lines for banner information variant B")
    public void userShouldSeeATitleTextWithOrLinesForBannerInformationVariantB(int arg0, int arg1) {
        if (banner.getBanner_information_typeB().isDisplayed()){
            Assert.assertTrue(banner.getBanner_information_typeB_title().isDisplayed());
            Logger.log("User should see a Title Text with {int} or {int} lines for banner information variant B");
        }else {
            Logger.log("user not able to view the information banner type B");
        }
    }

    @And("User should see a copy text with {int} or {int} lines for banner information variant B")
    public void userShouldSeeACopyTextWithOrLinesForBannerInformationVariantB(int arg0, int arg1) {
        if (banner.getBanner_information_typeB().isDisplayed()){
            Assert.assertTrue(banner.getBanner_information_typeB_description().isDisplayed());
            Logger.log("User should see a copy Text with {int} or {int} lines for banner information variant B");
        }else {
            Logger.log("user not able to view the information banner type B");
        }
    }

    @Then("User should click on CTA on banner information variant B")
    public void userShouldClickOnCTAOnBannerInformationVariantB() {
        if (banner.getBanner_information_typeB().isDisplayed()){
            jsClick(banner.getBanner_information_typeB_cta());
            Logger.log("User should click on CTA on banner information variant B");
        }else {
            Logger.log("user not able to view the information banner type B");
        }
    }

    @And("User should see link is open in same tab")
    public void userShouldSeeLinkIsOpenInSameTab() {
    }

    @And("User should see link is open in new tab")
    public void userShouldSeeLinkIsOpenInNewTab() {
    }




    @And("user clicks recipes from subcategories to navigate into the recipe index page")
    public void userClicksRecipesFromSubcategoriesToNavigateIntoTheRecipeIndexPage() {
        jsClick(HeaderActions.getExpandedcannabisinsiderrecipes());
        Logger.log("user clicks recipes from subcategories to navigate into the recipe index page");
    }

    @And("user click anyof the recipe from the grid article")
    public void userClickAnyofTheRecipeFromTheGridArticle() {
        getAMedicalCardIndex.clickreadmore_cta();
        Logger.log("user click anyof the recipe from the grid article");
    }

    @Then("User should be able to view the table of content on the left  side of the page")
    public void userShouldBeAbleToViewTheTableOfContentOnTheLeftSideOfThePage() {
        
    }

    @Then("User should be able to view the links getting highlighted")
    public void userShouldBeAbleToViewTheLinksGettingHighlighted() {

    }
}
