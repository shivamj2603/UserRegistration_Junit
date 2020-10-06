package com.userRegistration;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UserRegistration {
	static final String regexForName = "^[A-Z]{1}[a-zA-z]{2,}";
	static final String regexForEmail = "^[a-zA-Z0-9_]+[-+.]?[A-Za-z0-9_]+@[A-Za-z0-9]+[.][a-z]{2,}[.]?([a-z]{2,})?$";
	static final String regexForMobileNumber = "^([0-9]{1,4}[ ][0-9]{10})$";
	static final String regexForPassword = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[$#@!%_&])[A-Za-z0-9$#@!%_&]{8,}$";
	public static String validateFirstName(String firstName, ValidateInput validate) {
		String result = "";
		try {
			if(validate.validateInput(firstName, regexForName)) {
				result = "valid";
			}
			else {
				throw new InvalidUserDetailsException(InvalidUserDetailsException.invalidCredentials.invalidFirstName, "Invalid User Details");
			}
		}
		catch(InvalidUserDetailsException exception) {
			result = exception.type.toString();
		}
		return result;
	}
	public static String validateLastName(String lastName, ValidateInput validate) {
		String result = "";
		try {
			if(validate.validateInput(lastName, regexForName)) {
				result = "valid";
			}
			else {
				throw new InvalidUserDetailsException(InvalidUserDetailsException.invalidCredentials.invalidLastName, "Invalid User Details");
			}
		}
		catch(InvalidUserDetailsException exception) {
			result = exception.type.toString();
		}
		return result;
	}
	public static String validateEmail(String email, ValidateInput validate) {
		String result = "";
		try {
			if(validate.validateInput(email, regexForEmail)) {
				result = "valid";
			}
			else {
				throw new InvalidUserDetailsException(InvalidUserDetailsException.invalidCredentials.invalidEmail, "Invalid User Details");
			}
		}
		catch(InvalidUserDetailsException exception) {
			result = exception.type.toString();
		}
		return result;
	}
	public static String validateMobileNumber(String number, ValidateInput validate) {
		String result = "";
		try {
			if(validate.validateInput(number, regexForMobileNumber)) {
				result = "valid";
			}
			else
			{
				throw new InvalidUserDetailsException(InvalidUserDetailsException.invalidCredentials.invalidMobileNumber, "Invalid User Details");
			}
		}
		catch(InvalidUserDetailsException exception) {
			result = exception.type.toString();
		}
		return result;
	}
	public static String validatePassword(String password, ValidateInput validate) {
		String result = "";
		try {
			if(validate.validateInput(password,regexForPassword)) {
				result = "valid";
			}
			else {
				throw new InvalidUserDetailsException(InvalidUserDetailsException.invalidCredentials.invalidPassword, "Invalid User Details");
			}
		}
		catch(InvalidUserDetailsException exception) {
			result = exception.type.toString();
		}
		return result;
	}
	    ValidateInput validate = (String input, String regex) -> {
		boolean result;
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		if(matcher.find()) {
			result = true;
		}
		else {
			result = false;
		}	
		return result;
	};
	public static void main(String[] args) {
		UserRegistration user = new UserRegistration();
		String test = "";
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first name");
		test = input.nextLine();
		System.out.println(user.validateFirstName(test, user.validate));//validation of first name	
		System.out.println("Enter the last name");
		test = input.nextLine();
		System.out.println(user.validateLastName(test, user.validate));//validation of last name
		System.out.println("Enter the Email");
		test=input.nextLine();
		System.out.println(user.validateEmail(test, user.validate));//validation of email
		System.out.println("Enter the Mobile Number");
		test = input.nextLine();
		System.out.println(user.validateMobileNumber(test, user.validate));//validation of MobileNumber
		System.out.println("Enter the Password");
		test = input.nextLine();
		System.out.println(user.validatePassword(test, user.validate));//validation of Password
	}

}
