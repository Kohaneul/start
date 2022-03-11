package day10;

public class Semo {
	private int width,height;
	private double area;
	Semo(int width, int height){
		this.width = width;
		this.height = height;
		getArea();
	}
	Semo(){
		this(1,1);
		getArea();
	}
	
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public double getArea() {
		area = width*height/2;
		return area;
	}
	
	
	
	
}
