package javaProject;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

public class Startpage {
	static int num = 0;
	

	public static void main(String[] args) {
		JFrame f = new JFrame("나의 영화관");
		String[] img = { "a1.jpg", "g1.jpeg", "my1.jpg" };
		JButton[] buttons = new JButton[2];
		ImageIcon pic = new ImageIcon(img[1]);
		JButton icon = new JButton();
		icon.setBounds(90, 100, 400, 300);
		icon.setIcon(pic);
		
		
		f.setSize(600, 600);

		buttons[0] = new JButton("이전");
		buttons[0].setBounds(200, 0, 100, 50);
		buttons[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (num < 0) {
					num = 2;
				} else {
					num -= 1;

				}
				ImageIcon pic = new ImageIcon(img[num]);
				icon.setIcon(pic);
			}
		});

		f.getContentPane().add(buttons[0]);

		buttons[1] = new JButton("다음");
		buttons[1].setBounds(300, 0, 100, 50);
		buttons[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (num > 2) {
					num = 0;
				} else {
					num += 1;

				}
				ImageIcon pic = new ImageIcon(img[num]);
				icon.setIcon(pic);
			}
		});
		
		f.getContentPane().add(buttons[1]);
		f.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("<<예매하기>>");
		btnNewButton.setBounds(450, 516, 122, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Reservation();
				f.setVisible(false);
			}
		});
		f.getContentPane().setLayout(null);
		f.getContentPane().add(btnNewButton);
		f.getContentPane().add(icon);
		f.setVisible(true);
		
	}
}
