package day10;

public class Practice2 {
	int[] age;
	char[] name;
	String[] id;
	Practice[] pr;
	Practice2(){
		Setting();
		pr = setData();
		toString(pr);
	}
	
	public void Setting() {
		age = new int[]{(int)(Math.random()*30+1),(int)(Math.random()*30+1),(int)(Math.random()*30+1)};
		name = new char[]{(char)(Math.random()*('Z'-'A'+1)+'A'),(char)(Math.random()*('Z'-'A'+1)+'A'),(char)(Math.random()*('Z'-'A'+1)+'A')};
		id = new String[] {"112344","3446356","35345345"};
		}
	
	
	public Practice[] setData() {
		pr = new Practice[3];
		for(int i = 0; i<pr.length;i++) {
			pr[i] = new Practice();
		}
		for(int i = 0; i<pr.length;i++) {
			Practice p = pr[i];
			p.setAge(age[i]);
			p.setName(name[i]);
			p.setId(id[i]);	
		}
		return pr;
		
	}
	
	public void toString(Practice [] p) {
		for(int i= 0; i<p.length;i++) {
			char name = p[i].getName();
			int age = p[i].getAge();
			String id = p[i].getId();
		System.out.println("이름 : "+(char)(name));
		System.out.println("나이 : "+age);
		System.out.println("id : "+id);
		System.out.println("=====================");
		}
	}
	
	
	
	
	
	
		
	
	
	
		public static void main(String[] args) {
	new Practice2();	
			
	}

}
