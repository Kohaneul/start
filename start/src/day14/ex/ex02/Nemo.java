package day14.ex.ex02;

public class Nemo {
	private int width, height,area;
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
		return "가로 : " + width + ", 세로 : " + height + ", 넓이 : " + area ;
	}
	public boolean equals(Object o) {
		boolean bool = false;
		Nemo n = null;
		try {
			n = (Nemo)o;
		}
		catch(Exception e){
			return false;
		}
		int width2 = n.getWidth();
		int height2 = n.getHeight();
		String result = ((this.getWidth()==width2) &&(this.getHeight()==height2))?("같습"):("다릅");
		System.out.println("두 사각형은 서로 "+result+"니다.");
		bool= (this.getWidth()==width2) &&(this.getHeight()==height2);
		
		
		return bool;
	}

	

}
