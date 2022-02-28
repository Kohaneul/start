package day04;
	/*
	 	정수를 입력받아서 짝수인지 홀수인지 판별하세요
	 	단, 0은 짝수로 간주한다.
	 */


import java.util.*;
public class Test04 {
	public static void main(String[] args) {
	//할일 : 입력도구 준비
	Scanner sc = new Scanner(System.in);	
	//입력받기 전에 메세지
	System.out.print("정수 입력 : ");
	//입력 받음 변수에 기억시킴
	int num = sc.nextInt();
	//기억 시킨 변수를 짝수인지, 홀수인지 판별
	String str = "";
	if(num%2==0) {
		str = "짝수";
	}
	else {
		str = "홀수";
	}
	
	
	//출력
	System.out.println("입력받은 숫자 ["+num+"]  " + str+" 입니다.");
	}
}
