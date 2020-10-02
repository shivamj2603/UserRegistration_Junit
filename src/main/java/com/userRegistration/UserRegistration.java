package com.userRegistration;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UserRegistration {
	public static boolean validateInput(String input,String expression)
	{
		String regex = expression;
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		return matcher.find();
	}
	public static String validateName(String name) {
		String result = "";
		if(validateInput(name, "^[A-Z]{1}[a-zA-z]{2,}")) {
			result = "valid";
		}
		else {
			result = "invalid";
		}
		return result;
	}
	public static String validateEmail(String email) {
		String result = "";
		if(validateInput(email, "(abc[.][A-Za-z]+@bl[.]co[.][A-Za-z]{2,})$")) {
			result = "valid";
		}
		else {
			result = "invalid";
		}
		return result;
	}
	public static String validateMobileNumber(String number) {
		String result = "";
		if(validateInput(number, "^[0-9]{2}?[ ][0-9]{4,13}")) {
			result = "valid";
		}
		else {
			result = "invalid";
		}
		return result;
	}
	public static String validatePassword(String password) {
		String result = "";
		if(validateInput(password, "^(?=.*\\d)(?=.*[A-Z])(?=.*(!@#$%^&*()_+-=)).{8,}$")) {
			result = "valid";
		}
		else {
			result = "invalid";
		}
		return result;
	}
	public static void verifyEmail(String[] email) {
		for(int i = 0; i <= 20; i++)
		{
			System.out.println(validateEmail(email[i]));
		}
	}
	public static void main(String[] args) {
		UserRegistration user = new UserRegistration();
		String test = "";
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first name");
		test = input.nextLine();
		String result = user.validateName(test);//validation of first name	
		System.out.println(result);
		System.out.println("Enter the last name");
		test = input.nextLine();
		System.out.println(user.validateName(test));//validation of last name
		System.out.println("Enter the Email");
		test=input.nextLine();
		System.out.println(user.validateEmail(test));//validation of email
		System.out.println("Enter the Mobile Number");
		test = input.nextLine();
		System.out.println(user.validateMobileNumber(test));//validation of MobileNumber
		System.out.println("Enter the Password");
		test = input.nextLine();
		System.out.println(user.validatePassword(test));//validation of Password
		String[] emails = {"abc-100@yahoo.com","abc.100@yahoo.com","abc111@abc.com","abc-100@abc.net","abc.100@abc.com.au","abc@1.com",
				"abc@gmail.com.com","abc+100@gmail.com","abc","abc@gmail.com.aa.au","abc@gmail.com.1a","abc@abc@gmail.com",
				"abc.@gmail.com","abc..2002@gmail.com","abc@%*.com","abc()*@gmail.com",".abc@abc.com","abc123@.com.com","abc123@.com",
				"abc123@gmail.a","abc@.com.my"};
		verifyEmail(emails);
	}

}
