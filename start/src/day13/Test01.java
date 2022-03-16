package day13;
import day12.sub.*;

public class Test01 {
/*
 	day12.sub 패키지의 Figure 인터페이스를 구현한 무명내부클래스를 만들어 사용해보자.
 */		
	
	double area;
	Figure fig1,fig2;
	
	public Test01(){
		
		fig1 = new Figure() {

			int width  = (int)(Math.random()*21+10);
			int height = (int)(Math.random()*21+10);
			@Override
			public void setArea() {

				area = width*height;
				
			}

			@Override
			public void toPrint() {
			
			setArea();
			System.out.printf("이 사각형은 가로가 %d 세로가 %d 넓이가 %6.0f\n", width,height,area);
				
			}
			
		};
		fig2 = new Figure() {
			int width  = (int)(Math.random()*21+10);
			int height = (int)(Math.random()*21+10);
			@Override
			public void setArea() {

			
			area = width*height/2.0;
				
			}

			@Override
			public void toPrint() {
			setArea();
			System.out.printf("이 삼각형은 가로가 %d 세로가 %d 넓이가 %6.2f\n", width,height,area);
				
			}
			
		};
		
	
	}
		
		
	
	
	public static void main(String[] args) {
	Test01 t1= new Test01();
	t1.fig1.toPrint();
	t1.fig2.toPrint();
	

	}

}
