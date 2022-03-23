package day18;

import java.io.*;

/*
  제니의 정보를 Friend 클래스를 이용해서 저장해보자.
  
  	ObjectOutputStream 을 이용해서 저장...
   
 */


public class Test06 {

	public Test06() {
	//기본스트림 준비
	FileOutputStream fout = null;
	//보조스트림 준비
	ObjectOutputStream oout = null;
	
	
	//데이터 만들고
	Friend jen= new Friend();
	jen.setName("제니");
	jen.setTel("010-1111-1111");
	jen.setMail("jennie@gmail.com");
	jen.setAddr("YGM");
	jen.setBlood("AB");
	jen.setAge(27);
	jen.setHeight(165.5F);
	jen.setGen('F');
	jen.setRh(true);
	
	
	try {
		//스트림 연결
		fout = new FileOutputStream("start/src/day18/result/jennie.txt");
		//필터스트림 연결
		oout = new ObjectOutputStream(fout);
		
		//준비된 데이터를 쓴다.
		
		oout.writeObject(jen);
		//이처럼 클래스 전체를 입출력하는 행위를 직렬화라고 표현한다.
		
		System.out.println("***저장 성공!");
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	finally {
		try {
			oout.close();
			fout.close();
		}
		catch(Exception e) {
			
		}
	}
	}

	public static void main(String[] args) {
	new Test06();

	}

}
