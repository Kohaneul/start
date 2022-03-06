package Day07;

import java.util.Arrays;

public class Test01 {

	public static void main(String args[]) {
	int [] A = new int[4];
	A[0] = 1;
	A[1] = 10;
	A[2] = 100;
	A[3] = 1000;
	
	
	int [] B = new int[5];
	
	for(int i = 0; i<A.length;i++) {
		B[i] = A[i];
	}
	B[B.length-1] = 10000;
	A = B;
	System.out.println(Arrays.toString(A));
	
		
		
	}

}
