package jdbc.FormatTest;

import java.util.Scanner;
import java.text.*;
public class Test02 {
/*
 	학생의 점수를 입력받아서
 	학점을 출력하는 프로그램을 작성하세요
 	
 
	String str;
	Scanner sc = new Scanner(System.in);
	System.out.println("점수를 입력하세요");
	int score = sc.nextInt();
	score = score/10;
	switch(score) {
	case 10:
		str = "A";
		break;
	case 9:
		str = "A";
		break;
	case 8:
		str = "B";
		break;
	case 7:
		str = "C";
		break;
	case 6:
		str = "D";
		break;
	case 5:
		str = "F";
		break;	
		System.out.println("귀하의 등급은 : "+str);
		*/
		public Test02() {
			double[] limits = {0,60,70,80,90};
			/*
			 	limits을 만들때 주의사항 : 반드시 오름차순으로 정렬해서 만들어야 한다.
			 	의미 : 0~59	사이는 하나의 문자로 바꾸고 
			 		   60~69사이는 하나의 문자로 바꾸고
			 		   .....
			 		   90~   문자로 바꿔라
			 */
			String [] formats = {"F","D","C","B","A"};
			//formats를 만들때 주의사항
			//limits의 갯수와 동일하게 만들어야 한다.
			ChoiceFormat form = new ChoiceFormat(limits,formats);
			//특정 정수를 랜덤하게 발생시켜서 그 점수의 학점을 출력해보자.
			int score = (int)(Math.random()*101);
			//학점 추출
			String grade = form.format(score);
			System.out.println("학점 : "+grade+" , 점수 : "+score);
		}
	

	public static void main(String[] args) {
		new Test02();

	}

}
