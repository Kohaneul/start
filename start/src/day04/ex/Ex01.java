package day04.ex;
/*
 	문제 1 ] 
 		1 ~ 25 중 숫자 3개를 랜덤하게 발생시켜서 
 		그 수들 중 가장 큰 수만 출력하는 프로그램을 작성하시오
 		
 		단, 3항 연산자를 사용해서 처리 
 	
 	
 */


public class Ex01 {

	public static void main(String[] args) {
		//숫자 1번 입력
		int one = (int)(Math.random()*26);
		//숫자 2번 입력
		int two = (int)(Math.random()*26);
		//숫자 3번 입력
		int three = (int)(Math.random()*26);
		//삼항연산자

//		1) one>two
//		   one>three
//		2) 
//		   two>three

		int result = ((one>two)&&(one>three)?(one):((two>one&&two>three)?(two):three));
		System.out.println(one+", "+two+","+three+" 중 가장 큰 수는 "+result);
		
		//

	}

}
