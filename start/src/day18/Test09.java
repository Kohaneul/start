package day18;

public class Test09 {
	/*
	 * Thread 프로그램을 실행해보자.
	 	1. 스레드 프로그램은 반드시 new Born 상태로 만들어야 한다.
	 		
	 		New Born 상태란?
	 		실행가능한 프로그램으로 만든다는 의미
	 		==> 자바에서는 new 시키는 것이다.
	 	*/
	Test09(){
	MyThread01 com1 = new MyThread01();	//new Born 상태
	MyThread02 com2 = new MyThread02();	//new Born 상태
	//두개의 스레드가 new Born 상태가 되었다.
	
	//이것을 실행하기 위해서는 Thread 프로그램이 Runnable 상태로 전위되면 된다.
	
	//New Born 상태의 스레드 프로그램을 Runnable 상태로 전위시키는 명령은 start() 명령이다.
	//
	com1.start();
	com2.start();
	System.out.println("==============생성자 쪽 종료=============");
	
}

public static void main(String[] args) {
	new Test09();
	System.out.println("<<<<<<<<<<<<<<<<<메인함수 종료>>>>>>>>>>>>>>>");
}

}

/*
	원래는 스레드 프로그램 역시 다른 파일에 클래스를 만들어야 하는데, 지금은 간단한 테스트이므로 
	하나의 클래스 내에서 만들도록 한다.
	두개의 스레드 프로그램을 만들어보자.
*/

class MyThread01 extends Thread{
// 이 클래스 내에는 변수나 다른 함수들을 만들 수 있겠지만,
// 여기서는 테스트만 해보도록 한다.
@Override
public void run() {
	//나는 이 프로그램에서 컴퓨터가 코딩을 1000개 하도록 하겠다.
	for(int i = 0; i<1000;i++) {
		System.out.println("### 컴퓨터1 이 코딩을 합니다! : "+(i+1)+"회차");
	}
}

}


class MyThread02 extends Thread{
@Override
public void run() {
	//컴퓨터2가 코딩을 1000번 한다.
	for(int i = 0; i<1000;i++) {
		System.out.println("\t\t\t*** 컴퓨터2 가 "+(i+1)+"번째 코딩을 합니다.");
	}
}
}

