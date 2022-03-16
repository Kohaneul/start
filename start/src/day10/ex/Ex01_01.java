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
public class Ex01_01 {
	String name;
	int ban, no, kor, eng, math,total,rank;
	double avg;
	Stud [] stud;
	Ex01_01(){
		setting();
		setRank();
		toPrint();
		setArr();
		System.out.println("*******************정렬 후*******************");
		
		toPrint();
	}
	
	public void setting() {
		stud = new Stud[5];
		for(int i = 0; i<stud.length;i++) {
			kor = (int)(Math.random()*41+60);
			eng = (int)(Math.random()*41+60);
			math = (int)(Math.random()*41+60);
			stud[i] = new Stud(kor,eng,math);
			no = (int)(Math.random()*31+1);
			ban = (int)(Math.random()*11+5);
			name =(char)(Math.random()*('Z'-'A'+1)+'A')+"학생";
			stud[i].setName(name);
			stud[i].setNo(no);
			stud[i].setBan(ban);
			
		}
		
	}
	
	public void setRank() {
		for(int i = 0; i<stud.length;i++) {
			for(int j = 0; j<stud.length;j++) {
				rank = stud[i].getRank();
				if(stud[i].getAvg()<stud[j].getAvg()) {
					stud[i].setRank(rank+1);
				}
			}
		}
		
		
	}
	
	public void  toPrint() {
		for(int i = 0; i<stud.length;i++) {
			Stud st = stud[i];
			kor = st.getKor();
			eng = st.getEng();
			math = st.getMath();
			no = st.getNo();
			ban = st.getBan();
			name = st.getName();
			avg = st.getAvg();
			total = st.getTotal();
			rank = st.getRank();
			System.out.println("=============================================================");
			System.out.printf(" [%d등] ==> %s (3학년 %d반 %d번) 총점 : %d , 평균 : %6.2f\n",rank,name,ban,no,total,avg);
			System.out.printf("\t성적>> 국 : %d / 영 : %d /수 : %d\n", kor,eng,math);
			
		}
		System.out.println("=============================================================");
	}
	
	public void setArr() {
		for(int i = 0; i<stud.length;i++) {
			for(int j = i+1; j<stud.length;j++) {
				if(stud[i].getRank()>stud[j].getRank()) {
					Stud temp = stud[i];
					stud[i] = stud[j];
					stud[j] = temp;
				}
			}
		}
		
		
	}
	
	public static void main(String[] args) {
	new Ex01();}

	}

	
	
	
	
	