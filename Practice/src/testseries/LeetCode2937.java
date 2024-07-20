package testseries;

import java.util.ArrayList;
import java.util.List;

public class LeetCode2937 {
	public static void main(String[] args) {
		System.out.println("Ok");
		String str1="osm";
		String str2="boy";
		String str3="us";
		
		int operations = 0; // Counter to track operations

        // Find the minimum length among the three strings
        int minLength = Math.min(Math.min(str1.length(), str2.length()), str3.length());
        System.out.println(minLength);
        // Count the number of character truncations for each string
        operations += str1.length() - minLength;
        operations += str2.length() - minLength;
        operations += str3.length() - minLength;

        // Truncate strings to the minimum length
        str1 = str1.substring(0, minLength);
        str2 = str2.substring(0, minLength);
        str3 = str3.substring(0, minLength);

        System.out.println("Strings after adjustment to the minimum length:");
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("String 3: " + str3);

        System.out.println("Total operations performed: " + operations);

	}
}
