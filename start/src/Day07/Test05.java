package Day07;

import java.util.Arrays;

/*
	5과목의 점수를 기억할 배열을 만들고
	과목 점수를 입력하고 
	총점도 배열의 마지막에 계산해서 입력하고
	총점과 평균을 구하고 출력하세요
	베열에 담긴 과목 점수도 같이 출력하세요.
*/


public class Test05 {

	public static void main(String[] args) {
	int[] arr = new int[6];
	int sum = 0;
	System.out.print("과목점수 : ");
	for(int i = 0; i<arr.length-1;i++) {
		arr[i] = (int)(Math.random()*(100-60+1))+60;
		sum+=arr[i];
		System.out.print(arr[i] + " ");
	}
	System.out.println();
	int no = arr.length-1;
	arr[no] = sum;
	double avg = arr[no]/(double)(no);
	System.out.println("총점 : "+arr[no]);
	System.out.println("평균 : "+avg);
	
	
	
	}

}
