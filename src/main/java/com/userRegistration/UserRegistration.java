package com.userRegistration;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UserRegistration {
	public static boolean validateInput (String input,String expression) {
		String regex = expression;
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		return matcher.find();
	}
	public static String validateFirstName(String firstName) {
		String result = "";
		try {
		if(validateInput(firstName, "^[A-Z]{1}[a-zA-z]{2,}")) {
			result = "valid";
		}
		else {
			throw new InvalidUserDetailsException(InvalidUserDetailsException.invalidCredentials.invalidFirstName, "Invalid User Details");
		}
		}
		catch(InvalidUserDetailsException exception) {
			return exception.type.toString();
		}
		return result;
	}
	public static String validateLastName(String lastName) {
		String result = "";
		try {
		if(validateInput(lastName, "^[A-Z]{1}[a-zA-z]{2,}")) {
			result = "valid";
		}
		else {
			throw new InvalidUserDetailsException(InvalidUserDetailsException.invalidCredentials.invalidLastName, "Invalid User Details");
		}
		}
		catch(InvalidUserDetailsException exception) {
			return exception.type.toString();
		}
		return result;
	}
	public static String validateEmail(String email) {
		String result = "";
		try {
		if(validateInput(email, "^[a-zA-Z0-9_]+[-+.]?[A-Za-z0-9_]+@[A-Za-z0-9]+[.][a-z]{2,}[.]?([a-z]{2,})?$")) {
			result = "valid";
		}
		else {
			throw new InvalidUserDetailsException(InvalidUserDetailsException.invalidCredentials.invalidEmail, "Invalid User Details");
		}
		}
		catch(InvalidUserDetailsException exception) {
			return exception.type.toString();
		}
		return result;
	}
	public static String validateMobileNumber(String number) {
		String result = "";
		try {
		if(validateInput(number, "^[0-9]{2}?[ ][0-9]{4,13}")) {
			result = "valid";
		}
		else {
			throw new InvalidUserDetailsException(InvalidUserDetailsException.invalidCredentials.invalidMobileNumber, "Invalid User Details");
		}
		}
		catch(InvalidUserDetailsException exception) {
			return exception.type.toString();
		}
		return result;
	}
	public static String validatePassword(String password) {
		String result = "";
		try {
		if(validateInput(password, "^(?=.*\\d)(?=.*[A-Z])(?=.*[@$!%*?&]).{8,}$")) {
			result = "valid";
		}
		else {
			throw new InvalidUserDetailsException(InvalidUserDetailsException.invalidCredentials.invalidPassword, "Invalid User Details");
		}
		}
		catch(InvalidUserDetailsException exception) {
			return exception.type.toString();
		}
		return result;
	}
	public static void main(String[] args) {
		UserRegistration user = new UserRegistration();
		String test = "";
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first name");
		test = input.nextLine();
		String result = user.validateFirstName(test);//validation of first name	
		System.out.println(result);
		System.out.println("Enter the last name");
		test = input.nextLine();
		System.out.println(user.validateLastName(test));//validation of last name
		System.out.println("Enter the Email");
		test=input.nextLine();
		System.out.println(user.validateEmail(test));//validation of email
		System.out.println("Enter the Mobile Number");
		test = input.nextLine();
		System.out.println(user.validateMobileNumber(test));//validation of MobileNumber
		System.out.println("Enter the Password");
		test = input.nextLine();
		System.out.println(user.validatePassword(test));//validation of Password
	}

}
