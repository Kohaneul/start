package Day05.ex;
/*
 	문제 12]
 		5자리 숫자 하나를 입력받아서
 		이 숫자가 회문수 인지 아닌지 판별하는 프로그램을 작성하세요
 		
 		참고 ] 
 			회문수란?
 			 	첫번재 자리수와 마지막 자리수
 			 	두번째 자리수와 마지막에서 두번째 자리수
 			 	...
 			 	가 동일한 수를 말한다.
 
 */

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("임의의 5자리의 수를 입력하시오");
		
	String input = sc.nextLine();
	int length = input.length();
	String result = "회문수가 아닙니다.";
	// 0 1 2 3 4 0:4 1:3
	for(int i = 0; i<length-4;i++) {
		if(input.charAt(i)==input.charAt(i+(4-i))){
			result = "회문수 입니다.";
		}
	}

	System.out.println(input+" ==> "+result);
}}