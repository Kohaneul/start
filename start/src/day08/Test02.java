package day08;

import java.util.Arrays;

/*
 랜덤하게 다섯명의 학생의 점수를 만들어서 배열에 기억을 시키고
 각 학생의 석차도 기억할 배열을 만들어서 결과를 출력하시오
 
 */


public class Test02 {

	public static void main(String[] args) {
	int[] result = new int[5];
	int[] rank = new int[5];
	for(int i = 0; i<result.length;i++) {
		result[i] = (int)(Math.random()*(100-60+1)+60);
	}
	
	for(int i = 0; i<result.length;i++) {
		for(int j = 0; j<result.length;j++) {
			if(result[j]>result[i]) {
				rank[i]+=1;
			}
		}
		System.out.println(result[i]+" : "+(rank[i]+1)+"등");
	}
	for(int i = 0; i<result.length;i++) {
		char ch = (char)('A'+i);
		System.out.println(ch+"학생의 점수 : "+result[i] + " / 석차 : "+(rank[i]+1)+"등");
		
	}
	
	
	}

	}

