package Day07;

import java.util.Arrays;

/*
  
  1~10까지 정수를 순서대로 배열에 기억시키고
  이 숫자를 랜덤하게 섞어서 출력되도록 하세요
  
  방법]
  	배열의 특정위치 2개를 꺼내서 데이터를 바꾸면 된다.
  	이 과정을 많이 하면 할수록 데이터가 섞이게 된다.
  	
  
 */
public class Test06 {

	public static void main(String[] args) {
		
	int[] num = new int[10];
	for(int i = 0; i<num.length;i++) {
		num[i] = i+1;
	}
	
	System.out.println(Arrays.toString(num));
	for(int i = 0; i<num.length;i++) {
		int ran1 = (int)(Math.random()*10);
		int ran2 = (int)(Math.random()*10);
		
		if(ran1==ran2) {
			i--;
			continue;
		}
		int temp = num[ran1];
		num[ran1] = num[ran2];
		num[ran2] = temp;
	}
	System.out.println(Arrays.toString(num));
		
		

		
	
	}
		
}
	
	
	
	



