package day09.ex;
/*
문제 2 ]
	반지름 하나를 랜덤하게 입력한 후
	원의 넓이
	원의 둘레
	를 계산해서 
	출력하는 프로그램을 작성하세요.
	
	반지름 랜덤하게 만들어주는 함수
	넓이 계산함수, 둘레 계산함수, 출력을  해주는 함수
	를 각각 만들어서 작성하세요.
	
	
*/


public class Ex02 {
	Ex02(){
		int num = setRadius();
		toPrint(num);
	}
	public static void main(String[] args) {
	new Ex02();}
	
	public int setRadius() {
		int num = 0;
		num= (int)(Math.random()*10+1);
		return num;
	}
	public double getArea(int num) {
		double result = 0.0;
		result = num*num*3.14;
		return result;
	}
	public double getRound(int num) {
		double result = 0.0;
		result = 2*num*3.14;
		return result;
	}
	
	public void toPrint(int num) {
		System.out.println("입력한 반지름의 길이 : "+num );
		System.out.println("입력한 반지름의 넓이 : "+getArea(num));
		System.out.println("입력한 반지름의 둘레 : "+getRound(num));
		
	}
	
	
	
	
	}


