package Day05.ex;
/*
 	문제3]
 		문자열을 입력받아서
 		문자를 한글자씩 추출해서 출력.
 		
 	참고] 
 		문자열의 길이를 알아내는 방법은
 		int 변수  = 문자열.length();
 
 */

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("입력받을 문자 작성 : ");
	String str = sc.nextLine();
	int length = str.length();
	String temp = "";
	for(int i = 0; i<length;i++) {
		temp += str.charAt(i)+"\n";
	}
	System.out.println(temp);

	}

}
