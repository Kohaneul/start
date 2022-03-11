package day11.figure;

public class Practice {
	Figure[] f;
	Practice(){
		f = new Figure[10];
		for(int i = 0; i<f.length;i++) {
			int soo = (int)(Math.random()*3);
			int no1 = (int)(Math.random()*20+1);
			int no2 = (int)(Math.random()*20+1);
			if(soo==0) {
				f[i] = new Circle(no1);
			}
			else if(soo==1) {
				f[i] = new Nemo(no1,no2);
			}
			else if(soo==2) {
				f[i] = new Semo(no1,no2);
			}
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		new Practice();
	}
}
