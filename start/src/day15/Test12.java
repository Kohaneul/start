package day15;
import java.util.*;

/*
	 블랙핑크 멤버를 HashSet에 저장한 후 꺼내서 출력.
 */

public class Test12 {

	public Test12() {
	HashSet set = new HashSet();
	for(int i = 0; i<5;i++) {
		set.add(i);
	}
	
	Iterator itor = set.iterator();
	while(itor.hasNext()) {
		int temp = (int)itor.next();
		System.out.println(temp);
	}
	
	
	ArrayList ar = new ArrayList(set);
	
	for(int i = 0; i<ar.size();i++) {
		int tem = (int)ar.get(i);
System.out.println(tem);
	}
	
		
	}
		
		
	public static void main(String[] args) {
		new Test12();
	}

}
