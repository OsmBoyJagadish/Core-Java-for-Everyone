package com.LoopingStatement;

public class Q6 {
	public static void main(String[] args) {
		
		int no = 2;

		for (int i = 1; i <= 9; i++) {
			System.out.print(no + " ");
			no = no * i + i;
		}
	}
}
