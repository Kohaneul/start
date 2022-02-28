package Day05.ex;

/*
	문제 9 ]
		1 - 2 + 3 - 4 + 5 - 6 .... 했을 경우
		어디까지 계산하면 그 결과가 100을 넘기게 되는지 출력하세요.
 */

public class Ex09 {

	public static void main(String[] args) {
	int result = 0;
	int num1 = 0;
	int num2 = 0;
	int input = 0;
	//1 -2 3 -4 5 -6
	for(int i = 1;i<10000; i++) {
		if(i%2==1) {
			num1 += i;
			System.out.println(i+"홀수:"+num1+" ");
		}
		else if(i%2==0 &&i!=0)
		{
			num2 += i*(-1);
			System.out.println(i+"짝수:"+num2);
		}
		
		result = result+num1+num2;
		System.out.println("합:"+result);
		
		if(result>=100) {
			System.out.println("정답: "+i+"번째\n\t홀수 "+num1+"번째\n\t짝수 : "+num2+"번때 일떄 합은"+result);
			break;
		}
		}
		
		
		
		
	}

}

