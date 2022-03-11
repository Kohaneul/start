package day12.Figure;
/*
	 이 클래스는 Figure이라는 추상클래스를 상속받아서 만든 클래스이다
	 따라서 상위클래스가 가지고 있는 추상함수를 100% 모두 구현해야한다.
	 
 */



public class Nemo extends Figure {
	private int garo, sero,area;
	
	public Nemo() {}
	public Nemo(int garo, int sero) 
	{
		this.garo = garo;
		this.sero = sero;
		setArea();
	}
	
	
	
	@Override
	public void setArea() {
		//사각형 면적 셋팅하는 기능
		area = garo*sero;
	}
	
	
	public int getgaro() {
		return garo;
	}
	public void setgaro(int garo) {
		this.garo = garo;
	}
	public int getsero() {
		return sero;
	}
	public void setsero(int sero) {
		this.sero = sero;
	}
	public double getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	
	public void toPrint(){
		
		//사각형 내용 출력하는 기능
		System.out.printf("이 사각형은 가로가 %3d이고 세로가 %3d이고 면적이 %6d 입니다.\n",garo,sero,area);
	}
	
	
	
}
