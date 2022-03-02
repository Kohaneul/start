package Day05.ex;

import java.util.*;

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
	//할일
	//1. 입력도구 준비.
	Scanner sc = new Scanner(System.in);
	while(true) {
	// 2. 용도 입력 메세지 출력.
	System.out.print(" * 사용용도 코드를 입력하세요\n\t가정용\t1\n\t산업용\t2\n\t교육용\t3\n\t상업용\t4\n\t종료\t0\n입력코드 : ");
	// 3. 입력받아서 변수 기억.
	int code = sc.nextInt();
	/*
	 	블럭킹 함수(Blocking Method)
	 		: 특정 상황이 될때까지 그 함수에서 실행을 멈추고 기다리는 함수
	 */
	
	// 입력할때까지 기다리는 함수 ex 웹사이트 접속할때..
	if(code==0) {
		System.out.println("프로그램을 종료합니다");
		//이 경우 프로그램 즉시 종료해야 하므로 break
		break;
	}
//	System.out.println("입력코드 : "+code);
	// 2-1 사용량 입력 메세지 출력.
	System.out.print("사용량 입력 : ");
	// 3-1 입력받아서 변수 기억한다.
	int sayong = sc.nextInt();
	//4. 용도에 맞게 계산해서 변수에 기억시키고. ==> 조건으로 분기처리
	String yd ="가정용";
	int money = 0;
	switch(code) {
		case 1:
			yd = "가정용";
			money = 3800+245*sayong;
		break;
		case 2:
			yd = "산업용";
			money = 3800+245*sayong;
		break;
		case 3:
			yd = "교육용";
			money = 2900+169*sayong;
			
		break;
		case 4:
			yd = "상업용";
			money = 3200+174*sayong;
		break;
	}
	System.out.println("입력된 코드는 "+yd+"용으로 사용량은 "+
			sayong+"이고\n\t총 전기요금은 : "+money+"원 입니다.");	
	System.out.println();
		
	}
	//5. 출력
		
	}
}

