package day10.ex;
/*
문제 1 ]
	
	Ex01 클래스에서
		한명의 데이터를 입력해서 출력하기
	String name;
	int ban, no, kor, eng, math;
		
	1. 한개의 함수내에서 처리하기..
	2. 기능별로 분리해서 함수 만들어서 처리...
	
	보너스 ]
		int rank, total;
		double avg;
	
*/

public class Ex01 {
	String name;
	int ban, no, kor, eng, math;
	Student s;
	Ex01(){
		setData();
		s = getData();
		toPrint();
		
	}
	public void setData() {
		name = "홍길동";
		ban = 1;
		no = 10;
		kor = (int)(Math.random()*41+60);
		eng = (int)(Math.random()*41+60);
		math = (int)(Math.random()*41+60);
	}
	public Student getData() {
		s = new Student();
		s.setName(name);
		s.setBan(ban);
		s.setNo(no);
		s.setKor(kor);
		s.setEng(eng);
		s.setMath(math);
		return s;
	}
	
	public int add() {
		int result = 0;
		result = kor+eng+math;
		return result;
	}
	public double avg() {
		double result = 0.0;
		result = add()/3.0; 
		return result;
	}
	
	public void toPrint() {
		
		
		name = s.getName();
		ban = s.getBan();
		no = s.getNo();
		kor = s.getKor();
		eng = s.getKor();
		math = s.getMath();
		
		System.out.println("이름 : "+name);
		System.out.println("반 : "+ban);
		System.out.println("번호 : "+no+"번");
		System.out.println("국어점수 : "+kor+"점");
		System.out.println("영어점수 : "+eng+"점");
		System.out.println("수학점수 : "+math+"점");
		System.out.println("총점 : "+add()+"점");
		System.out.println("평균 : "+avg()+"점");
		
	}
	
	
	
	public static void main(String[] args) {
	new Ex01();}

	}

	
	
	
	
	