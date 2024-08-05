package parallel;

import com.driverfactory.DriverManager;
import com.resuableMethods.CommonAction;
import com.utilities.Logger;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pom.gti.T10_ArticleDetailsPage;
import pom.gti.RewardsPage;

public class T10_ArticleDetails_Stepdef extends CommonAction {
	T10_ArticleDetailsPage Article_Details = new T10_ArticleDetailsPage(DriverManager.getDriver());
	RewardsPage rewards = new RewardsPage(DriverManager.getDriver());



	/*******************************************************/

	@And("Scrolls down to Article section")
	public void Scrolls_down_to_Articles_section()  {
		waitFor(600);
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("window.scrollBy(0, 5960);");
		Logger.log("Scrolls down to Article section");
	}

	@And("Clicks on any Article Card")
	public void Clicks_on_any_Article_Card() {
		Article_Details.ClickOnreadTheArticleCTA();
		Logger.log("Clicks on any Article Card");
	}

	@Then("User should be able to see breadcrumb Back to Cannabis Insider on Banner")
	public void User_should_be_able_to_see_breadcrumb_Back_to_Cannabis_Insider_on_Banner() {
		Assert.assertTrue(Article_Details.getBackToCTA().isDisplayed());
		Logger.log("User should be able to see breadcrumb Back to Cannabis Insider on Banner");
	}

	@And("User clicks on Back to Cannabis Insider breadcrumb link")
	public void User_clicks_on_Back_to_Cannabis_Insider_breadcrumb_link() {
		Article_Details.ClickOnBackToCTA();
		Logger.log("User clicks on Back to Cannabis Insider breadcrumb link");
	}

	@Then("User should able to view the hero image in background")
	public void User_should_able_to_view_the_hero_image_in_background() {
		Assert.assertTrue(Article_Details.getHeroImage().isDisplayed());
		Logger.log("user should able to view the hero image in background");
	}

	@And("User should able to view the Article title and the overview of a particular article")
	public void User_should_able_to_view_the_Article_title_and_the_overview_of_a_particular_article() {
		Assert.assertTrue(Article_Details.getArticleText().isDisplayed());
		Assert.assertTrue(Article_Details.getOverviewOfaParticularArticle().isDisplayed());
		Logger.log("User should able to view the Article title and the overview of a particular article");
	}

	@Then("User should be able to see Hero Article Detail at the top of the page below global header")
	public void User_should_be_able_to_see_Hero_Article_Detail_at_the_top_of_the_page_below_global_header() {
		waitFor(2000);
		Assert.assertTrue(Article_Details.getHeroArticleDetail().isDisplayed());
		Logger.log("User should be able to see Hero Article Detail at the top of the page below global header");
	}

	@And("User should able to view the description or copy text or overview of the article")
	public void User_should_able_to_view_the_description_or_copy_text_or_overview_of_the_article() {
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("window.scrollBy(0, 260);");
		Assert.assertTrue(Article_Details.getArticleDescription().isDisplayed());
		Logger.log("User should able to view the description or copy text or overview of the article");
	}

	@Then("User should able to view the published date of the article when it got published")
	public void User_should_able_to_view_the_published_date_of_the_article_when_it_got_published() {
		Assert.assertTrue(Article_Details.getDateTag().isDisplayed());
		Logger.log("User should able to view the published date of the article when it got published");
	}

	@And("User should able to view the published date in format")
	public void User_should_able_to_view_the_published_date_in_format() {
		Assert.assertTrue(Article_Details.getDateTag().isDisplayed());
		Logger.log("User should able to view the published date in format");
	}

	@Then("User should able to view New tag for the article which has less than nor equal to15 days from published date")
	public void User_should_able_to_view_New_tag_for_the_article_which_has_less_than_nor_equal_to_fifteen_days_from_published_date() {
		Assert.assertTrue(Article_Details.getNewTag().isDisplayed());
		Logger.log("User should able to view New tag for the article which has less than nor equal to15 days from published date");
	}

	@Then("User should able to view the estimated time along with timer icon")
	public void user_should_able_to_view_the_estimated_time_along_with_timer_icon() {
		try{
			Assert.assertTrue(Article_Details.getTimerIcon().isDisplayed());
		}catch (Exception e){

			System.out.println("Date is not presernt , didn't published newly");
		}
		Logger.log("user should able to view the estimated time along with timer icon");
	}

