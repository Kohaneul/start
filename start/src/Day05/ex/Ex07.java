package Day05.ex;
/*
문제 7 ]
	5자리의 숫자를 입력한 후
	각자리의 수의 합을 구하는 프로그램을 작성하세요.
*/

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("5자리 숫자 입력 : ");
	String str = sc.nextLine();
	int num = Integer.parseInt(str);
	int a = (num/10000)%10;
	int b = (num/1000)%10;
	int c = (num/100)%10;
	int d = (num/10)%10;
	int e = num%10;
	
	int result = a+b+c+d+e;
	System.out.println(str +"==> "+a+" + "+b+" + "+c+" + "+d+" + "+e);
	System.out.println("입력받은 숫자 "+str+"의 각 자릿수의 합은? : "+result+"입니다.");
	
	
	}

}
