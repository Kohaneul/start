package Day05.ex;
/*
	Ex02]
	Ex02 ]
		'A' 부터 문자를 10개를 만들어서 출력하세요. 
	
	
 */


public class Ex02 {

	public static void main(String[] args) {
	char ch = 'A'-1;
	int num = 10;
	
	for(int i = 0; i<num;i++) {
		ch+=1;
		System.out.println((i+1)+"번째 : "+ch);
	}
	

	}

}
