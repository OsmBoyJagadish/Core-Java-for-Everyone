package com.controlStatement;
import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the value of n:");
        int n = scanner.nextInt();
        
        int sum = n * (n + 1);
        
        System.out.println("The sum of the first " + n + " even numbers is: " + sum);
        
        scanner.close();
    }
}
