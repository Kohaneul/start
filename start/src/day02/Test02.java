package day02;

public class Test02 {
	public static void main(String[] args) {
		//문자열 변수를 만드는 방법
		
		//1. 데이터를 직접 입력해서 만드는 방법
		String name1 = "홍길동";
		//literal풀에 있는 값을 name1이라는 변수가 기억
		
		//2. 클래스를 new 시켜서 만드는 방법
		String name2 = new String("홍길동");
		//힙에 스트링 클래스를 복사해서 홍길동을 기억시킴...??????
		
		System.out.println("name1 : "+name1);	// literal Pool 주소 기억
		System.out.println("name2 : "+name2); 	// heap 영역 주소 기억
		System.out.println("name1 == name2 : "+(name1==name2));
		//name1 : literal Pool 주소값 =/= name2 : heap 영역 주소값
	}
}
