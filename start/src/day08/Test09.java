package day08;
/*
 
	+ , - , * , / 연산을 하는
	연산식을 입력하면
	결과를 보여주는 계산기 프로그램을 작성하세요;
 	
 	단, 연산식을 문자열 배열에 담아서 처리하세요
 	
 	예 ]
 		2*3
 		STring[] sik = new String[3];
 		sik[0] = 2;
 		sik[1] = *;
 		sik[2] = 3;
 	
 		따라서 연산기호가 오는 위치이전까지 문자열을 잘라서 첫번쨰에 기억시킴
 		연산기호를 두번째 위치에 기억시킴
 		나머지를 마지막 위치에 기억시켜서 처리한다.
 		
 		연산식 ==> 숫자 + "특수문자 " + 숫자
 		  ===> 숫자가 아닌 특수문자의 위치를 찾으면 된다.
 		
 */

import java.util.Arrays;
import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
	System.out.print("계산식 입력 : ");
	Scanner sc = new Scanner(System.in);
	String input = sc.nextLine();
	String[] ar = new String[input.length()];
	
	
	int index = 0;
	for(int i = 0; i<input.length();i++) {
		char ch = input.charAt(i);
		if(ch<'0'&&ch<'9') {
			index = i;
			
		}
	
		ar[i] = input.substring(i,(index+i));
		ar[0] = input.substring(0,index);
	
	}
	System.out.println(Arrays.toString(ar));	
	
	int word1 = Integer.parseInt(ar[0]);
	int word2 = Integer.parseInt(ar[2]);
	
	String result= "";
	switch(ar[index]) {
	case "*":
		result = "곱하기 ==> "+(word1*word2);
		break;
	case "+":
		result = "더하기 ==> "+(word1+word2);
		break;
	case "-":
		result = "빼기 ==> "+ (word1-word2);
		break;
	case "/":
		result =  "나누기 ==> "+(word1/word2);
		break;
	default : 
		result = "오류발생!";
	}
	System.out.print("\t"+result);
	
	}
	
	}	

	
	




