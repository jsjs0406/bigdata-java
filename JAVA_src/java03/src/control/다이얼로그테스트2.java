package control;

import javax.swing.JOptionPane;

public class 다이얼로그테스트2 {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "내가 바로 다이얼로그예요.");
		String price = JOptionPane.showInputDialog("오늘의 치킨가격은 얼마인가요?");
		System.out.println("치킨가격은" + price);
		int price2 = Integer.parseInt(price);
		if (price2 > 9000) {
			System.out.println("내일 다시 전화 할게요");

		} else {
			System.out.println("주문할게요");

		}

	}// m

}// c
