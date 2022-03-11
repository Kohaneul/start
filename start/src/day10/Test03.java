package day10;

/*
 	Black Pink 멤버의 정보를 기억할 배열을 만들고
 	데이터를 입력하고
 	완성이 되면 내용을 출력하세요.
 	단, 각 멤버의 데이터 정보는 Friends 클래스에 기억시키도록 한다.
 */


public class Test03 {
	String[] name,birth,mail,tel;
	String addr;
	char gen;
	Test03(){
		setData();
		Blackpink[] b = setBlack();
		toPrint(b);
		
	}
	
	public void setData() {
		name = new String[] {"제니","지수","로제","리사"};
		tel = new String[] {"11-11","22-22","33-33","44-44"};
		mail = new String[] {"jennie@yg.com","jisoo@yg.com","Rosie@yg.com","Risa@yg.com"};
		birth = new String[] {"1998","2009","1992","1996"};
		addr = "YG";
		gen = 'F';
	}
	
	public Blackpink[] setBlack() {
		Blackpink[] b = new Blackpink[4];
		for(int i = 0; i<b.length;i++) {
			b[i] = new Blackpink();
		}
		for(int i=0; i<b.length;i++) {
			Blackpink bp = b[i];
			bp.setAddress(addr);
			bp.setBirth(birth[i]);
			bp.setGen(gen);
			bp.setMail(mail[i]);
			bp.setName(name[i]);
			bp.setBirth(birth[i]);
			bp.setTel(tel[i]);
		}
		return b;
	}
	
	public void toPrint(Blackpink[] b) {
		for(int i = 0; i<b.length;i++) {		
	
		String name = b[i].getName();
		String birth =b[i].getBirth();
		String mail = b[i].getBirth();
		String tel = b[i].getTel();
		String addr = b[i].getAddress();
		char gen = b[i].getGen();
		System.out.println("이름 : "+name);
		System.out.println("주소 : "+addr);
		System.out.println("생년월일 : "+birth);
		System.out.println("메일주소 : "+mail);
		System.out.println("전화번호 : "+tel);
		System.out.println("성별 : "+((gen=='F')?("여자"):("남자")));
		System.out.println("============================");
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
	new Test03();
	}
		
		

	

}
