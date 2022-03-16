package day12.Figure2;
/*
	 이 클래스는 Figure이라는 추상클래스를 상속받아서 만든 클래스이다
	 따라서 상위클래스가 가지고 있는 추상함수를 100% 모두 구현해야한다.
	 
 */



public class Nemo implements Figure{
	private int width,height,area;
	
	public Nemo(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
		
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
	
	public void setArea() {
		area = width*height;
	};
	public void toPrint() {
		System.out.printf("이 사각형은 가로가 %3d이고 세로가 %3d이고 면적이 %6d 입니다.\n",width,height,area);
	}
	
	
	
	
	
	
}
