package pom.gti;

import com.resuableMethods.CommonAction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class T09_BlogIndexPage extends CommonAction {
    public T09_BlogIndexPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    /*
     * Element
     */
    @FindBy(xpath = "//header[@data-testid = 'header-wrapper']/child::div")
    private WebElement homePageHeader;
    @FindBy(xpath = "//a[text()='CANNABIS INSIDER']")
    private WebElement cannabisInsiderHeaderOption;
    @FindBy(xpath = "//a[text()='BLOGS']")
    private WebElement blogOption;
    @FindBy(xpath = "//h2[text()='Explore Our CANNABIS INSIDER']")
    private WebElement blogIndexPageHeader;
    @FindBy(xpath = "//p[text()='Everything you need to know about the wide world of weed.']")
    private WebElement blogIndexPageCopytext;
    @FindBy(xpath = "//h3[text()='Ways to consume cannabis: Your go-to guide']/parent::div/parent::div/parent::div")
    private WebElement heroArticleBanner;
    @FindBy(xpath = "//h3[text()='Ways to consume cannabis: Your go-to guide']/parent::div/parent::div")
    private WebElement heroArticleLatest;
    @FindBy(xpath = "//h3[text()='Ways to consume cannabis: Your go-to guide']")
    private WebElement heroArticleTitleText;
    @FindBy(xpath = "//h3[text()='Ways to consume cannabis: Your go-to guide']/following-sibling::span/p")
    private WebElement heroArticleCopyText;
    @FindBy(xpath = "//h3[text()='Ways to consume cannabis: Your go-to guide']/parent::div/parent::div/following-sibling::div")
    private WebElement heroArticleImage;
    @FindBy(xpath = "//h3[text()='Ways to consume cannabis: Your go-to guide']/parent::div/parent::div/div[1]/label[2]")
    private WebElement heroArticleDateLabel;
    @FindBy(xpath = "//h3[text()='Ways to consume cannabis: Your go-to guide']/parent::div/parent::div/div[1]/label[1]")
    private WebElement heroArticleCategory;
    @FindBy(xpath = "//h3[text()='Ways to consume cannabis: Your go-to guide']/parent::div/parent::div/div[3]/div/a")
    private WebElement heroArticleBannerCTA;
    @FindBy(xpath = "//h3[text()='Ways to consume cannabis: Your go-to guide']/parent::div/parent::div/child::div[1]/child::label[@data-testid='newlabel-test']")
    private WebElement heroArticleNewLabel;
    @FindBy(xpath = "//div[@data-testid='filter-pill-list']/div[1]")
    private WebElement filterOption;
    @FindBy(xpath = "//div[@data-testid='filter-pill-list']/div[1]/div/button[contains(text(),'All')]")
    private WebElement allFilterOption;
    @FindBy(xpath = "//div[@data-testid='filter-pill-list']/div[1]/div/button[contains(text(),'Cannabis')]")
    private WebElement cannabisFilterOption;
    @FindBy(xpath = "//div[@data-testid='filter-pill-list']/div[1]/div/button[contains(text(),'Shopping & Reviews')]")
    private WebElement shoppingReviewOption;
    @FindBy(xpath = "//label[contains(text(),'Cannabis')]")
    private List<WebElement> cannabisLabelList;
    @FindBy(xpath = "//label[contains(text(),'Shopping & Reviews')]")
    private WebElement shoppingReviewLabel;
    @FindBy(xpath = "//div[@data-testid='filter-pill-list']/div[2]")
    private WebElement sortByElement;
    @FindBy(xpath = "//div[@data-testid='filter-pill-list']/div[2]/child::div/button")
    private WebElement sortByDropdown;
    @FindBy(xpath = "//div[@data-testid='desktop-view']")
    private WebElement sortByDropdownState;
    @FindBy(xpath = "//button[text()='Popularity']")
    private WebElement sortByDropDownDefault;
    @FindBy(xpath = "//div[text()='Oldest']/parent::div")
    private WebElement sortByOldest;
    @FindBy(xpath = "//div[text()='Newest']/parent::div")
    private WebElement sortByNewest;
    @FindBy(xpath = "//button[text()='Oldest']/parent::div")
    private WebElement sortByOldestSelected;
    @FindBy(xpath = "//button[text()='Newest']/parent::div")
    private WebElement sortByNewestSelected;
    @FindBy(xpath = "//h4[text()='all Articles in the wide world of weed']")
    private WebElement gridSectionHeader;
    @FindBy(xpath = "//h4[text()='all Articles in the wide world of weed']/parent::div/child::div[1]/child::div/child::div[2]/child::h5")
    private List<WebElement> girdSectionFirstHeader;
    @FindBy(xpath = "//h4[text()='all Articles in the wide world of weed']/parent::div/child::div[1]/child::div/child::div[1]/child::span")
    private List<WebElement> gridSectionFirstImage;
    @FindBy(xpath = "//h4[text()='all Articles in the wide world of weed']/parent::div/child::div[1]/child::div/child::div[1]/child::div/child::label[1]")
    private List<WebElement> gridSectionFirstlabel;
    @FindBy(xpath = "//h4[text()='all Articles in the wide world of weed']/parent::div/child::div[1]/child::div/child::div[1]/child::div/child::label[2]")
    private List<WebElement> gridSectionFirstDate;
    @FindBy(xpath = "//h4[text()='all Articles in the wide world of weed']/parent::div/child::div[1]/child::div/child::div[2]/child::div/child::p")
    private List<WebElement> gridSectionFirstCopyText;
    @FindBy(xpath = "//h4[text()='all Articles in the wide world of weed']/parent::div/child::div[1]/child::div/child::div[3]/child::a")
    private List<WebElement> gridSectionFirstReadMoreCTA;
    @FindBy(xpath = "//button[contains(text(),'Show more')]")
    private WebElement showMoreCTA;
    @FindBy(xpath = "//p[contains(text(),'Showing')]")
    private WebElement showingText;
    @FindBy(xpath = "//h4[text()='Recommended Resources']/parent::div/parent::div")
    private WebElement recommendedResourcesSection;
    @FindBy(xpath = "//h4[text()='Recommended Resources']")
    private WebElement recommendedResourcesHeader;
    @FindBy(xpath = "//h4[text()='Recommended Resources']/parent::div/parent::div/child::div[2]/child::div/child::h5")
    private List<WebElement> recommendedResourcesFirstTitle;
    @FindBy(xpath = "//h4[text()='Recommended Resources']/parent::div/parent::div/child::div[2]/child::div/child::p")
    private List<WebElement> recommendedResourcesFirstCopyText;
    @FindBy(xpath = "//h4[text()='Recommended Resources']/parent::div/parent::div/child::div[2]/child::div/child::a")
    private List<WebElement> recommendedResourcesFirstReadMoreCTA;
    @FindBy(xpath = "//a[@title='RISE Dispensaries Footer Logo']/parent::div/parent::div/parent::div")
    private WebElement footer;
    @FindBy(xpath = "//div[@data-testid = 'icon-container']")
    private WebElement locationIndicator;
    //nextpage
    @FindBy(xpath = "//h2[text()='Ways to consume cannabis: Your go-to guide']")
    private WebElement preRollePage;
    @FindBy(xpath = "//h2[text()='What Are Cannabis Terpenes and What Do They Do?']")
    private WebElement cannabisTerpenesHeader;
    @FindBy(xpath = "//h4[text()='Recommended Resources']/parent::div/parent::div/child::div[2]/child::div")
    private List<WebElement> RecommendedResourcesList;


    @FindBy(xpath = "//h4[text()='Recommended Resources']/parent::div/parent::div/child::div[2]/child::div/child::div/child::div/child::div/child::div/child::div/child::h5")
    private List<WebElement> recommendedResourcesFirstTitleMobileList;
    @FindBy(xpath = "//h4[text()='Recommended Resources']/parent::div/parent::div/child::div[2]/child::div/child::div/child::div/child::div/child::div/child::div/child::p")
    private List<WebElement> recommendedResourcesFirstCopyTextMobileList;
    @FindBy(xpath = "//h4[text()='Recommended Resources']/parent::div/parent::div/child::div[2]/child::div/child::div/child::div/child::div/child::div/child::div/child::a")
    private List<WebElement> recommendedResourcesFirstReadMoreCTAMobileList;
    /*
     * Getter and Setter
     */
    public WebElement getHomePageHeader(){
        return homePageHeader;
    }
    public WebElement getCannabisInsiderHeaderOption(){
        return cannabisInsiderHeaderOption;
    }
    public WebElement getBlogOption(){
        return blogOption;
    }
    public WebElement getBlogIndexPageHeader(){
        return blogIndexPageHeader;
    }
    public WebElement getBlogIndexPageCopytext(){
        return blogIndexPageCopytext;
    }
    public WebElement getHeroArticleBanner(){
        return heroArticleBanner;
    }
    public WebElement getHeroArticleLatest(){
        return heroArticleLatest;
    }
    public WebElement getHeroArticleTitleText(){
        return heroArticleTitleText;
    }
    public WebElement getHeroArticleCopyText(){
        return heroArticleCopyText;
    }
    public WebElement getHeroArticleImage(){
        return heroArticleImage;
    }
    public WebElement getHeroArticleDateLabel(){
        return heroArticleDateLabel;
    }
    public WebElement getHeroArticleCategory(){
        return heroArticleCategory;
    }
    public WebElement getHeroArticleBannerCTA(){
        return heroArticleBannerCTA;
    }
    public WebElement getFilterOption(){
        return filterOption;
    }
    public WebElement getAllFilterOption(){
        return allFilterOption;
    }
    public WebElement getCannabisFilterOption(){
        return cannabisFilterOption;
    }
    public WebElement getShoppingReviewOption(){
        return shoppingReviewOption;
    }
    public List<WebElement> getCannabisLabelList() {
        return cannabisLabelList;
    }
    public WebElement getShoppingReviewLabel(){
        return shoppingReviewLabel;
    }
    public WebElement getSortByElement() {
        return sortByElement;
    }
    public WebElement getSortByDropdown(){
        return sortByDropdown;
    }
    public WebElement getSortByDropdownState(){
        return sortByDropdownState;
    }
    public WebElement getSortByDropDownDefault(){
        return sortByDropDownDefault;
    }
    public WebElement getSortByOldest(){
        return sortByOldest;
    }
    public WebElement getSortByOldestSelected(){
        return sortByOldestSelected;
    }
    public WebElement getSortByNewestSelected(){
        return sortByNewestSelected;
    }
    public WebElement getSortByNewest(){
        return sortByNewest;
    }
    public WebElement getGridSectionHeader(){
        return gridSectionHeader;
    }
    public List<WebElement> getGirdSectionFirstHeader(){
        return girdSectionFirstHeader;
    }
    public List<WebElement> getGridSectionFirstImage(){
        return gridSectionFirstImage;
    }
    public List<WebElement> getGridSectionFirstlabel(){
        return gridSectionFirstlabel;
    }
    public List<WebElement> getGridSectionFirstDate(){
        return gridSectionFirstDate;
    }
    public List<WebElement> getGridSectionFirstCopyText(){
        return gridSectionFirstCopyText;
    }
    public List<WebElement> getGridSectionFirstReadMoreCTA(){
        return gridSectionFirstReadMoreCTA;
    }

    public WebElement getShowMoreCTA(){
        return showMoreCTA;
    }
    public WebElement getShowingText(){
        return showingText;
    }
    public WebElement getRecommendedResourcesSection(){
        return recommendedResourcesSection;
    }
    public WebElement getRecommendedResourcesHeader(){
        return recommendedResourcesHeader;
    }
    public List<WebElement> getRecommendedResourcesFirstTitle(){
        return recommendedResourcesFirstTitle;
    }
    public List<WebElement> getRecommendedResourcesFirstCopyText(){
        return recommendedResourcesFirstCopyText;
    }
    public List<WebElement> getRecommendedResourcesFirstReadMoreCTA(){
        return recommendedResourcesFirstReadMoreCTA;
    }
    public WebElement getFooter(){
        return footer;
    }
    public WebElement getLocationIndicator(){
        return locationIndicator;
    }
    public List<WebElement> getRecommendedResourcesFirstTitleMobileList(){
        return recommendedResourcesFirstTitleMobileList;
    }
    public List<WebElement> getRecommendedResourcesFirstCopyTextMobileList(){
        return recommendedResourcesFirstCopyTextMobileList;
    }
    public List<WebElement> getRecommendedResourcesFirstReadMoreCTAMobileList(){
        return recommendedResourcesFirstReadMoreCTAMobileList;
    }
    //next page
    public WebElement getPreRollePage(){
        return preRollePage;
    }
    public WebElement getCannabisTerpenesHeader(){
        return cannabisTerpenesHeader;
    }
    public List<WebElement> getRecommendedResourcesList(){
        return RecommendedResourcesList;
    }
    public WebElement getHeroArticleNewLabel(){
        return heroArticleNewLabel;
    }
}
