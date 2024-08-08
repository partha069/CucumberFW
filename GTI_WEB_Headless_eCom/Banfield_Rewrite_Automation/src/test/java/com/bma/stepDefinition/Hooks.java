package com.bma.stepDefinition;
import com.bma.Utilities.Utilities;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks extends Utilities{
	public static String getUserDeviceInput;	
	
	@Before
	public void setUp(Scenario scenario) throws Throwable {
		//i_initiate_accessibilty();
		initiateApp(scenario);
		System.out.println("App initiated");
}

	@After
	public void tearDown() throws Throwable {
	//	i_initiate_Access_Engine_tests();
	//	i_see_no_accessibility_issues();
			terminateApp();
	}


}
