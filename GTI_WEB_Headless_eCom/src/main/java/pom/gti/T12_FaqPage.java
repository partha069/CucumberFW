package pom.gti;

import com.resuableMethods.CommonAction;
import com.utilities.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class T12_FaqPage extends CommonAction {

	public T12_FaqPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	/***********************************************************************************************************/

	/*
	 * Header Text & Image
	 */
	@FindBy(xpath = "//header[@data-testid='header-wrapper']")
	private WebElement faqHeader;
	@FindBy(xpath = "//h2[text()='Frequently asked questions']/parent::div/preceding-sibling::div/parent::div/parent::*")
	private WebElement faqHeroBanner;
	@FindBy(xpath = "//h2[text()='Frequently asked questions']")
	private WebElement faqHeroBannerTitleText;
	@FindBy(xpath = "//h2[text()='Frequently asked questions']/following-sibling::p")
	private WebElement faqHeroBannerCopyText;
	@FindBy(xpath = "//img[@title='faq-hero-banner.webp']/parent::span/parent::div/parent::*")
	private WebElement faqHeroBannerImage;
	@FindBy(xpath = "//img[@title='faq-banner-mobile']/parent::span/parent::div/parent::div")
	private WebElement faqHeroBannerImageMobile;
	@FindBy(xpath = "(//*[contains(text(),'Here are the most frequently')])[1]")
	private WebElement CopyText;
	@FindBy(xpath = "//p[@data-testid='licenceNumberRecreationalMenu']/parent::div/parent::div")
	private WebElement footerLicenceSection;
	@FindBy(xpath = "//a[text()='FAQ']")
	private WebElement footerFaqOption;
	@FindBy(xpath = "(//*[contains(text(),'some RISE dispensaries do offer weed delivery')])[1]")
	private WebElement heroBanner;

	@FindBy(xpath = "(//*[text()='General inquiries'])[1]")
	private WebElement GeneralInquiriesCTA;
	@FindBy(xpath = "//button[@data-testid='drawer-button']")
	private WebElement drawerButtonMobile;

	/*
	 *  List of Menus
	 */

	@FindBy(xpath = "(//*[text()='Rise Dispensaries'])[1]")
	private WebElement RiseDispensariessCTA;

	@FindBy(xpath = "(//*[text()='Payment'])[1]")
	private WebElement PaymentCTA;

	@FindBy(xpath = "(//*[text()='Orders & offers'])[1]")
	private WebElement OrdersAndOffersCTA;

	@FindBy(xpath = "(//*[text()='My Category'])[1]")
	private WebElement MyCategoryCTA;


	/*
	 * General inquiries Section
	 */
	@FindBy(xpath = "(//*[text()='General inquiries'])[2]")  //
	private WebElement GeneralInquiriesText;

	@FindBy(xpath = "//*[text()='Using Cannabis for The First Time? Start Low, Go Slow.']")
	private WebElement FAQsOption1;

	@FindBy(xpath = "(//*[@class='text-leaf lg:!h-6 lg:!w-6'])[1]")
	private WebElement FAQsOptionIcon;

	@FindBy(xpath = "(//*[contains(text(),'First-time cannabi')])[1]")
	private WebElement FAQsOption1text;

	@FindBy(xpath = "//*[text()='Where can I Smoke?']")
	private WebElement FAQsOption_Two;

	@FindBy(xpath = "(//*[contains(text(),'In a private space where')])[1]")
	private WebElement FAQsOption_TwoText1;

	@FindBy(xpath = "//*[text()='Can I travel with my cannabis?']")
	private WebElement FAQsOption_Three;

	@FindBy(xpath = "(//*[contains(text(),'Be safe – never drive')])[1]")
	private WebElement FAQsOption_ThreeText_one;

	@FindBy(xpath = "//*[text()='How do I store my cannabis?']")
	private WebElement FAQsOption_Four;

	@FindBy(xpath = "(//*[contains(text(),'We recommend storing')])[1]")
	private WebElement FAQsOption_FourText;

	@FindBy(xpath = "(//*[contains(text(),'For safety, always keep')])[1]")
	private WebElement FAQsOption_FourText_two;

	@FindBy(xpath = "//*[text()='Are you pregnant?']")
	private WebElement FAQsOption_Five;

	@FindBy(xpath = "(//*[contains(text(),'Congratulations! Please')])[1]")
	private WebElement FAQsOption_FiveText;

	@FindBy(xpath = "//*[text()='Does RISE dispensary offer discounts?']")
	private WebElement FAQsOption_Six;

	@FindBy(xpath = "(//*[contains(text(),'Yes, RISE Dispensary offers')])[1]")
	private WebElement FAQsOption_SixText;

	@FindBy(xpath = "//*[text()='Product FAQs']")
	private WebElement FAQsOption_Seven;

	@FindBy(xpath = "//*[text()='Rythm FAQs']")
	private WebElement FAQsOption_SevenText;

	@FindBy(xpath = "(//*[contains(text(),'Dogwalker FAQs')])[1]")
	private WebElement FAQsOption_SevenText_one;




	/*
	 * Where is RISE Dispensary?
	 */
	@FindBy(xpath = "//div[@id='toc_rise_dispensaries']/ul[1]/div")
	private List<WebElement> riseDispensaryList;
	@FindBy(xpath = "//div[@id='toc_rise_dispensaries']/ul[1]/div/button/span/div/parent::span")
	private List<WebElement> riseDispensaryListPlusIcon;
	@FindBy(xpath = "//div[@data-testid='sectionfaq']/child::button/child::span[*]/child::div")
	private List<WebElement> faqQuestionPlusIconList;

	@FindBy(xpath = "//h4[text()='Rise Dispensaries']/parent::div/following-sibling::ul/child::div[@data-testid='sectionfaq']/button/child::span[*]/child::div/child::*/child::*[@d='M5 11h14v2H5z']")
	private WebElement riseDispensaryQuestionOneMinusIcon;
	@FindBy(xpath = "//div[@id='toc_rise_dispensaries']/child::ul/child::div[2]/child::button")
	private WebElement riseDispensarySecondAccordion;
	@FindBy(xpath = "//div[@id='toc_rise_dispensaries']/ul[1]/div/div")
	private List<WebElement> riseDispensaryListAnswer;
	@FindBy(xpath = "//*[text()='Where is RISE Dispensary?']")
	private WebElement WhereIsRISEDispensaryCTA;
	@FindBy(xpath = "(//*[contains(text(),'RISE dispensaries and our')])[1]")
	private WebElement WhereIsRISEDispensaryText;

	@FindBy(xpath = "//*[text()='How many dispensary locations does RISE have?']")
	private WebElement HowManyDispensaryLocationsDoesRISEhaveCTA;

	@FindBy(xpath = "(//*[contains(text(),'has 2 locations')])[1]")
	private WebElement HowManyDispensaryLocationsDoesRISEhaveText;

	@FindBy(xpath = "//*[text()='Where are RISE Dispensaries located?']")
	private WebElement WhereAreRISEDispensariesLocatedCTA;

	@FindBy(xpath = "(//*[contains(text(),'You can find the')])[1]")
	private WebElement WhereAreRISEDispensariesLocatedText;

	@FindBy(xpath = "//*[text()='Is RISE a licensed dispensary?']")
	private WebElement IsRISEaLicensedDispensaryCTA;

	@FindBy(xpath = "(//*[contains(text(),'Yes, RISE is a state-licensed')])[1]")
	private WebElement IsRISEaLicensedDispensaryText;

	@FindBy(xpath = "//*[text()='Who is RISE Owned By?']")
	private WebElement WhoIsRISEOwnedByCTA;

	@FindBy(xpath = "(//*[contains(text(),'Green Thumb Industries')])[1]")
	private WebElement WhoIsRISEOwnedByText;


	/*
	 * Payment
	 */
	@FindBy(xpath = "//*[text()='Does RISE Dispensaries offer discounts?']")
	private WebElement DoesRISEDispensariesOfferDiscountsCTA;
	@FindBy(xpath = "(//*[contains(text(),'RISE also offers a')])[2]")
	private WebElement DoesRISEDispensariesOfferDiscountsText;

	@FindBy(xpath = "//*[text()='Does RISE dispensaries only take cash?']")
	private WebElement DoesRISEDispensariesOnlyTakeCashCTA;
	@FindBy(xpath = "(//*[contains(text(),'No')])[1]")
	private WebElement DoesRISEDispensariesOnlyTakeCashText;

	@FindBy(xpath = "//*[text()='Does RISE dispensary take apple pay?']")
	private WebElement DoesRISEdispensaryTakeApplePayCTA;
	@FindBy(xpath = "(//*[contains(text(),'not take Apple Pay')])[1]")
	private WebElement DoesRISEdispensaryTakeApplePayText;

	@FindBy(xpath = "//*[text()='Does RISE accept credit cards?']")
	private WebElement DoesRISEAcceptCreditCardsCTA;
	@FindBy(xpath = "(//*[contains(text(),'Currently, due to')])[1]")
	private WebElement DoesRISEAcceptCreditCardsText;


   /*
    * Orders & offers
    */
   @FindBy(xpath = "//*[text()='Do RISE Dispensaries offer weed delivery?']")
   private WebElement DoRISEDispensariesOfferWeedDeliveryCTA;
	@FindBy(xpath = "(//*[contains(text(),'some RISE dispensaries do offer weed delivery')])[1]")
	private WebElement DoRISEDispensariesOfferWeedDeliveryText;

	@FindBy(xpath = "//*[text()='How can I order weed online?']")
	private WebElement HowCanIOrderWeedOnlineCTA;
	@FindBy(xpath = "(//*[contains(text(),'To order weed online')])[1]")
	private WebElement HowCanIOrderWeedOnlineText;

	@FindBy(xpath = "//*[text()='Does RISE have a new patient discount?']")
	private WebElement DoesRISEHaveAnewPatientDiscountCTA;
	@FindBy(xpath = "(//*[contains(text(),'offer a new patient discount')])[1]")
	private WebElement DoesRISEHaveAnewPatientDiscountText;

	@FindBy(xpath = "//*[text()='Do RISE dispensaries offer discounts, deals, and coupons?']")
	private WebElement DoRISEdispensariesOfferDiscountsDdealsAndCouponsCTA;
	@FindBy(xpath = "(//*[contains(text(),'RISE dispensary offers daily')])[1]")
	private WebElement DoRISEdispensariesOfferDiscountsDdealsAndCouponsText;

	/*
	 * My Category
	 */
	@FindBy(xpath = "//*[text()='First Question']")
	private WebElement FirstQuestionCTA;
	@FindBy(xpath = "//*[text()='First Answer']")
	private WebElement FirstQuestionText;


	/*
	 * Anchor Link - Hentry
	 */
	@FindBy(xpath = "//h5[text()='Topics']")
	private WebElement topicsHeader;

	@FindBy(xpath = "//a[text()='General inquiries']")
	private WebElement generalInquiriesAnchor;

	@FindBy(xpath ="//a[text()='Rise Dispensaries']")
	private WebElement riseDispensariesAnchor;

	@FindBy(xpath = "//a[text()='Payment']")
	private WebElement paymentAnchor;

	@FindBy(xpath = "//a[text()='Orders & offers']")
	private WebElement ordersAndOffersAnchor;

	@FindBy(xpath = "//a[text()='My Category']")
	private WebElement myCategoryAnchor;

	@FindBy(xpath = "//h4[text()='Orders & offers']")
	private WebElement orderAndOffersHeader;

	@FindBy(xpath = "//h4[text()='My Category']")
	private WebElement myCategoryHeader;

	@FindBy(xpath = "//h4[text()='Looking for any additional info?'] /parent::div/parent::div/parent::div[1]")
	private WebElement helpBanner;
	@FindBy(xpath = "//h4[text()='Looking for any additional info?']")
	private WebElement helpBannerTitleText;
	@FindBy(xpath = "//h4[text()='Looking for any additional info?']/parent::div/child::p")
	private WebElement helpBannerCopyText;
	@FindBy(xpath = "//a[text()='contact us']")
	private WebElement helpBannerContactUsButton;
	@FindBy(xpath = "//h4[text()='General inquiries']")
	private WebElement generalInquiriesHeader;

	@FindBy(xpath = "//h4[text()='Rise Dispensaries']")
	private WebElement riseDispensariesHeader;

	@FindBy(xpath = "//h4[text()='Payment']")
	private WebElement paymentHeader;

	/*
	* Footer
	*/
	 @FindBy(xpath = "//a[@title='RISE Dispensaries Footer Logo']/ancestor::div[3]")
	 private WebElement faqFooter;

	/*
	*Header
	 */
	public WebElement getFaqHeader(){
		return faqHeader;
	}
	public WebElement getFooterLicenceSection(){
		return footerLicenceSection;
	}
	public WebElement getFooterFaqOption(){
		return footerFaqOption;
	}
	/*
	* Hero banner
	 */
	public WebElement getFaqHeroBanner(){
		return faqHeroBanner;
	}
	public WebElement getHelpBannerTitleText(){
		return helpBannerTitleText;
	}
	public WebElement getHelpBannerCopyText(){
		return helpBannerCopyText;
	}
	public WebElement getHelpBannerContactUsButton(){
		return helpBannerContactUsButton;
	}
	public WebElement getFaqHeroBannerCopyText(){
		return faqHeroBannerCopyText;
	}
	public WebElement getFaqHeroBannerImage(){
		return faqHeroBannerImage;
	}
	public WebElement getfaqHeroBannerImageMobile(){
		return faqHeroBannerImageMobile;
	}
	/*
	* Mobile
	*/
	 public WebElement getDrawerButtonMobile(){
		 return drawerButtonMobile;
	 }
	/*
	 * Anchor Link - Hentry
	 */
	public WebElement getTopicsHeader() {
		return topicsHeader;
	}

	public WebElement getGeneralInquiries() {
		return generalInquiriesAnchor;
	}

	public WebElement getRiseDispensaries() {
		return riseDispensariesAnchor;
	}

	public WebElement getPayment() {
		return paymentAnchor;
	}

	public WebElement getOrdersAndOffers() {
		return ordersAndOffersAnchor;
	}

	public WebElement getMyCategory() {
		return myCategoryAnchor;
	}

	public WebElement getorderAndOffersHeader() {
		return orderAndOffersHeader;
	}

	public WebElement getmyCategoryHeader() {
		return myCategoryHeader;
	}

	public WebElement getHelpBanner() {
		return helpBanner;
	}

	public WebElement getgeneralInquiriesHeader() {
		return generalInquiriesHeader;
	}

	public WebElement getriseDispensariesHeader() {
		return riseDispensariesHeader;
	}

	public List<WebElement> getRiseDispensaryList(){
		return riseDispensaryList;
	}
	public List<WebElement> getRiseDispensaryListPlusIcon(){
		return riseDispensaryListPlusIcon;
	}
	public List<WebElement> getFaqQuestionPlusIconList(){
		return faqQuestionPlusIconList;
	}

	public WebElement getRiseDispensaryQuestionOneMinusIcon(){
		return riseDispensaryQuestionOneMinusIcon;
	}
	public List<WebElement> getRiseDispensaryListAnswer(){
		return riseDispensaryListAnswer;
	}
	public WebElement getpaymentHeader() {
		return paymentHeader;
	}



	/*
	 * General inquiries Section
	 */
	public WebElement getFaqHeroBannerTitleText() {
		return faqHeroBannerTitleText;
	}

	public WebElement getCopyText() {
		return CopyText;
	}

	public WebElement getheroBanner() {
		return heroBanner;
	}

	public WebElement getGeneralInquiriesText() {
		return GeneralInquiriesText;
	}

	public WebElement getFAQsOptionIcon() {
		return FAQsOptionIcon;
	}

	public WebElement getFAQsOption1text() {
		return FAQsOption1text;
	}



	public WebElement getFAQsOption_TwoText_One() {
		return FAQsOption_TwoText1;
	}


	public WebElement getFAQsOption_ThreeText_OneText() {
		return FAQsOption_ThreeText_one;
	}

	public WebElement getFAQsOption_FourText() {
		return FAQsOption_FourText;
	}


	public WebElement getFAQsOption_FiveText() {
		return FAQsOption_FiveText;
	}

	public WebElement getFAQsOption_Six() {
		return FAQsOption_Six;
	}

	public WebElement getFAQsOption_SixText() {
		return FAQsOption_SixText;
	}

	public WebElement getFAQsOption_SevenText() {
		return FAQsOption_SevenText;
	}



	/*
	 * RISE DISPENSARIES
	 */
	public WebElement getFRiseDispensariesText() {
		return WhereIsRISEDispensaryText;
	}
	public WebElement getHowManyDispensaryLocationsDoesRISEhaveText() {
		return HowManyDispensaryLocationsDoesRISEhaveText;
	}

	public WebElement getWhereAreRISEDispensariesLocatedText() {
		return WhereAreRISEDispensariesLocatedText;
	}
	public WebElement getIsRISEaLicensedDispensaryText() {
		return IsRISEaLicensedDispensaryText;
	}

	public WebElement getWhoIsRISEOwnedByText() {
		return WhoIsRISEOwnedByText;
	}
	public WebElement getRiseDispensarySecondAccordion(){
		return riseDispensarySecondAccordion;
	}


	/*
	 * Payment
	 */
	public WebElement getPaymentCTA() {
		return PaymentCTA;
	}

	public WebElement getDoDoesRISEDispensariesOfferDiscountsText() {
		return DoesRISEDispensariesOfferDiscountsText;
	}

	public WebElement getDoesRISEDispensariesOnlyTakeCashText() {
		return DoesRISEDispensariesOnlyTakeCashText;
	}
	public WebElement getDoesRISEdispensaryTakeApplePayText() {
		return DoesRISEdispensaryTakeApplePayText;
	}

	public WebElement getDoesRISEAcceptCreditCardsText() {
		return DoesRISEAcceptCreditCardsText;
	}




	/*
	 * Orders & offers
	 */
	public WebElement getOrdersAndOffersCTA() {
		return OrdersAndOffersCTA;
	}

	public WebElement getDoRISEDispensariesOfferWeedDeliveryText() {
		return DoRISEDispensariesOfferWeedDeliveryText;
	}

	public WebElement getHowCanIOrderWeedOnlineText() {
		return HowCanIOrderWeedOnlineText;
	}

	public WebElement getDoesRISEHaveAnewPatientDiscountText() {
		return DoesRISEHaveAnewPatientDiscountText;
	}

	public WebElement getDoRISEdispensariesOfferDiscountsDdealsAndCouponsText() {
		return DoRISEdispensariesOfferDiscountsDdealsAndCouponsText;
	}


	/*
	 * My Category
	 */
	public WebElement getMyCategoryCTA() {
		return MyCategoryCTA;
	}

	public WebElement getFirstQuestionText() {
		return FirstQuestionText;
	}

	public WebElement getFaqFooter(){
		return faqFooter;
	}











	/*
	 * General inquiries Section
	 */
	public void ClickOnFAQsOption1() {
		try {
			jsClick(FAQsOption1);
			Logger.log("Clicked on FAQs Option1 CTA");
		} catch (Exception e) {
			Logger.log("Didn't Click on FAQs Option1 CTA");
		}
	}

	public void ClickOnFAQsOptionTwo() {
		try {
			jsClick(FAQsOption_Two);
			Logger.log("Clicked on FAQs Option2 CTA");
		} catch (Exception e) {
			Logger.log("Didn't Click on FAQs Option2 CTA");
		}
	}

	public void ClickOnFAQsOptionThree() {
		try {
			jsClick(FAQsOption_Three);
			Logger.log("Clicked on FAQs Option three CTA");
		} catch (Exception e) {
			Logger.log("Didn't Click on FAQs Option Three CTA");
		}
	}

	public void ClickOnFAQsOptionFour() {
		try {
			jsClick(FAQsOption_Four);
			Logger.log("Clicked on FAQs Option Four CTA");
		} catch (Exception e) {
			Logger.log("Didn't Click on FAQs Option Four CTA");
		}
	}

	public void ClickOnFAQsOptionFive() {
		try {
			jsClick(FAQsOption_Five);
			Logger.log("Clicked on FAQs Option Five CTA");
		} catch (Exception e) {
			Logger.log("Didn't Click on FAQs Option Five CTA");
		}
	}

	public void ClickOnFAQsOptionSix() {
		try {
			jsClick(FAQsOption_Six);
			Logger.log("Clicked on FAQs Option Six CTA");
		} catch (Exception e) {
			Logger.log("Didn't Click on FAQs Option Six CTA");
		}
	}

	public void ClickOnFAQsOptionSeven() {
		try {
			jsClick(FAQsOption_Seven);
			Logger.log("Clicked on FAQs Option Seven CTA");
		} catch (Exception e) {
			Logger.log("Didn't Click on FAQs Option Seven CTA");
		}
	}


	/*
	 * RISE DISPENSARIES
	 */
	public void ClickOnGeneralInquiriesCTA() {
		try {
			jsClick(GeneralInquiriesCTA);
			Logger.log("Clicked on GeneralInquiries CTA");
		} catch (Exception e) {
			Logger.log("Didn't Click on GeneralInquiries CTA");
		}
	}




	/*
	 * Rise Dispensaries
	 */
	public void ClickOnRiseDispensariesCTA() {
		try {
			jsClick(RiseDispensariessCTA);
			Logger.log("Clicked on Rise Dispensaries CTA");
		} catch (Exception e) {
			Logger.log("Didn't Click on Rise Dispensaries CTA");
		}
	}

	public void ClickOnWhereIsRISEDispensaryCTA() {
		try {
			jsClick(WhereIsRISEDispensaryCTA);
			Logger.log("Clicked on Where Is RISE Dispensary CTA");
		} catch (Exception e) {
			Logger.log("Didn't Click on Where Is RISE Dispensary CTA");
		}
	}

	public void ClickOnHowManyDispensaryLocationsDoesRISEhaveCTA() {
		try {
			jsClick(HowManyDispensaryLocationsDoesRISEhaveCTA);
			Logger.log("Clicked on How Many Dispensary Locations Does RISE have CTA");
		} catch (Exception e) {
			Logger.log("Didn't Click on How Many Dispensary Locations Does RISE have CTA");
		}
	}

	public void ClickOnWhereAreRISEDispensariesLocatedCTA() {
		try {
			jsClick(WhereAreRISEDispensariesLocatedCTA);
			Logger.log("Clicked on Where Are RISE Dispensaries Located CTA");
		} catch (Exception e) {
			Logger.log("Didn't Click on Where Are RISE Dispensaries Located CTA");
		}
	}
	public void ClickOnIsRISEaLicensedDispensaryCTA() {
		try {
			jsClick(IsRISEaLicensedDispensaryCTA);
			Logger.log("Clicked on Is RISE a Licensed Dispensary CTA");
		} catch (Exception e) {
			Logger.log("Didn't Click on Is RISE a Licensed Dispensary CTA");
		}
	}

	public void ClickOnWhoIsRISEOwnedByCTA() {
		try {
			jsClick(WhoIsRISEOwnedByCTA);
			Logger.log("Clicked on Who Is RISE Owned By CTA");
		} catch (Exception e) {
			Logger.log("Didn't Click on Who Is RISE Owned By CTA");
		}
	}



	/*
	 * Payment
	 */
	public void ClickOnPaymentCTA() {
		try {
			jsClick(PaymentCTA);
			Logger.log("Clicked on Payment CTA");
		} catch (Exception e) {
			Logger.log("Didn't Click on Payment CTA");
		}
	}
	public void ClickOnDoesRISEDispensariesOfferDiscountsCTA() {
		try {
			jsClick(DoesRISEDispensariesOfferDiscountsCTA);
			Logger.log("Clicked on Does RISE Dispensaries Offer Discounts CTA");
		} catch (Exception e) {
			Logger.log("Didn't Click on Does RISE Dispensaries Offer Discounts CTA");
		}
	}

	public void ClickOnDoesRISEDispensariesOnlyTakeCashCTA() {
		try {
			jsClick(DoesRISEDispensariesOnlyTakeCashCTA);
			Logger.log("Clicked on Does RISE Dispensaries Only Take Cash CTA");
		} catch (Exception e) {
			Logger.log("Didn't Click on Does RISE Dispensaries Only Take Cash CTA");
		}
	}

	public void ClickOnDoesRISEdispensaryTakeApplePayCTA() {
		try {
			jsClick(DoesRISEdispensaryTakeApplePayCTA);
			Logger.log("Clicked on Does RISE dispensary Take Apple Pay CTA");
		} catch (Exception e) {
			Logger.log("Didn't Click on Does RISE dispensary Take Apple Pay CTA");
		}
	}

	public void ClickOnDoesRISEAcceptCreditCardsCTA() {
		try {
			jsClick(DoesRISEAcceptCreditCardsCTA);
			Logger.log("Clicked on Does RISE Accept Credit Cards CTA");
		} catch (Exception e) {
			Logger.log("Didn't Click on Does RISE Accept Credit Cards CTA");
		}
	}





	/*
	 * Orders & offers
	 */
	public void ClickOnOrdersAndOffersCTA() {
		try {
			jsClick(OrdersAndOffersCTA);
			Logger.log("Clicked on Orders & Offers CTA");
		} catch (Exception e) {
			Logger.log("Didn't Click on Orders & Offers CTA");
		}
	}

	public void ClickOnDoRISEDispensariesOfferWeedDeliveryCTA() {
		try {
			jsClick(DoRISEDispensariesOfferWeedDeliveryCTA);
			Logger.log("Clicked on Do RISE Dispensaries Offer Weed Delivery CTA");
		} catch (Exception e) {
			Logger.log("Didn't Click on Do RISE Dispensaries Offer Weed Delivery CTA");
		}
	}
	public void ClickOnHowCanIOrderWeedOnlineCTA() {
		try {
			jsClick(HowCanIOrderWeedOnlineCTA);
			Logger.log("Clicked on How Can I Order Weed On line CTA");
		} catch (Exception e) {
			Logger.log("Didn't Click on How Can I Order Weed On line CTA");
		}
	}

	public void ClickOnDoesRISEHaveAnewPatientDiscountCTA() {
		try {
			jsClick(DoesRISEHaveAnewPatientDiscountCTA);
			Logger.log("Clicked on Does RISE Have Anew Patient Discount CTA");
		} catch (Exception e) {
			Logger.log("Didn't Click on Does RISE Have Anew Patient Discount CTA");
		}
	}

	public void ClickOnDoRISEdispensariesOfferDiscountsDdealsAndCouponsCTA() {
		try {
			jsClick(DoRISEdispensariesOfferDiscountsDdealsAndCouponsCTA);
			Logger.log("Clicked on Do RISE dispensaries Offer Discounts Ddeals And Coupons CTA");
		} catch (Exception e) {
			Logger.log("Didn't Click on Do RISE dispensaries Offer Discounts Ddeals And Coupons CTA");
		}
	}

	/*
	 * My Category
	 */
	public void ClickOnMyCategoryCTA() {
		try {
			jsClick(MyCategoryCTA);
			Logger.log("Clicked on My Category CTA");
		} catch (Exception e) {
			Logger.log("Didn't Click on My Category CTA");
		}
	}
	public void ClickOnFirstQuestionCTA() {
		try {
			jsClick(FirstQuestionCTA);
			Logger.log("Clicked on First Question CTA");
		} catch (Exception e) {
			Logger.log("Didn't Click on First Question CTA");
		}
	}
}