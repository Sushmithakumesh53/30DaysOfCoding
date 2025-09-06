package com.example.myapp;
import java.util.Scanner;
public class extractthedigitfromastring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String digit ="";
		for(int i = 0; i <= s.length()-1; i++) {
			if(Character.isDigit((s.charAt(i)))) {
				digit = digit + s.charAt(i);
			}
		}
		System.out.print("digits: "+ digit);
		sc.close();
	}


}
