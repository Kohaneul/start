package day04.ex;
/*
  3자리 숫자를 입력받아서(100~999)를 입력받아서
  이 숫자에 가장 가까운 100의 배수를 만들기 위해서는 
  얼마가 필요한지를 계산해서 출력해주는 프로그램을 작성하시오
  
  예)
  	241 => 200에 가까워서 41에 빼줘야함
  	777 => 800에 가까움 23을 더해줘야함
 */

import java.util.*;
public class Ex05 {

	public static void main(String[] args) {	
	Scanner sc = new Scanner(System.in);
	System.out.print("숫자 입력(100~900) : ");
	int input = sc.nextInt();
	int num2 = (int)(input/100)*100;
	int num3 = num2+100;
	int ii = num2-input;
	//950 =>900 + 50

	int result = (ii>=50 && ii>=0)?(num2):(num3);
	String str = (result-input>=0)?(result-input +" 더해줘야 함"):(result-input +" 빼줘야 함");

	
	System.out.println("입력받은 수 "+input);
	System.out.println("가장 가까운 100의 배수 "+result+"이며, "+str);

	}

}
