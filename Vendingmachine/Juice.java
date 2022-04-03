package Vendingmachine;

//자판기 음료 중 쥬스음료(포도,오렌지쥬스)의 가격과 이름 출력
	public class Juice{
		String name;
		int price;
		Juice(int price){
			this.price = price;
		}
		public String toString(){
			return "쥬스";
		}
	}

	class OrangeJuice extends Juice{
		
		OrangeJuice(){
			super(1400);
		}
		
		@Override
		public String toString() {
			name = "오렌지쥬스";
			return name;
		}
	}

	class GrapeJuice extends Juice{
		
		GrapeJuice(){
			super(1230);
		}
		@Override
		public String toString() {
			name = "포도쥬스";
			return name;
		}
	}




