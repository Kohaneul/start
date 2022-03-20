package day15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Test10 {
	//ArrayList 타입의 list에 1~25 사이의 정수 10개를 랜덤하게 만들어서 채워주세요.
	
	Test10(){
		ArrayList ar= new ArrayList();
		
		System.out.println("정렬 전");
		for(int i = 0; i<10;i++) {
			DownSort d = new DownSort((int)(Math.random()*(25-1+1)+1));
			ar.add(d);
		}
		System.out.println("정렬 전");
		for(Object o : ar) {
			DownSort d = (DownSort)o;
			System.out.println((DownSort)o);
		}
		Collections.sort(ar,new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				DownSort d1 = (DownSort)o1;
				DownSort d2 = (DownSort)o2;
				
				int result = d1.getNum()-d2.getNum()<0?-1:1;
				
				return -result;
				
			}

		
			
			
		});
		
		
		
		
		System.out.println("정렬 후");
		for(Object o : ar) {
			System.out.println((DownSort)o);
		}
		
		
	
	}
	
	public static void main(String[] args) {
		new Test10();
		
	}
	
}



class DownSort implements Comparator {
	private int num = 0;
	DownSort(){}
	DownSort(int num){
		this.num = num;
	}
	public void setNum() {
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public int compare(Object o1, Object o2) {
		int result = 0;
		
		DownSort d1 = (DownSort)o1;
		DownSort d2 = (DownSort)o2;
		
		result = d1.num-d2.getNum()<0?-1:1;
		return -result;
		
	}
	@Override
	public String toString() {
		return "번호 :" + num;
	}
	
	
	
}



	