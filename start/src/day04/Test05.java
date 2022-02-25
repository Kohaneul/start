package day04;
/*
	정수를 1부터 25사이의 정수를 랜덤하게 발생시켜서 
	그 숫자가 짝수인지, 홀수인지를 판별 후 출력하세요
	
	참고 ] 
		특정 범위의 랜덤한 숫자 발생시키는 방법 
		Math 클래스 내에 0이상 ~ 1미만 실수를 발생시켜주는 함수
		0 <=Math.random() < 1 x T
		0 <=Math.random() < T
	
	형식 ]
		a ~ b 사이의 랜덤한 정수(b가 a보다 큰 수라고 가정)
		범위 : 작은수<=a<큰수 
		(int)Math.random()*(큰수-작은수+1)+작은수
		
*/



public class Test05 {
	public static void main(String[] args) {
	//	할일 
		
	// 랜덤하게 숫자 만들고
	int no = (int)(Math.random()*26);
	
	//숫자 판별
	String result = (no%2==0) ? "짝수":"홀수";
	//()?():(); 형식 만들고 채워나가기
	//출력
	 
	
	System.out.println("랜덤한 숫자 "+no+" "+result);
	}
	
	}


