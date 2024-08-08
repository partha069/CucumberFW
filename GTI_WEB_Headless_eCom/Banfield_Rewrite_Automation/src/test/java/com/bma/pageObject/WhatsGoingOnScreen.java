package com.bma.pageObject;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import com.bma.Utilities.*;
import com.bma.stepDefinition.AboutMarsSteps;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class WhatsGoingOnScreen extends Utilities {

	private static Logger logger = LogManager.getLogger(ViewWelcomeScreen.class);

	AppiumDriver<MobileElement> driver;
	WebDriverWait wait;
	SoftAssert softassert = new SoftAssert();

	public WhatsGoingOnScreen(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	/*
	 * UI Elements
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/screen/header/title")
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name='screen/header/title']")
	public MobileElement _whatsGoingOnTitle;
	
	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
	@FindBy(id = "permission_allow_foreground_only_button")
	public MobileElement _whileUsingTheAppPopups;
	
	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_one_time_button")
	@FindBy(id = "permission_allow_one_time_button")
	public MobileElement _onlyThisTimePopups;
	
	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_deny_button")
	@FindBy(id = "permission_deny_button")
	public MobileElement _denyPopups;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whatsgoingOn/screen/notes")
	@FindBy(id = "schedule/whatsgoingOn/screen/notes")
	public MobileElement _noteForTheVetPlaceHolder;
	
	//id = "com.banfield.react.bpht:id/schedule/whatsgoingOn/screen/notes/Notes for the vet"
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.banfield.react.bpht:id/schedule/whatsgoingOn/screen/notes/Notes for the vet']")
	@FindBy(xpath = "//XCUIElementTypeTextField[@label='Notes for the vet']")
	public MobileElement _noteForTheVetlabel;
	
//	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Tell us more.']")
//	@FindBy(id = "Tell us more.")
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whatsgoingOn/screen/tellusmore-txt")
	@FindBy(id = "schedule/whatsgoingOn/screen/tellusmore-txt")
	public MobileElement _TellUsMorefield;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/whatsgoingon/callahospitalnearyou-btn")
	@FindBy(id = "whatsgoingon/callahospitalnearyou-btn")
	public MobileElement _NotSureCallaHospitalNearYouCTAs;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/preventivecare/call-a-hospital-btn")
	@FindBy(id = "preventivecare/call-a-hospital-btn")
	public MobileElement _NotSureCallaHospitalNearYou_preventivecareCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whatsgoingowpnwp/screen/drop-off-appointments-txt")
	@FindBy(id = "schedule/whatsgoingowpnwp/screen/drop-off-appointments-txt")
	public MobileElement _dropOffAppointmentsText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/preventivecare/pet-needs-dental-cleaning-txt")
	@FindBy(id = "preventivecare/pet-needs-dental-cleaning-txt")
	public MobileElement _OWPDentalMessagingpromoText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whatsgoingowpnwp/screen/notes-txt")
	@FindBy(id = "schedule/whatsgoingowpnwp/screen/notes-txt")
	public MobileElement _AnySpecifcText;
	
	/*
	 * New Patient 
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whatsgoingOn/screen/Vistforreasons/0")
	@FindBy(id = "schedule/whatsgoingOn/screen/Vistforreasons/0")
	public MobileElement _newPet;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whatsgoingOn/screen/Vistforreasons/1")
	@FindBy(id = "schedule/whatsgoingOn/screen/Vistforreasons/1")
	public MobileElement _changingVet;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whatsgoingOn/screen/Vistforreasons/2")
	@FindBy(id = "schedule/whatsgoingOn/screen/Vistforreasons/2")
	public MobileElement _vaccinationNeeded;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whatsgoingOn/screen/Vistforreasons/3")
	@FindBy(id = "schedule/whatsgoingOn/screen/Vistforreasons/3")
	public MobileElement _generalHealthCheck;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whatsgoingOn/screen/Vistforreasons/4")
	@FindBy(id = "schedule/whatsgoingOn/screen/Vistforreasons/4")
	public MobileElement _travelHealthCert;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whatsgoingOn/screen/travel-tag-txt")
	@FindBy(id = "schedule/whatsgoingOn/screen/travel-tag-txt")
	public MobileElement _healthCertificatesStaticText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/whatsgoingon/pet-travel-info-btn")
	@FindBy(id = "whatsgoingon/pet-travel-info-btn")
	public MobileElement _seeOfficialPetTravelInfoCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whatsgoingOn/screen/notes-title-txt")
	@FindBy(id = "schedule/whatsgoingOn/screen/notes-title-txt")
	public MobileElement _NoteForTheVet;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whatsgoingOn/screen/notes-optoonal-txt")
	@FindBy(id = "schedule/whatsgoingOn/screen/notes-optoonal-txt")
	public MobileElement _optionalText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whatsgoingOn/screen/notes-optoonal-txt")
	@FindBy(id = "schedule/whatsgoingOn/screen/notes-optoonal-txt")
	public MobileElement _anySpecificConcernsOrQuestions;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/whatsgoingon/callahospitalnearyou-btn")
	@FindBy(id = "whatsgoingon/callahospitalnearyou-btn")
	public MobileElement _needToTalkCallABanfieldLocationCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whatsgoingOn/screen/next")
	@FindBy(id = "schedule/whatsgoingOn/screen/next")
	public MobileElement _newPatientNextCTA;
	
	/*
	 * Verify Tags Illness
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whatsgoingOn/screen/Vistforreasons/0")
	@FindBy(id = "schedule/whatsgoingOn/screen/Vistforreasons/0")
	public MobileElement _CoatSkin;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whatsgoingOn/screen/Vistforreasons/1")
	@FindBy(id = "schedule/whatsgoingOn/screen/Vistforreasons/1")
	public MobileElement _CoughingSneezingBreathing;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whatsgoingOn/screen/Vistforreasons/2")
	@FindBy(id = "schedule/whatsgoingOn/screen/Vistforreasons/2")
	public MobileElement _EarEyeNose;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whatsgoingOn/screen/Vistforreasons/3")
	@FindBy(id = "schedule/whatsgoingOn/screen/Vistforreasons/3")
	public MobileElement _Seizures;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whatsgoingOn/screen/Vistforreasons/4")
	@FindBy(id = "schedule/whatsgoingOn/screen/Vistforreasons/4")
	public MobileElement _OtherSluggishness;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whatsgoingOn/screen/Vistforreasons/5")
	@FindBy(id = "schedule/whatsgoingOn/screen/Vistforreasons/5")
	public MobileElement _TeethMouth;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whatsgoingOn/screen/Vistforreasons/6")
	@FindBy(id = "schedule/whatsgoingOn/screen/Vistforreasons/6")
	public MobileElement _UrinaryIssues;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whatsgoingOn/screen/Vistforreasons/7")
	@FindBy(id = "schedule/whatsgoingOn/screen/Vistforreasons/7")
	public MobileElement _VomitingDiarrhea;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whatsgoingOn/screen/next")
	@FindBy(id = "schedule/whatsgoingOn/screen/next")
	public MobileElement _nextCTA;
	
	/*
	 * Verify Tags Injury
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whatsgoingOn/screen/Vistforreasons/0")
	@FindBy(id = "schedule/whatsgoingOn/screen/Vistforreasons/0")
	public MobileElement _Lameness;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whatsgoingOn/screen/Vistforreasons/1")
	@FindBy(id = "schedule/whatsgoingOn/screen/Vistforreasons/1")
	public MobileElement _OtherTraumaticInjury;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whatsgoingOn/screen/Vistforreasons/2")
	@FindBy(id = "schedule/whatsgoingOn/screen/Vistforreasons/2")
	public MobileElement _Wound;
	
	/*
	 * Page Navigation Bar
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/visittype/WhatsGoingOn/left")
	@FindBy(id = "schedule/visittype/WhatsGoingOn/left")
	public MobileElement _backCTA;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/visittype/WhatsGoingOn/right")
	@FindBy(name = "schedule/visittype/WhatsGoingOn/right")
	public MobileElement _cancelCTA;
	
	/*
	 * Logged in User 
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whatsgoingowpnwp/screen/left-btn")
	@FindBy(id = "com.banfield.react.bpht:id/schedule/whatsgoingowpnwp/screen/left-btn")
	public MobileElement _WhatsGoingOnBackCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whatsgoingowpnwp/screen/right-btn")
	@FindBy(id = "schedule/whatsgoingowpnwp/screen/right-btn")
	public MobileElement _WhatsGoingOnCancelCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whatsgoingowpnwp/screen/next-btn")
	@FindBy(id = "schedule/whatsgoingowpnwp/screen/next-btn")
	public MobileElement _PreventiveNextCTA;
	
//	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whatsgoingowpnwp/screen/Vistforreasons/0/name-img")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.banfield.react.bpht:id/schedule/whatsgoingowpnwp/screen/Vistforreasons/0/name-img']")
	@FindBy(id = "schedule/whatsgoingowpnwp/screen/Vistforreasons/0/name-img")
	public MobileElement _ComprehensiveExamText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whatsgoingowpnwp/screen/Vistforreasons/0/name-img")
	@FindBy(id = "schedule/whatsgoingowpnwp/screen/Vistforreasons/0/name-img")
	public MobileElement _RoutineVisitText; 
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whatsgoingowpnwp/screen/Vistforreasons/0/radio-img-icn")
	@FindBy(id = "schedule/whatsgoingowpnwp/screen/Vistforreasons/0")
	public MobileElement _RoutineVisitButton;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whatsgoingowpnwp/screen/Vistforreasons/0/radio-img-icn") //ComprehensiveExam
	@FindBy(id = "schedule/whatsgoingowpnwp/screen/Vistforreasons/0")
	public MobileElement _ComprehensiveExamButton;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whatsgoingowpnwp/screen/Vistforreasons/1/name-img")
	@FindBy(id = "schedule/whatsgoingowpnwp/screen/Vistforreasons/1/name-img")
	public MobileElement _VaccinationText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whatsgoingowpnwp/screen/Vistforreasons/1/radio-img-icn")
	@FindBy(id = "schedule/whatsgoingowpnwp/screen/Vistforreasons/1")
	public MobileElement _VaccinationButton;//ddd
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whatsgoingowpnwp/screen/notes-txt")
	@FindBy(id = "schedule/whatsgoingowpnwp/screen/notes-txt")
	public MobileElement _noteForTheVetPlaceHolderOWP;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.banfield.react.bpht:id/schedule/whatsgoingowpnwp/screen/notes-txt/Notes for the vet']")
	@FindBy(id = "schedule/whatsgoingowpnwp/screen/notes-txt/Notes for the vet")
	public MobileElement _noteForTheVetlabelOWP;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whatsgoingowpnwp/screen/tellusmore-txt")
	@FindBy(id = "schedule/whatsgoingowpnwp/screen/tellusmore-txt")
	public MobileElement _TellUsMoreText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whatsgoingowpnwp/screen/Vistforreasons/1")
	@FindBy(id = "schedule/whatsgoingowpnwp/screen/Vistforreasons/1")
	public MobileElement _vaccinationCTA;
	
	public void verifyWhatsGoingonpage() {
		softassert.assertTrue(_TellUsMoreText.isDisplayed());
		softassert.assertTrue(_VaccinationText.isDisplayed());
		softassert.assertTrue(_noteForTheVetPlaceHolderOWP.isDisplayed());
		softassert.assertAll();
	}
	
	/*
	 * Verify "Notes For the Vat"
	 */
	public void verifyfieldsonWhatsGoingOnPage() throws Throwable {
		Thread.sleep(800);
		softassert.assertTrue(_TellUsMorefield.isDisplayed());
		softassert.assertTrue(_CoatSkin.isDisplayed());
	//	Scroll("Notes for the vet");
		swipeDown();
		Thread.sleep(800);
		softassert.assertTrue(_noteForTheVetPlaceHolder.isDisplayed());
		softassert.assertAll();
	}
	
	/*
	 * Verify Tags in What's going on Page - Injury
	 */
	public void verifyTagsOnWhatsGoingOnPageInjury() {
		softassert.assertTrue(_Lameness.isDisplayed());
		softassert.assertTrue(_OtherTraumaticInjury.isDisplayed());
		softassert.assertTrue(_Wound.isDisplayed());
		softassert.assertAll();
	}
	
	public void verifyTagsOnWhatsGoingOnScreen() {
		softassert.assertTrue(_Lameness.isEnabled());
		softassert.assertTrue(_OtherTraumaticInjury.isEnabled());
		softassert.assertTrue(_Wound.isEnabled());
		softassert.assertAll();
	}
	
	/*
	 * Verify Each Tag is tapped - Injury
	 */
	public void verifyTagsisSelectedInjury() {
		TapElement(_Lameness);
		softassert.assertTrue(_Lameness.isEnabled());
		TapElement(_OtherTraumaticInjury);
		softassert.assertTrue(_OtherTraumaticInjury.isEnabled());
		TapElement(_Wound);
		softassert.assertTrue(_Wound.isEnabled());
		softassert.assertAll();
	}
	
	/*
	 * Verify Tags in What's going on Page - Illness
	 */
	public void verifyTagsOnWhatsGoingOnPageIllness() {
	//	softassert.assertTrue(_CoatSkin.isDisplayed());
		softassert.assertTrue(_CoughingSneezingBreathing.isDisplayed());
		softassert.assertTrue(_EarEyeNose.isDisplayed());
		softassert.assertTrue(_Seizures.isDisplayed());
		softassert.assertTrue(_OtherSluggishness.isDisplayed());
		softassert.assertTrue(_TeethMouth.isDisplayed());
		softassert.assertTrue(_UrinaryIssues.isDisplayed());
		softassert.assertTrue(_VomitingDiarrhea.isDisplayed());
		softassert.assertAll();
	}
	
	/*
	 * Scroll & Enter Input for "Notes for the Vet"
	 */
	public void scrollAndEnterNotesForVet() {
	//	Scroll("Notes for the vet");
		EnterInput(_noteForTheVetPlaceHolder, "Test Vet Note");
	}
	
	/*
	 * Verify Notes for the vet - Label 
	 */
	public void scrollAndVerifyNoteLabel() throws Throwable {
	//	Scroll("Notes for the vet");
		EnterInput(_noteForTheVetPlaceHolder, "Vet");
		Thread.sleep(2000);
		softassert.assertTrue(_noteForTheVetlabel.isDisplayed());
		softassert.assertAll();
	}
	
	/*
	 * Verify its Enable & Disable
	 */
	public void verifyTags() {
	//	softassert.assertTrue(_CoatSkin.isEnabled());
		softassert.assertTrue(_CoughingSneezingBreathing.isEnabled());
		softassert.assertTrue(_EarEyeNose.isEnabled());
		softassert.assertTrue(_Seizures.isEnabled());
		softassert.assertTrue(_OtherSluggishness.isEnabled());
		softassert.assertTrue(_TeethMouth.isEnabled());
		softassert.assertTrue(_UrinaryIssues.isEnabled());
		softassert.assertTrue(_VomitingDiarrhea.isEnabled());
		softassert.assertAll();
	}
	
	/*
	 * Verify Each Tag is tapped - Illness
	 */
	public void verifyTagsisSelectedIllness() {
	//	TapElement(_CoatSkin);
	//	softassert.assertTrue(_CoatSkin.isEnabled());
		TapElement(_CoughingSneezingBreathing);
		softassert.assertTrue(_CoughingSneezingBreathing.isEnabled());
		TapElement(_EarEyeNose);
		softassert.assertTrue(_EarEyeNose.isEnabled());
		TapElement(_Seizures);
		softassert.assertTrue(_Seizures.isEnabled());
		TapElement(_OtherSluggishness);
		softassert.assertTrue(_OtherSluggishness.isEnabled());
		TapElement(_TeethMouth);
		softassert.assertTrue(_TeethMouth.isEnabled());
		TapElement(_UrinaryIssues);
		softassert.assertTrue(_UrinaryIssues.isEnabled());
		TapElement(_VomitingDiarrhea);
		softassert.assertTrue(_VomitingDiarrhea.isEnabled());
		softassert.assertAll();
	}
	
	public void verifyTagishighlightedonSelected() {
		TapElement(_Seizures);
		softassert.assertTrue(_Seizures.isEnabled());
		TapElement(_Seizures);
		softassert.assertTrue(_Seizures.isEnabled());
		softassert.assertAll();
	}
	
	public void verifyNewPatientUI() {
		softassert.assertTrue(_TellUsMorefield.isDisplayed());
		softassert.assertTrue(_newPet.isDisplayed());
		softassert.assertTrue(_changingVet.isDisplayed());
		softassert.assertTrue(_vaccinationNeeded.isDisplayed());
		softassert.assertTrue(_generalHealthCheck.isDisplayed());
		softassert.assertTrue(_travelHealthCert.isDisplayed());
		swipeDown();
		softassert.assertTrue(_NoteForTheVet.isDisplayed());
		softassert.assertTrue(_optionalText.isDisplayed());
		softassert.assertTrue(_anySpecificConcernsOrQuestions.isDisplayed());
		softassert.assertTrue(_needToTalkCallABanfieldLocationCTA.isDisplayed());
		softassert.assertTrue(_newPatientNextCTA.isDisplayed());
		softassert.assertAll();
	}
	
	
	public void verifyIlnessUI() {
		softassert.assertTrue(_NoteForTheVet.isDisplayed());
		softassert.assertTrue(_optionalText.isDisplayed());
		softassert.assertTrue(_anySpecificConcernsOrQuestions.isDisplayed());
		softassert.assertTrue(_needToTalkCallABanfieldLocationCTA.isDisplayed());
		softassert.assertTrue(_newPatientNextCTA.isDisplayed());
		softassert.assertAll();
	}
	
	public void verifySelectTagsOperation() { 
		softassert.assertTrue(_newPet.isEnabled());
		TapElement(_changingVet);
		softassert.assertTrue(_changingVet.isEnabled());
		TapElement(_vaccinationNeeded);
		softassert.assertTrue(_vaccinationNeeded.isEnabled());
		TapElement(_generalHealthCheck);
		softassert.assertTrue(_generalHealthCheck.isEnabled());
		TapElement(_travelHealthCert);
		softassert.assertTrue(_travelHealthCert.isEnabled());
		TapElement(_newPet);
		softassert.assertTrue(_newPet.isEnabled());
		TapElement(_changingVet);
		softassert.assertTrue(_changingVet.isEnabled());
		TapElement(_vaccinationNeeded);
		softassert.assertTrue(_vaccinationNeeded.isEnabled());
		TapElement(_generalHealthCheck);
		softassert.assertTrue(_generalHealthCheck.isEnabled());
		TapElement(_travelHealthCert);
		softassert.assertTrue(_travelHealthCert.isEnabled());
	}
	
	}
