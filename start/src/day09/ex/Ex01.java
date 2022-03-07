package day09.ex;
/*
	
	문제1 ]
	문자열로 계산식을 입력(정수만..)하면
	식에 맞는 계산을 해서 출력해주는 프로그램을 작성하세요
	
	단, 계산은 +,-,*,/,% 만 처리하기로 하고 
	각 연산은 함수로 분리해서 처리하세요
	
	입력, 출력, 계산을 모두 분리해서 함수로 만들어서 하세요.
*/

import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {
	public Ex01(){
		Scanner sc = new Scanner(System.in);
		String[] str = setString(sc);
		double result = calc(str);
		toPrint(str);
		
	}
		
		
	public static void main(String[] args) {
	new Ex01();}
	
	
	//점수 입력
	public String[] setString(Scanner s) {
	Scanner sc = new Scanner(System.in);
	System.out.print("계산할 수를 입력하시오");
	String input = sc.nextLine();
	String[] str= new String[input.length()];
	for(int i = 0; i<input.length();i++) {
		char ch = input.charAt(i);
		if(ch<'0'||ch>'9') {
			str[0] = input.substring(0,i);
			str[1] = input.substring(i,i+1);
			str[2] = input.substring(i+1);
		}
		
	}
	
	return str;
	}
	
		
	//연산
	public double calc(String[] ar) {
		double result = 0.0;
		String sik = ar[1];
		int word1 = Integer.parseInt(ar[0]);
		int word2 = Integer.parseInt(ar[2]);
		switch(sik) {
		case "*":
			result = word1*word2;
			break;
		case "/":
			result = word1/(double)word2;
			break;
		case "+":
			result = word1+word2;
			break;
		case "-":
			result = word1-word2;
			break;
		
		}
		return result;
	}
	
	//출력
	
	 public void toPrint(String str[]) {
		 System.out.print("입력한 수 : ");
		 for(int i = 0; i<str.length;i++) {
			 System.out.print(str[i]);
		 }
		 System.out.println();
		 System.out.printf("결과 : %s\n",calc(str));
		 
	 }
		
	
		
	
	
	
	
	
	
	
	
}
