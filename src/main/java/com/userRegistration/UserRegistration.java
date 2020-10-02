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
		result = user.validateName(test);//validation of first name	
		System.out.println(result);
	}

}
