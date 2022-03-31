package day19;
import java.io.*;
import java.net.*;

public class PingServer extends Thread{
	private boolean isStart;
	private ServerSocket server;
	private InputStream in;
	private OutputStream out;
	private Socket socket;
	
	public boolean isStart() {
		return isStart;
	}
	public void setStart(boolean isStart) {
		this.isStart = isStart;
	}
	public ServerSocket getServer() {
		return server;
	}
	public void setServer(ServerSocket server) {
		this.server = server;
	}
	public Socket getSocket() {
		return socket;
	}
	public void setSocket(Socket socket) {
		this.socket = socket;
	}
	
	public void run() {
		try {
			server = new ServerSocket(7777);
			while(isStart) {
				socket = server.accept();
				String ip = socket.getInetAddress().getHostAddress();
				System.out.println(ip+" 서버 연결 완료");
				in = socket.getInputStream();
				out = socket.getOutputStream();
				byte[] buff = new byte[1024];
				String msg = "서버에서 받은 메세지";
				int len = in.read(buff);
				msg = new String(buff,0,len);
				System.out.println(msg);
				String remsg = msg+"-server";
				buff = msg.getBytes();
				out.write(buff);
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				out.close();
				in.close();
				socket.close();
				out.close();
			}
			catch(Exception e) {
				
			}
			
		}System.out.println("server stop");
		
		
		
		
	}
	
	
	
	
			
		
	
	
	
	
	
}