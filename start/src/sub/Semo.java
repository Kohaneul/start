package sub;

public class Semo implements Figure {	
	private int width, height;
	private double area;
	public Semo(){}
	public Semo(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}
	
	
	@Override
	public void setArea() {
		// TODO Auto-generated method stub
		area = width*height*0.5;
	}

	@Override

	public void toPrint(){
		System.out.printf("이 삼각형은 밑변이 %3d이고 높이가 %3d이고 면적이 %6.2f 입니다.\n",width,height,area);
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
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
	

}
