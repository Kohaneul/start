package Day05.ex;

/*
	문제 9 ]
		1 - 2 + 3 - 4 + 5 - 6 .... 했을 경우
		어디까지 계산하면 그 결과가 100을 넘기게 되는지 출력하세요.
    힌트]
    1+(-2)+3+(-4)....
    no*-1
 */

public class Ex09 {

	public static void main(String[] args) {
	int sum = 0;
	for(int i = 1;;i++) {
		int no = i;
		
		if(i%2==1) {
			no = i;
		}
		else if(i%2==0) {
			no = i*(-1);
		}
		sum+=no;
		if(sum >100) {
			System.out.println(i+"까지 더한 수의 값은"+sum+"입니다.");
			break;
		}
	}
		
		
		
	}

}

