package pom.gti;

import com.driverfactory.DriverManager;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.resuableMethods.CommonAction;
import com.resuableMethods.Highlighter;
import com.utilities.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class T16_Deals_page extends CommonAction {
    public T16_Deals_page(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    Highlighter highlighter = new Highlighter();

    @FindBy(xpath = "(//*[@class='w-full  block md:block lg:block'])[3]/div/div[2]/h2")
    private WebElement Herobanner_headertext;
    @FindBy(xpath = "(//*[@class='w-full  block md:block lg:block']/div)[1]")
    private WebElement Dealspage_Herobanner;
    @FindBy(xpath = "//*[@class='xl:w-[884px] xl:pl-[60px] px-5']/p")
    private WebElement Herobanner_description;
    @FindBy(xpath = "(//*[@class='relative md:order-last']/div/span/img)[1]")
    private WebElement Herobanner_image;
    @FindBy(xpath = "//img[@data-nimg='responsive' and @title='Flower-Logo.png']")
    private WebElement Herobanner_centerImage;
    @FindBy(xpath = "//h3[text()='Deals']")
    private WebElement Deals_Header;
    @FindBy(xpath = "//*[@data-testid='deal-cards-list-show-more']/div/a")
    private List<WebElement> Deals_card;
    @FindBy(xpath = "//*[@data-testid='deal-cards-list-show-more']/div/p")
    private WebElement Deals_current_count;
    @FindBy(xpath = "//*[@data-testid='deal-cards-list-show-more']/div/button")
    private WebElement Deals_Showmore_cta;
    @FindBy(xpath = "//*[@data-testid='deal-cards-list-show-more']/div/a/div/div[1]")
    private List<WebElement> DealsCard_image_list;
    @FindBy(xpath = "//*[@data-testid='deal-cards-list-show-more']/div/a/div/div[2]/p[1]")
    private List<WebElement> Deals_card_Type;
    @FindBy(xpath = "//*[@data-testid='deal-cards-list-show-more']/div/a/div/div[2]/p[2]")
    private List<WebElement> Deals_card_title;
    @FindBy(xpath = "//*[@data-testid='deal-cards-list-show-more']/div/a/div/div[2]/p[3]")
    private List<WebElement> Deals_card_Description;
    @FindBy(xpath = "//*[@data-testid='deal-cards-list-show-more']/div[1]/a[1]/div[1]/div[2]/p[2]")
    private WebElement Deals_card_titleclick;
    @FindBy(xpath = "//h2[text()='Event Discounts']")
    private WebElement Event_discount_header;
    @FindBy(xpath = "(//div[@class='slick-slide slick-active slick-current'])[2]/div[1]/div[1]/div[1]")
    private WebElement Event_discount_image;
    @FindBy(xpath = "(//*[@class='flex flex-col items-start gap-4 self-stretch lg:gap-6 2xl:pr-[60px]'])[1]/h3")
    private WebElement Event_discount_title;
    @FindBy(xpath = "(//*[@class='flex flex-col items-start gap-4 self-stretch lg:gap-6 2xl:pr-[60px]'])[1]/p")
    private WebElement Event_discount_description;
    @FindBy(xpath = "(//*[text()='Read more'])[1]")
    private WebElement Event_discount_button;
    @FindBy(xpath = "(//*[@data-testid='next-icon'])[2]")
    private WebElement Event_discount_Nexticon;
    @FindBy(xpath = "(//*[@data-testid='prev-icon'])[2]")
    private WebElement Event_discount_previcon;
    @FindBy(xpath = "//h2[@data-testid='groupDiscountsTitle']")
    private WebElement Groupdiscount_header;
    @FindBy(xpath = "//*[@data-testid='groupDiscountsContainer']")
    private WebElement Groupdiscount_card_section;
    @FindBy(xpath = "//*[@data-testid='groupDiscountsContainer']/div")
    private List<WebElement> GroupDiscount_cards_list;
    @FindBy(xpath = "//img[@data-testid='groupDiscountsCardImage']")
    private List<WebElement> GroupDiscount_card_img_list;
    @FindBy(xpath = "//h3[@data-testid='groupDiscountsCardTitle']")
    private List<WebElement> GroupDiscount_card_title_list;
    @FindBy(xpath = "//p[@data-testid='groupDiscountsCardDescription']")
    private List<WebElement> GroupDiscount_card_description_list;
    @FindBy(xpath = "//a[@data-testid='groupDiscountsCardCTA']")
    private List<WebElement> GroupDiscount_card_cta_list;
    @FindBy(xpath = "//h1[@class='elementor-heading-title elementor-size-default']")
    private WebElement GroupDscount_card1_detailsPage_titla;






    public WebElement getDeals_herobanner_headertext(){
        return Herobanner_headertext;
    }
    public WebElement getDealspage_Herobanner(){
        return Dealspage_Herobanner;
    }
    public WebElement getDeals_herobanner_description(){
        return Herobanner_description;
    }
    public WebElement getHerobanner_image(){
        return Herobanner_image;
    }
    public WebElement getHerobanner_centerImage(){
        return Herobanner_centerImage;
    }
    public WebElement getDeals_Header(){
        return Deals_Header;
    }
    public WebElement getDeals_current_count(){
        return Deals_current_count;
    }
    public WebElement getDeals_Showmore_cta(){
        return Deals_Showmore_cta;
    }
    public WebElement getDeals_card_titleclick(){
        return Deals_card_titleclick;
    }
    public WebElement getEvent_discount_header(){
        return Event_discount_header;
    }
    public WebElement getEvent_discount_image(){
        return Event_discount_image;
    }
    public WebElement getEvent_discount_title(){
        return Event_discount_title;
    }
    public WebElement getEvent_discount_description(){
        return Event_discount_description;
    }
    public WebElement getEvent_discount_button(){
        return Event_discount_button;
    }
    public WebElement getEvent_discount_Nexticon(){
        return Event_discount_Nexticon;
    }
    public WebElement getEvent_discount_previcon(){
        return Event_discount_previcon;
    }
    public WebElement getGroupdiscount_header(){
        return Groupdiscount_header;
    }
    public WebElement getGroupdiscount_card_section(){
        return Groupdiscount_card_section;
    }
    public List<WebElement> getGroupDiscount_cards_list(){
        return GroupDiscount_cards_list;
    }
    public List<WebElement> getGroupDiscount_card_img(){
        return GroupDiscount_card_img_list;
    }
    public List<WebElement> getGroupDiscount_card_title_list(){
        return GroupDiscount_card_title_list;
    }
    public List<WebElement> getGroupDiscount_card_description_list(){
        return GroupDiscount_card_description_list;
    }
    public List<WebElement> getGroupDiscount_card_cta_list(){
        return GroupDiscount_card_cta_list;
    }
    public WebElement getGroupDscount_card1_detailsPage_titla(){
        return GroupDscount_card1_detailsPage_titla;
    }
    public List<WebElement> getDealsCard_image_list(){
        return DealsCard_image_list;
    }









    public void Deals_card_list(){
        for (int i=0; i<Deals_card.size(); i++){
            Assert.assertTrue(Deals_card.get(i).isDisplayed());
            javascriptScroll(Deals_card.get(i));
            Logger.log("User able to view the deals card");
        }
    }
    public void Deals_card_img_list(){
        for (int i=0; i<getDealsCard_image_list().size(); i++){
//            highlighter.highLighterMethod(getDealsCard_image_list().get(i), DriverManager.getDriver());
            Assert.assertTrue(getDealsCard_image_list().get(i).isDisplayed());

        }
    }
    public void Deals_card_typeList(){
        for (int i=0; i<Deals_card_Type.size(); i++){
            highlighter.highLighterMethod(Deals_card_Type.get(i), DriverManager.getDriver());
            Assert.assertTrue(Deals_card_Type.get(i).isDisplayed());
        }
    }

   public void Deals_card_title_list(){
        for (int i=0; i<Deals_card_title.size(); i++){
            highlighter.highLighterMethod(Deals_card_title.get(i), DriverManager.getDriver());
            Assert.assertTrue(Deals_card_title.get(i).isDisplayed());
        }
   }

    public void Deals_card_description_list(){
        for (int i=0; i<Deals_card_Description.size(); i++){
            highlighter.highLighterMethod(Deals_card_Description.get(i), DriverManager.getDriver());
            Assert.assertTrue(Deals_card_Description.get(i).isDisplayed());
        }
    }
    public void Deals_banner_left_to_right_swipe(){
        for (int i=0; i<1; i++){
            String title1 = getEvent_discount_title().getText();
            jsClick(getEvent_discount_Nexticon());
            String title2 = getEvent_discount_title().getText();
            Assert.assertNotEquals(title1,title2);
            String rightArrow = getEvent_discount_Nexticon().getCssValue("color");
            if (rightArrow.contains("rgb(189,194,166)")){
                break;
            }
            }

    }


}