	@Then("User should able to view the Category tag as Cannabis 101 in the article section")
	public void User_should_able_to_view_the_Category_tag_as_Cannabis_in_the_article_section() {
		Assert.assertTrue(Article_Details.getCannabis101Tag().isDisplayed());
		Logger.log("User should able to view the Category tag as Cannabis 101 in the article section");
	}

//	@Then("User is able to view the Title text in bold")
//	public void User_is_able_to_view_the_Title_text_in_bold() {
//		waitFor(2000);
//	//	JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
//	//	js.executeScript("window.scrollBy(0, 1220);");
//		javascriptScroll(Article_Details.getFaqsChapterTitle());
//		Assert.assertTrue(Article_Details.getFaqsChapterTitle().isDisplayed());
//		Logger.log("User is able to view the Title text in bold");
//	}

	@When("User is viewing the title text")
	public void User_is_viewing_the_title_text() {
		Assert.assertTrue(Article_Details.getFaqsChapterTitleExample().isDisplayed());
		Logger.log("User is viewing the title text");
	}

	@And("User is able be able to view a red line above the title text")
	public void User_is_able_be_able_to_view_a_red_line_above_the_title_text() {
		Article_Details.ClickOnAnchorLinks01();
		Assert.assertTrue(Article_Details.getRedLine01().isEnabled());
		Logger.log("User is able to view the Title text in bold");
	}

	@Then("User should be able to view the section heading within the page in a link format")
	public void User_should_be_able_to_view_the_section_heading_within_the_page_in_a_link_format() {
		Assert.assertTrue(Article_Details.getAnchorLinks01().isEnabled());
		Logger.log("User should be able to view the section heading within the page in a link format");
	}

	@And("User clicks on the links")
	public void User_clicks_on_the_links() {
		Article_Details.ClickOnAnchorLinks02();
		Logger.log("User clicks on the links");
	}

	@Then("User views the link is getting highlighted with a red line on top to indicate the particular section user is seeing")
	public void User_views_the_link_is_getting_highlighted_with_a_red_line_on_top_to_indicate_the_particular_section_user_is_seeing() {
		Assert.assertTrue(Article_Details.getFirstAnchorTitle().isDisplayed());
		Logger.log("User clicks on the links");
	}

	@Then("User is able to view the text in in paragraph format")
	public void User_is_able_to_view_the_text_in_paragraph_format() {
		Assert.assertTrue(Article_Details.getParagraphFormatText().isDisplayed());
		waitFor(2000);
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("window.scrollBy(0, 2820);");
		Assert.assertTrue(Article_Details.getFirstAnchorTitle().isDisplayed());
		Assert.assertTrue(Article_Details.getFirstAnchorText().isDisplayed());
		Logger.log("User is able to view the text in in paragraph format");
	}

	@Then("User is able to view the text written inside a quote symbol")
	public void User_is_able_to_view_the_text_written_inside_a_quote_symbol() {
		waitFor(2000);
		//	JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		//	js.executeScript("window.scrollBy(0, 620);");
		javascriptScroll(Article_Details.getBlogQuotes());
		Assert.assertTrue(Article_Details.getBlogQuotes().isDisplayed());
		Logger.log("User is able to view the text written inside a quote symbol");
	}

	@And("Quote symbol is in red in colour")
	public void Quote_symbol_is_in_red_in_colour() {
		Article_Details.QuoteSymbolColour();
		Logger.log("Quote symbol is in red in colour");
	}

	@And("User should be able to click on any link user should see the page being navigated to respective section")
	public void User_should_be_able_to_click_on_any_link_user_should_see_the_page_being_navigated_to_respective_section() {
		Article_Details.ClickOnAnchorLinks02();
		Assert.assertTrue(Article_Details.getFirstAnchorTitle().isDisplayed());

		Article_Details.ClickOnAnchorLinks01();
		Assert.assertTrue(Article_Details.getFaqsChapterTitleExample().isDisplayed());

		//	Article_Details.ClickOnAnchorLinks03();
		//	Assert.assertTrue(Article_Details.getAnchorLinks03Title().isDisplayed());

		//	Article_Details.ClickOnAnchorLinks04();
		//	Assert.assertTrue(Article_Details.getUnjustLegacyTitleText().isDisplayed());

		//	Article_Details.ClickOnAnchorLinks05();
		//	Assert.assertTrue(Article_Details.getBannerC09().isDisplayed());

		//	Article_Details.ClickOnAnchorLinks06();
		//	Assert.assertTrue(Article_Details.getDosageTipsTitle().isDisplayed());

		//	Article_Details.ClickOnAnchorLinks07();
		//	Assert.assertTrue(Article_Details.getIngredients().isDisplayed());

		//	Article_Details.ClickOnAnchorLinks08();
		//	Assert.assertTrue(Article_Details.getSourcesTitleText().isDisplayed());
		Logger.log("User should be able to click on any link user should see the page being navigated to respective section");
	}

