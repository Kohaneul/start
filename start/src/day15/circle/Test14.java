package day15.circle;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Test14 {
/*
 	TreeSet 에 입력하는 데이터는 반드시 정렬가능한 데이터여야 한다.
 	
 */
	
	
	
	
	public Test14() {
		/*
		TreeSet set = new TreeSet();
		Circle c1 = new Circle(5);
		Circle c2 = new Circle(10);
		set.add(c1);
		set.add(c2);
		
		ArrayList list = new ArrayList(set);
		for(Object o : list) {
			System.out.println(o);
		}
		
		==> 이 작업은 에러가 발생하는데 원인은 Circle이 정렬할 수 없는 데이터 이기 때문이다.
		
			해결방법은
				1.TreeSet을 만들때 정렬방식을 알려주면서 만드는 방법 : Comparator 이용
				2.Won을 정렬 가능한 클래스로 만든 후 입력	==> 정렬가능한 클래스로 만들어서 입력하는 방법
				==> 정렬 가능한 클래스로 만드는 방법
				
				Comparable 인터페이스를 구현하는 클래스로 제작한다.
				내부의 소속함수 중 compareTo(Object o) 함수를 오버라이드 해서 만들어야 한다.
				
	*/
		// 1. 1번 방법
		TreeSet set = new TreeSet(new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				Circle c1 = (Circle)o1;
				Circle c2 = (Circle)o2;
				int result = c1.getRad()-c2.getRad();
				//내림차순 정렬이므로 부호를 반전시켜서 변환.
				return -result;
				
			}
		});
		Circle c1 = new Circle(5);
		Circle c2 = new Circle(10);
		set.add(c1);
		set.add(c2);
		//출력
		Iterator itor = set.iterator();
		while(itor.hasNext()) {
			Circle c = (Circle)itor.next();
			System.out.println(c);
		}
	}

	public static void main(String[] args) {
		new Test14();
	}

}
