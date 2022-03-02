package Day05.ex;
/*
문제 14 ]
	다음 조건을 만족하는 숫자를 찾는 프로그램을 작성하세요.
	
	1. 4자리 숫자 abcd는 0이 들어있지 않고, 모두 다른 숫자이다.
	
	2. 첫번째 숫자(a)가 마지막 숫자(d)보다 2 큼
		a : 3 <=
			9 >=
		d : 1 <=
			7 >=
			
	3. 두번째 숫자(b)가 세번째 숫자(c)보다 크다.
		b>c ==> c+1부터 시작
		
	4. 4자리 숫자를 역순으로 하고 그 수와 4자리수를 합하면 16456이 된다.
		a	b	c	d
	+	d	c	b	a
		==>	16456	  
*/


public class Ex14 {

	public static void main(String[] args) {
	int a = 0;
	int b = 0;
	int c = 0;
	int d = 0;
	int temp = 0;
	int temp2 = 0;
	int temp3 = 0;
	int temp4 = 0;
	for(a = 3 ; a<10;a++) {
		for(d = 1; d<8;d++) {
			if(a==d+2) {
				temp =a;
				temp2 =d;
				
		}
	}
		
	}
	for(b = 1; b<10;b++) {
		for(c = 1;c<10;c++) {
			if(b>c) {
				temp3 = b;
				temp4 = c;
				
			}
		}
	}
	int result = temp*1000+temp3*100+temp4*10+temp2;
	int result2 = temp2*1000+temp4*100+temp3*10+temp;
	if(result+result2==16456) {
		System.out.println(result);
	}
	
}
}

		
		


