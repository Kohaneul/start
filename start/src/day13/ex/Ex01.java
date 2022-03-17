package day13.ex;

import java.util.Scanner;

/*
 	
 	String[] ar = {"123","456","789",....};
 	가 있는 경우
 	
 	이 배열이 기억하는 숫자형태의 문제열을 정수로 바꾼 데이터들의 합과 평균을 구하는
 	프로그램을 작성하시오
 	단, 발생할 수 있는 예외를 가정하여 모두 처리해주세요
 		1. 배열의 범위를 벗어나서 사용하는 경우
 		2. 숫자로 변환이 불가능한 경우..
 		3. 평균을 계산하는데 0으로 나누는 경우
 		4. 위의 세가지 이외의 경우
 		 
 */
	public class Ex01{
		double avg;
		int sum = 0;
		String[] str;
		Ex01(){
			
			try {
			Scanner sc = new Scanner(System.in);
			setting(sc);
			setIdx(sc);
			setInt();
			}
			catch(IndexOutOfBoundsException e) {
				System.out.println("배열범위초과");
				e.printStackTrace();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		public void setting(Scanner sc) {
			System.out.print("배열 길이 셋팅 : ");
			int length = sc.nextInt();
			str = new String[length];
			System.out.print("입력 : ");
			for(int i = 0; i<str.length;i++) 
			{
				str[i] = sc.next();
			}
		}
		
		public void setIdx(Scanner sc) {
			System.out.print("인덱스 입력 :");
			int idx = sc.nextInt();
			System.out.println("인덱스 : "+str[idx]);
		}
		
		int[] temp;
		public void setInt() throws Exception{
			temp = new int[str.length];
			try {
			for(int i = 0; i<temp.length;i++) {
			temp[i] = Integer.parseInt(str[i]);
			}
			sum = setTotal();
			avg = setAvg();
			System.out.println("합계 : "+sum+" 평균 : "+avg);
			}
			catch(Exception e) {
				throw new Ex01_02();
			}
		}
		
		public int setTotal() {
			for(int i = 0; i<temp.length;i++) {
				sum+=temp[i];
			}
			return sum;
		}
		public double setAvg() {
		return sum/temp.length;
		
		}
		
		
		
		
		
		
		
		
		
		
	public static void main(String[] args) {
	new Ex01();
	
	}

}
