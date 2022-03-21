package day16;

import java.util.*;

public class Test11 {
/*
 	블랙핑크 멤버들의 이름을 기억하는 Set을 만들어서 출력해보자
 	이때 문자열만 입력되도록 처리하세요.
 */
	
	public Test11() {
		HashSet<String> set = new HashSet<String>();
		// 이 set은 문자열만 입력받도록 조치해놓은 Set이다.
		// 따라서 꺼낸 데이터는 당연히 문자열이 될 것이다.
		
		set.add("제니");
		set.add("로제");
		set.add("지수");
		set.add("리사");
		
		//향상된 for명령
		for(String name : set) {
			System.out.println(name);
		}
		System.out.println();
		//제너릭스를 전파되지 않는다.
		ArrayList<String>list = new ArrayList<String>(set);
		for(int i = 0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		Iterator<String>itor = set.iterator();
		System.out.println("====================================");
		while(itor.hasNext()) {
			
			String name = itor.next();
			System.out.println(name);
		}
	}

	public static void main(String[] args) {
	new Test11();
	}

}
