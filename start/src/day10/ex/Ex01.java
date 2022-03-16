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
	int ban, no, kor, eng, math,total;
	double avg;
	Student s;
	Ex01(){
		setting();
		getData();
	}
	
	public void setting() {
		s = new Student();
		s.setName("홍길동");
		s.setBan((int)(Math.random()*3+3));
		s.setNo((int)(Math.random()*30+20));
		s.setEng((int)(Math.random()*41+60));
		s.setMath((int)(Math.random()*41+60));
		s.setKor((int)(Math.random()*41+60));
	}
	
	public int getAdd() {
		return s.getKor()+s.getEng()+s.getMath();
	}
	
	
	public void getData() {
		String name = s.getName();
		int ban = s.getBan();
		int no = s.getNo();
		int kor = s.getKor();
		int eng = s.getEng();
		int math = s.getMath();
		int total = getAdd();
		double avg = total/3.0;
		
		System.out.printf("이름 : %s (%d 반, %d번)의 성적)\n",name, ban,no);
		System.out.printf("국어 : %d / 수학 : %d / 영어 : %d \n",kor,math,eng);
		System.out.printf("총점 : %d / 평균 : %.2f\n",total,avg);
	}
	
	
	
	
	public static void main(String[] args) {
	new Ex01();}

	}

	
	
	
	
	