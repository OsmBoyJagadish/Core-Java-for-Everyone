package com.LoopingStatement;

public class Q3 {
	public static void main(String[] args) {
		
		for(int i=1;i<=5555;i++){
			int count=0;
			for(int j=1;j<i;j++){
				if(i%j==0){
					count++;
				}
			}
			if(count==1){
				System.out.print(i + "");
			}
		}
	}
}
