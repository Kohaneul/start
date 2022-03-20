package day15.semo;

import java.util.*;

public class Test15 {
/*
 	삼각형의 정보를 기억하는 Semo 클래스를 만들고
 	15개의 삼각형을 높이가 큰 삼각형부터 정렬되어서 저장되도록 
 	TreeSet을 만들고 내용을 출력하세요
 	
 	이 예제에서는 Semo 클래스를 정렬 가능한 클래스로 만들어서 저장하는 2번 방식으로 해결해보기로 하겠다.
 */
	Test15(){
	HashSet set = new HashSet();
	while(true) {
		set.add(new Semo((int)(Math.random()*20+10),(int)(Math.random()*20+10)));
		if(set.size()==15) {
			break;
		}
		
	}
	System.out.println("<<<정렬 전>>>");
	for(Object ob : set) {
		System.out.println((Semo)ob);
	}
	System.out.println();
	System.out.println("<<<정렬 후>>>");
	ArrayList list = new ArrayList(set);
	Collections.sort(list);
	int i= 0;
	for(Object obj : list) {
		System.out.println((i+1)+"등 : "+(Semo)obj);
		i++;
	}
	
	}
		


	public static void main(String[] args) {
	new Test15();
	}

}
