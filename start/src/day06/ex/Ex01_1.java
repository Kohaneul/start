package day06.ex;


/*
 	
 	보너스 ]
 		3 ~ 100 사이의 숫자 중에서 소수만 출력하시오
 
 */


public class Ex01_1 {

	public static void main(String[] args) {
	int temp = 0;
	int count = 0;
	String str  = "";
	int i = 0;
	int j = 0;
	for(i = 3; i<=100;i++) {

		for(j = 1; j<=i;j++) {
			if(i%j==0) {count++;}
		}
		if(count<3) {
			System.out.print(i+" ");
		}
	
		count = 0;
	}
	


	
	}

}
