package day03;

import javax.swing.*;

public class Test03 {
	public static void main(String[] args) {
		System.out.println('J'+3.14);
		char j = 'J';
		int num = 10;
		j = (char)(num+j);
		String msg = "J이후의 열번쨰 문자'"+(char)('J'+10);
		JOptionPane.showMessageDialog(null, msg);
	}

}
