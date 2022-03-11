package day11.moyang;

public class Circle01 extends Moyang{
	private int rad;
	private double arround,area;
	final static double PI=3.14;
	
	Circle01(){
		
	}
	Circle01(int rad){
		this.rad =rad;
		setArea();
		setArround();
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
		arround = rad*3.14*2;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
	public void setArea() {
		area = rad*rad*PI;
	}
	
	
	public void toPrint(){
		System.out.printf("[원] 반지름 : %s 둘레 : %s 넓이 : %s\n", rad, arround,area);
	}
}
