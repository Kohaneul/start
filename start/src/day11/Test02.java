package day11;

public class Test02 {
	public Test02() {
		//원 하나 만들어본다.
		
		for(int i = 0; i<5;i++) {
		Won c1 = new Won((int)(Math.random()*21+5));
		
		//c1의 둘레 계산
		int rad = c1.getRad();
		double arround = rad*2*Won.PI;
		
		double area = rad*rad*Won.PI;
		c1.setArround(arround);
		c1.setArea(area);
		System.out.printf("반지름이 %3d 이고 둘레가 %5.2f 이고 넓이가 %5.2f인 동그라미\n",rad,arround,area);
	}
	}
	
	public static void main(String[] args) {
	new Test02();

	}

}
