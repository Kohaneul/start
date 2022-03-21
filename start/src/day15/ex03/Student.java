package day15.ex03;
/*
학생 한명의 정보를 저장할 클래스를 제작하세요
정보는
	학생이름, 반, 번호, 
	자바, 데이터베이스, 웹, 스프링 점수
	총점, 평균
를 기억하게 하고

10명의 학생을 TreeSet에 입력하고
반 순서대로 정렬되도록 하세요.
반이 같으면 번호순으로 정렬되도록 하세요.

*/
public class Student implements Comparable{
	
	private String name;
	private int ban,no,java,db,web,spring,total;
	private double avg;

	public Student() {}
	public Student(String name, int ban, int no, int java, int db,int web,int spring) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.java = java;
		this.db = db;
		this.web = web;
		this.spring = spring;
		setTotal(java+db+web+spring);
		setAvg(getTotal()/4.0);
	}
	


	public void setAvg() {
		this.avg = getTotal()/4.0;
	}
	
	
	
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

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getDb() {
		return db;
	}

	public void setDb(int db) {
		this.db = db;
	}

	public int getWeb() {
		return web;
	}

	public void setWeb(int web) {
		this.web = web;
	}

	public int getSpring() {
		return spring;
	}

	public void setSpring(int spring) {
		this.spring = spring;
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
		return ban + "반 (" + no + "번, 이름 : "+name+")\n\t==>java : " + java + ", db : " + db + ", web : "
				+ web + ", spring : " + spring + ", total : " + total + ", 평균 : " + avg;
	}
	@Override
	public int compareTo(Object o) {
		int result = 0;
		Student stud = (Student)o;
		result = ban-stud.getBan();
		if(result==0) {
			result = no-stud.getNo();
		}
		
		
		return result;
	}
	
	
	
	
	
	
	

}
