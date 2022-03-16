package day10.ex;


public class Student {
	private String name;
	private int rank, total,ban,no,kor,eng,math;
	private double avg;
	
	Stud(){}
	Stud(int kor,int eng,int math){
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.rank = 1;
		this.total = getTotal();
		this.avg = getAvg();
		this.ban = ban;
		this.no = no;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public int getTotal() {
		return kor+eng+math;
	}
	public void setTotal(int total) {
		this.total = total;
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
	public double getAvg() {
		return getTotal()/3.0;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	
	
	
	
	
	}

	
	
	
	
	