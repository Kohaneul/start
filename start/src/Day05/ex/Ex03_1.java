package Day05.ex;
/*
문제 03_01 ]
	
	0 ~ 255 사이의 정수를 10개를 랜덤하게 만들고
	그 정수를 아스키 코드값으로 하는 문자열을 만들어서
	만들어진 문자열의 문자를 하나씩 추출해서
	추출한 문자가 
		대문자인지 소문자인지 특수문자인지를
	출력하는 프로그램을 작성하세요.
	
	참고 ]
		문자열의 길이를 알아내는 방법
			
			int 변수 = 문자열.length();
*/


public class Ex03_1 {

	public static void main(String[] args) {
	

	int A = 'A';//24??
	int B = 'Z';
	int C = 'a';//48
	int D = 'z';
	System.out.println(A+"~"+B+" "+C+"~"+D);
	String str = "특수문자 입니다.";
	int ran = 0;
	char ch = ' ';
	//A<ran<B
	for(int i = 0; i<10;i++) {
		ran = (int)((Math.random()*(255-0+1)));
		ch = (char)ran;
		
		if(ran>=A &&ran<=B) {
			str = "대문자 입니다.";
			
		}
		else if(ran>=C&&ran<=D) {
		
			str = "소문자 입니다.";
		}
		else {
			
			str = "특수문자 입니다.";
		}
		System.out.print((i+1)+"번째 : "+ch+" : "+str+"\n");
	

	}

	}
}
