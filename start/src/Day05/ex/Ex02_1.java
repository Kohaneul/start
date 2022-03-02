package Day05.ex;
/*
Ex02_01 ]
	3 ~ 10 사이의 정수를 랜덤하게 발생시켜서
	그 정수를 길이로 하는 영어 단어를 랜덤하게 만드세요.
	단, 시작문자는 대문자로 하고 나머지는 소문자로 하세요.
*/



public class Ex02_1 {

	public static void main(String[] args) {
	int input = (int)((Math.random()*(10-3+1))+3);
	System.out.println("입력받은 정수 :"+input);
	
	int num = 0;
	int result = 'a'-'A';
	char ch = 'A';
	for(int i = 0; i<input;i++) 
	{
		num +=1;
		int temp = ch+(num-1);
		if(i>0) {
			temp = ch+(num-1)+result;
			
		}
		System.out.print((char)temp+" ");
	}
	
	}

}
