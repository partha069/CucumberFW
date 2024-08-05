package pom.gti;

import com.resuableMethods.CommonAction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class T11_DispensaryPage extends CommonAction {
    public T11_DispensaryPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    /*
     * Element
     */
    /*
     * Mobile Header
     */
    @FindBy(xpath = "//button[ @data-testid='extended-menu-button']")
    private WebElement mobileHamburgerMenuCTA;
    @FindBy(xpath = "//div[ @data-testid='extended-menu']/child::ul/child::li")
    private List<WebElement> mobileMenuOptionList;
    @FindBy(xpath = "//div[@data-testid='header-dispensaries']/child::div/child::ul/child::li")
    private List<WebElement> dispensaryStateList;
    @FindBy(xpath = "//button[ @data-testid='extended-menu-button']")
    private WebElement mobileCLoseIcon;
    /*
     * Hero Banner
     */
    @FindBy(xpath = "//header[@data-testid='header-wrapper']/descendant::a[text()='Dispensaries']")
    private WebElement dispensariesOptionGlobalHeader;
    @FindBy(xpath = "//header[@data-testid='header-wrapper']/descendant::a[text()='Illinois']")
    private WebElement dispensaryStateIllinois;
    @FindBy(xpath = "//div[@data-testid='header-dispensaries']/descendant::a[text()='RISE Dispensary Mundelein']")
    private WebElement riseDispensaryMundeleinOption;
    @FindBy(xpath = "//h1[text()='RISE Dispensary Mundelein']")
    private WebElement riseDispensaryMundeleinHeader;
    @FindBy(xpath = "//h1[text()='RISE Dispensary Mundelein']/following-sibling::p[@data-testid='description']")
    private WebElement riseDispensaryMundeleinCopyText;
    @FindBy(xpath = "//h1[contains(text(),'RISE Dispensary Mundelein')]/parent::div/parent::div")
    private WebElement dispensaryHeroBanner;
    @FindBy(xpath = "//nav[@aria-label='breadcrumb']")
    private WebElement dispensaryBreadcrumb;
    @FindBy(xpath = "//div[@class='react-stacked-center-carousel ']/parent::*/parent::div/following-sibling::div[2]/child::*/child::*")
    private WebElement imageCarouselLeftArrow;
    @FindBy(xpath = "(//*[@data-testid='next-icon'])[1]")
    private WebElement imageCarouselRightArrow;
    @FindBy(xpath = "//div[@class='react-stacked-center-carousel ']/child::div")
    private List<WebElement> imageCarouselHeroBanner;
    @FindBy(xpath = "//a[@data-testid='menuButton']")
    private List<WebElement> heroBannerMenuCTAs;
    @FindBy(xpath = "//div[@class='react-stacked-center-carousel ']/parent::*/parent::div/following-sibling::div[1]/child::div")
    private WebElement heroBannerProgressbar;

    /*
     * About this dispensary
     */
    @FindBy(xpath = "//h3[text()='About RISE Cannabis Dispensary Mundelein']/parent::div/parent::div/parent::div")
    private WebElement aboutThisDispensarySection;
    @FindBy(xpath = "//h3[text()='About RISE Cannabis Dispensary Mundelein']")
    private WebElement aboutThisDispensaryHeader;
    @FindBy(xpath = "//h3[text()='About RISE Cannabis Dispensary Mundelein']/following-sibling::p")
    private WebElement aboutThisDispensaryCopyText;
    @FindBy(xpath = "//p[text()='Opening hours']")
    private WebElement openingHoursText;
    @FindBy(xpath = "//p[text()='Opening hours']/parent::div/parent::div/preceding-sibling::div")
    private WebElement clockImage;
    @FindBy(xpath = "//p[text()='Opening hours']/parent::div/child::*[1]")
    private WebElement clockIcon;
    @FindBy(xpath = "//div[contains(@class,'dayContainer')]/div")
    private List<WebElement> listOfDays;
    @FindBy(xpath = "//div[contains(@class,'dayContainer')]/div[1]")
    private WebElement currentDayText;
    @FindBy(xpath = "//div[contains(@class,'dayContainer')]/div[1]/p[1]")
    private WebElement currentDayOnly;
    @FindBy(xpath = "//div[contains(@class,'dayContainer')]/div[1]/p[2]")
    private WebElement currentHours;
    @FindBy(xpath = "//div[contains(@class,'dayContainer')]/parent::div/following-sibling::div[2]/p")
    private WebElement phoneInfo;
    @FindBy(xpath = "//div[contains(@class,'dayContainer')]/parent::div/following-sibling::div[2]/*[1]")
    private WebElement phoneIcon;
    @FindBy(xpath = "//div[contains(@class,'dayContainer')]/parent::div/following-sibling::div[2]/a")
    private WebElement callNowCTA;
    @FindBy(xpath = "//div[contains(@class,'dayContainer')]/parent::div/following-sibling::div[3]/child::div/p")
    private WebElement addressText;
    @FindBy(xpath = "//div[contains(@class,'dayContainer')]/parent::div/following-sibling::div[3]/*[1]")
    private WebElement addressMapIcon;
    @FindBy(xpath = "//div[contains(@class,'dayContainer')]/parent::div/following-sibling::div[3]/child::div/a")
    private WebElement addressMapCTA;
    @FindBy(xpath = "//div[contains(@class,'dayContainer')]/parent::div/following-sibling::div[4]/a")
    private WebElement contactUsCTA;
    @FindBy(xpath = "//div[contains(@class,'dayContainer')]/parent::div/following-sibling::div[2]/a/child::*")
    private WebElement callNowCaret;
    @FindBy(xpath = "//div[contains(@class,'dayContainer')]/parent::div/following-sibling::div[4]/child::a/child::*")
    private WebElement contactUsCaret;
    @FindBy(xpath = "//div[contains(@class,'dayContainer')]/parent::div/following-sibling::div[3]/child::div/a/child::*")
    private WebElement addressMapCaret;
    @FindBy(xpath = "//h3[text()='What can we help you with?']")
    private WebElement contactUsPageHeader;
    @FindBy(xpath = "//div[contains(@class,'dayContainer')]/parent::div/following-sibling::div[1]/div")
    private WebElement dispensaryAdditionalInfo;
    @FindBy(xpath = "//div[contains(@class,'dayContainer')]/parent::div/following-sibling::div[1]/p")
    private WebElement dispensaryAdditionalInfoCopyText;
    /*
     * Mobile About this dispensary
     */
    @FindBy(xpath = "//button[contains(text(),'Read More')]")
    private WebElement aboutDispensaryReadMoreCTA;
    @FindBy(xpath = "//button[contains(text(),'Read Less')]")
    private WebElement aboutDispensaryReadLessCTA;

    @FindBy(xpath = "//button[contains(text(),'Read More')]/parent::div/parent::div/following-sibling::div/child::*[1]")
    private WebElement mobileClockImage;
    @FindBy(xpath = "//button[contains(text(),'Read More')]/parent::div/parent::div/following-sibling::div/child::div[2]/child::div/child::div/following-sibling::button")
    private WebElement aboutDispensaryHourDropDownCTA;
    /*
     * Dispensary Tabs
     */
    @FindBy(xpath = "//h2[text()='Visiting Mundelein']/parent::div/parent::div")
    private WebElement dispensaryTabSection;
    @FindBy(xpath = "//h2[text()='Visiting Mundelein']")
    private WebElement dispensaryTabHeader;
    @FindBy(xpath = "//h2[text()='Visiting Mundelein']/following-sibling::div/*")
    private List<WebElement> dispensaryTabList;
    @FindBy(xpath = "//h2[text()='Visiting Mundelein']/following-sibling::div/h4[2]")
    private WebElement promotionTab;
    @FindBy(xpath = "//h2[text()='Visiting Mundelein']/following-sibling::div/h4[1]")
    private WebElement amenitiesTab;
    @FindBy(xpath = "//h2[text()='Visiting Mundelein']/following-sibling::div/*[1]/parent::div/parent::div/following-sibling::div[@id='content_container']/child::div/child::div[1]/child::div/child::h3")
    private WebElement amenitiesHeader;
    @FindBy(xpath = "//h2[text()='Visiting Mundelein']/following-sibling::div/*[1]/parent::div/parent::div/following-sibling::div[@id='content_container']/child::div/child::div[1]/child::div/child::p")
    private WebElement amenitiesCopyText;
    @FindBy(xpath = "//h2[text()='Visiting Mundelein']/following-sibling::div/*[1]/parent::div/parent::div/following-sibling::div[@id='content_container']/child::div/child::div[2]/child::div[*]/child::div/span")
    private List<WebElement> amenitiesIconList;
    @FindBy(xpath = "//h2[text()='Visiting Mundelein']/following-sibling::div/*[1]/parent::div/parent::div/following-sibling::div[@id='content_container']/child::div/child::div[2]/child::div[*]/child::div/following-sibling::p")
    private List<WebElement> amenitiesTextList;
    @FindBy(xpath = "//h2[text()='Visiting Mundelein']/following-sibling::div/*[1]/parent::div/parent::div/following-sibling::div[@id='content_container']/child::div/child::div[2]/child::div[*]/child::div/child::div[@data-testid='tooltip-icon-box']")
    private List<WebElement> amenitiesToolTipList;
    @FindBy(xpath = "//h2[text()='Visiting Mundelein']/following-sibling::div/child::div/parent::div/parent::div/following-sibling::div/child::div/child::div/child::div[1]/child::div/h3")
    private WebElement dealsTabHeader;
    @FindBy(xpath = "//h2[text()='Visiting Mundelein']/following-sibling::div/div[*]")
    private WebElement promotionTabHighlighted;
    @FindBy(xpath = "//h2[text()='Visiting Mundelein']/following-sibling::div/child::div/parent::div/parent::div/following-sibling::div/child::div/child::div/child::div[1]/child::div/h3")
    private WebElement dealsTabCopytext;
    @FindBy(xpath = "//h2[text()='Visiting Mundelein']/following-sibling::div/child::div/parent::div/parent::div/following-sibling::div/child::div/child::div/child::div[2]")
    private WebElement dealTabImage;
    @FindBy(xpath = "//div[@id='promotion_description_container']/following-sibling::button[@button-type='secondary']")
    private WebElement dealTabCTA;
    @FindBy(xpath = "//h2[text()='Visiting Mundelein']/following-sibling::div/child::div/parent::div/parent::div/following-sibling::div/child::div/child::div/child::div[1]/child::div/child::p")
    private WebElement dealStartDateAndEndDateAndIcon;
    /*
     * Mobile Dispensary tab
     */
    @FindBy(xpath = "//h2[text()='Visiting Mundelein']/following-sibling::div/child::div/child::div/child::div/child::div/child::div[*]/child::div[*]/child::*")
    private List<WebElement> mobileDispensaryTabList;
    /*
     * Dispensary Review
     */
    @FindBy(xpath = "//h2[text()='What people are saying']/parent::div/parent::div")
    private WebElement dispensaryReviewSection;
    @FindBy(xpath = "//h2[text()='What people are saying']")
    private WebElement dispensaryReviewHeader;
    @FindBy(xpath = "//h2[text()='What people are saying']/parent::div/child::div/child::div[1]/p")
    private WebElement dispensaryReviewCount;
    @FindBy(xpath = "//*[2][@data-testid='next-icon']")
    private WebElement reviewRightClickButton;
    @FindBy(xpath = "//*[2][@data-testid='next-icon']/preceding-sibling::*")
    private WebElement reviewLeftClickButton;
    @FindBy(xpath = "//h2[text()='What people are saying']/parent::div/child::div/child::div[2]/div")
    private WebElement reviewProgressBar;
    @FindBy(xpath = "//h2[text()='What people are saying']/parent::div/following-sibling::div/child::div/child::div/child::div/child::div/child::div/child::div/child::div/child::div[*]//child::div/child::div/child::div")
    private List<WebElement> reviewStarList;
    @FindBy(xpath = "//h2[text()='What people are saying']/parent::div/following-sibling::div/child::div/child::div/child::div/child::div/child::div/child::div/child::div/child::div[*]/following-sibling::div/*[1]")
    private List<WebElement> reviewQuotationList;
    @FindBy(xpath = "//h2[text()='What people are saying']/parent::div/following-sibling::div/child::div/child::div/child::div/child::div/child::div/child::div/child::div/child::div[*]/following-sibling::div/*[2]")
    private List<WebElement> reviewCommentList;
    @FindBy(xpath = "//h2[text()='What people are saying']/parent::div/following-sibling::div/child::div/child::div/child::div/child::div/child::div/child::div/child::div/child::div[*]/following-sibling::div/*[3]")
    private List<WebElement> reviewCustomerNameList;
    /*
     * Mobile Dispensary Review
     */
    @FindBy(xpath = "//div[@data-testid='progressbar-status']")
    private WebElement mobileReviewCount;
    @FindBy(xpath = "//div[2][@data-testid='progressbar-indicator']")
    private WebElement mobileProgressbar;

    /*
     * Quick Links
     */
    @FindBy(xpath = "//h3[text()='MORE INFORMATION']/parent::div/parent::div")
    private WebElement quickLinkSection;
    @FindBy(xpath = "//h3[text()='MORE INFORMATION']/parent::div/following-sibling::div/child::div")
    private List<WebElement> quickLinkBannerList;
    @FindBy(xpath = "//h3[text()='MORE INFORMATION']")
    private WebElement quickLinksTitleText;
    @FindBy(xpath = "//h3[text()='MORE INFORMATION']/following-sibling::p")
    private WebElement quickLinksCopyText;
    @FindBy(xpath = "//h3[text()='MORE INFORMATION']/parent::div/following-sibling::div/child::div[*]/child::div[1]")
    private List<WebElement> quickLinksImageList;
    @FindBy(xpath = "//h3[text()='MORE INFORMATION']/parent::div/following-sibling::div/child::div[*]/child::div[2]/h5")
    private List<WebElement> quickLinksTitleLinkCardList;
    @FindBy(xpath = "//h3[text()='MORE INFORMATION']/parent::div/following-sibling::div/child::div/child::div[2]/child::a")
    private List<WebElement> quickLinkSArrowIconList;

    /*
     * Quick Links >>> This Section we need to delete once we will get Test ID "Virginia"
     */
    @FindBy(xpath = "//*[text()='More Information']/parent::div/parent::div")
    private WebElement quickLinkSectionVirginia;
    @FindBy(xpath = "//*[text()='More Information']/parent::div/following-sibling::div/child::div")
    private List<WebElement> quickLinkBannerListVirginia;
    @FindBy(xpath = "//*[text()='More Information']")
    private WebElement quickLinksTitleTextVirginia;
    @FindBy(xpath = "//*[text()='More Information']/following-sibling::p")
    private WebElement quickLinksCopyTextVirginia;
    @FindBy(xpath = "//*[text()='More Information']/parent::div/following-sibling::div/child::div[*]/child::div[1]")
    private List<WebElement> quickLinksImageListVirginia;
    @FindBy(xpath = "//*[text()='More Information']/parent::div/following-sibling::div/child::div[*]/child::div[2]/h5")
    private List<WebElement> quickLinksTitleLinkCardListVirginia;
    @FindBy(xpath = "//*[text()='More Information']/parent::div/following-sibling::div/child::div/child::div[2]/child::a")
    private List<WebElement> quickLinkSArrowIconListVirginia;


    /*
     * RISE Mundelein Lounge page
     */
    @FindBy(xpath = "//h1[text()='RISE Mundelein Lounge']")
    private WebElement riseMundeleinLoungePageHeader;
    /*
     * Faq Section
     */
    @FindBy(xpath = "//p[text()='How can we help you?']/parent::div/parent::div")
    private WebElement dispensaryFaqSection;
    @FindBy(xpath = "//p[text()='How can we help you?']/parent::div/parent::div/child::div[2]/child::div[1]")
    private WebElement dispensaryFaqAccordion;
    @FindBy(xpath = "//p[text()='How can we help you?']/parent::div/parent::div/child::div[2]/child::div[1]/child::div")
    private List<WebElement> accordionQuestionList;
    @FindBy(xpath = "//p[text()='How can we help you?']/following-sibling::div/child::div[*]/child::button/child::span//child::div")
    private List<WebElement> accordionPlusIconList;
    @FindBy(xpath = "//p[text()='How can we help you?']/following-sibling::div/child::div[*]/child::button")
    private List<WebElement> accordionFaqButtonList;
    @FindBy(xpath = "//p[text()='How can we help you?']/following-sibling::div/child::div[*]/child::button/following-sibling::div")
    private List<WebElement> accordionFaqAnswerList;
    @FindBy(xpath = "//p[contains(text(),'Showing')]")
    private WebElement accordionShowingText;

    @FindBy(xpath = "//p[contains(text(),'Showing')]/following-sibling::button[@button-type='secondary']")
    private WebElement showMoreCTA;
    /*
     * Dispensaries Nearby
     */
    @FindBy(xpath = "//h2[text()='Dispensaries Nearby']/parent::div/parent::div")
    private WebElement dispensaryNearbySection;
    @FindBy(xpath = "//h2[text()='Dispensaries Nearby']/parent::div/following-sibling::div")
    private List<WebElement> dispensaryNearbyLocationList;
    @FindBy(xpath = "//h2[text()='Dispensaries Nearby']")
    private WebElement dispensaryNearbyTitle;
    @FindBy(xpath = "//h2[text()='Dispensaries Nearby']/parent::div/following-sibling::div[*]/child::div[1]")
    private List<WebElement> dispensaryNearByImageList;
    @FindBy(xpath = "//h2[text()='Dispensaries Nearby']/parent::div/following-sibling::div[*]/div[2]/child::h3")
    private List<WebElement> dispensaryNearbyDispensaryNameList;
    @FindBy(xpath = "//h2[text()='Dispensaries Nearby']/parent::div/following-sibling::div[*]/div[2]/child::div[1]/p[1]")
    private List<WebElement> dispensaryNearbyHourList;
    @FindBy(xpath = "//h2[text()='Dispensaries Nearby']/parent::div/following-sibling::div[*]/div[2]/child::div[1]/p[1]/*")
    private List<WebElement> dispensaryNearbyHourIcon;
    @FindBy(xpath = "//h2[text()='Dispensaries Nearby']/parent::div/following-sibling::div[*]/div[2]/child::div[1]/p[2]")
    private List<WebElement> dispensaryNearbyPhoneList;
    @FindBy(xpath = "//h2[text()='Dispensaries Nearby']/parent::div/following-sibling::div[*]/div[2]/child::div[1]/p[2]/*")
    private List<WebElement> dispensaryNearbyPhoneIconList;
    @FindBy(xpath = "//h2[text()='Dispensaries Nearby']/parent::div/following-sibling::div[*]/div[2]/child::div[1]/p[3]")
    private List<WebElement> dispensaryNearbyAddressList;
    @FindBy(xpath = "//h2[text()='Dispensaries Nearby']/parent::div/following-sibling::div[*]/div[2]/child::div[1]/p[3]/*")
    private List<WebElement> dispensaryNearbyAddressIconList;
    @FindBy(xpath = "//h2[text()='Dispensaries Nearby']/parent::div/following-sibling::div[*]/div[2]/child::a")
    private List<WebElement> dispensaryNearbyViewDispensaryCTAList;
    @FindBy(xpath = "//h2[text()='Dispensaries Nearby']/parent::div/following-sibling::div[*]/div[2]/child::a/child::*")
    private List<WebElement> dispensaryNearbyViewCTACaretIconList;
    /*
     * Mobile Dispensary Nearby Section
     */
    @FindBy(xpath = "//h2[text()='Dispensaries Nearby']/parent::div/following-sibling::div[*]/div/h3")
    private List<WebElement> mobileDispensaryNameList;
    @FindBy(xpath = "//h2[text()='Dispensaries Nearby']/parent::div/following-sibling::div[*]/child::div/child::div[2]/child::p[1]")
    private List<WebElement> getDispensaryNearbyHourMobileList;
    @FindBy(xpath = "//h2[text()='Dispensaries Nearby']/parent::div/following-sibling::div[*]/child::div/child::div[2]/child::p[1]/*")
    private List<WebElement> dispensaryNearbyHourIconMobileList;
    @FindBy(xpath = "//h2[text()='Dispensaries Nearby']/parent::div/following-sibling::div[*]/child::div/child::div[2]/child::p[2]")
    private List<WebElement> dispensaryNearbyPhoneMobileList;
    @FindBy(xpath = "//h2[text()='Dispensaries Nearby']/parent::div/following-sibling::div[*]/child::div/child::div[2]/child::p[2]/*")
    private List<WebElement> getDispensaryNearbyPhoneIconMobileList;
    @FindBy(xpath = "//h2[text()='Dispensaries Nearby']/parent::div/following-sibling::div[*]/child::div/child::div[2]/child::p[3]")
    private List<WebElement> dispensaryNearbyAddressMobileList;
    @FindBy(xpath = "//h2[text()='Dispensaries Nearby']/parent::div/following-sibling::div[*]/child::div/child::div[2]/child::p[3]/*")
    private List<WebElement> dispensaryNearbyAddressIconMobileList;
    @FindBy(xpath = "//h2[text()='Dispensaries Nearby']/parent::div/following-sibling::div[*]/child::div/child::a")
    private List<WebElement> dispensaryNearbyViewDispensaryMobileCTAList;
    /*
     * Reward Banner Section
     */
    @FindBy(xpath = "//h3[text()='Rise Rewards Program']/parent::div/parent::div/parent::div/parent::div/parent::div")
    private WebElement rewardBannerSection;
    @FindBy(xpath = "//h3[text()='Rise Rewards Program']")
    private WebElement rewardBannerHeader;
    @FindBy(xpath = "//h3[text()='Rise Rewards Program']/following-sibling::p")
    private WebElement rewardBannerCopyText;
    @FindBy(xpath = "//h3[text()='Rise Rewards Program']/following-sibling::a")
    private WebElement rewardsBannerJoinNowCTA;
    /*
     * Getter & Setter
     */
    /*
     * mobile Homepage
     */
    public WebElement getMobileHamburgerMenuCTA(){
        return mobileHamburgerMenuCTA;
    }
    public List<WebElement> getMobileMenuOptionList(){
        return mobileMenuOptionList;
    }
    public List<WebElement> getDispensaryStateList(){
        return dispensaryStateList;
    }
    public WebElement getMobileCLoseIcon(){
        return mobileCLoseIcon;
    }
    /*
     * Hero Banner
     */
    public WebElement getDispensariesOptionGlobalHeader() {
        return dispensariesOptionGlobalHeader;
    }
    public WebElement getDispensaryStateIllinois(){
        return dispensaryStateIllinois;
    }
    public WebElement getRiseDispensaryMundeleinOption(){
        return riseDispensaryMundeleinOption;
    }
    public WebElement getRiseDispensaryMundeleinHeader(){
        return riseDispensaryMundeleinHeader;
    }
    public WebElement getDispensaryHeroBanner(){
        return dispensaryHeroBanner;
    }
    public WebElement getDispensaryBreadcrumb(){
        return dispensaryBreadcrumb;
    }
    public WebElement getImageCarouselLeftArrow(){
        return imageCarouselLeftArrow;
    }
    public WebElement getImageCarouselRightArrow(){
        return imageCarouselRightArrow;
    }
    public List<WebElement> getImageCarouselHeroBanner(){
        return imageCarouselHeroBanner;
    }
    public WebElement getRiseDispensaryMundeleinCopyText(){
        return riseDispensaryMundeleinCopyText;
    }
    public List<WebElement> getHeroBannerMenuCTAs(){
        return heroBannerMenuCTAs;
    }
    public WebElement getHeroBannerProgressbar(){
        return heroBannerProgressbar;
    }
    /*
     * About This Dispensary
     */
    public WebElement getAboutThisDispensarySection(){
        return aboutThisDispensarySection;
    }
    public WebElement getAboutThisDispensaryHeader(){
        return aboutThisDispensaryHeader;
    }
    public WebElement getAboutThisDispensaryCopyText(){
        return aboutThisDispensaryCopyText;
    }
    public WebElement getOpeningHoursText(){
        return openingHoursText;
    }
    public WebElement getClockImage(){
        return clockImage;
    }
    public WebElement getClockIcon(){
        return clockIcon;
    }
    public List<WebElement> getListOfDays(){
        return listOfDays;
    }
    public WebElement getCurrentDayText(){
        return currentDayText;
    }
    public WebElement getCurrentDayOnly(){
        return currentDayOnly;
    }
    public WebElement getCurrentHours(){
        return currentHours;
    }
    public WebElement getPhoneInfo(){
        return phoneInfo;
    }
    public WebElement getPhoneIcon(){
        return phoneIcon;
    }
    public WebElement getCallNowCTA(){
        return callNowCTA;
    }
    public WebElement getAddressText(){
        return addressText;
    }
    public WebElement getAddressMapCTA(){
        return addressMapCTA;
    }
    public WebElement getAddressMapIcon(){
        return addressMapIcon;
    }
    public WebElement getContactUsCTA(){
        return contactUsCTA;
    }
    public WebElement getCallNowCaret(){
        return callNowCaret;
    }
    public WebElement getContactUsCaret(){
        return contactUsCaret;
    }
    public WebElement getAddressMapCaret(){
        return addressMapCaret;
    }
    public WebElement getContactUsPageHeader(){
        return contactUsPageHeader;
    }
    public WebElement getDispensaryAdditionalInfo(){
        return dispensaryAdditionalInfo;
    }
    public WebElement getDispensaryAdditionalInfoCopyText(){
        return dispensaryAdditionalInfoCopyText;
    }
    /*
     * Mobile About the Dispensary
     */
    public WebElement getAboutDispensaryReadMoreCTA() {
        return aboutDispensaryReadMoreCTA;
    }
    public WebElement getAboutDispensaryReadLessCTA(){
        return aboutDispensaryReadLessCTA;
    }
    public WebElement getMobileClockImage(){
        return mobileClockImage;
    }
    public WebElement getAboutDispensaryHourDropDownCTA(){
        return aboutDispensaryHourDropDownCTA;
    }
    /*
     * Dispensary Tab
     */
    public WebElement getDispensaryTabSection(){
        return dispensaryTabSection;
    }
    public WebElement getDispensaryTabHeader(){
        return dispensaryTabHeader;
    }
    public List<WebElement> getDispensaryTabList(){
        return dispensaryTabList;
    }
    public WebElement getPromotionTab(){
        return promotionTab;
    }
    public WebElement getAmenitiesTab(){
        return amenitiesTab;
    }
    public WebElement getAmenitiesHeader(){
        return amenitiesHeader;
    }
    public WebElement getAmenitiesCopyText(){
        return amenitiesCopyText;
    }
    public List<WebElement> getAmenitiesIconList(){
        return amenitiesIconList;
    }
    public List<WebElement> getAmenitiesTextList(){
        return amenitiesTextList;
    }
    public List<WebElement> getAmenitiesToolTipList(){
        return amenitiesToolTipList;
    }
    public WebElement getDealsTabHeader(){
        return dealsTabHeader;
    }
    public WebElement getPromotionTabHighlighted(){
        return promotionTabHighlighted;
    }
    public WebElement getDealsTabCopytext(){
        return dealsTabCopytext;
    }
    public WebElement getDealTabImage(){
        return dealTabImage;
    }
    public WebElement getDealTabCTA(){
        return dealTabCTA;
    }
    public WebElement getDealStartDateAndEndDateAndIcon(){
        return dealStartDateAndEndDateAndIcon;
    }

    /*
     * Mobile Dispensary Tab
     */
    public List<WebElement> getMobileDispensaryTabList(){
        return mobileDispensaryTabList;
    }
    /*
     * Dispensary Review
     */
    public WebElement getDispensaryReviewSection(){
        return dispensaryReviewSection;
    }
    public WebElement getDispensaryReviewHeader(){
        return dispensaryReviewHeader;
    }
    public WebElement getDispensaryReviewCount(){
        return dispensaryReviewCount;
    }
    public WebElement getReviewRightClickButton(){
        return reviewRightClickButton;
    }
    public WebElement getReviewProgressBar(){
        return reviewProgressBar;
    }
    public WebElement getReviewLeftClickButton(){
        return reviewLeftClickButton;
    }
    public List<WebElement> getReviewStarList(){
        return reviewStarList;
    }
    public List<WebElement> getReviewQuotationList(){
        return reviewQuotationList;
    }
    public List<WebElement> getReviewCommentList(){
        return reviewCommentList;
    }
    public List<WebElement> getReviewCustomerNameList(){
        return reviewCustomerNameList;
    }
    /*
     * Mobile Dispensary Review
     */
    public WebElement getMobileReviewCount(){
        return mobileReviewCount;
    }
    public WebElement getMobileProgressbar(){
        return mobileProgressbar;
    }

    /*
     * Quick Links
     */
    public WebElement getQuickLinkSection(){
        return quickLinkSection;
    }
    public List<WebElement> getQuickLinkBannerList(){
        return quickLinkBannerList;
    }
    public WebElement getQuickLinksTitleText(){
        return quickLinksTitleText;
    }
    public WebElement getQuickLinksCopyText(){
        return quickLinksCopyText;
    }
    public List<WebElement> getQuickLinksImageList(){
        return quickLinksImageList;
    }
    public List<WebElement> getQuickLinksTitleLinkCardList(){
        return quickLinksTitleLinkCardList;
    }
    public List<WebElement> getQuickLinkSArrowIconList(){
        return quickLinkSArrowIconList;
    }


    /*
     * Quick Links >>> This Section we need to delete once we will get Test ID "Virginia"
     */

    public WebElement getQuickLinkSectionVirginia(){
        return quickLinkSectionVirginia;
    }
    public List<WebElement> getQuickLinkBannerListVirginia(){
        return quickLinkBannerListVirginia;
    }
    public WebElement getQuickLinksTitleTextVirginia(){
        return quickLinksTitleTextVirginia;
    }
    public WebElement getQuickLinksCopyTextVirginia(){
        return quickLinksCopyTextVirginia;
    }
    public List<WebElement> getQuickLinksImageListVirginia(){
        return quickLinksImageListVirginia;
    }
    public List<WebElement> getQuickLinksTitleLinkCardListVirginia(){
        return quickLinksTitleLinkCardListVirginia;
    }
    public List<WebElement> getQuickLinkSArrowIconListVirginia(){
        return quickLinkSArrowIconListVirginia;
    }



    /*
     * Rise Mundelein LoungePage
     */
    public WebElement getRiseMundeleinLoungePageHeader(){
        return riseMundeleinLoungePageHeader;
    }
    /*
     * Dispensary Faq Section
     */
    public WebElement getDispensaryFaqSection(){
        return dispensaryFaqSection;
    }
    public WebElement getDispensaryFaqAccordion(){
        return dispensaryFaqAccordion;
    }
    public List<WebElement> getAccordionQuestionList(){
        return accordionQuestionList;
    }
    public List<WebElement> getAccordionPlusIconList(){
        return accordionPlusIconList;
    }
    public List<WebElement> getAccordionFaqButtonList(){
        return accordionFaqButtonList;
    }
    public List<WebElement> getAccordionFaqAnswerList(){
        return accordionFaqAnswerList;
    }
    public WebElement getAccordionShowingText(){
        return accordionShowingText;
    }
    public  WebElement getShowMoreCTA(){
        return showMoreCTA;
    }
    /*
     * Dispensary Nearby
     */
    public WebElement getDispensaryNearbySection(){
        return dispensaryNearbySection;
    }
    public List<WebElement> getDispensaryNearbyLocationList(){
        return dispensaryNearbyLocationList;
    }
    public WebElement getDispensaryNearbyTitle(){
        return dispensaryNearbyTitle;
    }
    public List<WebElement> getDispensaryNearByImageList(){
        return dispensaryNearByImageList;
    }
    public List<WebElement> getDispensaryNearbyDispensaryNameList(){
        return dispensaryNearbyDispensaryNameList;
    }
    public List<WebElement> getDispensaryNearbyHourList(){
        return dispensaryNearbyHourList;
    }

    public List<WebElement> getGetDispensaryNearbyHourMobileList(){
        return getDispensaryNearbyHourMobileList;
    }
    public List<WebElement> getDispensaryNearbyHourIconMobileList(){
        return dispensaryNearbyHourIconMobileList;
    }
    public List<WebElement> getDispensaryNearbyPhoneMobileList(){
        return dispensaryNearbyPhoneMobileList;
    }
    public List<WebElement> getGetDispensaryNearbyPhoneIconMobileList(){
        return getDispensaryNearbyPhoneIconMobileList;
    }
    public List<WebElement> getDispensaryNearbyAddressMobileList(){
        return dispensaryNearbyAddressMobileList;
    }
    public List<WebElement> getDispensaryNearbyAddressIconMobileList(){
        return dispensaryNearbyAddressIconMobileList;
    }
    public List<WebElement> getDispensaryNearbyViewDispensaryMobileCTAList(){
        return dispensaryNearbyViewDispensaryMobileCTAList;
    }
    public List<WebElement> getDispensaryNearbyHourIcon(){
        return dispensaryNearbyHourIcon;
    }
    public List<WebElement> getDispensaryNearbyPhoneList(){
        return dispensaryNearbyPhoneList;
    }
    public List<WebElement> getDispensaryNearbyPhoneIconList(){
        return dispensaryNearbyPhoneIconList;
    }
    public List<WebElement> getDispensaryNearbyAddressList(){
        return dispensaryNearbyAddressList;
    }
    public List<WebElement> getDispensaryNearbyAddressIconList(){
        return dispensaryNearbyAddressIconList;
    }
    public List<WebElement> getDispensaryNearbyViewDispensaryCTAList(){
        return dispensaryNearbyViewDispensaryCTAList;
    }
    public List<WebElement> getDispensaryNearbyViewCTACaretIconList(){
        return dispensaryNearbyViewCTACaretIconList;
    }
    /*
     * Mobile Dispensary Nearby Section
     */
    public List<WebElement> getMobileDispensaryNameList(){
        return mobileDispensaryNameList;
    }
    /*
     * Dispensary Banner section
     */
    public WebElement getRewardBannerSection(){
        return rewardBannerSection;
    }
    public WebElement getRewardBannerHeader(){
        return rewardBannerHeader;
    }
    public WebElement getRewardBannerCopyText(){
        return rewardBannerCopyText;
    }
    public WebElement getRewardsBannerJoinNowCTA(){
        return rewardsBannerJoinNowCTA;
    }
}

