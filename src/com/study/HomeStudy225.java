package com.study;

import java.util.Random;

public class HomeStudy225 {

	public static void main(String[] args) {
		Random rand=new Random();
		int cnt=0;
		int [] arr=new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=rand.nextInt(9);
			int a;
			System.out.println(arr[i]);
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==3) {
				cnt++;
			}
		}
		System.out.println("73"+cnt);
	}

}
