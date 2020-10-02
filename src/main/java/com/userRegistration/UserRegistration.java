package com.userRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UserRegistration {
	public static void validateInput(String input,String expression)
	{
		String result;
		String regex = expression;
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		if(matcher.find()) {
			result = input + " is valid";
		}
		else {
			result = input + " is not valid";
		}
		System.out.println(result);
	}
	public static void main(String[] args) {
		UserRegistration user = new UserRegistration();
		String test = "";
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first name");
		test = input.nextLine();
		user.validateInput(test,"^[A-Z]{1}[a-zA-z]{2,}");//validation of first name	
	}

}
