package day12;

public class Test01 {
	public Test01() {
		Father f = new Son();
//		Son s = new Father();
		Father f2 = new Father();
//		Son s1 = (Son)f2;
		f.abc();
//		s1.abc(); 실행시 오류
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
	new Test01();
		
		
	}

}


class Father{
	void abc() {
		System.out.println("%%%%%%%%%father%%%%%%%%%%%%");
	}
	
}

class Son extends Father{
	
	void abc() {
		System.out.println("%%%%%%%%%Son%%%%%%%%%%%%");
	}
	
}