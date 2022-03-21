package day16.ex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
/*
 	5~10 사이의 정수를 랜덤하게 발생시켜서
 	그 수만큼의 학생의 점수를 기억하는 HashMap을 만들어서 데이터를 기억시키고
 	꺼내서 출력하세요.
 	데이터를 꺼낼때 키를 모두 추출해서 꺼내는 방식으로 출력하세요
 */
public class Ex01 {

	public Ex01() {
	int num = (int)(Math.random()*(10-5+1)+5);
	HashMap<String,Integer> map = new HashMap<String,Integer>();
	for(int i = 0;;i++) {
		map.put("학생"+(i+1), (int)(Math.random()*41+60));
		if(map.size()==num) {
			break;
		}
	}
	Set set = map.keySet();
	for(Object obj : set) 
	{	
		int value = map.get(obj);
		System.out.println((String)obj+" : "+value);
	}
	
		
	}

	

	public static void main(String[] args) {
	new Ex01();
	}

}
