package dynamicPractice;

import java.util.Scanner;

public class MainRunnerClass {

	public static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("******************** Welcome to Osm IT Center ********************");
		System.out.println("\n Here is the List of Operation you can do : \n");
		System.out.println("1) Want to Count the digits in the Number");
		System.out.println("2) Want Factorial");
		System.out.println("3) Want Factors of Number");
		System.out.println("4) Want Fibonacci Series");
		System.out.println("5) Want Multiplication Table");
		System.out.println("6) Want to check Whether the number is Palindrome or Not");
		System.out.println("7) Want Power of Number");
		System.out.println("8) Want to check Whether the number is Prime Number or Not");
		System.out.println("9) Want Reverse Of a Number");
		System.out.println("10) Want to check Whether the number is Strong Number or Not");
		System.out.println("11) Want Sum of Digits");
		System.out.println("12) Want Sum Of Fibonacci Series");
		System.out.println("13) Want Sum of Natural Numbers");
		System.out.println("14) Want Sum of Only Odd Natural Numbers");
		System.out.println("15) Want Sum of Square of Natural Numbers");
		
		System.out.println("\n PLease Select Which Operation You Want To Do : ");
		int i=sc.nextInt();
		
		if(i==1){
			CountNumberOfDigits.countNumberOfDigits();
		}else if(i==2){
			FactorialProgram.factorial();
		}else if(i==3){
			FactorsOfNumber.factorsOfNumber();
		}else if(i==4){
			FibonacciSeries.fibonacci();
		}else if(i==5){
			MultiplicationTable.tables();
		}else if(i==6){
			PalindromeNumber.palindro();
		}else if(i==7){
			PowerOfNumber.powerOfNumber();
		}else if(i==8){
			PrimeNumber.primeNumbers();
		}else if(i==9){
			ReverseNumber.reverseNo();
		}else if(i==10){
			StrongNumbers.strongNumber();
		}else if(i==11){
			SumOfDigits.sumOfDigit();
		}else if(i==12){
			SumOfFibo.sumOfFibonacci();
		}else if(i==13){
			SumOfNaturalNo.sumOfNaturalNumbers();
		}else if(i==14){
			SumOfOddNaturalNumbers.sumOfOddNaturalNumbers();
		}else if(i==15){
			SumOfSquareOfNaturalNo.sumOfSquareOfNaturalNumbers();
		}
	}
}