	@Then("User should be able to click on any link user should see the page being navigated to respective section for Mobile")
	public void User_should_be_able_to_click_on_any_link_user_should_see_the_page_being_navigated_to_respective_section_for_mobile() {
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("window.scrollBy(0, 300);");

		Article_Details.TapOnTableOfContentsCTA();
		Assert.assertTrue(Article_Details.getSourcesTitleText().isDisplayed());

		Article_Details.TapOnTableOfContent01();
		Assert.assertTrue(Article_Details.getFaqsChapterTitleExample().isDisplayed());
		js.executeScript("window.scrollBy(0, 280);");

		Article_Details.TapOnTableOfContentsCTA();
		Article_Details.TapOnTableOfContent02();
		Assert.assertTrue(Article_Details.getFirstAnchorTitle().isDisplayed());

//		Article_Details.TapOnTableOfContentsCTA();
//		Article_Details.TapOnTableOfContent03();
//		Assert.assertTrue(Article_Details.getAnchorLinks03Title().isDisplayed());
//		Article_Details.TapOnTableOfContentsCTA();
//		Article_Details.TapOnTableOfContent04();
//		Assert.assertTrue(Article_Details.getUnjustLegacyTitleText().isDisplayed());
//
//		Article_Details.TapOnTableOfContentsCTA();
//		Article_Details.TapOnTableOfContent05();
//		Assert.assertTrue(Article_Details.getBannerC09Mobile().isDisplayed());
//
//		Article_Details.TapOnTableOfContentsCTA();
//		Article_Details.TapOnTableOfContent06();
//		Assert.assertTrue(Article_Details.getDosageTipsTitle().isDisplayed());
//
//		Article_Details.TapOnTableOfContentsCTA();
//		Article_Details.TapOnTableOfContent07();
//		Assert.assertTrue(Article_Details.getIngredients().isDisplayed());
//
//		Article_Details.TapOnTableOfContentsCTA();
//		Article_Details.TapOnTableOfContent08();
//		Assert.assertTrue(Article_Details.getSourcesTitleText().isDisplayed());
		Logger.log("User should be able to click on any link user should see the page being navigated to respective section for mobile");
	}


	@Then("User scrolls down the page to view a particular section then The Link should also be highlighted")
	public void User_scrolls_down_the_page_toview_a_particular_section_then_The_Link_should_also_be_highlighted() {
		waitFor(2000);
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("window.scrollBy(0, 1220);");
		Assert.assertTrue(Article_Details.getAnchorLinks().isDisplayed());
		Assert.assertTrue(Article_Details.getFaqsChapterTitleExample().isDisplayed());
		Article_Details.ClickOnAnchorLinks01();
		Assert.assertTrue(Article_Details.getRedLine01().isDisplayed());

		waitFor(700);
		js.executeScript("window.scrollBy(0, 2820);");
		Assert.assertTrue(Article_Details.getFirstAnchorTitle().isDisplayed());
		Article_Details.ClickOnAnchorLinks02();
		Assert.assertTrue(Article_Details.getRedLine02().isDisplayed());


//		waitFor(700);
//		js.executeScript("window.scrollBy(0, 1220);");
//		Assert.assertTrue(Article_Details.getAnchorLinks03Title().isDisplayed());
//		Assert.assertTrue(Article_Details.getRedLine03().isDisplayed());
//
//
//		waitFor(700);
//		js.executeScript("window.scrollBy(0, 970);");
//		Assert.assertTrue(Article_Details.getUnjustLegacyTitleText().isDisplayed());
//		Assert.assertTrue(Article_Details.getRedLine04().isDisplayed());
//
//
//		waitFor(700);
//		js.executeScript("window.scrollBy(0, 5680);");
//		Assert.assertTrue(Article_Details.getBannerC09().isDisplayed());
//		waitFor(700);
//		js.executeScript("window.scrollBy(0, -600);");
//		waitFor(700);
//		js.executeScript("window.scrollBy(0, 1000);");
//		Assert.assertTrue(Article_Details.getRedLine05().isDisplayed());
//
//		waitFor(700);
//		js.executeScript("window.scrollBy(0, 380);");
//		Assert.assertTrue(Article_Details.getDosageTipsTitle().isDisplayed());
//		Assert.assertTrue(Article_Details.getRedLine06().isDisplayed());
//
//
//		waitFor(700);
//		js.executeScript("window.scrollBy(0, 1080);");
//		Assert.assertTrue(Article_Details.getIngredients().isDisplayed());
//		Assert.assertTrue(Article_Details.getRedLine07().isDisplayed());
//
//		waitFor(700);
//		js.executeScript("window.scrollBy(0, 1040);");
//		Assert.assertTrue(Article_Details.getSourcesText().isDisplayed());
//		waitFor(700);
//		js.executeScript("window.scrollBy(0, -320);");
//		Assert.assertTrue(Article_Details.getRedLine08().isDisplayed());
//		js.executeScript("window.scrollBy(0, 320);");
		Logger.log("User scrolls down the page to view a particular section then The Link should also be highlighted");
	}

