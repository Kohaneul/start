package day12;

public class Test03 {
	public Test03() {
		//getData 함수를 5번 호출해서 반환값의 숫자 + 횟수X10을 더해서 그 결과를 출력하세요
		//getData()의 결과에 따라서 반환값을 강제형변환 시켜줘야 함.
//		for(int i = 0; i<5;i++) {
//			Object o =getData();
//			int result = 0;
//			if(o instanceof Integer) {
//				result = ((Integer)o)+(i*10); //기본형에서 Object 타입으로 변환되는것==>언박싱
//			}
//			else if(o instanceof String) {
//				String str = (String)o;
//				result = Integer.parseInt(str)+(i*10);
//			}
//			System.out.println((i+1)+"번째 결과 : "+result);
//		}
		Object o = getData();
		for(int i = 0; i<5;i++) {
			int result = 0;
			if(o instanceof Integer) {
				result = ((Integer)o)+(i*10);
			}
			else if(o instanceof String) {
				String str = ((String)o);
				result = Integer.parseInt(str)+(i*10);
			}
			System.out.println(result);
		}
	}
		
		
	
	
	
	
	
	public Object getData() {
		//0~1까지 랜덤하게 숫자를 발생시켜서 
		//0 -> 정수 100 (기본형)
		//1 -> 문자열 "100" (참조형)
		//반환해주는 함수
//		
//		int no = (int)(Math.random()*2);
//		Object obj = null;
//		if(no==0) {
//			obj =  100;	//int(기본형) -> Integer->Object 타입으로 변환
//			
//		}
//		else {
//			obj =  "100";//String-> Object로 변환
//		}
//		return obj;
		
		Object o = null;
		int no = (int)(Math.random()*2);
		if(no==0) {
			o = 100;
			
		}
		else if(no==1) {
			o = "100";
			
		}
		return o;
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
	new Test03();

	}

}
