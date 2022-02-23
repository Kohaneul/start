package day02;

import java.util.Scanner;

public class Ex01 {
	/*
	 	참고] 키보드로 입력된 문자를 읽어오는 방법
	 	Scanner sc = new Scanner(System.in);
	 	
	 	
	 	String str = sc.nextLine();
	 	
	 	
	 	
	 */
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		//메세지 출력
		System.out.print("좋아하는 가수는? : ");
		
		
		String str = sc.nextLine();
		System.out.println("당신이 입력한 가수는 ["+str+"] 입니다.");
		
		sc.close();
		

	}

}
