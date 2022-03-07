
package day08.ex;



/*
bonus ]
	Ex01의 각학생의 항목에 석차도 입력되도록 하세요.
	그후 내림차순 정렬하세요.
	
*/



public class Ex02_1 {

	public static void main(String[] args) {
	int[][]student = new int[7][6];
	
	for(int i = 0; i<student.length;i++) {
	
		for(int j = 0; j<student[i].length-1;j++) {
			student[i][j] = (int)(Math.random()*(100-60+1)+60);
			
			}
			}
	
		
	int [][]temp = new int[5][7];
	for(int i = 0; i<temp.length;i++) {
		for(int j = 0; j<temp[i].length;j++) {
			temp[i][j] = student[j][i];
		}
		
	}
	
	student = temp;
	
	int[] rank = new int[7];
	System.out.println("==================정렬 전======================");
	
	
	for(int i = 0; i<student.length;i++) {
		
		System.out.println("<< 과목 "+(1+i)+" >>");
		for(int j = 0; j<student[i].length;j++) {
			student[i][j] = (int)(Math.random()*(100-60+1)+60);
			System.out.println((char)('A'+j)+"학생 : "+student[i][j]+" ");
			
			}System.out.println();
		}
	System.out.println();
	
	String[][] str = new String[5][7];
	int name = 0;
	System.out.println("==================정렬 전(석차입력)==================");
	for(int i = 0; i<student.length;i++)
	{			System.out.println("<< 과목 "+(1+i)+" >>");
		
		for(int j = 0; j<student[i].length;j++) {
			name = ('A'+j);
			for(int k = 0;k<student[i].length;k++) {
				if(student[i][j]<student[i][k]) {
					rank[i]+=1;
				}
			}
			
			str[i][j] = (char)name+"학생 : "+student[i][j]+"점 ("+(rank[i]+1)+"등)";
			System.out.println(str[i][j]);
			rank[i] = 0;
		}
		
		System.out.println();
	}
	System.out.println("==================정렬 후======================");
		for(int i = 0; i<str.length;i++) {
			System.out.println("<< 과목 "+(i+1)+" >>");
			for(int j = 0; j<str[i].length;j++) {
				int idx = str[i][j].indexOf("(")+1;
			char ch = str[i][j].charAt(idx);
				for(int k = j+1; k<str[i].length;k++) {
					
					if(str[i][j].charAt(idx)>str[i][k].charAt(idx)) {
						String tp = str[i][j];
						str[i][j] = str[i][k];
						str[i][k] = tp;
					
					}
					
				}
				System.out.println(str[i][j]);
			}
		}
		
		
	}
	
		
	}
	
	
	
	
		

	
	
	

	