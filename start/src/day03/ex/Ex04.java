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
	static double one_year  = 365.2426;
	public static void main(String[]args) {
		System.out.print(one_year+"은 : ");
		int day = 1;
		int hour = 24;
		int min = 60;
		int sec = 60;
		
		day = (int)one_year/day;
		System.out.print(day+"일 ");
		one_year = one_year%day;

		one_year = one_year*hour;
		System.out.print((int)one_year+"시간 ");
		one_year = one_year%hour;
		
		one_year = one_year*min;
		System.out.print((int)one_year+"분 ");
		one_year = one_year%min;
		
		one_year = one_year*sec;
		System.out.print((int)one_year+"초 ");

		
		
		
		
		
		
		
		
			
				
		
		
	
	}
	
	

}
