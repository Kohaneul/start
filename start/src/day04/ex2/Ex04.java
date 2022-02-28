package day04.ex2;
/*
 	문제 4]
 		1000 ~ 3000 사이의 숫자를 랜덤하게 발생시켜서 
 		이 숫자를 년도로 하는 해는
 		윤년인지, 평년인지를 판별해서 출력해주는 
 		프로그램을 작성하시오 
 		윤년은 4로 나누어 떨어지고
 				100으로 나누어 떨어지면 안되고
 				400으로 나누어 떨어지는 해를 윤년이라고 한다.
 */

import java.util.Scanner;

public class Ex04 {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String result = "";
	int year = sc.nextInt();
	if(year%4==0) {
		if(year%400==0 &&year % 100 !=0) {
			result="윤년";
		}
		result = "윤년";
	}
	else if(year%100 ==0) 
	{
		result = "평년";
	}
	System.out.println(year+"은"+result+"입니다.");
	}
	

}
