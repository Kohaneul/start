package day18;
import java.io.*;
/*
  Test06 에서 저장한 jennie.txt 파일을 읽어보자.
  ObjectOutputStream 으로 저장한(내보낸) 파일은 
  반드시 ObjectInputStream 으로 읽어야 한다.
  그리고 보내는 쪽과 받는 쪽에 모두 동일한 클래스가 있어야 한다.
  
  
 */


public class Test07 {

	public Test07() {
		FileInputStream fin = null;
		//보조스트림
		ObjectInputStream oin = null;
		try {
			// 스트림 연결
			fin = new FileInputStream("start/src/day18/result/jennie.txt");
			oin = new ObjectInputStream(fin);
			
			/*
			 * private String name,tel,mail,addr,blood;
			private int age;
			private float height;
			private char gen;
			private boolean rh;	//+ :  true, - :  false
			 */
			
			//클래스 통째로 읽어옴
			Friend jny = (Friend)oin.readObject();	//Obj 타입으로 읽어오기 떄문에 강제 형변환해줘야함
			String name = jny.getName();
			String tel = jny.getTel();
			String mail = jny.getMail();
			String addr = jny.getAddr();
			String blood = jny.getBlood();
			int age = jny.getAge();
			float height = jny.getHeight();
			char gen = jny.getGen();
			boolean rh = jny.isRh();
			
			//출력
			System.out.println("이름 : "+name);
			System.out.println("전화 : "+tel);
			System.out.println("메일 : "+mail);
			System.out.println("rh : "+rh);
			System.out.println(jny);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				oin.close();
				fin.close();
			}
			catch(Exception e) {
				
			}
		}
		
			
		}
	public static void main(String[] args) {
		new Test07();

	}

}
