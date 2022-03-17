package day14.ex.ex03;

import java.util.Scanner;

/*
	 문제3 ] 
	 학생 한명의 성적을 관리하는 클래스 Student를 작성하세요
	 기억할 내용은
	 반, 이름, 국어, 영어, 수학, 총점 을 기억하도록 하고
	 필요한 기능(함수)는 필요한만큼 추가해주세요
	 단, 학생의 반과 이름이 같으면 같은 학생으로 처리하도록 하세요
	 학생 변수를 출력한 후 모든 내용이 출력되도록 하세요
	 
 */
public class Ex03 {
	int kor, eng,math,total,ban;
	String name;
	Student s;
	public Ex03() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 학생 이름 입력 : ");
		Student s1 = new Student(setRnd(60,100),setRnd(60,100),setRnd(60,100));
		s1.setName(setName(sc));
		s1.setBan(setRnd(1,10));
		System.out.print("두번째 학생 이름 입력 : ");
		Student s2 = new Student(setRnd(60,100),setRnd(60,100),setRnd(60,100));	
		s2.setName(setName(sc));
		s2.setBan(setRnd(1,10));
		System.out.println(s1);
		System.out.println(s2);
		s1.equals(s2);
		
	}
	public String setName(Scanner sc) {
		Student s = new Student();
		String str = sc.nextLine();
		s.setName(str);
		return str;
	}
	
	
	public int setRnd(int num1,int num2) {
		return (int)(Math.random()*(num2-num1+1)+num1);
	}

	public static void main(String[] args) {
		new Ex03();
	}

}
