package javaProject;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;

public class MovieInfo extends JFrame {
	JTextArea textArea, textArea1;
	JButton b1, b2, b3;

	public MovieInfo() {
		setTitle("영화정보");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("어벤져스 : 엔드게임");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel.setBounds(14, 12, 320, 42);
		getContentPane().add(lblNewLabel);

		JButton b1 = new JButton("줄거리");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				textArea = new JTextArea();
				textArea.setText("인피니티 워 이후 절반만 살아남은 지구\n" + " 마지막 희망이 된 어벤져스\n" + " 먼저 떠난 그들을 위해 모든 것을 걸었다!\n" + " \n"
						+ " 위대한 어벤져스\n" + " 운명을 바꿀 최후의 전쟁이 펼쳐진다!");
				textArea.setBounds(14, 123, 454, 290);
				getContentPane().add(textArea);
				textArea.setColumns(10);
			}
		});

		b1.setBounds(14, 66, 105, 27);
		getContentPane().add(b1);

		JPanel p = new JPanel();
		JButton b2 = new JButton("감독");
		ImageIcon icon1 = new ImageIcon("file:///D:/je/eclipse/workspace/javaproject1/eee.jpeg");
		JToggleButton tgbutton = new JToggleButton(icon1);
		p.add(tgbutton);
		//getContentPane().add(textArea);
		

		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				textArea1 = new JTextArea();
				textArea1.setText("Anthony Russo");
				textArea1.setBounds(14, 123, 454, 290);
				getContentPane().add(textArea1);
				textArea.setBounds(14, 123, 454, 290);
				textArea1.setColumns(10);
			}
		});

		b2.setBounds(14, 66, 105, 27);
		//getContentPane().add(textArea1);
		
		add(p);
		setVisible(true);
	}

	public static void main(String[] args) {
		MovieInfo minfo = new MovieInfo();
	}

}
