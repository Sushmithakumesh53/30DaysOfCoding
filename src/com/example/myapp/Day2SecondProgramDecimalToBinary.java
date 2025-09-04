package com.example.myapp;
import java.util.Scanner;
public class Day2SecondProgramDecimalToBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		String rev = "";
		int rem = 0;
		while(n!=0) {
			rem = n % 2;
			rev = rem + rev;
			n = n / 2;
		}
		System.out.println(rev);
		sc.close();

	}

}
