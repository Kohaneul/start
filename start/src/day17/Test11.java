package day17;

import java.io.*;

/*
  	블랙핑크 휘파람을 파일에 저장해보자.
  	
 */
public class Test11 {

	public Test11() {
		// 스트림준비
		// PrintStream 사용
		PrintStream ps = null;
		try {
			ps = new PrintStream("C:\\class\\java\\Git Repo\\start\\start\\src\\day17\\result\\휘파람.txt");
			ps.println("Make' em whistle like a missile bomb, bomb");
			ps.println("Every time I show up, blow up (Uh)");
			ps.println("Make' em whistle like a missile bomb, bomb");
			ps.println("Every time I show up, blow up (Uh)");
			
			ps.flush();
			/* 내부적으로 Buffered의 기능을 가지고 있으므로 
				반드시 내보내기가 끝나면 버퍼를 비워줘야 한다.
				*/
			System.out.println("******* 휘파람 저장 성공 ******");
		}
		catch(Exception e){
			
		}
		finally {
			try {
				ps.close();
			}
			catch(Exception e) {
				
			}
		}
	}

	public static void main(String[] args) {
	new Test11();

	}

}
