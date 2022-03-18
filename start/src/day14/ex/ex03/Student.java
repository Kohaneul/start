package day14.ex.ex03;
/*
문제3 ] 
		 학생 한명의 성적을 관리하는 클래스 Student를 작성하세요
		 기억할 내용은
		 반, 이름, 국어, 영어, 수학, 총점 을 기억하도록 하고
		 필요한 기능(함수)는 필요한만큼 추가해주세요
		 단, 학생의 반과 이름이 같으면 같은 학생으로 처리하도록 하세요
		 학생 변수를 출력한 후 모든 내용이 출력되도록 하세요
*/
/*
문제3 ] 
		 학생 한명의 성적을 관리하는 클래스 Student를 작성하세요
		 기억할 내용은
		 반, 이름, 국어, 영어, 수학, 총점 을 기억하도록 하고
		 필요한 기능(함수)는 필요한만큼 추가해주세요
		 단, 학생의 반과 이름이 같으면 같은 학생으로 처리하도록 하세요
		 학생 변수를 출력한 후 모든 내용이 출력되도록 하세요
*/

public class Student {
	private String name;
	private int ban, kor,eng,math,total;
	public Student() {
	}
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		setTotal();
		
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
		return total;
	}
	public void setTotal() {
		total = kor+eng+math;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	@Override
	public boolean equals(Object o) {
		boolean bool = false;
		Student stud =null;
		try {
			stud = (Student)o;
		}
		catch(Exception e) {
			return false;
		}
		int your_ban = stud.getBan();
		String your_name = stud.getName();
		String str = ((this.getBan()==your_ban)&&(this.getName()==your_name))?("같은"):("다른");
		System.out.println("\t==>두 학생은 "+str+"학생 입니다.");
		bool = (this.getBan()==your_ban)&&(this.getName()==your_name);
		return bool;
	}
	
	
	@Override
	public String toString() {
		return "학생 이름 : " + name + "(" + ban + "반)\n\t국어 : " + kor + ", 영어 : " + eng + ", 수학 : " + math
				+ "\n\t총점 : " + total;
	}
	
	
	
	

}
	
	
	
	


