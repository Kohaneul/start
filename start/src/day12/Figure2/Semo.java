package day12.Figure2;
/*
	 이 클래스는 Figure이라는 추상클래스를 상속받아서 만든 클래스이다
	 따라서 상위클래스가 가지고 있는 추상함수를 100% 모두 구현해야한다.
	 
 */



public class Semo extends Figure {
	
	public void toPrint(){
		System.out.printf("이 삼각형은 밑변이 %3d이고 높이가 %3d이고 면적이 %6.2f 입니다.\n",width,height,area);
	}
	
	
	
}