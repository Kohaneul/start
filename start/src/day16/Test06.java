package day16;
/*
 	맵 안에 맵...
 	
 	전화번호를 관리하는 프로그램을 작성할 예정이다.
 	추가될 친구들은 그룹, 이름, 전화번호로 입력할 것이다.
 	전화번호부 프로그램을 작성하세요
 	
 	==> 친구 : 제니 010-1111-1111
 			   리사 010-2222-2222
 			   로제 010-3333-3333
 		회사
 		웬수
 		동호회
 			   둘리 010-9876-5432
 */

import java.util.*;
public class Test06 {
	HashMap map = new HashMap();
	Test06(){
		setFriend("그룹1","AA","010-111-11");
		setFriend("그룹2","AAA","010-8881-11");
		setFriend("그룹1","CC","010-33-441");
		setFriend("그룹3","AFF","010-65566-11");
		setFriend("그룹5","DD","010-99999-11");
		getGroup("그룹5");
		getTel("그룹1","AA");
	}
	//그룹 셋팅 : setGroup
	
	public void setGroup(String group) {
		if(!map.containsKey(group)) {
			map.put(group, new HashMap());
		}
	}
	
	//그룹, 친구, 전화번호 셋팅 : setFriend
	
	public void setFriend(String group,String name,String tel) {
		setGroup(group);
		HashMap temp = (HashMap)map.get(group);
		temp.put(name, tel);
	}
	
	//그룹중 전체 인원 출력 : getGroup
	public void getGroup(String group) {
		HashMap temp = (HashMap)map.get(group);
		Set st = temp.keySet();
		for(Object obj : st) {
			String tel = (String)temp.get(obj);
			System.out.println(obj+" - "+tel);
		}
	}
	//특정 그룹 중 한 사람의 연락처 출력 : getTel
	public void getTel(String group, String name) 
	{
		HashMap temp = (HashMap)map.get(group);
		Set st = temp.keySet();
		String tel = (String)temp.get(name);
		System.out.println(name+" == > "+tel);	
		
	}
	
	
	
	
	
	public static void main(String[] args) {
	new Test06();
	}
}
