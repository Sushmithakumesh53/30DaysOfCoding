package com.example.myapp;
import java.util.*;
public class BestTimeToBuyAndSellStock {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] prices = new int[n];
		for(int i = 0; i < n; i++) {
			prices[i] = sc.nextInt();
		}
		System.out.println(maxProfit(prices));
		sc.close();  
	}
	public static int maxProfit(int[] prices) {
		int minPrice = Integer.MAX_VALUE, maxProfit = 0;
		for(int p: prices) {
			minPrice = Math.min(minPrice, p);
			maxProfit = Math.max(maxProfit,  p - minPrice);
		}
		return maxProfit;
	}
	
}
