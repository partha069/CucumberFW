package parallel;

import com.driverfactory.DriverManager;
import com.resuableMethods.CommonAction;
import com.utilities.Logger;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pom.gti.Header;
import pom.gti.T09_Get_A_medicalCard_index;
import pom.gti.T09_State_law_index;

public class T09_State_law_index_Stepdef extends CommonAction {
    Header HeaderActions = new Header(DriverManager.getDriver());
    T09_State_law_index State_law = new T09_State_law_index(DriverManager.getDriver());
    T09_Get_A_medicalCard_index Getamedicalcard =new T09_Get_A_medicalCard_index(DriverManager.getDriver());


    @And("User clicks on the state laws sub category")
    public void userClicksOnTheStateLawsSubCategory() {
        jsClick(HeaderActions.getexpandedcannabisinsiderstatelaws());
        Logger.log("User clicks on the state laws sub category");
    }

    @Then("User lands on the the state laws page")
    public void userLandsOnTheTheStateLawsPage() {
        visibilityWait(State_law.getState_law_header());
        Assert.assertTrue(isElementPresent(State_law.getState_law_header()));
        Logger.log("User lands on the the state laws page");
    }

    @Then("User is able to view the main heading")
    public void user_is_able_to_view_the_main_heading() {
        Assert.assertTrue(State_law.getState_law_header().isDisplayed());
        Logger.log("Uer is able to view the main heading");
    }

    @Then("User is able to view the main description")
    public void user_is_able_to_view_the_main_description() {
        Assert.assertTrue(State_law.getState_law_description().isDisplayed());
        Logger.log("Uer is able to view the description");
    }

    @Then("User is able to view view the title heading {string}")
    public void userIsAbleToViewViewTheTitleHeading(String arg0) {
        Assert.assertTrue(Getamedicalcard.getindexPage_recommended_Resources_header().isDisplayed());
        Logger.log("User is able to view view the title heading recommended resource");
    }

    @And("User is able to view short description for recommended resources header")
    public void userIsAbleToViewShortDescriptionForRecommendedResourcesHeader() {
        Assert.assertTrue(isElementPresent(Getamedicalcard.getindexPage_recommended_Resources_headerdescription()));
        Logger.log("User is able to view short description for recommended resources header");
    }


}
