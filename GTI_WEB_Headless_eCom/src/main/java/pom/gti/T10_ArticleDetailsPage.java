package pom.gti;

import com.resuableMethods.CommonAction;
import com.utilities.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class T10_ArticleDetailsPage extends CommonAction {

	public T10_ArticleDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	/***********************************************************************************************************/

	/*
	 * Banner Section
	 */
	@FindBy(xpath="(//div[@class='w-full  block md:block lg:block']/div/div/div/a)[1]")
	private WebElement BackToCTA;
	@FindBy(xpath="(//div[@class='undefined w-full grow mt-[144px] md:mt-[152px] ']/div/div/div/div/div/div)[1]")
	private WebElement HeroArticleDetail;
	@FindBy(xpath="(//div[@class='w-full  block md:block lg:block']/div/div)[1]")
	private WebElement HeroImage;
	@FindBy(xpath="//div[@class='flex flex-col gap-4 lg:gap-6']/h2")
	private WebElement  ArticleText;
	@FindBy(xpath="//div[@class='flex flex-col gap-4 lg:gap-6']/p")
	private WebElement OverviewOfaParticularArticle;
	@FindBy(xpath="//div[@class='lg:ml-[9.774%] lg:flex lg:w-[736px] lg:flex-col lg:items-start lg:gap-[60px] lg:pl-0']/p")
	private WebElement ArticleDescription;
	@FindBy(xpath="(//div[@class='flex flex-row gap-[8px] items-center lg:w-full']/label)[1]")
	private WebElement NewTag;
	@FindBy(xpath="(//div[@class='flex flex-row gap-[8px] items-center lg:w-full']/label)[1]")
	private WebElement Cannabis101Tag;
	@FindBy(xpath="(//div[@class='flex flex-row gap-[8px] items-center lg:w-full']/label)[2]")
	private WebElement DateTag;
	@FindBy(xpath="//div[@class='flex flex-row items-center gap-1 !text-grey-400']")
	private WebElement TimerIcon;



	/*
	 * Anchor Links Section - ToC - Mobile
	 */
	@FindBy(xpath="//div[@class='fixed bottom-5 right-5 z-[999] block md:hidden']/button")
	private WebElement TableOfContentsCTA;
	@FindBy(xpath="//div[@class='mb-6 flex justify-end']/button")
	private WebElement TableOfContents_CloseCTA;
	@FindBy(xpath="(//div[@class='lg:sticky lg:top-[160px] 2xl:flex 2xl:flex-col 2xl:gap-14']/h5)[2]")
	private WebElement TableOfContentsText;

	@FindBy(xpath="(//div[@class='mb-8'])[9]/a")
	private WebElement TableOfContent01;
	@FindBy(xpath="(//div[@class='mb-8'])[10]/a")
	private WebElement TableOfContent02;
	@FindBy(xpath="(//div[@class='mb-8'])[11]/a")
	private WebElement TableOfContent03;
	@FindBy(xpath="(//div[@class='mb-8'])[12]/a")
	private WebElement TableOfContent04;
	@FindBy(xpath="(//div[@class='mb-8'])[13]/a")
	private WebElement TableOfContent05;
	@FindBy(xpath="(//div[@class='mb-8'])[14]/a")
	private WebElement TableOfContent06;
	@FindBy(xpath="(//div[@class='mb-8'])[15]/a")
	private WebElement TableOfContent07;
	@FindBy(xpath="(//div[@class='mb-8'])[16]/a")
	private WebElement TableOfContent08;



	/*
	 * Red Line - ToC -  Mobile
	 */
	@FindBy(xpath="(//div[@class='mb-8']/hr)[9]")
	private WebElement RedLine01_Mobile;
	@FindBy(xpath="(//div[@class='mb-8']/hr)[10]")
	private WebElement RedLine02_Mobile;
	@FindBy(xpath="(//div[@class='mb-8']/hr)[11]")
	private WebElement RedLine03_Mobile;
	@FindBy(xpath="(//div[@class='mb-8']/hr)[12]")
	private WebElement RedLine04_Mobile;
	@FindBy(xpath="(//div[@class='mb-8']/hr)[13]")
	private WebElement RedLine05_Mobile;
	@FindBy(xpath="(//div[@class='mb-8']/hr)[14]")
	private WebElement RedLine06_Mobile;
	@FindBy(xpath="(//div[@class='mb-8']/hr)[15]")
	private WebElement RedLine07_Mobile;
	@FindBy(xpath="(//div[@class='mb-8']/hr)[16]")
	private WebElement RedLine08_Mobile;



	/*
	 * Anchor Links Section - ToC - Desktop
	 */
	@FindBy(xpath="(//div[@class='mx-auto max-w-[1920px] lg:flex']/div/div)[1]")
	private WebElement AnchorLinks;
	@FindBy(xpath="(//div[@class='mb-8']/a)[1]")
	private WebElement AnchorLinks01;
	@FindBy(xpath="(//div[@class='mb-8']/a)[2]")
	private WebElement AnchorLinks02;
	@FindBy(xpath="(//div[@class='mb-8']/a)[3]")
	private WebElement AnchorLinks03;
	@FindBy(xpath="(//div[@class='mb-8']/a)[4]")
	private WebElement AnchorLinks04;
	@FindBy(xpath="(//div[@class='mb-8']/a)[5]")
	private WebElement AnchorLinks05;
	@FindBy(xpath="(//div[@class='mb-8']/a)[6]")
	private WebElement AnchorLinks06;
	@FindBy(xpath="(//div[@class='mb-8']/a)[7]")
	private WebElement AnchorLinks07;
	@FindBy(xpath="(//div[@class='mb-8']/a)[8]")
	private WebElement AnchorLinks08;



	/*
	 * Red Line - Anchor Links Section - Desktop
	 */
	@FindBy(xpath="(//div[@class='mb-8']/hr)[1]")
	private WebElement RedLine01;
	@FindBy(xpath="(//div[@class='mb-8']/hr)[2]")
	private WebElement RedLine02;
	@FindBy(xpath="(//div[@class='mb-8']/hr)[3]")
	private WebElement RedLine03;
	@FindBy(xpath="(//div[@class='mb-8']/hr)[4]")
	private WebElement RedLine04;
	@FindBy(xpath="(//div[@class='mb-8']/hr)[5]")
	private WebElement RedLine05;
	@FindBy(xpath="(//div[@class='mb-8']/hr)[6]")
	private WebElement RedLine06;
	@FindBy(xpath="(//div[@class='mb-8']/hr)[7]")
	private WebElement RedLine07;
	@FindBy(xpath="(//div[@class='mb-8']/hr)[8]")
	private WebElement RedLine08;


	/*
	 * 1st Anchor Links Description Section
	 */
	@FindBy(id="toc_chapter_title_for_faqs")
	private WebElement ParaRedLine01;
	@FindBy(xpath="(//*[@id='tocEnd'])[1]")
	private WebElement FaqsChapterTitleExample;

	@FindBy(xpath="(//div[@class='mx-5 2xl:pl-[176px] xl:pl-[177px] lg:pr-3 lg:mx-0']/h2)[1]")
	private WebElement FaqsChapterTitle;
	@FindBy(xpath="(//div[@class='pb-8 xl:pb-10 2xl:pb-16'])[1]")
	private WebElement paragraphFormatText;
	@FindBy(xpath="(//div[@data-testid='sectionfaq'])[1]")
	private WebElement QuestionOneSection;
	@FindBy(xpath="(//div[@class='overflow-hidden']/div)[1]")
	private WebElement AnswerOneSection;
	@FindBy(xpath="(//div[@data-testid='sectionfaq'])[2]")
	private WebElement QuestionTwoSection;
	@FindBy(xpath="(//div[@class='overflow-hidden']/div)[2]")
	private WebElement AnswerTwoSection;


	/*
	 * 2nd Anchor Links Description Section
	 */
	@FindBy(xpath="(//div[@class='pb-12 xl:pb-20 2xl:pb-[136px]'])[2]")
	private WebElement FirstAnchorTitle;
	@FindBy(xpath="(//div[@class='pb-12 xl:pb-20 2xl:pb-[136px]']/div/p)[1]")
	private WebElement FirstAnchorText;
	@FindBy(xpath="//div[@class='pb-12 xl:pb-20 2xl:pb-[136px]']/div/blockquote/h3")
	private WebElement BlogQuotes;
	@FindBy(xpath="(//div[@class='pb-12 xl:pb-20 2xl:pb-[136px]']/div/p)[2]")
	private WebElement FirstAnchorText02;
	@FindBy(xpath="(//div[@class='pb-12 xl:pb-20 2xl:pb-[136px]']/div/p)[2]")
	private static WebElement redQuotes;


	/*
	 * 3rd Anchor Links Description Section
	 */
	@FindBy(xpath="//*[@id='toc_introduction']")
	private WebElement AnchorLinks03Title;
	@FindBy(xpath="(//div[@class='pb-8 lg:pb-[64px]']/div/p)[3]")
	private WebElement AnchorLinks03Text;
	@FindBy(xpath="//div[@data-testid='video-embbed']")
	private WebElement youTubeVideoLink;


	/*
	 * 4th Anchor Links Section
	 */
	@FindBy(id="toc_unjust_legacy_of_nixon's_controlled_substances_act")
	private WebElement UnjustLegacyTitleText;
	@FindBy(xpath="(//*[@data-testid='richtextcomponent'])[4]")
	private WebElement UnjustLegacyDescription;

	//Small Image with Caption
	@FindBy(xpath="(//div[@class='pb-8 lg:pb-[64px]']/div/h2)[1]")
	private WebElement smallWidthImageText;
	@FindBy(xpath="//*[@class='h-full w-full px-5 pb-8 md:rounded-md']")
	private WebElement smallWidthImage;
	@FindBy(xpath = "//*[text()='This is the Caption ']")
	private WebElement ThisIsTheCaption;

	// Large / Full Wide image
	@FindBy(xpath = "//*[text()='Full width Image ']")
	private WebElement FullWidthImageText;
	@FindBy(xpath = "(//*[@data-testid='imagesection']/div/span/img)[2]")
	private WebElement FullWidthImage;
	@FindBy(xpath = "//*[text()='Lorem ipsum caption text desktop']")
	private WebElement FullWidthCaption;

	@FindBy(xpath = "//*[text()='Lorem ipsum caption text']")
	private WebElement FullWidthCaptionMobile;


	/*
	 * 5th Anchor Links Section
	 */
	@FindBy(xpath="//div[@class='bg-white']/div")
	private WebElement bannerC09;

	@FindBy(xpath="//div[@class='relative h-[256px] w-full md:h-[540px]']/span/img")
	private WebElement bannerC09Mobile;


	/*
	 * 6th Anchor Links Section
	 */
	@FindBy(id="toc_thc_dosage_tips")
	private WebElement DosageTipsTitle;
	@FindBy(xpath="(//div[@class='pb-8 lg:pb-[64px]']/div/ul)[1]")
	private WebElement description01;
	@FindBy(xpath="(//div[@class='pb-8 lg:pb-[64px]']/div/ol)[1]")
	private WebElement description02;
	@FindBy(xpath="(//div[@class='pb-8 lg:pb-[64px]']/div/p)[1]")
	private WebElement description03;
	@FindBy(xpath="(//*[@class='ml-5 max-w-[736px] pb-4 [&_p]:ml-3 font-extrabold text-[18px] [&_p]:mb-0'])[1]")
	private WebElement bulletWithText;
	@FindBy(xpath = "(//*[@class='ml-5 max-w-[736px] pb-4 [&_p]:ml-3 font-extrabold text-[18px] [&_p]:mb-0'])[8]")
	private WebElement NumberWithText;


	/*
	 * 7th Anchor Links Section
	 */
	@FindBy(id="toc_ingredients")
	private WebElement Ingredients;
	@FindBy(xpath="(//div[@class='pb-8 lg:pb-[64px]']/div/ul)[2]")
	private WebElement IngredientsDescription;


	/*
	 * Source Link
	 */
	@FindBy(id = "toc_sources")
	private WebElement SourcesTitleText;
	@FindBy(xpath = "//div[@class='lg:col-span-3']")
	private WebElement SourcesText;
	@FindBy(xpath = "//*[@class='lg:col-span-9']")
	private WebElement sourcesSection;
	@FindBy(xpath = "(//*[@class='lg:col-span-9']/div/div/div/h5)[1]")
	private WebElement siteName_titleText;
	@FindBy(xpath = "(//*[@class='lg:col-span-9']/div/div/div/div)[1]")
	private WebElement externalIcon;
	@FindBy(xpath = "//div[@class='pt-8 float-left lg:float-right flex flex-col lg:flex-row gap-4 lg:gap-6 items-center']/p")
	private WebElement ShowingCountText;
	@FindBy(xpath = "//div[@class='pt-8 float-left lg:float-right flex flex-col lg:flex-row gap-4 lg:gap-6 items-center']/button")
	private WebElement ShowMoreCTA;
	@FindBy(xpath = "(//div[@data-testid='sources-card'])[4]")
	private WebElement sourcesSection01;



	/*
	 * Product Cart Title
	 */
	@FindBy(xpath = "(//div[@class='w-full  block md:block lg:block']/div/div/div)[5]/h3")
	private WebElement ProductCartTitle;
	@FindBy(xpath = "(//div[@class='w-full  block md:block lg:block']/div/div/div)[5]/p")
	private WebElement ProductCartDescription;
	@FindBy(xpath = "(//div[@class='w-full  block md:block lg:block']/div/div/div)[5]/a")
	private WebElement ProductCartCTA;
	@FindBy(xpath = "//div[@class='flex items-center']")
	private WebElement Slider;
	@FindBy(xpath = "(//div[@data-testid='vertical-containers'])[1]")
	private WebElement ProductCart;
	@FindBy(xpath = "(//div[@class='px-4 pb-4 pt-3 lg:px-8 lg:pb-8 lg:pt-5']/button)[1]")
	private WebElement AddToCartCTA01;
	@FindBy(xpath = "(//div[@class='p-4 lg:p-8'])[1]")
	private WebElement Product01;
	@FindBy(xpath = "(//div[@class='p-4 lg:p-8'])[2]")
	private WebElement Product02;
	@FindBy(xpath = "(//button[@class='flex h-6 w-6 items-center justify-center'])[2]")
	private WebElement PlusCTA;
	@FindBy(xpath = "(//button[@class='flex h-6 w-6 items-center justify-center'])[1]")
	private WebElement MinusCTA;
	@FindBy(xpath = "//div[@class='flex']/button")
	private WebElement cartBackCTA01;
	@FindBy(xpath = "//*[@data-testid='next-icon']")
	private WebElement CardSliderNextCTA;
	@FindBy(xpath = "//*[@data-testid='prev-icon']")
	private WebElement CardSliderBackCTA;


	/*
	 * Related Articles
	 */
	@FindBy(xpath = "//div[@class='md:pb-[64px] pb-8']/..")  //common
	private WebElement RelatedArticleSection;
	@FindBy(xpath = "//div[@class='md:pb-[64px] pb-8']") //common
	private WebElement RelatedArticleText;
	@FindBy(xpath = "(//div[@class='pt-5 xl:h-[164px]']/a)[1]") //common
	private WebElement RelatedArticleTitleText;
	@FindBy(xpath = "(//div[@class='pt-5 xl:h-[164px]']/p)[1]") //common
	private WebElement RelatedArticleDescription;
	@FindBy(xpath = "(//div[@data-testid='card-labels']/label)[1]") //common
	private WebElement RelatedArticleCategoryTags;
	@FindBy(xpath = "(//div[@data-testid='card-labels']/label)[2]") //common
	private WebElement RelatedArticleDate;
	@FindBy(xpath="(//div[@class='pt-5 xl:h-[164px]']/a)[1]") //common
	private WebElement readTheArticleCTA;
	@FindBy(xpath = "(//div[@data-testid='article-cards']/div)[1]")
	private WebElement RelatedArticleSectionOne;
	@FindBy(xpath = "(//div[@data-testid='article-cards']/div)[2]")
	private WebElement RelatedArticleSectionTwo;
	@FindBy(xpath = "(//div[@data-testid='article-cards']/div)[3]")
	private WebElement RelatedArticleSectionThree;
	@FindBy(xpath = "//a[@data-testid='related-articles-button']")
	private WebElement SeeAllArticleCTA;


	/*
	 * Content
	 */
	@FindBy(xpath = "//div[@class='fixed bottom-5 right-5 z-[999] block md:hidden']/button")
	private WebElement ContentCTA;


	/*
	 * FAQ
	 */
	@FindBy(xpath = "(//div[@class='pb-12 xl:pb-20 2xl:pb-[136px]'])[6]")
	private WebElement BlogFaqSection;

	public WebElement getBlogFaqSection() {
		return BlogFaqSection;
	}

	public WebElement getReadTheArticleCTA() {
		return readTheArticleCTA;
	}
	public WebElement getBackToCTA() {
		return BackToCTA;
	}
	public WebElement getHeroImage() {
		return HeroImage;
	}
	public WebElement getArticleText() {
		return ArticleText;
	}
	public WebElement getOverviewOfaParticularArticle() {
		return OverviewOfaParticularArticle;
	}
	public WebElement getArticleDescription() {
		return ArticleDescription;
	}
	public WebElement getNewTag() {
		return NewTag;
	}
	public WebElement getCannabis101Tag() {
		return Cannabis101Tag;
	}
	public WebElement getDateTag() {
		return DateTag;
	}
	public WebElement getTimerIcon() {
		return TimerIcon;
	}
	public WebElement getHeroArticleDetail() {
		return HeroArticleDetail;
	}
	public WebElement getAnchorLinks() {
		return AnchorLinks;
	}
	public WebElement getRedLine01() {
		return RedLine01;
	}
	public WebElement getRedLine02() {
		return RedLine02;
	}
	public WebElement getRedLine03() {
		return RedLine03;
	}
	public WebElement getRedLine04() {
		return RedLine04;
	}
	public WebElement getRedLine05() {
		return RedLine05;
	}
	public WebElement getRedLine06() {
		return RedLine06;
	}
	public WebElement getRedLine07() {
		return RedLine07;
	}
	public WebElement getRedLine08() {
		return RedLine08;
	}
	public WebElement getRedLine01Mobile() {
		return RedLine01_Mobile;
	}
	public WebElement getRedLine02Mobile() {
		return RedLine02_Mobile;
	}
	public WebElement getRedLine03Mobile() {
		return RedLine03_Mobile;
	}
	public WebElement getRedLine04Mobile() {
		return RedLine04_Mobile;
	}
	public WebElement getRedLine05Mobile() {
		return RedLine05_Mobile;
	}
	public WebElement getRedLine06Mobile() {
		return RedLine06_Mobile;
	}
	public WebElement getRedLine07Mobile() {
		return RedLine07_Mobile;
	}
	public WebElement getRedLine08Mobile() {
		return RedLine08_Mobile;
	}

	public WebElement getParagraphFormatText() {
		return paragraphFormatText;
	}
	public WebElement getsiteName_titleText() {
		return siteName_titleText;
	}
	public WebElement getexternalIcon() {
		return externalIcon;
	}
	public WebElement getFaqsChapterTitleExample() {
		return FaqsChapterTitleExample;
	}
	public WebElement getFaqsChapterTitle() {
		return FaqsChapterTitle;
	}
	public WebElement getQuestionOneSection() {
		return QuestionOneSection;
	}
	public WebElement getAnswerOneSection() {
		return AnswerOneSection;
	}
	public WebElement getQuestionTwoSection() {
		return QuestionTwoSection;
	}
	public WebElement getAnswerTwoSection() {
		return AnswerTwoSection;
	}
	public WebElement getFirstAnchorTitle() {
		return FirstAnchorTitle;
	}
	public WebElement getFirstAnchorText() {
		return FirstAnchorText;
	}
	public WebElement getBlogQuotes() {
		return BlogQuotes;
	}
	public WebElement getFirstAnchorText02() {
		return FirstAnchorText02;
	}
	public static WebElement getRedQuotes() {
		return redQuotes;
	}
	public WebElement getAnchorLinks03Title() {
		return AnchorLinks03Title;
	}
	public WebElement getAnchorLinks03Text() {
		return AnchorLinks03Text;
	}
	public WebElement getYouTubeVideoLink() {
		return youTubeVideoLink;
	}
	public WebElement getUnjustLegacyTitleText() {
		return UnjustLegacyTitleText;
	}
	public WebElement getUnjustLegacyDescription() {
		return UnjustLegacyDescription;
	}
	public WebElement getDosageTipsTitle() {
		return DosageTipsTitle;
	}
	public WebElement getSourcesText() {
		return SourcesText;
	}
	public WebElement getSourcesSection() {
		return sourcesSection;
	}
	public WebElement getSmallWidthImage() {
		return smallWidthImage;
	}
	public WebElement getThisIsTheCaption() {
		return ThisIsTheCaption;
	}
	public WebElement getDescription01() {
		return description01;
	}
	public WebElement getDescription02() {
		return description02;
	}
	public WebElement getDescription03() {
		return description03;
	}
	public WebElement getShowingCountText() {
		return ShowingCountText;
	}
	public WebElement getShowMoreCTA() {
		return ShowMoreCTA;
	}
	public WebElement getSourcesSection01() {
		return sourcesSection01;
	}
	public WebElement getProductCartTitle() {
		return ProductCartTitle;
	}
	public WebElement getProductCartDescription() {
		return ProductCartDescription;
	}
	public WebElement getProductCartCTA() {
		return ProductCartCTA;
	}
	public WebElement getSlider() {
		return Slider;
	}
	public WebElement getProductCart() {
		return ProductCart;
	}
	public WebElement getAddToCartCTA01() {
		return AddToCartCTA01;
	}
	public WebElement getProduct01() {
		return Product01;
	}
	public WebElement getProduct02() {
		return Product02;
	}
	public WebElement getPlusCTA() {
		return PlusCTA;
	}
	public WebElement getMinusCTA() {
		return MinusCTA;
	}
	public WebElement getCartBackCTA01() {
		return cartBackCTA01;
	}
	public WebElement getCardSliderNextCTA() {
		return CardSliderNextCTA;
	}
	public WebElement getCardSliderBackCTA() {
		return CardSliderBackCTA;
	}
	public WebElement getRelatedArticleText() {
		return RelatedArticleText;
	}
	public WebElement getRelatedArticleSection() {
		return RelatedArticleSection;
	}
	public WebElement getRelatedArticleSectionOne() {
		return RelatedArticleSectionOne;
	}
	public WebElement getRelatedArticleTitleText() {
		return RelatedArticleTitleText;
	}
	public WebElement getRelatedArticleDescription() {
		return RelatedArticleDescription;
	}
	public WebElement getRelatedArticleCategoryTags() {
		return RelatedArticleCategoryTags;
	}
	public WebElement getRelatedArticleDate() {
		return RelatedArticleDate;
	}
	public WebElement getRelatedArticleSectionTwo() {
		return RelatedArticleSectionTwo;
	}
	public WebElement getRelatedArticleSectionThree() {
		return RelatedArticleSectionThree;
	}
	public WebElement getSeeAllArticleCTA() {
		return SeeAllArticleCTA;
	}
	public WebElement getBannerC09() {
		return bannerC09;
	}
	public WebElement getBannerC09Mobile() {
		return bannerC09Mobile;
	}
	public WebElement getIngredients() {
		return Ingredients;
	}
	public WebElement getSourcesTitleText() {
		return SourcesTitleText;
	}
	public WebElement getAnchorLinks01() {
		return AnchorLinks01;
	}
	public WebElement getBulletWithText() {
		return bulletWithText;
	}
	public WebElement getNumberWithText() {
		return NumberWithText;
	}
	public WebElement getFullWidthImageText() {
		return FullWidthImageText;
	}
	public WebElement getFullWidthImage() {
		return FullWidthImage;
	}
	public WebElement getFullWidthCaption() {
		return FullWidthCaption;
	}
	public WebElement getFullWidthCaptionMobile() {
		return FullWidthCaptionMobile;
	}
	public WebElement getContentCTA() {
		return ContentCTA;
	}

	public WebElement getTableOfContentsCTA() {
		return TableOfContentsCTA;
	}
	public WebElement getTableOfContentsText() {
		return TableOfContentsText;
	}

	public WebElement getTableOfContent01() {
		return TableOfContent01;
	}
	public WebElement getTableOfContent02() {
		return TableOfContent02;
	}
	public WebElement getTableOfContent03() {
		return TableOfContent03;
	}
	public WebElement getTableOfContent04() {
		return TableOfContent04;
	}
	public WebElement getTableOfContent05() {
		return TableOfContent05;
	}
	public WebElement getTableOfContent06() {
		return TableOfContent06;
	}
	public WebElement getTableOfContent07() {
		return TableOfContent07;
	}
	public WebElement getTableOfContent08() {
		return TableOfContent08;
	}










	public void ClickOnreadTheArticleCTA() {
		try {
			jsClick(readTheArticleCTA);
			Logger.log("Clicked on joinCTA CTA");
		} catch (Exception e) {
			Logger.log("Didn't Click on joinCTA CTA");
		}
	}

	public void ClickQuestionOneSection() {
		try {
			clickOn(QuestionOneSection);
			Logger.log("Clicked on joinCTA CTA");
		} catch (Exception e) {
			Logger.log("Didn't Click on joinCTA CTA");
		}
	}

	public void ClickQuestionTwoSection() {
		try {
			clickOn(QuestionTwoSection);
			Logger.log("Clicked on joinCTA CTA");
		} catch (Exception e) {
			Logger.log("Didn't Click on joinCTA CTA");
		}
	}


	public void TapOnTableOfContents_CloseCTA() {
		try {
			clickOn(TableOfContents_CloseCTA);
			Logger.log("Clicked on joinCTA CTA");
		} catch (Exception e) {
			Logger.log("Didn't Click on joinCTA CTA");
		}
	}

	public void ClickOnAnchorLinks01() {
		try {
			clickOn(AnchorLinks01);
			Logger.log("Clicked on joinCTA CTA");
		} catch (Exception e) {
			Logger.log("Didn't Click on joinCTA CTA");
		}
	}

	public void ClickOnAnchorLinks02() {
		try {
			clickOn(AnchorLinks02);
			Logger.log("Clicked on joinCTA CTA");
		} catch (Exception e) {
			Logger.log("Didn't Click on joinCTA CTA");
		}
	}

	public void ClickOnAnchorLinks03() {
		try {
			clickOn(AnchorLinks03);
			Logger.log("Clicked on joinCTA CTA");
		} catch (Exception e) {
			Logger.log("Didn't Click on joinCTA CTA");
		}
	}

	public void ClickOnAnchorLinks04() {
		try {
			clickOn(AnchorLinks04);
			Logger.log("Clicked on joinCTA CTA");
		} catch (Exception e) {
			Logger.log("Didn't Click on joinCTA CTA");
		}
	}

	public void ClickOnAnchorLinks05() {
		try {
			clickOn(AnchorLinks05);
			Logger.log("Clicked on joinCTA CTA");
		} catch (Exception e) {
			Logger.log("Didn't Click on joinCTA CTA");
		}
	}

	public void ClickOnAnchorLinks06() {
		try {
			clickOn(AnchorLinks06);
			Logger.log("Clicked on joinCTA CTA");
		} catch (Exception e) {
			Logger.log("Didn't Click on joinCTA CTA");
		}
	}

	public void ClickOnAnchorLinks07() {
		try {
			jsClick(AnchorLinks07);
			Logger.log("Clicked on joinCTA CTA");
		} catch (Exception e) {
			Logger.log("Didn't Click on joinCTA CTA");
		}
	}

	public void ClickOnAnchorLinks08() {
		try {
			jsClick(AnchorLinks08);
			Logger.log("Clicked on joinCTA CTA");
		} catch (Exception e) {
			Logger.log("Didn't Click on joinCTA CTA");
		}
	}

	public void ClickOnShowMoreCTA() {
		try {
			jsClick(ShowMoreCTA);
			Logger.log("Clicked on Show More CTA");
		} catch (Exception e) {
			Logger.log("Didn't Click on Show More CTA");
		}
	}

	public void ClickOnAddToCartCTA01() {
		try {
			jsClick(AddToCartCTA01);
			Logger.log("Clicked on Show More CTA");
		} catch (Exception e) {
			Logger.log("Didn't Click on Show More CTA");
		}
	}

	public void ClickOnPlusCTA() {
		try {
			clickOn(PlusCTA);
			Logger.log("Clicked on Plus CTA");
		} catch (Exception e) {
			Logger.log("Didn't Click on Plus CTA");
		}
	}


	public void ClickOnMinusCTA() {
		try {
			clickOn(MinusCTA);
			Logger.log("Clicked on Minus CTA");
		} catch (Exception e) {
			Logger.log("Didn't Click on Minus CTA");
		}
	}


	public void ClickOnCartBackCTA01() {
		try {
			jsClick(cartBackCTA01);
			Logger.log("Clicked on Minus CTA");
		} catch (Exception e) {
			Logger.log("Didn't Click on Minus CTA");
		}
	}


	public void ClickOnCardSliderNextCTA() {
		try {
			clickOn(CardSliderNextCTA);
			Logger.log("Clicked on Minus CTA");
		} catch (Exception e) {
			Logger.log("Didn't Click on Minus CTA");
		}
	}

	public void ClickOnCardSliderBackCTA() {
		try {
			clickOn(CardSliderBackCTA);
			Logger.log("Clicked on Minus CTA");
		} catch (Exception e) {
			Logger.log("Didn't Click on Minus CTA");
		}
	}



	public void ClickOnBackToCTA() {
		try {
			clickOn(BackToCTA);
			Logger.log("Clicked on BackTo CTA");
		} catch (Exception e) {
			Logger.log("Didn't Click on BackTo CTA");
		}
	}

	public void ClickOnYouTubeVideoLink() {
		try {
			clickOn(youTubeVideoLink);
			Logger.log("Clicked on YouTube CTA");
		} catch (Exception e) {
			Logger.log("Didn't Click on YouTube CTA");
		}
	}


	public void ClickOnRelatedArticleTitleText() {
		try {
			clickOn(RelatedArticleTitleText);
			Logger.log("Clicked on ArticleTitle Text");
		} catch (Exception e) {
			Logger.log("Didn't Click on ArticleTitle Text");
		}
	}


	public void ClickOnSeeAllArticleCTA() {
		try {
			clickOn(SeeAllArticleCTA);
			Logger.log("Clicked on See All Article CTA");
		} catch (Exception e) {
			Logger.log("Didn't Click on All Article CTA");
		}
	}

	public void TapOnTableOfContentsCTA() {
		try {
			clickOn(TableOfContentsCTA);
			Logger.log("Clicked on Contents TOC CTA");
		} catch (Exception e) {
			Logger.log("Didn't Click on Contents TOC CTA");
		}
	}

	public void TapOnTableOfContent01() {
		try {
			jsClick(TableOfContent01);
			Logger.log("Tapped on Contents TOC CTA");
		} catch (Exception e) {
			Logger.log("Didn't tap on Contents TOC CTA");
		}
	}

	public void TapOnTableOfContent02() {
		try {
			jsClick(TableOfContent02);
			Logger.log("Tapped on Contents TOC CTA");
		} catch (Exception e) {
			Logger.log("Didn't tap on Contents TOC CTA");
		}
	}

	public void TapOnTableOfContent03() {
		try {
			jsClick(TableOfContent03);
			Logger.log("Tapped on Contents TOC CTA");
		} catch (Exception e) {
			Logger.log("Didn't tap on Contents TOC CTA");
		}
	}

	public void TapOnTableOfContent04() {
		try {
			jsClick(TableOfContent04);
			Logger.log("Tapped on Contents TOC CTA");
		} catch (Exception e) {
			Logger.log("Didn't tap on Contents TOC CTA");
		}
	}

	public void TapOnTableOfContent05() {
		try {
			jsClick(TableOfContent05);
			Logger.log("Tapped on Contents TOC CTA");
		} catch (Exception e) {
			Logger.log("Didn't tap on Contents TOC CTA");
		}
	}

	public void TapOnTableOfContent06() {
		try {
			jsClick(TableOfContent06);
			Logger.log("Tapped on Contents TOC CTA");
		} catch (Exception e) {
			Logger.log("Didn't tap on Contents TOC CTA");
		}
	}

	public void TapOnTableOfContent07() {
		try {
			jsClick(TableOfContent07);
			Logger.log("Tapped on Contents TOC CTA");
		} catch (Exception e) {
			Logger.log("Didn't tap on Contents TOC CTA");
		}
	}

	public void TapOnTableOfContent08() {
		try {
			jsClick(TableOfContent08);
			Logger.log("Tapped on Contents TOC CTA");
		} catch (Exception e) {
			Logger.log("Didn't tap on Contents TOC CTA");
		}
	}






	public static void QuoteSymbolColour() {
		try {
			String QuoteSymbolColour = getRedQuotes().getCssValue("color");
			Assert.assertEquals("rgba(207, 69, 32)",QuoteSymbolColour);
			Logger.log("Verified the white header search icon color is matched");
		} catch (Exception e) {
			Logger.log("White header search icon color is not matching");
		}
	}





}
