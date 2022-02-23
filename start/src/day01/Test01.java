package day01;

public class Test01 {
	
		
	
	
	public static void main(String[] args) { 
		int age = 27; //제니 나이 변수
				
		System.out.println("두번째 프로그램!"); // 처음에 문자열 출력
		System.out.println();
		
		Test01 t1 = new Test01();//new라는 명령어로 메모리에 올려짐 =>사용가능
		t1.abc();
		
		Test01.xyz();//Test01 클래스 에 있는 abc() 함수 실행하세요.
	}

		public void abc() {} //객체 생성 후 변수 통해서 메모리에 올려짐
		
		
		
		public static void xyz() {}//메모리에 먼저 올려짐
		
		
	}