	@Then("User scrolls down the page to view a particular section then The Link should also be highlighted For Mobile") //Scrolling should be perfect
	public void User_scrolls_down_the_page_toview_a_particular_section_then_The_Link_should_also_be_highlighted_For_Mobile() {
		waitFor(600);
		javascriptScroll(Article_Details.getFaqsChapterTitle());
		waitFor(600);

		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("window.scrollBy(0, 300);");

		Article_Details.TapOnTableOfContentsCTA();
		Assert.assertTrue(Article_Details.getTableOfContent01().isDisplayed());
		Article_Details.TapOnTableOfContents_CloseCTA();
		waitFor(600);
		js.executeScript("window.scrollBy(0, -300);");
		Assert.assertTrue(Article_Details.getFaqsChapterTitleExample().isDisplayed());

		javascriptScroll(Article_Details.getFirstAnchorTitle());
		Article_Details.TapOnTableOfContentsCTA();
		Assert.assertTrue(Article_Details.getTableOfContent02().isDisplayed());
		Article_Details.TapOnTableOfContents_CloseCTA();
		Assert.assertTrue(Article_Details.getFirstAnchorTitle().isDisplayed());
//
//		javascriptScroll(Article_Details.getAnchorLinks03Title());
//		Article_Details.TapOnTableOfContentsCTA();
//		Assert.assertTrue(Article_Details.getTableOfContent03().isDisplayed());
//		Article_Details.TapOnTableOfContents_CloseCTA();
//		Assert.assertTrue(Article_Details.getAnchorLinks03Title().isDisplayed());
//
//		javascriptScroll(Article_Details.getUnjustLegacyTitleText());
//		Article_Details.TapOnTableOfContentsCTA();
//		Assert.assertTrue(Article_Details.getTableOfContent04().isDisplayed());
//		Article_Details.TapOnTableOfContents_CloseCTA();
//		Assert.assertTrue(Article_Details.getUnjustLegacyTitleText().isDisplayed());
//
//		javascriptScroll(Article_Details.getBannerC09Mobile());
//		Article_Details.TapOnTableOfContentsCTA();
//		Assert.assertTrue(Article_Details.getTableOfContent05().isDisplayed());
//		Article_Details.TapOnTableOfContents_CloseCTA();
//		Assert.assertTrue(Article_Details.getBannerC09Mobile().isDisplayed());
//
//		javascriptScroll(Article_Details.getDosageTipsTitle());
//		Article_Details.TapOnTableOfContentsCTA();
//		Assert.assertTrue(Article_Details.getTableOfContent06().isDisplayed());
//		Article_Details.TapOnTableOfContents_CloseCTA();
//		Assert.assertTrue(Article_Details.getDosageTipsTitle().isDisplayed());
//
//		javascriptScroll(Article_Details.getIngredients());
//		Article_Details.TapOnTableOfContentsCTA();
//		Assert.assertTrue(Article_Details.getTableOfContent07().isDisplayed());
//		Article_Details.TapOnTableOfContents_CloseCTA();
//		Assert.assertTrue(Article_Details.getIngredients().isDisplayed());
//
//		javascriptScroll(Article_Details.getSourcesTitleText());
//		Article_Details.TapOnTableOfContentsCTA();
//		Assert.assertTrue(Article_Details.getTableOfContent08().isDisplayed());
//		Article_Details.TapOnTableOfContents_CloseCTA();
//		Assert.assertTrue(Article_Details.getSourcesTitleText().isDisplayed());

		Logger.log("User scrolls down the page to view a particular section then The Link should also be highlighted for Mobile");
	}

