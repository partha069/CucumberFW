package pom.gti;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resuableMethods.CommonAction;

public class Footer_Desktop extends CommonAction{
	public Footer_Desktop(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//div[@class='undefined w-full '])[2]")
	private static WebElement Footersection;

	@FindBy(xpath = "//a[text()='Home']")
	private WebElement FooterHometext;

	@FindBy(xpath = "(//a[text()='Shop'])[2]")
	private WebElement footershoptext;

	@FindBy(xpath = "(//a[text()='Rewards'])[2]")
	private WebElement Footerrewardstext;

	@FindBy(xpath = "//a[text()='Cannabis Insider']")
	private WebElement Footercannabisinsidertext;

	@FindBy(xpath = "(//*[text()='Dispensaries'])[2]")
	private WebElement footerdispensariestext;

	@FindBy(xpath = "//img[@alt='Footer Logo.png']")
	private WebElement Footerlogo;


	@FindBy(xpath = "(//*[text()='Customer Center'])[1]")
	private static WebElement FooterCustomerCenter;

	@FindBy(xpath = "//*[text()='Contact Us']")
	private WebElement footercontactus;

	@FindBy(xpath = "//*[text()='FAQ']")
	private WebElement footerfaq;

	@FindBy(xpath = "//*[text()='Terms of Use']")
	private WebElement footertermsofuse;

	@FindBy(xpath = "//*[text()='Privacy Policy']")
	private WebElement footerprivacypolicy;

	@FindBy(xpath = "//*[text()='Notice of Privacy Practices']")
	private WebElement footerNoticeofPrivacyPractices;

	@FindBy(xpath = "//*[text()='Chat with us']")
	private WebElement Footerchatwithus;


	@FindBy(xpath = "//*[text()='Careers']")
	private WebElement Footercareers;

	@FindBy(xpath = "//*[@id='instagram-icon']")
	private WebElement Footerinstagramicon;

	@FindBy(xpath = "//*[@id='facebook-icon']")
	private WebElement Footerfacebookicon;

	@FindBy(xpath = "//*[@id='twitter-icon']")
	private WebElement Footertwittericon;








	public WebElement Getfootersection() {
		return Footersection;
	}

	public WebElement getFooterhometext() {
		return FooterHometext;
	}

	public WebElement getfootershoptext() {
		return footershoptext;
	}

	public WebElement getFooterrewardstext() {
		return Footerrewardstext;
	}

	public WebElement getFootercannabisinsidertext() {
		return Footercannabisinsidertext;
	}

	public WebElement getfooterdispensariestext() {
		return footerdispensariestext;
	}

	public WebElement getFooterlogo() {
		return Footerlogo;
	}


	public static WebElement getFooterCustomerCenter() {
		return FooterCustomerCenter;
	}

	public WebElement getfootercontactus() {
		return footercontactus;
	}

	public WebElement getfooterfaq() {
		return footerfaq;
	}

	public WebElement getfootertermsofuse() {
		return footertermsofuse;
	}

	public WebElement getfooterprivacypolicy() {
		return footerprivacypolicy;
	}

	public WebElement getfooterNoticeofPrivacyPractices() {
		return footerNoticeofPrivacyPractices;
	}

	public WebElement getFooterchatwithus() {
		return Footerchatwithus;
	}

	public WebElement getFootercareers() {
		return Footercareers;
	}

	public WebElement getFooterinstagramicon() {
		return Footerinstagramicon;
	}

	public WebElement getFooterfacebookicon() {
		return Footerfacebookicon;
	}

	public WebElement getFootertwittericon() {
		return Footertwittericon;
	}




}
