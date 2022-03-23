package day18;


/*
 	Runnable 인터페이스를 구현한 Thread 프로그램을 만들어보자.
 	
 */

public class Test10 {

	public Test10() {
		//Runnable 인터페이스르 구현한 스레드 프로그램을 실행하는 방법은
		//1. 먼저 new 시킨다.
		Student stud = new Student();
		Teacher teac = new Teacher();
		//아직 두 프로그램은 new Born 상태가 아님.
		
		//2. New Born 상태로 만들어줘야 한다.
		Thread t1 = new Thread(stud);
		Thread t2 = new Thread(teac);
		
		//이제서야 두 프로그램이 New Born 상태가 된다.
		//Runnable 상태로 전위시킨다.
		t1.start();
		t2.start();
	}

	public static void main(String[] args) {
	new Test10();

	}

}

class Student implements Runnable{
	
	@Override
	public void run() {
		quest();
	}
	public void quest() {
		for(int i = 0; i<1000;i++) {
			System.out.println("*** io 학생이 "+(i+1)+"번째 질문을 합니다.");
		}
	}

}
class Teacher implements Runnable{
	
	@Override
	public void run() {
		answer();
	}
	public void answer() {
		for(int i = 0; i<1000;i++) {
			System.out.println("\t\t*** io 선생님이 "+(i+1)+"번째 대답을 합니다.");
		}
	}
}
