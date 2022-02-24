package day03.ex;

public class Ex03 {
/*
  	84232원을 지불하려고 한다.
  	우리나라 화폐단위별로 이 금액을 지불하려면
  	각 단위가 몇개씩 필요한지 계산해서 출력하세요.
  	화폐단위 : 50000원 , 10000원, 5000원, 1000원, 500원, 100원, 50원, 10원,1원
  		       (필요없는것은 0개로 출력)
 */
		
	public static int MONEY = 84232;
	public static int sum = 0;
	public static void main(String[] args) {
		
		int money_50000 = 50000;
		int money_10000 = 10000;
		int money_5000 = 5000;
		int money_1000 = 1000;
		int money_500 = 500;
		int money_100 = 100;
		int money_50 = 50;
		int money_10 = 10;
		int money_1 = 1;
		
		int a = (MONEY/money_50000);
		System.out.println("5만원권 : "+ a);
		sum += a*money_50000;
		
		MONEY = MONEY-money_50000*a;
		int b = (MONEY/money_10000);
		System.out.println("1만원권 : "+ b);
		sum += b*money_10000;
		
		MONEY = MONEY-money_10000*b;
		int c = (MONEY/money_5000);
		System.out.println("5천원권 : "+ c);
		sum += c*money_5000;
		
		MONEY = MONEY-money_5000*c;
		int d = (MONEY/money_1000);
		System.out.println("천원권 : "+ d);
		sum += d*money_1000;
		
		MONEY = MONEY-money_1000*d;
		int f = (MONEY/money_500);
		System.out.println("오백원권 : "+ f);
		sum += f*money_500;
		
		MONEY = MONEY-money_500*f;
		int g = (MONEY/money_100);
		System.out.println("백원권 : "+ g);
		sum += g*money_100;
		
		
		MONEY = MONEY-money_100*g;
		int h = (MONEY/money_50);
		System.out.println("50원권 : "+ h);
		sum += h*money_50;
		
		
		MONEY = MONEY-money_50*h;
		int i = (MONEY/money_10);
		System.out.println("10원권 : "+ i);
		sum += i*money_10;
		
		MONEY = MONEY-money_10*i;
		int j = (MONEY/money_1);
		System.out.println("1원권 : "+ j);
		sum += j*money_1;
	
		System.out.println("총 합 : " +sum);
		
		
		
		
		
		int total = 84232;
		int tmp = total;
		
		int oman = tmp / 50000;
		tmp %= 50000;  //tmp를 50000으로 나눈 나머지를 tmp에 대입
		
		int man = tmp/10000;
		tmp %= 10000;
		
		int ochun = tmp/5000;
		tmp %= 5000;
		
		int chun = tmp/1000;
		tmp %= 1000;
		
		int obeak = tmp/500;
		tmp  %= 500;
		
		int back = tmp/100;
		tmp %= 100;
		
		int oship = tmp/50;
		tmp = tmp%50;
		
		int ship = tmp/10;
		tmp = tmp%10;
		
		//1
		int il = tmp%10;
		System.out.println("==========================");
		System.out.println("총금액 : "+total+"원은");
		System.out.println("오만원권 : "+oman+"장");
		System.out.println("만원권 : "+man+"장");
		System.out.println("오천원권 : "+ochun+"장");
		System.out.println("천원권 : "+chun+"장");
		System.out.println("오백원권 : "+obeak+"개");
		System.out.println("백원권 : "+back+"개");
		System.out.println("오십원권 : "+oship+"개");
		System.out.println("십원권 : "+ship+"개");
		System.out.println("일원권 : "+il+"개");
		
		
		
		
		
		
		
		
	}
}
