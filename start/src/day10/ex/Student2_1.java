package day10.ex;
/*
문제 1 ]
	
	Ex01 클래스에서
		5명의 데이터를 배열로 만들어 데이터 입력하고 출력하고...
		
	1. 한개의 함수내에서 처리하기..
	2. 기능별로 분리해서 함수 만들어서 처리...
	String name;
	int ban, no, kor, eng, math;
	보너스 ]
		int rank, total;
		double avg;
	
*/
public class Student2_1{
	String name;
	int ban, no, kor, eng, math,rank,total;
	double avg;
	Student[] s;
	Student2_1(){
		setting();
		toPrint();
		
	}
	
	public void setting() {
			s = new Student[5];
		for(int i = 0; i<s.length;i++) {
			Student stud = s[i];
			String name = (char)(Math.random()*('Z'-'A'+1)+'A')+"학생";
			int ban = (int)(Math.random()*11+1);
			int no = (int)(Math.random()*31+1);
			int kor = (int)(Math.random()*41+60);
			int eng = (int)(Math.random()*41+60);
			int math = (int)(Math.random()*41+60);
			int total = getAdd();
			double avg =getAvg();
					
			
			
			
		}
		
	}
	

	
	public int getAdd() {
		return kor+eng+math;
	}
	public double getAvg() {
		return getAdd()/3.0;
	}
	
	public void getRank() {
		for(int i = 0; i<s.length;i++) {
			for(int j = 0; j<s.length;j++) {
				int rank = s[i].getRank(); 
				if(s[i].getTotal()<s[j].getTotal()) {
					s[i].setRank(rank+1);
				}
			}
			
		}
		
	}
	
	public void toPrint() {
		for(Student n : s) {
			String name = n.getName();
			
			int ban = n.getBan();
			int no = n.getNo();
			int kor = n.getKor();
			int eng = n.getEng();
			int math = n.getMath();
			int rank = n.getRank();
			int total = n.getTotal();
			double avg = n.getAvg();
			
			System.out.printf("이름 : %s (%d반 %번)\n",name,ban,no);
			System.out.printf("국어성적 : %d  / 수학성적 : %d / 영어성적 : %d\n",kor,math,eng);
			System.out.printf("\t=>총점 : %d, 평균 %.2f (%d등)\n",total,avg,rank);
			
					
		}
		
	}
	
	
	
	
	
	
public static void main(String[] args) {
	new Student2_1();
}
	

	
	
	
	
}
