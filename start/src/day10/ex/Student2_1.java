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
	int ban, no,kor,eng,math;
	int total;
	int[] rank;
	double avg;
	String name;
	Student2[] s;
	Student2_1(){
		Setting();
		for(int i = 0; i<s.length;i++) {
			System.out.printf("학생이름 : 학생%c (%s 번)\n",s[i].getName(),s[i].getNo());
			System.out.printf("점수) 국어 : %d, 영어 : %d, 수학 : %d\n",s[i].getKor(),s[i].getEng(),s[i].getMath());
			System.out.printf("\t총점 : %d, 평균 : %s\n",s[i].getTotal(),s[i].getAvg());
			System.out.println(rank[i]);
			
		}
	}
	
	public void getRank() {
		int temp = 1;
		rank = new int[5];
		for(int i = 0; i<s.length;i++) {
			for(int j = 0; j<s.length;j++) {
				if(s[i].getTotal()<s[i].getTotal()) {
					temp++;
				}
			}rank[i] = temp;
			
		}
	
		temp = 1;
	}
	
	public void Setting() {
		s= new Student2[5];
		for(int i = 0; i<s.length;i++) {
			int no = (int)(Math.random()*30+1);			
			char name = (char)(Math.random()*('Z'-'A'+1)+'A');
			int kor = (int)(Math.random()*41+60);
			int eng = (int)(Math.random()*41+60);
			int math = (int)(Math.random()*41+60);
			s[i] = new Student2(kor,eng,math);
			s[i].setNo(no);
			s[i].setName(name);
	
			
		}

	}
	
	
	
	
	
	
	
public static void main(String[] args) {
	new Student2_1();
}
	

	
	
	
	
}
