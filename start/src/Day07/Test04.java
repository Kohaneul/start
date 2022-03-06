package Day07;

import java.util.Arrays;

/*
 	5과목의 점수를 기억할 배열을 만들고
 	과목 점수를 입력해서
 	총점과 평균을 구하고 출력하세요
 	베열에 담긴 점수도 같이 출력하세요.
 */



public class Test04 {

	public static void main(String[] args) {
	int[] subj = new int[5]; //기본데이터 => 자동초기화
	//과목점수를 랜덤하게 만들어서 입력
	for(int i = 0; i<subj.length;i++) {
		//랜덤하게 만든 정수를 각 과목 방에 입력
		subj[i] = (int)(Math.random()*(100-60+1)+60);
		/*
		 	int score = (int)(Math.random()*(100-60+1)+60;
		 	subj[i] = score
		 */
		
	}
	//총점을 계산한다.
	int total = 0;
	for(int i = 0; i<subj.length;i++)
	{
		int score = subj[i];
		
		//총점에 과목점수를 누적시킨다.
		// total = total+score;
		total+= score;
		
	}
	System.out.println(total);
	
	//평균을 구한다.
	double avg = total/(double)(subj.length);
	
	System.out.println("1. 각 과목 점수 : "+Arrays.toString(subj));
	System.out.println("2. 과목 총 점수 : " + total);
	System.out.println("3. 과목 평균 점수 : " + avg);
			}

}
