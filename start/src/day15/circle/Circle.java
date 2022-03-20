package day15.circle;



public class Circle{
	private int rad;
	private double arround, area;
	
	
	Circle(){}
	Circle(int rad){
		this.rad = rad;
		setArround();
		setArea();
	}
	public void setArround() {
		this.arround = rad*2*3.14;
	}
	
	public void setArea() {
		this.area = rad*rad*3.14;
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






	@Override
	public String toString() {
		return "반지름 : " + rad + ", 둘레 : " + arround + ",넓이 : " + area;
	}
	public void setArea(double area) {
		this.area = area;
	}


	
}