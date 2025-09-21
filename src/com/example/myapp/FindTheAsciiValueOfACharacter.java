package com.example.myapp;
import java.util.Scanner;
public class FindTheAsciiValueOfACharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		int asciiValue = (int)(ch);
		System.out.println("The AsciiValue of Character "+ch+" is: "+asciiValue);
		sc.close();
	}

}
