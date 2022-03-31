package day19;

import java.io.*;
import java.net.*;
public class PingClient{
	public PingClient() {
		Socket socket = null;
		InputStream in = null;
		OutputStream out = null;
		try {
			socket  =new Socket("192.168.0.124",7777);
			in = socket.getInputStream();
			out = socket.getOutputStream();
			String msg = "첫번째 보내는 메세지 ";
			byte[] buff = msg.getBytes();
			out.write(buff);
			int len = in.read(buff);
			msg = new String(buff,0,len);
			System.out.println("서버에게 보내는 메세지"+msg);

			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				out.close();
				in.close();
				
			}
			catch(Exception e) {
				
			}
		}
		
	}
	public static void main(String[] args) {
	new PingClient();

	}

}
