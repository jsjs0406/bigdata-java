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
		setTitle("��ȭ����");
		setSize(500, 500);
		getContentPane().setLayout(new BorderLayout(0, 0));
		String image[] = {"a1.jpg", "g1.jpeg", "my1.jpg"};
		ImageIcon pic = new ImageIcon(image[0]);
		JButton[] b = new JButton[2];
		
		btn1 = new JButton("����");
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
		
		btn2 = new JButton("����");
		getContentPane().add(btn2, BorderLayout.EAST);
		
		
		
		textArea = new JTextArea("���Ǵ�Ƽ �� ���� ���ݸ� ��Ƴ��� ����\n" + " ������ ����� �� �����\n" + " ���� ���� �׵��� ���� ��� ���� �ɾ���!\n" + " \n"
				+ " ������ �����\n" + " ����� �ٲ� ������ ������ ��������!");
		getContentPane().add(textArea, BorderLayout.SOUTH);
		
		
		
		
		setVisible(true);
		
	}
	public static void main(String[] args) {
		test name = new test();
		
	}
}
		
		
	

