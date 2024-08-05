package pom.gti;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resuableMethods.CommonAction;
import com.utilities.Logger;

import java.util.List;

public class Header extends CommonAction{

	public Header(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath = "//*[@data-testid='age-gate-container']/child::div/following-sibling::div/child::div/following-sibling::div/child::div[2]/child::div/child::div[2]")
	private WebElement AgeGateYes_CTA;

	@FindBy(xpath = "//*[@data-testid='age-gate-container']/child::div/following-sibling::div/child::div/following-sibling::div/child::div[2]/child::div/child::div[1]")
	private WebElement AgeGateNO_CTA;

	@FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
	private WebElement CookiegateAcceptcta;

	@FindBy(xpath = "//*[@data-testid='header-wrapper']")
	private WebElement globalheader;

	@FindBy(xpath = "(//*[@stroke='currentColor'])[6]")
	private static WebElement whiteheadersearchcolor;

	@FindBy(xpath = "//*[@class='slick-list']")
	private WebElement herocarousel;

	@FindBy(xpath = "(//*[text()='Shop'])[1]")
	private static WebElement headershoptext;
	@FindBy(xpath = "(//*[text()='Rewards'])[1]")
	private static WebElement headerrewards;

	@FindBy(xpath = "//*[@data-testid='header-image']")
	private static WebElement whiteheaderlogo;

	@FindBy(xpath = "(//*[@stroke='currentColor'])[7]")
	private static WebElement whiteheaderaccounticon;

	@FindBy(xpath = "//*[text()='OUR CANNABIS PRODUCTS']")
	private WebElement scrolltocategoryheader;
	@FindBy(xpath = "//button[@data-testid='extended-menu-button']")
	private static WebElement HamburgerMenu;
	@FindBy(xpath = "(//a[@class='flex w-full flex-row items-center justify-between'])[2]")
	private static WebElement RewardsCTA_HamburgerMenu;


	@FindBy(xpath = "//*[@data-testid='header-image']")
	private static WebElement greenheaderlogo;

	@FindBy(xpath = "(//*[@stroke='currentColor'])[7]")
	private static WebElement greenheaderaccounticon;
	@FindBy(xpath = "//*[@alt='Footer Logo.png']")
	private WebElement footerlogo;
	@FindBy(xpath = "//*[@data-testid='header-image']")
	private WebElement minnesotaheaderlogo;


	//Expanded shop

	@FindBy(xpath = "//*[@data-testid='header-shop']")
	private WebElement expandedshop;
	@FindBy(xpath = "//*[text()='Categories']")
	private static WebElement expandedshopcategories;

	@FindBy(xpath = "//*[text()='Brands']")
	private WebElement expandedshopbrands;

	@FindBy(xpath = "//*[text()='Usages']")
	private WebElement expandedshopusages;

	@FindBy(xpath = "//*[text()='Deals']")
	private WebElement expandedshopDeals;

	@FindBy(xpath = "//*[text()='All products']")
	private WebElement ExpandedshopAllproducts;

	@FindBy(xpath = "//*[text()='CANNABIS INSIDER']")
	private static WebElement Headercannabisinsider;


	//Expanded cannabis insider

	@FindBy(xpath = "//*[text()='Dispensary Guide']")
	private WebElement expandedcannabisinsiderdispensaryguid;

	@FindBy(xpath = "//*[text()='Getting A Medical Card']")
	private WebElement expandedcannabisinsidermedicalcard;

	@FindBy(xpath = "//*[text()='STATE LAWS']")
	private WebElement expandedcannabisinsiderstatelaws;

	@FindBy(xpath = "//*[text()='RECIPES']")
	private WebElement Expandedcannabisinsiderrecipes;

	@FindBy(xpath = "//*[text()='BLOGS']")
	private WebElement expandedcannabisinsiderblogs;


	/*
	 * Expanded Dipensaries
	 */

	@FindBy(xpath = "(//*[text()='Dispensaries'])[1]")
	private static WebElement headerdispensaris;

	@FindBy(xpath = "(//*[text()='Dispensaries'])[2]")
	private static WebElement DispensariesMobile;

	@FindBy(xpath = "//*[@data-testid='header-dispensaries']/div/ul")
	private static WebElement Dispensaries_StateList;

