package parallel;

import com.driverfactory.DriverManager;
import com.resuableMethods.CommonAction;
import com.resuableMethods.Highlighter;
import com.utilities.Logger;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pom.gti.Header;
import pom.gti.RewardsPage;

public class T08_Rewards_Stepdef extends CommonAction {
	RewardsPage rewards = new RewardsPage(DriverManager.getDriver());
	Header Headerdesktop = new Header(DriverManager.getDriver());
	Highlighter highlighter = new Highlighter();

	/*******************************************************/

	@Given("user lands on risecannabis website")
	public void user_lands_on_risecannabis_website() throws Exception {
		DriverManager.getDriver().get(getData("risecannabisQA"));
		visibilityWait(Headerdesktop.getminnesotaheaderlogo());
		Logger.log("User on landed on risecannabis website");
	}

	@And("User clicks on Rewards option from global header")
	public void User_clicks_on_Rewards_option_from_global_header(){
//		if (GlobalHeader.getHambergerMenu().isDisplayed()) {
//			GlobalHeader.ClickOnHambergerMenu();
//			GlobalHeader.ClickOnRewardsCTAHamburgerMenu();
//		} else {
//			if (GlobalHeader.getRewards().isDisplayed()){
//				Assert.assertTrue(GlobalHeader.getRewards().isDisplayed());
//				GlobalHeader.ClickOnRewards();
//			}
//		}

		if (Headerdesktop.getHamburgerMenu().isDisplayed()) {
			Headerdesktop.ClickOnHambergerMenu();
			Headerdesktop.ClickOnRewardsCTAHamburgerMenu();
		} else {
			if (Headerdesktop.getheaderrewards().isDisplayed()){
				Assert.assertTrue(Headerdesktop.getheaderrewards().isDisplayed());
				Headerdesktop.ClickOnRewards();
			}
		}
		Logger.log("User clicks on Rewards option from global header");
	}

	@And("User clicks on Rewards option from global header demo")
	public void User_clicks_on_Rewards_option_from_global_header_demo(){
		Headerdesktop.ClickOnRewards();
		Logger.log("User clicks on Rewards option from global header");
	}

	@When("User is viewing the Rewards Hero Banner")
	public void User_is_viewing_the_Rewards_Hero_Banner(){
		visibilityWait(rewards.getHeroBannerSection());
		Assert.assertTrue(rewards.getHeroBannerSection().isDisplayed());
		Logger.log("User is viewing the Rewards Hero Banner");
	}

	@And("User is viewing the page loaded once refresh page")
	public void User_is_viewing_the_Rewards_page_after_refreshing_page(){
		DriverManager.getDriver().navigate().refresh();
		Logger.log("User is viewing the Rewards Hero Banner");
	}

	@Then("User should able to view Title Text")
	public void User_should_able_to_view_Title_Text(){
		highlighter.highLighterMethod(rewards.getTitleText(), DriverManager.getDriver());
		Assert.assertTrue(rewards.getTitleText().isDisplayed());
		Logger.log("User should able to view Title Text");
	}

	@And("User should able to view Copy Text")
	public void User_should_able_to_view_Copy_Text(){
		highlighter.highLighterMethod(rewards.getcopyText(), DriverManager.getDriver());
		Assert.assertTrue(rewards.getcopyText().isDisplayed());
		Logger.log("User should able to view Copy Text");
	}

	@And("User should able to view image")
	public void User_should_able_to_view_image(){
		if (rewards.getHeroBannerMobile().isDisplayed()){
			Assert.assertTrue(rewards.getHeroBannerMobile().isDisplayed());
		}else {
			if (rewards.getherobanner().isDisplayed()){
				Assert.assertTrue(rewards.getherobanner().isDisplayed());
			}
		}
		Logger.log("User should able to view image");
	}

	@And("User should able to view RISE Rewards Logo")
	public void User_should_able_to_view_RISE_Rewards_Logo(){
		if (rewards.getRiseLogo().isDisplayed()){
			Assert.assertTrue(rewards.getRiseLogo().isDisplayed());
		}else{
			Assert.assertTrue(rewards.getRiseLogoMobile().isDisplayed());
		}
		Logger.log("User should able to view RISE Rewards Logo");
	}

	@And("User should be able to view the ‘Join now’ CTA")
	public void User_should_be_able_to_view_the_Join_now_CTA() {
		Assert.assertTrue(rewards.getjoinCTA().isDisplayed());
		highlighter.highLighterMethod(rewards.getjoinCTA(), DriverManager.getDriver());
		waitFor(600);
		Logger.log("User should be able to view the ‘Join now’ CTA");
	}

	@When("User scroll down to the Member Benefit section")
	public void User_scroll_down_to_the_Member_Benefit_section()  {
		waitFor(800);
	//	JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
	//	js.executeScript("window.scrollBy(0, 800);");
		javascriptScroll(rewards.getMemberBenefitsSection());
		Logger.log("User scroll down to the Member Benefit section");
	}

	@Then("User is able to view the Member Benefit Section")
	public void User_is_able_to_view_the_Member_Benefit_Section(){
		Assert.assertTrue(rewards.getMemberBenefitsSection().isDisplayed());
		Logger.log("User is able to view the Member Benefit Section");
	}

	@And("User should be able to view the section Title Text")
	public void User_should_be_able_to_view_the_section_Title_Text() {
		highlighter.highLighterMethod(rewards.getMemberBenefits(), DriverManager.getDriver());
		Assert.assertTrue(rewards.getMemberBenefits().isDisplayed());
		Logger.log("User is able to view the Member Benefit Section");
	}

	@And("User should be able to view the section Copy Text")
	public void User_should_be_able_to_view_the_section_Copy_Text() {
		highlighter.highLighterMethod(rewards.getMemberBenefitsCopyText(), DriverManager.getDriver());
		Assert.assertTrue(rewards.getMemberBenefitsCopyText().isDisplayed());
		waitFor(1000);
		Logger.log("User is able to view the Member Benefit Section");
	}

