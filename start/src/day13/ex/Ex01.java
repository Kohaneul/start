package day13.ex;
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

import java.util.Scanner;
	public class Ex01{
	String[] ar;
	Ex01(){
	Scanner sc = new Scanner(System.in);
	setArr(sc);
	setIdx(sc);
	try {
	setNum();}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	}
	//배열형셩
	
	public void setArr(Scanner sc){
	System.out.print("배열을 형성할 길이 입력 : ");
	int length = sc.nextInt();
	ar = new String[length];
	for(int i=0; i<ar.length;i++) {
		ar[i] = sc.next();
	}
	}
	
	public void setIdx(Scanner sc){
		System.out.print("인덱스 입력 : ");
		int idx= sc.nextInt();
		try {
			System.out.println(idx+" 번쨰 인덱스: "+ar[idx]);
		}
		catch(IndexOutOfBoundsException e) 
		{
			System.out.println("배열 범위 초과");
			return;
		}
	}
	
	int[] ar2;
	int sum = 0;
	//정수 변경
	public void setNum() throws Exception{
		ar2 = new int[ar.length];
		try {
		for(int i = 0; i<ar.length;i++) {
			ar2[i] = Integer.parseInt(ar[i]);
			}
			getAdd();
			int avg = getAvg();
			System.out.println("배열의 합 : "+sum+"/ 평균 : "+avg);
			
		
		}
		catch(Exception e) {
			throw new Ex01_02();
		}
	}
	
	public int getAdd() {
		sum= 0;
		for(int i = 0; i<ar.length;i++) {
			sum+=ar2[i];
		}
		return sum;
	}
	public int getAvg() {
		return sum/ar2.length;
	}
		
		
		
		
	public static void main(String[] args) {
	new Ex01();
	
	}

}
