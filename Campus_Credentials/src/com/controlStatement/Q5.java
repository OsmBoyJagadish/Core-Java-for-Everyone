package com.controlStatement;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the three angles of the triangle:");
        int angle1 = scanner.nextInt();
        int angle2 = scanner.nextInt();
        int angle3 = scanner.nextInt();
        
        if (angle1 + angle2 + angle3 == 180) {
            System.out.println("The given angles form a triangle.");
        } else {
            System.out.println("The given angles do not form a triangle.");
        }
        scanner.close();
    }
}
