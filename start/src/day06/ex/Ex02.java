package day06.ex;

import java.util.Scanner;


 	
/*
	문제 2 ]
		두 사람이 등산을 한다.
		한사람은 산 입구에서 0.54m/sec 의 속도로 등산을 시작하고
		한사람은 정상에서 1.07m/sec 의 속도로 내려온다.
		산의 높이가 7564m 라고 가정하면
		두 사람이 만나는 시점은 몇분 몇초 후인지 출력하세요.
 */


public class Ex02 {

	public static void main(String[] args) {
	double person1 = 0.54;//시작
	double person2 = -1.07;//내려온다
	double mountain = 7564;
	double one_sec = mountain/person1;
	double two_sec = mountain/person2;
	System.out.println(one_sec+" "+two_sec);
	
	
	}
	
	
	}


