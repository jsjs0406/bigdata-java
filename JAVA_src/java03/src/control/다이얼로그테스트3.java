package control;

import javax.swing.JOptionPane;

public class 다이얼로그테스트3 {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "나이 비교");
		String myage = JOptionPane.showInputDialog("내 나이는?");
		System.out.println("내 나이는" + myage);
		int age3 = Integer.parseInt(myage);
		String youngerage = JOptionPane.showInputDialog("동생의 나이는?");
		System.out.println("동생의 나이는" + youngerage);
		int age4 = Integer.parseInt(youngerage);

		if (age3 > age4) {
			System.out.println("내가 떡 2개를 더 먹어요");

		} else {
			System.out.println("동생이 떡 2개를 더 먹어요");

		}

	}

}
