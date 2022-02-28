package day04.ex;

public class Ex01_01 {

	public static void main(String[] args) {
	/*
		문제1 ] 
			1~25 의 숫자 3개를 랜덤하게 발생시켜서
			그 수들 중 가장 큰 수, 중간수, 작은수를 구분해서 출력하는 프로그램을 작성하시오.
			단, 3항 연산자를 상용해서 처리하세요
	*/
		int a = (int)((Math.random()*26)+1);
		int b = (int)((Math.random()*26)+1);
		int c = (int)((Math.random()*26)+1);
		
		int result1 = 0; //가장 큰 값
		int result2 = 0;//가장 작은 값
		int result3 = 0;//중간값
		
		result1 = (a>b&&a>c)? a: ((b>a&&b>c)?b:(c>a&&c>b)?c:a);//가장 큰 값
		result2 = (a<b&&a<c)? a: ((b<a&&b<c)?b:(c<a&&c<b)?c:a);
		result3 = (result1>a&&a>result2)? a: (result1>b&&b>result2)?b:(result1>c&&c>result2)?c:a;
				//a가 가장 클때 => b, c가 중간값.
				//b가 가장 클때 => a, c가 중간값.
		System.out.println(a+" "+b+" "+c+" ");
		System.out.println("가장 큰 값 : "+result1);
		System.out.println("중간값 : "+result3);
		System.out.println("가장 작은 값 : "+result2);
		
	}

}
