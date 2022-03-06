package Day07;
	/*
	 	6개의 메모리를 배열로 만들고 
	 	그 안에 랜덤한 숫자를 입력한 후
	 	출력하세요
	 	정수  :1~45 사이
	 	
	 */


public class Test02 {

	public static void main(String args[]) {
	String str = "";
	int[] array = new int[4];
	loop:
	for(int i = 0; i<array.length;i++) {
		array[i] = (int)(Math.random()*10);
		
	
		
		for(int j = 0; j<i;j++) {
		
			System.out.println(i+"번째 : "+array[i]+" / "+j+"번째 : "+array[j] +" ");
			
			System.out.println("i : "+i+", j:"+j);
			
			if(array[i]==array[j]) {
			
				System.out.println("중복!"+i+"=="+j);
				
				i--;
				System.out.println("==>i--"+i+" : "+j);
				continue loop;
			}
		
			
		}
		str+=array[i]+" ";
	}
	System.out.println(str);
}
}



