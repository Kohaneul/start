package day12.Figure;


		//랜덤하게 3~5까지 정수를 발생시켜서 3이 나오면 삼각형
		//4가 나오면 사각형
		//5가 나오면 원의 형태로 
		//10개의 도형을 만들어서
		//하나의 변수로 관리하고
		//각 도형의 내용을 출력하세요
		
public class Study01 {
	Figure[] fig;
	public Study01() {
		setRand();
	
		Print();
		
	}
	
	
	public int setting() {
		return (int)(Math.random()*3+3);
	}
	
	public void setRand() {
		fig = new Figure[10];
		for(int i = 0; i<fig.length;i++) {
			int no = setting();
			switch(no) {
			case 3:
				fig[i] = new Semo((int)(Math.random()*21+10),(int)(Math.random()*21+10));
				break;
			case 4:
				fig[i] = new Nemo((int)(Math.random()*21+10),(int)(Math.random()*21+10));
				break;
			case 5:
				fig[i] = new Dongl((int)(Math.random()*21+10));
				break;
			}
		}
		
	}
	
	
	public void Print() {
		for(Figure f : fig) {
			f.toPrint();
		}
	}
	
	
	
	
	public static void main(String[] args) {
	new Study01();
		

	}

}
