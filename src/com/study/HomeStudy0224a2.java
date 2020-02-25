package com.study;

public class HomeStudy0224a2 {

	public static void main(String[] args) {	
		
		
		int i,j;
		for(i=0;i<5;i++) {//01  12  23  34   45
			for(j=0;j<i+1;j++) {//
				System.out.print("*");
			}
			System.out.println("");
			
		}
		System.out.println("-----------------------");
		for(i=0;i<5;i++) {
			for(j=0;j<5-i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	
	}	
    
	
}
