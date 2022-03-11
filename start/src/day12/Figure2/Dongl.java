package day12.Figure2;

public class Dongl extends Figure {
	private int rad;
	private double area, arround;
	
	public Dongl(int rad) {
		this.rad = rad;
	}
	
	
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
		area = rad*rad*Math.PI;
	}
	
	public void setArround() {
		arround = rad*Math.PI*2;
	}
	
	public double getArround() {
		return arround;
	}
	public void setArround(double arround) {
		this.arround = arround;
	}
	
	public void toPrint() {
		System.out.printf("이 원은 반지름이 %3d이고 둘레가 %.2f이고 면적이 %.2f 입니다.\n",rad,arround,area);
	}
	
	
	
}
