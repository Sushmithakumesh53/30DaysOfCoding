package com.example.myapp;
import java.util.Scanner;
public class Day4FirstProgramPattern1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		for(int i = 1 ;i <= n  ; i++) {
			for(int j = 1 ;j <= (5 - i); j++) {
				System.out.print(" ");
			}
			for(int k = 1;k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		sc.close();

	}

}
