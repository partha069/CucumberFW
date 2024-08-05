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
import pom.gti.T10_StateLawDetail;


public class T10_StateLawDetail_Stepdef extends CommonAction {
    T10_BenefitsOfCannabis benefitsOfCannabis = new T10_BenefitsOfCannabis(DriverManager.getDriver());
    T10_StateLawDetail stateLawDetail = new T10_StateLawDetail(DriverManager.getDriver());

    T09_BlogIndexPage blog = new T09_BlogIndexPage(DriverManager.getDriver());
    T11_DispensaryPage T11_DispensaryPage = new T11_DispensaryPage(DriverManager.getDriver());
    Highlighter highlighter = new Highlighter();

    @And("User clicks on STATE LAWS sub catogery")
    public void userClicksOnSTATELAWSSubCatogery() {
        if(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed()){
            Assert.assertTrue(T11_DispensaryPage.getMobileHamburgerMenuCTA().isDisplayed());
            visibilityWait(benefitsOfCannabis.getCannabisInsiderOptionList().get(2));
            Assert.assertTrue(benefitsOfCannabis.getCannabisInsiderOptionList().get(2).isDisplayed());
            jsClick(stateLawDetail.getStateLawOptionMobile());
            Logger.log("User clicks on the STATE LAWS sub category");
        }else {
            visibilityWait(blog.getBlogOption());
            highlighter.highLighterMethod(stateLawDetail.getStateLawOption(), DriverManager.getDriver());
            Assert.assertTrue(stateLawDetail.getStateLawOption().isDisplayed());
            Logger.log("User should be able to see STATE LAWS sub category");
            jsClick(stateLawDetail.getStateLawOption());
            Logger.log("User clicks on the STATE LAWS sub category");
        }
    }

    @When("user clicks on the any state card on the index page")
    public void userClicksOnTheAnyStateCardOnTheIndexPage() {
        visibilityWait(stateLawDetail.getStateLawIndexPageHeader());
        Assert.assertTrue(stateLawDetail.getStateLawIndexPageHeader().isDisplayed());
        Logger.log("User should be able to see STATE LAWS index page");
        visibilityWait(stateLawDetail.getStateLawIndexPageHeroSection());
        javascriptScroll(stateLawDetail.getStateLawIndexPageHeroSection());
        visibilityWait(stateLawDetail.getStateLawIndexPageHeroSectionReadMoreCTA());
        Assert.assertTrue(stateLawDetail.getStateLawIndexPageHeroSectionReadMoreCTA().isDisplayed());
        jsClick(stateLawDetail.getStateLawIndexPageHeroSectionReadMoreCTA());
        Logger.log("user clicks on the any state card on the index page");
    }

    @Then("User should land on the state law detail page")
    public void userShouldLandOnTheStateLawDetailPage() {
        visibilityWait(stateLawDetail.getStateLawDetailPageHeader());
        Assert.assertTrue(stateLawDetail.getStateLawDetailPageHeader().isDisplayed());
        Logger.log("User should land on the state law detail page");

    }

    @When("User is in the state law detail page")
    public void userIsInTheStateLawDetailPage() {
        visibilityWait(stateLawDetail.getStateLawIndexPageHeader());
        Assert.assertTrue(stateLawDetail.getStateLawIndexPageHeader().isDisplayed());
        Logger.log("User should be able to see STATE LAWS index page");
        visibilityWait(stateLawDetail.getStateLawIndexPageHeroSection());
        javascriptScroll(stateLawDetail.getStateLawIndexPageHeroSection());
        visibilityWait(stateLawDetail.getStateLawIndexPageHeroSectionReadMoreCTA());
        Assert.assertTrue(stateLawDetail.getStateLawIndexPageHeroSectionReadMoreCTA().isDisplayed());
        jsClick(stateLawDetail.getStateLawIndexPageHeroSectionReadMoreCTA());
        Logger.log("user clicks on the any state card on the index page");
        visibilityWait(stateLawDetail.getStateLawDetailPageHeader());
        Assert.assertTrue(stateLawDetail.getStateLawDetailPageHeader().isDisplayed());
        Logger.log("User should land on the state law detail page");
    }

    @Then("user should able to view the hero image in background in the state law detail page")
    public void userShouldAbleToViewTheHeroImageInBackgroundInTheStateLawDetailPage() {
        visibilityWait(stateLawDetail.getStateLawDetailHeroArticleBannerImage());
        Assert.assertTrue(stateLawDetail.getStateLawDetailHeroArticleBannerImage().isDisplayed());
        Logger.log("user should able to view the hero image in background in the state law detail page");
    }

    @And("user should able to view the Article  title in the state law detail page")
    public void userShouldAbleToViewTheArticleTitleInTheStateLawDetailPage() {
        visibilityWait(stateLawDetail.getStateLawDetailPageHeader());
        Assert.assertTrue(stateLawDetail.getStateLawDetailPageHeader().isDisplayed());
        Logger.log("user should able to view the Article  title in the state law detail page");
    }

