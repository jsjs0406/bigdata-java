package window;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;

public class Mywindow {

	public static void main(String[] args) {
		// 프레임
		JFrame f = new JFrame("입력값 받는 프로그램.");
		f.setSize(342, 303);

		//물흐르듯이 배치
		FlowLayout flow = new FlowLayout();
		JLabel label = new JLabel("당신의 주요 프로그램 언어를 입력하세요");
		label.setForeground(Color.BLUE);
		label.setFont(new Font("굴림", Font.PLAIN, 15));
		JButton button = new JButton("나를 눌러요.");
		f.getContentPane().setLayout(flow);
		JTextField text = new JTextField(20);
		text.setBackground(Color.YELLOW);
		text.setForeground(Color.BLUE);
		text.setFont(new Font("굴림", Font.PLAIN, 18));
		//버튼
		
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("나예요...!!");
				String data = text.getText();
				System.out.println(data);
				
			}
		});

		
		//글자들
		
		f.getContentPane().add(label);
		
		//입력받는 화면(한줄)
		
		f.getContentPane().add(text);
		f.getContentPane().add(button);
		
		f.setVisible(true);
		
		

	}

}
