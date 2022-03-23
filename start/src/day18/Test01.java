package day18;

import java.io.FileWriter;
import java.util.ArrayList;


public class Test01 {
	/*
	 	char 단위로 파일에 데이터를 저장하는 프로그램을 작성하세요.
	 */
	
	public Test01() {
		//타겟스트림(기본스트림)
		FileWriter fw = null;
		try {
			
			fw = new FileWriter("start/src/day18/result/휘파람.txt");
			/*1. 한글자(2 byte)만 저장.
			char ch = '휘';
			fw.write(ch);
			//2. 여러글자 저장
			//문자열 준비
			//문자단위로 처리를 해야하므로 문자배열 준비.
			//문자열을 문자배열로 변환시켜주는 함수 :  toCharArray();
			char[] buff = str.toCharArray();
			fw.write(buff);
			 */
			
			String str = "\t\t\t휘파람\r\n\t\t\t\t\t\t블랙핑크";
			/*
			 	참고 ] 
			 	char 단위는 text 데이터만 처리하도록 되어있기 때문에 
			 	기본함수에 문자처리기능이 추가되어 있다.
			 */
			
			fw.write(str);
			
			
			System.out.println("파일 저장 완료");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
			fw.close();	
			}
			catch(Exception e) {
			}
		}
	}
		
		
	
	public static void main(String[] args) {
	new Test01();
	}

}
