package day12.Figure2;

public class Dongl implements Figure{
		private int rad;
		private double arround, area;
		
		public Dongl(int rad){
			this.rad =rad;
			setArround();
			setArea();
		
		}
		
		public int getRad() {
			return rad;
		}
		public void setRad(int rad) {
			this.rad = rad;
		}
		public double getArround() {
			return arround;
		}


		public void setArround() {
			arround = rad*2*Math.PI;
		}
		
		public void setArround(double arround) {
			this.arround = arround;
		}
		public double getArea() {
			return area;
		}
		public void setArea(double area) {
			this.area = area;
		}
		public void setArea() {
			area = rad*rad*Math.PI;
		}
		
	
		public void toPrint() {
			System.out.printf("이 원은 반지름이 %3d이고 둘레가 %.2f이고 면적이 %.2f 입니다.\n",rad,arround,area);
		}
	
	
}
