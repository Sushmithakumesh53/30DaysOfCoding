package com.example.myapp;
import java.util.Scanner;
public class Day3ThirdProgramFactorialOfANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		
		System.out.println(fact(n));
		sc.close();
	}
	public static int fact(int n) {
		int f = 1;
		if(n == 0) {
			return f;
		}
		else {
			return n * fact(n - 1);
		}
	}

}
