package day04.ex2;
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
		Scanner sc = new Scanner(System.in);
		System.out.println("세자리의 정수 입력");
		int input = sc.nextInt();
		int num = input/100;
		String str = "";
		if(input%100>50) 
		{
			num = (num+1)*100;
			str = (num-input)+"부족";
		}
		else 
		{
			num = num*100;
			str = (input-num)+"추가";
			
		}
		System.out.println("입력받은 숫자 : "+input);
		System.out.println("인접한 100의 배수 : "+num);
		System.out.println(num+"이 되기 위해서는? "+str);
		
		
		
		
		
		
		
		

	}

}
