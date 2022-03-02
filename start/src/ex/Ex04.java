package ex;

import java.util.Scanner;

/*/*
	문제 3 ]
		
1 1 1 1 1
2 2 2 2 2
3 3 3 3 3
4 4 4 4 4
5 5 5 5 5

1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5

1 2 3 4 5
1 2 3 4 5
2 3 4 5 6 
3 4 5 6 7 
4 5 6 7 8
5 6 7 8 9

 1  2  3  4  5
 6  7  8  9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

 1
 2  3
 4  5  6
 7  8  9 10
11 12 13 14 15
 */


public class Ex04 {

	public static void main(String[] args) {
	for(int i = 0; i<5;i++) {
		for(int j = 0; j<5;j++) {
		System.out.print((i+1)+" ");
	}
		System.out.println();
		
	}
	System.out.println("======================");
	for(int i = 0; i<5;i++) {
		for(int j = 0; j<5;j++) {
		System.out.print((j+1)+" ");
	}
		System.out.println();
		
	}
	
	System.out.println("======================");
	/*
	  	
1 2 3 4 5
1 2 3 4 5
2 3 4 5 6 
3 4 5 6 7 
4 5 6 7 8
5 6 7 8 9
	  	 */

	for(int i = 0; i<2;i++) {
		
		for(int j = 1;j<6;j++) {
			
			System.out.print(j+" ");
		
		}
		System.out.println();
	}
	for(int i = 1; i<5;i++) {
		
		for(int k = 1;k<6;k++) {
			
			System.out.print((k+i)+" ");
		
		}
		System.out.println();
	}
	System.out.println("======================");
	
	
/*
 1  2  3  4  5
 6  7  8  9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25
*/
	for(int i = 1; i<25;i+=5) {
		for(int j = 0; j<5;j++) {
			System.out.print(i+j +" ");
		}
		System.out.println();
	}
	
	
/*	
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
*/
	
	System.out.println("======================");
	for(int i = 5; i>0;i--) {
		for(int j = 0; j<=5-i;j++) {
			System.out.print(j+1+" ");
		}
		System.out.print(" ");
		System.out.println();
		
	}

	
/*	
 1
 2  3
 4  5  6
 7  8  9 10
11 12 13 14 15	
 */
	
	System.out.println("======================");
	int sum = 1;
	for(int i = 0; i<5;i++) {
		sum+=i;
		System.out.print(sum+" ");
		for(int j = 1; j<=i;j++) {
			System.out.print((sum+j)+" ");
		}
		System.out.println();
	}


	
	
	
	
}
}


