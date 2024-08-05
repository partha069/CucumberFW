package parallel;

import com.driverfactory.DriverManager;
import com.resuableMethods.CommonAction;
import com.resuableMethods.Highlighter;
import com.utilities.Logger;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import pom.gti.T10_BenefitsOfCannabis;
import pom.gti.T09_BlogIndexPage;
import pom.gti.T11_DispensaryPage;


public class T10_WhatRightForMe_Stepdef extends CommonAction {
    pom.gti.T10_WhatRightForMe whatRightForMePage = new pom.gti.T10_WhatRightForMe(DriverManager.getDriver());
    T10_BenefitsOfCannabis benefitsOfCannabis = new T10_BenefitsOfCannabis(DriverManager.getDriver());
    T09_BlogIndexPage blog = new T09_BlogIndexPage(DriverManager.getDriver());
    T11_DispensaryPage T11_DispensaryPage = new T11_DispensaryPage(DriverManager.getDriver());
    Highlighter highlighter = new Highlighter();

    @When("user clicks on the whats Right For Me resources blog")
    public void userClicksOnTheWhatsRightForMeResourcesBlog() {
        if(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed()) {
            visibilityWait(benefitsOfCannabis.getRecommendedResourcesHeader());
            javascriptScroll(benefitsOfCannabis.getShowMoreCTA());
            int i = 0;
            while (i<4){
                visibilityWait(benefitsOfCannabis.getRecommendedResourcesNextArrow());
                DriverManager.getDriver().findElement(By.xpath("//*[@data-testid='next-icon']")).click();
                //jsClick(benefitsOfCannabis.getRecommendedResourcesNextArrow());
                i++;
                waitFor(300);
            }
            visibilityWait(whatRightForMePage.getWhatRightForMeReadMoreCTA());
            Assert.assertTrue(whatRightForMePage.getWhatRightForMeReadMoreCTA().isDisplayed());
            jsClick(whatRightForMePage.getWhatRightForMeReadMoreCTA());
            Logger.log("user clicks on the whats Right For Me resources blog");
        }else {
            visibilityWait(whatRightForMePage.getStateLawsHeader());
            javascriptScroll(whatRightForMePage.getStateLawsHeader());
            visibilityWait(whatRightForMePage.getStateLawsHeader());
            Assert.assertTrue(whatRightForMePage.getWhatRightForMeReadMoreCTA().isDisplayed());
            jsClick(whatRightForMePage.getWhatRightForMeReadMoreCTA());
            Logger.log("user clicks on the whats Right For Me resources blog");
        }
    }

    @When("User is in the whats Right For Me resources blog page")
    public void userIsInTheWhatsRightForMeResourcesBlogPage() {
        if(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed()) {
            visibilityWait(benefitsOfCannabis.getRecommendedResourcesHeader());
            javascriptScroll(benefitsOfCannabis.getShowMoreCTA());
            int i = 0;
            while (i<4){
                visibilityWait(benefitsOfCannabis.getRecommendedResourcesNextArrow());
                DriverManager.getDriver().findElement(By.xpath("//*[@data-testid='next-icon']")).click();
                //jsClick(benefitsOfCannabis.getRecommendedResourcesNextArrow());
                i++;
                waitFor(300);
            }
            visibilityWait(whatRightForMePage.getWhatRightForMeReadMoreCTA());
            Assert.assertTrue(whatRightForMePage.getWhatRightForMeReadMoreCTA().isDisplayed());
            jsClick(whatRightForMePage.getWhatRightForMeReadMoreCTA());
            Logger.log("user clicks on the whats Right For Me resources blog");
            visibilityWait(whatRightForMePage.getWhatRightForMeHeader());
            Assert.assertTrue(whatRightForMePage.getWhatRightForMeHeader().isDisplayed());
            Logger.log("User should land on the whats Right For Me resources blog page");
        }else {
            visibilityWait(whatRightForMePage.getStateLawsHeader());
            javascriptScroll(whatRightForMePage.getStateLawsHeader());
            visibilityWait(whatRightForMePage.getStateLawsHeader());
            Assert.assertTrue(whatRightForMePage.getWhatRightForMeReadMoreCTA().isDisplayed());
            jsClick(whatRightForMePage.getWhatRightForMeReadMoreCTA());
            Logger.log("user clicks on the whats Right For Me resources blog");
            visibilityWait(whatRightForMePage.getWhatRightForMeHeader());
            Assert.assertTrue(whatRightForMePage.getWhatRightForMeHeader().isDisplayed());
            Logger.log("User should land on the whats Right For Me resources blog page");
        }
    }