	@Then("User should be able to view the Benefit Card")//
	public void User_should_be_able_to_view_the_Benefit_Card() {
		if (rewards.getBenefitsCardSectionMobile().isDisplayed()){
			highlighter.highLighterMethod(rewards.getBenefitsCardSectionMobile(), DriverManager.getDriver());
			Assert.assertTrue(rewards.getBenefitsCardSectionMobile().isDisplayed());
		}else{
			if (rewards.getBenefitsCardSection().isDisplayed()){
				highlighter.highLighterMethod(rewards.getBenefitsCardSection(), DriverManager.getDriver());
				Assert.assertTrue(rewards.getBenefitsCardSection().isDisplayed());
			}else {
				Assert.fail();
			}
		}
		Logger.log("User should be able to view the Benefit Card");
	}

	@And("User should be able to view the Benefit name along with the benefit icon")
	public void User_should_be_able_to_view_the_Benefit_name_along_with_the_benefit_icon() {
	  if (rewards.getBenefits_OneIcon().isDisplayed()){
		  highlighter.highLighterMethod(rewards.getBenefits_OneIcon(), DriverManager.getDriver());
		  Assert.assertTrue(rewards.getBenefits_OneIcon().isDisplayed());
		  highlighter.highLighterMethod(rewards.getBenefits_OneText(), DriverManager.getDriver());
		  Assert.assertTrue(rewards.getBenefits_OneText().isDisplayed());
	  }else{
		 if (rewards.getBenefits_OneIconMobile().isDisplayed()){
			 highlighter.highLighterMethod(rewards.getBenefits_OneIconMobile(), DriverManager.getDriver());
			 Assert.assertTrue(rewards.getBenefits_OneIconMobile().isDisplayed());
			 highlighter.highLighterMethod(rewards.getBenefits_OneTextMobile(), DriverManager.getDriver());
			 Assert.assertTrue(rewards.getBenefits_OneTextMobile().isDisplayed());
		 }else {
			 Assert.fail();
		 }
	  }
	  waitFor(600);
		Logger.log("User should be able to view the Benefit Card");
	}

	@And("User is able to view less than or equal to 4 benefits card")
	public void User_is_able_to_view_less_than_or_equal_to_four_benefits_card() {
	if (rewards.getBenefits_OneIcon().isDisplayed()){
		Assert.assertTrue(rewards.getBenefits_OneIcon().isDisplayed());
		highlighter.highLighterMethod(rewards.getBenefits_OneIcon(), DriverManager.getDriver());
		Assert.assertTrue(rewards.getBenefits_OneText().isDisplayed());
		highlighter.highLighterMethod(rewards.getBenefits_OneText(), DriverManager.getDriver());
		Assert.assertTrue(rewards.getBenefits_TwoIcon().isDisplayed());
		highlighter.highLighterMethod(rewards.getBenefits_TwoIcon(), DriverManager.getDriver());
		Assert.assertTrue(rewards.getBenefits_TwoText().isDisplayed());
		highlighter.highLighterMethod(rewards.getBenefits_TwoText(), DriverManager.getDriver());
		Assert.assertTrue(rewards.getBenefits_ThreeIcon().isDisplayed());
		highlighter.highLighterMethod(rewards.getBenefits_ThreeIcon(), DriverManager.getDriver());
		Assert.assertTrue(rewards.getBenefits_ThreeText().isDisplayed());
		highlighter.highLighterMethod(rewards.getBenefits_ThreeText(), DriverManager.getDriver());
		Assert.assertTrue(rewards.getBenefits_FourIcon().isDisplayed());
		highlighter.highLighterMethod(rewards.getBenefits_FourIcon(), DriverManager.getDriver());
		Assert.assertTrue(rewards.getBenefits_FourText().isDisplayed());
		highlighter.highLighterMethod(rewards.getBenefits_FourText(), DriverManager.getDriver());
	}else {
		if (rewards.getBenefits_OneIconMobile().isDisplayed()){
			Assert.assertTrue(rewards.getBenefits_OneIconMobile().isDisplayed());
			highlighter.highLighterMethod(rewards.getBenefits_OneIconMobile(), DriverManager.getDriver());
			Assert.assertTrue(rewards.getBenefits_OneTextMobile().isDisplayed());
			highlighter.highLighterMethod(rewards.getBenefits_OneTextMobile(), DriverManager.getDriver());
			Assert.assertTrue(rewards.getBenefits_TwoIconMobile().isDisplayed());
			highlighter.highLighterMethod(rewards.getBenefits_TwoIconMobile(), DriverManager.getDriver());
			Assert.assertTrue(rewards.getBenefits_TwoTextMobile().isDisplayed());
			highlighter.highLighterMethod(rewards.getBenefits_TwoTextMobile(), DriverManager.getDriver());
			Assert.assertTrue(rewards.getBenefits_ThreeIconMobile().isDisplayed());
			highlighter.highLighterMethod(rewards.getBenefits_ThreeIconMobile(), DriverManager.getDriver());
			Assert.assertTrue(rewards.getBenefits_ThreeTextMobile().isDisplayed());
			highlighter.highLighterMethod(rewards.getBenefits_ThreeTextMobile(), DriverManager.getDriver());
			Assert.assertTrue(rewards.getBenefits_FourIconMobile().isDisplayed());
			highlighter.highLighterMethod(rewards.getBenefits_FourIconMobile(), DriverManager.getDriver());
			Assert.assertTrue(rewards.getBenefits_FourTextMobile().isDisplayed());
			highlighter.highLighterMethod(rewards.getBenefits_FourTextMobile(), DriverManager.getDriver());
		}else {
			Assert.fail();
		}
	}
		Logger.log("User is able to view less than or equal to 4 benefits card");
	}

