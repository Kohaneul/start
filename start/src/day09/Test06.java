package day09;

/*
 	두 수를 입력하면 더해서 반환해주는 기능의 함수를 만들어서 실행하세요.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Test06 {
	Test06(){
	Scanner sc = new Scanner(System.in);
	System.out.print("더할 수를 입력하시오");
	int no1 = set(sc);
	int no2 = set(sc);
	int result = add(no1,no2);
	toPrint(no1,no2,result);
	}
	
		
	public static void main(String[] args) {
	new Test06();}
	
	public int set(Scanner s) {
		Scanner sc = new Scanner(System.in);
		
		int no = sc.nextInt();
		return no;
	}
	
	public int add(int no1, int no2) {
		int result = 0;
		result = no1+no2;
		return result;
	}
	public void toPrint(int no, int no2, int result) {
		result = add(no,no2);
		System.out.println("입력한 수: "+no+" + "+no2);
		System.out.println("결과 : "+result);
	}
	
}

	




