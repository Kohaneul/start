package day04;

public class Test03 {
	public static void main(String[] args) {
		int no = 20;
		int result = 20 >> 2; //2의 2승으로 나눔
		System.out.println("result : "+ result);
		result = result << 3; //2의 3승으로 곱한값
		System.out.println("result : "+ result);
		// 20==> 의 bit 값을 오른쪽으로 두칸 미는것.
		// 20 : 10100 
		System.out.println("<<1 : "+(-64>>1));
		System.out.println(">>>16 : "+(-128>>>1));
		
	}
}
