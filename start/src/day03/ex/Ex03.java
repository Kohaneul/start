package day03.ex;

public class Ex03 {
/*
  	84232원을 지불하려고 한다.
  	우리나라 화폐단위별로 이 금액을 지불하려면
  	각 단위가 몇개씩 필요한지 계산해서 출력하세요.
  	화폐단위 : 50000원 , 10000원, 5000원, 1000원, 500원, 100원, 50원, 10원,1원
  		       (필요없는것은 0개로 출력)
 */
	public static void main(String[] args) {
		int total = 84232;
		int tmp = total;
		
		
		int money_50000 = (int)total/50000;
		tmp %= 50000;
		int money_10000 = (int)tmp/10000;
		tmp %= 10000;
		int money_5000 = (int)tmp/5000;
		tmp %= 5000;
		int money_1000 = (int)tmp/1000;
		tmp %= 1000;
		int money_500 = (int)tmp/500;
		tmp %= 500;
		int money_100 = (int)tmp/100;
		tmp %= 100;
		int money_50 = (int)tmp/50;
		tmp %= 50;
		int money_10 = (int)tmp/10;
		tmp %= 10;
		
		System.out.printf("오만원권 : %s장\n",money_50000);
		System.out.printf("만원권 : %s장\n",money_10000);
		System.out.printf("오천원권 : %s장\n",money_5000);
		System.out.printf("천원권 : %s장\n",money_1000);
		System.out.printf("오백원 : %s개\n",money_500);
		System.out.printf("백원 : %s개\n",money_100);
		System.out.printf("오십원 : %s개\n",money_50);
		System.out.printf("십원 : %s개\n",money_10);
		System.out.printf("일원 : %s개\n",tmp);
		/*
		 
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
		
		
		*/
		
		
		
		
		
	}
}
