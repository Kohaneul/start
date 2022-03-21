package day15.ex02;

import java.util.TreeSet;

public class ex02 {

/*
	1 ~ 99 사이의 정수를 랜덤하게 발생시켜서 
	10개를 TreeSet에 입력한 후
	내림차순으로 정렬해서 출력하세요.
 */
	public ex02() {
		TreeSet set = new TreeSet();
		while(true){
			set.add(new Num((int)(Math.random()*(99-1+1)+1)));
			if(set.size()==10) {
				break;
			}
		}
		for(Object o : set) {
			System.out.println(o);
		}
		
	}

	public static void main(String[] args) {
		new ex02();
	}

}
