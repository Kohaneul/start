package Day05.ex;
/*
 	1 ~ 10 까지의 합을 구해서 출력해주는 프로그램을 작성하세요.
	힌트 ]
		합은 결과값 변수로 만들어서 처리하세요.
 */



public class Ex01 {

	public static void main(String[] args) {
		
		int hap = 0;
		for(int i = 0; i<10; i++) {
			hap += (i+1);
		}
		System.out.println("1부터 10까지의 합은 : "+hap);
		
		int gop = 1;
		for(int i= 0; i<10; i++) {
			gop *= (i+1);
		}
		System.out.println("1부터 10까지의 곱은 : "+gop+"입니다.");
		}

}
