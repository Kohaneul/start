package day16.ex;
/*
	학생들의 점수를 기억하는 HashMap을 만들고
	다섯 학생의 점수를 저장해서 출력하는 프로그램을 작성하시오
	과목은 국어, 영어, 수학, 과학, 국사의 점수를 기억하도록 하세요.
	
*/
public class Student {
	private int kor,eng,math,science,history,total;
	private double avg;
	
	public Student() {}
	public Student(int kor, int eng, int math, int science, int history) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.science = science;
		this.history = history;
		setTotal(kor+eng+math+science+history);
		setAvg(total/5.0);
		
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
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}
	public int getHistory() {
		return history;
	}
	public void setHistory(int history) {
		this.history = history;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	@Override
	public String toString() {
		return String.format(" 총점 : %d, 등수 : %5.2f\n\t국어 : %d, 영어 : %d, 수학 : %d,과학 : %d,국사 : %d",total,avg,kor,eng,math,science,history);
	}
	
	

}
