
package day08.ex;

public class Ex03 {
	/*
	다음 내용은 다중 반복문과 2원배열 연습용 문제입니다.
	모두 풀 수 있다면 좋겠지만
	풀지 못하는 문제가 있다 해도 상관없으니
	미진한 부분 연습용으로 활용하시기 바랍니다.
	

 */
	
	public static void main(String[] args) {
	/*
	 	1. 
		1  1  1  1  1
		2  2  2  2  2
		3  3  3  3  3
		4  4  4  4  4
		5  5  5  5  5
	*/
	for(int i = 0; i<5;i++) {
		for(int j = 0; j<5;j++) {
		System.out.print(i+1+" ");	
		}
		System.out.println();
	}
	System.out.println("==========================");
	/*
	2. 
		1  2  3  4  5
		1  2  3  4  5
		1  2  3  4  5
		1  2  3  4  5
		1  2  3  4  5
		
	*/
	
	for(int i = 0; i<5; i++) {
		for(int j = 0; j<5; j++) {
			System.out.print(j+1+" ");
		}
		System.out.println();
	}
	System.out.println("==========================");
		
	/*	
	3. 
		5  4  3  2  1
		5  4  3  2  1
		5  4  3  2  1
		5  4  3  2  1
		5  4  3  2  1
	*/
	
	for(int i = 5; i>0;i--) {
		for(int j = 5; j>0;j--) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
		
		
	System.out.println("==========================");
	/*
	4.
		1  2  3  4  5
		5  4  3  2  1
		1  2  3  4  5
		5  4  3  2  1
		1  2  3  4  5
	*/
	
	for(int i = 1; i<6; i++) { 
		if(i%2==1) 
		{
		for(int j = 1; j<6; j++) {
			System.out.print(j+" ");
		}}
		else {
		System.out.println();
		for(int k = 5; k>0; k--) {
			System.out.print(k+" ");
		}
		System.out.println();
		}
		
	}
	System.out.println();
	System.out.println("==========================");
	
		/*	
	5. 
		 1  2  3  4  5
		 6  7  8  9 10
		11 12 13 14 15
		16 17 18 19 20
		21 22 23 24 25
		*/
	
	for(int i = 0; i<5; i++) {
		for(int j = i*5+1; j<(i*5+1)+5; j++) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
	System.out.println("==========================");
		/*
	6.
		 1  2  3  4  5  10+(i-1) ++
		10  9  8  7  6  10*i --
		11 12 13 14 15  10+(i-1) ++ 
		20 19 18 17 16  10*i --
		21 22 23 24 25  10+(i-1) ++
	
		*/
	
		
	int [][]arr = new int[5][5];
	for(int i  = 0; i<arr.length;i++) {
		if(i%2==0) {
			
			for(int j = 0; j<arr[i].length;j++) {
				System.out.print((j+1)+(i/2)*10+" ");
			}
		}
		else {
			for(int j = 5; j>0;j--) {
				System.out.print(j+5+10*(i/2)+" ");
			}
		}
		System.out.println();
			
	}
		
	
	
	
	
	
		
	
		/*
	7.
		1  0  0  0  0
		1  2  0  0  0
		1  2  3  0  0
		1  2  3  4  0
		1  2  3  4  5
		*/
	
	System.out.println("====================");
	
	for(int i = 0;i<5; i++) {
		for(int j = 0; j<=i; j++) {
			System.out.print((j+1)+" ");
		}
	
		for(int k = i+1; k<5;k++) {
			System.out.print(0+" ");
		}
		System.out.println();
	}
	System.out.println("====================");
	
	
		/*
		
	8.
		 1  0  0  0  0
		 2  3  0  0  0
		 4  5  6  0  0
		 7  8  9 10  0
		11 12 13 14 15
		*/
	int result = 0;
	for(int i = 0; i<5; i++) {
		result +=i;
		for(int j = 0; j<=i;j++) 
		{
		
			System.out.print(result+j+1+" ");
		}
		for(int k = i+1; k<5;k++) {
			System.out.print(0+" ");
		}
		System.out.println();
	}
	
		/*
	9.
		 0  0  0  0  1
		 0  0  0  1  2
		 0  0  1  2  3
		 0  1  2  3  4
		 1  2  3  4  5
		  */  
	
	System.out.println("====================");
	
	for(int i=0; i<5; i++) {
		for(int j = 0; j<5-i-1;j++) {
			System.out.print(0+" ");
		}
		for(int k = 0; k<i+1;k++) {
			System.out.print(k+1+" ");
		}
		System.out.println();
	}
	
	
	
		/*
	10.
		 0  0  0  0  1
		 0  0  0  2  3
		 0  0  4  5  6
		 0  7  8  9 10
		11 12 13 14 15 
	  
	 */
	
	

	System.out.println("====================");
	int result2 = 0;
	for(int i= 0; i<5; i++) {
		for(int j = 0; j<5-i-1; j++) {
			System.out.print(0+" ");
		}
		result2+=i;
		for(int k = 0; k<=i;k++) {
			System.out.print(k+result2+1+" ");
		}
		System.out.println();
	}
		
		

	
	
}
}