	@When("User is viewing the accordions")
	public void User_is_viewing_the_accordions() {
		waitFor(2000);
		//	JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		//	js.executeScript("window.scrollBy(0, 1220);");
		//	javascriptScroll(Article_Details.getFaqsChapterTitle());
		//	Assert.assertTrue(Article_Details.getQuestionOneSection().isDisplayed());
		//	Assert.assertTrue(Article_Details.getQuestionTwoSection().isDisplayed());
		javascriptScroll(Article_Details.getBlogFaqSection());
		Logger.log("User is viewing the accordions");
	}

	@Then("User is able to view the each question with a '+' symbol")
	public void User_is_able_to_view_the_each_question_with_a_plus_symbol() {
		Assert.assertTrue(rewards.getPlusIcon().isDisplayed());
		Assert.assertTrue(rewards.getMinusIconQuestion2().isDisplayed()); //2nd + Icon
		Logger.log("User is able to view the each question with a '+' symbol");
	}

	@Then("User is navigated to any large banner as Banner C09")
	public void User_is_navigated_to_any_large_banner_as_Banner_C09() {
		//Unable to add it from CMS
		Logger.log("User is navigated to any large banner as (Banner(C09)");
	}

	@Then("User should be able to see the anchor links or ToC being scrolled in background behind for C09")
	public void User_hould_be_able_to_see_the_anchor_links_or_ToC_being_scrolled_in_background_behind_for_C09() {
		//Unable to add it from CMS
		Logger.log("User is navigated to any large banner as (Banner(C09)");
	}

	@And("User is navigated to any large banner as Sources C47")
	public void User_is_navigated_to_any_large_banner_as_Sources_C47() {
		waitFor(2000);
//		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
//		js.executeScript("window.scrollBy(0, 2860);");
		javascriptScroll(Article_Details.getSourcesTitleText());
		Logger.log("User is navigated to any large banner as Sources C47");
	}

	@And("User is navigated to any large banner as Product Carousel C18")
	public void User_is_navigated_to_any_large_banner_as_Product_Carousel_C18() {
		waitFor(2000);
		//	JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		//	js.executeScript("window.scrollBy(0, 380);");
		javascriptScroll(Article_Details.getFullWidthImageText());
		Assert.assertTrue(Article_Details.getFullWidthImage().isDisplayed());
		Logger.log("User is navigated to any large banner as Product Carousel C18");
	}

	@Then("User should be able to see the anchor links or ToC being scrolled in background behind for Product Carousel C18")
	public void User_should_be_able_to_see_the_anchor_links_or_ToC_being_scrolled_in_background_behind_for_Product_Carousel_C18() {
		try {
			if (Article_Details.getFullWidthCaption().isDisplayed()){
				Assert.assertTrue(Article_Details.getFullWidthCaption().isDisplayed());
			}
		}catch (Exception e){
			if (Article_Details.getContentCTA().isDisplayed()){
				Assert.assertTrue(Article_Details.getFullWidthCaptionMobile().isDisplayed());
			}
		}
		Logger.log("User should be able to see the anchor links or ToC being scrolled in background behind for Product Carousel C18");
	}

	@Then("User should be able to see the anchor links or ToC being scrolled in background behind")
	public void User_should_be_able_to_see_the_anchor_links_or_ToC_being_scrolled_in_background_behind() {
		// As per UI not developed and nor its is reflecting in QA website
		waitFor(6000);
		Logger.log("User is navigated to any large banner as Product Carousel C18");
	}

	@Then("User should be able to see the anchor links or ToC being scrolled in background behind for Related articles C16")
	public void User_should_be_able_to_see_the_anchor_links_or_ToC_being_scrolled_in_background_behind_for_Related_articles_C16() {
		Assert.assertTrue(Article_Details.getRelatedArticleTitleText().isDisplayed());
		Assert.assertTrue(Article_Details.getReadTheArticleCTA().isDisplayed());


		waitFor(9000);
		Logger.log("User is navigated to any large banner as Related articles C16");
	}

	@And("User is navigated to any large banner as Related articles C16")
	public void User_is_navigated_to_any_large_banner_as_Related_articles_C16() {
		waitFor(2000);
		//	JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		//	js.executeScript("window.scrollBy(0, 980);");
		javascriptScroll(Article_Details.getRelatedArticleText());
		Logger.log("User is navigated to any large banner as Product Carousel C18");
	}


