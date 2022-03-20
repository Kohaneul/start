package day15.ex01;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
	 Ex01 ] 
	 	아이디를 입력받아서
	 	입력받은 아이디가 유효한 아이디인지 아닌지를 판별해주는 프로그램을 작성하세요
	 	
	 	아이디는 
	 		첫글자는 영문대문자로 시작하고
	 		두번째부터는 영문숫자를 사용할 수 있다.
	 		글자수는 5글자 이상이어야 한다.
 */


public class Ex01 {

	public Ex01() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ID를 입력하시오 : ");
		String id = sc.nextLine();
		Pattern patt = Pattern.compile("[A-Z]{1}[a-z|0-9|A-Z]{4,}");
		Matcher matt = patt.matcher(id);
		boolean bool = matt.find();
		String result = bool ? "올바른":"틀린";
		System.out.println("입력한 아이디 : "+id+"는 "+result+" ID입니다.");
		
	
		
		
		
	}
	
	

	public static void main(String[] args) {
	new Ex01();
	}

}