    @And("the overview of a particular article banner in the state law detail page")
    public void theOverviewOfAParticularArticleBannerInTheStateLawDetailPage() {
        visibilityWait(stateLawDetail.getStateLawDetailHeroArticleOverviewText());
        Assert.assertTrue(stateLawDetail.getStateLawDetailHeroArticleOverviewText().isDisplayed());
        Logger.log("user should able to view the overview of a particular article banner in the state law detail page");
    }

    @And("user should able to view the description or copy text of the article in the state law detail page")
    public void userShouldAbleToViewTheDescriptionOrCopyTextOfTheArticleInTheStateLawDetailPage() {
        visibilityWait(benefitsOfCannabis.getContentHeader());
        javascriptScroll(benefitsOfCannabis.getRichtextList().get(0));
        visibilityWait(benefitsOfCannabis.getRichtextList().get(0));
        Assert.assertTrue(benefitsOfCannabis.getRichtextList().get(0).isDisplayed());
        highlighter.highLighterMethod(benefitsOfCannabis.getRichtextList().get(0), DriverManager.getDriver());
        Logger.log("user should able to view the description or copy text of the article");
    }

    @Then("user should able to view the published date of the article when it got published in the state law detail page")
    public void userShouldAbleToViewThePublishedDateOfTheArticleWhenItGotPublishedInTheStateLawDetailPage() {
        visibilityWait(stateLawDetail.getStateLawDetailHeroArticleBannerDate());
        Assert.assertTrue(stateLawDetail.getStateLawDetailHeroArticleBannerDate().isDisplayed());
        Logger.log("user should able to view the published date of the article when it got published in the state law detail page");
    }

    @Then("user should able to view “New” tag for the article which has less than nor equal to{int} days from published date in the state law detail page")
    public void userShouldAbleToViewNewTagForTheArticleWhichHasLessThanNorEqualToDaysFromPublishedDateInTheStateLawDetailPage(int arg0) {
        visibilityWait(stateLawDetail.getStateLawDetailHeroArticleBannerNewLabel());
        Assert.assertTrue(stateLawDetail.getStateLawDetailHeroArticleBannerNewLabel().isDisplayed());
        Logger.log("user should able to view “New” tag for the article which has less than nor equal to{int} days from published date in the state law detail page");
    }

    @Then("user should able to view the Category tag as {string}  in the article section of the state law detail page")
    public void userShouldAbleToViewTheCategoryTagAsInTheArticleSectionOfTheStateLawDetailPage(String arg0) {
        visibilityWait(stateLawDetail.getStateLawDetailHeroArticleBannerLabel());
        String labelText = stateLawDetail.getStateLawDetailHeroArticleBannerLabel().getText();
        System.out.println(labelText);
        if(labelText.equals("Resources")){
            Assert.assertTrue(stateLawDetail.getStateLawDetailHeroArticleBannerLabel().isDisplayed());
            Logger.log("user should able to view the Category tag as Resources  in the article section");
        }else{
            Logger.log("user not able to view the Category tag as Resources  in the article section");
        }
    }

    @And("User clicks on the links in the state law detail page")
    public void userClicksOnTheLinksInTheStateLawDetailPage() {
        visibilityWait(benefitsOfCannabis.getTableOfContentList().get(1));
        Assert.assertTrue(benefitsOfCannabis.getTableOfContentList().get(1).isDisplayed());
        //jsClick(benefitsOfCannabis.getTableOfContentList().get(1));
        DriverManager.getDriver().findElement(By.xpath("//h5[text()='Content']/parent::div/child::div/child::div/a[text()='History of Marijuana’s Legality in Virginia']")).click();
        Logger.log("User clicks on the links");
    }

    @And("User should be able to click on any link in benefits TOC in the state law detail page")
    public void userShouldBeAbleToClickOnAnyLinkInBenefitsTOCInTheStateLawDetailPage() {
        visibilityWait(benefitsOfCannabis.getTableOfContentList().get(1));
        Assert.assertTrue(benefitsOfCannabis.getTableOfContentList().get(1).isDisplayed());
        DriverManager.getDriver().findElement(By.xpath("//h5[text()='Content']/parent::div/child::div/child::div/a[text()='History of Marijuana’s Legality in Virginia']")).click();
        Logger.log("User should be able to click on any link in benefits TOC in the state law detail page");
    }

    @Then("User should see the page being navigated to respective section in benefits TOC in the state law detail page")
    public void userShouldSeeThePageBeingNavigatedToRespectiveSectionInBenefitsTOCInTheStateLawDetailPage() {
        visibilityWait(stateLawDetail.getHistoryOfMarijuanaLegalityInVirginiaHeader());
        Assert.assertTrue(stateLawDetail.getHistoryOfMarijuanaLegalityInVirginiaHeader().isDisplayed());
        Logger.log("User should see the page being navigated to respective section in benefits TOC in the state law detail page");
    }

