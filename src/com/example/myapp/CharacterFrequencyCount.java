package com.example.myapp;
import java.util.Scanner;
public class CharacterFrequencyCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] c = s.toCharArray();
		for(int i = 0; i <= c.length - 1; i++) {
			int count = 1;
			char current = c[i];
			for(int j = 0; j < i; j++) {
				if(current == c[j]) {
					count = 0;
					break;
				}
			}
			if(count == 1) {
				for(int j = i + 1; j <= c.length - 1; j++) {
				
					if(current == c[j]) {
						count++;
					}
				}
					
			}
			if(count > 0) {
				System.out.println(current+": "+count);
			}
		}
			
		sc.close();

	}

}
