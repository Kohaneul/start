package day13;

public class Test05 {

	public Test05() {
	int no = 25;
	int result = 0;
	int i = -3;
	try {
		for(i = -3; i<=3;i++) {
			result = no/i;
			System.out.println(no+" / "+i+" = "+result);
		}
	}
	catch(Exception e)
	{
		result = no;
		System.out.println(no+" / "+i+" = "+result);
		
	}
	System.out.println("프로그램 실행 종료");
	}

	public static void main(String[] args) {
	new Test05();

	}

}
