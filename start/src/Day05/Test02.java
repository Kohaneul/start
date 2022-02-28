package Day05;
/*
 	정수를 입력받아서 
 	그 숫자가 짝수인지 홀수인지 판별해서 출력하세요.
 	단, 0인경우는 0으로 출력
 */

import java.util.*;


public class Test02 {

	public static void main(String[] args) {
		// 입력받을 준비하고
		Scanner sc = new Scanner(System.in);
		// 입력메세지 출력
		System.out.print("정수 입력 : ");
		// 입력받아서 변수에 기억시킴
		int no = sc.nextInt();
		// 판별
		String result = "정수"; //짝수인지 홀수인지 기억할 변수.
		
		/*
		if (no==0) {
			result = "0";
		}
		//짝수인 경우
		if(no !=0 && no%2 ==0) {
			result = "짝수";
		}
		
		//홀수인 경우
		if(no != 0 && no%2 !=0) {
			result = "홀수";
		}
		
		*/
		
		if(no==0) {
			result="0";
			
		}
		if(no!=0&&no==0) {
			result="짝수";
			
		}
		if(no==1) {
			result="홀수";
			
		}
		
		
		if(no!=0) {
			if(no%2==0) {
				result = "짝수";
			}
			if(no%2==1) {
				result = "홀수";
			}
			
		
	}
		
		
		System.out.println("입력한 정수 :  "+no+"는 "+ result+" 입니다.");
		}
		
		
		
		
		
		
		
		
		//결과 출력
		

	}


