package tests;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class RegistrationTests extends BaseTests
{
	gbd
	@Test (description = "This test case is to verify that the firstname and lastname is entered.", groups= {"abc"})
	public void enterFirstNameAndLastNameTest()
	{
		methods.get().log(Status.INFO, "Running enterFirstNameAndLastNameTest");
	}

	@Test (description = "This test case verifies whether the radio button single is selected.")
	public void selectMaritalStatusTest()
	{
		methods.get().log(Status.INFO, "Running selectMaritalStatusTest");
	}

	@Test (description = "This test case verifies whether the reading check box is selected.")
	public void selectAHobbyTest()
	{
		methods.get().log(Status.INFO, "Running selectAHobbyTest");
	}

	@Test (description = "This test case verifies whether the country is selected.")
	public void selectCountryTest()
	{
		methods.get().log(Status.INFO, "Running selectCountryTest");
	}

}