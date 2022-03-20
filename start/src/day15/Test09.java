package day15;

import java.util.ArrayList;
import java.util.Collections;

public class Test09 {
	
//	ArrayList 타입의 list에 1~25 사이의 정수 10개를 랜덤하게 만들어서 채워주세요.
	
	public Test09() {
	ArrayList list = new ArrayList();
	for(int i=0; i<10;i++) {
		list.add((int)(Math.random()*(25-1+1)+1));
		
	}
		System.out.println("1. 정렬 전 : ");
		System.out.println(list);
		System.out.println("1-2. 역순 정렬 후 : ");
		Collections.reverse(list);
		System.out.println(list);
		System.out.println("2. 오름차순 정렬 후 : ");
		Collections.sort(list);
		System.out.println(list);
		System.out.println("3. 내림차순 정렬 후 : ");
		Collections.reverse(list);
		System.out.println(list);
	}
	
	
	
	public static void main(String[] args) {
		new Test09();
	}

}
