package com.example.myapp;
import java.util.Scanner;
public class LongestSubStringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String sub = "";
		for(int i = 0; i <= str.length()-1; i++) {
			for(int j = i+1; j <= str.length()-1; j++) {
				Sub = str.substring(i, j);
			}
		}
		import java.util.Scanner;

		public class Main {
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        String s = sc.next();
		        String max = "";
		        for (int i = 0; i < s.length(); i++) {
		            for(int j = i + 1; j <= s.length(); j++) {
		                String sub = s.substring(i, j);
		                if (isUnique(sub) == true) {
		                    if(sub.length() > max.length())
		                        max = sub;
		                }
		            }
		        }
		        System.out.println("The length of the longest substring without repeating characters is: " + max.length());
		    }
		    public static boolean isUnique(String sub) {
		        String str = "";
		        for(int i = 0; i < sub.length(); i++) {
		            char ch = sub.charAt(i);
		            if(!str.contains(ch + ""))
		                str = str + ch;
		        }
		        return sub.equals(str);
		    }
		}
	}

}
