package day04.ex2;
	
/*
	 문제 3]
	 	게시물을 게시판에 출력하는데 
	 	하나의 페이지에 게시물 15개를 출력할 예정이다.
	 	게시물 수를 랜덤하게 발생시켜서
	 	게시판의 페이지가 몇 페이지가 필요한지를 계산해서 출력해주는 프로그램을 작성하시오
	 	
	 	참고 ] 
	 		게시물이 없는 경우는 
	 		게시물이 없는 페이지가 적어도 1페이지는 필요하다.
	 		
	 		1
 */



public class Ex03 {

	public static void main(String[] args) {
	int page = (int)(Math.random()*50);//게시물 수
	
	System.out.println("페이지 수 : "+page);
	int tmp = 0;
	
	if(page<15) {
		tmp = 1;
	}
	else if(page>15) {
		tmp = (page/15)+1;
	}
	System.out.println("랜덤한 페이지 수 : "+page + "는 ?"+ tmp+"페이지 입니다.");


	}

}
