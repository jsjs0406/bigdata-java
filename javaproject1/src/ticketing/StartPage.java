package ticketing;

import java.awt.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

interface movie {
		public void buyticket();
	}
	public class StartPage extends JFrame {
		public static JPanel contentpane;
		public StartPage() {
			List li = new List();
			setTitle("영화예매");
			
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			contentpane = new JPanel();//버튼이나 라벨이 들어갈 화면을 만듬
			contentpane.setBorder(new EmptyBorder(5, 5, 5, 5));
			
			JLabel lblNewLabel = new JLabel("    MJ \uC601\uD654 \uC608\uB9E4");//제목설정
			lblNewLabel.setForeground(Color.WHITE);
			lblNewLabel.setFont(new Font("굴림", Font.BOLD, 46));
			getContentPane().add(lblNewLabel, BorderLayout.NORTH);
			
			JButton btnNewButton = new JButton("<<\uC608\uB9E4\uD558\uAE30>>");//예매버튼
			btnNewButton.setFont(new Font("굴림", Font.PLAIN, 20));
			btnNewButton.setForeground(Color.BLUE);
			getContentPane().add(btnNewButton, BorderLayout.SOUTH);
			contentpane.setLayout(null);
			
			JLabel background = new JLabel("");
			background.setIcon(new ImageIcon("file:///D:/je/java_scr/javaprojcet/tb.jpg"));
			background.setBounds(0, 0, 1262, 673);
			contentpane.add(background);
			
			
			
			setVisible(true);
			
		}
		
	


}
