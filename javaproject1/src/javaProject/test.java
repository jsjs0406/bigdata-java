package javaProject;

import javax.swing.JFrame;
import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class test extends JFrame  {
	JButton btn1, btn2;
	private JTextArea textArea;
	ImageIcon image = null;
	int num =0;
	public test() {
		setTitle("영화정보");
		setSize(500, 500);
		getContentPane().setLayout(new BorderLayout(0, 0));
		String image[] = {"a1.jpg", "g1.jpeg", "my1.jpg"};
		ImageIcon pic = new ImageIcon(image[0]);
		JButton[] b = new JButton[2];
		
		btn1 = new JButton("이전");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < image.length; i++) {
					if (num < 0) {
						num = 2;
					}else {
						num -= 1;
					}
					
				}
				JPanel panel = new JPanel();
				getContentPane().add(panel, BorderLayout.CENTER);
				panel.add(b);
				b.setIcon(pic);
			}
		});
		getContentPane().add(btn1, BorderLayout.WEST);
		
		btn2 = new JButton("다음");
		getContentPane().add(btn2, BorderLayout.EAST);
		
		
		
		textArea = new JTextArea("인피니티 워 이후 절반만 살아남은 지구\n" + " 마지막 희망이 된 어벤져스\n" + " 먼저 떠난 그들을 위해 모든 것을 걸었다!\n" + " \n"
				+ " 위대한 어벤져스\n" + " 운명을 바꿀 최후의 전쟁이 펼쳐진다!");
		getContentPane().add(textArea, BorderLayout.SOUTH);
		
		
		
		
		setVisible(true);
		
	}
	public static void main(String[] args) {
		test name = new test();
		
	}
}
		
		
	

