package day09.ex;
/*
	
	문제6]

		
	
	
 */



public class Ex06 {
	int num;
	public Ex06() {
		set();
		System.out.println(num);
	}
	public static void main(String[] args) {
	new Ex06();	
	}
	public int set() {
		num = (int)(Math.random()*10+1);
		
		return num;
	}

}
