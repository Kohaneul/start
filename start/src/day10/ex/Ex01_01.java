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

public class Ex01_01 {
	String [] name;
	int[] ban,no,kor,eng,math;
	double avg;
	int total;
	int rank;
	
	Ex01_01(){
		setData();
		Student s[] = setStud();
		toPrint(s);
		
	}
	
	public void setData() {
		name  = new String[] {"A군","B군","C군","D군","E군"};
		ban = new int[] {1,3,5,7,12};
		no = new int[] {2,4,10,5,3};
		kor = new int[] {(int)(Math.random()*41+60),(int)(Math.random()*41+60),(int)(Math.random()*41+60),(int)(Math.random()*41+60),(int)(Math.random()*41+60)};
		eng = new int[] {(int)(Math.random()*41+60),(int)(Math.random()*41+60),(int)(Math.random()*41+60),(int)(Math.random()*41+60),(int)(Math.random()*41+60)};
		math = new int[] {(int)(Math.random()*41+60),(int)(Math.random()*41+60),(int)(Math.random()*41+60),(int)(Math.random()*41+60),(int)(Math.random()*41+60)};
	
	}
	
	public Student[] setStud() {
		Student[] s = new Student[5];
		for(int i = 0; i<s.length;i++) {
			s[i] = new Student();
		}
		for(int i = 0; i<s.length;i++) {
			Student stud = s[i];
			stud.setName(name[i]);
			stud.setBan(ban[i]);
			stud.setNo(no[i]);
			stud.setKor(kor[i]);
			stud.setEng(eng[i]);
			stud.setMath(math[i]);
		}
		return s;
	}
	

	
public int[] getAdd (Student[] s) {
	total = new int [s.length];	
	for(int i= 0; i<s.length;i++) {
		total[i] = s[i].getEng()+s[i].getKor()+s[i].getMath();	
	}
	
	return total;
}

public double[] getAvg(int[] total) {
	double[] avg = new double[total.length];
	for(int i = 0; i<total.length;i++) {
		avg[i] = (double)total[i]/3.0;
	}
	
	
	return avg;
}


public int[] getRank(int[] total) 
{
	rank = new int[total.length];
	int temp = 1;
	for(int i = 0; i<rank.length;i++) {
	
		for(int j = 0; j<rank.length;j++) {
			if(total[i]<total[j]) {
				temp++;
			}
		}rank[i] = temp;
		temp = 1;
	}
	
	
	return rank;
}


	
	
	public void toPrint(Student[] s) {
		for(int i = 0; i<s.length;i++) {
			String name = s[i].getName();
			int ban = s[i].getBan();
			int no = s[i].getNo();
			int kor = s[i].getKor();
			int eng = s[i].getEng();
			int math = s[i].getMath();
			int[] total = getAdd(s);
			double[] avg = getAvg(total);
			int[] rank = getRank(total);

			System.out.println("이름 : "+name);
			System.out.println("반 : "+ban);
			System.out.println("국어점수 : "+kor);
			System.out.println("영어점수 : "+eng);
			System.out.println("수학점수 : "+math);
			System.out.println("총점 : "+total[i]);
			System.out.println("평균 : "+avg[i]);
			System.out.print("등수 : "+rank[i]);
			
			System.out.println();	
			
			
			
			System.out.println("====================");
		}
		
	}
	
	
	public static void main(String[] args) {
	new Ex01_01();}

	}

	
	
	
	
	