package day15.circle;

public class Circle {
	private int rad;
	private double arround,area;
	
	public Circle() {
	}
	public Circle(int rad) {
		this.rad =rad;
		setArea();
		setArround();
	}
	public void setArea() {
		this.area = rad*rad*3.14;
	}
	public void setArround() {
		this.arround = 2*rad*3.14;
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
		return "반지름이 "+rad+"이고 ,둘레가 "+arround+" 면적이 "+area;
	}
	
	

}
