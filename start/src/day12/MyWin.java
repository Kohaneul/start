package day12;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyWin {
	JFrame fr;
	JButton btn1, btn2;
	JPanel mainP,bPan;
	
	
	
	public MyWin() {
		fr = new JFrame();
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		mainP = new JPanel();
		mainP.setPreferredSize(new Dimension(280,450));
		mainP.setBackground(Color.cyan);
		bPan = new JPanel();
		bPan.setLayout(new GridLayout(1,2));
		
		/*
		btn1 = new JButton("닫기");
		btn2 = new JButton("변경");
		btn1.addActionListener(new ActionListener(){
			//이 클래스는 무명 내부 클래스..
			//오버라이드 하는 함수의 내용이 극도로 짧아서
			//별도로 클래스를 구현하는 것이 오히려 번거롭다.
			//따라서 구현하는 순간 new 시킨 인스턴스를 사용하면 된다.
			public void actionPerformed(ActionfEvent e) {
				System.exit(0);
			}
			
		});
		*/
		ActionListener act = new MyEvt();
		bPan.add(btn1);
		bPan.add(btn2);
		
		fr.add(mainP,BorderLayout.CENTER);
		fr.add(bPan,BorderLayout.CENTER);
		fr.setVisible(true);
		fr.setSize(300,500);
		fr.setResizable(false);
	}
	public static void main(String[] args) {
	new MyWin();

	}
	class MyEvt implements ActionListener{
		//전역 내부클래스
		
		@Override
		public void actionPerformed(ActionEvent e) {
		System.exit(0);
			
		}
		
	}

}
