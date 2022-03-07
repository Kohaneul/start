package day09;

public class Test01 {
	int no  =10;
	
	//abc
	static void abc(int no) {
		//int no ==> 매개변수 : 함수안에서만 쓸 수 있는 변수.(지역변수. for문안에 int i 변수와 비슷)
	}
	
	
	
	public static void main(String[] args) {
	abc(10); //--> abc 라는 함수. static은 먼저 메모리에 올려진다..
	//안에서 호출해야하는 함수는 이미 메모리 올려져있는 함수만 호출 가능하다.
		
	}

	
	void xyz() {
		int no = 10;
	
		abc(no);
		//1+"숫자 : "==>"숫자 : 1"
		add(10,"abc");
		
	}
	public String add(int no, String str) {
		String result = str+no;
		return result;
	}
	
}
