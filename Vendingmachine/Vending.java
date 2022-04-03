package Vendingmachine;

import java.util.Scanner;

// 자판기에 음료(쥬스, 탄산음료)를 셋팅해주는 클래스
// 물건을 구매할떄마다 자판기 수익은 +

public class Vending {
	int money,price,income;
	String name;
	Juice[] juices;
	Sparkle[] sparkles;
	Scanner sc;
	Buyer b;
	Vending(){
		sc = new Scanner(System.in);
	}
	
	
	public void chooseJuice() {
		System.out.printf("\t[쥬스]를 선택하셨습니다..\n해당 품목중 선택 (1.오렌지쥬스 , 2. 포도쥬스)");
		
		juices = new Juice[]{new OrangeJuice(), new GrapeJuice()};
		int num = sc.nextInt();
		num = num-1;
			if(juices[num] instanceof OrangeJuice) {
				OrangeJuice orange = (OrangeJuice)juices[num];
				
			}
			else if(juices[num] instanceof GrapeJuice){
				GrapeJuice grape = (GrapeJuice)juices[num];
			}
			
			name = juices[num].toString();
			price = juices[num].price;
			bought();
			setIncome();

			
		}
		
		
	
	public void chooseSparkle() {
		System.out.printf("\t[탄산음료] 를 선택하셨습니다.\n해당 품목중 선택( 1.코카콜라 , 2. 펩시콜라, 3. 웰치스)");
		sparkles = new Sparkle[]{new Cocacola(),new Pepsicola(),new Welches()};
		int num = sc.nextInt();
		num = num-1;
		if(sparkles[num] instanceof Cocacola) {
			Cocacola coca = (Cocacola)sparkles[num];}
		else if(sparkles[num] instanceof Pepsicola) {
				Pepsicola pepsi = (Pepsicola)sparkles[num];
			}
		else if(sparkles[num] instanceof Welches) {
			Welches welches = (Welches)sparkles[num];
			}
	
		name = sparkles[num].toString();
		price = sparkles[num].price;
		bought();
		
		setIncome();
		System.out.println();
		}
	
		public void bought() {
			System.out.println("\t["+name+" : "+price+"] 원 구매");
		}
		
		public void setIncome() {
			
			income += price;
			System.out.println("\t자판기 수익 : "+income);
			System.out.println();
		}
	
	}