	@FindBy(xpath = "//*[text()='California']")
	private WebElement expandeddispensariescalifornia;

	@FindBy(xpath = "//*[text()='Connecticut']")
	private WebElement expandeddispensariesConnecticut;

	@FindBy(xpath = "//*[text()='Florida']")
	private WebElement expandeddispensariesFlorida;

	@FindBy(xpath = "//*[text()='Illinois']")
	private WebElement expandeddispensariesIllinois;

	@FindBy(xpath = "//*[text()='Illinois']")
	private static WebElement IllinoisStateOption;
	@FindBy(xpath = "//*[@class='col-start-4 col-end-10 grid grid-cols-7 gap-4']/ul")
	private static WebElement State_Dispensaries_List;

	@FindBy(xpath = "(//*[text()='RISE Dispensary Mundelein'])[1]")
	private static WebElement Dispensary_Mundelein;
	@FindBy(xpath = "//*[text()='Maryland']")
	private WebElement expandeddispensariesMaryland;

	@FindBy(xpath = "//*[text()='Massachusetts']")
	private WebElement expandeddispensariesMassachusetts;

	@FindBy(xpath = "//*[text()='Minnesota']")
	private WebElement expandeddispensariesMinnesota;

	@FindBy(xpath = "//*[text()='Nevada']")
	private WebElement expandeddispensariesNevada;

	@FindBy(xpath = "//*[text()='New Jersey']")
	private WebElement expandeddispensariesNewJersey;

	@FindBy(xpath = "//*[text()='New York']")
	private WebElement expandeddispensariesNewYork;

	@FindBy(xpath = "//*[text()='Ohio']")
	private WebElement expandeddispensariesOhio;

	@FindBy(xpath = "//*[text()='Pennsylvania']")
	private WebElement expandeddispensariesPennsylvania;

	@FindBy(xpath = "//*[text()='Rhode Island']")
	private WebElement expandeddispensariesRhodeIsland;

	@FindBy(xpath = "//*[text()='Virginia']")
	private static WebElement expandeddispensariesVirginia;

	@FindBy(xpath = "//*[@data-testid='up-arrow']")
	private WebElement dispensaryclosearrow;
	@FindBy(xpath = "(//*[@data-nimg='intrinsic'])[2]")
	private WebElement dispensaryimage;

	@FindBy(xpath = "//*[text()='RISE Dispensary Eagan']")
	private  WebElement minnesotaeagandispensary;
	@FindBy(xpath = "//*[text()='RISE Dispensary Cleveland']")
	private  WebElement ohioClevelanddispensary;
	@FindBy(xpath = "(//*[@buttontype='primary'])[1]")
	private WebElement expandedmenubackicon;
	@FindBy(xpath = "//*[@data-testid='extended-menu-button']")
	private WebElement expandedmenucloseicon;
	@FindBy(xpath = "//*[@class='col-start-4 col-end-10 grid grid-cols-7 gap-4']/ul/li")
	private List<WebElement> expandedDispensariesForVirginiaState;
	@FindBy(xpath = "//*[@class='flex flex-col gap-8 pt-2 px-5 h-[425px] overflow-y-scroll']/li")
	private List<WebElement> expandedDispensariesForVirginiaStateMobile;
	@FindBy(xpath = "//*[text()='RISE Dispensary Salem']")
	private static WebElement RiseDispensarySalemOption;



	/*
	Header navigation
	 */
	@FindBy(xpath = "//*[@data-testid='rewards_hero_bg_img']")
	private WebElement rewardsheroimage;




	/*
	 * Age gate and cookie gate
	 */
	public WebElement getyescta() {
		return AgeGateYes_CTA;
	}

	public WebElement getNocta() {
		return AgeGateNO_CTA;
	}
	public WebElement getacceptcta() {
		return CookiegateAcceptcta;
	}
	public WebElement getherocarousel() {
		return herocarousel;
	}

