package day11;

public class Test00_03 {
	
	private int garo,sero,area,rank;
	Nemo[] nemo;
	
	Test00_03(){
		setting();
		setRank();
		toPrint();
	}
	
	
	public void setting() {
		nemo = new Nemo[5];
		
		for(int i = 0; i<nemo.length;i++) {
			Nemo n = nemo[i];
			int garo = (int)(Math.random()*21+5);
			int sero = (int)(Math.random()*21+5);
			nemo[i] = new Nemo(garo,sero);
		}
		
	}
	
	
	public void setRank() {
		for(int i = 0; i<nemo.length;i++) {
			Nemo n = nemo[i];
			
			for(int j = 0; j<nemo.length;j++) {
				int na = n.getRank();	
				if(nemo[i].getArea()<nemo[j].getArea()) 
				{
					n.setRank(na+1);
					
					
				}
			}
			
		}
		
		
	}
	
	
	
	
	
	
	
	public void toPrint() {
	
		for(int i = 0; i<nemo.length; i++) {
			System.out.printf("가로 : %d , 세로 : %d 넓이 : %d", nemo[i].getGaro(),nemo[i].getSero(),nemo[i].getArea());
			System.out.printf("==> %d 등 입니다.\n",nemo[i].getRank());
		}
		
		
		
	}
	
	
	
	
	public static void main(String[] args) {
	new Test00_03();	
	}
	
	
	
	

}
