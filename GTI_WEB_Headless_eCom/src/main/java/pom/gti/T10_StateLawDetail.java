package pom.gti;

import com.resuableMethods.CommonAction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class T10_StateLawDetail extends CommonAction {
    public T10_StateLawDetail(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    /*
     * Element
     */
    @FindBy(xpath = "//a[text()='STATE LAWS']")
    private WebElement stateLawOption;
    @FindBy(xpath = "//h2[text()='State Law Page']")
    private WebElement stateLawIndexPageHeader;
    @FindBy(xpath = "//a[text()='Read More' and @button-type='primary']/parent::div/parent::div/parent::div/parent::div")
    private WebElement stateLawIndexPageHeroSection;
    @FindBy(xpath = "//a[text()='Read More' and @button-type='primary']")
    private WebElement stateLawIndexPageHeroSectionReadMoreCTA;
    @FindBy(xpath = "//h2[text()='IS MARIJUANA LEGAL IN ILLINOIS?']")
    private WebElement stateLawDetailPageHeader;
    @FindBy(xpath = "//h2[text()='IS MARIJUANA LEGAL IN ILLINOIS?']/parent::div/parent::div/parent::div/parent::div/child::div[@role='img']")
    private WebElement stateLawDetailHeroArticleBannerImage;
    @FindBy(xpath = "//h2[text()='IS MARIJUANA LEGAL IN ILLINOIS?']/parent::div/child::p")
    private WebElement stateLawDetailHeroArticleOverviewText;
    @FindBy(xpath = "//h2[text()='IS MARIJUANA LEGAL IN ILLINOIS?']/parent::div/parent::div/child::div[1]/child::label[3]")
    private WebElement stateLawDetailHeroArticleBannerDate;
    @FindBy(xpath = "//h2[text()='IS MARIJUANA LEGAL IN ILLINOIS?']/parent::div/parent::div/child::div[1]/child::label[@data-testid='newlabel-test']")
    private WebElement stateLawDetailHeroArticleBannerNewLabel;
    @FindBy(xpath = "//h2[text()='IS MARIJUANA LEGAL IN ILLINOIS?']/parent::div/parent::div/child::div[1]/child::label[2]")
    private WebElement stateLawDetailHeroArticleBannerLabel;
    @FindBy(xpath = "//h2[@id='toc_history_of_marijuana’s_legality_in_virginia']")
    private WebElement historyOfMarijuanaLegalityInVirginiaHeader;
    @FindBy(xpath = "//h2[@id='toc_adult_use_marijuana']")
    private WebElement adultUseMarijuanaHeader;
    @FindBy(xpath = "//div[@data-testid='imagesection']")
    private WebElement bigImageStateLawDetail;
    @FindBy(xpath = "//h2[@id='toc_what_is_still_illegal?']")
    private WebElement whatIsStilIllegalHeader;
    /*
     * Mobile
     */
    @FindBy(xpath = "//h5[text()='STATE LAWS']")
    private WebElement stateLawOptionMobile;

    /*
     * getter & setter
     */
    public WebElement getStateLawOption(){
        return stateLawOption;
    }
    public WebElement getStateLawIndexPageHeader(){
        return stateLawIndexPageHeader;
    }
    public WebElement getStateLawIndexPageHeroSection(){
        return stateLawIndexPageHeroSection;
    }
    public WebElement getStateLawIndexPageHeroSectionReadMoreCTA(){
        return stateLawIndexPageHeroSectionReadMoreCTA;
    }
    public WebElement getStateLawDetailPageHeader(){
        return stateLawDetailPageHeader;
    }
    public WebElement getStateLawDetailHeroArticleBannerImage(){
        return stateLawDetailPageHeader;
    }
    public WebElement getStateLawDetailHeroArticleOverviewText(){
        return stateLawDetailHeroArticleOverviewText;
    }
    public WebElement getStateLawDetailHeroArticleBannerDate(){
        return stateLawDetailHeroArticleBannerDate;
    }
    public WebElement getStateLawDetailHeroArticleBannerNewLabel(){
        return stateLawDetailHeroArticleBannerNewLabel;
    }
    public WebElement getStateLawDetailHeroArticleBannerLabel(){
        return stateLawDetailHeroArticleBannerLabel;
    }
    public WebElement getHistoryOfMarijuanaLegalityInVirginiaHeader(){
        return historyOfMarijuanaLegalityInVirginiaHeader;
    }
    public WebElement getAdultUseMarijuanaHeader(){
        return adultUseMarijuanaHeader;
    }
    public WebElement getBigImageStateLawDetail(){
        return bigImageStateLawDetail;
    }
    public WebElement getWhatIsStilIllegalHeader(){
        return whatIsStilIllegalHeader;
    }
    /*
     * getter & setter mobile
     */
    public WebElement getStateLawOptionMobile(){
        return stateLawOptionMobile;
    }
}
