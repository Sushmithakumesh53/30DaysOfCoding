package com.example.myapp;
import java.util.Scanner;
public class ReverseaStringWithoutUsingTemporaryVariable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(isReverse(s));
		sc.close();
	}
	public static String isReverse(String s) {
		char[] ch = s.toCharArray();
		int left = 0;
		int right = s.length()-1;
		while(left < right) {
			ch[left] = (char)(ch[left] ^ ch[right]);
			ch[right] = (char)(ch[left] ^ ch[right]);
			ch[left] = (char)(ch[left] ^ ch[right]);
			left++;
			right--;
		}
		return ch.toString();
	}
	           

}
