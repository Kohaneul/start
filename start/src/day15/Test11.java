package day15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 	5~25 사이의 랜덤한 정수를 반지름으로 하는 원을 기억할 클래스를 만들고
 	원 10개를 리스트에 채워서
 	넓이 넓은 원부터 내림차순으로 정렬해서 내용을 출력하세요
 	
 */
public class Test11 {
	Test11(){
		
		ArrayList list = new ArrayList();
		
		for(int i = 0; i<10;i++) {
			list.add(new Circle((int)(Math.random()*(25-5+1)+5)));
			
		}
		System.out.println("정렬 전");
		for(Object o : list) {
			System.out.println((Circle)o);
		}
		
		Collections.sort(list, new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				int result = 0;
				Circle c1 = (Circle)o1;
				Circle c2 = (Circle)o2;
				
				result = (c1.getArea()-c2.getArea()<0)?-1:1;
				
				return -result;
			}
			
			
		});
		
		
		System.out.println("정렬 후");
		for(Object o : list) {
			System.out.println((Circle)o);
		}
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		new Test11();
	}
	
}

class Circle{
	private int rad;
	private double arround,area;
	
	Circle(int rad){
		this.rad = rad;
		setArea();
		setArround();
		
	}

	public void setArea() {
		this.area = Math.PI*rad*rad;
	}
	
	public void setArround() {
		this.arround = Math.PI*rad*2;
	}

	
	public int getRad() {
		return rad;
	}

	public void setRad(int rad) {
		this.rad = rad;
	}

	public double getArround() {
		return arround;
	}

	public void setArround(double arround) {
		this.arround = arround;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "반지름 : " + rad + ", 둘레 : " + arround + ", 넓이 : " + area;
	}
	
	
	
	
	
	
	
	
	
}