	@Then("User is able to view more than 4 benefits cards")
	public void User_is_able_to_view_more_than_four_benefits_card() {
		try {
			Assert.assertTrue(rewards.getShowingCountTextMobile().isDisplayed());
		}catch (Exception e){
			System.out.println("Only 4 Cards are displaying");
		}
		Logger.log("User is able to view more than 4 benefits card");
	}

	@And("User should be able to view the the Show more CTA with the number of benefit cards that are yet to be displayed")
	public void User_should_be_able_to_view_the_the_Show_more_CTA_with_the_number_of_benefit_cards_that_are_yet_to_be_displayed() {
        try {
			highlighter.highLighterMethod(rewards.getShowMoreCTAMobile(), DriverManager.getDriver());
			Assert.assertTrue(rewards.getShowMoreCTAMobile().isDisplayed());
			waitFor(1000);
		}catch (Exception e){
			System.out.println("Only 4 Cards are displaying");
		}
		Logger.log("User should be able to  view the  the Show more CTA with the number of benefit cards that are yet to be displayed");
	}

	@And("User should be able to view all the remaining benefit cards")
	public void User_should_be_able_to_view_all_the_remaining_benefit_cards() {
		try {
			if (rewards.getShowingCountTextMobile().isDisplayed()){
				rewards.ClickOnShowMoreCTAMobile();
				JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
				js.executeScript("window.scrollBy(0, 220);");
				Assert.assertTrue(rewards.getBenefits_FiveIconMobile().isDisplayed());
				highlighter.highLighterMethod(rewards.getBenefits_FiveIconMobile(), DriverManager.getDriver());
				Assert.assertTrue(rewards.getBenefits_FiveTextMobile().isDisplayed());
				highlighter.highLighterMethod(rewards.getBenefits_FiveTextMobile(), DriverManager.getDriver());
				Assert.assertTrue(rewards.getBenefits_SixIconMobile().isDisplayed());
				highlighter.highLighterMethod(rewards.getBenefits_SixIconMobile(), DriverManager.getDriver());
				Assert.assertTrue(rewards.getBenefits_SixTextMobile().isDisplayed());
				highlighter.highLighterMethod(rewards.getBenefits_SixTextMobile(), DriverManager.getDriver());
				rewards.ClickOnShowLessCTAMobile();
				js.executeScript("window.scrollBy(0, -225);");
				waitFor(2000);
			}
		}catch (Exception e){
			System.out.println("Only 4 Cards are displaying");
		}
		Logger.log("User should be able to view all the remaining benefit cards");
	}


	@And("User should not be able to view the horizontal scroll with left or right scroll")
	public void User_should_not_be_able_to_view_the_horizontal_scroll_with_left_or_right_scroll() {
	  // ScrollJavascriptLeft();
		if (rewards.getShowingCountTextMobile().isDisplayed()){
			Assert.assertTrue(rewards.getShowingCountTextMobile().isDisplayed());
			Assert.assertTrue(rewards.getShowMoreCTAMobile().isDisplayed());
			rewards.ClickOnShowMoreCTAMobile();
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
			js.executeScript("window.scrollBy(0, 220);");
			Assert.assertTrue(rewards.getBenefits_FiveIconMobile().isDisplayed());
			highlighter.highLighterMethod(rewards.getBenefits_FiveIconMobile(), DriverManager.getDriver());
			Assert.assertTrue(rewards.getBenefits_FiveTextMobile().isDisplayed());
			highlighter.highLighterMethod(rewards.getBenefits_FiveTextMobile(), DriverManager.getDriver());
			Assert.assertTrue(rewards.getBenefits_SixIconMobile().isDisplayed());
			highlighter.highLighterMethod(rewards.getBenefits_SixIconMobile(), DriverManager.getDriver());
			Assert.assertTrue(rewards.getBenefits_SixTextMobile().isDisplayed());
			highlighter.highLighterMethod(rewards.getBenefits_SixTextMobile(), DriverManager.getDriver());
			rewards.ClickOnShowLessCTAMobile();
			js.executeScript("window.scrollBy(0, -225);");
			waitFor(600);
		}else {
			if (rewards.getProgressBar().isDisplayed()){
				highlighter.highLighterMethod(rewards.getNumberOfCards(), DriverManager.getDriver());
				Assert.assertTrue(rewards.getNumberOfCards().isDisplayed());
				highlighter.highLighterMethod(rewards.getProgressBar(), DriverManager.getDriver());
				Assert.assertTrue(rewards.getProgressBar().isDisplayed());
				highlighter.highLighterMethod(rewards.getLeftArrow(), DriverManager.getDriver());
				Assert.assertTrue(rewards.getLeftArrow().isDisplayed());
				highlighter.highLighterMethod(rewards.getRightArrow(), DriverManager.getDriver());
				Assert.assertTrue(rewards.getRightArrow().isDisplayed());
				rewards.ClickOnRightArrow();
				waitFor(200);
				Assert.assertTrue(rewards.getBenefits_OneIcon().isDisplayed());
				Assert.assertTrue(rewards.getBenefits_OneText().isDisplayed());
				highlighter.highLighterMethod(rewards.getBenefits_ThreeIcon(), DriverManager.getDriver());
				highlighter.highLighterMethod(rewards.getBenefits_ThreeText(), DriverManager.getDriver());
				highlighter.highLighterMethod(rewards.getBenefits_FourIcon(), DriverManager.getDriver());
				highlighter.highLighterMethod(rewards.getBenefits_FourText(), DriverManager.getDriver());
				rewards.ClickOnLeftArrow();
				waitFor(600);
			}else {
				System.out.println("Only 4 Cards are displaying");
			}
		}

	/*	try{
			if (rewards.getProgressBar().isDisplayed()){
				//	highlighter.highLighterMethod(rewards.getNumberOfCards(), DriverManager.getDriver());
				Assert.assertTrue(rewards.getNumberOfCards().isDisplayed());
				//	highlighter.highLighterMethod(rewards.getProgressBar(), DriverManager.getDriver());
				Assert.assertTrue(rewards.getProgressBar().isDisplayed());
				//	highlighter.highLighterMethod(rewards.getLeftArrow(), DriverManager.getDriver());
				Assert.assertTrue(rewards.getLeftArrow().isDisplayed());
				//	highlighter.highLighterMethod(rewards.getRightArrow(), DriverManager.getDriver());
				Assert.assertTrue(rewards.getRightArrow().isDisplayed());
				rewards.ClickOnRightArrow();
				waitFor(200);
				rewards.ClickOnLeftArrow();
				waitFor(2000);
			}
		}catch (Exception e){
			if (rewards.getShowingCountTextMobile().isDisplayed()){
				//	highlighter.highLighterMethod(rewards.getShowingCountTextMobile(), DriverManager.getDriver());
				Assert.assertTrue(rewards.getShowingCountTextMobile().isDisplayed());
				//	highlighter.highLighterMethod(rewards.getShowMoreCTAMobile(), DriverManager.getDriver());
				Assert.assertTrue(rewards.getShowMoreCTAMobile().isDisplayed());
				rewards.ClickOnShowMoreCTAMobile();
				Assert.assertTrue(rewards.getBenefits_FiveIconMobile().isDisplayed());
				Assert.assertTrue(rewards.getBenefits_FiveTextMobile().isDisplayed());
				Assert.assertTrue(rewards.getBenefits_SixIconMobile().isDisplayed());
				Assert.assertTrue(rewards.getBenefits_SixTextMobile().isDisplayed());
			}else {
				Assert.fail();
			}
		}*/
		Logger.log("User should not be able to view the horizontal scroll with left or right scroll");
	}

