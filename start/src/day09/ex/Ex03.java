package day09.ex;
/*
문제 3 ]
	사각형을 넓이를 계산하는 프로그램을 작성하세요.
	
	길이를 랜덤하게 만들어주는 함수
	넓이를 계산해주는 함수
	사각형의 내용을 출력해주는 함수
	
*/


public class Ex03 {
	public Ex03(){
		int no1 = setArea();
		int no2 = setArea();
		toPrint(no1,no2);
	}	
	public static void main(String[] args) {
	new Ex03();}
	
	public int setArea() {
	int num =0;
	num = (int)(Math.random()*100+1);
	return num;
	}
	
	public int calcArea(int no, int no2) {
		int result= 0;
		result = no*no2;
		return result;
	}
	
	public void toPrint(int no, int no2) {
		System.out.println("입력한 수 : "+no+" , "+no2);
		System.out.println("넓이 : "+calcArea(no,no2));
	}
	
	

}
