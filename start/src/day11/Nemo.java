package day11;


public class Nemo {
	private int garo,sero,area,rank;
	{
		rank = 1;
	}
	Nemo(){}
	Nemo(int garo, int sero){
		this.garo = garo;
		this.sero = sero;
		this.area = getArea();
		setArea();
		rank = 1;
		
	}
	
	public int getGaro() {
		return garo;
	}

	public void setGaro(int garo) {
		this.garo = garo;
	}

	public int getSero() {
		return sero;
	}

	public void setSero(int sero) {
		this.sero = sero;
	}

	public int getArea() {
		area = garo*sero;
		return area;
	}
	public void setArea() {
		area = garo*sero;
		
	}
	public void setArea(int area) {
		this.area = area;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = 0;
	}
	
	
	}