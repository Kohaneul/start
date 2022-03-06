package day08.ex;

public class EEE {

	public static void main(String[] args) {
	
		int[][] stud = new int[4][3];
		//6번째에는 총점
		for(int i = 0; i<stud.length;i++) {
			for(int j = 0; j<stud[i].length-1;j++) {
				stud[i][j] = (int)(Math.random()*(100-60+1)+60); 
			System.out.print(stud[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("========================");
		for(int i = 0; i<stud.length;i++) {
			stud[i][2] = (i+1);
		for(int j = 0; j<stud[i].length;j++) {
			System.out.print(stud[i][j]+" ");
		}System.out.println();
		}
		System.out.println();
		int[][] stud2 = new int[2][4];
		for(int i = 0; i<stud2.length;i++) {
			for(int j = 0; j<stud2[i].length;j++) {
				stud2[i][j] = stud[j][i];
			
			System.out.print(stud2[i][j]+" ");
		}System.out.println();
		}
		System.out.println();
		for(int i= 0; i<stud2.length;i++) {
			for(int j = 0; j<stud2.length;j++) {
				for(int k = j+1; k<stud2[j].length;k++) {
					if(stud2[i][k]>stud2[i][j]) {
						int temp = stud2[i][k];
						stud2[i][k] = stud2[i][j];
						stud2[i][j] = temp;
					}
					
				}
				
				System.out.print(stud2[i][j]+" ");
			}System.out.println();
		}
		
		
		
			
				
		

	}

}
