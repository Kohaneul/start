package day03.ex;//day03 안에 있는 ex폴더 의미

import java.util.Scanner;
/*입력도구 준비	
	Scanner sc = new Scanner(System.in);
	System 안에 in이라는 변수가 있는데 시스템에 입력받은것을 in이라는 변수에 기억함
	
	입력메세지 준비
	
	
	문자열로 입력받아서 정수로 변환해서 처리하는 방법
	
	System.out.print("가로 : ");
	String garo = sc.nextLine();//문자열로 입력받는 방법
	정수형태의 문자열을 정수로 변환
	Integer.parseInt(문자열);
	
	
	
	정수로 입력받는 방법
	int 변수이름 = sc.nextInt();
	
	
	int width = sc.nextInt();
	//출력
	System.out.println("입력된 정수 가로 : "+width);//산술연산자 작동
	
	
	//메세지 출력
	System.out.print("세로 : ");



/*
 	문제1 ] 
 		두개의 숫자를 입력 받은 후(가로, 세로) 
 		그 숫자를 이용해서 사각형의 넓이와 삼각형의 넓이를 구해서 
 			사각형의 넓이 : 가로 X 세로
 			삼각형의 넓이 : 가로 X 세로 X(1/2)
 		결과를 출력하세요
 			
 		출력 형식 ]
 			가로 : XXXX
 			세로 : XXXX
 			사각형 넓이 : XXXX
 			삼각형 넓이 : XXXX.X;
 			
 	참고 ] 
 		자바에서 *기호의 의미는, 
 			연산자로서 곱하기의 의미
 			모든것을 의미.
 		
 */
import java.util.*;

public class Ex01 {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.print("가로 길이 입력 : ");
	int width = sc.nextInt();
	System.out.println("가로 : "+width);
	
	System.out.print("세로 길이 입력 : ");
	int height = sc.nextInt();
	System.out.println("세로 : "+height);
	
	int sagak = width*height;
	System.out.println("사각형의 넓이 : " + sagak);
	double samgak = width*height/2.;
	System.out.println("삼각형의 넓이 : " + samgak);
	
	
	}

}
