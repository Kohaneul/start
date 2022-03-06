package Day07;
/*
 	정수 10 랜덤하게 만들어서 기억하는 배열을 만들고
 	기억된 정수를 내림차순 정렬해서 다시 기억시키고
 	배열의 데이터를 출력하세요
 
 */

import java.util.Arrays;

public class Test08 {

	public static void main(String[] args) {
	int[] ran = new int[10];
	
	loop:
	for(int i = 0; i<ran.length;i++) {
		ran[i] = (int)(Math.random()*10+1);
		for(int j = 0; j<i; j++) {
			if(ran[i]==ran[j]) {
				i--;
				continue loop;
			}
		}
	}
	System.out.println(Arrays.toString(ran));
	
	for(int i = 0; i<ran.length-1; i++) {
		for(int j = i+1; j<ran.length;j++) {
			if(ran[j]>ran[i]) {
				int temp = ran[j];
				ran[j] = ran[i];
				ran[i] = temp;
				
				
				
			}
		}
	}

	System.out.println(Arrays.toString(ran));
	
}
}

