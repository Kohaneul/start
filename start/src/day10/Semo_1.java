package day10;

public class Semo_1 {
	int width,height;
	Semo[] s;
	Semo_1(){
		Setting();
		for(int i = 0; i<s.length;i++) {
			System.out.printf("가로 : %d, 세로 : %d, 넓이 : %6.2f\n",s[i].getWidth(),s[i].getHeight(),s[i].getArea());
		}
			}
	
	public void Setting() {
		s = new Semo[5];
		for(int i = 0; i<s.length;i++) {
			int width = (int)(Math.random()*20+10);
			int height = (int)(Math.random()*20+10);
			s[i] = new Semo(width,height);
		}
	}
	
	
	
	
	
	
	public static void main(String[] args) {
	new Semo_1();
	}
		
	}
	

