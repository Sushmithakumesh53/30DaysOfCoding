package com.example.myapp;
import java.util.Scanner;
public class Day2ThirdProgramFibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		while(a <= n) {
			System.out.println(a);
			int next = a + b;
			a = b;
			b = next;
		}
		sc.close();
	}

}
