package Vendingmachine;

//���Ǳ� ���� �� �꽺����(����,�������꽺)�� ���ݰ� �̸� ���
	public class Juice{
		String name;
		int price;
		Juice(int price){
			this.price = price;
		}
		public String toString(){
			return "�꽺";
		}
	}

	class OrangeJuice extends Juice{
		
		OrangeJuice(){
			super(1400);
		}
		
		@Override
		public String toString() {
			name = "�������꽺";
			return name;
		}
	}

	class GrapeJuice extends Juice{
		
		GrapeJuice(){
			super(1230);
		}
		@Override
		public String toString() {
			name = "�����꽺";
			return name;
		}
	}




