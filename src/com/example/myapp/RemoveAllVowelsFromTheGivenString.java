package com.example.myapp;
import java.util.Scanner;
public class RemoveAllVowelsFromTheGivenString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine().toLowerCase();
		String vowelRemoved=s.replaceAll("[aeiou]","");
		System.out.println(vowelRemoved);
		sc.close();
	}

}
