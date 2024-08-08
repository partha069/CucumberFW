package com.bma.pageObject;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.*;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class PetDetailsScreen extends Utilities {

	SoftAssert softassert = new SoftAssert();
	AppiumDriver<MobileElement> driver;
	WebDriverWait wait;

	private static Logger logger = LogManager.getLogger(PetDetailsScreen.class);

	public PetDetailsScreen(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/screen/header/title")
	@FindBy(id = "screen/header/title")
	public MobileElement _petDetailsTitle;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/recentpetvisit/visitdetail/title/DATE_TIME")
	@FindBy(id = "home/recentpetvisit/visitdetail/title/DATE_TIME")
	public MobileElement _dateAndTimeText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/recentpetvisit/visitdetail/subtitle/DATE_TIME")
	@FindBy(id = "home/recentpetvisit/visitdetail/subtitle/DATE_TIME")
	public MobileElement _dateAndTime;
	
	/*
	 * Concern Elements
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/recentpetvisit/card/title")
	@FindBy(id = "home/recentpetvisit/card/title")
	public MobileElement _ConcernTitleText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/recentpetvisit/document/title-home/recentpetvisit/concerncard/vetchat")
	@FindBy(id = "home/recentpetvisit/document/title-home/recentpetvisit/concerncard/vetchat")
	public MobileElement _vetChatText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/recentpetvisit/document/subtitle/home/recentpetvisit/concerncard/vetchat")
	@FindBy(id = "home/recentpetvisit/document/subtitle/home/recentpetvisit/concerncard/vetchat")
	public MobileElement _Available24_7Text;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/recentpetvisit/carditem/img/home/recentpetvisit/concerncard/vetchat")
	@FindBy(id = "home/recentpetvisit/carditem/img/home/recentpetvisit/concerncard/vetchat")
	public MobileElement _vetChat;
	
	//id = "androidalert/popup/text"
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='androidalert/popup/text']")
	@FindBy(id = "popup/text")
	public MobileElement _nativePopupsForCheckEligibilityText;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Okay']") //Missing ID
	@FindBy(id = "android.widget.TextView")
	public MobileElement _okayCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/recentpetvisit/carditem/img/home/recentpetvisit/concerncard/hospitalcall")
	@FindBy(id = "home/recentpetvisit/carditem/img/home/recentpetvisit/concerncard/hospitalcall")
	public MobileElement _callHospital;
	
	
	
	/*
	 * Documents
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/recentpetvisit/carditem/img/home/recentpetvisit/documentcard/invoice")
	@FindBy(id = "home/recentpetvisit/carditem/img/home/recentpetvisit/documentcard/invoice")
	public MobileElement _invoice;
	
	/*
	 * Medical Details
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/recentpetvisit/medicaldetailsitem/Medicinetxt")
	@FindBy(id = "home/recentpetvisit/medicaldetailsitem/Medicinetxt")
	public MobileElement _Medicine;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/petvisit/medicinename0-txt")
	@FindBy(id = "petvisit/medicinename0-txt")
	public MobileElement _MedicineName;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/recentpetvisit/medicaldetailsitem/Vaccinestxt")
	@FindBy(id = "home/recentpetvisit/medicaldetailsitem/Vaccinestxt")
	public MobileElement _Vaccines;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/petvisit/novaccine-txt")
	@FindBy(id = "petvisit/novaccine-txt")
	public MobileElement _noVaccines;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/petvisit/vaccinename0-txt")
	@FindBy(id = "petvisit/vaccinename0-txt")
	public MobileElement _VaccinesName1;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/petvisit/vaccinename1-txt")
	@FindBy(id = "petvisit/vaccinename1-txt")
	public MobileElement _VaccinesName2;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/petvisit/vaccinename2-txt")
	@FindBy(id = "petvisit/vaccinename2-txt")
	public MobileElement _VaccinesName3;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/recentpetvisit/medicaldetailsitem/Labstxt")
	@FindBy(id = "home/recentpetvisit/medicaldetailsitem/Labstxt")
	public MobileElement _Labs;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/petvisit/labtestsresult-txt/0")
	@FindBy(id = "petvisit/labtestsresult-txt/0")
	public MobileElement _LabResultNA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/petvisit/labtestsrangevalue-txt/0")
	@FindBy(id = "petvisit/labtestsrangevalue-txt/0")
	public MobileElement _LabRangeNA;
	
	/*
	 * Labs Reports
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/petvisit/nomedicine-txt")
	@FindBy(id = "petvisit/nomedicine-txt")
	public MobileElement _NoMedications;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/petvisit/novaccine-txt")
	@FindBy(id = "petvisit/novaccine-txt")
	public MobileElement _NoVaccines;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/petvisit/novaccine-txt")
	@FindBy(id = "petvisit/novaccine-txt")
	public MobileElement _NoLabs;
	
	/*
	 * Back CTA
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/recentpetvisit/header/left-btn")
	@FindBy(id = "home/recentpetvisit/header/left-btn")
	public MobileElement _backCTA;
	
	/*
	 * Labs Name of the Test Lab Result Details
	 */	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/petvisit/labtests-txt/0")
	@FindBy(id = "petvisit/labtests-txt/0")
	public MobileElement _Ehrlichia; 
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/petvisit/labtestsname-txt/41")
	@FindBy(id = "petvisit/labtestsname-txt/41")
	public MobileElement _LABresult;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/petvisit/labtestsevaluation-txt/0")
	@FindBy(id = "petvisit/labtestsevaluation-txt/0")
	public MobileElement _EhrlichiaLabResult;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/petvisit/labtests-txt/1")
	@FindBy(id = "petvisit/labtests-txt/1")
	public MobileElement _Heartworm;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/petvisit/labtestsevaluation-txt/1")
	@FindBy(id = "petvisit/labtestsevaluation-txt/1")
	public MobileElement _HeartwormLabResults;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/petvisit/labtests-txt/2")
	@FindBy(id = "petvisit/labtests-txt/2")
	public MobileElement _Lyme;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/petvisit/labtestsevaluation-txt/2")
	@FindBy(id = "petvisit/labtestsevaluation-txt/2")
	public MobileElement _LymeLabResults;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/petvisit/labtests-txt/3")
	@FindBy(id = "petvisit/labtests-txt/3")
	public MobileElement _Anaplasma;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/petvisit/labtestsevaluation-txt/3")
	@FindBy(id = "petvisit/labtestsevaluation-txt/0")
	public MobileElement _AnaplasmaLabResult;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/petvisit/labtests-txt/4")
	@FindBy(id = "petvisit/labtests-txt/1")
	public MobileElement _ALBGlob;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/petvisit/labtestsevaluation-txt/4")
	@FindBy(id = "petvisit/labtestsevaluation-txt/1")
	public MobileElement _ALBGlobLabResults;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/petvisit/labtests-txt/5")
	@FindBy(id = "petvisit/labtests-txt/2")
	public MobileElement _Albumin;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/petvisit/labtestsevaluation-txt/5")
	@FindBy(id = "petvisit/labtestsevaluation-txt/2")
	public MobileElement _AlbuminLabResults;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/petvisit/labtests-txt/6")
	@FindBy(id = "petvisit/labtests-txt/1")
	public MobileElement _Alkaline;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/petvisit/labtestsevaluation-txt/6")
	@FindBy(id = "petvisit/labtestsevaluation-txt/1")
	public MobileElement _AlkalineLabResults;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/petvisit/labtests-txt/7")
	@FindBy(id = "petvisit/labtests-txt/1")
	public MobileElement _ALTSGPT;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/petvisit/labtestsevaluation-txt/7")
	@FindBy(id = "petvisit/labtestsevaluation-txt/1")
	public MobileElement _ALTSGPTLabResults;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/petvisit/labtests-txt/8")
	@FindBy(id = "petvisit/labtests-txt/1")
	public MobileElement _Bilirubin;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/petvisit/labtestsevaluation-txt/8")
	@FindBy(id = "petvisit/labtestsevaluation-txt/1")
	public MobileElement _BilirubinLabResults;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/petvisit/labtests-txt/9")
	@FindBy(id = "petvisit/labtests-txt/1")
	public MobileElement _BUN;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/petvisit/labtestsevaluation-txt/9")
	@FindBy(id = "petvisit/labtestsevaluation-txt/1")
	public MobileElement _BUNLabResults;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/petvisit/labtests-txt/10")
	@FindBy(id = "petvisit/labtests-txt/1")
	public MobileElement _BUNCrea;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/petvisit/labtestsevaluation-txt/10")
	@FindBy(id = "petvisit/labtestsevaluation-txt/1")
	public MobileElement _BUNCreaLabResults;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/petvisit/labtests-txt/11")
	@FindBy(id = "petvisit/labtests-txt/1")
	public MobileElement _Calcium;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/petvisit/labtestsevaluation-txt/11")
	@FindBy(id = "petvisit/labtestsevaluation-txt/1")
	public MobileElement _CalciumLabResults;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/petvisit/labtests-txt/12")
	@FindBy(id = "petvisit/labtests-txt/1")
	public MobileElement _Cholesterol;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/petvisit/labtestsevaluation-txt/12")
	@FindBy(id = "petvisit/labtestsevaluation-txt/1")
	public MobileElement _CholesterolLabResults;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/petvisit/labtests-txt/14")
	@FindBy(id = "petvisit/labtests-txt/1")
	public MobileElement _GammaGlutamylTransferase;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/petvisit/labtestsevaluation-txt/14")
	@FindBy(id = "petvisit/labtestsevaluation-txt/1")
	public MobileElement _GammaGlutamylTransferaseResults;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/petvisit/labtests-txt/15")
	@FindBy(id = "petvisit/labtests-txt/1")
	public MobileElement _Globulin;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/petvisit/labtestsevaluation-txt/15")
	@FindBy(id = "petvisit/labtestsevaluation-txt/1")
	public MobileElement _GlobulinLabResults;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/petvisit/labtests-txt/48")
	@FindBy(id = "petvisit/labtests-txt/1")
	public MobileElement FecalWhipwormEggs;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/petvisit/labtestsevaluation-txt/48")
	@FindBy(id = "petvisit/labtestsevaluation-txt/1")
	public MobileElement _FecalWhipwormEggsLabResults;
	
	public void verifylabsResult() throws Throwable {
		Thread.sleep(1000);
	//	ScrolltoElement("Electrocardiogram Interpretation");
		softassert.assertTrue(_Ehrlichia.isDisplayed());
	//	softassert.assertTrue(_Ehrlichia.isDisplayed());
	//	softassert.assertTrue(_EhrlichiaLabResult.isDisplayed());
	//	softassert.assertTrue(_Heartworm.isDisplayed());
	//	softassert.assertTrue(_HeartwormLabResults.isDisplayed());
	//	softassert.assertTrue(_Lyme.isDisplayed());
	//	softassert.assertTrue(_LymeLabResults.isDisplayed());
	//	ScrolltoElement("Fecal - Whipworm Eggs");
	//	softassert.assertTrue(FecalWhipwormEggs.isDisplayed());
	//	softassert.assertTrue(_FecalWhipwormEggsLabResults.isDisplayed());
		softassert.assertAll();
	}
	
	public void verifyVaccines() {
		softassert.assertTrue(_VaccinesName1.isDisplayed());
	//	softassert.assertTrue(_VaccinesName1.isDisplayed());
	//	softassert.assertTrue(_VaccinesName2.isDisplayed());
	//	softassert.assertTrue(_VaccinesName3.isDisplayed());
		softassert.assertAll();	
	}
	
	public void verifyMedicalDetails() {
		softassert.assertTrue(_Medicine.isDisplayed());
		softassert.assertTrue(_Vaccines.isDisplayed());//
	//	ScrolltoElement("Labs");
		softassert.assertTrue(_Labs.isDisplayed());
		softassert.assertAll();	
	}
	

	public void verifyConcern() {
		softassert.assertTrue(_ConcernTitleText.isDisplayed());
		softassert.assertTrue(_vetChat.isDisplayed());
		softassert.assertTrue(_callHospital.isDisplayed());
		softassert.assertAll();
	}
}
