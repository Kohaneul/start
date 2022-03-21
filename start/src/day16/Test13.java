package day16;

import java.util.ArrayList;
public class Test13 {

	public Test13() {
		ArrayList<Grand>list1 = new ArrayList<Grand>();
		ArrayList<Father>list2 = new ArrayList<Father>();
		ArrayList<Son>list3 = new ArrayList<Son>();
		ArrayList<GrandSon>list4 = new ArrayList<GrandSon>();
		abc(list1);
		abc(list2);
		abc(list3);
	//	abc(list4);
	//	xyz(list1);
	//	xyz(list2);
		xyz(list3);
		xyz(list4);
		
		
	}
	
	public void qwe(ArrayList<?>list) {
		
	}
	
	//Son 포함하고 그 상위클래스(Father, Grand ..Obj까지 가능)
	public void abc(ArrayList<?super Son> list) {
		//이 함수의 매개변수는 Son,Father, Grand, Object 타입의 데이터를 입력해서 만든 리스트를 줄 수 있다.
		//Son의 상위 클래스만 가능
	}
	
	public void xyz(ArrayList<? extends Son> list) {
		//이 함수를 호출할 때 입력하는 리스트는
		//Son의 객체들을 입력한 리스트거나 GrandSon의 객체들을 입력한 리스트여야만 한다.
		//Son 포함 하위 클래스만 가능
	
	}
	
	public static void main(String[] args) {
	new Test13();

	}

}

class Grand{}
class Father extends Grand{}
class Son extends Father{}
class GrandSon extends Son{}