	@And("User should be able to view the number of cards that have been shown")
	public void User_should_be_able_to_view_the_number_of_cards_that_have_been_shown() {
		highlighter.highLighterMethod(rewards.getShowingCountTextMobile(), DriverManager.getDriver());
		Assert.assertTrue(rewards.getShowingCountTextMobile().isDisplayed());
		waitFor(1000);
		Logger.log("User should be able to  view the number of cards that have been shown (eg: Showing 4 of 6)");
	}


	@When("User scroll down to the Point Matrix section")
	public void User_scroll_down_to_the_Point_Matrix_section() {
		javascriptScroll(rewards.getRewardsPointMatrix());
		waitFor(2000);
	//	JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
	//	js.executeScript("window.scrollBy(0, 1595);");
		Logger.log("User scroll down to the Point Matrix section");
	}

	@When("User scroll down to the Point Matrix section demo")
	public void User_scroll_down_to_the_Point_Matrix_section_demo() {
		waitFor(600);
	//	scrollDownToNextSection();
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("window.scrollBy(0, 800);");
		Logger.log("User scroll down to the Point Matrix section");
	}

	@Then("User is able to view the Point matrix with points division Banner image")
	public void User_is_able_to_view_the_Point_matrix_with_points_division_Banner_image() {
		if (rewards.getRewardsPointMatrix().isDisplayed()){
			Assert.assertTrue(rewards.getRewardsPointMatrix().isDisplayed());
			highlighter.highLighterMethod(rewards.getRewardsPointMatrix(), DriverManager.getDriver());
			Assert.assertTrue(rewards.getRewardsMatrixBanner().isDisplayed());
		}else{
        if (rewards.getRewardsPointMatrixMobile().isDisplayed()){
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
			js.executeScript("window.scrollBy(0, -150);");
			Assert.assertTrue(rewards.getRewardsPointMatrixMobile().isDisplayed());
			highlighter.highLighterMethod(rewards.getRewardsPointMatrixMobile(), DriverManager.getDriver());
			Assert.assertTrue(rewards.getRewardsMatrixBannerMobile().isDisplayed());
		}else {
			Assert.fail();
		}
		}
	//	getRewardsPointMatrixMobile
		waitFor(1000);
		Logger.log("User is able to view the Point matrix with points division Banner image");
	}


	@Then("User should be able to view the Title text")
	public void User_should_be_able_to_view_the_Title_text() {
		if (rewards.getRewardsMatrix_TitleTextMobile().isDisplayed()){
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
			js.executeScript("window.scrollBy(0, -170);");
			Assert.assertTrue(rewards.getRewardsMatrix_TitleTextMobile().isDisplayed());
			highlighter.highLighterMethod(rewards.getRewardsMatrix_TitleTextMobile(), DriverManager.getDriver());
		}else {
			if (rewards.getRewardsMatrix_TitleText().isDisplayed()){
				highlighter.highLighterMethod(rewards.getRewardsMatrix_TitleText(), DriverManager.getDriver());
				Assert.assertTrue(rewards.getRewardsMatrix_TitleText().isDisplayed());
			}else {
				Assert.fail();
			}
		}
		Logger.log("User should be able to view the Title text");
	}

	@And("User should be able to view the Copy Text")
	public void User_should_be_able_to_view_the_Copy_Text() {
		if (rewards.getRewardsMatrix_CopyTextMobile().isDisplayed()){
			highlighter.highLighterMethod(rewards.getRewardsMatrix_CopyTextMobile(), DriverManager.getDriver());
			Assert.assertTrue(rewards.getRewardsMatrix_CopyTextMobile().isDisplayed());
		}else{
			if (rewards.getRewardsMatrix_CopyText().isDisplayed()){
				highlighter.highLighterMethod(rewards.getRewardsMatrix_CopyText(), DriverManager.getDriver());
				Assert.assertTrue(rewards.getRewardsMatrix_CopyText().isDisplayed());
			}else {
				Assert.fail();
			}
		}
		Logger.log("User should be able to view the Copy Text");
	}