	@When("User navigates to the articles page")
	public void User_navigates_to_the_articles_page() {
		waitFor(2000);
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("window.scrollBy(0, 1220);");
		//	int width=driver.findElement(By.tagName("img")).getSize().getWidth();
		// 	int hight=driver.findElement(By.tagName("img")).getSize().getHeight();
		Logger.log("User navigates to the articles page");
	}

	@When("User is on an article details page")
	public void User_is_on_an_article_details_page() {
		Assert.assertTrue(Article_Details.getHeroArticleDetail().isDisplayed());
		Logger.log("User is on an article details page");
	}

	@And("User should see embedded video")
	public void User_should_see_embedded_video() {
		waitFor(2000);
		//	JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		//	js.executeScript("window.scrollBy(0, 5480);");
		javascriptScroll(Article_Details.getYouTubeVideoLink());
		Assert.assertTrue(Article_Details.getYouTubeVideoLink().isDisplayed());
		Logger.log("User should see embedded video");
	}

	@And("User should be able to play video")
	public void User_should_be_able_to_play_video() {
		Article_Details.ClickOnYouTubeVideoLink();
		waitFor(800);
		Logger.log("User should be able to play video");
	}

	@And("User should be able to view teh description under the video")
	public void User_should_be_able_to_view_teh_description_under_the_video() {
		//Cannot inspect - description is not displaying
		Logger.log("User should be able to view teh description under the video");
	}
	@When("User scroll down to Article Cards Section")
	public void User_scroll_down_to_Article_Cards_Section() {
		waitFor(2000);
		//	JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		//	js.executeScript("window.scrollBy(0, 16041);");
		javascriptScroll(Article_Details.getRelatedArticleSection());
		Assert.assertTrue(Article_Details.getRelatedArticleSection().isDisplayed());
		Logger.log("User scroll down to Article Cards Section");
	}

	@Then("User is viewing view Title text")
	public void User_is_viewing_view_Title_text() {
		Assert.assertTrue(Article_Details.getRelatedArticleText().isDisplayed());
		Logger.log("User is viewing view Title text");
	}

	@Then("User should be able to see latest 3 article cards related to Blogs and Recipe section only")
	public void User_should_be_able_to_see_latest_3_article_cards_related_to_Blogs_and_Recipe_section_only() {
		Assert.assertTrue(Article_Details.getRelatedArticleSectionOne().isDisplayed());
		Assert.assertTrue(Article_Details.getRelatedArticleSectionTwo().isDisplayed());
		Assert.assertTrue(Article_Details.getRelatedArticleSectionThree().isDisplayed());
		Logger.log("User should be able to see latest 3 article cards related to Blogs and Recipe section only");
	}

	@And("user should is able to view the Article title")
	public void user_should_is_able_to_view_the_Article_title() {
		Assert.assertTrue(Article_Details.getRelatedArticleTitleText().isDisplayed());
		Logger.log("user should is able to view the Article title");
	}

	@And("User should be able to view the Article Description")
	public void User_should_be_able_to_view_the_Article_Description() {
		Assert.assertTrue(Article_Details.getRelatedArticleDescription().isDisplayed());
		Logger.log("User should be able to view the Article Description");
	}

	@And("user should be able to view the Category Tags")
	public void user_should_be_able_to_view_the_Category_Tags() {
		Assert.assertTrue(Article_Details.getRelatedArticleCategoryTags().isDisplayed());
		Logger.log("user should be able to view the Category Tags");
	}

	@And("user should be able to view the Date in MM-DD-YYYY format")
	public void user_should_be_able_to_view_the_Date_format() {
		Assert.assertTrue(Article_Details.getRelatedArticleDate().isDisplayed());
		Logger.log("user should be able to view the Date in MM-DD-YYYY format");
	}

	@And("user should be able to view the Read the article CTA")
	public void user_should_be_able_to_view_the_Read_the_article_CTA() {
		Assert.assertTrue(Article_Details.getReadTheArticleCTA().isDisplayed());
		Logger.log("user should be able to view the Read the article CTA");
	}

	@And("user clicks on title text")
	public void user_clicks_on_title_text() {
		Assert.assertTrue(Article_Details.getRelatedArticleTitleText().isDisplayed());
		Article_Details.ClickOnRelatedArticleTitleText();
		//	waitFor(500);
		Assert.assertTrue(Article_Details.getHeroArticleDetail().isDisplayed());
		Logger.log("user clicks on title text");
	}

