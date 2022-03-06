
package day08.ex;

/*
Ex02 ]
	Ex01에서 만든 배열의 내용을
	다섯과목의 7학생의 배열로 바꿔서 
	해결하세요.
	
bonus ]
	Ex01의 각학생의 항목에 석차도 입력되도록 하세요.
	그후 내림차순 정렬하세요.
	
*/

public class Ex02_1 {

	public static void main(String[] args) {
	int[][]student = new int[7][6];
	
	for(int i = 0; i<student.length;i++) {
		System.out.print((char)('A'+i)+"학생 : ");
		for(int j = 0; j<student[i].length-1;j++) {
			student[i][j] = (int)(Math.random()*(100-60+1)+60);
			System.out.print(student[i][j]+" ");
			}
		System.out.println();
	}
	System.out.println();
		
	int [][]temp = new int[5][7];
	for(int i = 0; i<temp.length;i++) {
		System.out.println("<< 과목 "+(i+1)+" >>");
		for(int j = 0; j<temp[i].length;j++) {
			temp[i][j] = student[j][i];
		}
		System.out.println();
	}
	
	student = temp;
	
	
	for(int i = 0; i<student.length;i++) {
		char ch = 'A';
		System.out.println("================================================");
		for(int j = 0; j<student[i].length;j++) {
			student[i][j] = (int)(Math.random()*(100-60+1)+60);
			System.out.print((char)(ch+j)+""+student[i][j]+" ");


		}
		System.out.println();
		System.out.println("< 내림차순 정렬 > ");
		for(int f = 0; f<student[i].length;f++) {
			
			
			for(int k = f+1; k<student[i].length;k++) {
				if(student[i][f]<student[i][k]) {
					int temp2 = student[i][k];
					student[i][k] = student[i][f];
					student[i][f] = temp2;
				}
				
			}System.out.print(student[i][f]+" ");
		}
		
		System.out.println();

	}
	
	for(int i = 0; i<student.length-1;i++) {
		for(int j = 1; j<student.length;j++) {
			
		}
	}
	
	
	
	
		
	
		}
	
	
	}
	