package Day05.ex;
/*
 	문제 13]
 		랜덤한 두 수를 입력한 후 
 		두 수의 최대 공약수를 구하는 프로그램을 작성하시오
 	
 		최대 공약수 : 
 			
 */

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("최소공배수, 최대공약수 를 구할 두 수를 입력하시오");
	
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	int result = 1;//최소공약수, 최대공약수

	int num3= 0;
	
	if(num1>num2) {
		num3 = num1;
	}
	else {
		num3 = num2;
	}		
	for(int i = 1; i<num3;i++) 
	{
		if(num1%i==0 && num2%i==0) {
			int temp1 = num1;
			int temp2 = num2;
			temp1 /=i;
			temp2 /=i;
			result =i*temp1*temp2;
			
		}
	}
	System.out.println(num1+"과"+num2+"의 최소공약수는"+result);
	
	for(int i = 1; i<num3;i++) {
		if(num1%i==0 && num2%i==0) {
			result = i;
		}
	}

	System.out.println(num1+"과"+num2+"의 최대공배수는"+result);
	
	}
}



