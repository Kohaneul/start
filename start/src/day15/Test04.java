package day15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
	 특정 문자열에서 원하는 규칙에 맞는 부분만 
	 추출해서 출력해보자.
 */
public class Test04 {

	public Test04() {
	String tel = "HP : 010-2342-2342";
	Pattern pat = Pattern.compile("01[0-9]-\\d{3,4}-\\d{4}");
	Matcher mat = pat.matcher(tel);
	if(mat.find()) {
		String str = mat.group();
		System.out.println(str);
	}
	
	
	}
	
		
	
	

	public static void main(String[] args) {
		new Test04();
	}

}
