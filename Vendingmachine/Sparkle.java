package Vendingmachine;
//자판기 음료 중 탄산음료(코카콜라,펩시,웰치스)의 가격과 이름 출력
public class Sparkle {
	String name;
	int price;
	Sparkle(int price){
		this.price = price;
		
	}
	public String toString() {
		return "탄산";
	}
}

class Cocacola extends Sparkle{
	
	Cocacola(){
		super(1500);
	}
	public String toString() {
		name = "코카콜라";
		return  name;
	}
}

class Pepsicola extends Sparkle{
	
	Pepsicola(){
		super(1450);
	}
	public String toString() {
		name = "펩시콜라";
		return name;
	}
}

class Welches extends Sparkle{
	
	Welches(){
		super(1380);
	}
	public String toString() {
		name = "웰치스";
		return name;
	}
}
