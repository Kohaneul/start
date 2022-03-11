package day10.ex;
/*
문제 1 ]
	다음 변수를 가지는 Student 클래스를 제작하세요.
	
	String name;
	int ban, no, kor, eng, math;
	
	
*/
public class Student{
	private int ban, no,kor,eng,math;
	int total,rank;
	double avg;
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getAdd() {
		total = 0;
		total = math+eng+kor;
		return total;
	}
	
	
	public double getAvg() {
		avg = 1;
		avg = getAdd()/(double)3;
		return avg;
	}
	
	public int getRank() {
		
		return rank;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Student [ban=" + ban + ", no=" + no + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", rank="
				+ rank + ", total=" + total + ", avg=" + avg + ", name=" + name + "]";
	}
	
	
	
	
}
