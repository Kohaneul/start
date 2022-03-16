package day08;

public class Test08 {

	public static void main(String[] args) {
		//문자열 변수
		String black = "Black Pink";
		
		//잘라낸 단어 변수 두개
		String word1, word2;
		
		
		//' '의 위치
		int index = black.indexOf(" ");
		//indexOf <== 문자열 중 특정 문자열 위치값 알려주는 함수
		//Black 추출
		word1 = black.substring(0,index);
		System.out.println(word1);
		word2 = black.substring(index+1);
		
		
		//Pink 추출
		System.out.println(word2);
	
	}

}
