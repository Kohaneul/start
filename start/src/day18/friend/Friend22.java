package day18.friend;

import java.io.*;

public class Friend22 {

	public Friend22() {
	FileInputStream fis = null;
	ObjectInputStream ois = null;
	
	try {
		fis = new FileInputStream("start/src/day18/friend/jennie_friend.txt");
		Jenny_Friend jen = (Jenny_Friend)ois.readObject();
		int age = jen.getAge();
		char blood = jen.getBlood();
		String name = jen.getName();
		String tel = jen.getTel();
		System.out.println("나이 : "+age);
		System.out.println("혈액형 : "+blood);
		System.out.println("전화 : "+tel);
		
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	finally {
		try {
		ois.close();
		fis.close();
		}
		catch(Exception e) {
		
		}
	}
	
	}

	public static void main(String[] args) {
	new Friend22();

	}

}
