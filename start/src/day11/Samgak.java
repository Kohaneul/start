package day11;

public class Samgak extends Figure{
	private int width, height;
	private double area;
	
	public Samgak() {}
	public Samgak(int width, int height) {
		this.width = width;
		this.height = height;
	
	}
	@Override
	public void getArea() {
		area = width*height/2;
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
