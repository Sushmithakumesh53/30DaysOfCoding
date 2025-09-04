package com.example.myapp;
import java.util.Scanner;
public class Day2FirstProgramArmStrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int k = n;
		int power = 0;
		while(n > 0) {
			n = n / 10;
			power++;
		}
		n = k;
		int res = 0;
		while(n > 0) {
			int rem = n % 10;
			res = res + (int)(Math.pow(rem,power));
			n = n / 10;
		}
		if(k == res) {
			System.out.println("ArmStrong Number");
		} else {
			System.out.println("Not an ArmStrong Number");
		}
		sc.close();
	}

}
