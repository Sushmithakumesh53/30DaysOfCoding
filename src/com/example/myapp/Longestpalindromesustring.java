package com.example.myapp;
import java.util.Scanner;
public class Longestpalindromesustring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String max = "";
		for(int i = 0; i <= str.length()-1; i++) {
			for(int j = i+1; j <= str.length(); j++) {
				String sub = str.substring(i, j);
					if(sub.length() >= max.length()) {
						if(isPalindrome(sub) == true) {
							max = sub;
						}
					}
				
				}
			}
		System.out.println("The Longest Substring is: " + max);
		sc.close();
	}
	public static boolean isPalindrome(String sub) {
			String rev="";
			for(int k = sub.length()-1; k >= 0; k--) {
				char ch = sub.charAt(k);
				rev = rev + ch;
			}	
			return rev.equals(sub);

		}	
}



