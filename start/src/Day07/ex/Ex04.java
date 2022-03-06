/*
	5명의 학생의 이름을 기억할 배열을 만들고
	각학생의 시험 성적을 기억할 배열을 만들고
	결과를 출력하는 프로그램을 작성하세요.
	
	출력예 ]
		
		둘리 : 80
		제니 : 90
		리사 : 85
		로제 : 75
		지수 : 100
		-------------
		총점 : 000
		평균 : 00.00
 */


 
package Day07.ex;

import java.util.Arrays;

public class Ex04 {

	public static void main(String[] args) {
	String[] str = {"둘리","제니","리사","로제","지수"};
	int[] result = {80,90,85,75,100,0};
	int sum = 0;
	for(int i = 0; i<str.length;i++) {
		System.out.println(str[i]+" : "+result[i]);
		sum+=result[i];
	}
	System.out.println("----------------");
	int no = result.length-1;
	result[no] = sum;
	System.out.println("총점 : "+sum);
	double avg =sum/(double)(no);
	System.out.printf("평균 : %.2f",avg);
	}

}
