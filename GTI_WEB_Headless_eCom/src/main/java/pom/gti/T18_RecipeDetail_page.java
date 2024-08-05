package pom.gti;

import com.resuableMethods.CommonAction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class T18_RecipeDetail_page extends CommonAction {
    public T18_RecipeDetail_page(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='flex flex-col gap-4 lg:gap-6']/h2")
    private WebElement Recipe_details_hero_header;
    @FindBy(xpath = "//div[@class='bg-cover bg-no-repeat bg-grey-600 w-full h-[340px] lg:shrink-0 lg:!h-[523px] lg:!w-full']")
    private WebElement Recipe_Hero_BG_image;
    @FindBy(xpath = "//*[@class='flex w-full pb-0 flex-col items-center -gap-[82px] min-h-[1234px] lg:-gap-[379px]']/div[2]/div[2]/p")
    private WebElement Recipe_detals_hero_Description;
    @FindBy(xpath = "//div[@class='flex flex-col gap-4 lg:gap-6']/div/label[2]")
    private WebElement Estimated_cooking_time;



    public WebElement getRecipe_details_hero_header(){
        return Recipe_details_hero_header;
    }
    public WebElement getRecipe_Hero_BG_image(){
        return Recipe_Hero_BG_image;
    }
    public WebElement getRecipe_detals_hero_Description(){
        return Recipe_detals_hero_Description;
    }
    public WebElement getEstimated_cooking_time(){
        return Estimated_cooking_time;
    }





}
