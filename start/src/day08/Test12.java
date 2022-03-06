package day08;

import java.text.spi.NumberFormatProvider;
import java.util.Arrays;

/*
 	문자와 출현 수를 기억할 배열들 10개를 관리하는 배열을 만들고
 	'A'에서부터 'J'를 랜덤하게 100번 반복해서 만들고
 	배열에 카운트를 기억시켜서 결과를 출력하세요
	
 */




public class Test12 {

	public static void main(String[] args) {
	int[][] num = new int['J'-'A'+1][2];
	
	
	for(int i = 0; i<100; i++) {
		char ch = (char)(Math.random()*('J'-'A'+1)+'A');
		int index = ch-'A';
		num[index][1]+=1;
		
	}
	int sum = 0;
	for(int i = 0; i<num.length;i++) {
		num[i][0] = (char)('A'+i);
		
			System.out.println((char)num[i][0]+": ["+num[i][1]+"] 개");
			sum+=num[i][1];
			
		}
	
	
	
	
	}	
	}


		
	
				
		
		
	
	
	
		
	

	



