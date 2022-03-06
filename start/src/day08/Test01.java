package day08;
/*
 
 0~9 사이의 숫자를 100개 발생시켜서
 각각의 숫자가 몇번씩 발생했는지를 알아보자.
 
 방법]
 	각 숫자의 횟수를 기억할 배열을 만들고
 	각 숫자가 발생할떄마다 1씩 누적
 	
 */

import java.util.Arrays;

public class Test01 {


	public static void main(String[] args) {
	int[] array = new int[10];
	for(int i = 0; i<array.length;i++) {
		array[i] = i;
	}
	System.out.println(Arrays.toString(array));
	
	
	int[] cou = new int[10];
	
	for(int i = 0; i<100; i++) {
		int temp = (int)(Math.random()*10);
		cou[temp]+=1;
		
			
		}
	
	for(int i = 0; i<array.length;i++) {
		System.out.println(array[i]+" : "+cou[i]);
	}
	
			
		
		
	}
}