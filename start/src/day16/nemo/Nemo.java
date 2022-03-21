package day16.nemo;

public class Nemo implements Comparable{
	private int width, height, area;
	public Nemo() {
	
	}
	
	public Nemo(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
		}
	public void setArea() {
		this.area = width*height;
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

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return String.format("이 사각형은 가로가 %3d, 세로가 %3d 넓이가 %3d 입니다.",width,height,area);
	}
	

	
	public int HashCode() {
		return 1;
	}

	@Override
	public int compareTo(Object o) {
		int result = 0;
		Nemo nemo = (Nemo)o;
		result = (this.area<nemo.getArea())?-1:1;
		return -result;
	}
	
}
