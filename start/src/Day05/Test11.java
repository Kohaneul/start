package Day05;

public class Test11 {

	public static void main(String[] args) {
		// 구구단 5단 출력하는데 곱이 5인 경우는 제외하고 출력하세요.
		
		
		int dan = 5;
		for(int i = 0; i<9;i++) {
			int gop = (i+1);
			
			if(gop==5) { 
				continue; //gop이 5이면 다음회차로(바로 증감식으로 보냄) 진행...
			}
			System.out.println(dan+"X"+(i+1)+"="+(dan*gop));
		}
		

	}

}
