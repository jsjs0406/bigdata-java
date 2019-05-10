package javaProject;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

public class TicketReservation {
	static int num = 0;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		FlowLayout flow = new FlowLayout();
		String[] img = { "a1.jpg", "g1.jpg", "my1.jpg" };
		JButton[] buttons = new JButton[2];
		ImageIcon pic = new ImageIcon(img[1]);
		JButton icon = new JButton();
		icon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		icon.setIcon(pic);

		f.setSize(800, 350);
		f.getContentPane().setLayout(null);

		buttons[0] = new JButton("이전");
		buttons[0].setBounds(290, 0, 100, 50);
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
		buttons[1].setBounds(400, 0, 100, 50);
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
		icon.setBounds(150, 80, 500, 200);
		f.getContentPane().add(icon);
		f.setVisible(true);
		f.getContentPane().setLayout(flow);
	}
}