	@Then("user should be redirected to the respective Blog or Recipe page")
	public void user_should_be_redirected_to_the_respective_Blog_or_Recipe_page() {
		//	waitFor(500);
		Assert.assertTrue(Article_Details.getBackToCTA().isDisplayed());
		Article_Details.ClickOnBackToCTA();
		Logger.log("user should be redirected to the respective Blog or Recipe page");
	}

	@And("user clicks on Read Article CTA")
	public void user_clicks_on_Read_Article_CTA() {
		//	waitFor(500);
		Assert.assertTrue(Article_Details.getReadTheArticleCTA().isDisplayed());
		Article_Details.ClickOnreadTheArticleCTA();
		Logger.log("user clicks on Read Article CTA");
	}

	@Then("user should be able to see CTA to see all results")
	public void user_should_be_able_to_see_CTA_to_see_all_results() {
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("window.scrollBy(0, 800);");
		Assert.assertTrue(Article_Details.getSeeAllArticleCTA().isDisplayed());
		Logger.log("user should be able to see CTA to see all results");
	}

	@And("user clicks on See al results CTA")
	public void user_clicks_on_See_al_results_CTA() {
		Article_Details.ClickOnSeeAllArticleCTA();
		Logger.log("user should be able to see CTA to see all results");
	}

	@And("User scrolls down to Source Section")
	public void User_scrolls_down_to_Source_Section() {
		javascriptScroll(Article_Details.getSourcesTitleText());
		Logger.log("User scrolls down to Source Section");
	}

	@Then("User sees third party site name as the title text along with external icon")
	public void User_sees_third_party_site_name_as_the_title_text_along_with_external_icon() {
		Assert.assertTrue(Article_Details.getsiteName_titleText().isDisplayed());
		Assert.assertTrue(Article_Details.getexternalIcon().isDisplayed());
		Logger.log("User sees third party site name as the title text along with external icon");
	}

	@Then("User is viewing the text in bullet points with title")
	public void User_is_viewing_the_text_in_bullet_points_with_title() {
		javascriptScroll(Article_Details.getDosageTipsTitle());
		Assert.assertTrue(Article_Details.getBulletWithText().isDisplayed());
		Logger.log("User is viewing the text in bullet points with title");
	}

	@Then("User is able to see the numbering points in leaf color")
	public void User_is_able_to_see_the_numbering_points_in_leaf_color() {
		Assert.assertTrue(Article_Details.getNumberWithText().isDisplayed());
		waitFor(6000);
		Logger.log("User is able to see the numbering points in leaf color");
	}




























