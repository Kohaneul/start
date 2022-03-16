package day09.ex;

import java.util.Scanner;

/*
문제 4 ]
	1차원 배열에 정수 10개를 입력한 후
	합계와 평균을 구해주는 프로그램을 작성하세요.
	
	배열에 정수를 랜덤하게 채워주는 함수
	합계를 계산해주는 함수
	평균을 계산해주는 함수
	출력해주는 함수
	
*/


public class Ex04 {
	int[] array;
	int sum;
	double avg;
	public Ex04() {
	array = setArr();
	toPrint();
	}
	public int[] setArr() {
		array = new int[10];
		for(int i = 0; i<array.length;i++) {
			array[i] = (int)(Math.random()*21+10);
		}
		return array;
		
	}
	
	public int getSum() {
		sum = 0;
		for(int i = 0; i<array.length;i++) {
			sum +=array[i];
		}
		return sum;
	}
	public double getAvg() {
		avg = getSum()/array.length;
		return avg;
	}
	public void toPrint() {
		String str = "";
		for(int i = 0; i<array.length;i++) {
		str += array[i]+" ";	
		}
		System.out.println("랜덤한 임의의 10개의 수  \n"+str);
		System.out.println("\t합계 : "+getSum()+" 평균 : "+getAvg());
	}
	
	
	public static void main(String[] args) {
	new Ex04();}
	
	
	
	
	

	

}
