package day15.ex02;

import java.util.Comparator;

/*
	1 ~ 99 사이의 정수를 랜덤하게 발생시켜서 
	10개를 TreeSet에 입력한 후
	내림차순으로 정렬해서 출력하세요.
 */

public class Num implements Comparable{
	private int num;
	
	public Num(int num) {
		this.num = num;
	}
	public void setNum() {
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "입력받은 정수 : " + num;
	}

	@Override
	public int compareTo(Object o) {
		int result = 0;
		Num n = (Num)o;
		result = (num<n.getNum())?-1:1;
		
		return -result;
	}
	
	
	
	

}