	/*
	 * Header color validation
	 */
	public WebElement getheader() {
		return globalheader;
	}
	public static WebElement getwhiteheadersearchcolor() {
		return whiteheadersearchcolor;
	}
	public static WebElement getwhiteheadershoptextcolor() {
		return headershoptext;
	}
	public static WebElement getheaderrewards(){
		return headerrewards;
	}
	public WebElement getwhiteheaderlogo() {
		return whiteheaderlogo;
	}
	public static WebElement getwhiteheaderaccounticon() {
		return whiteheaderaccounticon;
	}
	public WebElement getscrolltocategoryheader() {
		return scrolltocategoryheader;
	}
	public WebElement getgreenheaderlogo() {
		return greenheaderlogo;
	}
	public static WebElement getgreenheaderaccounticon() {
		return greenheaderaccounticon;
	}
	public WebElement getminnesotaheaderlogo() {
		return minnesotaheaderlogo;
	}

	/*
	 * Header expanded navigation validation
	 */

	public WebElement getHamburgerMenu(){
		return HamburgerMenu;
	}
	public WebElement getexpandedshop(){
		return expandedshop;
	}
	public WebElement getheadershop() {
		return headershoptext;
	}
	public WebElement getexpandedshopcategories() {
		return expandedshopcategories;
	}
	public WebElement getexpandedshopbrands() {
		return expandedshopbrands;
	}
	public WebElement getexpandedshopusages() {
		return expandedshopusages;
	}
	public WebElement getexpandedshopDeals() {
		return expandedshopDeals;
	}
	public WebElement getExpandedshopAllproducts() {
		return ExpandedshopAllproducts;
	}
	public static WebElement getHeadercannabisinsider() {
		return Headercannabisinsider;
	}
	public WebElement getexpandedcannabisinsiderdispensaryguide() {
		return expandedcannabisinsiderdispensaryguid;
	}
	public WebElement getexpandedcannabisinsidermedicalcard() {
		return expandedcannabisinsidermedicalcard;
	}
	public WebElement getexpandedcannabisinsiderstatelaws() {
		return expandedcannabisinsiderstatelaws;
	}
	public WebElement getExpandedcannabisinsiderrecipes() {
		return Expandedcannabisinsiderrecipes;
	}
	public WebElement getexpandedcannabisinsiderblogs() {
		return expandedcannabisinsiderblogs;
	}
	public static WebElement getHeaderdispensaris(){ return headerdispensaris; }
	public WebElement DispensariesMobile() {
		return DispensariesMobile;
	}
	public WebElement getDispensariesStateList() {
		return Dispensaries_StateList;
	}

	public List<WebElement> getExpandedDispensariesForVirginiaState() {
		return expandedDispensariesForVirginiaState;
	}
	public List<WebElement> getExpandedDispensariesForVirginiaStateMobile() {
		return expandedDispensariesForVirginiaStateMobile;
	}
	public WebElement getRiseDispensarySalemOption() {
		return RiseDispensarySalemOption;
	}



	public WebElement getrewardsheroimage(){
		return rewardsheroimage;
	}
	public WebElement getfooterlogo(){
		return  footerlogo;
	}
	public WebElement getexpandeddispensariescalifornia(){return  expandeddispensariescalifornia;}
	public WebElement GetexpandeddispensariesConnecticut() { return expandeddispensariesConnecticut;}
	public WebElement getexpandeddispensariesFlorida(){return expandeddispensariesFlorida;}
	public WebElement getexpandeddispensariesIllinois(){return expandeddispensariesIllinois;}
	public WebElement getexpandeddispensariesMaryland(){return expandeddispensariesMaryland;}
	public WebElement getexpandeddispensariesMassachusetts(){return expandeddispensariesMassachusetts;}
	public WebElement getexpandeddispensariesMinnesota(){return expandeddispensariesMinnesota;}
	public WebElement getexpandeddispensariesNevada(){return expandeddispensariesNevada;}
	public WebElement getexpandeddispensariesNewJersey(){return expandeddispensariesNewJersey;}
	public WebElement getexpandeddispensariesNewYork(){return expandeddispensariesNewYork;}
	public WebElement getexpandeddispensariesOhio(){return expandeddispensariesOhio;}
	public WebElement getexpandeddispensariesPennsylvania(){return expandeddispensariesPennsylvania;}
	public WebElement getexpandeddispensariesRhodeIsland(){return expandeddispensariesRhodeIsland;}
	public WebElement getexpandeddispensariesVirginia(){return expandeddispensariesVirginia;}
	public WebElement getdispensaryclosearrow(){
		return dispensaryclosearrow;
	}
	public  WebElement getminnesotaeagandispensary(){
		return minnesotaeagandispensary;
	}
	public WebElement getdispensaryimage(){
		return dispensaryimage;
	}
	public WebElement getohioClevelanddispensary(){
		return ohioClevelanddispensary;
	}
	public WebElement getexpandedmenubackicon(){
		return expandedmenubackicon;
	}
	public WebElement getexpandedmenucloseicon(){
		return expandedmenucloseicon;
	}
	public WebElement getIllinoisStateOption() {
		return IllinoisStateOption;
	}
	public WebElement getState_Dispensaries_ListA() {
		return State_Dispensaries_List;
	}












