package day12.Figure;

public class Test05 {

	public static void main(String[] args) {
	//변수는 레퍼런스쪽을 따른다.
	
	Num num = new No();
	Num no = new Num();
	System.out.println("num.no : "+num.no);
	System.out.println("no.no : "+no.no);
	No n = new No();
	System.out.println(n.no);
	}
	
	//함수는 인스턴스쪾을 따른다.

}

class Num{
	int no = 10;
	
}
class No extends Num{
	int no = 100;
}