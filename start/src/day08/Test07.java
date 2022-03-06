package day08;

/*
 	문자열 다섯개를 기억할 배열을 만들고 
 	보기를 입력해 놓고
 	문제와 같이 화면에 출력하고
 	
 	 사용자가 정답을 입력하도록 해서 
 	 답안이 맞았는지 확인하는 프로그램을 작성하세요
 
 */

import java.util.*;
public class Test07 {

	public static void main(String[] args) {
	String [] nct_Dream = new String[5];
	int result = 2;
	nct_Dream[0] = "해찬";
	nct_Dream[1] = "쟈니";
	nct_Dream[2] = "마크";
	nct_Dream[3] = "지성";
	nct_Dream[4] = "런쥔";
	
	
	Scanner sc = new Scanner(System.in);
	System.out.println("다음 중 엔시티드림의 멤버가 아닌 사람은?");
	for(int i = 0; i<nct_Dream.length;i++) {
		System.out.printf("\t%s] : %s\n", i+1,nct_Dream[i]);	
	}
	
	String str = "";
	while(true) {
		System.out.print("입력 : ");
		int input = sc.nextInt();
		
		if(input==result) {
			System.out.println("\t정답, 종료");
			break;
		}
		else {
			System.out.println("\t오답 , 다시");
			
			continue;
		}
		
		
	
	}
	
	

		
		
		
		
		
		
	/*	
	//문제 변수
	String quest = "다음 중 블랙핑크의 멤버가 아닌 사람은 ?";
	// 보기 변수
	String[] ans = new String[5];
	//보기 입력
	ans[0]  = "제니";
	ans[1]  = "둘리";
	ans[2]  = "지수";
	ans[3]  = "로제";
	ans[4]  = "리사";
	
	// 정답 위치값 변수 
	int dap = 1;	
	System.out.println();
	//문제가 완성이 되었다.
	System.out.println(quest);
	//보기출력
	for(int i = 0; i<ans.length;i++) {
		System.out.println("\t"+(i+1)+" ) "+ans[i]);
	}
	
	//입력도구 준비
	Scanner sc = new Scanner(System.in);
	//입력메세지
	System.out.print("선택번호 : " );
	//입력받아서 변수에 기억시킨다.
	int no = sc.nextInt()-1;
	
	//정답과 비교해서 결과 출력
	String result = no==dap ? "정답":"오답";
	
	//출력
	
	System.out.println("선택한 멤버"+ans[no]+"는 "+result+"입니다.");
	*/
	

	}

}
