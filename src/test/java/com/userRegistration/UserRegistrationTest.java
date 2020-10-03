package com.userRegistration;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


class UserRegistrationTest {
	private String email;
	private String expectedValue;
	public UserRegistrationTest(String email, String expectedValue) {
		super();
		this.email = email;
		this.expectedValue = expectedValue;
	}
	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Object[][] {{"abc-100@yahoo.com", "valid"}, {"abc@yahoo.com", "valid"}, {"abc.100@yahoo.com", "valid"}, 
			{"abc111@abc.com", "valid"}, {"abc-100@abc.net", "valid"}, {"abc.100@abc.com.au", "valid"}, {"abc@1.com", "valid"}, {"abc@gmail.com.com", "valid"}, 
			{"abc+100@gmail.com", "valid"}});
	}	
	@Test
	public void givenSamples_whenExpectedIsTrue_returnTrue() {
		UserRegistration user = new UserRegistration();
		assertEquals(expectedValue, user.validateEmail(email));
	}
	
}


/*	@Test
	public void givenEntry_whenAllDataIsValid_thenReturnHappyMood() {
		UserRegistration obj = new UserRegistration();
		String name = obj.validateName("Bridgelabz");
		String email = obj.validateEmail("abc@gmail.com");
		String number = obj.validateMobileNumber("91 7738454018");
		String password = obj.validatePassword("Bridgelabz99@");		
		assertTrue(name.equals("valid") && email.equals("valid") && number.equals("valid") && password.equals("valid"));
		System.out.println("Happy Mood");
	}
	@Test
	public void givenEntry_whenAnyDataIsInvalid_thenReturnSadMood() {
		UserRegistration obj = new UserRegistration();
		String name = obj.validateName("Bridgelabz");
		String email = obj.validateEmail("abc.xyz@bl.co.in");
		String number = obj.validateMobileNumber("91 7738454018");
		String password = obj.validatePassword("Bridgelabz99@");
		assertTrue(name.equals("invalid") || email.equals("invalid") || number.equals("invalid") || password.equals("invalid"));
		System.out.println("Sad Mood");
		*/


