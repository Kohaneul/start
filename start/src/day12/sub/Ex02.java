package day12.sub;
/*
 	랜더하게 3~5 정수를 발생시켜서
 	3이 나오면 삼각형
 	4가 나오면 사각형
 	5가 나오면 원
 	의 형태로 10의 도형을 만들어서
 	하나의 변수로 관리하고 
 	각 도형의 내용을 출력하세요.
 	
	단, 인터페이스 구현은 무명 내부 클래스로 

 */



public class Ex02 {
	Figure[] f;
	Ex02(){
		setting();
		toPrint();
		
		
	}
	
	public int getRnd() {
		return (int)(Math.random()*3+3);
	}
	
	public void setting() {
		f = new Figure[10];
		
		for(int i = 0; i<f.length;i++) {
			int no = getRnd();
			
			
			switch (no) {
			case 3:
				f[i] = new Dongl((int)(Math.random()*21+10));
				break;
			case 4:
				f[i] = new Semo((int)(Math.random()*21+10),(int)(Math.random()*21+10));
				break;
			case 5:
				f[i] = new Nemo((int)(Math.random()*21+10),(int)(Math.random()*21+10));
				break;
			}
			
		}
	}
	
	public void toPrint() {
		for(Figure n : f) {
			n.toPrint();
		}
		
		
		
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
	new Ex02();

	}

}
