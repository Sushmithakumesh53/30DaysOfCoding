package com.example.myapp;
import java.util.Scanner;
public class CapitalizeFirstLetter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] word = s.split(" "); 
		StringBuilder sb = new StringBuilder();
		for(String wor: word) {
			if(!wor.isEmpty()) {
				sb.append(Character.toUpperCase(wor.charAt(0)));
			}
			if(wor.length() > 1) {
				sb.append(wor.substring(1));
			}
			sb.append(" ");
		}
		System.out.println(sb.toString());
		sc.close();

	}

}
