package com.bma.stepDefinition;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.LegalStuffStepsScreen;
import com.bma.pageObject.WhenAndWhereScreen;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Appointment_WhenAndWhere_TimeSlot_Time_Sensitive_RuleSteps extends Utilities {

	public WhenAndWhereScreen WhenAndWhere = new WhenAndWhereScreen(driver);

	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(Appointment_WhenAndWhere_TimeSlot_Time_Sensitive_RuleSteps.class);

	@And("^the user remains idle on the screen or takes more than 5 min to book the appointment$")
	public void user_remains_idle_on_the_screen() throws Throwable {
		TapElement(WhenAndWhere._nextavailableText);
	//	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	//	Thread.sleep(1000 * 60 * 5);
	//	TimeUnit.MINUTES.sleep(5);
		TimeUnit.MINUTES.sleep(6);  
		logger.info("the user remains idle on the screen or takes more than 5 min to book the appointment");
	}

	@And("^the user can select the time slots$")
	public void the_user_can_select_the_time_slots() throws Throwable {
		ScrolltoElement("Next available");
		try {
	 	WhenAndWhere.chooseSlot2();
		} catch (Exception e) {
		TapElement(WhenAndWhere._slot7);
		WhenAndWhere._slot7.isEnabled();
		TapElement(WhenAndWhere._slot2);
		WhenAndWhere._slot2.isEnabled();
		}
		
		logger.info("the user can select the time slots");
	}
}
