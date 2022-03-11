package day11.moyang;

public class Practice {
	Practice(){
		Moyang m1  = new Circle01((int)(Math.random()*20+1));
		Moyang m2  = new Nemo1((int)(Math.random()*20+1),(int)(Math.random()*20+1));
		Moyang m3  = new Semo1((int)(Math.random()*20+1),(int)(Math.random()*20+1));
		
		
	}
	
	public static void main(String[] args) {
		new Practice();
		
		
	}
}
