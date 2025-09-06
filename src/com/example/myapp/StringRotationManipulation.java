package com.example.myapp;
import java.util.Scanner;

public class StringRotationManipulation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input string
        String s = sc.nextLine();
        
        // Number of rotations
        int n = sc.nextInt();
        
        // Direction (left/right)
        String rotation = sc.next();
        
        // Perform rotation
        for (int i = 0; i < n; i++) {
            if (rotation.equals("left")) {
                s = isAnti(s);
            } else {
                s = isClock(s);
            }
        }
        
        System.out.println("Result after rotation: " + s);
        sc.close();
    }

    // Left rotation (anti-clockwise)
    public static String isAnti(String s) {
        return s.substring(1) + s.charAt(0);
    }

    // Right rotation (clockwise)
    public static String isClock(String s) {
        return s.charAt(s.length() - 1) + s.substring(0, s.length() - 1);
    }
}
