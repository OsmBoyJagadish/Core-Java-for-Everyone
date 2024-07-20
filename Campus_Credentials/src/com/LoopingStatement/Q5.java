package com.LoopingStatement;

public class Q5 {
	public static void main(String[] args) {
		int i, r;

		for (i = 1; i <= 9999; i++) {

			int temp = i;
			int sum=0;
			
			while (temp != 0) {
				r = temp % 10;
				sum = r + sum * 10;
				temp = temp / 10;
			}
		    
		    if (i == sum) {
				System.out.print(i+" ");
			}
		}
	}
}
