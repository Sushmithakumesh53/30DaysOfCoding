package com.example.myapp;
import java.util.Scanner;
public class StringRotationCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		boolean rotation = (s1.length() == s2.length())&&((s1+s2).contains(s2));
		if(rotation) {
			System.out.println("The String "+s2+" is a rotation of "+s1);
		} else {
			System.out.println("The String "+s2+" is not a rotation of "+s1);
		}
		sc.close();
	}

}
