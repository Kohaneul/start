package Vendingmachine;
//���Ǳ� ���� �� ź������(��ī�ݶ�,���,��ġ��)�� ���ݰ� �̸� ���
public class Sparkle {
	String name;
	int price;
	Sparkle(int price){
		this.price = price;
		
	}
	public String toString() {
		return "ź��";
	}
}

class Cocacola extends Sparkle{
	
	Cocacola(){
		super(1500);
	}
	public String toString() {
		name = "��ī�ݶ�";
		return  name;
	}
}

class Pepsicola extends Sparkle{
	
	Pepsicola(){
		super(1450);
	}
	public String toString() {
		name = "����ݶ�";
		return name;
	}
}

class Welches extends Sparkle{
	
	Welches(){
		super(1380);
	}
	public String toString() {
		name = "��ġ��";
		return name;
	}
}