	/*
	 * Age gate and cookie gate
	 */
	public void clickyescta() {
		try {
			jsClick(AgeGateYes_CTA);
			Logger.log("User clicked yes cta");
		} catch (Exception e) {
			Logger.log("User not ble to click the yes cta");
		}
	}

	public void clicknocta() {
		try {
			jsClick(AgeGateNO_CTA);
			Logger.log("User clicked yes cta");
		} catch (Exception e) {
			Logger.log("User not ble to click the yes cta");
		}
	}

	public static void ClickOnHambergerMenu() {
		try {
			jsClick(HamburgerMenu);
			Logger.log("Clicked on Hamberger Menu");
		} catch (Exception e) {
			Logger.log("Didn't Click on Hamberger Menu");
		}
	}

	public static void ClickOnRewardsCTAHamburgerMenu() {
		try {
			clickOn(RewardsCTA_HamburgerMenu);
			Logger.log("Clicked on Rewards CTA Mobile");
		} catch (Exception e) {
			Logger.log("Didn't Click on Rewards CTA Mobile");
		}
	}

	public static void ClickOnRewards() {
		try {
			jsClick(headerrewards);
			Logger.log("Clicked on Rewards on Global Header");
		} catch (Exception e) {
			Logger.log("Didn't Click on Rewards on Global Header");
		}
	}

	public static void ClickOnRiseDispensarySalemOption() {
		try {
			jsClick(RiseDispensarySalemOption);
			Logger.log("Clicked on Rise Dispensary Salem Option");
		} catch (Exception e) {
			Logger.log("Clicked on Rise Dispensary Salem Option");
		}
	}



	public void clickhambergurmenuclose_CTA(){
		try {
			jsClick(expandedmenucloseicon);
			Logger.log("Clicked hambuger menu close icon");
		}catch (Exception e){
			Logger.log("Didn't Click on Hamberger Menu close icon");

		}
	}

	public static void ClickOnDispensariesMobile() {
		try {
			jsClick(DispensariesMobile);
			Logger.log("Clicked on Dispensaries on Global Header");
		} catch (Exception e) {
			Logger.log("Didn't Click on Dispensaries on Global Header");
		}
	}
	public static void ClickOnDispensaries() {
		try {
			jsClick(headerdispensaris);
			Logger.log("Clicked on Dispensaries on Global Header");
		} catch (Exception e) {
			Logger.log("Didn't Click on Dispensaries on Global Header");
		}
	}

	public static void ClickOnIllinoisState() {
		try {
			jsClick(IllinoisStateOption);
			Logger.log("Clicked on Illinois State");
		} catch (Exception e) {
			Logger.log("Didn't Click on Illinois State");
		}
	}
	public static void ClickOnDispensaryMundeleinList() {
		try {
			jsClick(Dispensary_Mundelein);
			Logger.log("Clicked on Dispensary_Mundelein List");
		} catch (Exception e) {
			Logger.log("Didn't Click on Dispensary_Mundelein List");
		}
	}

	public static void ClickOnVirginia() {
		try {
			jsClick(expandeddispensariesVirginia);
			Logger.log("Clicked on Dispensary_Mundelein List");
		} catch (Exception e) {
			Logger.log("Didn't Click on Dispensary_Mundelein List");
		}
	}