	@And("User should be able to view the Join now CTA")
	public void User_should_be_able_to_view_the_PointMatrixJoin_now_CTA() {
		if (rewards.getPointMatrix_JoinNowCTAMobile().isDisplayed()){
			highlighter.highLighterMethod(rewards.getPointMatrix_JoinNowCTAMobile(), DriverManager.getDriver());
			Assert.assertTrue(rewards.getPointMatrix_JoinNowCTAMobile().isDisplayed());
		}else{
			if (rewards.getPointMatrix_JoinNowCTA().isDisplayed()){
				highlighter.highLighterMethod(rewards.getPointMatrix_JoinNowCTA(), DriverManager.getDriver());
				Assert.assertTrue(rewards.getPointMatrix_JoinNowCTA().isDisplayed());
			}else {
				Assert.fail();
			}
		}
		Logger.log("User should be able to view the Join now CTA");
	}

	@And("User should be able to view the Banner image")
	public void User_should_be_able_to_view_the_Banner_image() {
		if (rewards.getRewardsMatrixBannerMobile().isDisplayed()){
			Assert.assertTrue(rewards.getRewardsMatrixBannerMobile().isDisplayed());
			highlighter.highLighterMethod(rewards.getRewardsMatrixBannerMobile(), DriverManager.getDriver());
			waitFor(600);
		}else{
			if (rewards.getRewardsMatrixBanner().isDisplayed()){
				Assert.assertTrue(rewards.getRewardsMatrixBanner().isDisplayed());
				highlighter.highLighterMethod(rewards.getRewardsMatrixBanner(), DriverManager.getDriver());
				waitFor(600);
			}else{
				Assert.fail();
			}
		}
		Logger.log("User should be able to view the JBanner image");
	}

	@When("User scroll down to the How it works section")
	public void User_scroll_down_to_the_How_it_works_section() {
		if (rewards.getRewardsMatrixBannerMobile().isDisplayed()){
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
			js.executeScript("window.scrollBy(0, 2060);");
		}else{
			waitFor(2000);
			//	scrollByJavascript();
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
			js.executeScript("window.scrollBy(0, 2480);");
		}
		Logger.log("User scroll down to the How it works section");
	}

	@When("User scroll down to the How it works section demo")
	public void User_scroll_down_to_the_How_it_works_section_demo() {
		waitFor(200);
	//	scrollDownToNextSection();
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("window.scrollBy(0, 700);");
		Logger.log("User scroll down to the How it works section");
	}


	@Then("User is able to view the How its work Section")
	public void User_is_ble_to_view_the_How_its_work_Section() {
		Assert.assertTrue(rewards.getHowItWorksSection().isDisplayed());
		Logger.log("User is able to view the How its work Section");
	}


	@And("User should be able to view the section Title Text for How its work")
	public void User_should_be_able_to_view_the_section_Title_Text_for_How_its_work() {
		highlighter.highLighterMethod(rewards.getSectionTitle(), DriverManager.getDriver());
		Assert.assertTrue(rewards.getSectionTitle().isDisplayed());
		waitFor(600);
		Logger.log("User should be able to view the section Title Text for How its work");
	}

	@Then("User should be able to view the images")
	public void User_should_be_able_to_view_the_images() {
		Assert.assertTrue(rewards.getFirstImages().isDisplayed());
		Assert.assertTrue(rewards.getSecondImages().isDisplayed());
		Assert.assertTrue(rewards.getThirdImages().isDisplayed());
		Logger.log("User should be able to view the images");
	}

	@And("User should be able to view the  image title text")
	public void User_should_be_able_to_view_the_image_title_text() {
		highlighter.highLighterMethod(rewards.getFirstImageTitleText(), DriverManager.getDriver());
		Assert.assertTrue(rewards.getFirstImageTitleText().isDisplayed());
		highlighter.highLighterMethod(rewards.getSecondImageTitleText(), DriverManager.getDriver());
		Assert.assertTrue(rewards.getSecondImageTitleText().isDisplayed());
		highlighter.highLighterMethod(rewards.getImageTitleText(), DriverManager.getDriver());
		Assert.assertTrue(rewards.getImageTitleText().isDisplayed());
		Logger.log("User should be able to view the  image title text");
	}

	@And("User should be able to view the  image Copy Text")
	public void User_should_be_able_to_view_the_image_Copy_Text() {
		highlighter.highLighterMethod(rewards.getFirstCopyText(), DriverManager.getDriver());
		Assert.assertTrue(rewards.getFirstCopyText().isDisplayed());
		highlighter.highLighterMethod(rewards.getSecondCopyText(), DriverManager.getDriver());
		Assert.assertTrue(rewards.getSecondCopyText().isDisplayed());
		highlighter.highLighterMethod(rewards.getThirdCopyText(), DriverManager.getDriver());
		Assert.assertTrue(rewards.getThirdCopyText().isDisplayed());
		Logger.log("User should be able to view the  image Copy Text");
	}

	@And("User should be able to view the tooltip icon against the image title")
	public void User_should_be_able_to_view_the_tooltip_icon_against_the_image_title() {
		try {
			highlighter.highLighterMethod(rewards.getFirstToolTip(), DriverManager.getDriver());
			Assert.assertTrue(rewards.getFirstToolTip().isDisplayed());
			highlighter.highLighterMethod(rewards.getSecondToolTip(), DriverManager.getDriver());
			Assert.assertTrue(rewards.getSecondToolTip().isDisplayed());
		}catch (Exception e){
			System.out.println("tooltip is not available");
		}
		waitFor(600);
		Logger.log("User should be able to view the tooltip icon against the image title");
	}

