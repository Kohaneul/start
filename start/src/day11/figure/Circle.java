package day11.figure;

public class Circle extends Figure {
	final static double PI = 3.14;
	private int rad; 
	private double arround,area;
	Circle(){}
	
	Circle(int rad){
		this.rad = rad;
		setArround();
		setArea();
		toPrint();
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
	
	public void setArround() {
		arround =PI*2*rad;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
	public void setArea() {
		area = PI*rad*rad;
	}
	
	
	
	public void toPrint(){
		System.out.printf("[원] 반지름 : %s 둘레 : %.2f 넓이 : %.2f\n", rad, arround,area);
	}
}
