package Day05.ex;
/*
 	문제 13]
 		랜덤한 두 수를 입력한 후 
 		두 수의 최대 공약수를 구하는 프로그램을 작성하시오
 	
 		최대 공약수 : 
 			
 */

import java.util.*;

public class Ex13 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	// 1번 입력메세지
	System.out.println("첫번째 숫자 : ");
	// 1번 데이터 기억
	int no1 = sc.nextInt();
	// 2번 입력메세지
	System.out.println("두번째 숫자 : ");
	// 2번 데이터 기억
	int no2 = sc.nextInt();
	
	
	// 두 수 중 작은 수 찾기
	int min = (no1<no2)?no1:no2;
	
	// 공약수 찾기
	// 결과 출력하기
	int result = 1;//최소공약수, 최대공약수
	for(int i = min; i>1;i--) {
		if(no1%i==0 && no2%i==0) {
			result =  i;
			
			//원하는 숫자를 찾았으므로, 더이상 반복작업을 할 이유가 없다.
			break;
			//따라서 즉시 반복문을 종료시켜준다.
			
			
			
			
		}
	}
	
	
	System.out.println("입력받은 두 수 : "+no1+" | "+no2+"의\n 최대 공약수는 : "+
	result+" 입니다.");
	
	int max = (no2>no1)?no2:no1;
	for(int i = 1;i<max;i++) {
		if(no1%i==0 && no2%i==0) {
			result = i;
		}
	}
	
	}
}



