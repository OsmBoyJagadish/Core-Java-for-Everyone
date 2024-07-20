package com.LoopingStatement;

public class Q4 {
	public static void main(String[] args) {
		
		int r, rem;
		
		for(int i=1;i<=10000;i++){
			double sum = 0;
            int count = 0;
			int temp=i;
			
			while(temp>0){
				temp=temp/10;
				count++;
			}
			temp = i;
			
			while (temp > 0) {
				rem = temp % 10;
				sum = sum + (Math.pow(rem, count));
				temp = temp / 10;
			}
			if (i == sum) {
				System.out.print(i+" ");
			}
		}
	}
}
