import java.util.Scanner;

public class Practice {

	public Practice() {}

	public static void main(String[] args) {
	
		int[][]ar = new int[6][6];
		
		for(int i = 0; i<ar.length;i++) {
			for(int j = 0; j<ar[i].length;j++) {
				ar[0][j] = j;
				ar[i][5] = i+j;
				System.out.print(ar[i][j]+" ");
			}System.out.println();
			
		}
		int temp = ar[5][5];
		for(int i = 0; i<ar.length;i++) {
			for(int j = 5; j>0;j--) {
				ar[5][j] = temp+j;
				System.out.print(ar[i][j]+" ");
			}System.out.println();
		}
		
	}
}
