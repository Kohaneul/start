package day11.figure;

public class Nemo extends Figure {
	private int width,height,area;
	
	Nemo(int width,int height){
		this.width = width;
		this.height = height;
		setArea();
		toPrint();
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
	}





	public void toPrint(){
	
		System.out.printf("[네모] 가로 : %s 세로 : %s, 넓이 : %s\n", width, height,area);
	}
}
