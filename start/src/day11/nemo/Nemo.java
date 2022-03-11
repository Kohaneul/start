package day11.nemo;

public class Nemo {
	private int width,height,area;
	private String arr;
	private int rank;
	{
		rank = 1;
	}
	
	
	Nemo(){}
	Nemo(int width,int height){
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
		area = height*width;
		
	}

	
	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
	
	public String getArr() {
		
		arr = "가로 : "+width+", 세로 : "+height+", 넓이 :"+area+"("+rank+"등)";
		return arr;
	}
	
	


	

	
	
	
}
