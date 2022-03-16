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
	int rad;
	double arround, area;
	Circle c;
	Ex02(){
		setting();
		toPrint();
	}
	
	public int setRnd() {
		return (int)(Math.random()*11+1);
	}
	public void setting() {
		c= new Circle(setRnd());
		
	}
	public void toPrint()
	{
		rad = c.getRad();
		arround = c.getArround();
		area = c.getArea();
		
		System.out.printf("반지름 길이 : %d \n둘레 : %6.2f , 넓이 : %6.2f",rad,arround,area);
	}
	public static void main(String[] args) {
		new Ex02();
	}
	
	
	}


class Circle {
	private int rad;
	private double area,arround;
	
	Circle(int rad){
		this.rad =rad;
		setArea();
		setArround();
		
	}
	Circle(){}
	
	
	public int getRad() {
		return rad;
	}
	public void setRad(int rad) {
		this.rad = rad;
	}
	
	
	
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
	public void setArea() {
		area = Math.PI*rad*rad;
	}
	public double getArround() {
		return arround;
	}
	public void setArround() {
		arround = 2*rad*Math.PI;
	}
	
}


