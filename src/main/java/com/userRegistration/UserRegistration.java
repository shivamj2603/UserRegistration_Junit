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
	public static String validateFirstName(String firstName) {
		String result = "";
		if(validateInput(firstName, "^[A-Z]{1}[a-zA-z]{2,}")) {
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
		String result = user.validateFirstName(test);//validation of first name	
		System.out.println(result);
	}

}
