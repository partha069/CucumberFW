package pom.gti;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resuableMethods.CommonAction;
import com.utilities.Logger;

public class Home extends CommonAction{
	public Home(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//*[@class='w-full  block md:block lg:block'])[2]")
	private static WebElement herobanner;

	@FindBy(xpath = "(//*[@class='w-full  block md:block lg:block'])[3]")
	private WebElement categoriessection;

	@FindBy(xpath = "//*[text()='Show More (9)']")
	private WebElement categoriesshowmorecta;


	@FindBy(xpath = "(//*[@class='w-full  block md:block lg:block'])[4]")
	private WebElement productcarousel;

	@FindBy(xpath = "(//h3[text()='Test Title'])[1]")
	private WebElement productcarouseltitle;

	@FindBy(xpath = "(//p[text()='Test Description'])[1]")
	private WebElement productcarouselcopytext;

	@FindBy(xpath = "(//*[text()='Test Button'])[1]")
	private WebElement productcarouselcta;

	@FindBy(xpath = "(//*[@class='w-full  block md:block lg:block'])[5]")
	private WebElement bannerinfo;

	@FindBy(xpath = "//*[text()='Shop Now']")
	private WebElement bannerinfoCTA;

	@FindBy(xpath = "(//*[@class='w-full  block md:block lg:block'])[7]")
	private WebElement aboutusbanner;

	@FindBy(xpath = "//*[text()='About us']")
	private WebElement aboutusCTA;

	@FindBy(xpath = "(//*[@class='w-full  block md:block lg:block'])[8]")
	private WebElement joinnowbanner;

	@FindBy(xpath = "//*[text()='Join now']")
	private WebElement joinnowcta;

	@FindBy(xpath = "(//*[@class='w-full  block md:block lg:block'])[9]")
	private WebElement articlessection;

	@FindBy(xpath = "//a[normalize-space()='See all articles']")
	private WebElement articleseeallcta;

	@FindBy(xpath = "(//*[@stroke='currentColor'])[7]")
	private WebElement whiteheaderaccounticon1;

	/*
	 * Hero banner steps
	 */


	/*
	 * category elements
	 */
	@FindBy(xpath = "//*[text()='Show Less']")
	private WebElement categoriesshowlesscta;
	@FindBy(xpath = "//a[text()='Flower']")
	private WebElement categoriesflower;
	@FindBy(xpath = "//a[text()='Pre-Rolls']")
	private WebElement categoriesprerolls;
	@FindBy(xpath = "//a[text()='Vape']")
	private WebElement categoriesvape;
	@FindBy(xpath = "//a[text()='Edibles']")
	private WebElement categoriesedibles;
	@FindBy(xpath = "//a[text()='Drinks']")
	private WebElement categoriesdrinks;
	@FindBy(xpath = "//a[text()='Concentrates']")
	private WebElement categoriesconcentrates;
	@FindBy(xpath = "//a[text()='Tinctures']")
	private  WebElement categoriesTinctures;
	@FindBy(xpath = "//a[text()='Topicals']")
	private WebElement categoriestopicals;
	@FindBy(xpath = "//a[text()='Capsules']")
	private WebElement categoriesCapsules;
	@FindBy(xpath = "//a[text()='CBD']")
	private WebElement categoriescbd;
	@FindBy(xpath = "//a[text()='Gear']")
	private WebElement categoriesGear;
	@FindBy(xpath = "//a[text()='Merch']")
	private WebElement categoriesMerch;
	@FindBy(xpath = "//a[text()='RYTHM']")
	private WebElement categoriesRYTHM;
	@FindBy(xpath = "//p[@class='text-xs leading-5 tracking-[0.12px] lg:text-sm lg:leading-5 lg:tracking-[0.14px] not-italic font-normal font-arial text-leaf pb-4']")
	private WebElement categoriesshowingtext;

	/*
	 * product list elements
	 */

	@FindBy(xpath = "(//div[@class='w-full  block md:block lg:block'])[4]")
	private WebElement Productlistblock;
	@FindBy(xpath = "(//div[@class='slick-list'])[2]")
	private WebElement Productcarouselproductblock;




	public WebElement getherobanner() {
		return herobanner;
	}
	public WebElement getcategoriessection() {
		return categoriessection;
	}
	public WebElement getcategoriesshowmorecta() {
		return categoriesshowmorecta;
	}
	public WebElement getproductcarousel() {
		return productcarousel;
	}
	public WebElement getproductcarouseltitle() {
		return productcarouseltitle;
	}
	public WebElement getproductcarouselcopytext() {
		return productcarouselcopytext;
	}
	public WebElement getproductcarouselcta() {
		return productcarouselcta;
	}
	public WebElement getbannerinfo() {
		return bannerinfo;
	}
	public WebElement getbannerinfoCTA() {
		return bannerinfoCTA;
	}
	public WebElement getaboutusbanner() {
		return aboutusbanner;
	}
	public WebElement getaboutusCTA() {
		return aboutusCTA;
	}
	public WebElement getjoinnowbanner() {
		return joinnowbanner;
	}
	public WebElement getjoinnowcta() {
		return joinnowcta;
	}
	public WebElement getarticlessection() {
		return articlessection;
	}
	public WebElement getarticleseeallcta() {
		return articleseeallcta;
	}
	public WebElement getwhiteheaderaccounticon() {
		return whiteheaderaccounticon1;
	}
	public WebElement getcategoriesshowlesscta() {
		return categoriesshowlesscta;
	}

	/*
	 * Hero banner steps
	 */


	/*
	 * category elements
	 */
	public WebElement getcategoriesflower(){
		return categoriesflower;
	}
	public WebElement getcategoriesprerolls(){
		return categoriesprerolls;
	}
	public WebElement getcategoriesvape(){
		return categoriesvape;
	}
	public WebElement getcategoriesedibles() {
		return categoriesedibles;
	}
	public WebElement getcategoriesdrinks() {
		return categoriesdrinks;
	}
	public WebElement getcategoriesconcentrates() {
		return categoriesconcentrates;
	}
	public WebElement getcategoriesTinctures() {
		return categoriesTinctures;
	}
	public WebElement getcategoriestopicals() {
		return categoriestopicals;
	}
	public WebElement getcategoriesCapsules() {
		return categoriesCapsules;
	}
	public WebElement getcategoriescbd() {
		return categoriescbd;
	}
	public WebElement getcategoriesGear() {
		return categoriesGear;
	}
	public WebElement getcategoriesMerch() {
		return categoriesMerch;
	}
	public WebElement getcategoriesRYTHM() {
		return categoriesRYTHM;
	}
	public WebElement getcategoriesshowingtext(){
		return categoriesshowingtext;
	}

	/*
	 * product list elements
	 */
	public WebElement getProductlistblock(){
		return Productlistblock;
	}
	public WebElement getProductcarouselproductblock(){
		return Productcarouselproductblock;
	}


	/*
	 * category elements
	 */

	public void clickshowmorecta() {
		try {
			jsClick(getcategoriesshowmorecta());
			Logger.log("User clicked show more cta");
		} catch (Exception e) {
			Logger.log("not able to clicks the show more cta");
		}
	}
	public void flowercolor(){
		String flower = getcategoriesflower().getCssValue("color");
		Assert.assertEquals("rgb(111, 114, 99)",flower);
	}
	public void prerollscolor(){
		String prerolls= getcategoriesprerolls().getCssValue("color");
		Assert.assertEquals("rgb(111, 114, 99)", prerolls);
	}
	public void vapecolor(){
		String vape= getcategoriesvape().getCssValue("color");
		Assert.assertEquals("rgb(111, 114, 99)",vape);
	}
	public void ediblescolor(){
		String edibles=getcategoriesedibles().getCssValue("color");
		Assert.assertEquals("rgb(111, 114, 99)",edibles);
	}
	public void Clickshowlesscta(){
		jsClick(getcategoriesshowlesscta());
		Logger.log("user clicks show less cta");
	}


}
