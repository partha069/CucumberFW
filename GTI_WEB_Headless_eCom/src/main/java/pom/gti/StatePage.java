package pom.gti;

import com.resuableMethods.CommonAction;
import com.utilities.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StatePage extends CommonAction {

	public StatePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	/***********************************************************************************************************/

	/*
	 * Hero banner Section
	 */
	@FindBy(xpath="(//*[text()='RISE Dispensary Mundelein'])")
	private WebElement RISEDispensaryMundelein_Text;


	/*
	 * Breadcrumb
	 */
	@FindBy(xpath="//*[@class='h-[24px] md:mb-[66px] sm:mb-6']/nav/ol")
	private WebElement Breadcrumb_Mundelein;

	@FindBy(xpath="//*[@class='lg:hidden flex items-center']")
	private WebElement Breadcrumb_MundeleinMobile;

	@FindBy(xpath="(//*[text()='Illinois'])[1]")
	private WebElement Illinois_Breadcrumb;

	@FindBy(xpath="(//*[text()='Illinois'])[2]")
	private WebElement Illinois_BreadcrumbMobile;



	/*
	 * Titel Text, Copy Text & Hero Image
	 */
	@FindBy(xpath="//*[@class='xl:w-[884px] xl:pl-[60px] px-5']/h2")
	private WebElement TitleText;

	@FindBy(xpath="//*[@class='xl:w-[884px] xl:pl-[60px] px-5']/p")
	private WebElement CopyText;

	@FindBy(xpath="//*[@class='relative md:order-last']/div/span/span/img")
	private WebElement HeroImage;


	/*
	 * Map Section
	 */

	@FindBy(xpath="//*[@data-testid='mapListingAccordionContainer']")
	private WebElement DispensariesLocation;

	@FindBy(xpath="(//*[@data-testid='mapListingAccordionContainer']/div)[1]")
	private WebElement Dispensaries_FirstDispensaryList;

	@FindBy(xpath="//*[@class='md:pt-[60px] py-6 px-5']/h2")
	private WebElement DispensariesInIllinois_Text;

	@FindBy(xpath = "(//*[@class='ml-4'])[1]")
	private WebElement Dispensaries_Question_PlusIcon01;

	@FindBy(xpath = "(//*[@class='ml-4'])[2]")
	private WebElement Dispensaries_Question_PlusIcon02;


	@FindBy(xpath="(//*[@data-testid='dispensary-accordion'])[1]")
	private WebElement Dispensaries_FirstSection;

	@FindBy(xpath = "(//*[@data-testid='dispensary-accordion'])[2]")
	private WebElement Dispensaries_SecondSection;

	@FindBy(xpath="(//*[@data-testid='mapListingAccordionContainer']/div/button)[1]")
	private WebElement Dispensaries_Question001;
	@FindBy(xpath="(//*[@data-testid='mapListingAccordionContainer']/div/button)[1]")
	private WebElement Dispensaries_nameText_001;
	@FindBy(xpath = "(//*[@class='flex items-center']/h5)[1]")
	private WebElement DispensaryName_001;

	@FindBy(xpath = "(//*[@class='whitespace-pre'])[1]")
	private WebElement StoreHours01;
	@FindBy(xpath = "(//*[@class='text-secondary-100 sm:text-[20px] md:text-[27px]'])[1]")
	private WebElement StorHoursArrowDown01;
	@FindBy(xpath = "(//*[@class='text-sm leading-4 tracking-[0.14px] lg:text-base lg:leading-5 lg:tracking-[0.16px] not-italic font-normal font-arial text-leaf undefined'])[1]")
	private WebElement PhoneNumber01;
	@FindBy(xpath = "(//*[@class='text-sm leading-4 tracking-[0.14px] lg:text-base lg:leading-5 lg:tracking-[0.16px] not-italic font-normal font-arial text-leaf undefined'])[2]")
	private WebElement Adderss01;
	@FindBy(xpath = "(//*[text()='Contact us'])[1]")
	private WebElement ContactUs_CTA01;



	@FindBy(xpath="(//*[@data-testid='mapListingAccordionContainer']/div/button)[2]")
	private WebElement Dispensaries_Question002;
	@FindBy(xpath="(//*[@data-testid='mapListingAccordionContainer']/div/button)[2]")
	private WebElement Dispensaries_nameText_002;
	@FindBy(xpath = "(//*[@class='flex items-center']/h5)[2]")
	private WebElement DispensaryName_002;


	@FindBy(xpath="(//*[@data-testid='mapListingAccordionContainer']/div/button)[3]")
	private WebElement Dispensaries_Question003;
	@FindBy(xpath="(//*[@data-testid='mapListingAccordionContainer']/div/button)[3]")
	private WebElement Dispensaries_nameText_003;
	@FindBy(xpath = "(//*[@class='flex items-center']/h5)[3]")
	private WebElement DispensaryName_003;




	/*
	 * Map
	 */

	@FindBy(xpath = "(//*[@class='gm-style']/div)[1]")
	private WebElement Map;
	@FindBy(xpath = "(//*[@title='RISE Dispensary Canton marker'])[1]")
	private WebElement Location01;
	@FindBy(xpath = "//*[@title='RISE Dispensary Mundelein Test 1 marker']")
	private WebElement Location02;
	@FindBy(xpath = "(//*[@button-type='primary'])[5]")
	private WebElement MapView;
	@FindBy(xpath = "(//*[@button-type='primary'])[4]")
	private WebElement ListView;





	/*
	 * Delivery Zone
	 */
	@FindBy(xpath = "//*[@class='flex']/h5")
	private WebElement DispensaryName;
	@FindBy(xpath = "(//*[@class='flex items-center gap-3 lg:gap-6 [&_p]:!text-grey-400 [&_svg]:!text-grey-400 [&_svg]:w-6 [&_svg]:h-6 mb-3'])[1]")
	private WebElement PhoneNumberWithIcon;
	@FindBy(xpath = "(//*[@class='flex items-center gap-3 lg:gap-6 [&_p]:!text-grey-400 [&_svg]:!text-grey-400 [&_svg]:w-6 [&_svg]:h-6 mb-3'])[2]")
	private WebElement LocationNameWithIcon;
	@FindBy(xpath = "//*[@class='flex items-center [&_svg]:mr-3 [&_svg]:lg:mr-6 [&_p]:!text-leaf [&_svg]:!text-grey-400 [&_svg]:w-6 [&_svg]:h-6']/a/p")
	private WebElement Dispensary_ContactUsCTA;
	@FindBy(xpath = "//*[@data-testid='mapCardButton']")
	private WebElement ShopThisDispensaryCTA;
	@FindBy(xpath = "//*[@class='absolute right-8 top-6 h-5 w-5 cursor-pointer']")
	private WebElement Dispensary_CloseCTA;
	@FindBy(xpath = "(//div[@class='relative'])[1]")
	private WebElement DispensaryLocationScroll;


	/*
	 * Deals Section
	 */
	@FindBy(xpath = "//*[@class='w-full px-5']")
	private WebElement headingDealsText;
	@FindBy(xpath = "(//*[@data-testid='deal-cards-list-show-more']/div/a)[1]")
	private WebElement headingDealsCart01;

	@FindBy(xpath = "(//*[@data-testid='deal-cards-list-slider']/div/div/div/div/div)[1]")
	private WebElement headingDealsCart01Mobile;



	@FindBy(xpath = "(//*[@data-testid='deal-cards-list-show-more']/div/a)[2]")
	private WebElement headingDealsCart02;
	@FindBy(xpath = "(//*[@data-testid='deal-cards-list-show-more']/div/a)[3]")
	private WebElement headingDealsCart03;
	@FindBy(xpath = "(//*[@data-testid='deal-cards-list-show-more']/div/a)[4]")
	private WebElement headingDealsCart04;
	@FindBy(xpath = "(//*[@data-testid='deal-cards-list-show-more']/div/a/div/div)[1]")
	private WebElement headingDealsImage01;


	@FindBy(xpath = "(//*[@data-testid='deal-cards-list-show-more']/div/a/div/div/p)[1]")
	private WebElement TitleTextDeals01;
	@FindBy(xpath = "(//*[@data-testid='deal-cards-list-show-more']/div/a/div/div/p)[4]")
	private WebElement TitleTextDeals02;
	@FindBy(xpath = "(//*[@data-testid='deal-cards-list-show-more']/div/a/div/div/p)[7]")
	private WebElement TitleTextDeals03;
	@FindBy(xpath = "(//*[@data-testid='deal-cards-list-show-more']/div/a/div/div/p)[10]")
	private WebElement TitleTextDeals04;



	@FindBy(xpath = "(//*[@class='flex flex-col justify-center items-start bg-kief shrink-0 self-stretch py-6 px-4 gap-2.5']/p)[1]")
	private WebElement TitleTextDeals01Mobile;
	@FindBy(xpath = "(//*[@class='flex flex-col justify-center items-start bg-kief shrink-0 self-stretch py-6 px-4 gap-2.5']/p)[4]")
	private WebElement TitleTextDeals02Mobile;
	@FindBy(xpath = "(//*[@class='flex flex-col justify-center items-start bg-kief shrink-0 self-stretch py-6 px-4 gap-2.5']/p)[7]")
	private WebElement TitleTextDeals03Mobile;
	@FindBy(xpath = "(//*[@class='flex flex-col justify-center items-start bg-kief shrink-0 self-stretch py-6 px-4 gap-2.5']/p)[10]")
	private WebElement TitleTextDeals04Mobile;


	@FindBy(xpath = "(//*[@data-testid='deal-cards-list-show-more']/div/a/div/div/p)[2]")
	private WebElement CopyTextDeals01;
	@FindBy(xpath = "(//*[@data-testid='deal-cards-list-show-more']/div/a/div/div/p)[3]")
	private WebElement CopyTextDeals01_1;
	@FindBy(xpath = "(//*[@data-testid='deal-cards-list-show-more']/div/a/div/div/p)[5]")
	private WebElement CopyTextDeals02;
	@FindBy(xpath = "(//*[@data-testid='deal-cards-list-show-more']/div/a/div/div/p)[6]")
	private WebElement CopyTextDeals02_2;
	@FindBy(xpath = "(//*[@data-testid='deal-cards-list-show-more']/div/a/div/div/p)[8]")
	private WebElement CopyTextDeals03;
	@FindBy(xpath = "(//*[@data-testid='deal-cards-list-show-more']/div/a/div/div/p)[9]")
	private WebElement CopyTextDeals03_3;
	@FindBy(xpath = "(//*[@data-testid='deal-cards-list-show-more']/div/a/div/div/p)[11]")
	private WebElement CopyTextDeals04;
	@FindBy(xpath = "(//*[@data-testid='deal-cards-list-show-more']/div/a/div/div/p)[12]")
	private WebElement CopyTextDeals04_4;


	@FindBy(xpath = "(//*[@class='flex flex-col justify-center items-start bg-kief shrink-0 self-stretch py-6 px-4 gap-2.5']/p)[2]")
	private WebElement CopyTextDeals01Mobile;
	@FindBy(xpath = "(//*[@class='flex flex-col justify-center items-start bg-kief shrink-0 self-stretch py-6 px-4 gap-2.5']/p)[3]")
	private WebElement CopyTextDeals01_1Mobile;
	@FindBy(xpath = "(//*[@class='flex flex-col justify-center items-start bg-kief shrink-0 self-stretch py-6 px-4 gap-2.5']/p)[5]")
	private WebElement CopyTextDeals02Mobile;
	@FindBy(xpath = "(//*[@class='flex flex-col justify-center items-start bg-kief shrink-0 self-stretch py-6 px-4 gap-2.5']/p)[6]")
	private WebElement CopyTextDeals02_2Mobile;
	@FindBy(xpath = "(//*[@class='flex flex-col justify-center items-start bg-kief shrink-0 self-stretch py-6 px-4 gap-2.5']/p)[8]")
	private WebElement CopyTextDeals03Mobile;
	@FindBy(xpath = "(//*[@class='flex flex-col justify-center items-start bg-kief shrink-0 self-stretch py-6 px-4 gap-2.5']/p)[9]")
	private WebElement CopyTextDeals03_3Mobile;
	@FindBy(xpath = "(//*[@class='flex flex-col justify-center items-start bg-kief shrink-0 self-stretch py-6 px-4 gap-2.5']/p)[11]")
	private WebElement CopyTextDeals04Mobile;
	@FindBy(xpath = "(//*[@class='flex flex-col justify-center items-start bg-kief shrink-0 self-stretch py-6 px-4 gap-2.5']/p)[12]")
	private WebElement CopyTextDeals04_4Mobile;


	@FindBy(xpath = "//*[@data-testid='deal-cards-list-show-more']")
	private WebElement Deals_Cart;
	@FindBy(xpath = "(//*[@data-testid='deal-cards-list-show-more']/div/a/div/div)[3]")
	private WebElement headingDealsImage02;
	@FindBy(xpath = "(//*[@data-testid='deal-cards-list-show-more']/div/a/div/div)[5]")
	private WebElement headingDealsImage03;
	@FindBy(xpath = "(//*[@data-testid='deal-cards-list-show-more']/div/a/div/div)[7]")
	private WebElement headingDealsImage04;


	@FindBy(xpath = "//*[@class='flex flex-row justify-center items-center gap-6']/p")
	private WebElement ShowingNumberOfNumberText;

	@FindBy(xpath = "//*[@class='flex flex-row justify-center items-center gap-6']/button")
	private WebElement Deal_ShowMoreCTA;

	@FindBy(xpath = "(//*[@data-testid='prev-icon'])[1]")
	private WebElement Deal_LeftArrow;
	@FindBy(xpath = "(//*[@data-testid='next-icon'])[1]")
	private WebElement Deal_RightArrow;

	@FindBy(xpath = "(//div[@data-testid='progressbar-status']/p)[1]")
	private WebElement Deal_ProgressbarCount;


	/*
	 * Event Discount
	 */
	@FindBy(xpath = "//*[text()='Event Discounts']")
	private WebElement EventDiscount_HeadingText;
	@FindBy(xpath = "(//*[@class='flex flex-col items-start gap-4 self-stretch lg:gap-6 2xl:pr-[60px]']/h3)[1]")
	private WebElement EventDiscount_TitleText;
	@FindBy(xpath = "(//*[@class='flex flex-col items-start gap-4 self-stretch lg:gap-6 2xl:pr-[60px]']/p)[1]")
	private WebElement EventDiscount_CopyText;
	@FindBy(xpath = "(//*[text()='Read more'])[1]")
	private WebElement EventDiscount_ReadMoreCTA;
	@FindBy(xpath = "(//div[@data-testid='progressbar-status']/p)[2]")
	private WebElement EventDiscount_ProgressbarCount;
	@FindBy(xpath = "(//div[@data-testid='progressbar-indicator']/div)[2]")
	private WebElement EventDiscount_ProgressbarIndicator;
	@FindBy(xpath = "(//*[@data-testid='prev-icon'])[2]")
	private WebElement EventDiscount_LeftArrow;
	@FindBy(xpath = "(//*[@data-testid='next-icon'])[2]")
	private WebElement EventDiscount_RightArrow;
	@FindBy(xpath = "(//*[@class='bg-cover bg-no-repeat bg-grey-600 w-full h-[340px] lg:shrink-0 lg:!w-[972px] lg:!w-min-[805px] 2xl:!w-min-[1283px] !h-[249px] !w-auto self-stretch !bg-center lg:!h-[400px] lg:max-w-full lg:!shrink-0 lg:!grow lg:!basis-0 2xl:!h-full'])[1]")
	private WebElement EventDiscount_Banner01;
	@FindBy(xpath = "(//*[@class='bg-cover bg-no-repeat bg-grey-600 w-full h-[340px] lg:shrink-0 lg:!w-[972px] lg:!w-min-[805px] 2xl:!w-min-[1283px] !h-[249px] !w-auto self-stretch !bg-center lg:!h-[400px] lg:max-w-full lg:!shrink-0 lg:!grow lg:!basis-0 2xl:!h-full'])[2]")
	private WebElement EventDiscount_Banner02;


	/*
	 * Group Discount
	 */
	@FindBy(xpath = "//*[text()='Group Discounts']")
	private WebElement GroupDiscounts_HeaderText;
	@FindBy(xpath = "//*[@data-testid='groupDiscountsContainer']")
	private WebElement GroupDiscounts_AllCards;

	@FindBy(xpath = "(//*[@class='block md:flex max-w-[350px] md:max-w-[888px]'])[1]")
	private WebElement GroupDiscounts_Card01;
	@FindBy(xpath = "(//*[@class='block md:flex max-w-[350px] md:max-w-[888px]'])[2]")
	private WebElement GroupDiscounts_Card02;
	@FindBy(xpath = "(//*[@class='block md:flex max-w-[350px] md:max-w-[888px]'])[1]")
	private WebElement GroupDiscounts_Card03;


	@FindBy(xpath = "(//*[@class='relative w-[350px] md:w-[294px] min1440:w-[280px] h-[200px] md:h-full']/span/img)[1]")
	private WebElement GroupDiscount_image01;
	@FindBy(xpath = "(//*[@class='relative w-[350px] md:w-[294px] min1440:w-[280px] h-[200px] md:h-full']/span/img)[2]")
	private WebElement GroupDiscount_image02;
	@FindBy(xpath = "(//*[@class='relative w-[350px] md:w-[294px] min1440:w-[280px] h-[200px] md:h-full']/span/img)[3]")
	private WebElement GroupDiscount_image03;


	@FindBy(xpath = "(//*[@class='md:p-[30px] py-8 px-5 w-[350px] md:w-[456px] bg-grey-200']/h3)[1]")
	private WebElement GroupDiscounts_titleText01;
	@FindBy(xpath = "(//*[@class='md:p-[30px] py-8 px-5 w-[350px] md:w-[456px] bg-grey-200']/h3)[2]")
	private WebElement GroupDiscounts_titleText02;
	@FindBy(xpath = "(//*[@class='md:p-[30px] py-8 px-5 w-[350px] md:w-[456px] bg-grey-200']/h3)[3]")
	private WebElement GroupDiscounts_titleText03;


	@FindBy(xpath = "(//*[@class='md:p-[30px] py-8 px-5 w-[350px] md:w-[456px] bg-grey-200']/p)[1]")
	private WebElement 	GroupDiscounts_description01;
	@FindBy(xpath = "(//*[@class='md:p-[30px] py-8 px-5 w-[350px] md:w-[456px] bg-grey-200']/p)[2]")
	private WebElement 	GroupDiscounts_description02;
	@FindBy(xpath = "(//*[@class='md:p-[30px] py-8 px-5 w-[350px] md:w-[456px] bg-grey-200']/p)[3]")
	private WebElement 	GroupDiscounts_description03;


	@FindBy(xpath = "(//*[@data-testid='groupDiscountsCardCTA'])[1]")
	private WebElement 	GroupDiscounts_Link01;
	@FindBy(xpath = "(//*[@data-testid='groupDiscountsCardCTA'])[2]")
	private WebElement 	GroupDiscounts_Link02;
	@FindBy(xpath = "(//*[@data-testid='groupDiscountsCardCTA'])[3]")
	private WebElement 	GroupDiscounts_Link03;


	/*
	 * Quick Links
	 */
	@FindBy(xpath = "//*[text()='Quick Links']")
	private WebElement 	QuickLinks_TitleText;
	@FindBy(xpath = "//*[@class='text-base leading-5 lg:text-xl lg:leading-6 not-italic font-normal font-arial text-leaf !text-grey-480']")
	private WebElement 	QuickLinks_CopyTex;


	@FindBy(xpath = "(//*[@class='relative h-[184px] md:h-[193px] xl:h-[224px] w-full'])[1]")
	private WebElement 	QuickLinks_Image01;
	@FindBy(xpath = "(//*[@class='relative h-[184px] md:h-[193px] xl:h-[224px] w-full'])[2]")
	private WebElement 	QuickLinks_Image02;


	@FindBy(xpath = "(//*[@class='flex py-[18px] px-5 md:py-8 md:px-5 2xl:p-8 gap-20 md:gap-4 items-center justify-between w-full self-stretch']/h5)[1]")
	private WebElement 	QuickLinks_Clickable_Title_link01;
	@FindBy(xpath = "(//*[@class='flex py-[18px] px-5 md:py-8 md:px-5 2xl:p-8 gap-20 md:gap-4 items-center justify-between w-full self-stretch']/h5)[2]")
	private WebElement 	QuickLinks_Clickable_Title_link02;


	@FindBy(xpath = "(//*[@class='flex py-[18px] px-5 md:py-8 md:px-5 2xl:p-8 gap-20 md:gap-4 items-center justify-between w-full self-stretch']/a)[1]")
	private WebElement 	QuickLinks_CaretCircleArrow01;
	@FindBy(xpath = "(//*[@class='flex py-[18px] px-5 md:py-8 md:px-5 2xl:p-8 gap-20 md:gap-4 items-center justify-between w-full self-stretch']/a)[2]")
	private WebElement 	QuickLinks_CaretCircleArrow02;



	/*
	 * Product Carousel section
	 */
	@FindBy(xpath = "(//*[@class='flex flex-col overflow-hidden bg-white py-10 pl-5 lg:flex-row lg:py-[120px] lg:pl-[60px]']/div/div/h3)[1]")
	private WebElement 	ProductCarousal_TitleText;
	@FindBy(xpath = "(//*[@class='flex flex-col overflow-hidden bg-white py-10 pl-5 lg:flex-row lg:py-[120px] lg:pl-[60px]']/div/div/p)[1]")
	private WebElement 	ProductCarousal_CopyText;
	@FindBy(xpath = "(//*[@class='flex flex-col overflow-hidden bg-white py-10 pl-5 lg:flex-row lg:py-[120px] lg:pl-[60px]']/div/div/a)[1]")
	private WebElement 	ProductCarousal_CTA;
	@FindBy(xpath = "(//*[@button-type='primary'])[8]")
	private WebElement 	ProductCarousal_CTAMobile;
	@FindBy(xpath = "(//*[@data-testid='next-icon'])[3]")
	private WebElement 	ProductCarousal_Count_ArrowRight_Left;
	@FindBy(xpath = "(//*[@data-testid='vertical-containers'])[1]")
	private WebElement 	ProductCarousal_Carousel00;
	@FindBy(xpath = "(//*[@data-testid='vertical-containers'])[2]")
	private WebElement 	ProductCarousal_Carousel01;
	@FindBy(xpath = "(//*[@data-testid='vertical-containers'])[3]")
	private WebElement 	ProductCarousal_Carousel02;
	@FindBy(xpath = "(//*[@data-testid='vertical-containers']/div/button)[1]")
	private WebElement 	ProductCarousal_AddToCart01;
	@FindBy(xpath = "(//*[@alt='product card'])[1]")  //(//*[@data-testid='vertical-containers']/div/span/img)[1]
	private WebElement 	ProductCarousal_product_Card;
	@FindBy(xpath = "(//div[@data-testid='progressbar-indicator'])[3]")
	private WebElement 	ProductCarousal_progressbar_indicator;


	/*
	 * C09 Banner Variant A
	 */
	@FindBy(xpath = "(//*[@class='grid gap-4 lg:gap-8']/p)[1]")
	private WebElement 	BannerC09VariantA_IconWithSmallText;

	@FindBy(xpath = "(//*[@class='gird-cols-1 grid overflow-hidden rounded-[6px] lg:grid-cols-10'])[1]")
	private WebElement 	BannerC09VariantA;

	@FindBy(xpath = "(//*[@class='flex relative bg-kief px-5 py-8 lg:px-[80px] lg:py-[120px] col-span-1 bg-cover lg:col-span-4 order-2']/div/span/img)[1]")
	private WebElement BannerC09VariantA_Image;

	@FindBy(xpath = "(//*[@class='grid gap-4 lg:gap-8']/h3)[1]")
	private WebElement 	BannerC09VariantA_TitleText;

	@FindBy(xpath = "(//*[@class='flex']/a)[1]")
	private WebElement 	BannerC09VariantA_CTA;


	/*
	 * C09 variant A "Text and primary Button"
	 */
	@FindBy(xpath = "(//*[@class='grid gap-4 lg:gap-8']/p)[2]")
	private WebElement 	BannerC09VariantAWithTextButton_IconWithSmallText;

	@FindBy(xpath = "(//*[@class='gird-cols-1 grid overflow-hidden rounded-[6px] lg:grid-cols-10'])[2]")
	private WebElement 	BannerC09VariantAWithTextButton;

	@FindBy(xpath = "(//*[@class='flex relative bg-kief px-5 py-8 lg:px-[80px] lg:py-[120px] col-span-1 bg-cover lg:col-span-4 order-2']/div/span/img)[2]")
	private WebElement BannerC09VariantAWithTextButton_Image;

	@FindBy(xpath = "(//*[@class='grid gap-4 lg:gap-8']/h3)[2]")
	private WebElement 	BannerC09VariantAWithTextButton_TitleText;

	@FindBy(xpath = "(//*[@class='grid gap-4 lg:gap-8']/p)[3]")
	private WebElement 	BannerC09VariantAWithTextButton_CopyText;

	@FindBy(xpath = "(//*[@class='flex']/a)[2]")
	private WebElement 	BannerC09VariantAWithTextButton_CTA;



	/*
	 * C09 variant B
	 */
	@FindBy(xpath = "(//*[@class='grid gap-4 lg:gap-8']/p)[5]")
	private WebElement BannerC09VariantB_IconWithSmallText;

	@FindBy(xpath = "(//*[@class='flex relative bg-kief px-5 py-8 lg:px-[80px] lg:py-[120px] col-span-1 bg-cover lg:col-span-4 order-2']/div/span/img)[3]")
	private WebElement BannerC09VariantB_Image;

	@FindBy(xpath = "(//*[@class='grid gap-4 lg:gap-8']/h3)[4]")
	private WebElement BannerC09VariantB_TitleText;

	@FindBy(xpath = "(//*[@class='flex']/a)[4]")
	private WebElement BannerC09VariantB_CTA;


	@FindBy(xpath = "(//*[@data-testid='deal-cards-list-slider']/div/div/div/div/div)[1]")
	private WebElement DealsCard00;
	@FindBy(xpath = "(//*[@data-testid='deal-cards-list-slider']/div/div/div/div/div)[2]")
	private WebElement DealsCard01;
	@FindBy(xpath = "(//*[@data-testid='deal-cards-list-slider']/div/div/div/div/div)[3]")
	private WebElement DealsCard02;
	@FindBy(xpath = "(//*[@data-testid='deal-cards-list-slider']/div/div/div/div/div)4]")
	private WebElement DealsCard03;


	public WebElement getDealsCard00() {
		return DealsCard00;
	}
	public WebElement getDealsCard01() {
		return DealsCard01;
	}
	public WebElement getDealsCard02() {
		return DealsCard02;
	}
	public WebElement getDealsCard03() {
		return DealsCard03;
	}
	public WebElement getEventDiscount_ProgressbarIndicator() {
		return EventDiscount_ProgressbarIndicator;
	}
	public WebElement getDeals_Cart() {
		return Deals_Cart;
	}

	public WebElement getBannerC09VariantB_IconWithSmallText() {
		return BannerC09VariantB_IconWithSmallText;
	}
	public WebElement getBannerC09Variant_Image() {
		return BannerC09VariantB_Image;
	}
	public WebElement getBannerC09Variant_TitleText() {
		return BannerC09VariantB_TitleText;
	}
	public WebElement getBannerC09VariantB_CTA() {
		return BannerC09VariantB_CTA;
	}
	public WebElement getBannerC09VariantAWithTextButton_IconWithSmallText() {
		return BannerC09VariantAWithTextButton_IconWithSmallText;
	}
	public WebElement getBannerC09VariantAWithTextButton() {
		return BannerC09VariantAWithTextButton;
	}
	public WebElement getBannerC09VariantAWithTextButton_Image() {
		return BannerC09VariantAWithTextButton_Image;
	}
	public WebElement getBannerC09VariantAWithTextButton_TitleText() {
		return BannerC09VariantAWithTextButton_TitleText;
	}
	public WebElement getBannerC09VariantAWithTextButton_CopyText() {
		return BannerC09VariantAWithTextButton_CopyText;
	}
	public WebElement getBannerC09VariantAWithTextButton_CTA() {
		return BannerC09VariantAWithTextButton_CTA;
	}
	public WebElement getBannerC09VariantA_CTA() {
		return BannerC09VariantA_CTA;
	}
	public WebElement getBannerC09VariantA_Image() {
		return BannerC09VariantA_Image;
	}
	public WebElement getBannerC09VariantA_TitleText() {
		return BannerC09VariantA_TitleText;
	}
	public WebElement getBannerC09VariantA() {
		return BannerC09VariantA;
	}
	public WebElement getBannerC09Variant_A_IconWithSmallText() {
		return BannerC09VariantA_IconWithSmallText;
	}
	public WebElement getProductCard() {
		return ProductCarousal_product_Card;
	}
	public WebElement getProductCarousalTitleText() {
		return ProductCarousal_TitleText;
	}
	public WebElement getProductCarousalCopyText() {
		return ProductCarousal_CopyText;
	}
	public WebElement getProductCarousalCTA() {
		return ProductCarousal_CTA;
	}
	public WebElement getProductCarousalCTAMobile() {
		return ProductCarousal_CTAMobile;
	}
	public WebElement getProductCarousal_Count_ArrowRight_Left() {
		return ProductCarousal_Count_ArrowRight_Left;
	}
	public WebElement getProductCarousalCarousel00() {
		return ProductCarousal_Carousel00;
	}
	public WebElement getProductCarousalCarousel01() {
		return ProductCarousal_Carousel01;
	}
	public WebElement getProductCarousalCarousel02() {
		return ProductCarousal_Carousel02;
	}
	public WebElement getProductCarousal_progressbarIndicator() {
		return ProductCarousal_progressbar_indicator;
	}

	public WebElement getQuickLinks_CaretCircleArrow01() {
		return QuickLinks_CaretCircleArrow01;
	}
	public WebElement getQuickLinks_CaretCircleArrow02() {
		return 	QuickLinks_CaretCircleArrow02;
	}
	public WebElement getQuickLinks_Clickable_Title_link01() {
		return QuickLinks_Clickable_Title_link01;
	}
	public WebElement getQuickLinks_Clickable_Title_link02() {
		return 	QuickLinks_Clickable_Title_link02;
	}
	public WebElement getQuickLinks_TitleText() {
		return QuickLinks_TitleText;
	}
	public WebElement getQuickLinks_CopyTex() {
		return 	QuickLinks_CopyTex;
	}
	public WebElement getQuickLinks_Image01() {
		return QuickLinks_Image01;
	}
	public WebElement getQuickLinks_Image02() {
		return 	QuickLinks_Image02;
	}
	public WebElement getGroupDiscount_GroupDiscounts_Link01() {
		return GroupDiscounts_Link01;
	}
	public WebElement getGroupDiscount_GroupDiscounts_Link02() {
		return GroupDiscounts_Link02;
	}
	public WebElement getGroupDiscount_GroupDiscounts_Link03() {
		return GroupDiscounts_Link03;
	}
	public WebElement getGroupDiscount_GroupDiscounts_description01() {
		return GroupDiscounts_description01;
	}
	public WebElement getGroupDiscount_GroupDiscounts_description02() {
		return GroupDiscounts_description02;
	}
	public WebElement getGroupDiscount_GroupDiscounts_description03() {
		return GroupDiscounts_description03;
	}
	public WebElement getGroupDiscount_GroupDiscounts_titleText01() {
		return GroupDiscounts_titleText01;
	}
	public WebElement getGroupDiscount_GroupDiscounts_titleText02() {
		return GroupDiscounts_titleText02;
	}
	public WebElement getGroupDiscount_GroupDiscounts_titleText03() {
		return GroupDiscounts_titleText03;
	}
	public WebElement getGroupDiscount_GroupDiscount_image01() {
		return GroupDiscount_image01;
	}
	public WebElement getGroupDiscount_GroupDiscount_image02() {
		return GroupDiscount_image02;
	}
	public WebElement getGroupDiscount_GroupDiscount_image03() {
		return GroupDiscount_image03;
	}
	public WebElement getGroupDiscount_GroupDiscounts_Card01() {
		return GroupDiscounts_Card01;
	}
	public WebElement getGroupDiscount_GroupDiscounts_Card02() {
		return GroupDiscounts_Card02;
	}
	public WebElement getGroupDiscount_GroupDiscounts_Card03() {
		return GroupDiscounts_Card03;
	}
	public WebElement getEventDiscount_GroupDiscounts_AllCards() {
		return GroupDiscounts_AllCards;
	}
	public WebElement getEventDiscount_EventDiscount_RightArrow() {
		return EventDiscount_RightArrow;
	}
	public WebElement getEventDiscount_EventDiscount_LeftArrow() {
		return EventDiscount_LeftArrow;
	}
	public WebElement getEventDiscount_EventDiscount_ProgressbarCount() {
		return EventDiscount_ProgressbarCount;
	}
	public WebElement getEventDiscount_Deal_ProgressbarCount() {
		return Deal_ProgressbarCount;
	}
	public WebElement getEventDiscount_HeadingText() {
		return EventDiscount_HeadingText;
	}
	public WebElement getEventDiscount_EventDiscount_Banner01() {
		return EventDiscount_Banner01;
	}
	public WebElement getEventDiscount_EventDiscount_Banner02() {
		return EventDiscount_Banner02;
	}
	public WebElement getEventDiscount_EventDiscount_TitleText() {
		return EventDiscount_TitleText;
	}
	public WebElement getEventDiscount_EventDiscount_CopyText() {
		return EventDiscount_CopyText;
	}
	public WebElement getEventDiscount_EventDiscount_ReadMoreCTA() {
		return EventDiscount_ReadMoreCTA;
	}
	public WebElement getGroupDiscounts_HeaderText() {
		return GroupDiscounts_HeaderText;
	}
	public WebElement getHeadingDealsText() {
		return headingDealsText;
	}
	public WebElement getShowingNumberOfNumberText() {
		return ShowingNumberOfNumberText;
	}
	public WebElement getDeal_ShowMoreCTA() {
		return Deal_ShowMoreCTA;
	}

	public WebElement getDeal_ShowLessCTA() {
		return Deal_ShowMoreCTA;
	}
	public WebElement getCopyTextDeals01() {
		return CopyTextDeals01;
	}

	public WebElement getCopyTextDeals01Mobile() {
		return CopyTextDeals01Mobile;
	}
	public WebElement getCopyTextDeals01_1() {
		return CopyTextDeals01_1;
	}

	public WebElement getCopyTextDeals01_1Mobile() {
		return CopyTextDeals01_1Mobile;
	}
	public WebElement getCopyTextDeals02() {
		return CopyTextDeals02;
	}

	public WebElement getCopyTextDeals02Mobile() {
		return CopyTextDeals02Mobile;
	}
	public WebElement getCopyTextDeals02_2() {
		return CopyTextDeals02_2;
	}

	public WebElement getCopyTextDeals02_2Mobile() {
		return CopyTextDeals02_2Mobile;
	}
	public WebElement getCopyTextDeals03() {
		return CopyTextDeals03;
	}

	public WebElement getCopyTextDeals03Mobile() {
		return CopyTextDeals03Mobile;
	}
	public WebElement getCopyTextDeals03_3() {
		return CopyTextDeals03_3;
	}

	public WebElement getCopyTextDeals03_3Mobile() {
		return CopyTextDeals03_3Mobile;
	}
	public WebElement getCopyTextDeals04() {
		return CopyTextDeals04;
	}

	public WebElement getCopyTextDeals04Mobile() {
		return CopyTextDeals04Mobile;
	}
	public WebElement getCopyTextDeals04_4() {
		return CopyTextDeals04_4;
	}

	public WebElement getCopyTextDeals04_4Mobile() {
		return CopyTextDeals04_4Mobile;
	}
	public WebElement getHeadingDealsImage01() {
		return headingDealsImage01;
	}
	public WebElement getHeadingDealsImage02() {
		return headingDealsImage02;
	}
	public WebElement getHeadingDealsImage03() {
		return headingDealsImage03;
	}
	public WebElement getHeadingDealsImage04() {
		return headingDealsImage04;
	}
	public WebElement getTitleTextDeals01() {
		return TitleTextDeals01;
	}

	public WebElement getTitleTextDeals01Mobile() {
		return TitleTextDeals01Mobile;
	}
	public WebElement getTitleTextDeals02() {
		return TitleTextDeals02;
	}
	public WebElement getTitleTextDeals02Mobile() {
		return TitleTextDeals02Mobile;
	}
	public WebElement getTitleTextDeals03Mobile() {
		return TitleTextDeals03Mobile;
	}
	public WebElement getTitleTextDeals03() {
		return TitleTextDeals03;
	}
	public WebElement getTitleTextDeals04Mobile() {
		return TitleTextDeals04Mobile;
	}
	public WebElement getTitleTextDeals04() {
		return TitleTextDeals04;
	}
	public WebElement getDispensaries_FirstDispensaryList() {
		return Dispensaries_FirstDispensaryList;
	}
	public WebElement getDispensaryLocationScroll() {
		return DispensaryLocationScroll;
	}
	public WebElement getMap() {
		return Map;
	}

	public WebElement getMapViewCTA() {
		return MapView;
	}

	public WebElement getListView() {
		return ListView;
	}
	public WebElement getLocationFirst() {
		return Location01;
	}
	public WebElement getLocationSecond() {
		return Location02;
	}
	public WebElement getDispensaryName() {
		return DispensaryName;
	}
	public WebElement getPhoneNumberWithIcon() {
		return PhoneNumberWithIcon;
	}
	public WebElement getStoreHours01() {
		return StoreHours01;
	}
	public WebElement getPhoneNumberWithArrowDown() {
		return StorHoursArrowDown01;
	}
	public WebElement getPhoneNumber01() {
		return PhoneNumber01;
	}
	public WebElement getAdderss01() {
		return Adderss01;
	}
	public WebElement getContactUs_CTA01() {
		return ContactUs_CTA01;
	}
	public WebElement getLocationNameWithIcon() {
		return LocationNameWithIcon;
	}
	public WebElement getDispensaryContactUsCTA() {
		return Dispensary_ContactUsCTA;
	}
	public WebElement getShopThisDispensaryCTA() {
		return ShopThisDispensaryCTA;
	}
	public WebElement getDispensary_CloseCTA() {
		return Dispensary_CloseCTA;
	}
	public WebElement getDispensariesFirstSection() {
		return Dispensaries_FirstSection;
	}
	public WebElement getDispensariesSecondSection() {
		return Dispensaries_SecondSection;
	}
	public WebElement getDispensariesLocation() {
		return DispensariesLocation;
	}
	public WebElement getDispensariesInIllinoisText() {
		return DispensariesInIllinois_Text;
	}
	public WebElement getDispensaries_Question001() {
		return Dispensaries_Question001;
	}
	public WebElement getDispensaries_Question002() {
		return Dispensaries_Question002;
	}
	public WebElement getDispensaries_Question003() {
		return Dispensaries_Question003;
	}
	public WebElement getTitleText() {
		return TitleText;
	}
	public WebElement getCopyText() {
		return CopyText;
	}
	public WebElement getHeroImage() {
		return HeroImage;
	}
	public WebElement getRISEDispensaryMundeleinText() {
		return RISEDispensaryMundelein_Text;
	}
	public WebElement getBreadcrumb_Mundelein() {
		return Breadcrumb_Mundelein;
	}
	public WebElement getBreadcrumb_MundeleinMobile() {
		return Breadcrumb_MundeleinMobile;
	}








	public void ClickOnIllinoisBreadcrumb() {
		try {
			clickOn(Illinois_Breadcrumb);
			Logger.log("Clicked on Click On Illinois Breadcrumb");
		} catch (Exception e) {
			Logger.log("Didn't Click On Illinois Breadcrumb");
		}
	}

	public void ClickOnIllinoisBreadcrumbMobile() {
		try {
			clickOn(Illinois_BreadcrumbMobile);
			Logger.log("Clicked on Click On Illinois Breadcrumb");
		} catch (Exception e) {
			Logger.log("Didn't Click On Illinois Breadcrumb");
		}
	}


	public void ClickOnFirstLocation() {
		try {
			clickOn(Location01);
			Logger.log("Clicked on Click On Illinois Breadcrumb");
		} catch (Exception e) {
			Logger.log("Didn't Click On Illinois Breadcrumb");
		}
	}

	public void ClickOnSecondLocation() {
		try {
			clickOn(Location02);
			Logger.log("Clicked on Click On Illinois Breadcrumb");
		} catch (Exception e) {
			Logger.log("Didn't Click On Illinois Breadcrumb");
		}
	}

	public void ClickOnFirstAccordion() {
		try {
			jsClick(Dispensaries_Question001);
			Logger.log("Clicked on 1st Accordion");
		} catch (Exception e) {
			Logger.log("Didn't Click On 1st Accordion");
		}
	}

	public void ClickOnFirstPlusIcon() {
		try {
			jsClick(Dispensaries_Question_PlusIcon01);
			Logger.log("Clicked on 1st - Icon");
		} catch (Exception e) {
			Logger.log("Didn't Click On 1st - Icon");
		}
	}

	public void ClickOnFirstMinusIcon() {
		try {
			jsClick(Dispensaries_Question_PlusIcon01);
			Logger.log("Clicked on 1st - Icon");
		} catch (Exception e) {
			Logger.log("Didn't Click On 1st  - Icon");
		}
	}


	public void ClickOnSecondPlusIcon() {
		try {
			jsClick(Dispensaries_Question_PlusIcon02);
			Logger.log("Clicked on 2nd - Icon");
		} catch (Exception e) {
			Logger.log("Didn't Click On 2nd - Icon");
		}
	}

	public void ClickOnSecondMinusIcon() {
		try {
			jsClick(Dispensaries_Question_PlusIcon02);
			Logger.log("Clicked on 2nd - Icon");
		} catch (Exception e) {
			Logger.log("Didn't Click On 2nd  - Icon");
		}
	}

	public void ClickOnSecondAccordion() {
		try {
			jsClick(Dispensaries_Question002);
			Logger.log("Clicked on 2nd Accordion");
		} catch (Exception e) {
			Logger.log("Didn't Click On 2nd Accordion");
		}
	}

	public void ClickOnShopThisDispensaryCTA() {
		try {
			clickOn(ShopThisDispensaryCTA);
			Logger.log("Clicked on Shop This Dispensary CTA");
		} catch (Exception e) {
			Logger.log("Didn't Click On Shop This Dispensary CTA");
		}
	}

	public void ClickOnContactUs_CTA01() {
		try {
			clickOn(ContactUs_CTA01);
			Logger.log("Clicked on Contact Us CTA");
		} catch (Exception e) {
			Logger.log("Didn't Click On Contact us CTA");
		}
	}

	public void ClickOnContactUsOnLocation01() {
		try {
			clickOn(Dispensary_ContactUsCTA);
			Logger.log("Clicked on Contact Us CTA");
		} catch (Exception e) {
			Logger.log("Didn't Click On Contact us CTA");
		}
	}
	public void ClickOnDispensaryCloseCTA() {
		try {
			clickOn(Dispensary_CloseCTA);
			Logger.log("Clicked on Close CTA in Dispensary Location");
		} catch (Exception e) {
			Logger.log("Didn't Click On Close CTA in Dispensary Location");
		}
	}

	public void ClickOnDealShowMoreCTA() {
		try {
			clickOn(Deal_ShowMoreCTA);
			Logger.log("Clicked on Deal ShowMore CTA");
		} catch (Exception e) {
			Logger.log("Didn't Click On Deal ShowMore CTA");
		}
	}
	public void ClickOnDealShowLessCTA() {
		try {
			clickOn(Deal_ShowMoreCTA);
			Logger.log("Clicked on Deal ShowLess CTA");
		} catch (Exception e) {
			Logger.log("Didn't Click On Deal ShowLess CTA");
		}
	}


	public void ClickOnDealsCart01() {
		try {
			clickOn(headingDealsCart01);
			Logger.log("Clicked on Deal Cart");
		} catch (Exception e) {
			Logger.log("Didn't Click On Deal Cart");
		}
	}

	public void ClickOnDealsCart01Mobile() {
		try {
			clickOn(headingDealsCart01Mobile);
			Logger.log("Clicked on Deal Cart");
		} catch (Exception e) {
			Logger.log("Didn't Click On Deal Cart");
		}
	}

	public void ClickOnEventDiscountReadMoreCTA() {
		try {
			clickOn(EventDiscount_ReadMoreCTA);
			Logger.log("Clicked on Event Discount ReadMore CTA");
		} catch (Exception e) {
			Logger.log("Didn't Click On Event Discount ReadMore CTA");
		}
	}

	public void ClickOnEventDiscountRightArrow() {
		try {
			clickOn(EventDiscount_RightArrow);
			Logger.log("Clicked on Right Arrow");
		} catch (Exception e) {
			Logger.log("Didn't Click On Right Arrow");
		}
	}

	public void ClickOnEventDiscountLeftArrow() {
		try {
			clickOn(EventDiscount_LeftArrow);
			Logger.log("Clicked on Left Arrow");
		} catch (Exception e) {
			Logger.log("Didn't Click On Left Arrow");
		}
	}

	public void ClickOnDealRightArrow() {
		try {
			clickOn(Deal_RightArrow);
			Logger.log("Clicked on Right Arrow");
		} catch (Exception e) {
			Logger.log("Didn't Click On Right Arrow");
		}
	}

	public void ClickOnDealLeftArrow() {
		try {
			clickOn(Deal_LeftArrow);
			Logger.log("Clicked on Left Arrow");
		} catch (Exception e) {
			Logger.log("Didn't Click On Left Arrow");
		}
	}

	public void ClickOnDealLeftArrow00() {
		try {
//			tapOn(Deal_LeftArrow);
			Logger.log("Clicked on Left Arrow");
		} catch (Exception e) {
			Logger.log("Didn't Click On Left Arrow");
		}
	}

	public void ClickOnGroupDiscounts_Link01() {
		try {
			clickOn(GroupDiscounts_Link01);
			Logger.log("Clicked on Link01");
		} catch (Exception e) {
			Logger.log("Didn't Click On Link1");
		}
	}

	public void getClickOnCaretCircleArrow01() {
		try {
			clickOn(QuickLinks_CaretCircleArrow01);
			Logger.log("Clicked on Caret Circle Arrow01");
		} catch (Exception e) {
			Logger.log("Didn't Click On Caret Circle Arrow01");
		}
	}

	public void ClickOnDispensaries_FirstAccordionSection() {
		try {
			clickOn(Dispensaries_FirstSection);
			Logger.log("Clicked on First Accordion Section");
		} catch (Exception e) {
			Logger.log("Didn't Click On First Accordion Section");
		}
	}

	public void ClickOnQuickLinks_Clickable_Title_link01() {
		try {
			clickOn(QuickLinks_Clickable_Title_link01);
			Logger.log("Clicked on Title");
		} catch (Exception e) {
			Logger.log("Didn't Click On 2nd Accordion Section");
		}
	}

	public void ClickOnGroupDiscountsTitleText01() {
		try {
			clickOn(GroupDiscounts_titleText01);
			Logger.log("Clicked on Title Text");
		} catch (Exception e) {
			Logger.log("Didn't Click On Title Tex");
		}
	}

	public void ClickOnProductCarousal_CTA() {
		try {
			clickOn(ProductCarousal_CTA);
			Logger.log("Clicked on Product Carousal CTA");
		} catch (Exception e) {
			Logger.log("Didn't Click On Product Carousal CTA");
		}
	}

	public void ClickOnProductCarousal_CTAMobile() {
		try {
			clickOn(ProductCarousal_CTAMobile);
			Logger.log("Clicked on Product Carousal CTA");
		} catch (Exception e) {
			Logger.log("Didn't Click On Product Carousal CTA");
		}
	}

	public void ClickOnProductCard01() {
		try {
			clickOn(ProductCarousal_product_Card);
			Logger.log("Clicked on Product Card");
		} catch (Exception e) {
			Logger.log("Didn't Click On Product Card");
		}
	}

	public void ClickOnBannerC09VariantA_CTA() {
		try {
			clickOn(BannerC09VariantA_CTA);
			Logger.log("Clicked on BannerC09 Variant A CTA");
		} catch (Exception e) {
			Logger.log("Didn't Click On BannerC09 Variant A CTA");
		}
	}

	public void ClickOnBannerC09VariantAWithTextButton_CTA() {
		try {
			clickOn(BannerC09VariantAWithTextButton_CTA);
			Logger.log("Clicked on BannerC09 Variant A with text CTA");
		} catch (Exception e) {
			Logger.log("Didn't Click On BannerC09 Variant A with text CTA");
		}
	}
	public void ClickOnBannerC09VariantB_CTA() {
		try {
			clickOn(BannerC09VariantB_CTA);
			Logger.log("Clicked on BannerC09 Variant B CTA");
		} catch (Exception e) {
			Logger.log("Didn't Click On BannerC09 Variant B CTA");
		}
	}
	public void ClickOnMapViewCTA() {
		try {
			clickOn(MapView);
			Logger.log("Clicked on MapView CTA");
		} catch (Exception e) {
			Logger.log("Didn't Click On MapViewB CTA");
		}
	}




}