package Vendingmachine;

import java.util.Scanner;

// ���Ǳ⿡ ����(�꽺, ź������)�� �������ִ� Ŭ����
// ������ �����ҋ����� ���Ǳ� ������ +

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
		System.out.printf("\t[�꽺]�� �����ϼ̽��ϴ�..\n�ش� ǰ���� ���� (1.�������꽺 , 2. �����꽺)");
		
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
		System.out.printf("\t[ź������] �� �����ϼ̽��ϴ�.\n�ش� ǰ���� ����( 1.��ī�ݶ� , 2. ����ݶ�, 3. ��ġ��)");
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
			System.out.println("\t["+name+" : "+price+"] �� ����");
		}
		
		public void setIncome() {
			
			income += price;
			System.out.println("\t���Ǳ� ���� : "+income);
			System.out.println();
		}
	
	}

