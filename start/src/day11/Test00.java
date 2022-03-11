package day11;

import java.util.Arrays;
import java.util.Scanner;

public class Test00 {
	int garo,sero,area;
	Nemo nemo[];
	
	Test00(){
		Nemo[] nemo = new Nemo[5];
		//가로세로 셋팅.
		for(int i = 0; i<nemo.length;i++) {
			int garo = (int)(Math.random()*21+5);
			int sero = (int)(Math.random()*21+5);
			
			Nemo n = new Nemo(garo, sero);
			//배열에 만들어진 사각형 채움
			nemo[i] = n;
			/*
			 =  nemo[i] = new Nemo((int)(Math.random()*21+5),(int)(Math.random()*21+5));
			 = nemo[i] = new Nemo(garo,sero);
			 */
		}
		
		
		//출력
		for(int i = 0; i<nemo.length;i++) {
			Nemo n = nemo[i];
			int garo = n.getGaro();
			int sero = n.getSero();
			int area = n.getArea();
			System.out.printf("이 사각형은 가로가 %3d 이고 세로가 %3d 이고 넓이는 %4d 입니다.\n",garo,sero,area);
			
		}
		
		
	}

	
	
	
	
	public static void main(String[] args) {
	new Test00();
	}

}