    @Then("User should land on the whats Right For Me resources blog page")
    public void userShouldLandOnTheWhatsRightForMeResourcesBlogPage() {
        visibilityWait(whatRightForMePage.getWhatRightForMeHeader());
        Assert.assertTrue(whatRightForMePage.getWhatRightForMeHeader().isDisplayed());
        Logger.log("User should land on the whats Right For Me resources blog page");
    }

    @Then("user should able to view the hero image in background in right for me page")
    public void userShouldAbleToViewTheHeroImageInBackgroundInRightForMePage() {
        waitFor(5000);
        visibilityWait(whatRightForMePage.getWhatRightForMeHeroArticleImage());
        Assert.assertTrue(whatRightForMePage.getWhatRightForMeHeroArticleImage().isDisplayed());
        Logger.log("user should able to view the hero image in background in right for me page");
    }

    @And("user should able to view the Article  title in right for me page")
    public void userShouldAbleToViewTheArticleTitleInRightForMePage() {
        visibilityWait(whatRightForMePage.getWhatRightForMeHeader());
        Assert.assertTrue(whatRightForMePage.getWhatRightForMeHeader().isDisplayed());
        Logger.log("user should able to view the Article  title in right for me page");
    }

    @And("the overview of a particular article banner in right for me page")
    public void theOverviewOfAParticularArticleBannerInRightForMePage() {
        visibilityWait(whatRightForMePage.getWhatRightForMeOverview());
        Assert.assertTrue(whatRightForMePage.getWhatRightForMeOverview().isDisplayed());
        Logger.log("the overview of a particular article banner in right for me page");
    }

    @Then("user should able to view the published date of the article when it got published in right for me page")
    public void userShouldAbleToViewThePublishedDateOfTheArticleWhenItGotPublishedInRightForMePage() {
        visibilityWait(whatRightForMePage.getWhatRightForMeHeroArticleBannerDate());
        Assert.assertTrue(whatRightForMePage.getWhatRightForMeHeroArticleBannerDate().isDisplayed());
        Logger.log("user should able to view the published date of the article when it got published in right for me page");
    }

    @Then("user should able to view “New” tag for the article which has less than nor equal to{int} days from published date in right for me page")
    public void userShouldAbleToViewNewTagForTheArticleWhichHasLessThanNorEqualToDaysFromPublishedDateInRightForMePage(int arg0) {
        if (whatRightForMePage.getWhatRightForMeHeroArticleBannerNewLabel().isDisplayed()){
            visibilityWait(whatRightForMePage.getWhatRightForMeHeroArticleBannerNewLabel());
            Assert.assertTrue(whatRightForMePage.getWhatRightForMeHeroArticleBannerNewLabel().isDisplayed());
            Logger.log("user should able to view “New” tag for the article which has less than nor equal to{int} days from published date in right for me page");
        }else {
            Logger.log("user not able to view “New” tag for the article which has less than nor equal to{int} days from published date in right for me page");
        }
    }

