package com.controlStatement;
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
    	
        int basicSalary = 20000;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter Daily Allowance:");
        int da = scanner.nextInt();
        
        System.out.println("Enter Traveling Allowance:");
        int ta = scanner.nextInt();
        
        System.out.println("Enter House Rent:");
        int hr = scanner.nextInt();
        
        int gs = basicSalary + da + ta + hr;
        
        System.out.println("Gross Salary: " + gs);
        
        scanner.close();
    }
}
