

/*
	Ex02 ]
		int[] coin = {10000, 5000, 1000, 500, 100, 50, 10, 1};
		을 준비하고
		
		79456원을 coin에 기억된 화폐단위로 지불하려고 할때 각각의 단위 몇장씩 필요한지
		배열에 기억시켜서
		배열의 내용을 출력하세요.
		
		출력 예 ]
			
			10000	: 7
			5000	: 1
			...
			1		: 6
 */
package Day07.ex;

public class Ex02 {

	public static void main(String[] args) {
	
	int[] coin = {10000, 5000, 1000, 500, 100, 50, 10, 1};
	int money = 79456;
	for(int i = 0; i<coin.length;i++) {
		int temp = money;
		temp = (temp/coin[i])%10;
		money -= temp*coin[i];
		
		
		System.out.println(coin[i]+" : "+temp);
		
	}
	

	}

}
