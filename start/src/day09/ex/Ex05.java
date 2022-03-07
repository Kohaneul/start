package day09.ex;

/*
	문제 5 ]
		10 학생의 국어, 영어, 수학 점수를 랜덤하게 입력받아서
		총점과 석차를 구하는 프로그램을 작성하세요.
		
		각 학생의 점수입력, 총점계산, 석차계산, 출력은 함수로 처리하세요.
		
 */


public class Ex05 {
	public Ex05() {
	int[][] num = setScore();
	int[] add = getAdd(num);
	int[] rank = getRank(add);
	toPrint(num);
	}
		
		
	public static void main(String[] args) {
	new Ex05();}
	
	//점수입력
	public int[][] setScore() {
		int[][] score = new int[10][3];
		for(int i = 0; i<score.length;i++) {
			for(int j = 0; j<score[i].length;j++) {
				
			score[i][j] = (int)(Math.random()*41+60);
			
			}
			
			}
		return score;	}
	
	//총점계산
	public int[] getAdd(int[][]ar) 
	{	int sum = 0;
		int[] add = new int[ar.length];
		for(int i = 0; i<ar.length;i++) {
			for(int j = 0; j<ar[i].length;j++) {
				sum+=ar[i][j];
			}
			add[i] = sum;
			sum = 0;
			
		}
		
		return add;
	}
	
	
	
	//석차계산
	public int[] getRank(int[]add) 
	{	int[] rank = new int[add.length];
		int rk = 1;
		for(int i = 0; i<add.length;i++) {
			for(int j = 0; j<add.length;j++) {
				if(add[i]<add[j]) {
					rk++;
				}
				
			}
			rank[i] = rk;
			rk = 1;
		}
		
		return rank;
	}
	
	public void toPrint(int[][]score) {
		int[] add = getAdd(score);
		int[] rank = getRank(add);
		for(int i = 0; i<score.length;i++) {
			System.out.print((char)('A'+i)+" 학생 : ");
			for(int j = 0; j<score[i].length;j++) {
				System.out.print(score[i][j]+" ");
			}
			System.out.print("총점 : "+add[i]+" ("+rank[i]+"등)");
			
			System.out.println();
		}
		
		
		}
		
	}
	
	
	
	
	
			
		
	

