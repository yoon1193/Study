package com.study;

public class HomeStudy0224a {

	public static void main(String[] args) {	
		java.util.Scanner sc=new java.util.Scanner(System.in);
			
		
		//���ǹ�
//		if(true) {
//			System.out.println("result:true");
//		}
//			
//		if(true) {
//			System.out.println(1);
//			System.out.println(2);
//			System.out.println(3);
//			System.out.println(4);
//		}
//		System.out.println(5);
		
//		if(true) {
//			System.out.println(1);
//		}
//		else {
//			System.out.println(2);
//		}
		
//		if(true) {
//			System.out.println(1);
//		}
//		else if(true) {
//			System.out.println(2);
//		}
//		else if(true) {
//			System.out.println(3);
//		}
//		else {
//			System.out.println(4);
//		}
//		System.out.println("��");
//		String id=sc.nextLine();
//		double di=Double.parseDouble(id);
//		System.out.println("��");
//		id=sc.nextLine();
//		double di2=Double.parseDouble(id);
		
//		String id = args[0];//�Է°�
//		
//		if(id.equals("egoing")) {//equals=�տ� �ִ°��� �ڿ��ִ°��� �� true,f
//			System.out.println("right");
//		} else {
//			System.out.println("wrong");
//		}
		
        String id = args[0];//�Է°�
		String password = args[1];
	
		if(id.equals("egoing")) {//equals=�տ� �ִ°��� �ڿ��ִ°��� �� true,f
			if(password.equals("111111")) {
				System.out.println("right");
			}
		
			else {
				System.out.println("wrong");
			}
		}
			else {
				System.out.println("wronf");			
        }
	}
}
