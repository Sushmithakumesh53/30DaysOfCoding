package com.example.myapp;
import java.util.Scanner;
public class Day3FirstProgramPalindrome {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int k = n;
		int rev = 0;
		while(n!=0) {
			int rem = n % 10;
			rev = rem + rev * 10;
			n = n / 10;
		}
		if (k == rev) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}
		sc.close();
	}

}
