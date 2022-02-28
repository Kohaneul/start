package Day05.ex;
/*
 문제 10]
 	주사위 2개를 던질 경우 눈의 합이 6이 되는경우를 모두 출력하세요
 	x+y==6
 
 */


public class Ex10 {

	public static void main(String[] args) {
	int x = 0;
	int y = 0;
	for(x = 1; x<=6;x++) {
		for(y = 1; y<=6;y++) {
			if(x+y==6) {
				System.out.println("x : "+x+", y : "+y);
			}
		}
	}

	}

}
