package day14.ex.ex02;
/*
문제 2]
	사각형의 정보를 기억하는 클래스 Nemo를 제작하시오
	필요한 변수와 함수, 생성자는 필요한 만큼 추가하고
	단, 가로와 세로가 동시에 같은 사각형만 같은 사각형으로 처리가 되도록
	equals() 함수를 오버라이드 하세요
	이클래스 객체를 출력하면 내용이 출력되도록 toString()를 오버라이드 하세요.
*/
public class Nemo {
	private int width,height,area;
	
	Nemo(){}
	Nemo(int width, int height){
	this.width = width;
	this.height = height;
	setArea();
	}
	
	public void setArea() {
		this.area= width*height;
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
		catch(Exception e) {
			return false;
		}
		String result = (n.getWidth()==this.getWidth()&&n.getHeight()==this.getHeight())?("같은"):("다른");
		System.out.println("서로 "+result+" 네모 입니다.");
		bool = n.getWidth()==this.getWidth()&&n.getHeight()==this.getHeight();
		return bool;
	}
	

	

}
