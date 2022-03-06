
package day08.ex;
/*
7학생의 5과목 점수를 랜덤하게 만들어서 기억시키고
각 학생 배열의 맨 마지막에는 총점을 계산해서 입력되게 하고
결과를 출력하는데
평균도 계산해서 출력하세요.


학생1 과목1/ 과목2 /과목3 /과목4 /과목 5 /총점
학생2 과목1/ 과목2 /과목3 /과목4 /과목 5 /총점
*/

public class Ex01 {

	public static void main(String[] args) {
	int[][]student = new int[7][6];
	int result  = 0;
	for(int i = 0; i<student.length;i++) {
		System.out.print("학생"+(i+1)+" ");
		for(int j = 0; j<student[i].length-1;j++) {
			student[i][j] = (int)(Math.random()*(100-60+1)+60);
			student[i][5]+=student[i][j];
			System.out.print(student[i][j]+" / ");
		}		
		System.out.print("총점 : " + student[i][5]);
		System.out.println();
		double length = student[i].length-1;
		System.out.println("\t 평균 : " + student[i][5]/length);
	
	}
	
	
	
	}
	
	

	}


