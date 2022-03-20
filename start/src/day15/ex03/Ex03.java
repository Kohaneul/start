package day15.ex03;

import java.util.TreeSet;

/*
학생 한명의 정보를 저장할 클래스를 제작하세요
정보는
	학생이름, 반, 번호, 
	자바, 데이터베이스, 웹, 스프링 점수
	총점, 평균
를 기억하게 하고

10명의 학생을 TreeSet에 입력하고
반 순서대로 정렬되도록 하세요.
반이 같으면 번호순으로 정렬되도록 하세요.

*/
public class Ex03 {
//String name, int ban, int no, int java, int db,int web,int spring
	public Ex03() {
		TreeSet set = new TreeSet();
		for(int i = 0;;i++) {
			String name = "홍길동"+(i+1);
			int ban = (int)(Math.random()*(10-1+1)+1);
			int no = (int)(Math.random()*(20-1+1)+1);
			int java = (int)(Math.random()*41+60);
			int db = (int)(Math.random()*41+60);
			int web = (int)(Math.random()*41+60);
			int spring = (int)(Math.random()*41+60);
			set.add(new Student(name,ban,no,java,db,web,spring));
			
			
			if(set.size()==10) {
				break;
			}
		}
		for(Object o : set) {
			System.out.println(o);
		}
		
		
	}

	public static void main(String[] args) {
		new Ex03();
	}

}
