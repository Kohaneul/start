package day13.test;
/*
 	강제 예외 던지기
 	==> 자바는 예외로 인정하지 않지만, 프로그램 목적상 예외로 처리해야하는 경우 처리하는방법
 	
 */
import java.util.*;
public class Test14 {
	
	/*
	 	사용자가 나이를 입력하면 입력된 나이를 출력하는 프로그램을 작성하세요
	 	단, 나이를 음수로 입력하면 강제로 예외가 발생되게 하세요
	 */

	
	Test14(){
	try {
		Scanner sc = new Scanner(System.in);
		setAge(sc);
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	
	
	}
	public void setAge(Scanner sc) throws Exception{
		int age = 0;
		while(true) {
			System.out.print("나이를 입력 : ");
			try {
				age = sc.nextInt();
				break;
			}
			catch(Exception e){
				System.out.println("입력값이 잘못되었습니다.");
			}
		}
		if(age<0) {
			throw new MinusAge();
		}
		else
		{
			System.out.println("입력된 나이 : "+age);
		}
	}
	
	
	

	public static void main(String[] args) {
		new Test14();
	}

}
