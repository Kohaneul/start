package day18;

public class Test15 {
	public Test15() {
		Com com = new Com();//New Born 상태
		com.start();
		for(int i = 0; i<10;i++) {
			System.out.println((i+1)+"\t\t*** 컴퓨터가 졸고 있습니다.");
			try {
				Thread.sleep(200);
				
			}
			catch(Exception e) {}
			com.setStart(false);
		}
		//stop() 함수는 deplecated 되어어있는 함수이므로 코드의 실행상 자연스럽게 종료가 되는 방향으로 
		// 스레드 프로그램을 종료시켜본다. 
		
	}

	public static void main(String[] args) {
		new Test15();

	}

}

class Com extends Thread{
	
	private boolean isStart=true;
	public boolean isStart() {
		return isStart;
	}

	public void setStart(boolean isStart) {
		this.isStart = isStart;
	}


	@Override
	public void run() {
		
		while(isStart) {
			
			System.out.println("***** 컴퓨터가 작업 합니다.");
			
			
			try {
				Thread.sleep(200);
			}
			catch(Exception e) {
				
			}
		}
	}
}
