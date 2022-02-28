package Day05;
/*
 	정수를 입력받아서 
 	그 숫자가 짝수인지 홀수인지 판별해서 출력하세요.
 	단, 0인경우는 0으로 출력
 	
 	if ~ else 구문으로 처리하세요.
 */

import java.util.*;


public class Test03 {

	public static void main(String[] args) {
		// 입력받을 준비하고
		Scanner sc = new Scanner(System.in);
		// 입력메세지 출력
		System.out.print("정수 입력 : ");
		// 입력받아서 변수에 기억시킴
		int no = sc.nextInt();
		String result = "정수";
		
		//no가 0인경우,
		if(no==0) {
			
			result = "0";
		}
		//no가 0이 아닌 경우
		else {
			if(no%2==0) {
				result = "짝수";
			}
			else {
				result = "홀수";
				
			}
		}
		
		//결과 출력
		System.out.println("입력한 정수 :  "+no+"는 "+ result+" 입니다.");
		
		
	//블럭({}) 안에서 형성된 변수는 블럭이 빠져나가면 사라지게 된다
	
	}
	
		

	}



