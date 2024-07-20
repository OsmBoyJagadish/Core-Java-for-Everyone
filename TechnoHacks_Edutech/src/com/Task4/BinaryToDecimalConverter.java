package com.Task4;
import java.util.Scanner;

public class BinaryToDecimalConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binary = scanner.nextLine();
        
        int decimal = binaryToDecimal(binary);
        System.out.println("Decimal equivalent: " + decimal);
        
        scanner.close();
    }
    
    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int base = 1;
        int length = binary.length();
        
        for (int i = length - 1; i >= 0; i--) {
            char digit = binary.charAt(i);
            if (digit == '1') {
                decimal += base;
            }
            base *= 2;
        }
        
        return decimal;
    }
}
