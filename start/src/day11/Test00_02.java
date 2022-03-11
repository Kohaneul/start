package day11;

import java.util.Arrays;
import java.util.Scanner;

public class Test00_02 {
	Nemo[] sagak;
	
	public Test00_02() {
		//sagak 변수에 네모배열을 만들어서 네모객체가 채워지도록 해준다.
		setSagak();
		toPrint();
	}
	//sagak 셋팅해주는 함수
	public void setSagak() {
		//배열 만들고
		sagak = new Nemo[5]; //네모객체를 채울 수 있는 공간만 확보
		//배열에 네모객체 채워줘야 함.
		for(int i = 0; i<sagak.length;i++) {
			sagak[i] = new Nemo((int)(Math.random()*21+5),(int)(Math.random()*21+5));
		}
	}
	public void toPrint() {
		/*이 함수는 sagak 변수에 기억된 배열에 접근해서
		 	배열 안에 기억된 네모 객체를 하나씩 꺼내준다.
		 	꺼낸 네모객체의 정보를 출력해주는 기능의 함수.
		 */
		for(int i= 0; i<sagak.length;i++) {
			Nemo n = sagak[i];
			int sero = n.getSero();
			int garo = n.getGaro();
			int area = n.getArea();
			System.out.printf("가로 : %d, 세로 : %d ==> 넓이 : %d\n",sero,garo,area);
		}
		
		
		
	}
	
	public static void main(String[] args) {
	new Test00_02();

}
}
