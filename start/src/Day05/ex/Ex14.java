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
		int a,b,c,d = 0;
		int result = 0;
		for(int i = 1000; i<9999;i++) {
			a  = (i/1000)%10;
			b  = (i/100)%10;
			c  = (i/10)%10;
			d  = i%10;

			if(a!=0&&b!=0&&c!=0&&d!=0 && a!=b &&b!=c&&c!=d &&a!=d&& b!=d) {
				if(a==d+2 && b>c) {
					int tmp = a*1000+b*100+c*10+d;
					int tmp1 = d*1000+c*100+b*10+a;
					if(tmp+tmp1==16456) {
						result =  a*1000+b*100+c*10+d;
					}
				}
			}
			
		}
		System.out.println(result);
		
		
		
}
}

		
		


