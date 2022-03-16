package day03.ex;

public class Ex04 {
	/*
	 	1년은 365.2426 일이다.
	 	이것은 과연 몇일 , 몇시간 , 몇분, 몇초인지 계산하고 출력하시오
	 	
	 	힌트 ]
	 	
	 		365.2426일은 단위가 일 단위이다.
	 		하루는 24시간이다.
	 		따라서 0.5일은 12시간을 의미한다.
	 		
	 */
	
	public static void main(String[]args) {
		// 할 일
		// 데이터 변수에 기록시키기
			double total = 365.2426;
		// 누적 계산될 변수 만들기
			double tmp = total;
		// 날 수 구하고 -> 누적 변수에 계산해서 업데이트
			int day = (int)tmp;
			tmp -= day;
			
			//0.2426을 초로 변환.
			//1 * 24 * 60 * 60
			//0.5*24 => 하루의 절반시간
			//0.1*24 => 0.1일의 시간
			
			int tsec = (int)(0.2426*24*60*60);
		
			
		// 시간 구하고 -> 누적 변수에 계산해서 업데이트
			int hour = tsec/(60*60);
			//몫이 시간이고 남은 나머지가 초, 분
			tsec %=3600;
			
		// 분 구하고 -> 누적 변수에 계산해서 업데이트
			int minute = tsec/60;
			tsec %= 60;
		// 초 구한다.(초는 분 구한 나머지를 쓴다)
			int sec = tsec;
			
			System.out.println("  1 년은   "+ total + "일 이고");
			System.out.println(" 이 것은   "+ day + "일");
			System.out.println("	   "+ hour + "시간");
			System.out.println("	   "+ minute + "분");
			System.out.println("	   "+ sec+ " 초 이다.");
		
		//출력함
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		System.out.print(one_year+"은 : ");
//		int day = 1;
//		int hour = 24;
//		int min = 60;
//		int sec = 60;
//		
//		day = (int)one_year/day;
//		System.out.print(day+"일 ");
//		one_year = one_year%day;
//
//		one_year = one_year*hour;
//		System.out.print((int)one_year+"시간 ");
//		one_year = one_year%hour;
//		
//		one_year = one_year*min;
//		System.out.print((int)one_year+"분 ");
//		one_year = one_year%min;
//		
//		one_year = one_year*sec;
//		System.out.print((int)one_year+"초 ");
//
//		
//		
//		
//		
//		
//		
//		
		
			
				
		
		
	
	}
	
	

}
