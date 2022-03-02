package ex;

import java.util.Scanner;

/*
문제 4 ]
	
	다음 형태로 출력하세요
	
*****
*****
*****
*****
*****
*****



	

****
***
**
*

*
**
***
****
*****

*
***
*****

*/

public class Ex03{
	
	public static void main(String[] args) {
		/*
		
		*****
		*****
		*****
		*****
		*****
		*****

	*/
		
		for(int i = 0; i<6;i++){
			for(int j = 0; j<5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

/*

		*****
		****
		***
		**
		*
		
*/
		System.out.println("==============================");
		
		for(int i = 0; i<5;i++) {
			for(int j = 0; j<5-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}



/*
		* 
		**
		***
		****
		*****
*/
		
		System.out.println("==============================");
		
		for(int i = 0; i<5;i++) {
			for(int j = 5-i; j<=5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
/*
		  *
		 ***
		*****
*/
		
		System.out.println("==============================");
		
		for(int i = 0; i<6;i++){
			for(int j = 0; j<5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		
	}
	
}