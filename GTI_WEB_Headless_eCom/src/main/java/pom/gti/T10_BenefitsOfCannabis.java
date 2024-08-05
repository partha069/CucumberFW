package pom.gti;

import com.resuableMethods.CommonAction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class T10_BenefitsOfCannabis extends CommonAction {
    public T10_BenefitsOfCannabis(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    /*
     * Element
     */
    @FindBy(xpath = "//h5[text()='THE BENEFITS OF CANNABIS']/parent::div/child::a")
    private WebElement benefitsOfCannabisRecommendedResourcescta;
    @FindBy(xpath = "//h5[text()='WHAT’S RIGHT FOR ME?']")
    private WebElement whasrightformeRecommendedResources;
    @FindBy(xpath = "//h2[text()='The Benefits of Cannabis']")
    private WebElement benefitsOfCannabisHeader;
    @FindBy(xpath = "//*[text()='Back to ']/parent::div/child::a")
    private WebElement breadcrumb;
    @FindBy(xpath = "//h2[text()='The Benefits of Cannabis']/parent::div/parent::div/parent::div/parent::div/child::div[@role='img']")
    private WebElement heroArticleBannerImage;
    @FindBy(xpath = "//h2[text()='The Benefits of Cannabis']/parent::div/child::p")
    private WebElement heroArticleOverviewText;
    @FindBy(xpath = "//h5[text()='Content']/parent::div/parent::div/parent::div/parent::div/following-sibling::div[@id='tocEnd']/child::div/child::div/child::div[@data-testid='richtextcomponent']")
    private List<WebElement> richtextList;
    @FindBy(xpath = "//h5[text()='Content']")
    private WebElement contentHeader;
    @FindBy(xpath = "//h2[text()='The Benefits of Cannabis']/parent::div/parent::div/child::div[1]/child::label[3]")
    private WebElement heroArticleBannerDate;
    @FindBy(xpath = "//h2[text()='The Benefits of Cannabis']/parent::div/parent::div/child::div[1]/child::label[@data-testid='newlabel-test']")
    private WebElement heroArticleBannerNewLabel;
    @FindBy(xpath = "//h2[text()='The Benefits of Cannabis']/parent::div/parent::div/child::div[1]/child::label[2]")
    private WebElement heroArticleBannerLabel;
    @FindBy(xpath = "//h5[text()='Content']/parent::div/child::div/child::div")
    private List<WebElement> tableOfContentList;
    @FindBy(xpath = "//h2[@id='toc_understanding_the_benefits_of_marijuana_']")
    private WebElement understandingTheBenefitsOfMarijuanaHeader;
    @FindBy(xpath = "//div[@data-testid='section-banner']")
    private WebElement c09Banner;
    @FindBy(xpath = "//blockquote[contains(@class,'relative max-w-[736px]')]")
    private WebElement quoteParagraph;
    @FindBy(xpath = "//blockquote[contains(@class,'relative max-w-[736px]')]/child::h3")
    private WebElement quoteParagraphText;
    @FindBy(xpath = "//div[@data-testid='sectionfaq']")
    private List<WebElement> accordionsFaqList;
    @FindBy(xpath = "//div[@data-testid='sectionfaq']/child::button")
    private List<WebElement> accordionsFaqButtonList;
    @FindBy(xpath = "//div[@data-testid='sectionfaq']/child::button/child::span")
    private List<WebElement> accordionFaqButtonPlusIcon;
    @FindBy(xpath = "//div[@data-testid='sectionfaq']/child::button/following-sibling::div")
    private List<WebElement> accordionFaqAnswerList;
    @FindBy(xpath = "//div[@data-testid='sectionfaq']/button/child::span[*]/child::div/child::*/child::*[@d='M5 11h14v2H5z']")
    private WebElement accordionFaqMinusIcon;
    @FindBy(xpath = "//figcaption[text()='Benefits-Of-Marijuana Description ']/parent::div/child::span/child::img")
    private WebElement bigImage;
    @FindBy(xpath = "//figcaption[text()='Benefits-Of-Marijuana Description ']")
    private WebElement bigImageDescription;
    @FindBy(xpath = "//div[@data-testid='imagesection']")
    private WebElement smallImage;
    @FindBy(xpath = "//h2[@id='toc_grid_gallery']")
    private WebElement gridGalleryHeader;
    @FindBy(xpath = "//div[@data-testid='gallery']/child::div[@data-testid='grid-image']/child::div")
    private WebElement gridImage;
    @FindBy(xpath = "//div[@data-testid='gallery']/child::div[@data-testid='grid-image']/child::div/child::button")
    private List<WebElement> gridEachImageList;
    @FindBy(xpath = "//h2[@id='toc_sources']")
    private WebElement sourceTOCHeader;
    @FindBy(xpath = "//h3[text()='Sources']/parent::div/following-sibling::div/child::div[1]/child::div[@data-testid='sources-card']")
    private List<WebElement> sourceCardList;
    @FindBy(xpath = "//h3[text()='Sources']/parent::div/following-sibling::div/child::div[1]/child::div[@data-testid='sources-card']/div")
    private List<WebElement> sourceCardTitleAndIconList;
    @FindBy(xpath = "//h3[text()='Sources']/parent::div/following-sibling::div/child::div[1]/child::div[@data-testid='sources-card']/p")
    private List<WebElement> sourceCardCopyTextList;
    @FindBy(xpath = "//h3[text()='Sources']/parent::div/following-sibling::div/child::div[2]/child::div")
    private WebElement sourceProgressbar;
    @FindBy(xpath = "//h3[text()='Sources']/parent::div/following-sibling::div/child::div[2]/child::div/child::div[3]/*[@data-testid='next-icon']")
    private WebElement sourceRightArrowCTA;
    @FindBy(xpath = "//h3[text()='Sources']/parent::div/following-sibling::div/child::div[2]/child::div/child::div[3]/*[@data-testid='prev-icon']")
    private WebElement sourceLeftArrowCTA;
    @FindBy(xpath = "//h3[text()='Sources']/parent::div/following-sibling::div/child::div[2]/child::div/child::div[1]")
    private WebElement sourceProgressIndicator;
    @FindBy(xpath = "//h2[@id='toc_the_medical_benefit_of_the_marijuana_plant_in_the_scientific_literature_']")
    private WebElement the_medical_benefit_of_the_marijuana_plant_in_the_scientific_literatureHeader;
    @FindBy(xpath = "//div[@data-testid='section-banner']/child::div/child::div/child::div/child::div[1]/child::div[1]/child::p[contains(text(),'Rewards members')]")
    private WebElement c09BannerSmallText;
    @FindBy(xpath = "//div[@data-testid='section-banner']/child::div/child::div/child::div/child::div[1]/child::div[1]/child::h3")
    private WebElement c09BannerTextTitle;
    @FindBy(xpath = "//div[@data-testid='section-banner']/child::div/child::div/child::div/child::div[1]/child::div[2]/child::a")
    private WebElement c09BannerCTA;
    @FindBy(xpath = "//h3[text()='Test Title']/parent::div/parent::div/parent::div")
    private WebElement productCarousel;
    @FindBy(xpath = "//h3[text()='Test Title']")
    private WebElement productCarouselTitleText;
    @FindBy(xpath = "//h3[text()='Test Title']/parent::div/parent::div/parent::div/child::div[2]")
    private WebElement productCarouselcard;
    @FindBy(xpath = "//h3[text()='Test Title']/parent::div/parent::div/parent::div/child::div[2]")
    private WebElement productCarouselProgressBar;
    @FindBy(xpath = "//h3[text()='Test Title']/parent::div/parent::div/parent::div/child::div[1]/child::div[1]/child::a")
    private WebElement productCarouselCTA;
    @FindBy(xpath = "//h3[text()='Test Title']/parent::div/parent::div/parent::div/child::div[2]/child::div/child::div/child::div")
    private List<WebElement> carouselProductCardList;
    @FindBy(xpath = "//h3[text()='Test Title']/parent::div/parent::div/parent::div/child::div[1]/child::div[2]/child::div[3]/*[@data-testid='next-icon']")
    private WebElement productCarouselRightArrowCTA;
    @FindBy(xpath = "//h3[text()='Test Title']/parent::div/parent::div/parent::div/child::div[1]/child::div[2]/child::div[3]/*[@data-testid='prev-icon']")
    private WebElement productCarouselLeftArrowCTA;
    @FindBy(xpath = "//h3[text()='Test Title']/parent::div/parent::div/parent::div/child::div[2]/child::div/child::div/child::div[@data-index='0']/child::div/child::div/child::div[2]/child::button")
    private WebElement addToCartFirstCTA;
    @FindBy(xpath = "//h3[@data-testid='article-cards-title']")
    private WebElement articleCardHeader;
    @FindBy(xpath = "//h3[@data-testid='article-cards-title']/parent::div/following-sibling::div[@data-testid='article-cards']")
    private List<WebElement> articleCardList;
    @FindBy(xpath = "//h3[@data-testid='article-cards-title']/parent::div/following-sibling::div[@data-testid='article-cards']/child::div/child::div[1]/child::span/child::img[@data-testid='card-image']")
    private List<WebElement> articleCardImageList;
    @FindBy(xpath = "//h3[@data-testid='article-cards-title']/parent::div/following-sibling::div[@data-testid='article-cards']/child::div/child::div[2]/child::div[2]/child::a[@data-testid='card-title']")
    private List<WebElement> articleCardTitleList;
    @FindBy(xpath = "//h3[@data-testid='article-cards-title']/parent::div/following-sibling::div[@data-testid='article-cards']/child::div/child::div[2]/child::div[2]/child::p[@data-testid='card-description']")
    private List<WebElement> articleCardDescriptionList;
    @FindBy(xpath = "//h3[@data-testid='article-cards-title']/parent::div/following-sibling::div[@data-testid='article-cards']/child::div/child::div[2]/child::div[@data-testid='card-labels']/child::label")
    private List<WebElement> articleCardDateList;
    @FindBy(xpath = "//h3[@data-testid='article-cards-title']/parent::div/following-sibling::div[@data-testid='article-cards']/child::div/child::div[2]/child::div[2]/child::a[@data-testid='card-button']")
    private List<WebElement> articleCardReadTheArticleList;

    @FindBy(xpath = "//h2[text()='HOW TO GET A MEDICAL CARD IN RHODE ISLAND']")
    private WebElement hOWTOGETAMEDICALCARDINRHODEISLANDHeader;
    /*
     * Mobile
     */
    @FindBy(xpath = "//div[ @data-testid='extended-menu']/child::ul/child::li[*]/child::a/child::h2[text()='CANNABIS INSIDER']")
    private WebElement cannabisInsiderOptionCTA;
    @FindBy(xpath = "//h2[text()='Cannabis Insider']/parent::div/following-sibling::ul/child::ul ")
    private List<WebElement> cannabisInsiderOptionList;
    @FindBy(xpath = "//h5[text()='BLOGS']/parent::a")
    private WebElement blogOptionCTA;
    @FindBy(xpath = "//h4[text()='Recommended Resources']")
    private WebElement recommendedResourcesHeader;
    @FindBy(xpath = "//button[contains(text(),'Show more')]")
    private WebElement showMoreCTA;
    @FindBy(xpath = "//*[@data-testid='next-icon']")
    private WebElement recommendedResourcesNextArrow;
    @FindBy(xpath = "//a[@button-type='primary']")
    private WebElement productCarouselMobileCTA;
    @FindBy(xpath = "//a[@button-type='primary']/parent::div/child::div/child::div/div[@data-testid='progressbar-status']/following-sibling::div[2]/*[@data-testid='next-icon']")
    private WebElement productCarouselRightArrowMobileCTA;
    @FindBy(xpath = "//a[@button-type='primary']/parent::div/child::div/child::div/div[@data-testid='progressbar-status']/following-sibling::div[2]/*[@data-testid='prev-icon']")
    private WebElement productCarouselLeftArrowMobileCTA;
    /*
     * getter & setter
     */

    public WebElement getBenefitsOfCannabisRecommendedResourcescta() {
        return benefitsOfCannabisRecommendedResourcescta;
    }
    public WebElement getWhasrightformeRecommendedResources(){
        return whasrightformeRecommendedResources;
    }
    public WebElement getBenefitsOfCannabisHeader(){
        return benefitsOfCannabisHeader;
    }
    public WebElement getBreadcrumb(){
        return breadcrumb;
    }
    public WebElement getHeroArticleBannerImage(){
        return heroArticleBannerImage;
    }
    public WebElement getHeroArticleOverviewText(){
        return heroArticleOverviewText;
    }
    public List<WebElement> getRichtextList(){
        return richtextList;
    }
    public WebElement getContentHeader(){
        return contentHeader;
    }
    public WebElement getHeroArticleBannerDate(){
        return heroArticleBannerDate;
    }
    public WebElement getHeroArticleBannerNewLabel(){
        return heroArticleBannerNewLabel;
    }
    public WebElement getHeroArticleBannerLabel(){
        return heroArticleBannerLabel;
    }
    public List<WebElement> getTableOfContentList(){
        return tableOfContentList;
    }
    public WebElement getUnderstandingTheBenefitsOfMarijuanaHeader(){
        return understandingTheBenefitsOfMarijuanaHeader;
    }
    public WebElement getC09Banner(){
        return c09Banner;
    }
    public WebElement getQuoteParagraph(){
        return quoteParagraph;
    }
    public WebElement getQuoteParagraphText(){
        return quoteParagraphText;
    }
    public List<WebElement> getAccordionsFaqList(){
        return  accordionsFaqList;
    }
    public List<WebElement> getAccordionsFaqButtonList(){
        return accordionsFaqButtonList;
    }
    public List<WebElement> getAccordionFaqButtonPlusIcon(){
        return accordionFaqButtonPlusIcon;
    }
    public List<WebElement> getAccordionFaqAnswerList(){
        return accordionFaqAnswerList;
    }
    public WebElement getAccordionFaqMinusIcon(){
        return accordionFaqMinusIcon;
    }
    public WebElement getBigImage(){
        return bigImage;
    }
    public WebElement getBigImageDescription(){
        return bigImageDescription;
    }
    public WebElement getSmallImage(){
        return smallImage;
    }
    public WebElement getGridGalleryHeader(){
        return gridGalleryHeader;
    }
    public WebElement getGridImage(){
        return gridImage;
    }
    public List<WebElement> getGridEachImageList(){
        return gridEachImageList;
    }
    public WebElement getSourceTOCHeader(){
        return sourceTOCHeader;
    }
    public List<WebElement> getSourceCardList(){
        return sourceCardList;
    }
    public List<WebElement> getSourceCardTitleAndIconList(){
        return sourceCardTitleAndIconList;
    }
    public List<WebElement> getSourceCardCopyTextList(){
        return sourceCardCopyTextList;
    }
    public WebElement getSourceProgressbar(){
        return sourceProgressbar;
    }
    public WebElement getSourceRightArrowCTA(){
        return sourceRightArrowCTA;
    }
    public WebElement getSourceLeftArrowCTA(){
        return sourceLeftArrowCTA;
    }
    public WebElement getSourceProgressIndicator(){
        return sourceProgressIndicator;
    }
    public WebElement getThe_medical_benefit_of_the_marijuana_plant_in_the_scientific_literatureHeader(){
        return the_medical_benefit_of_the_marijuana_plant_in_the_scientific_literatureHeader;
    }
    public WebElement getC09BannerSmallText(){
        return c09BannerSmallText;
    }
    public WebElement getC09BannerTextTitle(){
        return c09BannerTextTitle;
    }
    public WebElement getC09BannerCTA(){
        return c09BannerCTA;
    }
    public WebElement getProductCarousel(){
        return productCarousel;
    }
    public WebElement getProductCarouselTitleText(){
        return productCarouselTitleText;
    }
    public WebElement getProductCarouselcard(){
        return productCarouselcard;
    }
    public WebElement getProductCarouselProgressBar(){
        return productCarouselProgressBar;
    }
    public WebElement getProductCarouselCTA(){
        return productCarouselCTA;
    }
    public List<WebElement> getCarouselProductCardList(){
        return carouselProductCardList;
    }
    public WebElement getProductCarouselRightArrowCTA(){
        return productCarouselRightArrowCTA;
    }
    public WebElement getProductCarouselLeftArrowCTA(){
        return productCarouselLeftArrowCTA;
    }
    public WebElement getAddToCartFirstCTA(){
        return addToCartFirstCTA;
    }
    public WebElement getArticleCardHeader(){
        return articleCardHeader;
    }
    public List<WebElement> getArticleCardList(){
        return articleCardList;
    }
    public List<WebElement> getArticleCardImageList(){
        return articleCardImageList;
    }
    public List<WebElement> getArticleCardTitleList(){
        return articleCardTitleList;
    }
    public List<WebElement> getArticleCardDescriptionList(){
        return articleCardDescriptionList;
    }
    public List<WebElement> getArticleCardDateList(){
        return articleCardDateList;
    }
    public List<WebElement> getArticleCardReadTheArticleList(){
        return articleCardReadTheArticleList;
    }
    public WebElement gethOWTOGETAMEDICALCARDINRHODEISLANDHeader(){
        return hOWTOGETAMEDICALCARDINRHODEISLANDHeader;
    }
    /*
     * getter & setter mobile
     */
    public WebElement getCannabisInsiderOptionCTA(){
        return cannabisInsiderOptionCTA;
    }
    public List<WebElement> getCannabisInsiderOptionList(){
        return cannabisInsiderOptionList;
    }
    public WebElement getBlogOptionCTA(){
        return blogOptionCTA;
    }
    public WebElement getRecommendedResourcesHeader(){
        return recommendedResourcesHeader;
    }
    public WebElement getRecommendedResourcesNextArrow(){
        return recommendedResourcesNextArrow;
    }
    public WebElement getShowMoreCTA(){
        return showMoreCTA;
    }
    public WebElement getProductCarouselMobileCTA(){
        return productCarouselMobileCTA;
    }
    public WebElement getProductCarouselRightArrowMobileCTA(){
        return productCarouselRightArrowMobileCTA;
    }
    public WebElement getProductCarouselLeftArrowMobileCTA(){
        return productCarouselLeftArrowMobileCTA;
    }
}
