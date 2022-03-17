package day06.ex;

import java.util.Scanner;

/*
 	문제 1]
 		3 ~ 100 사이의 정수를 입력받아서
 		이 정수가 소수인지 판단하는 프로그램을 작성하세요
		참고 : 
			소수
			 	1과 자신으로만 나누어지는 수
 	
 	보너스 ]
 		3 ~ 100 사이의 숫자 중에서 소수만 출력하시오
 
 */


public class Ex01 {

	public static void main(String[] args) {
	int count = 0;
	Scanner sc = new Scanner(System.in);
	System.out.print("3 ~ 100까지의 정수를 입력하시오 : ");
	int input = sc.nextInt();
	String str = "";
	for(int i = 1; i<=input; i++) {
		
		if(input%i==0) {
			count++;
			
			
			if(count<3) {
				str = input+"은 소수입니다.";
			}
		}
		else {
			str=input+"은 소수가 아닙니다.";
		}
		
	}
	System.out.println(str);
	count = 0;
	for(int i= 3; i<=100;i++) {
		for(int j = 1;j<=i;j++) {
			if(i%j==0) {
				count++;
				
		}
		
		}
	}

	
	}

}
