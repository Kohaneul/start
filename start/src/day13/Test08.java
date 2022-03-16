package day13;

public class Test08 {

	public Test08() {
	System.out.println("1. abc() 함수 호출!");
		abc();	
		
		System.out.println("2. abc() 함수 종료 직후!");
	}
	
	public void abc() {
		int no1 = 25;
		int no2 = 0;
		int result = 0;
		
		try {
			result = no1 / no2;
		}
		catch(Exception e)
		{
			System.out.println("예외 발생...!");
			return; //실행중인 함수가 있으면 종료, 반환값이 있으면 돌려주고 종료
		}
		// 이 경우는 finally 블럭을 실행한 후 바로 이 함수 실행을 종료한다.
		finally {
			System.out.println("##### 여기는 finally 블럭...!");
		}
	}

	public static void main(String[] args) {
		new Test08();
	}

}
