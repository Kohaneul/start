package day12.sub;

public class Nemo implements Figure{
	private int width, height, area;
	
	public Nemo(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}
	
	public void setArea() {
	area = width*height;	
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





	public void toPrint() {
		// 사각형 내용 출력하는 기능
		System.out.printf("이 사각형은 가로가 %3d이고 세로가 %3d이고 면적이 %6d 입니다.\n", width, height, area);
	}

}
