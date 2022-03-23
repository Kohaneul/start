package day18;

import java.io.*;

/*
 	result 폴더의 blackpink.txt 파일을 읽어보자
 	기본스트림은 byte 기반으로, 보조스트림은 문자기반 스트림으로 연결해서 처리해본다.
 	
 	참고 ] 스트림을 사용할 때 주의사항 : 
 		1. 반드시 방향이 같아야한다.
 		2. 크기가 같아야 한다.
 	를 지켜줘야 하는데, 위의 조건처럼 다른 계열에 스트림을 연결해서 사용해야 하는 경우, 
 	InputStreamReader	/	OutputStreamWriter을 이용해서 서로를 연결해서 사용해야 한다.
 	이 때 주의사항으로는 반드시 기본 스트림은 바이트기반이어야 하고
 	보조스트림이 문자기반 스트림이어야 한다.
 	
 	start/src/day18/result/blackpink_02.txt
 */


public class Test08 {
	
	public Test08() {
		//기본 스트림 준비
				FileInputStream fin = null;
				//보조보조스트림(기본과 보조를 연결)
				InputStreamReader isr = null;
				//보조스트림
				BufferedReader br = null;
				
				try {
					fin = new FileInputStream("start/src/day18/result/blackpink_02.txt");
					isr = new InputStreamReader(fin);	//크기가 다른 두 stream을 연결
					br = new BufferedReader(isr);
					
					//몇번 읽어야 할지 알 수 없으므로
					while(true) {
						String str = br.readLine();
						if(str==null) {
							break;
						}
						
						System.out.println(str);
					}
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				finally {
					try {
						br.close();
						isr.close();
						fin.close();
					}
					catch(Exception e) {
					
					}
				}
				
			}
	

	public static void main(String[] args) {
	new Test08();

	}

}
