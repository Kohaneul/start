package day04.ex2;
/*
 	문제 1 ] 
 		1 ~ 25 중 숫자 3개를 랜덤하게 발생시켜서 
 		그 수들 중 가장 큰 수만 출력하는 프로그램을 작성하시오
 		
 		단, 조건문을 사용해서 처리 
 	
 	
 */


public class Ex01 {

	public static void main(String[] args) {
	int a = (int)(Math.random()*(1+25-1)+1);
	int b = (int)(Math.random()*(1+25-1)+1);
	int c = (int)(Math.random()*(1+25-1)+1);
	System.out.println("a: "+a +", b: " +b+", c: "+c);
	int result = 0;
	if(a>b&&a>c) {
		result = a;
		
	}
	else if(b>a&&b>c) {
		result = b;
		
	}
	else if(c>a&&c>b)
	{
		result = c;
	}
	System.out.println("가장 큰 수는? "+result);
	}

}
