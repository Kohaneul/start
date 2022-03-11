package day11;

/*
	 삼각형 클래스와 사각형 클래스를 각각 객체로 만들어서
	 내용을 출력해보자
 */

import static java.lang.Math.*; //static import

public class Test04 {
	public Test04() {
		Samgak sam = new Samgak((int)(random()*21+5),(int)(random()*21+5));
		Sagak nemo = new Sagak((int)(random()*21+5),(int)(random()*21+5));
//		System.out.printf("밑변이 %3d 이고 높이가 %3d 이고 넓이가 %6.2f인 삼각형\n",sam.getWidth(),sam.getHeight(),sam.getArea());
//		System.out.printf("밑변이 %3d 이고 높이가 %3d 이고 넓이가 %6.2f인 사각형\n",nemo.getWidth(),nemo.getHeight(),nemo.getArea());
	
		Figure f2 = nemo;
		Figure f1 = sam;
		//	==> 이 경우 삼각형, 사각형에 있는 getWidth(), getHeight() 함수는 Figure의 멤버로는 존재하지 않으므로
		//		이렇게 figure 타입의 변수에 삼각, 사각의 객체를 담는 경우는 
		//		두 함수를 호출할 수 없다.
		System.out.printf("넓이가 %6.2f인 사각형\n",f2.getArea());
		System.out.printf("넓이가 %6.2f인 삼각형\n",f1.getArea());

		//결론 ] 상위 클래스 타입의 변수에 하위 클래스 인스턴스를 담는 경우는 
		//		 상위 클래스에 없는 멤버는 사용할 수 없다. 
	}
	
	
	
	public static void main(String[] args) {
	new Test04();
		}

}