    @And("User is navigated to respective section on clicking any link in the state law detail page")
    public void userIsNavigatedToRespectiveSectionOnClickingAnyLinkInTheStateLawDetailPage() {
        visibilityWait(benefitsOfCannabis.getTableOfContentList().get(1));
        Assert.assertTrue(benefitsOfCannabis.getTableOfContentList().get(1).isDisplayed());
        DriverManager.getDriver().findElement(By.xpath("//h5[text()='Content']/parent::div/child::div/child::div/a[text()='History of Marijuana’s Legality in Virginia']")).click();
        Logger.log("User is navigated to respective section on clicking any link in the state law detail page");
    }

    @And("User scrolls down the page to view a particular section in the state law detail page")
    public void userScrollsDownThePageToViewAParticularSectionInTheStateLawDetailPage() {
        visibilityWait(stateLawDetail.getHistoryOfMarijuanaLegalityInVirginiaHeader());
        Assert.assertTrue(stateLawDetail.getHistoryOfMarijuanaLegalityInVirginiaHeader().isDisplayed());
        Logger.log("User scrolls down the page to view a particular section in the state law detail page");
    }

    @Then("User should be able to see the anchor links ToC being scrolled in background behind in the state law detail page")
    public void userShouldBeAbleToSeeTheAnchorLinksToCBeingScrolledInBackgroundBehindInTheStateLawDetailPage() {
        visibilityWait(stateLawDetail.getHistoryOfMarijuanaLegalityInVirginiaHeader());
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
        js.executeScript("window.scrollBy(0,-2000);");
        waitFor(500);
        Assert.assertTrue(stateLawDetail.getHistoryOfMarijuanaLegalityInVirginiaHeader().isDisplayed());
        Logger.log("User should be able to see the anchor links ToC being scrolled in background behind in the state law detail page");
    }

    @And("User is viewing the title text in the state law detail page")
    public void userIsViewingTheTitleTextInTheStateLawDetailPage() {
        visibilityWait(benefitsOfCannabis.getTableOfContentList().get(1));
        Assert.assertTrue(benefitsOfCannabis.getTableOfContentList().get(1).isDisplayed());
        //jsClick(benefitsOfCannabis.getTableOfContentList().get(1));
        DriverManager.getDriver().findElement(By.xpath("//h5[text()='Content']/parent::div/child::div/child::div/a[text()='History of Marijuana’s Legality in Virginia']")).click();
        Logger.log("User clicks on the links");
        visibilityWait(stateLawDetail.getHistoryOfMarijuanaLegalityInVirginiaHeader());
        Assert.assertTrue(stateLawDetail.getHistoryOfMarijuanaLegalityInVirginiaHeader().isDisplayed());
        Logger.log("User is viewing the title text");
    }

    @And("User is viewing the text in a quote in the state law detail page")
    public void userIsViewingTheTextInAQuoteinTheStateLawDetailPage() {
        visibilityWait(stateLawDetail.getAdultUseMarijuanaHeader());
        javascriptScroll(stateLawDetail.getAdultUseMarijuanaHeader());
        Assert.assertTrue(stateLawDetail.getAdultUseMarijuanaHeader().isDisplayed());
        visibilityWait(benefitsOfCannabis.getQuoteParagraph());
        Assert.assertTrue(benefitsOfCannabis.getQuoteParagraph().isDisplayed());
        Logger.log("User is viewing the text in a quote");
    }

    @Then("user should be able to see the big size image in {int}x{int} pixel in the state law detail page")
    public void userShouldBeAbleToSeeTheBigSizeImageInXPixelInTheStateLawDetailPage(int arg0, int arg1) {
        visibilityWait(stateLawDetail.getAdultUseMarijuanaHeader());
        javascriptScroll(stateLawDetail.getAdultUseMarijuanaHeader());
        Assert.assertTrue(stateLawDetail.getAdultUseMarijuanaHeader().isDisplayed());
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
        js.executeScript("window.scrollBy(0,-500);");
        visibilityWait(benefitsOfCannabis.getBigImage());
        Assert.assertTrue(benefitsOfCannabis.getBigImage().isDisplayed());
        Logger.log("user should be able to see the big size image in 1192x606 pixel");
    }

    @And("User scrolls down to the banner section in state law details page")
    public void userScrollsDownToTheBannerSectionInStateLawDetailsPage() {
            visibilityWait(stateLawDetail.getWhatIsStilIllegalHeader());
            javascriptScroll(stateLawDetail.getWhatIsStilIllegalHeader());
            Assert.assertTrue(stateLawDetail.getWhatIsStilIllegalHeader().isDisplayed());
            JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
            js.executeScript("window.scrollBy(0,-1000);");
            Logger.log("User scrolls down to the banner section");

    }
}
