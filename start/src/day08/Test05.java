package day08;

import java.util.Arrays;

public class Test05 {

	public static void main(String[] args) {
	//문자열 배열
	String[] str;
	str = new String[5];
	for(int i = 0; i<str.length;i++) {
		System.out.println(str[i]);
	}
	
	String[] blackpink = {"제니","지수","리사","로제"};
	String[] team = new String[blackpink.length+1];
	System.arraycopy(blackpink, 0, team, 0, blackpink.length);
	System.out.println(Arrays.toString(team));
	int index = team.length-1;
	team[index] = "둘리";
	System.out.println(Arrays.toString(team));
	blackpink = team;
	System.out.println(Arrays.toString(blackpink));
	}

}
