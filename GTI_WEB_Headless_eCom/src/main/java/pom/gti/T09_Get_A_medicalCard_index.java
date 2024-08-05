package pom.gti;

import com.resuableMethods.CommonAction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.Command;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class T09_Get_A_medicalCard_index extends CommonAction {
    public T09_Get_A_medicalCard_index(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h2[text()='PATIENT QUALIFICATIONS FOR U.S. STATE MEDICAL CANNABIS PROGRAMS']")
    private WebElement Get_A_medicalCard_index_HeroHeader;
    @FindBy(xpath = "//div[@class='flex items-center gap-0 flex-col-reverse lg:flex-row']")
    private WebElement Index_herobanner;
    @FindBy(xpath = "//div[@class='flex flex-col pt-5 gap-2 xl:pt-8 xl:gap-6']/h5")
    private List<WebElement> grid_Article_title;
    @FindBy(xpath = "//div[@class='flex-start flex flex-col gap-6 self-stretch']/h3")
    private WebElement Index_heroBanner_title;
    @FindBy(xpath = "//*[@class='h-[68px] lg:h-[129px]']/p")
    private WebElement Index_heroBanner_description;
    @FindBy(xpath = "//div[@class='self-stretch']/a")
    private WebElement Index_heroBanner_cta;
    @FindBy(xpath = "//div[@class='flex flex-row gap-1 self-stretch']/label[3]")
    private WebElement Index_heroBanner_dateTag;
    @FindBy(xpath = "//div[@class='flex flex-row gap-1 self-stretch']/label[2]")
    private WebElement Index_heroBanner_categoryTag;
    @FindBy(xpath = "//h4[text()='Recommended Resources']")
    private WebElement indexPage_recommended_Resources_header;
    @FindBy(xpath = "//div[@class='flex flex-col xl:gap-3 gap-2']/p")
    private WebElement indexPage_recommended_Resources_headerdescription;
    @FindBy(xpath = "//*[@class='xl:pt-[90px] md:pb-0 py-12 md:flex md:flex-col']/div/h5")
    private List<WebElement> indexPage_recommended_Resources_title;
    @FindBy(xpath = "//*[@class='xl:pt-[90px] md:pb-0 py-12 md:flex md:flex-col']/div/p")
    private List<WebElement> indexPage_recommended_resources_description;
    @FindBy(xpath = "//*[@class='xl:pt-[90px] md:pb-0 py-12 md:flex md:flex-col']/div/a")
    private List<WebElement> indexPage_recommended_resources_cta;
    @FindBy(xpath = "//div[@class='flex flex-col gap-4 lg:gap-6']/h2")
    private WebElement ArticleDetails_header;
    @FindBy(xpath = "//div[@class='grid grid-cols-1 md:grid-cols-2 gap-5 xl:gap-24 py-8 xl:py-[63px]']")
    private WebElement gridAritcle_section;
    @FindBy(xpath = "//div[@class='flex flex-col pt-5 gap-2 xl:pt-8 xl:gap-6']/h5")
    private List<WebElement> gridAriticle_title;
    @FindBy(xpath = "//div[@class='flex flex-col pt-5 gap-2 xl:pt-8 xl:gap-6']/div/p")
    private List<WebElement> gridArticle_description;
    @FindBy(xpath = "//img[@class='h-full w-full rounded-md object-cover']")
    private List<WebElement> gridArticle_image;
    @FindBy(xpath = "//div[@class='absolute left-0 top-0 m-4 flex gap-2 xl:m-6 xl:gap-[10px]']//label[@data-testid='newlabel-test']")
    private List<WebElement> gridArticle_newTag;
    @FindBy(xpath = "//div[@class='absolute left-0 top-0 m-4 flex gap-2 xl:m-6 xl:gap-[10px]']//label[text()='Resources']")
    private List<WebElement> gridArticle_categoryTag;
    @FindBy(xpath = "//div[@class='absolute left-0 top-0 m-4 flex gap-2 xl:m-6 xl:gap-[10px]']//label[3]")
    private List<WebElement> gridArticle_publishedDate_Tag;
    @FindBy(xpath = "//*[@class='xl:pt-11 pt-4']/a")
    private List<WebElement> gridArticle_cta;
    @FindBy(xpath = "//*[@class='xl:px-[60px] px-5']/div[2]/button")
    private WebElement showMore_cta;
    @FindBy(xpath = "//*[@class='xl:px-[60px] px-5']/div[2]/p")
    private WebElement displayed_card_count;





//   Hero banner

    public WebElement getIndex_herobanner() {
        return Index_herobanner;
    }

    public List<WebElement> getGrid_Article_title() {
        return grid_Article_title;
    }
    public WebElement getIndex_heroBanner_title(){
        return Index_heroBanner_title;
    }
    public WebElement getIndex_heroBanner_description(){
        return Index_heroBanner_description;
    }
    public WebElement getIndex_heroBanner_cta(){
        return Index_heroBanner_cta;
    }
    public WebElement getIndex_heroBanner_dateTag(){
        return Index_heroBanner_dateTag;
    }
    public WebElement getIndex_heroBanner_categoryTag(){
        return Index_heroBanner_categoryTag;
    }


//    Grid article

    public List<WebElement> getgridAriticle_title(){
        return gridAriticle_title;
    }
    public List<WebElement> getgridArticle_description(){
        return gridArticle_description;
    }
    public List<WebElement> getgridArticle_image(){
        return gridArticle_image;
    }

    public List<WebElement> getGridArticle_newTag() {
        return gridArticle_newTag;
    }
    public List<WebElement> getgridArticle_categoryTag(){
        return gridArticle_categoryTag;
    }
    public List<WebElement> getgridArticle_publishedDate_Tag(){
        return gridArticle_publishedDate_Tag;
    }
    public List<WebElement> getgridArticle_cta(){
        return gridArticle_cta;
    }









    public WebElement getGet_A_medicalCard_index_HeroHeader() {
        return Get_A_medicalCard_index_HeroHeader;
    }

    public WebElement getindexPage_recommended_Resources_header(){
        return indexPage_recommended_Resources_header;
    }
    public WebElement getindexPage_recommended_Resources_headerdescription(){
        return indexPage_recommended_Resources_headerdescription;
    }
    public List<WebElement> getindexPage_recommended_Resources_title(){
        return indexPage_recommended_Resources_title;
    }
    public List<WebElement> getindexPage_recommended_resources_description(){
        return indexPage_recommended_resources_description;
    }
    public List<WebElement> getindexPage_recommended_resources_cta(){
        return indexPage_recommended_resources_cta;
    }
    public WebElement getArticleDetails_header(){
        return ArticleDetails_header;
    }
    public WebElement getgridAritcle_section(){
        return gridAritcle_section;
    }
    public WebElement getshowMore_cta(){
        return showMore_cta;
    }
    public WebElement getdisplayed_card_count(){
        return displayed_card_count;
    }







    public void clickreadmore_cta(){
        visibilityWait(getgridArticle_cta().get(1));
        Random r = new Random();
        int randomnumber = r.nextInt(getgridArticle_cta().size());
        getgridArticle_cta().get(randomnumber).click();
    }
    public void clickarticletitle(){
        visibilityWait(gridAriticle_title.get(1));
        Random r = new Random();
        int randomnumber = r.nextInt(gridAriticle_title.size());
        gridAriticle_title.get(randomnumber).click();
    }
    public void click_recommended_resources_cta(){
        visibilityWait(indexPage_recommended_resources_cta.get(1));
        Random r =new Random();
        int randomnumber =r.nextInt(indexPage_recommended_resources_cta.size());
        indexPage_recommended_resources_cta.get(randomnumber).click();
    }
    public void click_recommended_resources_title(){
        visibilityWait(indexPage_recommended_Resources_title.get(1));
        Random r =new Random();
        int randomnumber =r.nextInt(indexPage_recommended_Resources_title.size());
        indexPage_recommended_Resources_title.get(randomnumber).click();
    }

}
