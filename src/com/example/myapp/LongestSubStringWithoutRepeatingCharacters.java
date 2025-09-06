package com.example.myapp;
import java.util.Scanner;
public class LongestSubStringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String max = "";
		for(int i = 0; i <= str.length()-1; i++) {
			for(int j = i+1; j <= str.length(); j++) {
				String sub = str.substring(i, j);
				if(isUnique(sub) == true) {
					if(sub.length() >= max.length()) {
						max = sub;
					}
				
				}
			}
		}
		System.out.println("The Longest Substring is: " + max);
		sc.close();
	}
		public static boolean isUnique(String sub) {
			String s ="";
			for(int i = 0 ; i <= sub.length()-1; i++) {
				char ch = sub.charAt(i);
				if(!s.contains(ch+"")) {
					s = s + ch;
				}
			}
			return sub.equals(s);
		}
		

	
}
