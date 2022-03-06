package day08;

import java.util.Arrays;
/*
 	다섯 학생의 
 	java, db, web, jsp, spring 점수를 기억할 배열을 만들고
 	각 과목의 점수를 랜덤하게 만들어서 입력하고
 	결과를 출력하는 프로그램을 작성하세요
  {"java","db","web","jsp","spring"};
 
 */




public class Test11 {

	public static void main(String[] args) {
	
	int[][] stud = new int[5][5];
	String[]subj ={"java","db","web","jsp","spring"};
	
	for(int i = 0; i<stud.length;i++) {
		char ch = (char)('A'+i);
		System.out.print(ch+"학생 ==> ");
		for(int j = 0; j<stud[i].length;j++) {
			stud[i][j] = (int)(Math.random()*(100-60+1)+60);
			System.out.print(subj[j]+":"+stud[i][j]+" | ");
		}
		System.out.println();
	}

	
			
	
		
		
		
		
		
		
		
	/*	
	int[][] stud =new int[3][5]; //3 학생의  5과목 입력
	
	
	for(int i = 0; i<stud.length;i++) {
		for(int j = 0; j<stud[i].length;j++) {
			stud[i][j] = (int)(Math.random()*41+60);
			System.out.print(stud[i][j]+" | ");
			
			
		}System.out.println();
	}
	System.out.println("------------------------");
	
	int[] total = new int[3];
	for(int i = 0; i<stud.length;i++) {
		for(int j = 0; j<stud[i].length;j++) {
			total[i] += stud[i][j];
		}
		
	}
	System.out.println();
	for(int t : total) {
		System.out.println(t);
	}
*/
	
	
	}
}

