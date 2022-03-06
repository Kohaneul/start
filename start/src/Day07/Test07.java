package Day07;

import java.util.Arrays;

/*
 10개의 정수를 랜덤하게 발생시켜서 기억하는 배열을 만들고
 기억된 수중 가장 큰 수를 알아내는 프로그램을 작성하시오.
  
  
 */


public class Test07 {

	public static void main(String[] args) {
	int max = 0;
	int[] arr = new int[10];
	
	

	loop:
	for(int i = 0; i<arr.length;i++) {
		arr[i] = (int)(Math.random()*10)+1;
		
		for(int j = 0; j<i;j++) {
			
		
			if(arr[i]==arr[j]) {
				i--;
				continue loop;
			}
		}
			if(max<arr[i]) {
			max = arr[i];
			
		}
	}
	
	System.out.println(Arrays.toString(arr));
	System.out.println(max);
}
}