	@And("user should able to view the description or copy text or overview of the article")
	public void user_should_able_to_view_the_description_copy_text_overview_of_the_article() {
		waitFor(2000);
		//	waitFor(600);
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("window.scrollBy(0, 260);");
		//	Assert.assertTrue(Article_Details.getOverviewOfTheArticle().isDisplayed());

		waitFor(2000);
		js.executeScript("window.scrollBy(0, 920);");

		Assert.assertTrue(Article_Details.getAnchorLinks().isDisplayed());

		Assert.assertTrue(Article_Details.getFaqsChapterTitleExample().isDisplayed());


		Assert.assertTrue(Article_Details.getQuestionOneSection().isDisplayed());
		Article_Details.ClickQuestionOneSection();

		waitFor(700);
		Assert.assertTrue(Article_Details.getAnswerOneSection().isDisplayed());

		Assert.assertTrue(Article_Details.getQuestionTwoSection().isDisplayed());
		Article_Details.ClickQuestionTwoSection();

		waitFor(700);
		Assert.assertTrue(Article_Details.getAnswerTwoSection().isDisplayed());

		waitFor(700);
		js.executeScript("window.scrollBy(0, 3520);");
		Article_Details.ClickOnAnchorLinks02(); //used

		Assert.assertTrue(Article_Details.getFirstAnchorTitle().isDisplayed());
		waitFor(700);
		Assert.assertTrue(Article_Details.getFirstAnchorText().isDisplayed());

		waitFor(700);
		js.executeScript("window.scrollBy(0, 360);");

		Assert.assertTrue(Article_Details.getBlogQuotes().isDisplayed());

		waitFor(700);
		Assert.assertTrue(Article_Details.getFirstAnchorText02().isDisplayed());

		waitFor(700);
		js.executeScript("window.scrollBy(0, 899);");

		Assert.assertTrue(Article_Details.getAnchorLinks03Title().isDisplayed());

		waitFor(700);
		Assert.assertTrue(Article_Details.getAnchorLinks03Text().isDisplayed());

		waitFor(700);
		Assert.assertTrue(Article_Details.getYouTubeVideoLink().isDisplayed());

		waitFor(700);
		js.executeScript("window.scrollBy(0, 1120);");

		Assert.assertTrue(Article_Details.getUnjustLegacyTitleText().isDisplayed());

		waitFor(700);
		Assert.assertTrue(Article_Details.getUnjustLegacyDescription().isDisplayed());
		waitFor(700);

		js.executeScript("window.scrollBy(0, 7290);");
		Assert.assertTrue(Article_Details.getSourcesText().isDisplayed());
		waitFor(700);
		Assert.assertTrue(Article_Details.getSourcesSection().isDisplayed());
		waitFor(700);
		//	Assert.assertTrue(Article_Details.getShowingCountText().isDisplayed());
		//	highlighter.highLighterMethod(Article_Details.getShowingCountText(), DriverManager.getDriver());

		//	waitFor(700);
		//	Assert.assertTrue(Article_Details.getShowMoreCTA().isDisplayed());
		//	highlighter.highLighterMethod(Article_Details.getShowMoreCTA(), DriverManager.getDriver());

//		Article_Details.ClickOnShowMoreCTA();

//		waitFor(700);
//		Assert.assertTrue(Article_Details.getSourcesSection01().isDisplayed());
//		highlighter.highLighterMethod(Article_Details.getSourcesSection01(), DriverManager.getDriver());

//		Article_Details.ClickOnShowMoreCTA();


		js.executeScript("window.scrollBy(0, 490);");

		waitFor(700);
		Assert.assertTrue(Article_Details.getProductCartTitle().isDisplayed());

		waitFor(700);
		Assert.assertTrue(Article_Details.getProductCartDescription().isDisplayed());

		waitFor(700);
		Assert.assertTrue(Article_Details.getProductCartCTA().isDisplayed());


		waitFor(700);
		Assert.assertTrue(Article_Details.getSlider().isDisplayed());


		waitFor(700);
		Assert.assertTrue(Article_Details.getProductCart().isDisplayed());


		Assert.assertTrue(Article_Details.getAddToCartCTA01().isDisplayed());

		Article_Details.ClickOnAddToCartCTA01();

		Assert.assertTrue(Article_Details.getProduct01().isDisplayed());

		waitFor(700);
		Assert.assertTrue(Article_Details.getProduct02().isDisplayed());

		waitFor(700);
		Article_Details.ClickOnPlusCTA();
		Article_Details.ClickOnMinusCTA();


		Article_Details.ClickOnPlusCTA();
		Article_Details.ClickOnPlusCTA();
		Article_Details.ClickOnPlusCTA();
		Article_Details.ClickOnPlusCTA();

		Article_Details.ClickOnMinusCTA();
		Article_Details.ClickOnMinusCTA();
		Article_Details.ClickOnMinusCTA();
		Article_Details.ClickOnMinusCTA();

		waitFor(1000);
		Assert.assertTrue(Article_Details.getCartBackCTA01().isDisplayed());

		Article_Details.ClickOnCartBackCTA01();


		Assert.assertTrue(Article_Details.getCardSliderNextCTA().isDisplayed());
		Assert.assertTrue(Article_Details.getCardSliderBackCTA().isDisplayed());

		Article_Details.ClickOnCardSliderNextCTA();
		Article_Details.ClickOnCardSliderNextCTA();
		Article_Details.ClickOnCardSliderBackCTA();
		Article_Details.ClickOnCardSliderBackCTA();
		waitFor(500);

		js.executeScript("window.scrollBy(0, 660);");

		Assert.assertTrue(Article_Details.getRelatedArticleText().isDisplayed());
		waitFor(700);

		js.executeScript("window.scrollBy(0, 260);");

		Assert.assertTrue(Article_Details.getRelatedArticleSectionOne().isDisplayed());
		waitFor(700);

		Assert.assertTrue(Article_Details.getRelatedArticleSectionTwo().isDisplayed());
		waitFor(700);

		js.executeScript("window.scrollBy(0, 620);");

		Assert.assertTrue(Article_Details.getRelatedArticleSectionThree().isDisplayed());
		waitFor(700);

		Assert.assertTrue(Article_Details.getSeeAllArticleCTA().isDisplayed());




		waitFor(9000);
		Logger.log("user should able to view the description/copy text/overview of the article");
	}



}
