package day09.ex;

/*
	문제 5 ]
		10 학생의 국어, 영어, 수학 점수를 랜덤하게 입력받아서
		총점과 석차를 구하는 프로그램을 작성하세요.
		
		각 학생의 점수입력, 총점계산, 석차계산, 출력은 함수로 처리하세요.
		
 */


public class Ex05 {
	int math,eng,korea,total,rank;
	int[][] student;
	public Ex05() {
	student = setting();
	setTotal();
	getRank();
	toPrint();
	setArr();
	toPrint();
		
	}
	public int getRnd() {
		return (int)(Math.random()*41+60);
	}
	public int[][] setting() {
		student = new int[10][5];
		for(int i = 0; i<student.length;i++) {
			for(int j = 0; j<student[i].length;j++) {
				student[i][0] = getRnd();
				student[i][1] = getRnd();
				student[i][2] = getRnd();			}
			}
	
		return student;
	}
	
	public void setTotal() {
	
		for(int i = 0; i<student.length;i++) {
			total = 0;
			for(int j = 0; j<student[i].length;j++) {
				total+=student[i][j];
				student[i][3] = total;
			}
			
		}
		
		
	}

	public void getRank() {
	
		for(int i = 0; i<student.length;i++) {
			int temp = 1;
			for(int j = 0; j<student.length;j++) {
				if(student[i][3]<student[j][3]) {
					temp++;
				}
			}
			 student[i][4] = temp;
		}
	}
	
	public void setArr() {
		System.out.println("*********정렬 후***********");

		for(int i = 0; i<student.length;i++) {
			for(int j = i+1; j<student.length;j++) {
				if(student[i][4]>student[j][4]) {
					for(int k = 0; k<student[i].length;k++) {
						int temp = student[i][k];
						student[i][k] = student[j][k];
						student[j][k] = temp;
					}
				}
			}	
	
	}
		}
		
	public void toPrint() {
		
		for(int i = 0; i<student.length;i++) {
			for(int j = 0; j<student[i].length;j++)
			{	korea = student[i][0];
				eng = student[i][1];
				math = student[i][2];
				total = student[i][3];
				rank = student[i][4];
				
			}
			System.out.printf("[%d등] 국어 : %d, 영어 : %d, 수학 : %d , 총점 : %d \n",rank, korea,eng,math,total);
		}
	}
		
		
	public static void main(String[] args) {
	new Ex05();}
	
	//점수입력
	
	

		
}
		
	
	
	
	
	
	
			
		
	

