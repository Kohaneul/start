package day18.friend;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;



public class Friend11 {

	public Friend11() {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		Jenny_Friend jen = new Jenny_Friend();
		jen.setAge(10);
		jen.setBlood('A');
		jen.setName("제니");
		jen.setTel("010-1111-1111");
		try {
			fos = new FileOutputStream("start/src/day18/friend/jenny.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(jen);
			System.out.println("파일 저장 완료!");
		}
		catch(Exception e) {
			
		}
		finally {
			try {
			oos.close();
			fos.close();
			}
			catch(Exception e) {
				
			}
		}
	}

	public static void main(String[] args) {
		new Friend11();
	}

}