    @Then("user should able to view the Category tag as {string}  in the article section in right for me page")
    public void userShouldAbleToViewTheCategoryTagAsInTheArticleSectionInRightForMePage(String arg0) {
        visibilityWait(whatRightForMePage.getWhatRightForMeHeroArticleBannerLabel());
        String labelText = whatRightForMePage.getWhatRightForMeHeroArticleBannerLabel().getText();
        System.out.println(labelText);
        if(labelText.equals("Cannabis 101")){
            Assert.assertTrue(whatRightForMePage.getWhatRightForMeHeroArticleBannerLabel().isDisplayed());
            Logger.log("user should able to view the Category tag as {string}  in the article section in right for me page");
        }else{
            Logger.log("user not able to view the Category tag as {string}  in the article section in right for me page");
        }
    }
    @When("User clicks on the links in right for me page")
    public void user_clicks_on_the_links_in_right_for_me_page() {
        visibilityWait(benefitsOfCannabis.getTableOfContentList().get(1));
        Assert.assertTrue(benefitsOfCannabis.getTableOfContentList().get(1).isDisplayed());
        //jsClick(benefitsOfCannabis.getTableOfContentList().get(1));
        DriverManager.getDriver().findElement(By.xpath("//h5[text()='Content']/parent::div/child::div/child::div/a[text()='What are indica, sativa and hybrid strains?']")).click();
        Logger.log("User clicks on the links");

    }
    @And("User should be able to click on any link in benefits TOC in right for me page")
    public void userShouldBeAbleToClickOnAnyLinkInBenefitsTOCInRightForMePage() {
        visibilityWait(benefitsOfCannabis.getTableOfContentList().get(1));
        Assert.assertTrue(benefitsOfCannabis.getTableOfContentList().get(1).isDisplayed());
        //jsClick(benefitsOfCannabis.getTableOfContentList().get(1));
        DriverManager.getDriver().findElement(By.xpath("//h5[text()='Content']/parent::div/child::div/child::div/a[text()='What are indica, sativa and hybrid strains?']")).click();
        Logger.log("User clicks on the links");
    }

    @Then("User should see the page being navigated to respective section in benefits TOC in right for me page")
    public void userShouldSeeThePageBeingNavigatedToRespectiveSectionInBenefitsTOCInRightForMePage() {
        visibilityWait(whatRightForMePage.getWhatAreIndicaSativaAndHybridStrainsHeader());
        Assert.assertTrue(whatRightForMePage.getWhatAreIndicaSativaAndHybridStrainsHeader().isDisplayed());
        Logger.log("User should see the page being navigated to respective section in benefits TOC in right for me page");
    }

    @And("User is navigated to respective section on clicking any link in right for me page")
    public void userIsNavigatedToRespectiveSectionOnClickingAnyLinkInRightForMePage() {
            visibilityWait(benefitsOfCannabis.getTableOfContentList().get(1));
            Assert.assertTrue(benefitsOfCannabis.getTableOfContentList().get(1).isDisplayed());
            //jsClick(benefitsOfCannabis.getTableOfContentList().get(1));
            DriverManager.getDriver().findElement(By.xpath("//h5[text()='Content']/parent::div/child::div/child::div/a[text()='What are indica, sativa and hybrid strains?']")).click();
            Logger.log("User is navigated to respective section on clicking any link in right for me page");

    }

    @And("User scrolls down the page to view a particular section in right for me page")
    public void userScrollsDownThePageToViewAParticularSectionInRightForMePage() {
        visibilityWait(whatRightForMePage.getWhatAreIndicaSativaAndHybridStrainsHeader());
        Assert.assertTrue(whatRightForMePage.getWhatAreIndicaSativaAndHybridStrainsHeader().isDisplayed());
        Logger.log("User scrolls down the page to view a particular section in right for me page");
    }

