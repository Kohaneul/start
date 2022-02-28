package Day05.ex;
/*
문제 14 ]
	다음 조건을 만족하는 숫자를 찾는 프로그램을 작성하세요.
	
	1. 4자리 숫자 abcd는 0이 들어있지 않고, 모두 다른 숫자이다.
	2. 첫번째 숫자(a)가 마지막 숫자(d)보다 2 큼
	3. 두번째 숫자(b)가 세번째 숫자(c)보다 크다.
	4. 4자리 숫자를 역순으로 하고 그 수와 4자리수를 합하면 16456이 된다.
*/


public class Ex14 {

	public static void main(String[] args) {
	for(int i = 1000; i<10000;i++) {
		int a = (i/1000)%10;
		int b = (i/100)%10;
		int c = (i/10)%10;
		int d = i%10;
		String str = a+""+b+""+c+""+d;
		String str2 = d+""+c+""+b+""+a;
		int result = Integer.parseInt(str);
		int result2 = Integer.parseInt(str2);
		
		if(a!=0&&b!=0&&c!=0&&d!=0) {
			if(a!=b&&a!=c&&a!=d&&b!=c&&b!=d&&c!=d) {
		if(a==d+2 && b>c && result+result2==16456) {
			System.out.println(result);
		}
		}
	
		}
	}
	
	}
}

		
		


