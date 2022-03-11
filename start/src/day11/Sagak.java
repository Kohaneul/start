package day11;

public class Sagak extends Figure{
	private int width,height;
	private double area;
	
	public Sagak() {}
	
	public Sagak(int width, int height) {
		this.width = width;
		this.height = height;
	
	}
	
	
	@Override //상속중인 클래스를 컴파일에게 알림.
	public void getArea() {
		area  = width*height;
		
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
	
	
}
