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
	System.out.println(name+"�� ����");
	v = new Vending();
	sc = new Scanner(System.in);
	buy(sc);
	}
	
	// ���� ����(��ĳ�ʷ� ���� �Է¹���)
	public void buy(Scanner sc) {
		
		while(true) {
		System.out.printf("********���Ǳ�********\n������ ������ �����ϼ���(1.�꽺, 2.ź��)");
		int button = sc.nextInt();
		if(button == 1) {
			v.chooseJuice();
		}
		else if(button == 2){
			v.chooseSparkle();
		}
		else {
			System.out.println("�߸� �����ϼ̽��ϴ�.");
		}
		calculate();
		
		if(money<price) {
			System.out.println("�ܵ��������� ���źҰ� \n���α׷� ����");
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
			System.out.println(name+"���� �ܾ��� [ "+money+" ] �Դϴ�.");
		}
		
		
	}
	

	
	
}
