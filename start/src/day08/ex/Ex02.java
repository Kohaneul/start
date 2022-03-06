
package day08.ex;
/*
Ex02 ]
	Ex01에서 만든 배열의 내용을
	다섯과목의 7학생의 배열로 바꿔서 
	해결하세요.
	
*/

public class Ex02 {

	public static void main(String[] args) {
		int[][] stud = new int[7][6];
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
			stud[i][5] = (i+1);
		}
		
		for(int i = 0; i<stud.length;i++) {
			System.out.print("학생("+(i+1)+") ");
			for(int j = 0; j<stud[i].length-1;j++) {
				System.out.print((char)('A'+j)+" : "+stud[i][j]+" ");
			}		
			System.out.println();
		}
		
			int[][] stud2 = new int[5][7];
			//5 과목, 7학생
			for(int i = 0; i<stud2.length;i++) {
				for(int j = 0; j<stud2[i].length;j++) {
					stud2[i][j] = stud[j][i];
					
				}
				
			}
			
			
			for(int i = 0; i<stud2.length;i++) {
				int tmp = 0;
			
				for(int j = 0;j<stud2[i].length-1;j++) {;
					for(int k = j+1; k<stud2[i].length;k++) {
						if(stud2[i][j]<stud2[i][k]) {
							tmp = stud2[i][k];
							stud2[i][k] = stud2[i][j];
							stud2[i][j] = tmp;
							
							
							}
					
						
					}
					
				}
			}
			for(int i = 0; i<stud2.length;i++) {
				System.out.println("<<"+(char)(i+'A')+" 과목 >>");
				for(int j = 0; j<stud2[i].length;j++) {
					System.out.print(stud[j][5]+"학생"+stud2[i][j]+" ");
				}
				System.out.println();
			}
			
			
			
		}

	
	}
	
