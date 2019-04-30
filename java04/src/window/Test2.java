package window;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Test2 {
	private static JTextField button2;

	public static void main(String[] args) {
		// 프레임
				JFrame f = new JFrame("입력값 받는 프로그램.");
				f.setSize(342, 303);

				//물흐르듯이 배치
				FlowLayout flow = new FlowLayout();
				JLabel label = new JLabel("당신이 사용하는 개발툴을 입력하세요.");
				label.setForeground(Color.BLUE);
				label.setFont(new Font("굴림", Font.PLAIN, 15));
				JButton button = new JButton("나를 눌러요.");
				button.setBackground(Color.BLUE);
				f.getContentPane().setLayout(flow);
				JTextField text1 = new JTextField(20);
				JTextField text2 = new JTextField(20);
				text1.setBackground(Color.YELLOW);
				text1.setForeground(Color.BLUE);
				text1.setFont(new Font("굴림", Font.PLAIN, 18));
				
				text2.setBackground(Color.YELLOW);
				text2.setForeground(Color.BLUE);
				text2.setFont(new Font("굴림", Font.PLAIN, 18));
				//버튼
				
				button.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						
						System.out.println("버튼이 눌러졌군요");
						String data = text1.getText();
						String data2 = text2.getText();
						System.out.println("당신의 주요 과목은:"+ data);
						System.out.println("당신이 사용하는 개발 툴은:"+ data2);
						
						
					}
				});

				
				//글자들
				//입력받는 화면(한줄)
				f.getContentPane().add(label);
				f.getContentPane().add(text1);
				f.getContentPane().add(text2);
				
				button2 = new JTextField();
				button2.setFont(new Font("굴림", Font.BOLD, 10));
				f.getContentPane().add(button2);
				button2.setColumns(10);
				f.getContentPane().add(button);
				
				f.setVisible(true);

	}//

}//
