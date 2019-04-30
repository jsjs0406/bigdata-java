package window;

import java.awt.FlowLayout;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;

public class C {
	private static JTextField text1;
	private static JTextField text2;

	public static void main(String[] args) {
		JFrame f = new JFrame("나의 계산기");
		f.getContentPane().setBackground(SystemColor.activeCaption);
		f.setSize(500, 400);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("<<<나의 계산기>>>");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 50));
		f.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("");
		f.getContentPane().add(label);
		
		JLabel lblNewLabel_2 = new JLabel("숫자1");
		lblNewLabel_2.setFont(new Font("Dialog", Font.PLAIN, 40));
		f.getContentPane().add(lblNewLabel_2);
		
		text2 = new JTextField();
		text2.setFont(new Font("Dialog", Font.PLAIN, 40));
		f.getContentPane().add(text2);
		text2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("숫자2");
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 40));
		f.getContentPane().add(lblNewLabel_1);
		
		text1 = new JTextField();
		text1.setFont(new Font("Dialog", Font.PLAIN, 40));
		f.getContentPane().add(text1);
		text1.setColumns(10);
		

	}//main

}//class
