package Day05.ex;
/*
1 부터 정수를 더해갔을때 그합이 5000을 초과하는 수는 몇부터인지 출력하세요.

힌트 ]
	처음 합이 5000이 넘는 순간 반복문을 종료한다.
*/



public class Ex01_1 {

	public static void main(String[] args) {
	int sum = 0;
	int result = 0;
	for(int i = 0;;i++) {
		sum+=i;
		
		if(sum>5000) {
			System.out.println(i);
			break;
		}
	}
	
		
		
	}
}
