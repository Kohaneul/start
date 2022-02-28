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

import javax.swing.JOptionPane;
public class Ex05 {

	public static void main(String[] args) {	
	//1. 세자리 정수를 입력받는다.
		//String sno = JOptionPane.showInputDialog("세자리 정수 입력");
		System.out.println("100~999까지의 임의의 숫자를 입력하시오");
		Scanner sc = new Scanner(System.in);
		String sno = sc.nextLine();
		//입력받은 데이터는 숫자 정수 형태의 문자열 이므로 정수로 변환해준다.
		//정수 형태의 문자열을 정수로 변환해주는 기능을 가지고 있는 함수는
		//	Integer.parseInt(문자열);
		int input = Integer.parseInt(sno);
		
		//10단위 이하만 추출해낸다.
		int num = input%100;
		
		//몫 추출
		int num2 = (input/100)*100;
		
		int result = 0;
		//num이 50보다 큰지 작은지 판별
		result = (num>50)?(num2+100):(num2);
		int result2 = (result-input>0)?(result-input):(result-input);
		System.out.println("입력받는 수 "+input+"에 근접한 100의 배수는 "+result+"이다.");
		System.out.println("해당 수에 근접하게하기 위해서는 "+result2+" 필요하다.");
		
		
		
		
		
		
		
		
	//

	}

}
