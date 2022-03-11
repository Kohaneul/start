package day09.ex;

/*
	문제 5 ]
		10 학생의 국어, 영어, 수학 점수를 랜덤하게 입력받아서
		총점과 석차를 구하는 프로그램을 작성하세요.
		
		각 학생의 점수입력, 총점계산, 석차계산, 출력은 함수로 처리하세요.
		
 */


public class Ex05 {
	
	public Ex05() {
		int[][]ar = getScore();
		int[]sum = getAdd(ar);
		int[] rank = getRank(sum);
		toPrint();
	}
		
		
	public static void main(String[] args) {
	new Ex05();}
	
	//점수입력
	public int[][] getScore(){
		int[][]ar = new int[10][3];
		for(int i = 0; i<ar.length;i++) {
			for(int j = 0; j<ar[i].length;j++) {
				ar[i][j] = (int)(Math.random()*41+60);
				
			}
		}
		return ar;
	}
	
	//총점 구하기
	public int[] getAdd(int[][]ar) {
		int[]arr = new int[10];
		for(int i = 0; i<ar.length;i++) {
			for(int j = 0; j<ar[i].length;j++) {
			arr[i]+=ar[i][j];	
			}
		
		}
		
		return arr;
	}
	//석차구하기
	public int[] getRank(int[]ar) {
		int[] rank = new int[10];
		int rankk = 1;
		for(int i = 0; i<ar.length;i++) {
			for(int j= 0; j<ar.length;j++) {
			if(ar[i]<ar[j]) {
				rankk++;
			}
			rank[i] = rankk;
			
			}
			rankk =1;
		}
		return rank;}
	
	public void toPrint() {
	
		int [][]ar = getScore();
		for(int i = 0; i<ar.length;i++) {
			for(int j = 0; j<ar[i].length;j++) {
				
				System.out.print(ar[i][j]+" ");
			}
			int[] add = getAdd(ar);
			int[] rank = getRank(add);
			System.out.print(add[i]+" "+rank[i]);
			System.out.println();	
		}
		
	}
	
	

		
		}
		
	
	
	
	
	
	
			
		
	