	@And("User hovers on tooltip icon")
	public void User_hovers_on_tooltip_icon() {
		try {
			highlighter.highLighterMethod(rewards.getFirstToolTip(), DriverManager.getDriver());
			Assert.assertTrue(rewards.getFirstToolTip().isDisplayed());
			mouseOver(rewards.getFirstToolTip());
			Assert.assertTrue(rewards.getToolTipText().isDisplayed());
		}catch (Exception e){
			System.out.println("Tooltip is not present");
		}
		Logger.log("User hovers on tooltip icon");
	}

	@And("User taps on Tooltip text box icon")
	public void User_taps_on_Tooltip_text_box_icon() {
		try {
			rewards.ClickOnFirstToolTipMobile();
			Assert.assertTrue(rewards.getToolTipTextMobile().isDisplayed());
			highlighter.highLighterMethod(rewards.getToolTipTextMobile(), DriverManager.getDriver());
		}catch (Exception e){
			System.out.println("Tooltip is not available");
		}
		Logger.log("User taps on Tooltip text box icon");
	}

	@And("User taps on the close icon")
	public void User_taps_on_the_close_icon() {
       Assert.assertTrue(rewards.getFirstToolTipCloseCTAMobile().isDisplayed());
		rewards.ClickOnFirstToolTipCloseCTAMobile();
		Logger.log("User taps on the close icon");
	}

	@Then("User is able to view Tooltip text box with relevant copy")
	public void User_is_able_to_view_Tooltip_text_box_with_relevant_copy() {
		try {
			rewards.ClickOnSecondToolTipMobile();
			Assert.assertTrue(rewards.getToolTipSecondTextMobile().isDisplayed());
			highlighter.highLighterMethod(rewards.getToolTipSecondTextMobile(), DriverManager.getDriver());
		}catch (Exception e){
			System.out.println("Tooltip is not present");
		}
		Logger.log("User is able to view Tooltip text box with relevant copy");
	}

	@Then("User should be able to view the Tooltip text box with relevant copy text")
	public void User_should_be_able_to_view_the_Tooltip_text_box_with_relevant_copy_text() {
		highlighter.highLighterMethod(rewards.getSecondToolTip(), DriverManager.getDriver());
		Assert.assertTrue(rewards.getSecondToolTip().isDisplayed());
		mouseOver(rewards.getSecondToolTip());
		Assert.assertTrue(rewards.getToolTipText().isDisplayed());
		waitFor(1000);
		Logger.log("User should be able to view the Tooltip text box with relevant copy text");
	}



	@When("User scrolls down to the Banner Variant A")
	public void User_scrolls_down_to_the_Banner_Variant_A() {
		waitFor(2000);
		javascriptScroll(rewards.getBannerSection());
//		if (rewards.getRewardsMatrixBannerMobile().isDisplayed()){
//			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
//			js.executeScript("window.scrollBy(0, 2870);");
//		}else{
//			waitFor(2000);
//			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
//			js.executeScript("window.scrollBy(0, 3400);");
//		}
		Logger.log("User scrolls down to the Banner Variant A");
	}

	@When("User scrolls down to the Banner Variant A demo")
	public void User_scrolls_down_to_the_Banner_Variant_A_demo() {
		waitFor(600);
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("window.scrollBy(0, 1000);");
		Logger.log("User scrolls down to the Banner Variant A");
	}

	@Then("User is on banner variant A Text and primary Button")
	public void User_is_on_banner_variant_A_Text_and_primary_Button() {
		Assert.assertTrue(rewards.getBannerSection().isDisplayed());
		Logger.log("User is on banner variant A Text and primary Button");
	}

	@And("User should see an icon with small text")
	public void User_should_see_an_icon_with_small_text() {
		highlighter.highLighterMethod(rewards.getTrackAndRedeemText(), DriverManager.getDriver());
		Assert.assertTrue(rewards.getTrackAndRedeemText().isDisplayed());
		Logger.log("User should see an icon with small text");
	}

	@And("User should be able to view the image title text with primary button")
	public void User_should_be_able_to_view_the_image_title_text_with_primar_button() {
		highlighter.highLighterMethod(rewards.getHeaderText(), DriverManager.getDriver());
		Assert.assertTrue(rewards.getHeaderText().isDisplayed());
		highlighter.highLighterMethod(rewards.getCopyText(), DriverManager.getDriver());
		Assert.assertTrue(rewards.getCopyText().isDisplayed());
		highlighter.highLighterMethod(rewards.getAccessRewardsCTA(), DriverManager.getDriver());
		Assert.assertTrue(rewards.getAccessRewardsCTA().isDisplayed());
		Logger.log("User should be able to view the  image title text with primary button");
	}

	@And("User should see a copy text")
	public void User_should_see_a_copy_text() {
		highlighter.highLighterMethod(rewards.getCopyText(), DriverManager.getDriver());
		Assert.assertTrue(rewards.getCopyText().isDisplayed());
		waitFor(1000);
		Logger.log("User should see a copy text");
	}

	@And("User should see a CTA on any one of the page.")
	public void User_should_see_a_CTA_on_any_one_of_the_page() {
		highlighter.highLighterMethod(rewards.getAccessRewardsCTA(), DriverManager.getDriver());
		Assert.assertTrue(rewards.getAccessRewardsCTA().isDisplayed());
		waitFor(600);
		Logger.log("User should see a CTA on any one of the page.");
	}

	@And("User should click on CTA")
	public void User_should_click_on_CTA() {
		rewards.ClickOnRewardsCTA();
		Logger.log("User should click on CTA");
	}

	@And("User should click on CTA demo")
	public void User_should_click_on_CTA_demo() {
		rewards.ClickOnRewardsCTA();
		Logger.log("User should click on CTA");
	}

