package com.study;

public class HomeStudy0224 {

	public static void main(String[] args) {
		//반복문
		int i,j,k;
//		//i의 값이 10보다 작으면 true, 크다면 false가 됨 
//		while(i<10) {
//     		System.out.println("Coding"+i);
//     		i++;
//			//i=i+1
//		}
//		for(i=0; i<10; i++) {//초기화; 종료조건; 반복실행
//			System.out.println("Coding"+i);
//		}
//		
//		for(i=0; i<10; i++) {
//			System.out.println("Coding");
//			
//		}
//		for(i=0;i<10;i++) {
//			if(i==5)
//				break;
//			System.out.println("Coding"+i);				
//		}
//		for(i=0;i<10;i++) {
//			if(i==5)
//				continue;
//			System.out.println("Coding"+i);
//		}
		
		for(i=0;i<10;i++) {
			for(j=0;j<10;j++) {
				for(k=0;k<10;k++) {
				System.out.println(i+""+j+""+k);
			    }
		    }
		}
		System.out.println("hellow");
		
	}

}
