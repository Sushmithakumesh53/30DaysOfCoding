package com.example.myapp;
import java.util.Scanner;
public class Day1FirstProgramSwappingUsingThirdVariable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of a:");
		int a = sc.nextInt();
		
		System.out.println("Enter the value of b:");
		int b = sc.nextInt();
		
		System.out.println("Before Swapping: a = " + a + " b = " + b);
		
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("After Swapping: a = " + a + " b = " + b);
	}

}
