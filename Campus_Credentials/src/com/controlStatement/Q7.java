package com.controlStatement;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a character:");
        char ch = scanner.next().charAt(0);
        
        int ascii = (int) ch;
        
        if ((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122)) {
            System.out.println(ch + " is a letter.");
            if (ascii >= 65 && ascii <= 90) {
                System.out.println(ch + " is an uppercase letter.");
            } else {
                System.out.println(ch + " is a lowercase letter.");
            }
        } else if (ascii >= 48 && ascii <= 57) {
            System.out.println(ch + " is a digit.");
        } else {
            System.out.println(ch + " is a special character.");
        }
        
        scanner.close();
    }
}
