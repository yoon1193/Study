package com.study;

public class homeStudy0304a3 {//�޼ҵ� �Է°� ����
	public static String numbering(int inti, int limit) {
		
		int i=inti;
		String output="";
		for(i=inti;i<limit;i++) {
			output +=i;
		}
		return output;
	}
	public static void main(String[] args) {
		String result = numbering(1,5);
		System.out.println(result);
		}
}
