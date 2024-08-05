package pom.gti;

import com.resuableMethods.CommonAction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class T10_WhatRightForMe extends CommonAction {
    public T10_WhatRightForMe(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    /*
     * Element
     */
    @FindBy(xpath = "//h5[text()='State Laws']")
    private WebElement stateLawsHeader;
    @FindBy(xpath = "//h5[text()='WHAT’S RIGHT FOR ME?']/parent::div/child::a")
    private WebElement whatRightForMeReadMoreCTA;
    @FindBy(xpath = "//h2[text()='Indica vs. Sativa vs. Hybrid']")
    private WebElement whatRightForMeHeader;
    @FindBy(xpath = "//h2[text()='Indica vs. Sativa vs. Hybrid']/parent::div/parent::div/parent::div/parent::div/child::div[@role='img']")
    private WebElement whatRightForMeHeroArticleImage;
    @FindBy(xpath = "//h2[text()='Indica vs. Sativa vs. Hybrid']/parent::div/child::p")
    private WebElement whatRightForMeOverview;
    @FindBy(xpath = "//h2[text()='Indica vs. Sativa vs. Hybrid']/parent::div/parent::div/child::div[1]/child::label[3]")
    private WebElement whatRightForMeHeroArticleBannerDate;
    @FindBy(xpath = "//h2[text()='Indica vs. Sativa vs. Hybrid']/parent::div/parent::div/child::div[1]/child::label[@data-testid='newlabel-test']")
    private WebElement whatRightForMeHeroArticleBannerNewLabel;
    @FindBy(xpath = "//h2[text()='Indica vs. Sativa vs. Hybrid']/parent::div/parent::div/child::div[1]/child::label[2]")
    private WebElement whatRightForMeHeroArticleBannerLabel;
    @FindBy(xpath = "//h2[@id='toc_what_are_indica,_sativa_and_hybrid_strains?']")
    private WebElement whatAreIndicaSativaAndHybridStrainsHeader;
    @FindBy(xpath = "//img[@alt='Indica vs. Sativa ']")
    private WebElement bigImageInWhatRightForMe;
    @FindBy(xpath = "//figcaption[text()='Indica vs. Sativa Description']")
    private WebElement bigImageDescription;
    @FindBy(xpath = "//img[@alt='Indica Leaf']")
    private WebElement smaillImageInWhatRightForMe;
    @FindBy(xpath = "//h2[@id='toc_indica_effects']")
    private WebElement indicaEffectsHeader;
    /*
     * Mobile
     */

    /*
     * getter & setter
     */
    public WebElement getStateLawsHeader(){
        return stateLawsHeader;
    }
    public WebElement getWhatRightForMeReadMoreCTA(){
        return whatRightForMeReadMoreCTA;
    }
    public WebElement getWhatRightForMeHeader(){
        return whatRightForMeHeader;
    }
    public WebElement getWhatRightForMeHeroArticleImage(){
        return whatRightForMeHeroArticleImage;
    }
    public WebElement getWhatRightForMeOverview(){
        return whatRightForMeOverview;
    }
    public WebElement getWhatRightForMeHeroArticleBannerDate(){
        return whatRightForMeHeroArticleBannerDate;
    }
    public WebElement getWhatRightForMeHeroArticleBannerNewLabel(){
        return whatRightForMeHeroArticleBannerNewLabel;
    }
    public WebElement getWhatRightForMeHeroArticleBannerLabel(){
        return whatRightForMeHeroArticleBannerLabel;
    }
    public WebElement getWhatAreIndicaSativaAndHybridStrainsHeader(){
        return whatAreIndicaSativaAndHybridStrainsHeader;
    }
    public WebElement getBigImageInWhatRightForMe(){
        return bigImageInWhatRightForMe;
    }
    public WebElement getBigImageDescription(){
        return bigImageDescription;
    }
    public WebElement getSmaillImageInWhatRightForMe(){
        return smaillImageInWhatRightForMe;
    }
    public WebElement getIndicaEffectsHeader(){
        return indicaEffectsHeader;
    }
    /*
     * getter & setter mobile
     */

}
