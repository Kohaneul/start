package day04.ex;
/*
 	문제 1 ] 
 		1 ~ 25 중 숫자 3개를 랜덤하게 발생시켜서 
 		그 수들 중 가장 큰 수만 출력하는 프로그램을 작성하시오
 		
 		단, 3항 연산자를 사용해서 처리 
 	
 	
 */


public class Ex01 {

	public static void main(String[] args) {
		// 랜덤한 정수 3개 발생시킨다
		int no1 = (int)((Math.random()*26)+1);
		int no2 = (int)((Math.random()*26)+1);
		int no3 = (int)((Math.random()*26)+1);
		
		int result = (no1>no2&&no1>no3)?(no1):(no2>no1&&no2>no3)?no2:no3;
		//출력한다
		
		System.out.printf("[no1] %s , [no2] %s , [no3] %s \n결과는? %s\n",no1,no2,no3,result);
		System.out.println("입력한 세 정수 : "+no1+", "+no2+", "+no3+"\n\t가장 큰 수는 "+result+" 입니다.");
		/*
		 참고 ] 문자열을 표현할 때 문자열 안에 "기호를 출력하는 방법
		 ==> 
		 	\"
		 	이때 사용한 \를 이스케이프 문자라고 부른다.
		 	
		 	많이 사용하는 문자들
		 	
		 	\" - 문자열 내에 "를 표현한다.
		 	\n - 한줄 내림기호
		 	\r - 캐리지 리턴
		 	\t - tab을 표현
		 	\b - backspace
		 	
		 */
			
		
		
		//보너스 문제 -100 ~ 100사이의 정수를 랜덤하게 발생시키시오.
		
		
	}

}
