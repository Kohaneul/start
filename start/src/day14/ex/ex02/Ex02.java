package day14.ex.ex02;
/*
	 문제 2]
	 	사각형의 정보를 기억하는 클래스 Nemo를 제작하시오
	 	필요한 변수와 함수, 생성자는 필요한 만큼 추가하고
	 	단, 가로와 세로가 동시에 같은 사각형만 같은 사각형으로 처리가 되도록
	 	equals() 함수를 오버라이드 하세요
	 	이클래스 객체를 출력하면 내용이 출력되도록 toString()를 오버라이드 하세요.
 */

public class Ex02 {
	int width, height,area;
	public Ex02() {
		Nemo n1 = new Nemo(3,4);
		Nemo n2 = new Nemo(3,5);
		n1.equals(n2);
		System.out.println(n1);
		System.out.println(n2);
	}

	public static void main(String[] args) {
		new Ex02();
	}

}
