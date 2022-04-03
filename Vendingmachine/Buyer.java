package Vendingmachine;

import java.util.Scanner;

public class Buyer {
	int money,price;
	String name;
	Juice[] juices;
	Sparkle[] sparkles;
	Scanner sc;
	Vending v;
	
	public Buyer(String name) {
	this.name = name;
	this.money = 10000;
	System.out.println(name+"님 입장");
	v = new Vending();
	sc = new Scanner(System.in);
	buy(sc);
	}
	
	// 음료 구매(스캐너로 값을 입력받음)
	public void buy(Scanner sc) {
		
		while(true) {
		System.out.printf("********자판기********\n음료의 종류를 선택하세요(1.쥬스, 2.탄산)");
		int button = sc.nextInt();
		if(button == 1) {
			v.chooseJuice();
		}
		else if(button == 2){
			v.chooseSparkle();
		}
		else {
			System.out.println("잘못 선택하셨습니다.");
		}
		calculate();
		
		if(money<price) {
			System.out.println("잔돈부족으로 구매불가 \n프로그램 종료");
			break;
		}
		System.out.println();
		}
		
	}
	
	
	
	
	public void calculate() {
		
		price = v.price;
		if(money<price) {
			return;
		}
		else {
			money-= v.price;
			System.out.println(name+"님의 잔액은 [ "+money+" ] 입니다.");
		}
		
		
	}
	

	
	
}
