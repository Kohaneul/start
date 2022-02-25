package day04.ex;
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
	//int year = (int)(Math.random()*2001)+1000;
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("랜덤한 년수를 입력하시오 : ");
	int year = sc.nextInt();
	String result = (year%100==0)?((year%4==0||year%400==0)?("윤년"):("평년")):("평년");
	System.out.println("입력받은 년수 : "+year+"은 "+result);
	}

}
