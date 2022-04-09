package jdbc.FormatTest;
import java.text.*;

public class Test03 {

	public Test03() {
	/*
	 	ChoiceFormat을 만들때 limits와 Format을 하나로 만들 수 있다.
	 	형식 ] 60#D : 60보다 작거나 같으면 D (# : <= 의 의미)
	 		   70<C : 70보다 작으면 C
	 		   
	 */	
		 String pattern = "0#F|60#D|70#C|80#B|90<A";
		//0#F ==> 0보다 크거나 같은 경우의 의미이다
		 ChoiceFormat form = new ChoiceFormat(pattern);
		 
		 int score = 90;
		 String grade = form.format(score);
		 System.out.println("점수 : "+score);
		 System.out.println("학점 : "+grade);
	}

	public static void main(String[] args) {
	new Test03();

	}

}
