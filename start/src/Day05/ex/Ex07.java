package Day05.ex;
/*
문제 7 ]
	5자리의 숫자를 입력한 후
	각자리의 수의 합을 구하는 프로그램을 작성하세요.
	
	힌트 ]
	 ***** % 10 ==> 마지막 자리
	 ***** /10 ==> **** 잘라내게 됨

			*/

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
	//입력도구 준비
	Scanner sc = new Scanner(System.in);
	//메세지 출력
	System.out.print("5자리 정수 입력 : ");
	//입력받고 기억하고
	int no = sc.nextInt();
	//반복해서 합 구하고
	int sum=0;
	int temp = no;
	for(int i = 0; i<5;i++) {
		sum += temp%10;

		//1234
		temp = temp/10;
	}
	
		System.out.println("입력한 수 "+no+"의 각 자리수의 합은?\n "+sum);
	
	
	//결과 출력	
	
	}

}
