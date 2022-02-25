package day04.ex;
/*
  	문제 2 ] 
  		문자를 임의로 랜덤하게 입력한 후 
  		그 문자가 대문자이면 소문자로
  		그 문자가 소문자이면 대문자로 변환하고
  		만약 특수문자이면 그 문자 그대로 출력하는 프로그램을 작성하시오
  		(삼항연산자) 
  		
  		참고 : ASCII 코드는 특수문자(0~9) - 영문대문자(A~Z) - 특수문자 - 영문소문자(a~z) - 특수문자
 				
 */

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
	//소문자 97~122   
	//대문자 : 65~90
	
	//할일
		
	//입력도구 준비
		System.out.print("문자입력 : ");
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
	// 메세지 출력
		
	// 입력받아 문자열 저장
		
	//문자열에서 문자 추출
		char ch = str.charAt(0);
		System.out.println("입력받은 문자 : " + ch);
	//판별하고
		char result = (ch<'A')?(ch):((ch>='A'&&ch<='Z')?(ch += 'a'-'A'):((ch>='a'&&ch<='z')?(ch -= 'a'-'A'):ch)); 
	//결과 출력
		System.out.println("결과는 : "+result);	
	
	
		
	}

}
