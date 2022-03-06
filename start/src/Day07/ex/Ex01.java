package Day07.ex;

import java.util.Arrays;
import java.util.Scanner;

/*
Ex01 ]
	'A' - 'J' 까지의 문자를 랜덤하게 100 만들고
	각문자의 출현횟수를 기억할 배열을 만들어서
	회수만큼 '*' 로 출력해주는 프로그램을 작성하세요.
	
	예 ]
		
		A [5] : *****
		B [20] : *******************
		
		..
		J [7] : *******
		
*/

public class Ex01 {

	public static void main(String[] args) {
	int[] array = new int[10];

	for(int i = 0; i<100; i++) {
		char ch = (char)(Math.random()*('J'-'A'+1)+'A');
		int index = (int)(ch-'A');
		array[index] += 1;
	}
	String str = "";
	
	for(int i = 0; i<array.length;i++) {
		char ch = (char)('A'+i);
		int length = array[i];
		System.out.print(ch+" ["+array[i]+"] : ");
		for(int j = 0; j<length; j++) 
		{
	    str+="*";
		}
		System.out.print(str);
		
		System.out.println();
	
	}
	
	
	
		
	}
}





