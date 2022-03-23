package day18;

public class Test13 {
	Test13(){
		Student11 stud = new Student11();
		Teacher11 teac = new Teacher11();
		Thread st = new Thread(stud);
		Thread tc = new Thread(teac);
		st.start();
		tc.start();
	}
	
	
	public static void main(String[] args) {
	new Test13();
	}
}
class Student11 implements Runnable{
	@Override
	public void run() {
		for(int i = 1; i<=100;i++) {
			System.out.println("학생이 "+i+"번째 질문합니다.");
			try {
				Thread.sleep(10);
			}
			catch(Exception e) {
				
			}
		}
	}
}
class Teacher11 implements Runnable{
	@Override
	public void run() {
		for(int i = 1; i<=100;i++) {
			System.out.println("\t\t선생님이 "+i+"번째 대답합니다");
		}
		try {
			Thread.sleep(10);
		}
		catch(Exception e) {
			
		}
	}
}