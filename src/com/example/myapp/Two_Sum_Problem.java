package com.example.myapp;
import java.util.Scanner;

public class Two_Sum_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        int n = sc.nextInt();
        int[] num = new int[n];

        // Input array elements
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        // Input target
        int target = sc.nextInt();

        boolean found = false;

        // Brute force search
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (num[i] + num[j] == target) {
                    System.out.println(i + ", " + j);
                    found = true;
                    break; // stop inner loop
                }
            }
            if (found) break; // stop outer loop
        }

        if (!found) {
            System.out.println("-1, -1");
        }

        sc.close();
    }
}
nvvv