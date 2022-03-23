package day18;
public class Test12{
public Test12() {
	Jennie jn = new Jennie();
	Lisa ls = new Lisa();
	//New Born 상태가 되었다.
	
	//Runnable 상태로 전위
	jn.start();
	ls.start();
}

public static void main(String[] args) {
new Test12();

}

}

class Jennie extends Thread{
@Override
public void run() {
	for(int i = 0; i<1000;i++) {
		System.out.println("Jennie가 "+(i+1)+"번째 노래를 합니다.");
		/*
		 	한 곡을 노래했으니 다른 프로그램에게 양보하세요
		 	즉, Runnable 상태로 전위하세요.
		 */
		yield();	//두개가 동시에 runnable 상태가 되어서 우선순위 높은 사람이 먼저 실행됨.
		
	}
}
}
class Lisa extends Thread{
@Override
public void run() {
	for(int i = 0; i<1000;i++) {
		System.out.println("\t\tLisa가 "+(i+1)+"번째 노래를 합니다.");
		yield();
	}
}
}