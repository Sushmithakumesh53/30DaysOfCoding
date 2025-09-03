package com.example.myapp;

import java.util.Scanner;

public class Day1SecondProgramCheckPositiveNegativeOrZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		if(n > 0) {
			System.out.println(n + " is Positive number");
		} else if(n < 0) {
			System.out.println(n + " is Negative number");
		} else {
			System.out.println(n + " is Zero");
		}
		sc.close();

	}

}
