package day03.ex;

import java.util.Scanner;

public class Ex02 {
	
	/*
	  문제2 ]
	  	하나의 숫자를 입력받은 후 (원의 반지름)
	  	그 숫자를 이용해서 원의 넓이와 둘레를 계산하고 출력하세요
	  	
	  참고 ] 
	  	원의 넓이 : 반지름X반지름X3.14
	  	원의 둘레 : 2* 반지름X3.14
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름의 길이를 입력하시오");
		int radius = sc.nextInt();
		double circle = radius*radius*3.14;
		double circle_round = radius*3.14*2;
		System.out.println("원의 넓이 : "+ circle);
		System.out.println("원의 둘레 : "+ circle_round);
	}

}
