package exceptionHandling;

import java.util.Scanner;

public class ThrowExample {
	public static void main(String[] args) {
		isVoteeeeeEligible();
	}
	private static void isVoteeeeeEligible(){
		isVoteEligible();
	}
	private static void isVoteEligible() {
		int age;
		System.out.println("please enter your age");
		age =new Scanner(System.in).nextInt();

		if(age>18){
			try {
				throw new Exception("you are  adult");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else{
			try {
				throw new Exception("you are not adult");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
