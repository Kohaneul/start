package day09.ex;
/*
문제 3 ]
	사각형을 넓이를 계산하는 프로그램을 작성하세요.
	
	길이를 랜덤하게 만들어주는 함수
	넓이를 계산해주는 함수
	사각형의 내용을 출력해주는 함수
	
*/


public class Ex03 {
	int width,height,area;
	public Ex03(){
		setting();
		toPrint();
		
	}
	public void setting() {
		width = (int)(Math.random()*21+10);
		height = (int)(Math.random()*21+10);
	}
	
	public int getArea(int num1,int num2) 
	{
		return num1*num2;
	}
	public void toPrint() {
		area = getArea(width,height);
		System.out.printf("가로 : %d 세로 %d의 사각형 ==> 넓이 : %d\n",width,height,area);
	}
	
	
	
	
	
	
	public static void main(String[] args) {
	new Ex03();}
	
	
	
	
	

}
