package day03;
/*
 	문자열 데이터의 비교는
 		equals() 사용해서 비교해야 한다.
 		
 		형식] 
 			
 			문자열.equals(비교할 문자열)
 
 */


public class Test06 {
	public static void main(String[] args) {	
	String name1 = "홍길동";
	String name2 = new String("홍길동");
	
	//비교연산자
	boolean bool1 = name1 == name2; // 변수가 기억하는 주소를 비교.
	boolean bool2 = name1.equals(name2);
	System.out.println("name1 == name2 : "+ bool1); 
	//변수에 기억된 주소값.. name1 : literal pool 데이터 주소, name2 : heap 주소
	System.out.println("name.equals(name2) : "+bool2);
	
	boolean bool3 = name1 == name2;
	boolean bool4 = name1.equals(name2);
	System.out.println(bool3);
	System.out.println(bool4);
		
	}

}