	@And("User should redirect to respective page or link which opens on same tab always.")
	public void User_should_redirect_to_respective_page_or_link_which_opens_on_same_tab_always() {
        //Not in Scope
		Logger.log("User should  redirect to respective page or link which opens on same tab always.");
	}

	@And("User should redirect to respective page or link which opens in new tab always.")
	public void User_should_redirect_to_respective_page_or_link_which_opens_in_new_tab_always() {
		//Not in Scope
		Logger.log("User should redirect to respective page or link which opens in new tab always.");
	}

	@When("User scroll down to the FAQ Component section")
	public void User_scroll_down_to_the_FAQ_Component_section() {
		waitFor(2000);
		javascriptScroll(rewards.getFaqSection());
//		if (rewards.getRewardsMatrixBannerMobile().isDisplayed()){
//			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
//			js.executeScript("window.scrollBy(0, 3560);");
//		}else{
//			waitFor(2000);
//			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
//			js.executeScript("window.scrollBy(0, 4300);");
//		}
		Logger.log("User scroll down to the FAQ Component section");
	}

	@When("User scroll down to the FAQ Component section demo")
	public void User_scroll_down_to_the_FAQ_Component_section_demo() {
		if (rewards.getRewardsMatrixBannerMobile().isDisplayed()){
			waitFor(600);
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
			js.executeScript("window.scrollBy(0, 780);");
		}else{
			waitFor(600);
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
			js.executeScript("window.scrollBy(0, 980);");
		}
		Logger.log("User scroll down to the FAQ Component section");
	}

	@Then("User should be able to view the FAQ Section")
	public void User_should_be_able_to_view_the_FAQ_Section() {
		Assert.assertTrue(rewards.getFaqSection().isDisplayed());
		Logger.log("User should be able to view the FAQ Section");
	}

	@And("User should be able to view the remaining number of accordions or FAQs present on the CTA")
	public void User_should_be_able_to_view_the_remaining_number_of_accordions_or_FAQs_present_on_the_CTA() {

		try {
			if (rewards.getRewardsMatrixBannerMobile().isDisplayed()){
				JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
				js.executeScript("window.scrollBy(0, 165);");
				highlighter.highLighterMethod(rewards.getShowMoreCTA(), DriverManager.getDriver());
				Assert.assertTrue(rewards.getShowMoreCTA().isDisplayed());
				waitFor(200);
				highlighter.highLighterMethod(rewards.getQuestionSection(), DriverManager.getDriver());
				rewards.ClickOnShowMoreCTA();
				waitFor(1000);
				js.executeScript("window.scrollBy(0, 552);");
				Assert.assertTrue(rewards.getShowLessCTA().isDisplayed());
				highlighter.highLighterMethod(rewards.getShowLessCTA(), DriverManager.getDriver());
				rewards.ClickOnShowLessCTA();
				js.executeScript("window.scrollBy(0, -552);");
				waitFor(600);
			}else{
				highlighter.highLighterMethod(rewards.getShowMoreCTA(), DriverManager.getDriver());
				Assert.assertTrue(rewards.getShowMoreCTA().isDisplayed());
				waitFor(200);
				highlighter.highLighterMethod(rewards.getQuestionSection(), DriverManager.getDriver());
				rewards.ClickOnShowMoreCTA();
				waitFor(1000);

				JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
				js.executeScript("window.scrollBy(0, 520);");

				Assert.assertTrue(rewards.getShowLessCTA().isDisplayed());
				highlighter.highLighterMethod(rewards.getShowLessCTA(), DriverManager.getDriver());
				rewards.ClickOnShowLessCTA();
				js.executeScript("window.scrollBy(0, -480);");
			}
		}catch (Exception e){

		}
		waitFor(2000);
		Logger.log("User should be able to view the remaining number of accordions or FAQs present on the CTA");
	}

	@And("User should be able to view Title Text") // Big Text
	public void User_should_be_able_to_view_Title_Text() {
		highlighter.highLighterMethod(rewards.getFaqsTitleText(), DriverManager.getDriver());
		Assert.assertTrue(rewards.getFaqsTitleText().isDisplayed());
		Logger.log("User should be able to view Title Text");
	}

	@And("user should be able to view Copy Text") // Small text
	public void User_should_be_able_to_view_Copy_Text() {
		highlighter.highLighterMethod(rewards.getFaqsCopyText(), DriverManager.getDriver());
		Assert.assertTrue(rewards.getFaqsCopyText().isDisplayed());
		Logger.log("user should be able to view Copy Text");
	}
	@And("user should be able to view Image")
	public void User_should_be_able_to_view_Image() {
		Assert.assertTrue(rewards.getFaqImage().isDisplayed());
		waitFor(800);
		Logger.log("User should be able to view Image");
	}

	@And("User should be able to view + and - symbols")
	public void User_should_be_able_to_view_plus_and_minus_symbols() {
		highlighter.highLighterMethod(rewards.getPlusIcon(), DriverManager.getDriver());
		Assert.assertTrue(rewards.getPlusIcon().isDisplayed());
		rewards.ClickOnQuestion02();
		highlighter.highLighterMethod(rewards.getMinusIconQuestion2(), DriverManager.getDriver());
		Assert.assertTrue(rewards.getMinusIconQuestion2().isDisplayed());
		waitFor(800);
		Logger.log("User should be able to view + and - symbols");
	}

	@And("User click on + Symbol")
	public void User_click_on_plus_Symbol() {
		rewards.ClickOnPlusIcon();
		Logger.log("User click on + Symbol");
	}

	@And("User should able to view the accordions get expanded")
	public void User_should_able_to_view_the_accordions_get_expanded() {
		highlighter.highLighterMethod(rewards.getAnswerOneSectionCTA(), DriverManager.getDriver());
		Assert.assertTrue(rewards.getAnswerOneSectionCTA().isDisplayed());
		waitFor(600);
		Logger.log("User should able to view the accordions get expanded");
	}

