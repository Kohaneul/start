package day12;

import java.util.Arrays;

public class Test00 {
		
	public Test00() {
		int no = 10;
		int[] arr = {1,2,3,4,5};
		
		
		setArr(arr);
		System.out.println("no :"+setAdd(no));
		System.out.println("arr :"+Arrays.toString(arr));
	}
	//no에 10을 더해서 no에 기억
	
	public int setAdd(int no) {
		int no1 = 0;
		no1 = no+10;
		return no1;
	}
	
	//arr 배열의 첫번째 방의 데이터에 10을 더해주는 기능
	public void setArr(int [] arr) {
		arr[0] = arr[0]+10;
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
	new Test00();

	}

}
