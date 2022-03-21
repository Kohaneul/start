package day16;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test03 {
/*
 	전화번호부를 만들자(HashMap)
 */

	
	
	public Test03() {
		HashMap map = new HashMap();
		//데이터 출력
		map.put("제니", "010-1111-1111");
		map.put("리사", "010-2222-2222");
		map.put("로제", "010-3333-3333");
		map.put("지수", "010-4444-4444");
		//출력
		System.out.println("로제 : "+map.get("로제"));
		System.out.println();
	
		Set keys = map.keySet();	//key값만 모두 출력
		for(Object key : keys) {	//Hashcode 값으로 정렬
			Object value = map.get(key);
			System.out.println(key+" : "+value);
		}
	}
	
	

	public static void main(String[] args) {
	new Test03();

	}

}