	/*
	 * Header color validation
	 */
	public void headercolor() {
		try {
			String headercolor1 =getheader().getCssValue("background-color");
			Assert.assertEquals("rgba(255, 255, 255, 1)",headercolor1);
			Logger.log("Verified the white header color is matched");
		} catch (Exception e) {
			Logger.log("White header color is not matching");
		}
	}
	public static void whiteheadersearchiconcolor() {
		try {
			String headersearchicon =getwhiteheadersearchcolor().getCssValue("color");
			Assert.assertEquals("rgba(0, 70, 30, 1)",headersearchicon);
			Logger.log("Verified the white header search icon color is matched");
		} catch (Exception e) {
			Logger.log("White header search icon color is not matching");
		}
	}
	public static void whiteheadertextcolor() {

		String headershoptextcolor =getwhiteheadershoptextcolor().getCssValue("color");
		Assert.assertEquals("rgba(0, 70, 30, 1)",headershoptextcolor);
		Logger.log("Verified the white header shop text color is matched");

		String headerrewardstextcolor =getheaderrewards().getCssValue("color");
		Assert.assertEquals("rgba(0, 70, 30, 1)",headerrewardstextcolor);
		Logger.log("Verified the white header rewards text color is matched");

		String headercannabisinsidertextcolor = getHeadercannabisinsider().getCssValue("color");
		Assert.assertEquals("rgba(0, 70, 30, 1)",headercannabisinsidertextcolor);
		Logger.log("Verified the white header cannabis insider text color is matched");

		String headerdispensariestextcolor = getHeaderdispensaris().getCssValue("color");
		Assert.assertEquals("rgba(0, 70, 30, 1)",headerdispensariestextcolor);
		Logger.log("Verified the white header dispensaries text color is matched");

	}
	public void whiteheaderlogo() {
		try {
			Assert.assertTrue(getwhiteheaderlogo().isDisplayed());
			Logger.log("verified white header logo displayed");
		} catch (Exception e) {
			Logger.log("Verified white header is not displayed");
		}
	}

	public static void whiteheaderaccounticon() {
		try {
			String whitecolorheaderaccounticon = getgreenheaderaccounticon().getCssValue("color");
			Assert.assertEquals("rgba(0, 70, 30, 1)",whitecolorheaderaccounticon);
			Logger.log("Verified white header account icon is matched");
		} catch (Exception e) {
			Logger.log("White header account icon is not matched");
		}
	}


	public void greenheadercolor() {
		try {

			String headertextcolor =getheader().getCssValue("background-color");
			Assert.assertEquals("rgba(0, 70, 30, 1)",headertextcolor);
			Logger.log("Verified green header color is matched");
		} catch (Exception e) {
			Logger.log("Verified green header color is not matched");
		}
	}

	public static void greenheaderaccounticon() {
		try {
			String greenheaderaccounticon = getgreenheaderaccounticon().getCssValue("color");
			Assert.assertEquals("rgba(255, 255, 255, 1)", greenheaderaccounticon);
			Logger.log("Verified green header account icon color is matched");
		} catch (Exception e) {
			Logger.log("Green header account icon is not matched");
		}
	}


	/*
	 * Header expanded navigation validation
	 */
	public void clickheadershop() {
		try {
			jsClick(getheadershop());
			Logger.log("User clicked shop from header");
		} catch (Exception e) {
			Logger.log("Not able to click the shop from header");
		}
	}

	public void clickHeadercannabisinsider() {
		jsClick(getHeadercannabisinsider());
	}
	public void clickheaderdispensary() {
		jsClick(getHeaderdispensaris());
		Logger.log("User clicks th dispensary from header");
	}
	public void clickheaerlogo(){
		jsClick(getwhiteheaderlogo());
		Logger.log("User clicked header logo");
	}

	public void clickfooterlogo(){
		jsClick(getfooterlogo());
		Logger.log("user clicks on the Rise logo from the footer");
	}
	public void clickMinnesota(){
		jsClick(getexpandeddispensariesMinnesota());
		Logger.log("User clicks on Minnesota from the state list");
	}
	public void clickohiodispensary(){
		jsClick(getexpandeddispensariesOhio());
	}
	public void clickdispensaryclosearrow(){
		jsClick(getdispensaryclosearrow());
		Logger.log("User clicked dispensary close arrow");
	}
	public void clickminnesotaeagandispensary(){
		jsClick(getminnesotaeagandispensary());
		Logger.log("User clicked minnesota eagan dispensary");
	}
	public void clickohioClevelanddispensary(){
		jsClick(getohioClevelanddispensary());
		Logger.log("user clicked ohio Cleveland dispensary");
	}
	public void clickexpandedmenubackicon(){
		jsClick(getexpandedmenubackicon());
		Logger.log("User clicked back button");
	}

}
