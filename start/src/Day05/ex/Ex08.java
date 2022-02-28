package Day05.ex;
/*
문제 8 ]
	숫자형식의 다섯자리 정수형태 문자열을 입력받아서
	각자리 수의 합을 구하는 프로그램을 작성하세요.
	
	문자열로 입력받아서 문자로 변환후 처리하세요.
*/

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("다섯자리 정수형태의 숫자를 입력하시오");
	String input = sc.nextLine();
	int temp = Integer.parseInt(input);
	int charnum = 48;
	int result = 0;
	for(int i = 0; i<input.length();i++) {
		int ch = (int)input.charAt(i)-charnum;
		result+=ch;
			}System.out.println(result);
	

	}

}
