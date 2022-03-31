package day19;

import java.io.*;
import java.util.*;

public class Exec01{
	
	private boolean isStart;
	private Scanner sc;
	private PingServer ping;
	
	Exec01(){
		ping = new PingServer();
		sc = new Scanner(System.in);
		while(isStart) {
		System.out.println("서버프로그램 ");
		System.out.println("시작 :  start ");
		System.out.println("중지 : quit");
		System.out.print("입력 : ");
		String str = sc.nextLine();
		switch(str) {
		case "start":
			if(!ping.isAlive()) {
				ping.start();
			}
			break;
		case "quit" :
			isStart = false;
			ping.setStart(false);
			try {
				ping.getServer().close();
				
			}
			catch(Exception e) {
				break;
			}
			
		}
		System.out.println("프로그램 종료");
				
				
	}
	}
	
	
	
	public static void main(String[] args) {
		new Exec01();
	}
}