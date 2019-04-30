package window;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class 나의계 {
	private static JTextField text2;
	private static JTextField text1;

	public static void main(String[] args) {
		JFrame f = new JFrame("나의 계산기");
		f.getContentPane().setBackground(SystemColor.activeCaption);
		f.setSize(500, 400);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_1 = new JLabel("<<<<<나의계산기>>>>>");
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 40));
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("숫자 1");
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 40));
		f.getContentPane().add(lblNewLabel);
		
		text1 = new JTextField();
		text1.setFont(new Font("Dialog", Font.PLAIN, 40));
		f.getContentPane().add(text1);
		text1.setColumns(10);
		
		JLabel label = new JLabel("숫자 1");
		label.setFont(new Font("Dialog", Font.PLAIN, 40));
		f.getContentPane().add(label);
		
		text2 = new JTextField();
		text2.setFont(new Font("Dialog", Font.PLAIN, 40));
		text2.setBackground(Color.YELLOW);
		f.getContentPane().add(text2);
		text2.setColumns(10);
		
		JButton btnNewButton = new JButton("더하기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String data1 = text1.getText();
				String data2 = text2.getText();
				
				int data3 = Integer.parseInt(data1);
				int data4 = Integer.parseInt(data2);
				
				System.out.println(data3+data4);
				
				
			}
		});
		btnNewButton.setForeground(Color.MAGENTA);
		f.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("빼기");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data1 = text1.getText();
				String data2 = text2.getText();
				
				int data3 = Integer.parseInt(data1);
				int data4 = Integer.parseInt(data2);
				
				System.out.println(data3-data4);
			}
		});
		button.setForeground(Color.MAGENTA);
		f.getContentPane().add(button);
		
		JButton button_1 = new JButton("곱하기");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data1 = text1.getText();
				String data2 = text2.getText();
				
				int data3 = Integer.parseInt(data1);
				int data4 = Integer.parseInt(data2);
				
				System.out.println(data3*data4);
			}
		});
		button_1.setForeground(Color.MAGENTA);
		f.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("나누기");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data1 = text1.getText();
				String data2 = text2.getText();
				
				int data3 = Integer.parseInt(data1);
				int data4 = Integer.parseInt(data2);
				
				System.out.println(data3/data4);
			}
		});
		button_2.setForeground(Color.MAGENTA);
		f.getContentPane().add(button_2);
		
		
		f.setVisible(true);
		
		

	}

}
