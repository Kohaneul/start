package day16.ex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex02 {
/*
 	학생들의 점수를 기억하는 HashMap을 만들고
 	다섯 학생의 점수를 저장해서 출력하는 프로그램을 작성하시오
 	과목은 국어, 영어, 수학, 과학, 국사의 점수를 기억하도록 하세요.
 	
 */
	public Ex02() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		HashMap<String,Student> map = new HashMap<String,Student>();
		for(int i = 0; i<5;i++) {
			map.put(list.get(i), new Student((int)(Math.random()*41+60),(int)(Math.random()*41+60),(int)(Math.random()*41+60),(int)(Math.random()*41+60),(int)(Math.random()*41+60)));
			}
		Set<Map.Entry<String, Student>> keys = map.entrySet();
		for(Object key : keys) {System.out.println(key);}
		
		
	}

	public static void main(String[] args) {
	new Ex02();

	}

}
