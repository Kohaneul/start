package day14.ex.ex01;

/*
 문제 1번 ] 
 	원의 정보를 기억할 클래스를 제작하세요. 
 	가지는 정보는 rad, arround,area 를 가지고
 	기능은 변수에 접근할 수 있는 함수들..
 	그리고 반지름이 같으면 같은 원으로 처리해주는 기능의 
 	equals() 함수로 오버라이드하고 , 
 	이 클래스 타입의 변수를 출력하면 해당 원의 정보를 출력해주는 함수도 
 	오버라이드 해주세요 
 
 
 */
public class Ex01 {

	public Ex01() {
		Circle c1 = new Circle(10);
		Circle c2 = new Circle(22);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c1.equals(c2));

	}
	
	
	
	public static void main(String[] args) {
		new Ex01();
	}

}
