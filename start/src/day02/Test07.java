package day02;

public class Test07 {
	public static void main(String[] args) {
		/*
		  타입이 다른 두 데이터의 연산의 결과는 항상 큰 타입 쪽으로 자동형변환이 된다. 
		  3.14(double)+10(int) => 13.14(double)
		 */
		
		double no = 3.14+10;	//연산결과 : double 형 변수에 담아야 한다.
		
		//'a'의 다섯번째 이후 문자를 출력하세요
				
		char ch = 'a';  //ch : 2byte
		
		int num = ch+5; //int : 4byte
		
		char ch1 = (char)num;
		System.out.println("'a'보다 5번째 이후 문자 : "+ch1);
		
		
	}
}
