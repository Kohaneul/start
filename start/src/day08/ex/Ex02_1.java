
package day08.ex;

/*
bonus ]
	Ex01의 각학생의 항목에 석차도 입력되도록 하세요.
	그후 내림차순 정렬하세요.
	
*/



public class Ex02_1 {

	public static void main(String[] args) {
	int[][]student = new int[7][7];
	//학생1 과목1 과목2 과목3 과목4 과목5 총점 등수
	//학생2 과목1 과목2 과목3 과목4 과목5 총점 등수
	//학생3 과목1 과목2 과목3 과목4 과목5 총점 등수
	//학생4 과목1 과목2 과목3 과목4 과목5 총점 등수
	//학생5 과목1 과목2 과목3 과목4 과목5 총점 등수
	//학생6 과목1 과목2 과목3 과목4 과목5 총점 등수
	//학생7 과목1 과목2 과목3 과목4 과목5 총점 등수
	
	//과목1~과목 5 랜덤으로 입력
	for(int i = 0; i<student.length;i++) {
	int sum = 0;
		for(int j = 0; j<student[i].length-2;j++) {
			student[i][j] = (int)(Math.random()*(100-60+1)+60);
			//총점 입력
			sum+=student[i][j];
			}
		student[i][5] = sum;
			}
	
	//확인차 출력
	for(int i = 0; i<student.length;i++) {
		for(int j = 0; j<student[i].length;j++) {
			System.out.print(student[i][j]+" ");
		}
		System.out.println();
	}
	
	//등수 입력
	for(int i = 0; i<student.length;i++) {
		int rank = 1;
		for(int j = 0; j<student[i].length;j++) {
			if(student[i][5]<student[j][5]) {
				rank+=1;
			}
			student[i][6] = rank;
		}
	}

	System.out.println("========등수 입력후 출력========");
	for(int i = 0; i<student.length;i++) {
		for(int j = 0; j<student[i].length;j++) {
			System.out.print(student[i][j]+" ");
		}
		System.out.println();
	}
	
	//오름차순 정렬
	for(int i = 0; i<student.length;i++) {
		//임시로 tmp 라는 변수를 생성해주었다.
		int tmp  = 0;
		for(int j = 0; j<student[i].length;j++) {
		for(int k = i+1; k<student.length;k++) {
			if(student[i][6]>student[k][6]) {
				//i번째 등수가 k번째 등수보다 높을 경우 tmp 라는 임시 변수에 담아두어
				tmp = student[i][j];
				//k번째 등수를 i번째 등수에 대입시켜
				student[i][j] = student[k][j];
				//k번째에 담아두었던 i번째 데이터를 다시 입력시킨다.
				student[k][j] = tmp;
			}
		}
	}

	}
	
	System.out.println("========오름차순 정렬 후 출력========");
	for(int i = 0; i<student.length;i++) {
		for(int j = 0; j<student[i].length;j++) {
			System.out.printf("%d  ",student[i][j]);
		}
		System.out.println();
	}
	

}

}








