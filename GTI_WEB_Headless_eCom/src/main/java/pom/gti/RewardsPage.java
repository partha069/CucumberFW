package pom.gti;

import com.resuableMethods.CommonAction;
import com.utilities.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RewardsPage extends CommonAction {

	public RewardsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	/***********************************************************************************************************/

	/*
	 * Hero banner Section
	 */
	@FindBy(xpath="//*[@data-testid='rewards_hero_bg_desktop_img']")
	private WebElement heroBanner;

	@FindBy(xpath="//div[@class='hidden md:flex md:w-[736px]']/div/div")
	private WebElement riseLogo;

	@FindBy(xpath="//div[@data-testid='rewards_hero_bg_img']/div/div")
	private WebElement riseLogoMobile;

	@FindBy(xpath="//div[@data-testid='rewards_hero_bg_img']")
	private WebElement heroBannerMobile;

	@FindBy(xpath="(//*[@class='w-full  block md:block lg:block']/div)[1]")
	private WebElement heroBannerSection;
	@FindBy(xpath="//*[text()='Rise Rewards']")
	private WebElement titleText;

	@FindBy(xpath="//*[@data-testid='rewards_hero_description']")
	private WebElement copyText;

	@FindBy(xpath="(//*[text()='JOIN NOW!'])[1]")
	private WebElement joinCTA;



	/*
	 * Member Benefits Section
	 */
	@FindBy(xpath = "//*[text()='MEMBER BENEFITS']")
	private WebElement MemberBenefits;

	@FindBy(xpath = "//div[@class='px-[20px] pt-[56px] pb-[64px] md:px-[60px] md:pt-[120px] md:pb-[272px]']")
	private WebElement MemberBenefitsSection;

	@FindBy(xpath = "//div[@class='max-w-[1800px] hidden md:flex']")
	private WebElement BenefitsCardSection;

	@FindBy(xpath = "//div[@class='w-full h-auto overflow-hidden']")
	private WebElement BenefitsCardSectionMobile;

	@FindBy(xpath = "//*[@data-testid='member_benefits_copy']")
	private WebElement MemberBenefitsCopyText;

	@FindBy(xpath = "(//div[@class='pb-[24px] md:pb-[48px]']/span/span/img)[5]")
	private WebElement Benefits_OneIcon;
	@FindBy(xpath = "(//div[@class='w-[138px] h-[72px] md:w-[368px] md:h-[80px]'])[5]")
	private WebElement Benefits_OneText;

	@FindBy(xpath = "(//img[@data-testid='benefits_card_icon'])[1]")
	private WebElement Benefits_OneIconMobile;
	@FindBy(xpath = "(//div[@class='w-[138px] h-[72px] md:w-[368px] md:h-[80px]'])[1]")
	private WebElement Benefits_OneTextMobile;


	@FindBy(xpath = "(//div[@class='pb-[24px] md:pb-[48px]']/span/span/img)[6]")
	private WebElement Benefits_TwoIcon;
	@FindBy(xpath = "(//div[@class='w-[138px] h-[72px] md:w-[368px] md:h-[80px]'])[6]")
	private WebElement Benefits_TwoText;

	@FindBy(xpath = "(//img[@data-testid='benefits_card_icon'])[2]")
	private WebElement Benefits_TwoIconMobile;
	@FindBy(xpath = "(//div[@class='w-[138px] h-[72px] md:w-[368px] md:h-[80px]'])[2]")
	private WebElement Benefits_TwoTextMobile;


	@FindBy(xpath = "(//div[@class='pb-[24px] md:pb-[48px]']/span/span/img)[7]")
	private WebElement Benefits_ThreeIcon;
	@FindBy(xpath = "(//div[@class='w-[138px] h-[72px] md:w-[368px] md:h-[80px]'])[7]")
	private WebElement Benefits_ThreeText;


	@FindBy(xpath = "(//img[@data-testid='benefits_card_icon'])[3]")
	private WebElement Benefits_ThreeIconMobile;

	@FindBy(xpath = "(//div[@class='w-[138px] h-[72px] md:w-[368px] md:h-[80px]'])[3]")
	private WebElement Benefits_ThreeTextMobile;

	@FindBy(xpath = "(//div[@class='pb-[24px] md:pb-[48px]']/span/span/img)[8]")
	private WebElement Benefits_FourIcon;

	@FindBy(xpath = "(//div[@class='w-[138px] h-[72px] md:w-[368px] md:h-[80px]'])[8]")
	private WebElement Benefits_FourText;

	@FindBy(xpath = "(//img[@data-testid='benefits_card_icon'])[4]")
	private WebElement Benefits_FourIconMobile;
	@FindBy(xpath = "(//div[@class='w-[138px] h-[72px] md:w-[368px] md:h-[80px]'])[4]")
	private WebElement Benefits_FourTextMobile;

	@FindBy(xpath = "(//img[@data-testid='benefits_card_icon'])[5]")
	private WebElement Benefits_FiveIconMobile;
	@FindBy(xpath = "(//div[@class='w-[138px] h-[72px] md:w-[368px] md:h-[80px]'])[5]")
	private WebElement Benefits_FiveTextMobile;

	@FindBy(xpath = "(//img[@data-testid='benefits_card_icon'])[6]")
	private WebElement Benefits_SixIconMobile;
	@FindBy(xpath = "(//div[@class='w-[138px] h-[72px] md:w-[368px] md:h-[80px]'])[6]")
	private WebElement Benefits_SixTextMobile;

	@FindBy(xpath = "(//div[@class='flex items-center']/div)[1]")
	private WebElement numberOfCards;

	@FindBy(xpath = "(//div[@class='flex items-center']/div)[2]")
	private WebElement ProgressBar;

	@FindBy(xpath = "//*[@data-testid='prev-icon']")
	private WebElement LeftArrow;

	@FindBy(xpath = "//*[@data-testid='next-icon']")
	private WebElement RightArrow;

	@FindBy(xpath = "//div[@class='flex justify-center']")
	private WebElement ShowingCountTextMobile;

	@FindBy(xpath = "//div[@class='flex justify-center pt-[16px]']/button")
	private WebElement ShowMoreCTAMobile;

	@FindBy(xpath = "//div[@class='flex justify-center pt-[16px]']/button")
	private WebElement ShowLessCTAMobile;





	 /*
	  * Point Matrix section
	  */
	@FindBy(xpath = "(//*[@class='bg-leaf h-1/3 order-0 md:h-auto md:w-1/3 md:order-2'])[1]")
	private WebElement RewardsPointMatrix;

	@FindBy(xpath = "//div[@class='contents md:hidden']/div/div/div")
	private WebElement RewardsPointMatrixMobile;

	@FindBy(xpath = "//div[@class='h-2/3 md:h-auto md:w-2/3']")
	private WebElement RewardsMatrix_Banner;

	@FindBy(xpath = "//div[@class='h-2/3 md:h-auto md:w-2/3']")
	private WebElement RewardsMatrix_BannerMobile;

	@FindBy(xpath = "//div[@class='pt-4 pb-8 2xl:w-[304px] md:pt-6 md:pb-10']/p")
	private WebElement RewardsMatrix_CopyText;
	@FindBy(xpath = "//div[@class='w-full  block md:block lg:block']/div/div/div/h2")
	private WebElement RewardsMatrix_TitleText;
	@FindBy(xpath = "//button[@data-testid='rewards_matrix_button_cta']")
	private WebElement PointMatrix_JoinNowCTA;

	@FindBy(xpath = "//div[@class='w-full  block md:block lg:block']/div/div/div/h2")
	private WebElement RewardsMatrix_TitleTextMobile;

	@FindBy(xpath = "//div[@class='pt-4 pb-8 2xl:w-[304px] md:pt-6 md:pb-10']/p")
	private WebElement RewardsMatrix_CopyTextMobile;

	@FindBy(xpath = "//button[@data-testid='rewards_matrix_button_cta']")
	private WebElement PointMatrix_JoinNowCTAMobile;



	/*
	 *  How it works
	 */
	@FindBy(xpath = "//div[@class='block md:block lg:block']/div/div/div/h2")
	private WebElement sectionTitle;

	@FindBy(xpath = "//div[@class='flex flex-col gap-y-[24px] md:flex-row md:gap-y-0 md:gap-x-[176px] md:py-[200px] md:px-[60px]']")
	private WebElement HowItWorksSection;

	@FindBy(xpath = "(//div[@class='flex flex-col-2 items-center md:flex-col md:items-start']/div/span)[1]")
	private WebElement FirstImages;

	@FindBy(xpath = "(//div[@class='flex flex-col-2 items-center md:flex-col md:items-start']/div/div/h3)[1]")
	private WebElement FirstImageTitleText;

	@FindBy(xpath = "(//div[@class='w-[200px] h-auto md:w-[280px]'])[1]")
	private WebElement FirstCopyText;

	@FindBy(xpath = "(//div[@class='flex flex-col-2 items-center md:flex-col md:items-start']/div/span)[2]")
	private WebElement SecondImages;

	@FindBy(xpath = "(//div[@class='flex flex-col-2 items-center md:flex-col md:items-start']/div/div/h3)[2]")
	private WebElement SecondImageTitleText;

	@FindBy(xpath = "(//div[@class='w-[200px] h-auto md:w-[280px]'])[2]")
	private WebElement SecondCopyText;

	@FindBy(xpath = "(//div[@class='flex flex-col-2 items-center md:flex-col md:items-start']/div/span)[3]")
	private WebElement ThirdImages;

	@FindBy(xpath = "(//div[@class='flex flex-col-2 items-center md:flex-col md:items-start']/div/div/h3)[3]")
	private WebElement ThirdImageTitleText;

	@FindBy(xpath = "(//div[@class='w-[200px] h-auto md:w-[280px]'])[3]")
	private WebElement ThirdCopyText;

	@FindBy(xpath = "(//div[@class='flex flex-col gap-y-[15px] mt-[52px] mb-[20px]']/div/div)[1]")
	private WebElement FirstToolTip;

	@FindBy(xpath = "(//div[@data-testid='tooltip-icon-box'])[1]")
	private WebElement FirstToolTipMobile;

	@FindBy(xpath = "//*[@data-testid='tooltip-container-close']")
	private WebElement FirstToolTipCloseCTAMobile;

	@FindBy(xpath = "//div[@class='relative']/div/p")
	private WebElement ToolTipText;

	@FindBy(xpath = "(//div[@class='relative']/div/p)[2]")
	private WebElement ToolTipTextMobile;

	@FindBy(xpath = "//div[@class='flex justify-between items-center']/p")
	private WebElement ToolTipSecondTextMobile;

	@FindBy(xpath = "(//div[@class='flex flex-col gap-y-[15px] mt-[52px] mb-[20px]']/div/div)[2]")
	private WebElement SecondToolTip;

	@FindBy(xpath = "(//div[@data-testid='tooltip-icon-box'])[2]")
	private WebElement SecondToolTipMobile;



	/*
	 * Banner Image Section
	 */
	@FindBy(xpath = "//div[@class='bg-white px-5 py-6 lg:px-[60px] lg:py-16']")
	private WebElement BannerSection;

	@FindBy(xpath = "(//div[@class='grid']/p)[1]")
	private WebElement TrackAndRedeemText;

	@FindBy(xpath = "(//div[@class='grid']/h3)[1]")
	private WebElement HeaderText;

	@FindBy(xpath = "(//div[@class='grid']/p)[2]")
	private WebElement CopyText;

	@FindBy(xpath = "//*[@class='self-center relative w-full h-[216px] -ml-0 -mr-0 -mt-[22%] lg:h-[520px] lg:-mt-0 lg:-ml-[85%] lg:w-[170%] xl:-ml-[50%] xl:w-[300%]']/span/img")
	private WebElement RewardsBannerImage;

	@FindBy(xpath = "(//div[@class='flex']/a)[1]")
	private WebElement AccessRewardsCTA;




     /*
      * FAQs
      */
	@FindBy(xpath = "//div[@class='lg:py-[120px] lg:pr-[212px]']/div")
	private WebElement faqSection; //

	 @FindBy(xpath = "//div[@class='pb-8 lg:pl-[60px] lg:pr-[304px] lg:pt-[152px] lg:pb-[216px]']/span/span/img")
	 private WebElement faqImage;

	@FindBy(xpath = "//div[@class='lg:py-[120px] lg:pr-[212px]']/h3")
	private WebElement FaqsCopyText;

	@FindBy(xpath = "//div[@class='lg:py-[120px] lg:pr-[212px]']/p")
	private WebElement FaqsTitleText;

	@FindBy(xpath = "(//div[@class='h-5 w-5 transition-transform'])[1]")
	private WebElement PlusIcon;

	@FindBy(xpath = "(//div[@class='h-5 w-5 transition-transform'])[1]")
	private WebElement MinusIcon;

	@FindBy(xpath = "(//div[@class='h-5 w-5 transition-transform'])[2]")
	private WebElement MinusIconQuestion2;

	@FindBy(xpath = "//div[@class='mb-2 scroll-mt-[200px] lg:max-w-[888px] 2xl:flex 2xl:flex-col']")
	private WebElement questionSection;

	@FindBy(xpath = "//div[@class='pt-6']/p")
	private WebElement showingSectionCount;

	@FindBy(xpath = "//div[@class='pt-6']/button")
	private WebElement ShowMoreCTA;

	@FindBy(xpath = "//div[@class='pt-6']/button")
	private WebElement ShowLessCTA;

	@FindBy(xpath = "(//div[@data-testid='sectionfaq']/button)[1]")
	private WebElement questionOneSectionCTA;

	@FindBy(xpath = "(//div[@class='overflow-hidden']/div/p)[1]")
	private WebElement answerOneSectionCTA;

	@FindBy(xpath = "(//div[@data-testid='sectionfaq']/button)[2]")
	private WebElement questionTwoSectionCTA;

	@FindBy(xpath = "(//div[@class='overflow-hidden']/div/p)[2]")
	private WebElement answerTwoSectionCTA;

	@FindBy(xpath = "(//div[@data-testid='sectionfaq']/button)[3]")
	private WebElement questionThreeSectionCTA;

	@FindBy(xpath = "(//div[@class='overflow-hidden']/div/p)[3]")
	private WebElement answerThreeSectionCTA;

	@FindBy(xpath = "(//div[@data-testid='sectionfaq']/button)[4]")
	private WebElement questionFourSectionCTA;

	@FindBy(xpath = "(//div[@class='overflow-hidden']/div/p)[4]")
	private WebElement answerFourSectionCTA;




	public WebElement getFaqSection() {
		return faqSection;
	}

	public WebElement getFaqsTitleText() {
		return FaqsTitleText;
	}

	public WebElement getFaqsCopyText() {
		return FaqsCopyText;
	}

	public WebElement getFaqImage() {
		return faqImage;
	}

	public WebElement getPlusIcon() {
		return PlusIcon;
	}

	public WebElement getMinusIcon() {
		return MinusIcon;
	}

	public WebElement getMinusIconQuestion2() {
		return MinusIconQuestion2;
	}

	public WebElement getQuestionSection() {
		return questionSection;
	}

	public WebElement getAnswerOneSectionCTA() {
		return answerOneSectionCTA;
	}

	public WebElement getQuestionOneSectionCTA() {
		return questionOneSectionCTA;
	}

	public WebElement getAnswerTwoSectionCTA() {
		return answerTwoSectionCTA;
	}

	public WebElement getQuestionTwoSectionCTA() {
		return questionTwoSectionCTA;
	}

	public WebElement getAnswerThreeSectionCTA() {
		return answerThreeSectionCTA;
	}

	public WebElement getQuestionThreeSectionCTA() {
		return questionThreeSectionCTA;
	}

	public WebElement getAnswerFourSectionCTA() {
		return answerFourSectionCTA;
	}

	public WebElement getShowingSectionCount() {
		return showingSectionCount;
	}

	public WebElement getShowMoreCTA() {
		return ShowMoreCTA;
	}

	public WebElement getShowLessCTA() {
		return ShowLessCTA;
	}

	public WebElement getherobanner() {
		return heroBanner;
	}

	public WebElement getRiseLogo() {
		return riseLogo;
	}

	public WebElement getRiseLogoMobile() {
		return riseLogoMobile;
	}

	public WebElement getHeroBannerMobile() {
		return heroBannerMobile;
	}

	public WebElement getHeroBannerSection() {
		return heroBannerSection;
	}

	public WebElement getTitleText() {
		return titleText;
	}

	public WebElement getcopyText() {
		return copyText;
	}

	public WebElement getjoinCTA() {
		return joinCTA;
	}

	public WebElement getBenefitsCardSection() {
		return BenefitsCardSection;
	}

	public WebElement getBenefitsCardSectionMobile() {
		return BenefitsCardSectionMobile;
	}

	public WebElement getMemberBenefitsSection() {
		return MemberBenefitsSection;
	}

	public WebElement getMemberBenefits() {
		return MemberBenefits;
	}

	public WebElement getMemberBenefitsCopyText() {
		return MemberBenefitsCopyText;
	}

	public WebElement getBenefits_OneIcon() {
		return Benefits_OneIcon;
	}

	public WebElement getBenefits_OneIconMobile() {
		return Benefits_OneIconMobile;
	}
	public WebElement getBenefits_OneText() {
		return Benefits_OneText;
	}

	public WebElement getBenefits_OneTextMobile() {
		return Benefits_OneTextMobile;
	}
	public WebElement getBenefits_TwoIcon() {
		return Benefits_TwoIcon;
	}

	public WebElement getBenefits_TwoIconMobile() {
		return Benefits_TwoIconMobile;
	}
	public WebElement getBenefits_TwoText() {
		return Benefits_TwoText;
	}

	public WebElement getBenefits_TwoTextMobile() {
		return Benefits_TwoTextMobile;
	}

	public WebElement getBenefits_ThreeIcon() {
		return Benefits_ThreeIcon;
	}

	public WebElement getBenefits_ThreeIconMobile() {
		return Benefits_ThreeIconMobile;
	}
	public WebElement getBenefits_ThreeText() {
		return Benefits_ThreeText;
	}

	public WebElement getBenefits_ThreeTextMobile() {
		return Benefits_ThreeTextMobile;
	}
	public WebElement getBenefits_FourIcon() {
		return Benefits_FourIcon;
	}

	public WebElement getBenefits_FourIconMobile() {
		return Benefits_FourIconMobile;
	}

	public WebElement getBenefits_FiveIconMobile() {
		return Benefits_FiveIconMobile;
	}

	public WebElement getBenefits_SixIconMobile() {
		return Benefits_SixIconMobile;
	}
	public WebElement getBenefits_FourText() {
		return Benefits_FourText;
	}

	public WebElement getBenefits_FourTextMobile() {
		return Benefits_FourTextMobile;
	}

	public WebElement getBenefits_FiveTextMobile() {
		return Benefits_FiveTextMobile;
	}

	public WebElement getBenefits_SixTextMobile() {
		return Benefits_SixTextMobile;
	}

	public WebElement getNumberOfCards() {
		return numberOfCards;
	}

	public WebElement getProgressBar() {
		return ProgressBar;
	}

	public WebElement getLeftArrow() {
		return LeftArrow;
	}

	public WebElement getRightArrow() {
		return RightArrow;
	}

	public WebElement getShowingCountTextMobile() {
		return ShowingCountTextMobile;
	}

	public WebElement getShowMoreCTAMobile() {
		return ShowMoreCTAMobile;
	}

	public WebElement getPointMatrix_JoinNowCTA() {
		return PointMatrix_JoinNowCTA;
	}

	public WebElement getPointMatrix_JoinNowCTAMobile() {
		return PointMatrix_JoinNowCTAMobile;
	}

	public WebElement getRewardsPointMatrix() {
		return RewardsPointMatrix;
	}

	public WebElement getRewardsPointMatrixMobile() {
		return RewardsPointMatrixMobile;
	}

	public WebElement getRewardsMatrix_TitleText() {
		return RewardsMatrix_TitleText;
	}

	public WebElement getRewardsMatrix_TitleTextMobile() {
		return RewardsMatrix_TitleTextMobile;
	}

	public WebElement getRewardsMatrix_CopyText() {
		return RewardsMatrix_CopyText;
	}

	public WebElement getRewardsMatrix_CopyTextMobile() {
		return RewardsMatrix_CopyTextMobile;
	}

	public WebElement getRewardsMatrixBanner() {
		return RewardsMatrix_Banner;
	}

	public WebElement getRewardsMatrixBannerMobile() {
		return RewardsMatrix_BannerMobile;
	}

	public WebElement getHowItWorksSection() {
		return HowItWorksSection;
	}

	public WebElement getSectionTitle() {
		return sectionTitle;
	}

	public WebElement getFirstImages() {
		return 	FirstImages;
	}

	public WebElement getFirstImageTitleText() {
		return 	FirstImageTitleText;
	}

	public WebElement getFirstCopyText() {
		return FirstCopyText;
	}

	public WebElement getSecondImages() {
		return 	SecondImages;
	}

	public WebElement getSecondImageTitleText() {
		return 	SecondImageTitleText;
	}

	public WebElement getSecondCopyText() {
		return 	SecondCopyText;
	}

	public WebElement getThirdImages() {
		return 	ThirdImages;
	}

	public WebElement getImageTitleText() {
		return 	ThirdImageTitleText;
	}

	public WebElement getThirdCopyText() {
		return 	ThirdCopyText;
	}

	public WebElement getFirstToolTip() {
		return 	FirstToolTip;
	}

	public WebElement getToolTipTextMobile() {
		return 	ToolTipTextMobile;
	}
	public WebElement getFirstToolTipCloseCTAMobile() {
		return 	FirstToolTipCloseCTAMobile;
	}

	public WebElement getToolTipSecondTextMobile() {
		return 	ToolTipSecondTextMobile;
	}
	public WebElement getToolTipText() {
		return 	ToolTipText;
	}

	public WebElement getSecondToolTip() {
		return 	SecondToolTip;
	}

	public WebElement getBannerSection() {
		return BannerSection;
	}

	public WebElement getTrackAndRedeemText() {
		return TrackAndRedeemText;
	}

	public WebElement getHeaderText() {
		return HeaderText;
	}

	public WebElement getCopyText() {
		return CopyText;
	}

	public WebElement getAccessRewardsCTA() {
		return AccessRewardsCTA;
	}













	public void ClickOnJoinCTA() {
		try {
			jsClick(joinCTA);
			Logger.log("Clicked on joinCTA CTA");
		} catch (Exception e) {
			Logger.log("Didn't Click on joinCTA CTA");
		}
	}

	public void ClickOnLeftArrow() {
		try {
			clickOn(LeftArrow);
			Logger.log("Clicked on Left Arrow");
		} catch (Exception e) {
			Logger.log("Didn't Click on Left Arrow");
		}
	}

	public void ClickOnRightArrow() {
		try {
			clickOn(RightArrow);
			Logger.log("Clicked on Right Arrow");
		} catch (Exception e) {
			Logger.log("Didn't Click on Right Arrow");
		}
	}

	public void ClickOnRewardsCTA() {
		try {
			jsClick(AccessRewardsCTA);
			Logger.log("Clicked on Click On Rewards CTA");
		} catch (Exception e) {
			Logger.log("Didn't Click On Rewards CTA");
		}
	}

	public void ClickOnPlusIcon() {
		try {
			jsClick(PlusIcon);
			Logger.log("Clicked on Click On + Icon");
		} catch (Exception e) {
			Logger.log("Didn't Click On + Icon");
		}
	}


	public void ClickMinusIcon() {
		try {
			jsClick(MinusIcon);
			Logger.log("Clicked on Click On - Icon");
		} catch (Exception e) {
			Logger.log("Didn't Click On - Icon");
		}
	}

	public void ClickOnQuestion01() {
		try {
			jsClick(questionOneSectionCTA);
			Logger.log("Clicked on Click On Question One");
		} catch (Exception e) {
			Logger.log("Didn't Click On Question One");
		}
	}

	public void ClickOnQuestion02() {
		try {
			jsClick(questionTwoSectionCTA);
			Logger.log("Clicked on Click On Question Two");
		} catch (Exception e) {
			Logger.log("Didn't Click On Question Two");
		}
	}

	public void ClickOnQuestion03() {
		try {
			jsClick(questionThreeSectionCTA);
			Logger.log("Clicked on Click On Question Three");
		} catch (Exception e) {
			Logger.log("Didn't Click On Question Three");
		}
	}

	public void ClickOnQuestion04() {
		try {
			jsClick(questionFourSectionCTA);
			Logger.log("Clicked on Click On Question Four");
		} catch (Exception e) {
			Logger.log("Didn't Click On Question Four");
		}
	}

	public void ClickOnFirstToolTip() {
		try {
			jsClick(FirstToolTip);
			Logger.log("Clicked on Click On First Tool Tip");
		} catch (Exception e) {
			Logger.log("Didn't Click On First Tool Tip");
		}
	}

	public void ClickOnFirstToolTipMobile() {
		try {
			clickOn(FirstToolTipMobile);
			Logger.log("Clicked on Click On First Tool Tip");
		} catch (Exception e) {
			Logger.log("Didn't Click On First Tool Tip");
		}
	}

	public void ClickOnSecondToolTip() {
		try {
			jsClick(SecondToolTip);
			Logger.log("Clicked on Click On Second Tool Tip");
		} catch (Exception e) {
			Logger.log("Didn't Click On Second Tool Tip");
		}
	}

	public void ClickOnSecondToolTipMobile() {
		try {
			clickOn(SecondToolTipMobile);
			Logger.log("Clicked on Click On Second Tool Tip");
		} catch (Exception e) {
			Logger.log("Didn't Click On Second Tool Tip");
		}
	}

	public void ClickOnShowMoreCTA() {
		try {
			jsClick(ShowMoreCTA);
			Logger.log("Clicked on Click On Show More CTA");
		} catch (Exception e) {
			Logger.log("Didn't Click On Show More CTA");
		}
	}

	public void ClickOnShowMoreCTAMobile() {
		try {
			jsClick(ShowMoreCTAMobile);
			Logger.log("Clicked on Click On Show More CTA For Mobile");
		} catch (Exception e) {
			Logger.log("Didn't Click On Show More CTA For Mobile");
		}
	}

	public void ClickOnShowLessCTAMobile() {
		try {
			jsClick(ShowLessCTAMobile);
			Logger.log("Clicked on Click On Show Less CTA For Mobile");
		} catch (Exception e) {
			Logger.log("Didn't Click On Show Less CTA For Mobile");
		}
	}

	public void ClickOnShowLessCTA() {
		try {
			jsClick(ShowLessCTA);
			Logger.log("Clicked on Click On Show Less CTA");
		} catch (Exception e) {
			Logger.log("Didn't Click On Show Less CTA");
		}
	}

	public void ClickOnFirstToolTipCloseCTAMobile() {
		try {
			clickOn(FirstToolTipCloseCTAMobile);
			Logger.log("Clicked on Click On First ToolTip Close CTA Mobile");
		} catch (Exception e) {
			Logger.log("Didn't Click On First ToolTip Close CTA Mobile");
		}
	}


}