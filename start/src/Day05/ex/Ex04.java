package Day05.ex;

import java.util.Scanner;

/*
문제 4 ]
		전기요금을 계산해주는 프로그램을 작성하세요.
		
		전기요금표
			
						코드		기본요금		사용요금
			가정용		1			3800			245
			산업용		2			2400			157
			교육용		3			2900			169
			상업용		4			3200			174
			
			
		전기요금은 
			기본요금 + 사용량 * 사용요금
			
		사용자 코드와 사용량을 입력하면
		전기요금을 계산해서 출력해주는 프로그램을 작성하세요.
*/
public class Ex04 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("코드 입력 : ");
	int code = sc.nextInt();
	int fee = 0;
	int use_fee = 0;
	switch(code) {
	case 1:
		fee = 3800;
		use_fee = 245;
		break;
	
	case 2:
		fee = 2400;
		use_fee = 157;
		break;
	
	case 3:
	fee = 2900;
	use_fee = 169;
	break;

	default:
		fee = 3200;
		use_fee = 174;
	
}
	System.out.println("\t기본요금: "+fee);
	System.out.println("\t사용 요금: "+use_fee);
	System.out.println("\t전기요금 : "+code+fee*use_fee);
}
}
