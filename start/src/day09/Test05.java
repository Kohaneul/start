package day09;

/*
 	두 수를 입력하면 더해서 반환해주는 기능의 함수를 만들어서 실행하세요.
 */

import java.util.Arrays;

public class Test05 {
	Test05(){
		int num = set();
		int num2= set();
		int result = add(num,num2);
		toPrint(num,num2,result);
	}

	
	
	
	
	public static void main(String[] args) {
	new Test05();}
	
	//임의의 수 설정
	public int set() 
	{
		int no =0;
		no = (int)(Math.random()*100+1);
		return no;
	}
	
	
	//더하기
	public int add(int no1,int no2) {
		int result = 0;
		result = no1+no2;
		return result;
	}
	
	//출력
	public void toPrint(int no1, int no2, int result) {
		System.out.println("입력받은 두 수 : "+no1+", "+no2);
		System.out.println(no1+" + " +no2+" = "+result);
		
	}
	
	
	
	
}
	


	




