package day09.ex;
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
	public Ex04() {
		int[] score = setNum();
		int add = calAdd(score);
		double avg = calAvg(score);
		toPrint(score);
	}
	public static void main(String[] args) {
	new Ex04();}
	
	
	//랜덤하게 채워줌
	public int[] setNum() {
		int[] no = new int[10];
		for(int i = 0; i<no.length;i++) {
			no[i] = (int)(Math.random()*41+60);
			
		}
		return no;
	}
	
	//합계 계산
	
	public int calAdd(int[] num) {
		int sum =0;
		for(int i= 0; i<num.length;i++) {
			sum+= num[i];
		}
		return sum;
	}
	
	//평균 계산
	
		public double calAvg(int[] num) {
			double result = 0.0;
			result = calAdd(num)/(double)num.length;
			return result;
			
		}
		
		public void toPrint(int[] num) {
			int resultAdd = calAdd(num);
			double resultAvg = calAvg(num);
			String str = "";
			
			
			for(int i = 0; i<num.length;i++) {
				str += num[i]+" ";
				
			}
			System.out.println("입력한 수 : "+str);
			System.out.printf("\t - 합계 : %s\n",resultAdd);
			System.out.printf("\t - 평균 : %s\n ",resultAvg);
		}
	
	

	

}
