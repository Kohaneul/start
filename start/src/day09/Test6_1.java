package day09;

import java.util.Scanner;

/*
 	두 수를 입력하면 더해서 반환해주는 기능의 함수를 만들어서 실행하세요.
 */


public class Test6_1 {
	int num1, num2;
	
	Test6_1(){
		toPrint();
		
		
	}
	
	public int scan(Scanner sc) {
		return sc.nextInt();
	}
	
	public int getAdd(int num1,int num2) {
		return num1+num2;
	}
	public void toPrint() {
		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 두 수 입력");
		int num1 = scan(sc);
		int num2 = scan(sc);
		int result = getAdd(num1,num2);
		System.out.printf("입력받은 수 : %d, %d\n \t %d + %d = %d", num1,num2,num1,num2,result);
		
	}
	
	
	
	public static void main(String[] args) {
		new Test6_1();
	}
	
	
	
	
}

	




