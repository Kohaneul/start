package day14.ex.ex01;

public class Circle {
	private int rad;
	private double arround,area;
	public Circle() {
	}
	public Circle(int rad) {
		this.rad = rad;
		setArround();
		setArea();
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
		this.arround = Math.PI*2*rad;
	}
	public double getArea() {
		return area;
	}

	public void setArea() {
		this.area =Math.PI*rad*rad;
	}
	public void setArea(double area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "Circle [가로 : " + rad + ", 둘레 : " + arround + ", 넓이 : " + area + "]";
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
		int rad2 = cir.getRad();
		
		String str = (this.getRad()==rad2)?("같은 "):("다른 ");
		System.out.println("해당 원은 "+str+"원 입니다.");		
		bool = this.getRad()==rad2;
		
		return bool;
	}
	
	

}
