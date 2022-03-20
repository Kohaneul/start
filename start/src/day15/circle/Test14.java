package day15.circle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Test14{
	Test14(){
		TreeSet set = new TreeSet(new Comparator(){
			public int compare(Object o1, Object o2) {
				Circle c1 = (Circle)o1;
				Circle c2 = (Circle)o2;
				int result = c1.getRad()-c2.getRad();
				return -result;
			}});
			Circle c1 = new Circle(55);
			Circle c2 = new Circle(10);
			set.add(c1);
			set.add(c2);
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
