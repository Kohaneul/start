package day11;

import java.util.Arrays;
import java.util.Scanner;

public class Test00_01 {
	int garo,sero,aera;
	
	public Test00_01() {
		Nemo[] nemo = new Nemo[5];
		//넘겨받은 배열에 사각형 채워주는 함수 호출
		setArr(nemo);
		//출력
		toPrint(nemo);
	}
	
	//만들어진 배열에 사각형 채워주는 함수 호출
	public void setArr(Nemo[] nemo) {
		//할일은 건네받은 배열의 길이만큼 먼저 네모객체 채워주고
		for(int i = 0; i<nemo.length;i++) 
		{
			nemo[i] = new Nemo((int)(Math.random()*21+5),(int)(Math.random()*21+5));
			
		}
	}
	public void toPrint(Nemo[] nemo) {
		for(int i = 0; i<nemo.length;i++) {
			Nemo n = nemo[i];
			int garo = n.getGaro();
			int sero = n.getSero();
			int area = n.getArea();
			System.out.printf("이 사각형은 가로가 %3d 이고 세로가 %3d 이고 넓이는 %4d 입니다.\n",garo,sero,area);
		}
	}
	
	
	public static void main(String[] args) {
	new Test00_01();

}
}
