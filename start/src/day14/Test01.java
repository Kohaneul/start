package day14;

public class Test01 {

	public Test01() {
	}
	
	public static void main(String[] args) {
		Nemo11 n1 = new Nemo11(10,20);
		Nemo11 n2 = new Nemo11(20,10);
		
		System.out.println(n1.area == n2.area);
		System.out.println(n1+","+n2);
	}
}


class Nemo11{
	int width,height,area;
	Nemo11(int width,int height){
		this.width= width;
		this.height = height;
		this.setArea(width, height);
	}
	public int setArea(int width,int height) {
		area = width*height;
		return area;
	}
	public String toString() {
		return "네모";
	}
	
	
}