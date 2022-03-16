package Day05.ex;
/*
문제 6 ]
	랜덤하게 정수를 컴퓨터가 만들어 내면
	그 수를 알아맞추는 게임을 만드세요.
	
	예 ]
		
		발생숫자 : 54
		
		사용자입력숫자 : 45
		
		==> "입력한 수가 더 작습니다."
		로 메세지 를 출력해서 사용자가 숫자를 알아맞추는 게임...
		
		횟수도 같이 출력되게 하세요.
		
		단, 입력횟수가 5번을 초과하는 순간 컴퓨터의 승리로 처리하고 
		프로그램이 종료되게 하세요.
*/

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		int i = 0;
		String str = "정수를 입력하시오";
		int com = (int)(Math.random()*100);
		Scanner sc = new Scanner(System.in);
		String result = "";
		
		while(true) {
			System.out.print(str);
			int input = sc.nextInt();
			
			
			if(input>com) {
					result = "["+(i+1)+"] 컴퓨터 수보다 큽니다.";	
				}
			else if(input<com) {
					result = "["+(i+1)+"] 컴퓨터 수보다 작습니다.";
				}
			else 
			{
				result = "["+(i+1)+"]정답!";
				break;
			}
		
			if(i==5) {
				
				break;
			}
			i++;
			System.out.println(result);
			
		}
		
		System.out.println(result +"[5] 종료 컴퓨터 승리");
	}

		
	}

	

