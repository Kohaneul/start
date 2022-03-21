package day16;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;
public class Test05 {

	public Test05() {
		TreeMap map = new TreeMap();
		//맵에 이름을 key값으로 하고 나이를 데이터로 입력해보자
		map.put("제니", 27);
		map.put("지수", 28);
		map.put("로제", 30);
		map.put("리사", 29);
		//출력
		Set keys = map.keySet();
		for(Object key : keys) {
		System.out.println(key+":"+map.get(key));
		}
		System.out.println("==============================================================");
		//이름 내림차순으로 정렬해서 맵에 넣어보자.
		TreeMap<String,Integer> map1 = new TreeMap<String,Integer>(new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				int result = 0;
				String name1 = (String)o1;
				String name2 = (String)o2;
				result = name1.compareTo(name2);
				
				return -result;
			}
		});
		map1.put("제니", 27);// a < ab, aA > a
		map1.put("지수", 28);
		map1.put("로제", 30);
		map1.put("리사", 29);
		
		Set set2 = map1.keySet();
		
		for(Object obj : set2) {
			int values = map1.get(obj);
					
			System.out.println(obj+" : " +values);
		}
	
	}
	
			
			
	
	
	
	public static void main(String[] args) {
		new Test05();

	}

}
