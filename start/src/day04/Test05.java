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
	int num = (int)((Math.random()*26)+1);
	String str= "";
	if(num%2==0) {
		str = "짝수입니다";
	}
	else{
		 str = "홀수입니다";
	}
	System.out.print("랜덤으로 발생시킨 "+num+"\n\t==>"+str);
		
	}
	
	}


