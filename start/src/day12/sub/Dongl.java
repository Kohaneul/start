package day12.sub;

public class Dongl implements Figure{
	private int rad;
	private double area, arround;
	public Dongl(int rad) {
		this.rad = rad;
		setArea();
		setArround();
		
	}
	public void setArea() {
	area = rad*rad*Math.PI;	
		
	}
	public void setArround() {
		arround = 2*rad*Math.PI;
	}
	
	
	public void toPrint() {
		System.out.printf("이 원은 반지름이 %3d이고 둘레가 %.2f이고 면적이 %.2f 입니다.\n",rad,arround,area);
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
	public double getArround() {
		return arround;
	}
	public void setArround(double arround) {
		this.arround = arround;
	}

	
	
	
	
}
