package 반복문;

import java.util.Scanner;

public class S4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("계절[1-4]을 입력하세요 => :");
			int num1 = sc.nextInt();

			if (num1 == 1) {
				System.out.println("계절은 봄입니다.");
				break;
			} else if (num1 == 2) {
				System.out.println("계절은 여름입니다.");
				break;
			} else if (num1 == 3) {
				System.out.println("계절은 가을입니다.");
				break;
			} else if (num1 == 4) {
				System.out.println("계절은 겨울입니다.");
				break;
			}

		}

	}// main

}// class
