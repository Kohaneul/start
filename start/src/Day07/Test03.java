package Day07;


/*
 	10개의 문자를 기억할 배열을 만들고
 	'A'부터 'J'꺄지 차례로 출력하시오.
 	
 */

import java.util.*;

public class Test03 {

	public static void main(String[] args) {
	
	char[] ch = new char[10];
	for(int i = 0; i<ch.length;i++) {
		ch[i] = (char)('A'+i);
		
	}
	System.out.println(Arrays.toString(ch));
		
	//한 학생의 과목이 5개가 있다.
	//점수의 총점,평균을 구할 수 있다.
	//평균 : 실수형, 총점 : 정수형 데이터
	//
	
	int[] score = new int[6];
	int sum = 0;
	for(int i = 0; i<score.length-1;i++) {
		score[i] = (int)(Math.random()*(100-60+1))+60;
		sum += score[i];
	}
	int no = score.length-1;
	//총점
	score[no] = sum;
	//평균값
	double avg = sum/(double)no;
	System.out.println("총 점수 : "+score[no]);
	System.out.println("평균 점수 : "+avg);
	
	
	
	
	
	
	}
	



	

}
