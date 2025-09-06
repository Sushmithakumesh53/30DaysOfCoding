package com.example.myapp;
import java.util.Scanner;
import java.util.regex.Pattern;
//import java.util.regex.PatternSyntaxException;
public class RegexPatternValidate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		try {
			Pattern.compile(input);
			System.out.println("valid");
		} catch(Exception e) {
			System.out.println("Invalid");
		}
		finally {
			sc.close();
		}
	}

}
