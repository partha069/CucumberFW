package parallel;

import com.driverfactory.DriverManager;
import com.resuableMethods.CommonAction;
import com.utilities.Logger;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pom.gti.Header;
import pom.gti.T09_Dispensary_guideindex;

public class T09_Dispensary_guideIndex_Stepdef extends CommonAction {
    Header HeaderActions = new Header(DriverManager.getDriver());
    T09_Dispensary_guideindex dispensaryGuideindex = new T09_Dispensary_guideindex(DriverManager.getDriver());

    @And("User clicks on the Dispensary guide sub category")
    public void userClicksOnTheDispensaryGuideSubCategory() {
        jsClick(HeaderActions.getexpandedcannabisinsiderdispensaryguide());
        Logger.log("User clicks on the Dispensary guide sub category");
    }

    @When("User is on the Dispensary guide index page")
    public void userIsOnTheDispensaryGuideIndexPage() {
        Assert.assertTrue(dispensaryGuideindex.getDispensaryguide_index_header().isDisplayed());
        Logger.log("User is on the Dispensary guide index page");
    }

    @Then("User is able to view the main heading of dispensary guide index page")
    public void userIsAbleToViewTheMainHeadingOfDispensaryGuideIndexPage() {
        Assert.assertTrue(dispensaryGuideindex.getDispensaryguide_index_header().isDisplayed());
        Logger.log("Uer is able to view the main heading of dispensary guide index page");
    }

    @And("User is able to view the main description of dispensary guide index page")
    public void userIsAbleToViewTheMainDescriptionOfDispensaryGuideIndexPage() {
        Assert.assertTrue(dispensaryGuideindex.getDispensaryguide_index_headerdiscription().isDisplayed());
        Logger.log("Uer is able to view the main description of dispensary guide index page");
    }

    @Then("user should be able to navigated to the perticular dispensary details page")
    public void userShouldBeAbleToNavigatedToThePerticularDispensaryDetailsPage() {
        Assert.assertTrue(isElementPresent(dispensaryGuideindex.getdispensary_details_Hero_header()));
        Logger.log("user should be able to navigated to the perticular dispensary details page");

    }
}
