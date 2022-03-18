package day14.ex.ex01;
/*
문제 1번 ] 
	원의 정보를 기억할 클래스를 제작하세요. 
	가지는 정보는 rad, arround,area 를 가지고
	기능은 변수에 접근할 수 있는 함수들..
	그리고 반지름이 같으면 같은 원으로 처리해주는 기능의 
	equals() 함수로 오버라이드하고 , 
	이 클래스 타입의 변수를 출력하면 해당 원의 정보를 출력해주는 함수도 
	오버라이드 해주세요 


*/
public class Circle {
	private int rad;
	private double arround,area;
	
	Circle(){}
	Circle(int rad){
		this.rad = rad;
		setArea();
		setArround();
	}
	public void setArea() {
		this.area = rad*rad*Math.PI;
	}
	public void setArround() {
		this.arround = 2*rad*Math.PI;
	}
	
	
	public int getRad() {
		return rad;
	}
	public void setRad(int rad) {
		this.rad = rad;
	}
	public double getArround() {
		return arround;
	}
	public void setArround(double arround) {
		this.arround = arround;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
	@Override
	public String toString() {
		return "원 [반지름길이 : " + rad + ", 둘레 :" + arround + ", 넓이 : " + area + "]";
	}
	@Override
	public boolean equals(Object o) {
		boolean bool = false;
		Circle cir = null;
		try {
			cir = (Circle)o;
		}
		catch(Exception e) {
			return false;
		}
		String result = (this.getRad()==cir.getRad())?("같은"):("다른");
		System.out.println("두 원은 "+result+" 원 입니다.");
		bool = (this.getRad()==cir.getRad());
		
		return bool;
	}
	
	

}