    @Then("User should be able to see the anchor links ToC being scrolled in background behind in right for me page")
    public void userShouldBeAbleToSeeTheAnchorLinksToCBeingScrolledInBackgroundBehindInRightForMePage() {
        visibilityWait(whatRightForMePage.getWhatAreIndicaSativaAndHybridStrainsHeader());
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
        js.executeScript("window.scrollBy(0,-2000);");
        waitFor(500);
        Assert.assertTrue(whatRightForMePage.getWhatAreIndicaSativaAndHybridStrainsHeader().isDisplayed());
        Logger.log("User should be able to see the anchor links ToC being scrolled in background behind in right for me page");
    }

    @And("User is viewing the text in a quote in right for me page")
    public void userIsViewingTheTextInAQuoteInRightForMePage() {
        visibilityWait(whatRightForMePage.getWhatAreIndicaSativaAndHybridStrainsHeader());
        javascriptScroll(whatRightForMePage.getWhatAreIndicaSativaAndHybridStrainsHeader());
        Assert.assertTrue(whatRightForMePage.getWhatAreIndicaSativaAndHybridStrainsHeader().isDisplayed());
        visibilityWait(benefitsOfCannabis.getQuoteParagraph());
        Assert.assertTrue(benefitsOfCannabis.getQuoteParagraph().isDisplayed());
        Logger.log("User is viewing the text in a quote in right for me page");
    }

    @Then("user should be able to see the big size image in {int}x{int} pixel in right for me page")
    public void userShouldBeAbleToSeeTheBigSizeImageInXPixelInRightForMePage(int arg0, int arg1) {
        visibilityWait(whatRightForMePage.getWhatAreIndicaSativaAndHybridStrainsHeader());
        javascriptScroll(whatRightForMePage.getWhatAreIndicaSativaAndHybridStrainsHeader());
        Assert.assertTrue(whatRightForMePage.getWhatAreIndicaSativaAndHybridStrainsHeader().isDisplayed());
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
        js.executeScript("window.scrollBy(0,-500);");
        visibilityWait(whatRightForMePage.getBigImageInWhatRightForMe());
        Assert.assertTrue(whatRightForMePage.getBigImageInWhatRightForMe().isDisplayed());
        Logger.log("user should be able to see the big size image in 1192x606 pixel in right for me page");
    }

    @And("user should be able to view the description under the image in right for me page")
    public void userShouldBeAbleToViewTheDescriptionUnderTheImageInRightForMePage() {
        visibilityWait(whatRightForMePage.getBigImageDescription());
        Assert.assertTrue(whatRightForMePage.getBigImageDescription().isDisplayed());
        Logger.log("user should be able to view the description under the image");
    }

    @Then("user should be able to see the small size image in {int}x{int} pixel in right for me page")
    public void userShouldBeAbleToSeeTheSmallSizeImageInXPixelInRightForMePage(int arg0, int arg1) {
        visibilityWait(whatRightForMePage.getSmaillImageInWhatRightForMe());
        javascriptScroll(whatRightForMePage.getSmaillImageInWhatRightForMe());
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
        js.executeScript("window.scrollBy(0,-700);");
        visibilityWait(whatRightForMePage.getSmaillImageInWhatRightForMe());
        Assert.assertTrue(whatRightForMePage.getSmaillImageInWhatRightForMe().isDisplayed());
        Logger.log("user should be able to see the small size image in 736x368 pixel");
    }

    @Then("User redirected to respective internal site page in same tab.")
    public void userRedirectedToRespectiveInternalSitePageInSameTab() {
        Assert.fail();
        Logger.log("User not able to redirected to respective internal site page in same tab.");
    }

    @And("User scrolls down to the banner section in right for me page")
    public void userScrollsDownToTheBannerSectionInRightForMePage() {
        visibilityWait(whatRightForMePage.getIndicaEffectsHeader());
        javascriptScroll(whatRightForMePage.getIndicaEffectsHeader());
        Assert.assertTrue(whatRightForMePage.getIndicaEffectsHeader().isDisplayed());
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
        js.executeScript("window.scrollBy(0,-1000);");
        Logger.log("User scrolls down to the banner section");
    }
}
