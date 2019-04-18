package control;

import javax.swing.JOptionPane;

public class 다이얼로그테스트1 {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "내가 바로 다이얼로그예요.");
		String food1 = JOptionPane.showInputDialog("먹고 싶은 음식을 입력하세요");
		System.out.println("먹고싶은 음식은?" + food1);
		String food2 = JOptionPane.showInputDialog("먹기 싫은 음식을 입력하세요");
		System.out.println("먹기 싫은 음식은?" + food2);
		

	}//m

}//c
