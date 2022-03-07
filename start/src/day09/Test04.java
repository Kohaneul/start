package day09;
/*
 	5학생의 3과목 점수를 배열에 입력한 후 
 	총점을 구하는 프로그램을 작성하세요.
 	
 	단 점수입력, 계산, 출력은 함수로 처리하세요 	
 */

import java.util.Arrays;

public class Test04 {
	Test04(){
		int[][] student = setArr();
		setTotal(student);
		toPrint(student);
	}
	
	
	public static void main(String[] args) {
	new Test04();}
	
	
	//점수입력
	public int[][] setArr(){
		int[][]ar  = new int[5][4];
		
		for(int i = 0; i<ar.length;i++) {
			for(int j = 0; j<ar[i].length-1;j++) {
				ar[i][j] = (int)(Math.random()*41)+60;
			
			}
			
		}
		return ar;
		
	}
	//계산
	
	public void setTotal(int[][] score) {
		
		int sum = 0;
		for(int i = 0; i<score.length;i++) {
			for(int j = 0; j<score[i].length;j++) {
				sum+=score[i][j];
				
			}
			score[i][3] = sum;
			sum = 0;
			
		}
		
	}
	
	public void toPrint(int[][]ar) {
		for(int i = 0; i<ar.length;i++) {
			System.out.print((char)('A'+i)+"학생 : ");
			
			for(int j = 0; j<ar[i].length-1;j++) {
				
				System.out.printf("%4d",ar[i][j]);
				
			}
			for(int j = 3; j<ar[i].length;j++) {
				System.out.printf(" ==>총점 : %4d",ar[i][j]);
			}
			
			System.out.println();
		}
		
		
		
		
		
		
		
	}
	
	
	
}
	
	

	




