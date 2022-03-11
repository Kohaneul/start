package day10.sub;

import day10.*;

public class Sample01 {
	private int num1,num2,num3,num4;	// ==>  은닉화(다른클래스에서 접근X)
	
	//day10.Test01의 멤버변수를 읽어서 위 변수에 셋팅하는 함수
	public void setNum() {
		//힙에 객체만들고
		Test01 t1 = new Test01();
		//new : heap에 올린다. t1에 heap의 주소를 기억시킨다.
		
//		num1 = t1.no1; //no1의 접근지정자가 private이기 떄문에 안된다.
//		num2 = t1.no2; //no2는 같은 패키지안의 클래스인 경우까지만 접근가능하므로 접근지정자가 생략되었으므로
						//접근할 수 없다.
//		num3 = t1.no3;	//no3 Test01을 상속받은 클래스거나 같은 패키지 내의 클래스안에서만 사용가능하므로
		num4 = t1.no4;	//no4는 모든 곳에서 사용가능하므로 접근 가능하다.
	}
	
}
