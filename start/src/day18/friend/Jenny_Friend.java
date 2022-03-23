package day18.friend;
import java.io.*;
/*
  이 클래스가 직렬화 되기 위해서는(이 클래스 채로 데이터를 넘기려고 한다면)
  직렬화 가능한 클래스가 되어야 한다.
   	방법 ] 
   		implements Serializable;
   		
   	이 때 전달되는 데이터는 멤버중 변수의 내용만 전달이 된다.
   	따라서 데이터를 사용하려고 하면 
   	똑같은 클래스를 받는 쪽에서도 가지고 있어야 한다.
  
 */



public class Jenny_Friend implements Serializable{
	
	private String name, tel;
	private int age;
	private char blood;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getBlood() {
		return blood;
	}
	public void setBlood(char blood) {
		this.blood = blood;
	}
	
}
