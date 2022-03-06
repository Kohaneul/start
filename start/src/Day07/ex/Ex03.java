package Day07.ex;

 
/*
	반지름 5개를 기억하는 배열을 만들고
	랜덤하게 반지름을 만들어서 기억시키고
	각각의 원의 넓이를 계산해서 출력해주는 프로그램을 작성하세요.
	넓이도 배열에 기억시켜주세요.
 */
  



public class Ex03 {

	public static void main(String[] args) {
	
	int [] radius = new int[5];
	
	double [] result = new double[5];
	
	for(int i = 0; i<radius.length;i++) {
		radius[i] = (int)(Math.random()*10+1);
		result[i] = radius[i]*radius[i]*3.14;
		System.out.println("반지름 : "+radius[i]+" / 넓이 : "+result[i]);
		System.out.printf("\t ==> %s X %s X 3.14 = %s\n",radius[i],radius[i],result[i]);
	}
	

	}

}
