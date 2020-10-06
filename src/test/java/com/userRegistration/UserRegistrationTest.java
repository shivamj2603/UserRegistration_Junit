package com.userRegistration;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;



public class UserRegistrationTest{
	UserRegistration user = new UserRegistration();
	@Test
	public void givenFirstName_Valid_shouldReturnValid() {
		assertEquals("valid", user.validateFirstName("Abc", user.validate));
	}
	@Test
	public void givenLastName_Valid_shouldReturnValid() {
		assertEquals("valid", user.validateLastName("Abc", user.validate));
	}
	@Test
	public void givenEmail_Valid_shouldReturnValid() {
		assertEquals("valid", user.validateEmail("abc@gmail.com",user.validate));
	}
	@Test
	public void givenMobileNumber_Valid_shouldReturnValid() {
		assertEquals("valid", user.validateMobileNumber("91 7738454018", user.validate));
	}
	@Test
	public void givenPassword_Valid_shouldReturnValid() {
		assertEquals("valid", user.validatePassword("Shivam9@p", user.validate));
	}
	@Test
	public void givenFirstName_Invalid_shouldReturnInvalid() {
		assertEquals("invalidFirstName", user.validateFirstName("S", user.validate));
	}
	@Test
	public void givenLastName_Invalid_shouldReturnInvalid() {
		assertEquals("invalidLastName", user.validateLastName("Sh", user.validate));
	}
	@Test
	public void givenEmail_Invalid_shouldReturnInvalid() {
		assertEquals("invalidEmail", user.validateEmail("Shivam", user.validate));
	}
	@Test
	public void givenMobileNumber_Invalid_shouldReturnInvalid() {
		assertEquals("invalidMobileNumber", user.validateMobileNumber("Shivam", user.validate));
	}
	@Test
	public void givenPassword_Invalid_shouldReturnInvalid() {
		assertEquals("invalidPassword", user.validatePassword("Shivam", user.validate));
	}

}