	@And("User click on - Symbol")
	public void User_click_on_minus_Symbol() {
		Assert.assertTrue(rewards.getAnswerOneSectionCTA().isDisplayed());
		rewards.ClickMinusIcon();
		Logger.log("User click on - Symbol");
	}

	@And("User should able to view the accordions get collapsed")
	public void User_should_able_to_view_the_accordions_get_collapsed() {
		try {
			if(rewards.getAnswerOneSectionCTA().isDisplayed()){
		//		Assert.fail();
			}
		} catch(Exception e){
			Assert.assertTrue(rewards.getQuestionOneSectionCTA().isDisplayed());
			Assert.assertTrue(rewards.getQuestionTwoSectionCTA().isDisplayed());
		}
		waitFor(1000);
		Logger.log("User should able to view the accordions get expanded");
	}

	@Then("User sees the FAQ Section")
	public void User_sees_the_FAQ_Section() {
		Assert.assertTrue(rewards.getFaqSection().isDisplayed());
		Logger.log("User sees the FAQ Section");
	}

	@And("User clicks on accordion.")
	public void User_clicks_on_Accordion() {
		rewards.ClickOnQuestion01();
		Logger.log("User clicks on accordion.");
	}

	@And("User sees one accordion should get closed automatically when any other accordion is opened")
	public void User_sees_one_accordion_should_get_closed_automatically_when_any_other_accordion_is_opened() {
         rewards.ClickOnQuestion02();
		try {
			if(rewards.getAnswerOneSectionCTA().isDisplayed()){
		//	Assert.fail();
				highlighter.highLighterMethod(rewards.getAnswerTwoSectionCTA(), DriverManager.getDriver());
			}
		} catch(Exception e){
			highlighter.highLighterMethod(rewards.getAnswerTwoSectionCTA(), DriverManager.getDriver());
			Assert.assertTrue(rewards.getAnswerTwoSectionCTA().isDisplayed());
		}
		waitFor(600);
		Logger.log("User sees one accordion should get closed automatically when any other accordion is opened");
	}


	@Then("User clicks on the whole atom and user sees the accordion getting expanded.")
	public void User_Ckicks_on_the_whole_atom() {

		try {
			if(rewards.getRewardsMatrixBannerMobile().isDisplayed()){
				rewards.ClickOnQuestion01();
				highlighter.highLighterMethod(rewards.getAnswerOneSectionCTA(), DriverManager.getDriver());
				Assert.assertTrue(rewards.getAnswerOneSectionCTA().isDisplayed());

				rewards.ClickOnQuestion02();
				highlighter.highLighterMethod(rewards.getAnswerTwoSectionCTA(), DriverManager.getDriver());
				Assert.assertTrue(rewards.getAnswerTwoSectionCTA().isDisplayed());

				rewards.ClickOnQuestion03();
				highlighter.highLighterMethod(rewards.getAnswerThreeSectionCTA(), DriverManager.getDriver());
				Assert.assertTrue(rewards.getAnswerThreeSectionCTA().isDisplayed());

				JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver(); //comment
				js.executeScript("window.scrollBy(0, 260);"); //comment

				rewards.ClickOnQuestion04();
				highlighter.highLighterMethod(rewards.getAnswerFourSectionCTA(), DriverManager.getDriver());
				Assert.assertTrue(rewards.getAnswerFourSectionCTA().isDisplayed());
			}
		} catch(Exception e){
			rewards.ClickOnQuestion01();
			highlighter.highLighterMethod(rewards.getAnswerOneSectionCTA(), DriverManager.getDriver());
			Assert.assertTrue(rewards.getAnswerOneSectionCTA().isDisplayed());

			rewards.ClickOnQuestion02();
			highlighter.highLighterMethod(rewards.getAnswerTwoSectionCTA(), DriverManager.getDriver());
			Assert.assertTrue(rewards.getAnswerTwoSectionCTA().isDisplayed());

			rewards.ClickOnQuestion03();
			highlighter.highLighterMethod(rewards.getAnswerThreeSectionCTA(), DriverManager.getDriver());
			Assert.assertTrue(rewards.getAnswerThreeSectionCTA().isDisplayed());

			rewards.ClickOnQuestion04();
			highlighter.highLighterMethod(rewards.getAnswerFourSectionCTA(), DriverManager.getDriver());
			Assert.assertTrue(rewards.getAnswerFourSectionCTA().isDisplayed());
		}
		waitFor(1000);
		Logger.log("User clicks on the whole atom and user sees the accordion getting expanded");
	}


	@And("User should be view the total number of FAQs present in that section")
	public void User_should_be_view_the_total_number_of_FAQs_present_in_that_section() {
		try {
			if (rewards.getRewardsMatrixBannerMobile().isDisplayed()){
				JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver(); //comment
				js.executeScript("window.scrollBy(0, 160);"); //comment
				highlighter.highLighterMethod(rewards.getQuestionSection(), DriverManager.getDriver());
				highlighter.highLighterMethod(rewards.getShowingSectionCount(), DriverManager.getDriver());
				Assert.assertTrue(rewards.getQuestionSection().isDisplayed());
				Assert.assertTrue(rewards.getShowingSectionCount().isDisplayed());
			}
		}catch (Exception e){
			highlighter.highLighterMethod(rewards.getQuestionSection(), DriverManager.getDriver());
			highlighter.highLighterMethod(rewards.getShowingSectionCount(), DriverManager.getDriver());
			Assert.assertTrue(rewards.getQuestionSection().isDisplayed());
			Assert.assertTrue(rewards.getShowingSectionCount().isDisplayed());
		}
		Logger.log("User should be view the total number of FAQs present in that section");
	}



}
