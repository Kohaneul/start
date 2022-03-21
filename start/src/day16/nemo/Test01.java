package day16.nemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Test01 {

	public Test01() {
		HashSet set = new HashSet();
		for(int i = 0;;i++) {
			int width = (int)(Math.random()*20+10);
			int height = (int)(Math.random()*20+10);
			set.add(new Nemo(width,height));
			
			if(set.size()==10) {
				break;
			}
		}
		Iterator itor = set.iterator();
		ArrayList list = new ArrayList(set);
		Collections.sort(list);
		for(Object o : list) {
			System.out.println(o);
		}
		
	}
	
	public static void main(String[] args) {
		new Test01();
	}

}

