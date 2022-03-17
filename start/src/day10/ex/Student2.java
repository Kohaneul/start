package day10.ex;
/*
문제 1 ]
	다음 변수를 가지는 Student 클래스를 제작하세요.
	
	String name;
	int ban, no, kor, eng, math;
	
	
*/
public class Student2{
	private int ban, no,kor,eng,math;
	private int total,rank;
	private double avg;
	private char name;
	
	Student2(int kor,int eng,int math)
	{
		this.eng=eng;
		this.math = math;
		this.kor = kor;
	
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
	public int getTotal() {
		total = math+kor+eng;
		return total;
	}
	
	
	public double getAvg() {
		avg = getTotal()/3;
		return avg;
	}
	
	public char getName() {
		return name;
	}
	public void setName(char name) {
		this.name = name;
	}
	
	
	

	
}
